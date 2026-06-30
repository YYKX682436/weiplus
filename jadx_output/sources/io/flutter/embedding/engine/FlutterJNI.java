package io.flutter.embedding.engine;

/* loaded from: classes15.dex */
public class FlutterJNI {
    private static final java.lang.String TAG = "FlutterJNI";
    private static io.flutter.embedding.engine.FlutterJNI.AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static java.lang.String vmServiceUri;
    private io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate accessibilityDelegate;
    private io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager;
    private java.lang.String isolateGroupName;
    private io.flutter.plugin.localization.LocalizationPlugin localizationPlugin;
    private io.flutter.embedding.engine.TaskRunnerJNI mUITaskRunnerJNI;
    private java.lang.Long nativeShellHolderId;
    private io.flutter.embedding.engine.dart.PlatformMessageHandler platformMessageHandler;
    private io.flutter.plugin.platform.PlatformViewsController platformViewsController;
    private io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2;
    private java.util.concurrent.locks.ReentrantReadWriteLock shellHolderLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
    private boolean operateSurfaceOnBackground = true;
    private final java.util.Set<io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener> engineLifecycleListeners = new java.util.concurrent.CopyOnWriteArraySet();
    private final java.util.Set<io.flutter.embedding.engine.renderer.FlutterUiDisplayListener> flutterUiDisplayListeners = new java.util.concurrent.CopyOnWriteArraySet();
    private java.util.concurrent.Executor backgroundExecutor = new io.flutter.util.ImmediateExecutor();
    private final java.util.Set<io.flutter.embedding.engine.renderer.FlutterNextFrameDisplayListener> flutterNextFrameDisplayListeners = new java.util.concurrent.CopyOnWriteArraySet();
    private final java.util.Set<io.flutter.embedding.engine.renderer.FlutterPreRenderFinishedListener> flutterPreRenderFinishedListeners = new java.util.concurrent.CopyOnWriteArraySet();
    private io.flutter.embedding.engine.PreAttachTimingRecorder preAttachTimingRecorder = new io.flutter.embedding.engine.PreAttachTimingRecorder();
    private final android.os.Looper mainLooper = android.os.Looper.getMainLooper();

    /* loaded from: classes15.dex */
    public interface AccessibilityDelegate {
        void updateCustomAccessibilityActions(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr);

        void updateSemantics(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr);
    }

    /* loaded from: classes11.dex */
    public enum AppForegroundState {
        UNKNOWN,
        BACKGROUND,
        FLOAT_WINDOW_FOREGROUND,
        FOREGROUND
    }

    /* loaded from: classes14.dex */
    public interface AsyncWaitForVsyncDelegate {
        void asyncWaitForVsync(long j17);
    }

    /* loaded from: classes11.dex */
    public static class Factory {
        public io.flutter.embedding.engine.FlutterJNI provideFlutterJNI() {
            return new io.flutter.embedding.engine.FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j17) {
        io.flutter.embedding.engine.FlutterJNI.AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2 = asyncWaitForVsyncDelegate;
        if (asyncWaitForVsyncDelegate2 == null) {
            throw new java.lang.IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        asyncWaitForVsyncDelegate2.asyncWaitForVsync(j17);
    }

    public static android.graphics.Bitmap decodeImage(java.nio.ByteBuffer byteBuffer, final long j17) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            try {
                return android.graphics.ImageDecoder.decodeBitmap(android.graphics.ImageDecoder.createSource(byteBuffer), new android.graphics.ImageDecoder.OnHeaderDecodedListener() { // from class: io.flutter.embedding.engine.FlutterJNI$$a
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
                        io.flutter.embedding.engine.FlutterJNI.lambda$decodeImage$1(j17, imageDecoder, imageInfo, source);
                    }
                });
            } catch (java.io.IOException e17) {
                io.flutter.Log.e(TAG, "Failed to decode image", e17);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new java.lang.RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new java.lang.RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (android.os.Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new java.lang.RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + java.lang.Thread.currentThread().getName());
    }

    public static java.lang.String getVMServiceUri() {
        return vmServiceUri;
    }

    public static int getVulkanTestResult() {
        return nativeGetVulkanTestResult();
    }

