package org.chromium.base.metrics;

@org.chromium.base.annotations.JNINamespace("base::android")
@org.chromium.build.annotations.MainDex
/* loaded from: classes16.dex */
final class NativeUmaRecorder implements org.chromium.base.metrics.UmaRecorder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final java.util.Map<java.lang.String, java.lang.Long> mNativeHints = java.util.Collections.synchronizedMap(new java.util.HashMap());
    private java.util.Map<org.chromium.base.Callback<java.lang.String>, java.lang.Long> mUserActionTestingCallbackNativePtrs;

    /* loaded from: classes16.dex */
    public interface Natives {
        long addActionCallbackForTesting(org.chromium.base.Callback<java.lang.String> callback);

        long createHistogramSnapshotForTesting();

        void destroyHistogramSnapshotForTesting(long j17);

        long[] getHistogramSamplesForTesting(java.lang.String str);

        int getHistogramTotalCountForTesting(java.lang.String str, long j17);

        int getHistogramValueCountForTesting(java.lang.String str, int i17, long j17);

        long recordBooleanHistogram(java.lang.String str, long j17, boolean z17);

        long recordExponentialHistogram(java.lang.String str, long j17, int i17, int i18, int i19, int i27);

        long recordLinearHistogram(java.lang.String str, long j17, int i17, int i18, int i19, int i27);

        long recordSparseHistogram(java.lang.String str, long j17, int i17);

        void recordUserAction(java.lang.String str, long j17);

        void removeActionCallbackForTesting(long j17);
    }

    private long getNativeHint(java.lang.String str) {
        java.lang.Long l17 = this.mNativeHints.get(str);
        if (l17 == null) {
            return 0L;
        }
        return l17.longValue();
    }

    private void maybeUpdateNativeHint(java.lang.String str, long j17, long j18) {
        if (j17 != j18) {
            this.mNativeHints.put(str, java.lang.Long.valueOf(j18));
        }
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void addUserActionCallbackForTesting(org.chromium.base.Callback<java.lang.String> callback) {
        long addActionCallbackForTesting = org.chromium.base.metrics.NativeUmaRecorderJni.get().addActionCallbackForTesting(callback);
        if (this.mUserActionTestingCallbackNativePtrs == null) {
            this.mUserActionTestingCallbackNativePtrs = java.util.Collections.synchronizedMap(new java.util.HashMap());
        }
        this.mUserActionTestingCallbackNativePtrs.put(callback, java.lang.Long.valueOf(addActionCallbackForTesting));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public java.util.List<org.chromium.base.metrics.HistogramBucket> getHistogramSamplesForTesting(java.lang.String str) {
        long[] histogramSamplesForTesting = org.chromium.base.metrics.NativeUmaRecorderJni.get().getHistogramSamplesForTesting(str);
        java.util.ArrayList arrayList = new java.util.ArrayList(histogramSamplesForTesting.length);
        for (int i17 = 0; i17 < histogramSamplesForTesting.length; i17 += 3) {
            arrayList.add(new org.chromium.base.metrics.HistogramBucket((int) histogramSamplesForTesting[i17], histogramSamplesForTesting[i17 + 1], (int) histogramSamplesForTesting[i17 + 2]));
        }
        return arrayList;
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramTotalCountForTesting(java.lang.String str) {
        return org.chromium.base.metrics.NativeUmaRecorderJni.get().getHistogramTotalCountForTesting(str, 0L);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public int getHistogramValueCountForTesting(java.lang.String str, int i17) {
        return org.chromium.base.metrics.NativeUmaRecorderJni.get().getHistogramValueCountForTesting(str, i17, 0L);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordBooleanHistogram(java.lang.String str, boolean z17) {
        long nativeHint = getNativeHint(str);
        maybeUpdateNativeHint(str, nativeHint, org.chromium.base.metrics.NativeUmaRecorderJni.get().recordBooleanHistogram(str, nativeHint, z17));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordExponentialHistogram(java.lang.String str, int i17, int i18, int i19, int i27) {
        long nativeHint = getNativeHint(str);
        maybeUpdateNativeHint(str, nativeHint, org.chromium.base.metrics.NativeUmaRecorderJni.get().recordExponentialHistogram(str, nativeHint, i17, i18, i19, i27));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordLinearHistogram(java.lang.String str, int i17, int i18, int i19, int i27) {
        long nativeHint = getNativeHint(str);
        maybeUpdateNativeHint(str, nativeHint, org.chromium.base.metrics.NativeUmaRecorderJni.get().recordLinearHistogram(str, nativeHint, i17, i18, i19, i27));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordSparseHistogram(java.lang.String str, int i17) {
        long nativeHint = getNativeHint(str);
        maybeUpdateNativeHint(str, nativeHint, org.chromium.base.metrics.NativeUmaRecorderJni.get().recordSparseHistogram(str, nativeHint, i17));
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void recordUserAction(java.lang.String str, long j17) {
        org.chromium.base.metrics.NativeUmaRecorderJni.get().recordUserAction(str, org.chromium.base.TimeUtils.elapsedRealtimeMillis() - j17);
    }

    @Override // org.chromium.base.metrics.UmaRecorder
    public void removeUserActionCallbackForTesting(org.chromium.base.Callback<java.lang.String> callback) {
        java.lang.Long remove;
        java.util.Map<org.chromium.base.Callback<java.lang.String>, java.lang.Long> map = this.mUserActionTestingCallbackNativePtrs;
        if (map == null || (remove = map.remove(callback)) == null) {
            return;
        }
        org.chromium.base.metrics.NativeUmaRecorderJni.get().removeActionCallbackForTesting(remove.longValue());
    }
}
