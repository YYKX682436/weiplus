package org.chromium.net.impl;

@org.chromium.base.annotations.JNINamespace("cronet")
/* loaded from: classes16.dex */
public class CronetUrlRequestContext extends org.chromium.net.impl.CronetEngineBase {
    static final java.lang.String LOG_TAG = "CronetUrlRequestContext";
    private static final java.util.HashSet<java.lang.String> sInUseStoragePaths = new java.util.HashSet<>();
    private final java.util.concurrent.atomic.AtomicInteger mActiveRequestCount;
    private final int mCronetEngineId;
    private int mDownstreamThroughputKbps;
    private int mEffectiveConnectionType;
    private final boolean mEnableTelemetry;
    private final java.lang.Object mFinishedListenerLock;
    private final java.util.Map<org.chromium.net.RequestFinishedInfo.Listener, org.chromium.net.impl.VersionSafeCallbacks.RequestFinishedInfoListener> mFinishedListenerMap;
    private int mHttpRttMs;
    private final java.lang.String mInUseStoragePath;
    private final android.os.ConditionVariable mInitCompleted;
    private boolean mIsLogging;
    private boolean mIsStoppingNetLog;
    private final java.lang.Object mLock;
    private final org.chromium.net.impl.CronetLogger mLogger;
    private long mNetworkHandle;
    private final boolean mNetworkQualityEstimatorEnabled;
    private final java.lang.Object mNetworkQualityLock;
    private java.lang.Thread mNetworkThread;
    private final org.chromium.base.ObserverList<org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityRttListenerWrapper> mRttListenerList;
    private final java.util.concurrent.atomic.AtomicInteger mRunningRequestCount;
    private final android.os.ConditionVariable mStopNetLogCompleted;
    private final org.chromium.base.ObserverList<org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> mThroughputListenerList;
    private int mTransportRttMs;
    private long mUrlRequestContextAdapter;

    /* loaded from: classes16.dex */
    public interface Natives {
        void addPkp(long j17, java.lang.String str, byte[][] bArr, boolean z17, long j18);

        void addQuicHint(long j17, java.lang.String str, int i17, int i18);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetContextAdapter")
        void configureNetworkQualityEstimatorForTesting(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, boolean z17, boolean z18, boolean z19);

        long createRequestContextAdapter(long j17);

