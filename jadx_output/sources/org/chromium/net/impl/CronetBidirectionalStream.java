package org.chromium.net.impl;

@org.chromium.base.annotations.JNINamespace("cronet")
/* loaded from: classes16.dex */
public class CronetBidirectionalStream extends org.chromium.net.ExperimentalBidirectionalStream {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final org.chromium.net.impl.VersionSafeCallbacks.BidirectionalStreamCallback mCallback;
    private final boolean mDelayRequestHeadersUntilFirstFlush;
    private boolean mEndOfStreamWritten;
    private org.chromium.net.CronetException mException;
    private final java.util.concurrent.Executor mExecutor;
    private org.chromium.net.impl.RefCountDelegate mInflightDoneCallbackCount;
    private final java.lang.String mInitialMethod;
    private final int mInitialPriority;
    private final java.lang.String mInitialUrl;
    private org.chromium.net.RequestFinishedInfo.Metrics mMetrics;
    private long mNativeStream;
    private final long mNetworkHandle;
    private java.lang.Runnable mOnDestroyedCallbackForTesting;
    private org.chromium.net.impl.CronetBidirectionalStream.OnReadCompletedRunnable mOnReadCompletedTask;
    private final java.util.Collection<java.lang.Object> mRequestAnnotations;
    private final org.chromium.net.impl.CronetUrlRequestContext mRequestContext;
    private final java.lang.String[] mRequestHeaders;
    private boolean mRequestHeadersSent;
    private org.chromium.net.impl.UrlResponseInfoImpl mResponseInfo;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
    private final java.lang.Object mNativeStreamLock = new java.lang.Object();
    private int mReadState = 0;
    private int mWriteState = 0;
    private java.util.LinkedList<java.nio.ByteBuffer> mPendingData = new java.util.LinkedList<>();
    private java.util.LinkedList<java.nio.ByteBuffer> mFlushData = new java.util.LinkedList<>();

    /* loaded from: classes16.dex */
    public interface Natives {
        long createBidirectionalStream(org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, long j17, boolean z17, boolean z18, int i17, boolean z19, int i18, long j18);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
        void destroy(long j17, org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, boolean z17);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
        boolean readData(long j17, org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, java.nio.ByteBuffer byteBuffer, int i17, int i18);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
        void sendRequestHeaders(long j17, org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
        int start(long j17, org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr, boolean z17);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetBidirectionalStreamAdapter")
        boolean writevData(long j17, org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream, java.nio.ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z17);
    }

    /* loaded from: classes16.dex */
    public final class OnReadCompletedRunnable implements java.lang.Runnable {
        java.nio.ByteBuffer mByteBuffer;
        boolean mEndOfStream;

        @Override // java.lang.Runnable
        public void run() {
            try {
                java.nio.ByteBuffer byteBuffer = this.mByteBuffer;
                this.mByteBuffer = null;
                synchronized (org.chromium.net.impl.CronetBidirectionalStream.this.mNativeStreamLock) {
                    if (org.chromium.net.impl.CronetBidirectionalStream.this.isDoneLocked()) {
                        return;
                    }
                    boolean z17 = false;
                    if (this.mEndOfStream) {
                        org.chromium.net.impl.CronetBidirectionalStream.this.mReadState = 4;
                        if (org.chromium.net.impl.CronetBidirectionalStream.this.mWriteState == 10) {
                            z17 = true;
                        }
                    } else {
                        org.chromium.net.impl.CronetBidirectionalStream.this.mReadState = 2;
                    }
                    org.chromium.net.impl.VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = org.chromium.net.impl.CronetBidirectionalStream.this.mCallback;
                    org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream = org.chromium.net.impl.CronetBidirectionalStream.this;
                    bidirectionalStreamCallback.onReadCompleted(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo, byteBuffer, this.mEndOfStream);
                    if (z17) {
                        org.chromium.net.impl.CronetBidirectionalStream.this.maybeOnSucceededOnExecutor();
                    }
                }
            } catch (java.lang.Exception e17) {
                org.chromium.net.impl.CronetBidirectionalStream.this.onCallbackException(e17);
            }
        }

        private OnReadCompletedRunnable() {
        }
    }

    /* loaded from: classes16.dex */
    public final class OnWriteCompletedRunnable implements java.lang.Runnable {
        private java.nio.ByteBuffer mByteBuffer;
        private final boolean mEndOfStream;

