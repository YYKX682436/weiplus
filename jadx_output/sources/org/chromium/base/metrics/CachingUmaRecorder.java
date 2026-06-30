package org.chromium.base.metrics;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class CachingUmaRecorder implements org.chromium.base.metrics.UmaRecorder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int MAX_HISTOGRAM_COUNT = 256;
    static final int MAX_USER_ACTION_COUNT = 256;
    private static final java.lang.String TAG = "CachingUmaRecorder";
    private org.chromium.base.metrics.UmaRecorder mDelegate;
    private int mDroppedUserActionCount;
    private java.util.List<org.chromium.base.Callback<java.lang.String>> mUserActionCallbacksForTesting;
    private final java.util.concurrent.locks.ReentrantReadWriteLock mRwLock = new java.util.concurrent.locks.ReentrantReadWriteLock(false);
    private java.util.Map<java.lang.String, org.chromium.base.metrics.CachingUmaRecorder.Histogram> mHistogramByName = new java.util.HashMap();
    private java.util.concurrent.atomic.AtomicInteger mDroppedHistogramSampleCount = new java.util.concurrent.atomic.AtomicInteger();
    private java.util.List<org.chromium.base.metrics.CachingUmaRecorder.UserAction> mUserActions = new java.util.ArrayList();

    /* loaded from: classes16.dex */
    public static class Histogram {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final int MAX_SAMPLE_COUNT = 256;
        private final int mMax;
        private final int mMin;
        private final java.lang.String mName;
        private final int mNumBuckets;
        private final java.util.List<java.lang.Integer> mSamples = new java.util.ArrayList(1);
        private final int mType;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes6.dex */
        public @interface Type {
            public static final int BOOLEAN = 1;
            public static final int EXPONENTIAL = 2;
            public static final int LINEAR = 3;
            public static final int SPARSE = 4;
        }

        public Histogram(int i17, java.lang.String str, int i18, int i19, int i27) {
            this.mType = i17;
            this.mName = str;
            this.mMin = i18;
            this.mMax = i19;
            this.mNumBuckets = i27;
        }

        public synchronized boolean addSample(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
            if (this.mSamples.size() >= 256) {
                return false;
            }
            this.mSamples.add(java.lang.Integer.valueOf(i18));
            return true;
        }

        public synchronized int flushTo(org.chromium.base.metrics.UmaRecorder umaRecorder) {
            int size;
            int i17 = this.mType;
            int i18 = 0;
            if (i17 == 1) {
                for (int i19 = 0; i19 < this.mSamples.size(); i19++) {
                    umaRecorder.recordBooleanHistogram(this.mName, this.mSamples.get(i19).intValue() != 0);
                }
            } else if (i17 == 2) {
                while (i18 < this.mSamples.size()) {
                    umaRecorder.recordExponentialHistogram(this.mName, this.mSamples.get(i18).intValue(), this.mMin, this.mMax, this.mNumBuckets);
                    i18++;
                }
            } else if (i17 == 3) {
                while (i18 < this.mSamples.size()) {
                    umaRecorder.recordLinearHistogram(this.mName, this.mSamples.get(i18).intValue(), this.mMin, this.mMax, this.mNumBuckets);
                    i18++;
                }
            } else if (i17 == 4) {
                while (i18 < this.mSamples.size()) {
                    umaRecorder.recordSparseHistogram(this.mName, this.mSamples.get(i18).intValue());
                    i18++;
                }
            }
            size = this.mSamples.size();
            this.mSamples.clear();
            return size;
        }
    }

    /* loaded from: classes16.dex */
    public static class UserAction {
        private final long mElapsedRealtimeMillis;
        private final java.lang.String mName;

        public UserAction(java.lang.String str, long j17) {
            this.mName = str;
            this.mElapsedRealtimeMillis = j17;
        }

        public void flushTo(org.chromium.base.metrics.UmaRecorder umaRecorder) {
            umaRecorder.recordUserAction(this.mName, this.mElapsedRealtimeMillis);
        }
    }

    private void cacheHistogramSampleAlreadyWriteLocked(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        org.chromium.base.metrics.CachingUmaRecorder.Histogram histogram = this.mHistogramByName.get(str);
        if (histogram == null) {
            if (this.mHistogramByName.size() >= 256) {
                this.mDroppedHistogramSampleCount.incrementAndGet();
                return;
            } else {
                org.chromium.base.metrics.CachingUmaRecorder.Histogram histogram2 = new org.chromium.base.metrics.CachingUmaRecorder.Histogram(i17, str, i19, i27, i28);
                this.mHistogramByName.put(str, histogram2);
                histogram = histogram2;
            }
        }
        if (histogram.addSample(i17, str, i18, i19, i27, i28)) {
            return;
        }
        this.mDroppedHistogramSampleCount.incrementAndGet();
    }

    private void cacheOrRecordHistogramSample(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        if (tryAppendOrRecordSample(i17, str, i18, i19, i27, i28)) {
            return;
        }
        this.mRwLock.writeLock().lock();
        try {
            if (this.mDelegate == null) {
                cacheHistogramSampleAlreadyWriteLocked(i17, str, i18, i19, i27, i28);
                return;
            }
            this.mRwLock.readLock().lock();
            try {
                recordHistogramSampleAlreadyLocked(i17, str, i18, i19, i27, i28);
            } finally {
                this.mRwLock.readLock().unlock();
            }
        } finally {
            this.mRwLock.writeLock().unlock();
        }
    }

    private void flushHistogramsAlreadyLocked(java.util.Map<java.lang.String, org.chromium.base.metrics.CachingUmaRecorder.Histogram> map, int i17) {
        int size = map.size();
        java.util.Iterator<org.chromium.base.metrics.CachingUmaRecorder.Histogram> it = map.values().iterator();
        int i18 = 0;
        while (it.hasNext()) {
            i18 += it.next().flushTo(this.mDelegate);
        }
        org.chromium.base.Log.i(TAG, "Flushed %d samples from %d histograms, %d samples were dropped.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i17));
    }

    private void flushUserActionsAlreadyLocked(java.util.List<org.chromium.base.metrics.CachingUmaRecorder.UserAction> list, int i17) {
        java.util.Iterator<org.chromium.base.metrics.CachingUmaRecorder.UserAction> it = list.iterator();
        while (it.hasNext()) {
            it.next().flushTo(this.mDelegate);
        }
        org.chromium.base.Log.i(TAG, "Flushed %d user action samples, %d samples were dropped.", java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(i17));
    }

    private void recordHistogramSampleAlreadyLocked(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        if (i17 == 1) {
            this.mDelegate.recordBooleanHistogram(str, i18 != 0);
            return;
        }
        if (i17 == 2) {
            this.mDelegate.recordExponentialHistogram(str, i18, i19, i27, i28);
            return;
        }
        if (i17 == 3) {
            this.mDelegate.recordLinearHistogram(str, i18, i19, i27, i28);
        } else if (i17 == 4) {
            this.mDelegate.recordSparseHistogram(str, i18);
        } else {
            throw new java.lang.UnsupportedOperationException("Unknown histogram type " + i17);
        }
    }

    private void swapUserActionCallbacksForTesting(org.chromium.base.metrics.UmaRecorder umaRecorder, org.chromium.base.metrics.UmaRecorder umaRecorder2) {
        if (this.mUserActionCallbacksForTesting == null) {
            return;
        }
        for (int i17 = 0; i17 < this.mUserActionCallbacksForTesting.size(); i17++) {
            if (umaRecorder != null) {
                umaRecorder.removeUserActionCallbackForTesting(this.mUserActionCallbacksForTesting.get(i17));
            }
            if (umaRecorder2 != null) {
                umaRecorder2.addUserActionCallbackForTesting(this.mUserActionCallbacksForTesting.get(i17));
            }
        }
    }

    private boolean tryAppendOrRecordSample(int i17, java.lang.String str, int i18, int i19, int i27, int i28) {
        this.mRwLock.readLock().lock();
        try {
            if (this.mDelegate != null) {
                recordHistogramSampleAlreadyLocked(i17, str, i18, i19, i27, i28);
            } else {
                org.chromium.base.metrics.CachingUmaRecorder.Histogram histogram = this.mHistogramByName.get(str);
                if (histogram == null) {
                    this.mRwLock.readLock().unlock();
                    return false;
                }
                if (!histogram.addSample(i17, str, i18, i19, i27, i28)) {
                    this.mDroppedHistogramSampleCount.incrementAndGet();
                }
            }
            return true;
        } finally {
            this.mRwLock.readLock().unlock();
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void addUserActionCallbackForTesting(org.chromium.base.Callback<java.lang.String> callback) {
        this.mRwLock.writeLock().lock();
        try {
            if (this.mUserActionCallbacksForTesting == null) {
                this.mUserActionCallbacksForTesting = new java.util.ArrayList();
            }
            this.mUserActionCallbacksForTesting.add(callback);
            org.chromium.base.metrics.UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                umaRecorder.addUserActionCallbackForTesting(callback);
            }
        } finally {
            this.mRwLock.writeLock().unlock();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List<org.chromium.base.metrics.HistogramBucket>] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    @Override // org.chromium.base.metrics.UmaRecorder
    public java.util.List<org.chromium.base.metrics.HistogramBucket> getHistogramSamplesForTesting(java.lang.String str) {
        java.lang.Integer[] numArr;
        ?? arrayList;
        this.mRwLock.readLock().lock();
        try {
            org.chromium.base.metrics.UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                arrayList = umaRecorder.getHistogramSamplesForTesting(str);
            } else {
                org.chromium.base.metrics.CachingUmaRecorder.Histogram histogram = this.mHistogramByName.get(str);
                if (histogram == null) {
                    arrayList = java.util.Collections.emptyList();
                } else {
                    synchronized (histogram) {
                        numArr = (java.lang.Integer[]) histogram.mSamples.toArray(new java.lang.Integer[0]);
                    }
                    java.util.Arrays.sort(numArr);
                    arrayList = new java.util.ArrayList();
                    int i17 = 0;
                    while (i17 < numArr.length) {
                        int intValue = numArr[i17].intValue();
                        int i18 = 0;
                        do {
                            i18++;
                            i17++;
                            if (i17 < numArr.length) {
                            }
                            arrayList.add(new org.chromium.base.metrics.HistogramBucket(intValue, intValue + 1, i18));
                        } while (numArr[i17].intValue() == intValue);
                        arrayList.add(new org.chromium.base.metrics.HistogramBucket(intValue, intValue + 1, i18));
                    }
                }
            }
            return arrayList;
        } finally {
            this.mRwLock.readLock().unlock();
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramTotalCountForTesting(java.lang.String str) {
        int size;
        this.mRwLock.readLock().lock();
        try {
            org.chromium.base.metrics.UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                return umaRecorder.getHistogramTotalCountForTesting(str);
            }
            org.chromium.base.metrics.CachingUmaRecorder.Histogram histogram = this.mHistogramByName.get(str);
            if (histogram == null) {
                this.mRwLock.readLock().unlock();
                return 0;
            }
            synchronized (histogram) {
                size = histogram.mSamples.size();
            }
            return size;
        } finally {
            this.mRwLock.readLock().unlock();
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramValueCountForTesting(java.lang.String str, int i17) {
        int i18;
        this.mRwLock.readLock().lock();
        try {
            org.chromium.base.metrics.UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                return umaRecorder.getHistogramValueCountForTesting(str, i17);
            }
            org.chromium.base.metrics.CachingUmaRecorder.Histogram histogram = this.mHistogramByName.get(str);
            if (histogram == null) {
                return 0;
            }
            synchronized (histogram) {
                i18 = 0;
                for (int i19 = 0; i19 < histogram.mSamples.size(); i19++) {
                    if (((java.lang.Integer) histogram.mSamples.get(i19)).intValue() == i17) {
                        i18++;
                    }
                }
            }
            return i18;
        } finally {
            this.mRwLock.readLock().unlock();
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordBooleanHistogram(java.lang.String str, boolean z17) {
        cacheOrRecordHistogramSample(1, str, z17 ? 1 : 0, 0, 0, 0);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordExponentialHistogram(java.lang.String str, int i17, int i18, int i19, int i27) {
        cacheOrRecordHistogramSample(2, str, i17, i18, i19, i27);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordLinearHistogram(java.lang.String str, int i17, int i18, int i19, int i27) {
        cacheOrRecordHistogramSample(3, str, i17, i18, i19, i27);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordSparseHistogram(java.lang.String str, int i17) {
        cacheOrRecordHistogramSample(4, str, i17, 0, 0, 0);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordUserAction(java.lang.String str, long j17) {
        this.mRwLock.readLock().lock();
        try {
            org.chromium.base.metrics.UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                umaRecorder.recordUserAction(str, j17);
                return;
            }
            this.mRwLock.readLock().unlock();
            this.mRwLock.writeLock().lock();
            try {
                if (this.mDelegate != null) {
                    this.mRwLock.readLock().lock();
                    try {
                        this.mDelegate.recordUserAction(str, j17);
                        return;
                    } finally {
                    }
                }
                if (this.mUserActions.size() < 256) {
                    this.mUserActions.add(new org.chromium.base.metrics.CachingUmaRecorder.UserAction(str, j17));
                } else {
                    this.mDroppedUserActionCount++;
                }
                if (this.mUserActionCallbacksForTesting != null) {
                    for (int i17 = 0; i17 < this.mUserActionCallbacksForTesting.size(); i17++) {
                        this.mUserActionCallbacksForTesting.get(i17).lambda$bind$0(str);
                    }
                }
            } finally {
                this.mRwLock.writeLock().unlock();
            }
        } finally {
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void removeUserActionCallbackForTesting(org.chromium.base.Callback<java.lang.String> callback) {
        this.mRwLock.writeLock().lock();
        try {
            java.util.List<org.chromium.base.Callback<java.lang.String>> list = this.mUserActionCallbacksForTesting;
            if (list == null) {
                return;
            }
            list.remove(callback);
            org.chromium.base.metrics.UmaRecorder umaRecorder = this.mDelegate;
            if (umaRecorder != null) {
                umaRecorder.removeUserActionCallbackForTesting(callback);
            }
        } finally {
            this.mRwLock.writeLock().unlock();
        }
    }

    public org.chromium.base.metrics.UmaRecorder setDelegate(org.chromium.base.metrics.UmaRecorder umaRecorder) {
        java.util.Map<java.lang.String, org.chromium.base.metrics.CachingUmaRecorder.Histogram> map;
        int i17;
        this.mRwLock.writeLock().lock();
        try {
            org.chromium.base.metrics.UmaRecorder umaRecorder2 = this.mDelegate;
            this.mDelegate = umaRecorder;
            if (org.chromium.build.BuildConfig.IS_FOR_TEST) {
                swapUserActionCallbacksForTesting(umaRecorder2, umaRecorder);
            }
            if (umaRecorder == null) {
                return umaRecorder2;
            }
            java.util.List<org.chromium.base.metrics.CachingUmaRecorder.UserAction> list = null;
            int i18 = 0;
            if (this.mHistogramByName.isEmpty()) {
                map = null;
                i17 = 0;
            } else {
                map = this.mHistogramByName;
                this.mHistogramByName = new java.util.HashMap();
                i17 = this.mDroppedHistogramSampleCount.getAndSet(0);
            }
            if (!this.mUserActions.isEmpty()) {
                list = this.mUserActions;
                this.mUserActions = new java.util.ArrayList();
                int i19 = this.mDroppedUserActionCount;
                this.mDroppedUserActionCount = 0;
                i18 = i19;
            }
            this.mRwLock.readLock().lock();
            if (map != null) {
                try {
                    flushHistogramsAlreadyLocked(map, i17);
                } catch (java.lang.Throwable th6) {
                    this.mRwLock.readLock().unlock();
                    throw th6;
                }
            }
            if (list != null) {
                flushUserActionsAlreadyLocked(list, i18);
            }
            this.mRwLock.readLock().unlock();
            return umaRecorder2;
        } finally {
            this.mRwLock.writeLock().unlock();
        }
    }
}