        long createRequestContextConfig(byte[] bArr);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetContextAdapter")
        void destroy(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetContextAdapter")
        boolean getEnableTelemetry(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext);

        byte[] getHistogramDeltas();

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetContextAdapter")
        void initRequestContextOnInitThread(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetContextAdapter")
        void provideRTTObservations(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, boolean z17);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetContextAdapter")
        void provideThroughputObservations(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, boolean z17);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetContextAdapter")
        void startNetLogToDisk(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, java.lang.String str, boolean z17, int i17);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetContextAdapter")
        boolean startNetLogToFile(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext, java.lang.String str, boolean z17);

        @org.chromium.base.annotations.NativeClassQualifiedName("CronetContextAdapter")
        void stopNetLog(long j17, org.chromium.net.impl.CronetUrlRequestContext cronetUrlRequestContext);
    }

    public CronetUrlRequestContext(org.chromium.net.impl.CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        boolean enableTelemetry;
        java.lang.Object obj = new java.lang.Object();
        this.mLock = obj;
        this.mInitCompleted = new android.os.ConditionVariable(false);
        this.mRunningRequestCount = new java.util.concurrent.atomic.AtomicInteger(0);
        this.mActiveRequestCount = new java.util.concurrent.atomic.AtomicInteger(0);
        this.mNetworkQualityLock = new java.lang.Object();
        this.mFinishedListenerLock = new java.lang.Object();
        this.mEffectiveConnectionType = 0;
        this.mHttpRttMs = -1;
        this.mTransportRttMs = -1;
        this.mDownstreamThroughputKbps = -1;
        org.chromium.base.ObserverList<org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityRttListenerWrapper> observerList = new org.chromium.base.ObserverList<>();
        this.mRttListenerList = observerList;
        org.chromium.base.ObserverList<org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> observerList2 = new org.chromium.base.ObserverList<>();
        this.mThroughputListenerList = observerList2;
        this.mFinishedListenerMap = new java.util.HashMap();
        this.mStopNetLogCompleted = new android.os.ConditionVariable();
        this.mNetworkHandle = -1L;
        this.mCronetEngineId = hashCode();
        observerList.disableThreadAsserts();
        observerList2.disableThreadAsserts();
        this.mNetworkQualityEstimatorEnabled = cronetEngineBuilderImpl.networkQualityEstimatorEnabled();
        org.chromium.net.impl.CronetLibraryLoader.ensureInitialized(cronetEngineBuilderImpl.getContext(), cronetEngineBuilderImpl);
        if (cronetEngineBuilderImpl.httpCacheMode() == 1) {
            java.lang.String storagePath = cronetEngineBuilderImpl.storagePath();
            this.mInUseStoragePath = storagePath;
            java.util.HashSet<java.lang.String> hashSet = sInUseStoragePaths;
            synchronized (hashSet) {
                if (!hashSet.add(storagePath)) {
                    throw new java.lang.IllegalStateException("Disk cache storage path already in use");
                }
            }
        } else {
            this.mInUseStoragePath = null;
        }
        synchronized (obj) {
            long createRequestContextAdapter = org.chromium.net.impl.CronetUrlRequestContextJni.get().createRequestContextAdapter(createNativeUrlRequestContextConfig(cronetEngineBuilderImpl));
            this.mUrlRequestContextAdapter = createRequestContextAdapter;
            if (createRequestContextAdapter == 0) {
                throw new java.lang.NullPointerException("Context Adapter creation failed.");
            }
            enableTelemetry = org.chromium.net.impl.CronetUrlRequestContextJni.get().getEnableTelemetry(this.mUrlRequestContextAdapter, this);
            this.mEnableTelemetry = enableTelemetry;
        }
        if (enableTelemetry) {
            this.mLogger = org.chromium.net.impl.CronetLoggerFactory.createLogger(cronetEngineBuilderImpl.getContext(), getCronetSource());
        } else {
            this.mLogger = org.chromium.net.impl.CronetLoggerFactory.createNoOpLogger();
        }
        try {
            this.mLogger.logCronetEngineCreation(getCronetEngineId(), new org.chromium.net.impl.CronetLogger.CronetEngineBuilderInfo(cronetEngineBuilderImpl), buildCronetVersion(), getCronetSource());
        } catch (java.lang.RuntimeException e17) {
            org.chromium.base.Log.e(LOG_TAG, "Error while trying to log CronetEngine creation: ", (java.lang.Throwable) e17);
        }
        org.chromium.net.impl.CronetLibraryLoader.postToInitThread(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.1
            @Override // java.lang.Runnable
            public void run() {
                org.chromium.net.impl.CronetLibraryLoader.ensureInitializedOnInitThread();
                synchronized (org.chromium.net.impl.CronetUrlRequestContext.this.mLock) {
                    org.chromium.net.impl.CronetUrlRequestContextJni.get().initRequestContextOnInitThread(org.chromium.net.impl.CronetUrlRequestContext.this.mUrlRequestContextAdapter, org.chromium.net.impl.CronetUrlRequestContext.this);
                }
            }
        });
    }

    private org.chromium.net.impl.CronetLogger.CronetVersion buildCronetVersion() {
        return new org.chromium.net.impl.CronetLogger.CronetVersion(getVersionString().split("/")[1].split("@")[0]);
    }

    private void checkHaveAdapter() {
        if (!haveRequestContextAdapter()) {
            throw new java.lang.IllegalStateException("Engine is shut down.");
        }
    }