        public OnWriteCompletedRunnable(java.nio.ByteBuffer byteBuffer, boolean z17) {
            this.mByteBuffer = byteBuffer;
            this.mEndOfStream = z17;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                java.nio.ByteBuffer byteBuffer = this.mByteBuffer;
                this.mByteBuffer = null;
                synchronized (org.chromium.net.impl.CronetBidirectionalStream.this.mNativeStreamLock) {
                    if (org.chromium.net.impl.CronetBidirectionalStream.this.isDoneLocked()) {
                        return;
                    }
                    boolean z17 = false;
                    if (this.mEndOfStream) {
                        org.chromium.net.impl.CronetBidirectionalStream.this.mWriteState = 10;
                        if (org.chromium.net.impl.CronetBidirectionalStream.this.mReadState == 4) {
                            z17 = true;
                        }
                    }
                    org.chromium.net.impl.VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = org.chromium.net.impl.CronetBidirectionalStream.this.mCallback;
                    org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream = org.chromium.net.impl.CronetBidirectionalStream.this;
                    bidirectionalStreamCallback.onWriteCompleted(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo, byteBuffer, this.mEndOfStream);
                    if (z17) {
                        org.chromium.net.impl.CronetBidirectionalStream.this.maybeOnSucceededOnExecutor();
                    }
                }
            } catch (java.lang.Exception e17) {
                org.chromium.net.impl.CronetBidirectionalStream.this.onCallbackException(e17);
            }
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes6.dex */
    public @interface State {
        public static final int CANCELED = 5;
        public static final int ERROR = 6;
        public static final int NOT_STARTED = 0;
        public static final int READING = 3;
        public static final int READING_DONE = 4;
        public static final int STARTED = 1;
        public static final int SUCCESS = 7;
        public static final int WAITING_FOR_FLUSH = 8;
        public static final int WAITING_FOR_READ = 2;
        public static final int WRITING = 9;
        public static final int WRITING_DONE = 10;
    }

    public CronetBidirectionalStream(org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, java.lang.String str, int i17, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor, java.lang.String str2, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list, boolean z17, java.util.Collection<java.lang.Object> collection, boolean z18, int i18, boolean z19, int i19, long j17) {
        this.mRequestContext = cronetUrlRequestContext;
        this.mInitialUrl = str;
        this.mInitialPriority = convertStreamPriority(i17);
        this.mCallback = new org.chromium.net.impl.VersionSafeCallbacks.BidirectionalStreamCallback(callback);
        this.mExecutor = executor;
        this.mInitialMethod = str2;
        this.mRequestHeaders = stringsFromHeaderList(list);
        this.mDelayRequestHeadersUntilFirstFlush = z17;
        this.mRequestAnnotations = collection;
        this.mTrafficStatsTagSet = z18;
        this.mTrafficStatsTag = i18;
        this.mTrafficStatsUidSet = z19;
        this.mTrafficStatsUid = i19;
        this.mNetworkHandle = j17;
    }

    private static int convertStreamPriority(int i17) {
        if (i17 == 0) {
            return 1;
        }
        if (i17 == 1) {
            return 2;
        }
        if (i17 == 2) {
            return 3;
        }
        if (i17 == 3) {
            return 4;
        }
        if (i17 == 4) {
            return 5;
        }
        throw new java.lang.IllegalArgumentException("Invalid stream priority.");
    }

