package org.chromium.net.impl;

@org.chromium.base.annotations.JNINamespace("cronet")
/* loaded from: classes16.dex */
public final class CronetUrlRequest extends org.chromium.net.impl.UrlRequestBase {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mAllowDirectExecutor;
    private final org.chromium.net.impl.VersionSafeCallbacks.UrlRequestCallback mCallback;
    private final int mCronetEngineId;
    private final boolean mDisableCache;
    private final boolean mDisableConnectionMigration;
    private org.chromium.net.CronetException mException;
    private final java.util.concurrent.Executor mExecutor;
    private int mFinishedReason;
    private final int mIdempotency;
    private java.lang.String mInitialMethod;
    private final java.lang.String mInitialUrl;
    private final org.chromium.net.impl.CronetLogger mLogger;
    private org.chromium.net.impl.CronetMetrics mMetrics;
    private final long mNetworkHandle;
    private java.lang.Runnable mOnDestroyedCallbackForTesting;
    private org.chromium.net.impl.CronetUrlRequest.OnReadCompletedRunnable mOnReadCompletedTask;
    private final int mPriority;
    private boolean mQuicConnectionMigrationAttempted;
    private boolean mQuicConnectionMigrationSuccessful;
    private final java.util.Collection<java.lang.Object> mRequestAnnotations;
    private final org.chromium.net.impl.CronetUrlRequestContext mRequestContext;
    private final org.chromium.net.impl.VersionSafeCallbacks.RequestFinishedInfoListener mRequestFinishedListener;
    private final org.chromium.net.impl.CronetUrlRequest.HeadersList mRequestHeaders;
    private org.chromium.net.impl.UrlResponseInfoImpl mResponseInfo;
    private boolean mStarted;
    private final int mTrafficStatsTag;
    private final boolean mTrafficStatsTagSet;
    private final int mTrafficStatsUid;
    private final boolean mTrafficStatsUidSet;
    private org.chromium.net.impl.CronetUploadDataStream mUploadDataStream;
    private final java.util.List<java.lang.String> mUrlChain;
    private long mUrlRequestAdapter;
    private final java.lang.Object mUrlRequestAdapterLock = new java.lang.Object();
    private boolean mWaitingOnRead;
    private boolean mWaitingOnRedirect;

    /* loaded from: classes16.dex */
    public static final class HeadersList extends java.util.ArrayList<java.util.Map.Entry<java.lang.String, java.lang.String>> {
    }

    /* loaded from: classes16.dex */
    public interface Natives {
        @org.chromium.base.annotations.NativeClassQualifiedName("CronetURLRequestAdapter")
        boolean addRequestHeader(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, java.lang.String str, java.lang.String str2);