    private static int convertConnectionTypeToApiValue(int i17) {
        if (i17 == 0) {
            return 0;
        }
        int i18 = 1;
        if (i17 != 1) {
            i18 = 2;
            if (i17 != 2) {
                i18 = 3;
                if (i17 != 3) {
                    i18 = 4;
                    if (i17 != 4) {
                        if (i17 == 5) {
                            return 5;
                        }
                        throw new java.lang.RuntimeException("Internal Error: Illegal EffectiveConnectionType value " + i17);
                    }
                }
            }
        }
        return i18;
    }

    public static long createNativeUrlRequestContextConfig(org.chromium.net.impl.CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        long createRequestContextConfig = org.chromium.net.impl.CronetUrlRequestContextJni.get().createRequestContextConfig(createRequestContextConfigOptions(cronetEngineBuilderImpl).toByteArray());
        if (createRequestContextConfig == 0) {
            throw new java.lang.IllegalArgumentException("Experimental options parsing failed.");
        }
        for (org.chromium.net.impl.CronetEngineBuilderImpl.QuicHint quicHint : cronetEngineBuilderImpl.quicHints()) {
            org.chromium.net.impl.CronetUrlRequestContextJni.get().addQuicHint(createRequestContextConfig, quicHint.mHost, quicHint.mPort, quicHint.mAlternatePort);
        }
        for (org.chromium.net.impl.CronetEngineBuilderImpl.Pkp pkp : cronetEngineBuilderImpl.publicKeyPins()) {
            org.chromium.net.impl.CronetUrlRequestContextJni.get().addPkp(createRequestContextConfig, pkp.mHost, pkp.mHashes, pkp.mIncludeSubdomains, pkp.mExpirationDate.getTime());
        }
        return createRequestContextConfig;
    }

    private static org.chromium.net.RequestContextConfigOptions createRequestContextConfigOptions(org.chromium.net.impl.CronetEngineBuilderImpl cronetEngineBuilderImpl) {
        org.chromium.net.RequestContextConfigOptions.Builder networkThreadPriority = org.chromium.net.RequestContextConfigOptions.newBuilder().setQuicEnabled(cronetEngineBuilderImpl.quicEnabled()).setHttp2Enabled(cronetEngineBuilderImpl.http2Enabled()).setBrotliEnabled(cronetEngineBuilderImpl.brotliEnabled()).setDisableCache(cronetEngineBuilderImpl.cacheDisabled()).setHttpCacheMode(cronetEngineBuilderImpl.httpCacheMode()).setHttpCacheMaxSize(cronetEngineBuilderImpl.httpCacheMaxSize()).setMockCertVerifier(cronetEngineBuilderImpl.mockCertVerifier()).setEnableNetworkQualityEstimator(cronetEngineBuilderImpl.networkQualityEstimatorEnabled()).setBypassPublicKeyPinningForLocalTrustAnchors(cronetEngineBuilderImpl.publicKeyPinningBypassForLocalTrustAnchorsEnabled()).setNetworkThreadPriority(cronetEngineBuilderImpl.threadPriority(10));
        if (cronetEngineBuilderImpl.getUserAgent() != null) {
            networkThreadPriority.setUserAgent(cronetEngineBuilderImpl.getUserAgent());
        }
        if (cronetEngineBuilderImpl.storagePath() != null) {
            networkThreadPriority.setStoragePath(cronetEngineBuilderImpl.storagePath());
        }
        if (cronetEngineBuilderImpl.getDefaultQuicUserAgentId() != null) {
            networkThreadPriority.setQuicDefaultUserAgentId(cronetEngineBuilderImpl.getDefaultQuicUserAgentId());
        }
        if (cronetEngineBuilderImpl.experimentalOptions() != null) {
            networkThreadPriority.setExperimentalOptions(cronetEngineBuilderImpl.experimentalOptions());
        }
        return (org.chromium.net.RequestContextConfigOptions) networkThreadPriority.build();
    }

