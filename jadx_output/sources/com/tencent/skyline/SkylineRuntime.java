package com.tencent.skyline;

/* loaded from: classes7.dex */
public class SkylineRuntime implements com.tencent.skyline.ISkylineRuntimeFromNative, com.tencent.skyline.ISkylineRuntimeToNative {
    private com.tencent.skyline.IRouteBackCallback mRouteBackCallback;
    private com.tencent.skyline.IWindowDestroyCallback sWindowDestroy;
    private com.tencent.skyline.IWindowReadyCallback sWindowReady;
    private com.tencent.skyline.ISkylineMapHandler skylineMapHandler;
    private final java.lang.String TAG = "SkylineRuntime";
    private long runtimeHolderPtr = 0;
    private long runtimeDelegatePtr = 0;
    private com.tencent.skyline.jni.NativeHandler nativeHandler = new com.tencent.skyline.jni.NativeHandler();
    private com.tencent.skyline.jni.SkylineResourceLoader resourceLoader = new com.tencent.skyline.jni.SkylineResourceLoader();
    private com.tencent.skyline.jni.SkylineFileSystem skylineFileSystem = new com.tencent.skyline.jni.SkylineFileSystem();
    private volatile boolean isInit = false;
    private java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.tencent.skyline.IRouteDoneCallback> routeDoneCallbacks = new java.util.concurrent.ConcurrentHashMap<>();
    private java.util.concurrent.atomic.AtomicInteger taskId = new java.util.concurrent.atomic.AtomicInteger();
    private final java.lang.Object syncBootstrapObject = new java.lang.Object();
    private volatile boolean isBootstrapDone = false;
    private volatile java.util.ArrayList<com.tencent.skyline.IBootstrapDoneCallback> mBootstrapDoneCallbacks = new java.util.ArrayList<>();
    private final java.lang.Object syncWindowObject = new java.lang.Object();
    private volatile java.util.ArrayList<java.lang.Integer> windowReadyIds = new java.util.ArrayList<>();
    private volatile java.util.HashMap<java.lang.Integer, java.util.ArrayList<com.tencent.skyline.IWindowReadyCallback>> windowReadyCallbacks = new java.util.HashMap<>();
    private boolean needCreateRuntime = true;
    private final android.util.SparseArray<com.tencent.skyline.ISkylineScrollViewChange> skylineScrollViewChangeMap = new android.util.SparseArray<>();