        long createRequestAdapter(org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, long j17, java.lang.String str, int i17, boolean z17, boolean z18, boolean z19, int i18, boolean z27, int i19, int i27, long j18);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetURLRequestAdapter")
        void destroy(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, boolean z17);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetURLRequestAdapter")
        void followDeferredRedirect(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetURLRequestAdapter")
        void getStatus(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, org.chromium.net.impl.VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetURLRequestAdapter")
        boolean readData(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, java.nio.ByteBuffer byteBuffer, int i17, int i18);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetURLRequestAdapter")
        boolean setHttpMethod(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest, java.lang.String str);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetURLRequestAdapter")
        void start(long j17, org.chromium.net.impl.CronetUrlRequest cronetUrlRequest);
    }

    /* loaded from: classes16.dex */
    public final class OnReadCompletedRunnable implements java.lang.Runnable {
        java.nio.ByteBuffer mByteBuffer;

        @Override // java.lang.Runnable
        public void run() {
            org.chromium.net.impl.CronetUrlRequest.this.checkCallingThread();
            java.nio.ByteBuffer byteBuffer = this.mByteBuffer;
            this.mByteBuffer = null;
            try {
                synchronized (org.chromium.net.impl.CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (org.chromium.net.impl.CronetUrlRequest.this.isDoneLocked()) {
                        return;
                    }
                    org.chromium.net.impl.CronetUrlRequest.this.mWaitingOnRead = true;
                    org.chromium.net.impl.VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = org.chromium.net.impl.CronetUrlRequest.this.mCallback;
                    org.chromium.net.impl.CronetUrlRequest cronetUrlRequest = org.chromium.net.impl.CronetUrlRequest.this;
                    urlRequestCallback.onReadCompleted(cronetUrlRequest, cronetUrlRequest.mResponseInfo, byteBuffer);
                }
            } catch (java.lang.Exception e17) {
                org.chromium.net.impl.CronetUrlRequest.this.onCallbackException(e17);
            }
        }

        private OnReadCompletedRunnable() {
        }
    }

    public CronetUrlRequest(org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, java.lang.String str, int i17, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor, java.util.Collection<java.lang.Object> collection, boolean z17, boolean z18, boolean z19, boolean z27, int i18, boolean z28, int i19, org.chromium.net.RequestFinishedInfo.Listener listener, int i27, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.mUrlChain = arrayList;
        this.mRequestHeaders = new org.chromium.net.impl.CronetUrlRequest.HeadersList();
        java.util.Objects.requireNonNull(str, "URL is required");
        java.util.Objects.requireNonNull(callback, "Listener is required");
        java.util.Objects.requireNonNull(executor, "Executor is required");
        this.mAllowDirectExecutor = z19;
        this.mRequestContext = cronetUrlRequestContext;
        this.mCronetEngineId = cronetUrlRequestContext.getCronetEngineId();
        this.mLogger = cronetUrlRequestContext.getCronetLogger();
        this.mInitialUrl = str;
        arrayList.add(str);
        this.mPriority = convertRequestPriority(i17);
        this.mCallback = new org.chromium.net.impl.VersionSafeCallbacks.UrlRequestCallback(callback);
        this.mExecutor = executor;
        this.mRequestAnnotations = collection;
        this.mDisableCache = z17;
        this.mDisableConnectionMigration = z18;
        this.mTrafficStatsTagSet = z27;
        this.mTrafficStatsTag = i18;
        this.mTrafficStatsUidSet = z28;
        this.mTrafficStatsUid = i19;
        this.mRequestFinishedListener = listener != null ? new org.chromium.net.impl.VersionSafeCallbacks.RequestFinishedInfoListener(listener) : null;
        this.mIdempotency = convertIdempotency(i27);
        this.mNetworkHandle = j17;
    }

    private org.chromium.net.impl.CronetLogger.CronetTrafficInfo buildCronetTrafficInfo() {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> emptyMap;
        java.lang.String str;
        boolean z17;
        int i17;
        long estimateHeadersSizeInBytes;
        long max;
        long estimateHeadersSizeInBytes2;
        long max2;
        org.chromium.net.impl.UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            emptyMap = urlResponseInfoImpl.getAllHeaders();
            java.lang.String negotiatedProtocol = this.mResponseInfo.getNegotiatedProtocol();
            int httpStatusCode = this.mResponseInfo.getHttpStatusCode();
            z17 = this.mResponseInfo.wasCached();
            str = negotiatedProtocol;
            i17 = httpStatusCode;
        } else {
            emptyMap = java.util.Collections.emptyMap();
            str = "";
            z17 = false;
            i17 = 0;
        }
        long longValue = this.mMetrics.getSentByteCount().longValue();
        if (z17 && longValue == 0) {
            estimateHeadersSizeInBytes = 0;
            max = 0;
        } else {
            estimateHeadersSizeInBytes = estimateHeadersSizeInBytes(this.mRequestHeaders);
            max = java.lang.Math.max(0L, longValue - estimateHeadersSizeInBytes);
        }
        long longValue2 = this.mMetrics.getReceivedByteCount().longValue();
        if (z17 && longValue2 == 0) {
            estimateHeadersSizeInBytes2 = 0;
            max2 = 0;
        } else {
            estimateHeadersSizeInBytes2 = estimateHeadersSizeInBytes(emptyMap);
            max2 = java.lang.Math.max(0L, longValue2 - estimateHeadersSizeInBytes2);
        }
        return new org.chromium.net.impl.CronetLogger.CronetTrafficInfo(estimateHeadersSizeInBytes, max, estimateHeadersSizeInBytes2, max2, i17, (this.mMetrics.getRequestStart() == null || this.mMetrics.getResponseStart() == null) ? java.time.Duration.ofSeconds(0L) : java.time.Duration.ofMillis(this.mMetrics.getResponseStart().getTime() - this.mMetrics.getRequestStart().getTime()), (this.mMetrics.getRequestStart() == null || this.mMetrics.getRequestEnd() == null) ? java.time.Duration.ofSeconds(0L) : java.time.Duration.ofMillis(this.mMetrics.getRequestEnd().getTime() - this.mMetrics.getRequestStart().getTime()), str, this.mQuicConnectionMigrationAttempted, this.mQuicConnectionMigrationSuccessful);
    }