    public static org.chromium.net.impl.CronetLogger.CronetSource getCronetSource() {
        java.lang.ClassLoader classLoader = org.chromium.net.impl.CronetUrlRequest.class.getClassLoader();
        return classLoader.toString().startsWith("java.lang.BootClassLoader") ? org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLATFORM : org.chromium.net.CronetEngine.class.getClassLoader().equals(classLoader) ? org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_STATICALLY_LINKED : org.chromium.net.impl.CronetLogger.CronetSource.CRONET_SOURCE_PLAY_SERVICES;
    }

    private boolean haveRequestContextAdapter() {
        return this.mUrlRequestContextAdapter != 0;
    }

    private void initNetworkThread() {
        this.mNetworkThread = java.lang.Thread.currentThread();
        this.mInitCompleted.open();
        java.lang.Thread.currentThread().setName("ChromiumNet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postObservationTaskToExecutor$0(java.lang.Runnable runnable, org.chromium.net.impl.RefCountDelegate refCountDelegate) {
        try {
            try {
                runnable.run();
                if (refCountDelegate == null) {
                    return;
                }
            } catch (java.lang.Exception e17) {
                org.chromium.base.Log.e(LOG_TAG, "Exception thrown from observation task", (java.lang.Throwable) e17);
                if (refCountDelegate == null) {
                    return;
                }
            }
            refCountDelegate.decrement();
        } catch (java.lang.Throwable th6) {
            if (refCountDelegate != null) {
                refCountDelegate.decrement();
            }
            throw th6;
        }
    }

    private void onEffectiveConnectionTypeChanged(int i17) {
        synchronized (this.mNetworkQualityLock) {
            this.mEffectiveConnectionType = i17;
        }
    }

    private void onRTTOrThroughputEstimatesComputed(int i17, int i18, int i19) {
        synchronized (this.mNetworkQualityLock) {
            this.mHttpRttMs = i17;
            this.mTransportRttMs = i18;
            this.mDownstreamThroughputKbps = i19;
        }
    }

    private void onRttObservation(final int i17, final long j17, final int i18) {
        synchronized (this.mNetworkQualityLock) {
            java.util.Iterator<org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityRttListenerWrapper> it = this.mRttListenerList.iterator();
            while (it.hasNext()) {
                final org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityRttListenerWrapper next = it.next();
                postObservationTaskToExecutor(next.getExecutor(), new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.2
                    @Override // java.lang.Runnable
                    public void run() {
                        next.onRttObservation(i17, j17, i18);
                    }
                });
            }
        }
    }

    private void onThroughputObservation(final int i17, final long j17, final int i18) {
        synchronized (this.mNetworkQualityLock) {
            java.util.Iterator<org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper> it = this.mThroughputListenerList.iterator();
            while (it.hasNext()) {
                final org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper next = it.next();
                postObservationTaskToExecutor(next.getExecutor(), new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.3
                    @Override // java.lang.Runnable
                    public void run() {
                        next.onThroughputObservation(i17, j17, i18);
                    }
                });
            }
        }
    }