    private void destroyNativeStreamLocked(boolean z17) {
        org.chromium.base.Log.i(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "destroyNativeStreamLocked " + toString());
        if (this.mNativeStream == 0) {
            return;
        }
        org.chromium.net.impl.CronetBidirectionalStreamJni.get().destroy(this.mNativeStream, this, z17);
        this.mRequestContext.onRequestDestroyed();
        this.mNativeStream = 0L;
        java.lang.Runnable runnable = this.mOnDestroyedCallbackForTesting;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean doesMethodAllowWriteData(java.lang.String str) {
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    private void failWithException(final org.chromium.net.CronetException cronetException) {
        postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.5
            @Override // java.lang.Runnable
            public void run() {
                org.chromium.net.impl.CronetBidirectionalStream.this.failWithExceptionOnExecutor(cronetException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failWithExceptionOnExecutor(org.chromium.net.CronetException cronetException) {
        this.mException = cronetException;
        synchronized (this.mNativeStreamLock) {
            if (isDoneLocked()) {
                return;
            }
            this.mWriteState = 6;
            this.mReadState = 6;
            destroyNativeStreamLocked(false);
            try {
                this.mCallback.onFailed(this, this.mResponseInfo, cronetException);
            } catch (java.lang.Exception e17) {
                org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception notifying of failed request", (java.lang.Throwable) e17);
            }
            this.mInflightDoneCallbackCount.decrement();
        }
    }

    private static java.util.ArrayList<java.util.Map.Entry<java.lang.String, java.lang.String>> headersListFromStrings(java.lang.String[] strArr) {
        java.util.ArrayList<java.util.Map.Entry<java.lang.String, java.lang.String>> arrayList = new java.util.ArrayList<>(strArr.length / 2);
        for (int i17 = 0; i17 < strArr.length; i17 += 2) {
            arrayList.add(new java.util.AbstractMap.SimpleImmutableEntry(strArr[i17], strArr[i17 + 1]));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDoneLocked() {
        return this.mReadState != 0 && this.mNativeStream == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeOnSucceededOnExecutor() {
        synchronized (this.mNativeStreamLock) {
            if (isDoneLocked()) {
                return;
            }
            if (this.mWriteState == 10 && this.mReadState == 4) {
                this.mWriteState = 7;
                this.mReadState = 7;
                destroyNativeStreamLocked(false);
                try {
                    this.mCallback.onSucceeded(this, this.mResponseInfo);
                } catch (java.lang.Exception e17) {
                    org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception in onSucceeded method", (java.lang.Throwable) e17);
                }
                this.mInflightDoneCallbackCount.decrement();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCallbackException(java.lang.Exception exc) {
        org.chromium.net.impl.CallbackExceptionImpl callbackExceptionImpl = new org.chromium.net.impl.CallbackExceptionImpl("CalledByNative method has thrown an exception", exc);
        org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", (java.lang.Throwable) exc);
        failWithExceptionOnExecutor(callbackExceptionImpl);
    }

    private void onCanceled() {
        postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    org.chromium.net.impl.VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = org.chromium.net.impl.CronetBidirectionalStream.this.mCallback;
                    org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream = org.chromium.net.impl.CronetBidirectionalStream.this;
                    bidirectionalStreamCallback.onCanceled(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo);
                } catch (java.lang.Exception e17) {
                    org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception in onCanceled method", (java.lang.Throwable) e17);
                }
                org.chromium.net.impl.CronetBidirectionalStream.this.mInflightDoneCallbackCount.decrement();
            }
        });
    }

    private void onError(int i17, int i18, int i19, java.lang.String str, long j17) {
        org.chromium.net.impl.UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            urlResponseInfoImpl.setReceivedByteCount(j17);
        }
        if (i17 == 10 || i17 == 3) {
            failWithException(new org.chromium.net.impl.QuicExceptionImpl("Exception in BidirectionalStream: " + str, i17, i18, i19));
        } else {
            failWithException(new org.chromium.net.impl.BidirectionalStreamNetworkException("Exception in BidirectionalStream: " + str, i17, i18));
        }
    }

    private void onMetricsCollected(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, boolean z17, long j58, long j59) {
        synchronized (this.mNativeStreamLock) {
            try {
                if (this.mMetrics != null) {
                    throw new java.lang.IllegalStateException("Metrics collection should only happen once.");
                }
                org.chromium.net.impl.CronetMetrics cronetMetrics = new org.chromium.net.impl.CronetMetrics(j17, j18, j19, j27, j28, j29, j37, j38, j39, j47, j48, j49, j57, z17, j58, j59);
                this.mMetrics = cronetMetrics;
                int i17 = this.mReadState;
                this.mRequestContext.reportRequestFinished(new org.chromium.net.impl.RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, cronetMetrics, i17 == 7 ? 0 : i17 == 5 ? 2 : 1, this.mResponseInfo, this.mException), this.mInflightDoneCallbackCount);
            } finally {
                this.mInflightDoneCallbackCount.decrement();
            }
        }
    }

    private void onReadCompleted(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, long j17) {
        int i27;
        this.mResponseInfo.setReceivedByteCount(j17);
        if (byteBuffer.position() != i18 || byteBuffer.limit() != i19) {
            failWithException(new org.chromium.net.impl.CronetExceptionImpl("ByteBuffer modified externally during read", null));
            return;
        }
        if (i17 < 0 || (i27 = i18 + i17) > i19) {
            failWithException(new org.chromium.net.impl.CronetExceptionImpl("Invalid number of bytes read", null));
            return;
        }
        org.chromium.net.impl.CronetBidirectionalStream.OnReadCompletedRunnable onReadCompletedRunnable = this.mOnReadCompletedTask;
        onReadCompletedRunnable.mByteBuffer = byteBuffer;
        onReadCompletedRunnable.mEndOfStream = i17 == 0;
        postTaskToExecutor(onReadCompletedRunnable);
    }

    private void onResponseHeadersReceived(int i17, java.lang.String str, java.lang.String[] strArr, long j17) {
        try {
            this.mResponseInfo = prepareResponseInfoOnNetworkThread(i17, str, strArr, j17);
            postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.2
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (org.chromium.net.impl.CronetBidirectionalStream.this.mNativeStreamLock) {
                        if (org.chromium.net.impl.CronetBidirectionalStream.this.isDoneLocked()) {
                            return;
                        }
                        org.chromium.net.impl.CronetBidirectionalStream.this.mReadState = 2;
                        try {
                            org.chromium.net.impl.VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = org.chromium.net.impl.CronetBidirectionalStream.this.mCallback;
                            org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream = org.chromium.net.impl.CronetBidirectionalStream.this;
                            bidirectionalStreamCallback.onResponseHeadersReceived(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo);
                        } catch (java.lang.Exception e17) {
                            org.chromium.net.impl.CronetBidirectionalStream.this.onCallbackException(e17);
                        }
                    }
                }
            });
        } catch (java.lang.Exception unused) {
            failWithException(new org.chromium.net.impl.CronetExceptionImpl("Cannot prepare ResponseInfo", null));
        }
    }

    private void onResponseTrailersReceived(java.lang.String[] strArr) {
        final org.chromium.net.impl.UrlResponseInfoImpl.HeaderBlockImpl headerBlockImpl = new org.chromium.net.impl.UrlResponseInfoImpl.HeaderBlockImpl(headersListFromStrings(strArr));
        postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.3
            @Override // java.lang.Runnable
            public void run() {
                synchronized (org.chromium.net.impl.CronetBidirectionalStream.this.mNativeStreamLock) {
                    if (org.chromium.net.impl.CronetBidirectionalStream.this.isDoneLocked()) {
                        return;
                    }
                    try {
                        org.chromium.net.impl.VersionSafeCallbacks.BidirectionalStreamCallback bidirectionalStreamCallback = org.chromium.net.impl.CronetBidirectionalStream.this.mCallback;
                        org.chromium.net.impl.CronetBidirectionalStream cronetBidirectionalStream = org.chromium.net.impl.CronetBidirectionalStream.this;
                        bidirectionalStreamCallback.onResponseTrailersReceived(cronetBidirectionalStream, cronetBidirectionalStream.mResponseInfo, headerBlockImpl);
                    } catch (java.lang.Exception e17) {
                        org.chromium.net.impl.CronetBidirectionalStream.this.onCallbackException(e17);
                    }
                }
            }
        });
    }