    private boolean checkAndRun(com.tencent.skyline.IBootstrapDoneCallback iBootstrapDoneCallback) {
        if (this.isInit) {
            if (!this.isBootstrapDone) {
                return false;
            }
            iBootstrapDoneCallback.onDone();
            return true;
        }
        com.tencent.skyline.SkylineLog.e("SkylineRuntime", "waitForBootstrap fail, stack: " + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        return true;
    }

    private boolean checkAndRunForWindowReady(int i17, com.tencent.skyline.IWindowReadyCallback iWindowReadyCallback) {
        if (!this.windowReadyIds.contains(java.lang.Integer.valueOf(i17))) {
            return false;
        }
        iWindowReadyCallback.onWindowReady(i17);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeAppLaunch(long j17, int i17, int i18, com.tencent.skyline.PageConfig pageConfig);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeAutoReLaunch(long j17, int i17, int i18, com.tencent.skyline.PageConfig pageConfig);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeClearJSBindings(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeClearWorkletJSBindings(long j17);

    private native long nativeCreateRuntime(com.tencent.skyline.jni.NativeHandler nativeHandler, com.tencent.skyline.jni.SkylineResourceLoader skylineResourceLoader, com.tencent.skyline.jni.SkylineFileSystem skylineFileSystem);

    private native void nativeDestroyRuntime(long j17);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDestroyWindow(long j17, int i17);

    private native void nativeInitJsEngine(long j17, long j18, long j19, long j27);

    private native void nativeInitUITaskRunner(long j17, long j18);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeListenRootScrollViewChange(long j17, int i17);

    /* JADX INFO: Access modifiers changed from: private */
    public native int nativeNavigateBack(long j17, int i17, int i18, int i19, boolean z17, int i27);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeNavigateTo(long j17, int i17, int i18, int i19, com.tencent.skyline.PageConfig pageConfig);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeReLaunch(long j17, int i17, int i18, com.tencent.skyline.PageConfig pageConfig);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeRedirectTo(long j17, int i17, int i18, int i19, com.tencent.skyline.PageConfig pageConfig);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSwitchTab(long j17, int i17, int i18, com.tencent.skyline.PageConfig pageConfig);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUpdateAccessibilityEnable(long j17, boolean z17);

    private native void nativeUpdateKeyboardStatus(long j17, int i17, int i18, double d17, double d18, int i19, long j18);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUpdatePlatformBrightnessConfig(long j17, int i17, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeUpdateRuntimeInfo(long j17, int i17, com.tencent.skyline.jni.SkylineRuntimeInfo skylineRuntimeInfo);

    private native void nativeUpdateWindowViewport(long j17, int i17, float f17, float f18);

    public void addSkylineScrollViewChange(int i17, com.tencent.skyline.ISkylineScrollViewChange iSkylineScrollViewChange) {
        this.skylineScrollViewChangeMap.put(i17, iSkylineScrollViewChange);
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void appLaunch(final int i17, final int i18, final com.tencent.skyline.PageConfig pageConfig) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.6
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineRuntime.this.waitForWindowReady(i17, new com.tencent.skyline.IWindowReadyCallback() { // from class: com.tencent.skyline.SkylineRuntime.6.1
                    @Override // com.tencent.skyline.IWindowReadyCallback
                    public void onWindowReady(int i19) {
                        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " appLaunch id:" + i19 + " pageId:" + i18);
                        com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                        long j17 = skylineRuntime.runtimeDelegatePtr;
                        com.tencent.skyline.SkylineRuntime.AnonymousClass6 anonymousClass6 = com.tencent.skyline.SkylineRuntime.AnonymousClass6.this;
                        skylineRuntime.nativeAppLaunch(j17, i19, i18, pageConfig);
                    }
                });
            }
        });
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void autoReLaunch(final int i17, final int i18, final com.tencent.skyline.PageConfig pageConfig) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.7
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineRuntime.this.waitForWindowReady(i17, new com.tencent.skyline.IWindowReadyCallback() { // from class: com.tencent.skyline.SkylineRuntime.7.1
                    @Override // com.tencent.skyline.IWindowReadyCallback
                    public void onWindowReady(int i19) {
                        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " autoReLaunch id:" + i19 + " pageId:" + i18);
                        com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                        long j17 = skylineRuntime.runtimeDelegatePtr;
                        com.tencent.skyline.SkylineRuntime.AnonymousClass7 anonymousClass7 = com.tencent.skyline.SkylineRuntime.AnonymousClass7.this;
                        skylineRuntime.nativeAutoReLaunch(j17, i19, i18, pageConfig);
                    }
                });
            }
        });
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void clearJSBindings() {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.1
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                skylineRuntime.nativeClearJSBindings(skylineRuntime.runtimeDelegatePtr);
            }
        });
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void clearWorkletJSBindings() {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.2
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                skylineRuntime.nativeClearWorkletJSBindings(skylineRuntime.runtimeDelegatePtr);
            }
        });
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void destroyWindow(final int i17) {
        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " destroyWindow: " + i17);
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.10
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                synchronized (this) {
                    if (com.tencent.skyline.SkylineRuntime.this.runtimeDelegatePtr != 0) {
                        com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                        skylineRuntime.nativeDestroyWindow(skylineRuntime.runtimeDelegatePtr, i17);
                    }
                }
            }
        });
    }

    public void enableCronet(final boolean z17) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.12
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.jni.SkylineJNI.setEnableCronet(com.tencent.skyline.SkylineRuntime.this.runtimeDelegatePtr, z17);
            }
        });
    }

    public long getRuntimePtr() {
        return this.runtimeHolderPtr;
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void init() {
        synchronized (this) {
            this.runtimeHolderPtr = nativeCreateRuntime(this.nativeHandler, this.resourceLoader, this.skylineFileSystem);
            com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " init: " + this.runtimeHolderPtr);
            this.resourceLoader.init();
            this.skylineFileSystem.init();
            this.isInit = true;
        }
    }

    public void initFileSystem(com.tencent.skyline.jni.ISkylineFileSystem iSkylineFileSystem) {
        this.skylineFileSystem.initFileSystem(iSkylineFileSystem);
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void initJSEngine(long j17, long j18, long j19) {
        nativeInitJsEngine(this.runtimeHolderPtr, j17, j18, j19);
    }

    public void initMapHandler(com.tencent.skyline.ISkylineMapHandler iSkylineMapHandler) {
        this.skylineMapHandler = iSkylineMapHandler;
    }

    public void initNativeHandler(com.tencent.skyline.jni.INativeHandler iNativeHandler) {
        this.nativeHandler.init(iNativeHandler);
    }

    public void initResourceLoader(com.tencent.skyline.jni.ISkylineResourceLoader iSkylineResourceLoader) {
        this.resourceLoader.initResourceLoader(iSkylineResourceLoader);
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void initUITaskRunner(long j17) {
        nativeInitUITaskRunner(this.runtimeHolderPtr, j17);
    }

    public void listenRootScrollViewChange(final int i17) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.16
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " listenRootScrollViewChange windowId:" + i17);
                com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                skylineRuntime.nativeListenRootScrollViewChange(skylineRuntime.runtimeDelegatePtr, i17);
            }
        });
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public int navigateBack(final int i17, final int i18, final int i19, final boolean z17, final com.tencent.skyline.IRouteDoneCallback iRouteDoneCallback) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.5
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineRuntime.this.waitForWindowReady(i17, new com.tencent.skyline.IWindowReadyCallback() { // from class: com.tencent.skyline.SkylineRuntime.5.1
                    @Override // com.tencent.skyline.IWindowReadyCallback
                    public void onWindowReady(int i27) {
                        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " navigateBack id:" + i27 + " pageId:" + i18);
                        int andIncrement = com.tencent.skyline.SkylineRuntime.this.taskId.getAndIncrement();
                        com.tencent.skyline.SkylineRuntime.this.routeDoneCallbacks.put(java.lang.Integer.valueOf(andIncrement), iRouteDoneCallback);
                        com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                        long j17 = skylineRuntime.runtimeDelegatePtr;
                        com.tencent.skyline.SkylineRuntime.AnonymousClass5 anonymousClass5 = com.tencent.skyline.SkylineRuntime.AnonymousClass5.this;
                        skylineRuntime.nativeNavigateBack(j17, i27, i18, i19, z17, andIncrement);
                    }
                });
            }
        });
        return 0;
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void navigateTo(final int i17, final int i18, final com.tencent.skyline.PageConfig pageConfig, final com.tencent.skyline.IRouteDoneCallback iRouteDoneCallback) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.3
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineRuntime.this.waitForWindowReady(i17, new com.tencent.skyline.IWindowReadyCallback() { // from class: com.tencent.skyline.SkylineRuntime.3.1
                    @Override // com.tencent.skyline.IWindowReadyCallback
                    public void onWindowReady(int i19) {
                        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " navigateTo id:" + i19 + " pageId:" + i18);
                        int andIncrement = com.tencent.skyline.SkylineRuntime.this.taskId.getAndIncrement();
                        com.tencent.skyline.SkylineRuntime.this.routeDoneCallbacks.put(java.lang.Integer.valueOf(andIncrement), iRouteDoneCallback);
                        com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                        long j17 = skylineRuntime.runtimeDelegatePtr;
                        com.tencent.skyline.SkylineRuntime.AnonymousClass3 anonymousClass3 = com.tencent.skyline.SkylineRuntime.AnonymousClass3.this;
                        skylineRuntime.nativeNavigateTo(j17, i19, i18, andIncrement, pageConfig);
                    }
                });
            }
        });
    }

    public boolean needCreateRuntime() {
        boolean z17;
        synchronized (this.syncWindowObject) {
            z17 = this.needCreateRuntime;
        }
        return z17;
    }

    @Override // com.tencent.skyline.ISkylineRuntimeFromNative
    public void notifyBack(int i17, int i18) {
        com.tencent.skyline.IRouteBackCallback iRouteBackCallback = this.mRouteBackCallback;
        if (iRouteBackCallback != null) {
            iRouteBackCallback.onBack(i17, i18);
        }
    }

    @Override // com.tencent.skyline.ISkylineRuntimeFromNative
    public void notifyBackDone(int i17, int i18) {
        com.tencent.skyline.IRouteBackCallback iRouteBackCallback = this.mRouteBackCallback;
        if (iRouteBackCallback != null) {
            iRouteBackCallback.onBackDone(i17, i18);
        }
    }

    @Override // com.tencent.skyline.ISkylineRuntimeFromNative
    public void notifyBootstrapDone(long j17) {
        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " notifyBootstrapDone " + j17);
        this.runtimeDelegatePtr = j17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.syncBootstrapObject) {
            this.isBootstrapDone = true;
            arrayList.addAll(this.mBootstrapDoneCallbacks);
            this.mBootstrapDoneCallbacks.clear();
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.skyline.IBootstrapDoneCallback iBootstrapDoneCallback = (com.tencent.skyline.IBootstrapDoneCallback) it.next();
            if (iBootstrapDoneCallback != null) {
                iBootstrapDoneCallback.onDone();
            }
        }
    }

    public void notifyRootScrollViewChange(int i17, double d17, double d18, double d19, double d27, double d28, double d29) {
        com.tencent.skyline.ISkylineScrollViewChange iSkylineScrollViewChange = this.skylineScrollViewChangeMap.get(i17);
        if (iSkylineScrollViewChange != null) {
            iSkylineScrollViewChange.onScrollViewChange(d17, d18, d19, d27, d28, d29);
        }
    }

    @Override // com.tencent.skyline.ISkylineRuntimeFromNative
    public void notifyRouteDone(int i17) {
        com.tencent.skyline.IRouteDoneCallback remove = this.routeDoneCallbacks.remove(java.lang.Integer.valueOf(i17));
        if (remove != null) {
            remove.onDone();
        }
    }

    @Override // com.tencent.skyline.ISkylineRuntimeFromNative
    public void notifyWindowDestroy(int i17) {
        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " notifyWindowDestroy: " + i17);
        com.tencent.skyline.IWindowDestroyCallback iWindowDestroyCallback = this.sWindowDestroy;
        if (iWindowDestroyCallback != null) {
            iWindowDestroyCallback.onWindowDestroy(i17);
        }
        synchronized (this.syncWindowObject) {
            this.windowReadyIds.remove(java.lang.Integer.valueOf(i17));
            this.windowReadyCallbacks.remove(java.lang.Integer.valueOf(i17));
        }
    }

    @Override // com.tencent.skyline.ISkylineRuntimeFromNative
    public void notifyWindowReady(int i17) {
        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " notifyWindowReady: " + i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        synchronized (this.syncWindowObject) {
            this.needCreateRuntime = false;
            this.windowReadyIds.add(java.lang.Integer.valueOf(i17));
            if (this.windowReadyCallbacks.get(java.lang.Integer.valueOf(i17)) != null) {
                arrayList.addAll(this.windowReadyCallbacks.get(java.lang.Integer.valueOf(i17)));
                this.windowReadyCallbacks.remove(java.lang.Integer.valueOf(i17));
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.skyline.IWindowReadyCallback) it.next()).onWindowReady(i17);
        }
        com.tencent.skyline.IWindowReadyCallback iWindowReadyCallback = this.sWindowReady;
        if (iWindowReadyCallback != null) {
            iWindowReadyCallback.onWindowReady(i17);
        }
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void reLaunch(final int i17, final int i18, final com.tencent.skyline.PageConfig pageConfig) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.8
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineRuntime.this.waitForWindowReady(i17, new com.tencent.skyline.IWindowReadyCallback() { // from class: com.tencent.skyline.SkylineRuntime.8.1
                    @Override // com.tencent.skyline.IWindowReadyCallback
                    public void onWindowReady(int i19) {
                        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " reLaunch id:" + i19 + " pageId:" + i18);
                        com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                        long j17 = skylineRuntime.runtimeDelegatePtr;
                        com.tencent.skyline.SkylineRuntime.AnonymousClass8 anonymousClass8 = com.tencent.skyline.SkylineRuntime.AnonymousClass8.this;
                        skylineRuntime.nativeReLaunch(j17, i19, i18, pageConfig);
                    }
                });
            }
        });
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void redirectTo(final int i17, final int i18, final com.tencent.skyline.PageConfig pageConfig, final com.tencent.skyline.IRouteDoneCallback iRouteDoneCallback) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.4
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineRuntime.this.waitForWindowReady(i17, new com.tencent.skyline.IWindowReadyCallback() { // from class: com.tencent.skyline.SkylineRuntime.4.1
                    @Override // com.tencent.skyline.IWindowReadyCallback
                    public void onWindowReady(int i19) {
                        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " redirectTo id:" + i19 + " pageId:" + i18);
                        int andIncrement = com.tencent.skyline.SkylineRuntime.this.taskId.getAndIncrement();
                        com.tencent.skyline.SkylineRuntime.this.routeDoneCallbacks.put(java.lang.Integer.valueOf(andIncrement), iRouteDoneCallback);
                        com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                        long j17 = skylineRuntime.runtimeDelegatePtr;
                        com.tencent.skyline.SkylineRuntime.AnonymousClass4 anonymousClass4 = com.tencent.skyline.SkylineRuntime.AnonymousClass4.this;
                        skylineRuntime.nativeRedirectTo(j17, i19, i18, andIncrement, pageConfig);
                    }
                });
            }
        });
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void release() {
        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " release");
        synchronized (this) {
            this.isInit = false;
            this.resourceLoader.initResourceLoader(null);
            this.resourceLoader.release();
            this.skylineFileSystem.initFileSystem(null);
            this.skylineFileSystem.release();
            nativeDestroyRuntime(this.runtimeHolderPtr);
            this.runtimeHolderPtr = 0L;
            this.runtimeDelegatePtr = 0L;
            this.nativeHandler.init(null);
        }
        synchronized (this.syncBootstrapObject) {
            this.mBootstrapDoneCallbacks.clear();
        }
        synchronized (this.syncWindowObject) {
            this.sWindowReady = null;
            this.sWindowDestroy = null;
            this.windowReadyIds.clear();
            this.windowReadyCallbacks.clear();
        }
    }

    public void removeSkylineScrollViewChange(int i17, com.tencent.skyline.ISkylineScrollViewChange iSkylineScrollViewChange) {
        this.skylineScrollViewChangeMap.remove(i17);
    }

    @Override // com.tencent.skyline.ISkylineRuntimeToNative
    public void switchTab(final int i17, final int i18, final com.tencent.skyline.PageConfig pageConfig) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.9
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineRuntime.this.waitForWindowReady(i17, new com.tencent.skyline.IWindowReadyCallback() { // from class: com.tencent.skyline.SkylineRuntime.9.1
                    @Override // com.tencent.skyline.IWindowReadyCallback
                    public void onWindowReady(int i19) {
                        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " switchTab id:" + i19 + " pageId:" + i18);
                        com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                        long j17 = skylineRuntime.runtimeDelegatePtr;
                        com.tencent.skyline.SkylineRuntime.AnonymousClass9 anonymousClass9 = com.tencent.skyline.SkylineRuntime.AnonymousClass9.this;
                        skylineRuntime.nativeSwitchTab(j17, i19, i18, pageConfig);
                    }
                });
            }
        });
    }

    public void updateAccessibilityEnable(final boolean z17) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.14
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " update accessibility enable:" + z17);
                com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                skylineRuntime.nativeUpdateAccessibilityEnable(skylineRuntime.runtimeDelegatePtr, z17);
            }
        });
    }

    public void updateKeyboardStatus(int i17, int i18, double d17, double d18, int i19, long j17) {
        long j18 = this.runtimeDelegatePtr;
        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " updateKeyboardStatus(runtimeId:" + j18 + ", windowId:" + i17 + ", animStartPosition:" + d17 + ", animEndPosition:" + d18 + ", animDuration:" + i19 + ", timestamp:" + j17 + ")");
        if (j18 != 0) {
            nativeUpdateKeyboardStatus(j18, i17, i18, d17, d18, i19, j17);
        }
    }

    public void updateMapCustomCallout(int i17, long j17, double d17, double d18, int i18, byte[] bArr) {
        com.tencent.skyline.ISkylineMapHandler iSkylineMapHandler = this.skylineMapHandler;
        if (iSkylineMapHandler != null) {
            iSkylineMapHandler.updateMapCustomCallout(i17, j17, d17, d18, i18, bArr);
        }
    }

    public void updatePlatformBrightnessConfig(final int i17, final boolean z17) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.11
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " updatePlatformBrightnessConfig brightness:" + i17);
                com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                skylineRuntime.nativeUpdatePlatformBrightnessConfig(skylineRuntime.runtimeDelegatePtr, i17, z17);
            }
        });
    }

    public void updateRuntimeInfo(final int i17, final com.tencent.skyline.jni.SkylineRuntimeInfo skylineRuntimeInfo) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.15
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " updateRuntimeInfo windowId:" + i17 + " info:" + skylineRuntimeInfo);
                com.tencent.skyline.SkylineRuntime skylineRuntime = com.tencent.skyline.SkylineRuntime.this;
                skylineRuntime.nativeUpdateRuntimeInfo(skylineRuntime.runtimeDelegatePtr, i17, skylineRuntimeInfo);
            }
        });
    }

    public void updateWindowViewport(int i17, float f17, float f18) {
        long j17 = this.runtimeDelegatePtr;
        com.tencent.skyline.SkylineLog.i("SkylineRuntime", this + " updateWindowViewport(runtimeId:" + j17 + ", windowId:" + i17 + ", width:" + f17 + ", height:" + f18 + ")");
        if (j17 != 0) {
            nativeUpdateWindowViewport(j17, i17, f17, f18);
        }
    }

    @Override // com.tencent.skyline.ISkylineRuntimeFromNative
    public void waitForBack(com.tencent.skyline.IRouteBackCallback iRouteBackCallback) {
        this.mRouteBackCallback = iRouteBackCallback;
    }

    public void waitForBootstrap(com.tencent.skyline.IBootstrapDoneCallback iBootstrapDoneCallback) {
        if (checkAndRun(iBootstrapDoneCallback)) {
            return;
        }
        synchronized (this.syncBootstrapObject) {
            if (checkAndRun(iBootstrapDoneCallback)) {
                return;
            }
            this.mBootstrapDoneCallbacks.add(iBootstrapDoneCallback);
        }
    }

    public void waitForWindowDestroy(com.tencent.skyline.IWindowDestroyCallback iWindowDestroyCallback) {
        this.sWindowDestroy = iWindowDestroyCallback;
    }

    public void waitForWindowReady(com.tencent.skyline.IWindowReadyCallback iWindowReadyCallback) {
        this.sWindowReady = iWindowReadyCallback;
    }

    public void enableCronet(final boolean z17, final java.lang.String str, final java.lang.String str2) {
        waitForBootstrap(new com.tencent.skyline.IBootstrapDoneCallback() { // from class: com.tencent.skyline.SkylineRuntime.13
            @Override // com.tencent.skyline.IBootstrapDoneCallback
            public void onDone() {
                com.tencent.skyline.jni.SkylineJNI.setEnableCronet2(com.tencent.skyline.SkylineRuntime.this.runtimeDelegatePtr, z17, str, str2);
            }
        });
    }

    public void waitForWindowReady(int i17, com.tencent.skyline.IWindowReadyCallback iWindowReadyCallback) {
        if (checkAndRunForWindowReady(i17, iWindowReadyCallback)) {
            return;
        }
        synchronized (this.syncWindowObject) {
            if (checkAndRunForWindowReady(i17, iWindowReadyCallback)) {
                return;
            }
            if (this.windowReadyCallbacks.get(java.lang.Integer.valueOf(i17)) == null) {
                this.windowReadyCallbacks.put(java.lang.Integer.valueOf(i17), new java.util.ArrayList<>());
            }
            this.windowReadyCallbacks.get(java.lang.Integer.valueOf(i17)).add(iWindowReadyCallback);
        }
    }
}