    private void handlePlatformMessageResponse(int i17, java.nio.ByteBuffer byteBuffer) {
        io.flutter.embedding.engine.dart.PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handlePlatformMessageResponse(i17, byteBuffer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$decodeImage$1(long j17, android.graphics.ImageDecoder imageDecoder, android.graphics.ImageDecoder.ImageInfo imageInfo, android.graphics.ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        android.util.Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j17, size.getWidth(), size.getHeight());
    }

    public static native void nativeAfterInit();

    private native long nativeAttach(io.flutter.embedding.engine.FlutterJNI flutterJNI, long j17, java.lang.String str);

    private native long nativeAttachNotInMainThread(io.flutter.embedding.engine.FlutterJNI flutterJNI, long j17, java.lang.String str);

    private native boolean nativeCanPreRender(long j17);

    private native void nativeCheckLeak(long j17);

    private native void nativeCleanupMessageData(long j17);

    private native void nativeClearCurrentSurface(long j17);

    private native void nativeDeferredComponentInstallFailure(int i17, java.lang.String str, boolean z17);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDestroy(long j17);

    private native void nativeDispatchEmptyPlatformMessage(long j17, java.lang.String str, int i17);

    private native void nativeDispatchPlatformMessage(long j17, java.lang.String str, java.nio.ByteBuffer byteBuffer, int i17, int i18);

    private native void nativeDispatchPointerDataPacket(long j17, java.nio.ByteBuffer byteBuffer, int i17);

    private native void nativeDispatchSemanticsAction(long j17, int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19);

    private native void nativeDumpGPUMemoryStatistics(long j17, boolean z17);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i17);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i17);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i17);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i17);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i17);

    private native android.graphics.Bitmap nativeGetBitmap(long j17);

    private native long nativeGetGPUMemoryUsageInBytes(long j17);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native int nativeGetVulkanTestResult();

    public static native void nativeImageHeaderCallback(long j17, int i17, int i18);

    private static native void nativeInit(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, boolean z17);

    private static native void nativeInitNotInMainThread(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17);

    private native void nativeInstallNextFrameCallback(long j17);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j17, int i17);

    private native void nativeInvokePlatformMessageResponseCallback(long j17, int i17, java.nio.ByteBuffer byteBuffer, int i18);

    private native boolean nativeIsSurfaceControlEnabled(long j17);

    private native void nativeLoadDartDeferredLibrary(long j17, int i17, java.lang.String[] strArr);

    @java.lang.Deprecated
    public static native io.flutter.view.FlutterCallbackInformation nativeLookupCallbackInformation(long j17);

    private native void nativeMarkFlutterViewDraw(long j17);

    private native void nativeMarkTextureFrameAvailable(long j17, long j18);

    private native void nativeNotifyLowMemoryWarning(long j17);

    private native void nativeOnVsync(long j17, long j18, long j19);

    private native void nativePauseScheduleFrame(long j17);

    private native void nativePreCreateThreadMerger(long j17, boolean z17);

    private static native void nativePrefetchDefaultFontManager(java.lang.String str);

    private native void nativeRecordStartupTiming(long j17, java.lang.String str);

    private native void nativeRecordStartupTimingWithDelta(long j17, java.lang.String str, long j18);

    private native void nativeRegisterImageTexture(long j17, long j18, java.lang.ref.WeakReference<io.flutter.view.TextureRegistry.ImageConsumer> weakReference, boolean z17);

    private native void nativeRegisterTexture(long j17, long j18, java.lang.ref.WeakReference<io.flutter.embedding.engine.renderer.SurfaceTextureWrapper> weakReference);

    private native void nativeReleaseGPUResource(long j17);

    private native void nativeRequestDrawLastFrame(long j17);

    private native void nativeRequestPreRender(long j17, int i17, int i18);

    private native void nativeResumeScheduleFrame(long j17);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.res.AssetManager assetManager, java.util.List<java.lang.String> list, long j18);

    private native void nativeScheduleFrame(long j17);

    private native void nativeSetAccessibilityFeatures(long j17, int i17);

    private static native void nativeSetLogHandler(long j17);

    private native void nativeSetSemanticsEnabled(long j17, boolean z17);

    private native void nativeSetViewportMetrics(long j17, float f17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int[] iArr, int[] iArr2, int[] iArr3, int i66);

    private native io.flutter.embedding.engine.FlutterJNI nativeSpawn(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, boolean z17, boolean z18, boolean z19, long j18);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSurfaceChanged(long j17, int i17, int i18);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSurfaceCreated(long j17, android.view.Surface surface);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSurfaceDestroyed(long j17);

    private native void nativeSurfaceWindowChanged(long j17, android.view.Surface surface);

    private native void nativeSwapMemoryFile(long j17, java.lang.String str, boolean z17, boolean z18, boolean z19);

    private native void nativeUnregisterTexture(long j17, long j18);

    private static native void nativeUpdateAppForegroundState(int i17);

    private native void nativeUpdateDisplayMetrics(long j17);

    private native void nativeUpdateJavaAssetManager(long j17, android.content.res.AssetManager assetManager, java.lang.String str);

    private native void nativeUpdateRefreshRate(float f17);

    private void onPreEngineRestart() {
        java.util.Iterator it = new java.util.concurrent.CopyOnWriteArraySet(this.engineLifecycleListeners).iterator();
        while (it.hasNext()) {
            ((io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener) it.next()).onPreEngineRestart();
        }
    }

    public static void setLogHandler(long j17) {
        nativeSetLogHandler(j17);
    }

    private void transferPreAttachTimingToNative() {
        if (this.preAttachTimingRecorder.isTransferred()) {
            return;
        }
        java.util.Map<java.lang.String, java.lang.Long> timings = this.preAttachTimingRecorder.getTimings();
        if (timings.isEmpty()) {
            this.preAttachTimingRecorder.clearAndMarkTransferred();
            return;
        }
        long nanoTime = java.lang.System.nanoTime();
        nativeRecordStartupTiming(this.nativeShellHolderId.longValue(), "java_timing_reference_point");
        for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry : timings.entrySet()) {
            nativeRecordStartupTimingWithDelta(this.nativeShellHolderId.longValue(), entry.getKey(), entry.getValue().longValue() - nanoTime);
        }
        this.preAttachTimingRecorder.clearAndMarkTransferred();
    }

    public static void updateAppForegroundState(io.flutter.embedding.engine.FlutterJNI.AppForegroundState appForegroundState) {
        nativeUpdateAppForegroundState(appForegroundState.ordinal());
    }

    private void updateCustomAccessibilityActions(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr) {
        ensureRunningOnMainThread();
        io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateCustomAccessibilityActions(byteBuffer, strArr);
        }
    }

    private void updateSemantics(java.nio.ByteBuffer byteBuffer, java.lang.String[] strArr, java.nio.ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateSemantics(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addDisplayNextFrameListener(io.flutter.embedding.engine.renderer.FlutterNextFrameDisplayListener flutterNextFrameDisplayListener) {
        if (this.nativeShellHolderId == null) {
            io.flutter.Log.e(TAG, "addDisplayNextFrameListener error nativeShellHolderId is null");
            return;
        }
        ensureRunningOnMainThread();
        this.flutterNextFrameDisplayListeners.add(flutterNextFrameDisplayListener);
        nativeInstallNextFrameCallback(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(engineLifecycleListener);
    }

    public void addEngineLifecycleListenerNotInMainThread(io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        synchronized (this.engineLifecycleListeners) {
            this.engineLifecycleListeners.add(engineLifecycleListener);
        }
    }

    public void addIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
    }

    public void addIsDisplayingFlutterUiListenerNotInMainThread(io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener) {
        synchronized (this.flutterUiDisplayListeners) {
            this.flutterUiDisplayListeners.add(flutterUiDisplayListener);
        }
    }

    public void addPreRenderFinishedListener(io.flutter.embedding.engine.renderer.FlutterPreRenderFinishedListener flutterPreRenderFinishedListener) {
        if (this.nativeShellHolderId == null) {
            io.flutter.Log.e(TAG, "addPreRenderFinishedListener error nativeShellHolderId is null");
        } else {
            ensureRunningOnMainThread();
            this.flutterPreRenderFinishedListeners.add(flutterPreRenderFinishedListener);
        }
    }

    public void afterInitNotInMainThread() {
        nativeAfterInit();
    }

    public void applyTransactions() {
        io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new java.lang.RuntimeException("");
        }
        platformViewsController2.applyTransactions();
    }

    public void attachNotInMainThread() {
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = java.lang.Long.valueOf(performNativeAttachNotInMainThread(this));
            transferPreAttachTimingToNative();
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = java.lang.Long.valueOf(performNativeAttach(this));
            transferPreAttachTimingToNative();
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void attachUITaskRunner(io.flutter.embedding.engine.TaskRunnerJNI taskRunnerJNI) {
        this.mUITaskRunnerJNI = taskRunnerJNI;
    }

    public boolean canPreRender() {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            return false;
        }
        return nativeCanPreRender(l17.longValue());
    }

    public void checkLeak() {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            io.flutter.Log.e(TAG, "checkLeak error nativeShellHolderId is null");
        } else {
            nativeCheckLeak(l17.longValue());
        }
    }

    public void cleanupMessageData(long j17) {
        nativeCleanupMessageData(j17);
    }

    public void clearCurrentRenderSurface() {
        if (this.nativeShellHolderId == null) {
            io.flutter.Log.e(TAG, "clearCurrentRenderSurface error nativeShellHolderId is null");
            return;
        }
        io.flutter.Log.i(TAG, "clearCurrentRenderSurface");
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        long longValue = this.nativeShellHolderId.longValue();
        io.flutter.Log.i(TAG, "clearCurrentRenderSurface start: " + longValue);
        nativeClearCurrentSurface(longValue);
        io.flutter.Log.i(TAG, "clearCurrentRenderSurface end: " + longValue);
    }

    public void clearDisplayNextFrameListener() {
        ensureRunningOnMainThread();
        this.flutterNextFrameDisplayListeners.clear();
    }

    public void clearPreRenderFinishedListeners() {
        ensureRunningOnMainThread();
        this.flutterPreRenderFinishedListeners.clear();
    }

    public java.lang.String[] computePlatformResolvedLocale(java.lang.String[] strArr) {
        if (this.localizationPlugin == null) {
            return new java.lang.String[0];
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < strArr.length; i17 += 3) {
            java.lang.String str = strArr[i17 + 0];
            java.lang.String str2 = strArr[i17 + 1];
            java.lang.String str3 = strArr[i17 + 2];
            java.util.Locale.Builder builder = new java.util.Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        java.util.Locale resolveNativeLocale = this.localizationPlugin.resolveNativeLocale(arrayList);
        return resolveNativeLocale == null ? new java.lang.String[0] : new java.lang.String[]{resolveNativeLocale.getLanguage(), resolveNativeLocale.getCountry(), resolveNativeLocale.getScript()};
    }

    public io.flutter.embedding.engine.FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController != null) {
            return platformViewsController.createOverlaySurface();
        }
        throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public io.flutter.embedding.engine.FlutterOverlaySurface createOverlaySurface2() {
        io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            return platformViewsController2.createOverlaySurface();
        }
        throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public android.view.SurfaceControl.Transaction createTransaction() {
        io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 != null) {
            return platformViewsController2.createTransaction();
        }
        throw new java.lang.RuntimeException("");
    }

    public void deferredComponentInstallFailure(int i17, java.lang.String str, boolean z17) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i17, str, z17);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        platformViewsController2.destroyOverlaySurface();
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        platformViewsController.destroyOverlaySurfaces();
    }

    public void detachFromNativeAndReleaseResources() {
        io.flutter.Log.i(TAG, "detachFromNativeAndReleaseResources " + this.nativeShellHolderId);
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        final java.lang.Long l17 = this.nativeShellHolderId;
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = null;
            this.shellHolderLock.writeLock().unlock();
            io.flutter.Log.i(TAG, "detachFromNativeAndReleaseResources lock end");
            this.backgroundExecutor.execute(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.FlutterJNI.1
                @Override // java.lang.Runnable
                public void run() {
                    io.flutter.Log.i(io.flutter.embedding.engine.FlutterJNI.TAG, "nativeDestroy started");
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    io.flutter.embedding.engine.FlutterJNI.this.nativeDestroy(l17.longValue());
                    io.flutter.Log.i(io.flutter.embedding.engine.FlutterJNI.TAG, "nativeDestroy completed: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                }
            });
        } catch (java.lang.Throwable th6) {
            this.shellHolderLock.writeLock().unlock();
            io.flutter.Log.i(TAG, "detachFromNativeAndReleaseResources lock end");
            throw th6;
        }
    }

    public void detachFromNativeAndReleaseResourcesNotInMainThread() {
        io.flutter.Log.i(TAG, "detachFromNativeAndReleaseResourcesNotInMainThread " + this.nativeShellHolderId);
        ensureAttachedToNative();
        java.lang.Long l17 = this.nativeShellHolderId;
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = null;
            this.shellHolderLock.writeLock().unlock();
            io.flutter.Log.i(TAG, "nativeDestroy started");
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            nativeDestroy(l17.longValue());
            io.flutter.Log.i(TAG, "nativeDestroy completed: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            this.shellHolderLock.writeLock().unlock();
            throw th6;
        }
    }

    public void dispatchEmptyPlatformMessage(java.lang.String str, int i17) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i17);
            return;
        }
        io.flutter.Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i17);
    }

    public void dispatchPlatformMessage(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i17, int i18) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i17, i18);
            return;
        }
        io.flutter.Log.w(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i18);
    }

    public void dispatchPointerDataPacket(java.nio.ByteBuffer byteBuffer, int i17) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i17);
    }

    public void dispatchSemanticsAction(int i17, io.flutter.view.AccessibilityBridge.Action action) {
        dispatchSemanticsAction(i17, action, null);
    }

    public void dumpGPUMemoryStatistics(boolean z17) {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            io.flutter.Log.e(TAG, "dumpGPUMemoryStatistics error nativeShellHolderId is null");
        } else {
            nativeDumpGPUMemoryStatistics(l17.longValue(), z17);
        }
    }

    public void endFrame2() {
        io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new java.lang.RuntimeException("");
        }
        platformViewsController2.onEndFrame();
    }

    public void endStartupTimingDuration(java.lang.String str) {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            this.preAttachTimingRecorder.endDuration(str);
            return;
        }
        nativeRecordStartupTiming(l17.longValue(), str + "_end");
    }

    public android.graphics.Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public long getGPUMemoryUsageInBytes() {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 != null) {
            return nativeGetGPUMemoryUsageInBytes(l17.longValue());
        }
        io.flutter.Log.e(TAG, "getGPUMemoryUsageInBytes error nativeShellHolderId is null");
        return 0L;
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public float getScaledFontSize(float f17, int i17) {
        android.util.DisplayMetrics pastDisplayMetrics = io.flutter.embedding.engine.systemchannels.SettingsChannel.getPastDisplayMetrics(i17);
        if (pastDisplayMetrics != null) {
            return android.util.TypedValue.applyDimension(2, f17, pastDisplayMetrics) / pastDisplayMetrics.density;
        }
        io.flutter.Log.e(TAG, "getScaledFontSize called with configurationId " + java.lang.String.valueOf(i17) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(java.lang.String str, java.nio.ByteBuffer byteBuffer, int i17, long j17) {
        io.flutter.embedding.engine.dart.PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handleMessageFromDart(str, byteBuffer, i17, j17);
        } else {
            nativeCleanupMessageData(j17);
        }
    }

    public void hideOverlaySurface2() {
        io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        platformViewsController2.hideOverlaySurface();
    }

    public void init(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        if (initCalled) {
            io.flutter.Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j17, i17, true);
        initCalled = true;
    }

    public void initNotInMainThread(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        if (initCalled) {
            io.flutter.Log.w(TAG, "FlutterJNI.init called more than once");
        }
        nativeInitNotInMainThread(context, strArr, str, str2, str3, j17, i17);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i17) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i17);
            } else {
                io.flutter.Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i17);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public void invokePlatformMessageResponseCallback(int i17, java.nio.ByteBuffer byteBuffer, int i18) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i17, byteBuffer, i18);
            } else {
                io.flutter.Log.w(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i17);
            }
        } finally {
            this.shellHolderLock.readLock().unlock();
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i17) {
        return nativeFlutterTextUtilsIsEmoji(i17);
    }

    public boolean isCodePointEmojiModifier(int i17) {
        return nativeFlutterTextUtilsIsEmojiModifier(i17);
    }

    public boolean isCodePointEmojiModifierBase(int i17) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i17);
    }

    public boolean isCodePointRegionalIndicator(int i17) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i17);
    }

    public boolean isCodePointVariantSelector(int i17) {
        return nativeFlutterTextUtilsIsVariationSelector(i17);
    }

    public void loadDartDeferredLibrary(int i17, java.lang.String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i17, strArr);
    }

    public void loadLibrary(android.content.Context context) {
        if (loadLibraryCalled) {
            io.flutter.Log.w(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        io.flutter.embedding.engine.FlutterJNI$$b flutterJNI$$b = new io.flutter.embedding.engine.FlutterJNI$$b();
        c8.h hVar = new c8.h();
        hVar.f39644d = flutterJNI$$b;
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Given context is null");
        }
        hVar.c("Beginning load of %s...", "flutter");
        hVar.b(context, "flutter", null);
        loadLibraryCalled = true;
    }

    public void markFlutterViewDraw() {
        nativeMarkFlutterViewDraw(this.nativeShellHolderId.longValue());
    }

    public void markTextureFrameAvailable(long j17) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j17);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        platformViewsController.onBeginFrame();
    }

    public void onDisplayOverlaySurface(int i17, int i18, int i19, int i27, int i28) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        platformViewsController.onDisplayOverlaySurface(i17, i18, i19, i27, i28);
    }

    public void onDisplayPlatformView(int i17, int i18, int i19, int i27, int i28, int i29, int i37, io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        platformViewsController.onDisplayPlatformView(i17, i18, i19, i27, i28, i29, i37, flutterMutatorsStack);
    }

    public void onDisplayPlatformView2(int i17, int i18, int i19, int i27, int i28, int i29, int i37, io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        platformViewsController2.onDisplayPlatformView(i17, i18, i19, i27, i28, i29, i37, flutterMutatorsStack);
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        io.flutter.plugin.platform.PlatformViewsController platformViewsController = this.platformViewsController;
        if (platformViewsController == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        platformViewsController.onEndFrame();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        java.util.Iterator<io.flutter.embedding.engine.renderer.FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiDisplayed();
        }
    }

    public void onNextFrame() {
        ensureRunningOnMainThread();
        java.util.Iterator<io.flutter.embedding.engine.renderer.FlutterNextFrameDisplayListener> it = this.flutterNextFrameDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterDisplayNextFrame();
        }
        this.flutterNextFrameDisplayListeners.clear();
    }

    public void onPreRenderFinished(boolean z17, android.graphics.Bitmap bitmap) {
        ensureRunningOnMainThread();
        io.flutter.Log.i(TAG, "onPreRenderFinished: " + z17 + ", bitmap: " + bitmap);
        java.util.Iterator<io.flutter.embedding.engine.renderer.FlutterPreRenderFinishedListener> it = this.flutterPreRenderFinishedListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreRenderFinished(z17, bitmap);
        }
        this.flutterPreRenderFinishedListeners.clear();
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        java.util.Iterator<io.flutter.embedding.engine.renderer.FlutterUiDisplayListener> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().onFlutterUiNoLongerDisplayed();
        }
    }

    public void onSurfaceChanged(final int i17, final int i18) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        final long longValue = this.nativeShellHolderId.longValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: io.flutter.embedding.engine.FlutterJNI.3
            @Override // java.lang.Runnable
            public void run() {
                io.flutter.Log.i(io.flutter.embedding.engine.FlutterJNI.TAG, "nativeSurfaceChanged start: " + longValue);
                io.flutter.embedding.engine.FlutterJNI.this.nativeSurfaceChanged(longValue, i17, i18);
                io.flutter.Log.i(io.flutter.embedding.engine.FlutterJNI.TAG, "nativeSurfaceChanged end: " + longValue);
            }
        };
        if (this.operateSurfaceOnBackground) {
            this.backgroundExecutor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public void onSurfaceCreated(final android.view.Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        final long longValue = this.nativeShellHolderId.longValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: io.flutter.embedding.engine.FlutterJNI.2
            @Override // java.lang.Runnable
            public void run() {
                io.flutter.Log.i(io.flutter.embedding.engine.FlutterJNI.TAG, "nativeSurfaceCreated start: " + longValue);
                io.flutter.embedding.engine.FlutterJNI.this.nativeSurfaceCreated(longValue, surface);
                io.flutter.Log.i(io.flutter.embedding.engine.FlutterJNI.TAG, "nativeSurfaceCreated end: " + longValue);
            }
        };
        if (this.operateSurfaceOnBackground) {
            this.backgroundExecutor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public void onSurfaceDestroyed() {
        if (this.nativeShellHolderId == null) {
            io.flutter.Log.e(TAG, "onSurfaceDestroyed error nativeShellHolderId is null");
            return;
        }
        io.flutter.Log.i(TAG, "onSurfaceDestroyed");
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        final long longValue = this.nativeShellHolderId.longValue();
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: io.flutter.embedding.engine.FlutterJNI.4
            @Override // java.lang.Runnable
            public void run() {
                io.flutter.Log.i(io.flutter.embedding.engine.FlutterJNI.TAG, "nativeSurfaceDestroyed start: " + longValue);
                io.flutter.embedding.engine.FlutterJNI.this.nativeSurfaceDestroyed(longValue);
                io.flutter.Log.i(io.flutter.embedding.engine.FlutterJNI.TAG, "nativeSurfaceDestroyed end: " + longValue);
            }
        };
        if (this.operateSurfaceOnBackground) {
            this.backgroundExecutor.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public void onSurfaceWindowChanged(android.view.Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j17, long j18, long j19) {
        nativeOnVsync(j17, j18, j19);
    }

    public void pauseScheduleFrame() {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            io.flutter.Log.e(TAG, "stopFrame error nativeShellHolderId is null");
        } else {
            nativePauseScheduleFrame(l17.longValue());
        }
    }

    public long performNativeAttach(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        io.flutter.embedding.engine.TaskRunnerJNI taskRunnerJNI = this.mUITaskRunnerJNI;
        return nativeAttach(flutterJNI, taskRunnerJNI != null ? taskRunnerJNI.getAddress() : 0L, this.isolateGroupName);
    }

    public long performNativeAttachNotInMainThread(io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        io.flutter.embedding.engine.TaskRunnerJNI taskRunnerJNI = this.mUITaskRunnerJNI;
        return nativeAttachNotInMainThread(flutterJNI, taskRunnerJNI != null ? taskRunnerJNI.getAddress() : 0L, this.isolateGroupName);
    }

    public void preCreateThreadMerger(boolean z17) {
        nativePreCreateThreadMerger(this.nativeShellHolderId.longValue(), z17);
    }

    public void prefetchDefaultFontManager(java.lang.String str) {
        if (prefetchDefaultFontManagerCalled) {
            io.flutter.Log.w(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager(str);
        prefetchDefaultFontManagerCalled = true;
    }

    public void recordStartupTiming(java.lang.String str) {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            this.preAttachTimingRecorder.recordTiming(str);
        } else {
            nativeRecordStartupTiming(l17.longValue(), str);
        }
    }

    public void recordStartupTimingWithTimestamp(java.lang.String str, long j17) {
        if (this.nativeShellHolderId == null) {
            this.preAttachTimingRecorder.recordTimingWithTimestamp(str, j17);
        } else {
            nativeRecordStartupTimingWithDelta(this.nativeShellHolderId.longValue(), str, j17 - java.lang.System.nanoTime());
        }
    }

    public void registerImageTexture(long j17, io.flutter.view.TextureRegistry.ImageConsumer imageConsumer, boolean z17) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j17, new java.lang.ref.WeakReference<>(imageConsumer), z17);
    }

    public void registerTexture(long j17, io.flutter.embedding.engine.renderer.SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j17, new java.lang.ref.WeakReference<>(surfaceTextureWrapper));
    }

    public void releaseGPUResource() {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            io.flutter.Log.e(TAG, "releaseGPUResource error nativeShellHolderId is null");
        } else {
            nativeReleaseGPUResource(l17.longValue());
        }
    }

    public void removeDisplayNextFrameListener(io.flutter.embedding.engine.renderer.FlutterNextFrameDisplayListener flutterNextFrameDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterNextFrameDisplayListeners.remove(flutterNextFrameDisplayListener);
    }

    public void removeEngineLifecycleListener(io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(engineLifecycleListener);
    }

    public void removeEngineLifecycleListenerNotInMainThread(io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        synchronized (this.engineLifecycleListeners) {
            this.engineLifecycleListeners.remove(engineLifecycleListener);
        }
    }

    public void removeIsDisplayingFlutterUiListener(io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
    }

    public void removeIsDisplayingFlutterUiListenerNotInMainThread(io.flutter.embedding.engine.renderer.FlutterUiDisplayListener flutterUiDisplayListener) {
        synchronized (this.flutterUiDisplayListeners) {
            this.flutterUiDisplayListeners.remove(flutterUiDisplayListener);
        }
    }

    public void removePreRenderFinishedListener(io.flutter.embedding.engine.renderer.FlutterPreRenderFinishedListener flutterPreRenderFinishedListener) {
        ensureRunningOnMainThread();
        this.flutterPreRenderFinishedListeners.remove(flutterPreRenderFinishedListener);
    }

    public void requestDartDeferredLibrary(int i17) {
        io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager = this.deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.installDeferredComponent(i17, null);
        } else {
            io.flutter.Log.e(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
        }
    }

    public void requestDrawLastFrame() {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            io.flutter.Log.e(TAG, "requestDrawLastFrame error nativeShellHolderId is null");
        } else {
            nativeRequestDrawLastFrame(l17.longValue());
        }
    }

    public void requestPreRender(int i17, int i18) {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            return;
        }
        nativeRequestPreRender(l17.longValue(), i17, i18);
    }

    public void resumeScheduleFrame() {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            io.flutter.Log.e(TAG, "startFrame error nativeShellHolderId is null");
        } else {
            nativeResumeScheduleFrame(l17.longValue());
        }
    }

    public void runBundleAndSnapshotFromLibrary(java.lang.String str, java.lang.String str2, java.lang.String str3, android.content.res.AssetManager assetManager, java.util.List<java.lang.String> list, long j17) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j17);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(io.flutter.embedding.engine.FlutterJNI.AccessibilityDelegate accessibilityDelegate) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = accessibilityDelegate;
    }

    public void setAccessibilityFeatures(int i17) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i17);
        }
    }

    public void setAccessibilityFeaturesInNative(int i17) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i17);
    }

    public void setAsyncWaitForVsyncDelegate(io.flutter.embedding.engine.FlutterJNI.AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate2) {
        asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate2;
    }

    public void setBackgroundExecutor(java.util.concurrent.Executor executor, boolean z17) {
        this.backgroundExecutor = executor;
        this.operateSurfaceOnBackground = z17;
    }

    public void setDeferredComponentManager(io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager) {
        ensureRunningOnMainThread();
        this.deferredComponentManager = deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.setJNI(this);
        }
    }

    public synchronized void setDeferredComponentManagerNotInMainThread(io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager) {
        this.deferredComponentManager = deferredComponentManager;
        if (deferredComponentManager != null) {
            deferredComponentManager.setJNI(this);
        }
    }

    public void setIsolateGroupName(java.lang.String str) {
        this.isolateGroupName = str;
    }

    public void setLocalizationPlugin(io.flutter.plugin.localization.LocalizationPlugin localizationPlugin) {
        ensureRunningOnMainThread();
        this.localizationPlugin = localizationPlugin;
    }

    public synchronized void setLocalizationPluginNotInMainThread(io.flutter.plugin.localization.LocalizationPlugin localizationPlugin) {
        this.localizationPlugin = localizationPlugin;
    }

    public void setPlatformMessageHandler(io.flutter.embedding.engine.dart.PlatformMessageHandler platformMessageHandler) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = platformMessageHandler;
    }

    public synchronized void setPlatformMessageHandlerNotInMainThread(io.flutter.embedding.engine.dart.PlatformMessageHandler platformMessageHandler) {
        this.platformMessageHandler = platformMessageHandler;
    }

    public void setPlatformViewsController(io.flutter.plugin.platform.PlatformViewsController platformViewsController) {
        ensureRunningOnMainThread();
        this.platformViewsController = platformViewsController;
    }

    public void setPlatformViewsController2(io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = platformViewsController2;
    }

    public synchronized void setPlatformViewsController2NotInMainThread(io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2) {
        this.platformViewsController2 = platformViewsController2;
    }

    public synchronized void setPlatformViewsControllerNotInMainThread(io.flutter.plugin.platform.PlatformViewsController platformViewsController) {
        this.platformViewsController = platformViewsController;
    }

    public void setRefreshRateFPS(float f17) {
        refreshRateFPS = f17;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z17) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z17);
        }
    }

    public void setSemanticsEnabledInNative(boolean z17) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z17);
    }

    public void setViewportMetrics(float f17, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39, int i47, int i48, int i49, int i57, int i58, int i59, int[] iArr, int[] iArr2, int[] iArr3, int i66) {
        if (this.nativeShellHolderId == null) {
            io.flutter.Log.e(TAG, "setViewportMetrics error nativeShellHolderId is null");
            return;
        }
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f17, i17, i18, i19, i27, i28, i29, i37, i38, i39, i47, i48, i49, i57, i58, i59, iArr, iArr2, iArr3, i66);
    }

    public void showOverlaySurface2() {
        io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new java.lang.RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        platformViewsController2.showOverlaySurface();
    }

    public io.flutter.embedding.engine.FlutterJNI spawn(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, long j17) {
        return spawn(str, str2, str3, list, false, true, false, j17);
    }

    public io.flutter.embedding.engine.FlutterJNI spawnNotInMainThread(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, boolean z17, boolean z18, boolean z19, long j17) {
        ensureAttachedToNative();
        io.flutter.embedding.engine.FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, z17, z18, z19, j17);
        java.lang.Long l17 = nativeSpawn.nativeShellHolderId;
        io.flutter.util.Preconditions.checkState((l17 == null || l17.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    public void startStartupTimingDuration(java.lang.String str) {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            this.preAttachTimingRecorder.startDuration(str);
            return;
        }
        nativeRecordStartupTiming(l17.longValue(), str + "_start");
    }

    public void swapMemoryToFile(java.lang.String str, boolean z17, boolean z18, boolean z19) {
        java.lang.Long l17 = this.nativeShellHolderId;
        if (l17 == null) {
            io.flutter.Log.e(TAG, "swapMemoryToFile error nativeShellHolderId is null");
        } else {
            nativeSwapMemoryFile(l17.longValue(), str, z17, z18, z19);
        }
    }

    public void swapTransactions() {
        io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2 = this.platformViewsController2;
        if (platformViewsController2 == null) {
            throw new java.lang.RuntimeException("");
        }
        platformViewsController2.swapTransactions();
    }

    public void unregisterTexture(long j17) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j17);
    }

    public void updateDisplayMetrics(int i17, float f17, float f18, float f19) {
        displayWidth = f17;
        displayHeight = f18;
        displayDensity = f19;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(android.content.res.AssetManager assetManager, java.lang.String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i17, io.flutter.view.AccessibilityBridge.Action action, java.lang.Object obj) {
        java.nio.ByteBuffer byteBuffer;
        int i18;
        ensureAttachedToNative();
        if (obj != null) {
            byteBuffer = io.flutter.plugin.common.StandardMessageCodec.INSTANCE.encodeMessage(obj);
            i18 = byteBuffer.position();
        } else {
            byteBuffer = null;
            i18 = 0;
        }
        dispatchSemanticsAction(i17, action.value, byteBuffer, i18);
    }

    public io.flutter.embedding.engine.FlutterJNI spawn(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, boolean z17, long j17) {
        return spawn(str, str2, str3, list, false, true, z17, j17);
    }

    public io.flutter.embedding.engine.FlutterJNI spawn(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, boolean z17, boolean z18, boolean z19, long j17) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        io.flutter.embedding.engine.FlutterJNI nativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, z17, z18, z19, j17);
        java.lang.Long l17 = nativeSpawn.nativeShellHolderId;
        io.flutter.util.Preconditions.checkState((l17 == null || l17.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return nativeSpawn;
    }

    public void dispatchSemanticsAction(int i17, int i18, java.nio.ByteBuffer byteBuffer, int i19) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i17, i18, byteBuffer, i19);
    }
}