    private static void postObservationTaskToExecutor(java.util.concurrent.Executor executor, final java.lang.Runnable runnable, final org.chromium.net.impl.RefCountDelegate refCountDelegate) {
        if (refCountDelegate != null) {
            refCountDelegate.increment();
        }
        try {
            executor.execute(new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext$$a
                @Override // java.lang.Runnable
                public final void run() {
                    org.chromium.net.impl.CronetUrlRequestContext.lambda$postObservationTaskToExecutor$0(runnable, refCountDelegate);
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e17) {
            if (refCountDelegate != null) {
                refCountDelegate.decrement();
            }
            org.chromium.base.Log.e(LOG_TAG, "Exception posting task to executor", (java.lang.Throwable) e17);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.put(listener, new org.chromium.net.impl.VersionSafeCallbacks.RequestFinishedInfoListener(listener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mRttListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    org.chromium.net.impl.CronetUrlRequestContextJni.get().provideRTTObservations(this.mUrlRequestContextAdapter, this, true);
                }
            }
            this.mRttListenerList.addObserver(new org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityRttListenerWrapper(networkQualityRttListener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void addThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mThroughputListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    org.chromium.net.impl.CronetUrlRequestContextJni.get().provideThroughputObservations(this.mUrlRequestContextAdapter, this, true);
                }
            }
            this.mThroughputListenerList.addObserver(new org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper(networkQualityThroughputListener));
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void bindToNetwork(long j17) {
        this.mNetworkHandle = j17;
    }

    @Override // org.chromium.net.CronetEngine
    public void configureNetworkQualityEstimatorForTesting(boolean z17, boolean z18, boolean z19) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mLock) {
            checkHaveAdapter();
            org.chromium.net.impl.CronetUrlRequestContextJni.get().configureNetworkQualityEstimatorForTesting(this.mUrlRequestContextAdapter, this, z17, z18, z19);
        }
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public org.chromium.net.ExperimentalBidirectionalStream createBidirectionalStream(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor, java.lang.String str2, java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> list, int i17, boolean z17, java.util.Collection<java.lang.Object> collection, boolean z18, int i18, boolean z19, int i19, long j17) {
        long j18 = j17 == -1 ? this.mNetworkHandle : j17;
        synchronized (this.mLock) {
            try {
                try {
                    checkHaveAdapter();
                    return new org.chromium.net.impl.CronetBidirectionalStream(this, str, i17, callback, executor, str2, list, z17, collection, z18, i18, z19, i19, j18);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.impl.CronetEngineBase
    public org.chromium.net.impl.UrlRequestBase createRequest(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor, int i17, java.util.Collection<java.lang.Object> collection, boolean z17, boolean z18, boolean z19, boolean z27, int i18, boolean z28, int i19, org.chromium.net.RequestFinishedInfo.Listener listener, int i27, long j17) {
        long j18 = j17 == -1 ? this.mNetworkHandle : j17;
        synchronized (this.mLock) {
            try {
                try {
                    checkHaveAdapter();
                    return new org.chromium.net.impl.CronetUrlRequest(this, str, i17, callback, executor, collection, z17, z18, z19, z27, i18, z28, i19, listener, i27, j18);
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    throw th;
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
                throw th;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public java.net.URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return new org.chromium.net.urlconnection.CronetURLStreamHandlerFactory(this);
    }

    @Override // org.chromium.net.CronetEngine
    public int getActiveRequestCount() {
        return this.mActiveRequestCount.get();
    }

    public int getCronetEngineId() {
        return this.mCronetEngineId;
    }

    public org.chromium.net.impl.CronetLogger getCronetLogger() {
        return this.mLogger;
    }

    @Override // org.chromium.net.CronetEngine
    public int getDownstreamThroughputKbps() {
        int i17;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i17 = this.mDownstreamThroughputKbps;
            if (i17 == -1) {
                i17 = -1;
            }
        }
        return i17;
    }

    @Override // org.chromium.net.CronetEngine
    public int getEffectiveConnectionType() {
        int convertConnectionTypeToApiValue;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            convertConnectionTypeToApiValue = convertConnectionTypeToApiValue(this.mEffectiveConnectionType);
        }
        return convertConnectionTypeToApiValue;
    }

    public boolean getEnableTelemetryForTesting() {
        return this.mEnableTelemetry;
    }

    @Override // org.chromium.net.CronetEngine
    public byte[] getGlobalMetricsDeltas() {
        return org.chromium.net.impl.CronetUrlRequestContextJni.get().getHistogramDeltas();
    }

    @Override // org.chromium.net.CronetEngine
    public int getHttpRttMs() {
        int i17;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i17 = this.mHttpRttMs;
            if (i17 == -1) {
                i17 = -1;
            }
        }
        return i17;
    }

    @Override // org.chromium.net.CronetEngine
    public int getTransportRttMs() {
        int i17;
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            i17 = this.mTransportRttMs;
            if (i17 == -1) {
                i17 = -1;
            }
        }
        return i17;
    }

    public long getUrlRequestContextAdapter() {
        long j17;
        synchronized (this.mLock) {
            checkHaveAdapter();
            j17 = this.mUrlRequestContextAdapter;
        }
        return j17;
    }

    @Override // org.chromium.net.CronetEngine
    public java.lang.String getVersionString() {
        return "Cronet/" + org.chromium.net.impl.ImplVersion.getCronetVersionWithLastChange();
    }

    public boolean hasRequestFinishedListener() {
        boolean z17;
        synchronized (this.mFinishedListenerLock) {
            z17 = !this.mFinishedListenerMap.isEmpty();
        }
        return z17;
    }

    public boolean isNetworkThread(java.lang.Thread thread) {
        return thread == this.mNetworkThread;
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public /* bridge */ /* synthetic */ org.chromium.net.UrlRequest.Builder newUrlRequestBuilder(java.lang.String str, org.chromium.net.UrlRequest.Callback callback, java.util.concurrent.Executor executor) {
        return super.newUrlRequestBuilder(str, callback, executor);
    }

    public void onRequestDestroyed() {
        this.mRunningRequestCount.decrementAndGet();
    }

    public void onRequestFinished() {
        this.mActiveRequestCount.decrementAndGet();
    }

    public void onRequestStarted() {
        this.mActiveRequestCount.incrementAndGet();
        this.mRunningRequestCount.incrementAndGet();
    }

    @Override // org.chromium.net.CronetEngine
    public java.net.URLConnection openConnection(java.net.URL url) {
        return openConnection(url, java.net.Proxy.NO_PROXY);
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRequestFinishedListener(org.chromium.net.RequestFinishedInfo.Listener listener) {
        synchronized (this.mFinishedListenerLock) {
            this.mFinishedListenerMap.remove(listener);
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void removeRttListener(org.chromium.net.NetworkQualityRttListener networkQualityRttListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mRttListenerList.removeObserver(new org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityRttListenerWrapper(networkQualityRttListener)) && this.mRttListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    org.chromium.net.impl.CronetUrlRequestContextJni.get().provideRTTObservations(this.mUrlRequestContextAdapter, this, false);
                }
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void removeThroughputListener(org.chromium.net.NetworkQualityThroughputListener networkQualityThroughputListener) {
        if (!this.mNetworkQualityEstimatorEnabled) {
            throw new java.lang.IllegalStateException("Network quality estimator must be enabled");
        }
        synchronized (this.mNetworkQualityLock) {
            if (this.mThroughputListenerList.removeObserver(new org.chromium.net.impl.VersionSafeCallbacks.NetworkQualityThroughputListenerWrapper(networkQualityThroughputListener)) && this.mThroughputListenerList.isEmpty()) {
                synchronized (this.mLock) {
                    checkHaveAdapter();
                    org.chromium.net.impl.CronetUrlRequestContextJni.get().provideThroughputObservations(this.mUrlRequestContextAdapter, this, false);
                }
            }
        }
    }

    public void reportRequestFinished(final org.chromium.net.RequestFinishedInfo requestFinishedInfo, org.chromium.net.impl.RefCountDelegate refCountDelegate) {
        synchronized (this.mFinishedListenerLock) {
            if (this.mFinishedListenerMap.isEmpty()) {
                return;
            }
            java.util.Iterator it = new java.util.ArrayList(this.mFinishedListenerMap.values()).iterator();
            while (it.hasNext()) {
                final org.chromium.net.impl.VersionSafeCallbacks.RequestFinishedInfoListener requestFinishedInfoListener = (org.chromium.net.impl.VersionSafeCallbacks.RequestFinishedInfoListener) it.next();
                postObservationTaskToExecutor(requestFinishedInfoListener.getExecutor(), new java.lang.Runnable() { // from class: org.chromium.net.impl.CronetUrlRequestContext.4
                    @Override // java.lang.Runnable
                    public void run() {
                        requestFinishedInfoListener.onRequestFinished(requestFinishedInfo);
                    }
                }, refCountDelegate);
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void shutdown() {
        if (this.mInUseStoragePath != null) {
            java.util.HashSet<java.lang.String> hashSet = sInUseStoragePaths;
            synchronized (hashSet) {
                hashSet.remove(this.mInUseStoragePath);
            }
        }
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mRunningRequestCount.get() != 0) {
                throw new java.lang.IllegalStateException("Cannot shutdown with running requests.");
            }
            if (java.lang.Thread.currentThread() == this.mNetworkThread) {
                throw new java.lang.IllegalThreadStateException("Cannot shutdown from network thread.");
            }
        }
        this.mInitCompleted.block();
        stopNetLog();
        synchronized (this.mLock) {
            if (haveRequestContextAdapter()) {
                org.chromium.net.impl.CronetUrlRequestContextJni.get().destroy(this.mUrlRequestContextAdapter, this);
                this.mUrlRequestContextAdapter = 0L;
            }
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToDisk(java.lang.String str, boolean z17, int i17) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mIsLogging) {
                return;
            }
            org.chromium.net.impl.CronetUrlRequestContextJni.get().startNetLogToDisk(this.mUrlRequestContextAdapter, this, str, z17, i17);
            this.mIsLogging = true;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void startNetLogToFile(java.lang.String str, boolean z17) {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mIsLogging) {
                return;
            }
            if (!org.chromium.net.impl.CronetUrlRequestContextJni.get().startNetLogToFile(this.mUrlRequestContextAdapter, this, str, z17)) {
                throw new java.lang.RuntimeException("Unable to start NetLog");
            }
            this.mIsLogging = true;
        }
    }

    @Override // org.chromium.net.CronetEngine
    public void stopNetLog() {
        synchronized (this.mLock) {
            checkHaveAdapter();
            if (this.mIsLogging && !this.mIsStoppingNetLog) {
                org.chromium.net.impl.CronetUrlRequestContextJni.get().stopNetLog(this.mUrlRequestContextAdapter, this);
                this.mIsStoppingNetLog = true;
                this.mStopNetLogCompleted.block();
                this.mStopNetLogCompleted.close();
                synchronized (this.mLock) {
                    this.mIsStoppingNetLog = false;
                    this.mIsLogging = false;
                }
            }
        }
    }

    public void stopNetLogCompleted() {
        this.mStopNetLogCompleted.open();
    }

    @Override // org.chromium.net.impl.CronetEngineBase, org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public org.chromium.net.ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(java.lang.String str, org.chromium.net.BidirectionalStream.Callback callback, java.util.concurrent.Executor executor) {
        return new org.chromium.net.impl.BidirectionalStreamBuilderImpl(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public java.net.URLConnection openConnection(java.net.URL url, java.net.Proxy proxy) {
        if (proxy.type() == java.net.Proxy.Type.DIRECT) {
            java.lang.String protocol = url.getProtocol();
            if (!"http".equals(protocol) && !"https".equals(protocol)) {
                throw new java.lang.UnsupportedOperationException("Unexpected protocol:" + protocol);
            }
            return new org.chromium.net.urlconnection.CronetHttpURLConnection(url, this);
        }
        throw new java.lang.UnsupportedOperationException();
    }

    private static void postObservationTaskToExecutor(java.util.concurrent.Executor executor, java.lang.Runnable runnable) {
        postObservationTaskToExecutor(executor, runnable, null);
    }
}