    private void checkNotStarted() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mStarted || isDoneLocked()) {
                throw new java.lang.IllegalStateException("Request is already started.");
            }
        }
    }

    private static int convertIdempotency(int i17) {
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                return 0;
            }
        }
        return i18;
    }

    private static int convertRequestPriority(int i17) {
        if (i17 == 0) {
            return 1;
        }
        if (i17 == 1) {
            return 2;
        }
        if (i17 != 2) {
            return i17 != 4 ? 4 : 5;
        }
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyRequestAdapterLocked(int i17) {
        this.mFinishedReason = i17;
        if (this.mUrlRequestAdapter == 0) {
            return;
        }
        this.mRequestContext.onRequestDestroyed();
        org.chromium.net.impl.CronetUrlRequestJni.get().destroy(this.mUrlRequestAdapter, this, i17 == 2);
        this.mUrlRequestAdapter = 0L;
    }

    public static long estimateHeadersSizeInBytes(java.util.Map<java.lang.String, java.util.List<java.lang.String>> map) {
        long j17 = 0;
        if (map == null) {
            return 0L;
        }
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                j17 += r3.length();
            }
            if (entry.getValue() != null) {
                while (entry.getValue().iterator().hasNext()) {
                    j17 += r2.next().length();
                }
            }
        }
        return j17;
    }

    private void failWithException(org.chromium.net.CronetException cronetException) {
        synchronized (this.mUrlRequestAdapterLock) {
            if (isDoneLocked()) {
                return;
            }
            this.mException = cronetException;
            destroyRequestAdapterLocked(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isDoneLocked() {
        return this.mStarted && this.mUrlRequestAdapter == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$maybeReportMetrics$0() {
        this.mRequestContext.onRequestFinished();
    }

    private int mapUrlRequestErrorToApiErrorCode(int i17) {
        switch (i17) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Unknown error code: " + i17);
                return i17;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeReportMetrics() {
        final org.chromium.net.impl.RefCountDelegate refCountDelegate = new org.chromium.net.impl.RefCountDelegate(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest$$a
            @Override // java.lang.Runnable
            public final void run() {
                org.chromium.net.impl.CronetUrlRequest.this.lambda$maybeReportMetrics$0();
            }
        });
        try {
            if (this.mMetrics == null) {
                refCountDelegate.decrement();
                return;
            }
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                try {
                    this.mLogger.logCronetTrafficInfo(this.mCronetEngineId, buildCronetTrafficInfo());
                } catch (java.lang.RuntimeException e17) {
                    org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Error while trying to log CronetTrafficInfo: ", (java.lang.Throwable) e17);
                }
            }
            final org.chromium.net.impl.RequestFinishedInfoImpl requestFinishedInfoImpl = new org.chromium.net.impl.RequestFinishedInfoImpl(this.mInitialUrl, this.mRequestAnnotations, this.mMetrics, this.mFinishedReason, this.mResponseInfo, this.mException);
            this.mRequestContext.reportRequestFinished(requestFinishedInfoImpl, refCountDelegate);
            if (this.mRequestFinishedListener != null) {
                refCountDelegate.increment();
                try {
                    this.mRequestFinishedListener.getExecutor().execute(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.9
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                try {
                                    org.chromium.net.impl.CronetUrlRequest.this.mRequestFinishedListener.onRequestFinished(requestFinishedInfoImpl);
                                } catch (java.lang.Exception e18) {
                                    org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception thrown from request finished listener", (java.lang.Throwable) e18);
                                }
                            } finally {
                                refCountDelegate.decrement();
                            }
                        }
                    });
                } catch (java.util.concurrent.RejectedExecutionException e18) {
                    org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (java.lang.Throwable) e18);
                    refCountDelegate.decrement();
                }
            }
            refCountDelegate.decrement();
        } catch (java.lang.Throwable th6) {
            refCountDelegate.decrement();
            throw th6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCallbackException(java.lang.Exception exc) {
        org.chromium.net.impl.CallbackExceptionImpl callbackExceptionImpl = new org.chromium.net.impl.CallbackExceptionImpl("Exception received from UrlRequest.Callback", exc);
        org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception in CalledByNative method", (java.lang.Throwable) exc);
        failWithException(callbackExceptionImpl);
    }

    private void onCanceled() {
        postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    org.chromium.net.impl.VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = org.chromium.net.impl.CronetUrlRequest.this.mCallback;
                    org.chromium.net.impl.CronetUrlRequest cronetUrlRequest = org.chromium.net.impl.CronetUrlRequest.this;
                    urlRequestCallback.onCanceled(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                } catch (java.lang.Exception e17) {
                    org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception in onCanceled method", (java.lang.Throwable) e17);
                }
                org.chromium.net.impl.CronetUrlRequest.this.maybeReportMetrics();
            }
        });
    }

    private void onError(int i17, int i18, int i19, java.lang.String str, long j17) {
        org.chromium.net.impl.UrlResponseInfoImpl urlResponseInfoImpl = this.mResponseInfo;
        if (urlResponseInfoImpl != null) {
            urlResponseInfoImpl.setReceivedByteCount(j17);
        }
        if (i17 == 10 || i17 == 3) {
            failWithException(new org.chromium.net.impl.QuicExceptionImpl("Exception in CronetUrlRequest: " + str, i17, i18, i19));
        } else {
            failWithException(new org.chromium.net.impl.NetworkExceptionImpl("Exception in CronetUrlRequest: " + str, mapUrlRequestErrorToApiErrorCode(i17), i18));
        }
    }

    private void onMetricsCollected(long j17, long j18, long j19, long j27, long j28, long j29, long j37, long j38, long j39, long j47, long j48, long j49, long j57, boolean z17, long j58, long j59, boolean z18, boolean z19) {
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mMetrics != null) {
                throw new java.lang.IllegalStateException("Metrics collection should only happen once.");
            }
            this.mMetrics = new org.chromium.net.impl.CronetMetrics(j17, j18, j19, j27, j28, j29, j37, j38, j39, j47, j48, j49, j57, z17, j58, j59);
            this.mQuicConnectionMigrationAttempted = z18;
            this.mQuicConnectionMigrationSuccessful = z19;
        }
    }

    private void onNativeAdapterDestroyed() {
        synchronized (this.mUrlRequestAdapterLock) {
            java.lang.Runnable runnable = this.mOnDestroyedCallbackForTesting;
            if (runnable != null) {
                runnable.run();
            }
            if (this.mException == null) {
                return;
            }
            try {
                this.mExecutor.execute(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.8
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            org.chromium.net.impl.VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = org.chromium.net.impl.CronetUrlRequest.this.mCallback;
                            org.chromium.net.impl.CronetUrlRequest cronetUrlRequest = org.chromium.net.impl.CronetUrlRequest.this;
                            urlRequestCallback.onFailed(cronetUrlRequest, cronetUrlRequest.mResponseInfo, org.chromium.net.impl.CronetUrlRequest.this.mException);
                        } catch (java.lang.Exception e17) {
                            org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception in onFailed method", (java.lang.Throwable) e17);
                        }
                        org.chromium.net.impl.CronetUrlRequest.this.maybeReportMetrics();
                    }
                });
            } catch (java.util.concurrent.RejectedExecutionException e17) {
                org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (java.lang.Throwable) e17);
            }
        }
    }

    private void onReadCompleted(java.nio.ByteBuffer byteBuffer, int i17, int i18, int i19, long j17) {
        this.mResponseInfo.setReceivedByteCount(j17);
        if (byteBuffer.position() != i18 || byteBuffer.limit() != i19) {
            failWithException(new org.chromium.net.impl.CronetExceptionImpl("ByteBuffer modified externally during read", null));
            return;
        }
        if (this.mOnReadCompletedTask == null) {
            this.mOnReadCompletedTask = new org.chromium.net.impl.CronetUrlRequest.OnReadCompletedRunnable();
        }
        org.chromium.net.impl.CronetUrlRequest.OnReadCompletedRunnable onReadCompletedRunnable = this.mOnReadCompletedTask;
        onReadCompletedRunnable.mByteBuffer = byteBuffer;
        postTaskToExecutor(onReadCompletedRunnable);
    }

    private void onRedirectReceived(final java.lang.String str, int i17, java.lang.String str2, java.lang.String[] strArr, boolean z17, java.lang.String str3, java.lang.String str4, long j17) {
        final org.chromium.net.impl.UrlResponseInfoImpl prepareResponseInfoOnNetworkThread = prepareResponseInfoOnNetworkThread(i17, str2, strArr, z17, str3, str4, j17);
        this.mUrlChain.add(str);
        postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.3
            @Override // java.lang.Runnable
            public void run() {
                org.chromium.net.impl.CronetUrlRequest.this.checkCallingThread();
                synchronized (org.chromium.net.impl.CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (org.chromium.net.impl.CronetUrlRequest.this.isDoneLocked()) {
                        return;
                    }
                    org.chromium.net.impl.CronetUrlRequest.this.mWaitingOnRedirect = true;
                    try {
                        org.chromium.net.impl.CronetUrlRequest.this.mCallback.onRedirectReceived(org.chromium.net.impl.CronetUrlRequest.this, prepareResponseInfoOnNetworkThread, str);
                    } catch (java.lang.Exception e17) {
                        org.chromium.net.impl.CronetUrlRequest.this.onCallbackException(e17);
                    }
                }
            }
        });
    }

    private void onResponseStarted(int i17, java.lang.String str, java.lang.String[] strArr, boolean z17, java.lang.String str2, java.lang.String str3, long j17) {
        this.mResponseInfo = prepareResponseInfoOnNetworkThread(i17, str, strArr, z17, str2, str3, j17);
        postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.4
            @Override // java.lang.Runnable
            public void run() {
                org.chromium.net.impl.CronetUrlRequest.this.checkCallingThread();
                synchronized (org.chromium.net.impl.CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (org.chromium.net.impl.CronetUrlRequest.this.isDoneLocked()) {
                        return;
                    }
                    org.chromium.net.impl.CronetUrlRequest.this.mWaitingOnRead = true;
                    try {
                        org.chromium.net.impl.VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = org.chromium.net.impl.CronetUrlRequest.this.mCallback;
                        org.chromium.net.impl.CronetUrlRequest cronetUrlRequest = org.chromium.net.impl.CronetUrlRequest.this;
                        urlRequestCallback.onResponseStarted(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                    } catch (java.lang.Exception e17) {
                        org.chromium.net.impl.CronetUrlRequest.this.onCallbackException(e17);
                    }
                }
            }
        });
    }

    private void onStatus(final org.chromium.net.impl.VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener, final int i17) {
        postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.7
            @Override // java.lang.Runnable
            public void run() {
                urlRequestStatusListener.onStatus(org.chromium.net.impl.UrlRequestBase.convertLoadState(i17));
            }
        });
    }

    private void onSucceeded(long j17) {
        this.mResponseInfo.setReceivedByteCount(j17);
        postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.5
            @Override // java.lang.Runnable
            public void run() {
                synchronized (org.chromium.net.impl.CronetUrlRequest.this.mUrlRequestAdapterLock) {
                    if (org.chromium.net.impl.CronetUrlRequest.this.isDoneLocked()) {
                        return;
                    }
                    org.chromium.net.impl.CronetUrlRequest.this.destroyRequestAdapterLocked(0);
                    try {
                        org.chromium.net.impl.VersionSafeCallbacks.UrlRequestCallback urlRequestCallback = org.chromium.net.impl.CronetUrlRequest.this.mCallback;
                        org.chromium.net.impl.CronetUrlRequest cronetUrlRequest = org.chromium.net.impl.CronetUrlRequest.this;
                        urlRequestCallback.onSucceeded(cronetUrlRequest, cronetUrlRequest.mResponseInfo);
                    } catch (java.lang.Exception e17) {
                        org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception in onSucceeded method", (java.lang.Throwable) e17);
                    }
                    org.chromium.net.impl.CronetUrlRequest.this.maybeReportMetrics();
                }
            }
        });
    }

    private void postTaskToExecutor(java.lang.Runnable runnable) {
        try {
            this.mExecutor.execute(runnable);
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception posting task to executor", (java.lang.Throwable) e17);
            failWithException(new org.chromium.net.impl.CronetExceptionImpl("Exception posting task to executor", e17));
        }
    }

    private org.chromium.net.impl.UrlResponseInfoImpl prepareResponseInfoOnNetworkThread(int i17, java.lang.String str, java.lang.String[] strArr, boolean z17, java.lang.String str2, java.lang.String str3, long j17) {
        org.chromium.net.impl.CronetUrlRequest.HeadersList headersList = new org.chromium.net.impl.CronetUrlRequest.HeadersList();
        for (int i18 = 0; i18 < strArr.length; i18 += 2) {
            headersList.add(new java.util.AbstractMap.SimpleImmutableEntry(strArr[i18], strArr[i18 + 1]));
        }
        return new org.chromium.net.impl.UrlResponseInfoImpl(new java.util.ArrayList(this.mUrlChain), i17, str, headersList, z17, str2, str3, j17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startInternalLocked() {
        org.chromium.net.impl.CronetUrlRequestJni.get().start(this.mUrlRequestAdapter, this);
    }

    @Override // org.chromium.net.impl.UrlRequestBase
    public void addHeader(java.lang.String str, java.lang.String str2) {
        checkNotStarted();
        java.util.Objects.requireNonNull(str, "Invalid header name.");
        java.util.Objects.requireNonNull(str2, "Invalid header value.");
        this.mRequestHeaders.add(new java.util.AbstractMap.SimpleImmutableEntry(str, str2));
    }

    @Override // org.chromium.net.UrlRequest
    public void cancel() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (!isDoneLocked() && this.mStarted) {
                destroyRequestAdapterLocked(2);
            }
        }
    }

    public void checkCallingThread() {
        if (!this.mAllowDirectExecutor && this.mRequestContext.isNetworkThread(java.lang.Thread.currentThread())) {
            throw new org.chromium.net.InlineExecutionProhibitedException();
        }
    }

    @Override // org.chromium.net.UrlRequest
    public void followRedirect() {
        synchronized (this.mUrlRequestAdapterLock) {
            if (!this.mWaitingOnRedirect) {
                throw new java.lang.IllegalStateException("No redirect to follow.");
            }
            this.mWaitingOnRedirect = false;
            if (isDoneLocked()) {
                return;
            }
            org.chromium.net.impl.CronetUrlRequestJni.get().followDeferredRedirect(this.mUrlRequestAdapter, this);
        }
    }

    @Override // org.chromium.net.UrlRequest
    public void getStatus(org.chromium.net.UrlRequest.StatusListener statusListener) {
        final org.chromium.net.impl.VersionSafeCallbacks.UrlRequestStatusListener urlRequestStatusListener = new org.chromium.net.impl.VersionSafeCallbacks.UrlRequestStatusListener(statusListener);
        synchronized (this.mUrlRequestAdapterLock) {
            if (this.mUrlRequestAdapter != 0) {
                org.chromium.net.impl.CronetUrlRequestJni.get().getStatus(this.mUrlRequestAdapter, this, urlRequestStatusListener);
            } else {
                postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.2
                    @Override // java.lang.Runnable
                    public void run() {
                        urlRequestStatusListener.onStatus(-1);
                    }
                });
            }
        }
    }

    public long getUrlRequestAdapterForTesting() {
        long j17;
        synchronized (this.mUrlRequestAdapterLock) {
            j17 = this.mUrlRequestAdapter;
        }
        return j17;
    }

    @Override // org.chromium.net.UrlRequest
    public boolean isDone() {
        boolean isDoneLocked;
        synchronized (this.mUrlRequestAdapterLock) {
            isDoneLocked = isDoneLocked();
        }
        return isDoneLocked;
    }

    public void onUploadException(java.lang.Throwable th6) {
        org.chromium.net.impl.CallbackExceptionImpl callbackExceptionImpl = new org.chromium.net.impl.CallbackExceptionImpl("Exception received from UploadDataProvider", th6);
        org.chromium.base.Log.e(org.chromium.net.impl.CronetUrlRequestContext.LOG_TAG, "Exception in upload method", th6);
        failWithException(callbackExceptionImpl);
    }

    @Override // org.chromium.net.UrlRequest
    public void read(java.nio.ByteBuffer byteBuffer) {
        org.chromium.net.impl.Preconditions.checkHasRemaining(byteBuffer);
        org.chromium.net.impl.Preconditions.checkDirect(byteBuffer);
        synchronized (this.mUrlRequestAdapterLock) {
            if (!this.mWaitingOnRead) {
                throw new java.lang.IllegalStateException("Unexpected read attempt.");
            }
            this.mWaitingOnRead = false;
            if (isDoneLocked()) {
                return;
            }
            if (org.chromium.net.impl.CronetUrlRequestJni.get().readData(this.mUrlRequestAdapter, this, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                return;
            }
            this.mWaitingOnRead = true;
            throw new java.lang.IllegalArgumentException("Unable to call native read");
        }
    }

    @Override // org.chromium.net.impl.UrlRequestBase
    public void setHttpMethod(java.lang.String str) {
        checkNotStarted();
        java.util.Objects.requireNonNull(str, "Method is required.");
        this.mInitialMethod = str;
    }

    public void setOnDestroyedCallbackForTesting(java.lang.Runnable runnable) {
        synchronized (this.mUrlRequestAdapterLock) {
            this.mOnDestroyedCallbackForTesting = runnable;
        }
    }

    public void setOnDestroyedUploadCallbackForTesting(java.lang.Runnable runnable) {
        this.mUploadDataStream.setOnDestroyedCallbackForTesting(runnable);
    }

    @Override // org.chromium.net.impl.UrlRequestBase
    public void setUploadDataProvider(org.chromium.net.UploadDataProvider uploadDataProvider, java.util.concurrent.Executor executor) {
        java.util.Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        if (this.mInitialMethod == null) {
            this.mInitialMethod = "POST";
        }
        this.mUploadDataStream = new org.chromium.net.impl.CronetUploadDataStream(uploadDataProvider, executor, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26, types: [org.chromium.net.impl.CronetUrlRequest$Natives] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [org.chromium.net.impl.CronetUrlRequest] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [org.chromium.net.impl.CronetUrlRequest] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // org.chromium.net.UrlRequest
    public void start() {
        java.lang.Object obj;
        ?? r76;
        ?? r17;
        java.util.Map.Entry<java.lang.String, java.lang.String> next;
        java.lang.Object obj2 = this.mUrlRequestAdapterLock;
        synchronized (obj2) {
            try {
                try {
                    checkNotStarted();
                    try {
                        obj = obj2;
                    } catch (java.lang.RuntimeException e17) {
                        e = e17;
                        r76 = this;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    obj = obj2;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
            try {
                r76 = this;
                try {
                    r76.mUrlRequestAdapter = org.chromium.net.impl.CronetUrlRequestJni.get().createRequestAdapter(this, this.mRequestContext.getUrlRequestContextAdapter(), this.mInitialUrl, this.mPriority, this.mDisableCache, this.mDisableConnectionMigration, this.mTrafficStatsTagSet, this.mTrafficStatsTag, this.mTrafficStatsUidSet, this.mTrafficStatsUid, this.mIdempotency, this.mNetworkHandle);
                    r76.mRequestContext.onRequestStarted();
                    if (r76.mInitialMethod != null && !org.chromium.net.impl.CronetUrlRequestJni.get().setHttpMethod(r76.mUrlRequestAdapter, r76, r76.mInitialMethod)) {
                        throw new java.lang.IllegalArgumentException("Invalid http method " + r76.mInitialMethod);
                    }
                    java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = r76.mRequestHeaders.iterator();
                    boolean z17 = false;
                    do {
                        r17 = it.hasNext();
                        if (r17 == 0) {
                            org.chromium.net.impl.CronetUploadDataStream cronetUploadDataStream = r76.mUploadDataStream;
                            if (cronetUploadDataStream == null) {
                                r76.mStarted = true;
                                startInternalLocked();
                                return;
                            }
                            try {
                                if (!z17) {
                                    throw new java.lang.IllegalArgumentException("Requests with upload data must have a Content-Type.");
                                }
                                r76.mStarted = true;
                                cronetUploadDataStream.postTaskToExecutor(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequest.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        org.chromium.net.impl.CronetUrlRequest.this.mUploadDataStream.initializeWithRequest();
                                        synchronized (org.chromium.net.impl.CronetUrlRequest.this.mUrlRequestAdapterLock) {
                                            if (org.chromium.net.impl.CronetUrlRequest.this.isDoneLocked()) {
                                                return;
                                            }
                                            org.chromium.net.impl.CronetUrlRequest.this.mUploadDataStream.attachNativeAdapterToRequest(org.chromium.net.impl.CronetUrlRequest.this.mUrlRequestAdapter);
                                            org.chromium.net.impl.CronetUrlRequest.this.startInternalLocked();
                                        }
                                    }
                                });
                                return;
                            } catch (java.lang.RuntimeException e18) {
                                e = e18;
                                r76.destroyRequestAdapterLocked(r17);
                                r76.mRequestContext.onRequestFinished();
                                throw e;
                            }
                        }
                        next = it.next();
                        if (next.getKey().equalsIgnoreCase("Content-Type") && !next.getValue().isEmpty()) {
                            z17 = true;
                        }
                    } while (org.chromium.net.impl.CronetUrlRequestJni.get().addRequestHeader(r76.mUrlRequestAdapter, this, next.getKey(), next.getValue()));
                    throw new java.lang.IllegalArgumentException("Invalid header " + next.getKey() + "=" + next.getValue());
                } catch (java.lang.RuntimeException e19) {
                    e = e19;
                    r76 = r76;
                    r17 = 1;
                    r76.destroyRequestAdapterLocked(r17);
                    r76.mRequestContext.onRequestFinished();
                    throw e;
                }
            } catch (java.lang.RuntimeException e27) {
                e = e27;
                r17 = 1;
                r76 = this;
            } catch (java.lang.Throwable th8) {
                th = th8;
                throw th;
            }
        }
    }

    public static long estimateHeadersSizeInBytes(org.chromium.net.impl.CronetUrlRequest.HeadersList headersList) {
        long j17 = 0;
        if (headersList == null) {
            return 0L;
        }
        java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> it = headersList.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<java.lang.String, java.lang.String> next = it.next();
            if (next.getKey() != null) {
                j17 += r3.length();
            }
            if (next.getValue() != null) {
                j17 += next.getValue().length();
            }
        }
        return j17;
    }
}