    private void onStreamReady(final boolean z17) {
        postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (org.chromium.net.impl.CronetBidirectionalStream.this.mNativeStreamLock) {
                    if (org.chromium.net.impl.CronetBidirectionalStream.this.isDoneLocked()) {
                        return;
                    }
                    org.chromium.net.impl.CronetBidirectionalStream.this.mRequestHeadersSent = z17;
                    org.chromium.net.impl.CronetBidirectionalStream.this.mReadState = 2;
                    if (org.chromium.net.impl.CronetBidirectionalStream.doesMethodAllowWriteData(org.chromium.net.impl.CronetBidirectionalStream.this.mInitialMethod) || !org.chromium.net.impl.CronetBidirectionalStream.this.mRequestHeadersSent) {
                        org.chromium.net.impl.CronetBidirectionalStream.this.mWriteState = 8;
                    } else {
                        org.chromium.net.impl.CronetBidirectionalStream.this.mWriteState = 10;
                    }
                    try {
                        org.chromium.net.impl.CronetBidirectionalStream.this.mCallback.onStreamReady(org.chromium.net.impl.CronetBidirectionalStream.this);
                    } catch (java.lang.Exception e17) {
                        org.chromium.net.impl.CronetBidirectionalStream.this.onCallbackException(e17);
                    }
                }
            }
        });
    }

    private void onWritevCompleted(java.nio.ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z17) {
        boolean z18;
        synchronized (this.mNativeStreamLock) {
            if (isDoneLocked()) {
                return;
            }
            this.mWriteState = 8;
            if (!this.mFlushData.isEmpty()) {
                sendFlushDataLocked();
            }
            for (int i17 = 0; i17 < byteBufferArr.length; i17++) {
                java.nio.ByteBuffer byteBuffer = byteBufferArr[i17];
                if (byteBuffer.position() != iArr[i17] || byteBuffer.limit() != iArr2[i17]) {
                    failWithException(new org.chromium.net.impl.CronetExceptionImpl("ByteBuffer modified externally during write", null));
                    return;
                }
                if (z17) {
                    z18 = true;
                    if (i17 == byteBufferArr.length - 1) {
                        postTaskToExecutor(new org.chromium.net.impl.CronetBidirectionalStream.OnWriteCompletedRunnable(byteBuffer, z18));
                    }
                }
                z18 = false;
                postTaskToExecutor(new org.chromium.net.impl.CronetBidirectionalStream.OnWriteCompletedRunnable(byteBuffer, z18));
            }
        }
    }

    private void postTaskToExecutor(java.lang.Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (java.lang.Throwable) e17);
            synchronized (this.mNativeStreamLock) {
                this.mWriteState = 6;
                this.mReadState = 6;
                destroyNativeStreamLocked(false);
            }
        }
    }

    private org.chromium.net.impl.UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int i17, java.lang.String str, java.lang.String[] strArr, long j17) {
        return new org.chromium.net.impl.UrlResponseInfoImpl(java.util.Arrays.asList(this.mInitialUrl), i17, "", headersListFromStrings(strArr), false, str, null, j17);
    }

    private void sendFlushDataLocked() {
        int size = this.mFlushData.size();
        java.nio.ByteBuffer[] byteBufferArr = new java.nio.ByteBuffer[size];
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        for (int i17 = 0; i17 < size; i17++) {
            java.nio.ByteBuffer poll = this.mFlushData.poll();
            byteBufferArr[i17] = poll;
            iArr[i17] = poll.position();
            iArr2[i17] = poll.limit();
        }
        this.mWriteState = 9;
        this.mRequestHeadersSent = true;
        if (org.chromium.net.impl.CronetBidirectionalStreamJni.get().writevData(this.mNativeStream, this, byteBufferArr, iArr, iArr2, this.mEndOfStreamWritten && this.mPendingData.isEmpty())) {
            return;
        }
        this.mWriteState = 8;
        throw new java.lang.IllegalArgumentException("Unable to call native writev.");
    }

    private static java.lang.String[] stringsFromHeaderList(java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list) {
        java.lang.String[] strArr = new java.lang.String[list.size() * 2];
        int i17 = 0;
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : list) {
            int i18 = i17 + 1;
            strArr[i17] = entry.getKey();
            i17 = i18 + 1;
            strArr[i18] = entry.getValue();
        }
        return strArr;
    }

    @Override // org.chromium.net.BidirectionalStream
    public void cancel() {
        synchronized (this.mNativeStreamLock) {
            if (!isDoneLocked() && this.mReadState != 0) {
                this.mWriteState = 5;
                this.mReadState = 5;
                destroyNativeStreamLocked(true);
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public void flush() {
        int i17;
        synchronized (this.mNativeStreamLock) {
            if (!isDoneLocked() && ((i17 = this.mWriteState) == 8 || i17 == 9)) {
                if (this.mPendingData.isEmpty() && this.mFlushData.isEmpty()) {
                    if (!this.mRequestHeadersSent) {
                        this.mRequestHeadersSent = true;
                        org.chromium.net.impl.CronetBidirectionalStreamJni.get().sendRequestHeaders(this.mNativeStream, this);
                        if (!doesMethodAllowWriteData(this.mInitialMethod)) {
                            this.mWriteState = 10;
                        }
                    }
                    return;
                }
                if (!this.mPendingData.isEmpty()) {
                    this.mFlushData.addAll(this.mPendingData);
                    this.mPendingData.clear();
                }
                if (this.mWriteState == 9) {
                    return;
                }
                sendFlushDataLocked();
            }
        }
    }

    public java.util.List<java.nio.ByteBuffer> getFlushDataForTesting() {
        java.util.LinkedList linkedList;
        synchronized (this.mNativeStreamLock) {
            linkedList = new java.util.LinkedList();
            java.util.Iterator<java.nio.ByteBuffer> it = this.mFlushData.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().asReadOnlyBuffer());
            }
        }
        return linkedList;
    }

    public java.util.List<java.nio.ByteBuffer> getPendingDataForTesting() {
        java.util.LinkedList linkedList;
        synchronized (this.mNativeStreamLock) {
            linkedList = new java.util.LinkedList();
            java.util.Iterator<java.nio.ByteBuffer> it = this.mPendingData.iterator();
            while (it.hasNext()) {
                linkedList.add(it.next().asReadOnlyBuffer());
            }
        }
        return linkedList;
    }

    @Override // org.chromium.net.BidirectionalStream
    public boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mNativeStreamLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    @Override // org.chromium.net.BidirectionalStream
    public void read(java.nio.ByteBuffer byteBuffer) {
        synchronized (this.mNativeStreamLock) {
            org.chromium.net.impl.Preconditions.checkHasRemaining(byteBuffer);
            org.chromium.net.impl.Preconditions.checkDirect(byteBuffer);
            if (this.mReadState != 2) {
                throw new java.lang.IllegalStateException("Unexpected read attempt.");
            }
            if (isDoneLocked()) {
                return;
            }
            if (this.mOnReadCompletedTask == null) {
                this.mOnReadCompletedTask = new org.chromium.net.impl.CronetBidirectionalStream.OnReadCompletedRunnable();
            }
            this.mReadState = 3;
            if (org.chromium.net.impl.CronetBidirectionalStreamJni.get().readData(this.mNativeStream, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                return;
            }
            this.mReadState = 2;
            throw new java.lang.IllegalArgumentException("Unable to call native read");
        }
    }

    public void setOnDestroyedCallbackForTesting(java.lang.Runnable runnable) {
        this.mOnDestroyedCallbackForTesting = runnable;
    }

    @Override // org.chromium.net.BidirectionalStream
    public void start() {
        synchronized (this.mNativeStreamLock) {
            if (this.mReadState != 0) {
                throw new java.lang.IllegalStateException("Stream is already started.");
            }
            try {
                this.mNativeStream = org.chromium.net.impl.CronetBidirectionalStreamJni.get().createBidirectionalStream(this, this.mRequestContext.getUrlRequestContextAdapter(), !this.mDelayRequestHeadersUntilFirstFlush, this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid, this.mNetworkHandle);
                this.mRequestContext.onRequestStarted();
                final org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext = this.mRequestContext;
                java.util.Objects.requireNonNull(cronetUrlRequestContext);
                org.chromium.net.impl.RefCountDelegate refCountDelegate = new org.chromium.net.impl.RefCountDelegate(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetBidirectionalStream$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        org.chromium.net.impl.CronetUrlRequestContext.this.onRequestFinished();
                    }
                });
                this.mInflightDoneCallbackCount = refCountDelegate;
                refCountDelegate.increment();
                org.chromium.net.impl.CronetBidirectionalStream.Natives natives = org.chromium.net.impl.CronetBidirectionalStreamJni.get();
                long j17 = this.mNativeStream;
                java.lang.String str = this.mInitialUrl;
                int i17 = this.mInitialPriority;
                java.lang.String str2 = this.mInitialMethod;
                int start = natives.start(j17, this, str, i17, str2, this.mRequestHeaders, !doesMethodAllowWriteData(str2));
                if (start == -1) {
                    throw new java.lang.IllegalArgumentException("Invalid http method " + this.mInitialMethod);
                }
                if (start > 0) {
                    int i18 = start - 1;
                    java.lang.String[] strArr = this.mRequestHeaders;
                    throw new java.lang.IllegalArgumentException("Invalid header " + strArr[i18] + "=" + strArr[i18 + 1]);
                }
                this.mWriteState = 1;
                this.mReadState = 1;
            } catch (java.lang.RuntimeException e17) {
                destroyNativeStreamLocked(false);
                this.mInflightDoneCallbackCount.decrement();
                this.mInflightDoneCallbackCount.decrement();
                throw e17;
            }
        }
    }

    @Override // org.chromium.net.BidirectionalStream
    public void write(java.nio.ByteBuffer byteBuffer, boolean z17) {
        synchronized (this.mNativeStreamLock) {
            org.chromium.net.impl.Preconditions.checkDirect(byteBuffer);
            if (!byteBuffer.hasRemaining() && !z17) {
                throw new java.lang.IllegalArgumentException("Empty buffer before end of stream.");
            }
            if (this.mEndOfStreamWritten) {
                throw new java.lang.IllegalArgumentException("Write after writing end of stream.");
            }
            if (isDoneLocked()) {
                return;
            }
            this.mPendingData.add(byteBuffer);
            if (z17) {
                this.mEndOfStreamWritten = true;
            }
        }
    }
}
