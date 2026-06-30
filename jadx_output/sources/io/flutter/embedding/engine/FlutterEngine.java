package io.flutter.embedding.engine;

/* loaded from: classes15.dex */
public class FlutterEngine implements io.flutter.util.ViewUtils.DisplayUpdater {
    private static final java.lang.String TAG = "FlutterEngine";
    private static final java.util.Map<java.lang.Long, io.flutter.embedding.engine.FlutterEngine> idToEngine = new java.util.HashMap();
    private static long nextEngineId = 1;
    private final io.flutter.embedding.engine.systemchannels.AccessibilityChannel accessibilityChannel;
    private final io.flutter.embedding.engine.systemchannels.BackGestureChannel backGestureChannel;
    private final io.flutter.embedding.engine.dart.DartExecutor dartExecutor;
    private final io.flutter.embedding.engine.systemchannels.DeferredComponentChannel deferredComponentChannel;
    private final long engineId;
    private final io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener engineLifecycleListener;
    private final java.util.Set<io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener> engineLifecycleListeners;
    private final io.flutter.embedding.engine.FlutterJNI flutterJNI;
    private final io.flutter.embedding.engine.systemchannels.LifecycleChannel lifecycleChannel;
    private final io.flutter.embedding.engine.systemchannels.LocalizationChannel localizationChannel;
    private final io.flutter.plugin.localization.LocalizationPlugin localizationPlugin;
    private final io.flutter.embedding.engine.systemchannels.MouseCursorChannel mouseCursorChannel;
    private final io.flutter.embedding.engine.systemchannels.NavigationChannel navigationChannel;
    private final io.flutter.embedding.engine.systemchannels.PlatformChannel platformChannel;
    private final io.flutter.plugin.platform.PlatformViewsController platformViewsController;
    private final io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2;
    private final io.flutter.embedding.engine.FlutterEngineConnectionRegistry pluginRegistry;
    private final io.flutter.embedding.engine.systemchannels.ProcessTextChannel processTextChannel;
    private final io.flutter.embedding.engine.renderer.FlutterRenderer renderer;
    private final io.flutter.embedding.engine.systemchannels.RestorationChannel restorationChannel;
    private final io.flutter.embedding.engine.systemchannels.ScribeChannel scribeChannel;
    private final io.flutter.embedding.engine.systemchannels.SensitiveContentChannel sensitiveContentChannel;
    private final io.flutter.embedding.engine.systemchannels.SettingsChannel settingsChannel;
    private final io.flutter.embedding.engine.systemchannels.SkiaChannel skiaChannel;
    private final io.flutter.embedding.engine.systemchannels.SpellCheckChannel spellCheckChannel;
    private final io.flutter.embedding.engine.systemchannels.StatChannel statChannel;
    private final io.flutter.embedding.engine.systemchannels.SystemChannel systemChannel;
    private final io.flutter.embedding.engine.systemchannels.TextInputChannel textInputChannel;

    /* loaded from: classes15.dex */
    public interface EngineLifecycleListener {
        void onEngineWillDestroy();

        void onPreEngineRestart();
    }

    public FlutterEngine(android.content.Context context) {
        this(context, null);
    }

    private void attachToJni() {
        io.flutter.Log.v(TAG, "Attaching to JNI.");
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            io.flutter.Log.i(TAG, "Attaching to JNI in main thread");
            this.flutterJNI.attachToNative();
        } else {
            io.flutter.Log.i(TAG, "Attaching to JNI not in main thread");
            this.flutterJNI.attachNotInMainThread();
        }
        if (!isAttachedToJni()) {
            throw new java.lang.RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    public static io.flutter.embedding.engine.FlutterEngine engineForId(long j17) {
        return idToEngine.get(java.lang.Long.valueOf(j17));
    }

    private boolean isAttachedToJni() {
        return this.flutterJNI.isAttached();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(android.content.Context context) {
        this.localizationPlugin.sendLocalesToFlutter(context.getResources().getConfiguration());
    }

    public static void resetNextEngineId() {
        nextEngineId = 1L;
    }

    public void addEngineLifecycleListener(io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        this.engineLifecycleListeners.add(engineLifecycleListener);
    }

    public void beforeDestroyInAnyThread() {
        io.flutter.Log.i(TAG, "beforeDestroyInAnyThread");
        java.util.Iterator<io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onEngineWillDestroy();
        }
        this.renderer.release();
        this.engineLifecycleListeners.clear();
        this.pluginRegistry.destroy();
        this.platformViewsController.onDetachedFromJNI();
        this.dartExecutor.onDetachedFromJNI();
        this.flutterJNI.removeEngineLifecycleListener(this.engineLifecycleListener);
        this.flutterJNI.setDeferredComponentManager(null);
        if (io.flutter.FlutterInjector.instance().deferredComponentManager() != null) {
            io.flutter.FlutterInjector.instance().deferredComponentManager().destroy();
            this.deferredComponentChannel.setDeferredComponentManager(null);
        }
    }

    public boolean canPreRender() {
        return this.flutterJNI.canPreRender();
    }

    public void checkLeak() {
        this.flutterJNI.checkLeak();
    }

    public void destroy() {
        io.flutter.Log.v(TAG, "Destroying.");
        java.util.Iterator<io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().onEngineWillDestroy();
        }
        this.renderer.release();
        this.engineLifecycleListeners.clear();
        this.pluginRegistry.destroy();
        this.platformViewsController.onDetachedFromJNI();
        this.platformViewsController2.onDetachedFromJNI();
        this.dartExecutor.onDetachedFromJNI();
        this.flutterJNI.removeEngineLifecycleListener(this.engineLifecycleListener);
        this.flutterJNI.setDeferredComponentManager(null);
        this.flutterJNI.detachFromNativeAndReleaseResources();
        if (io.flutter.FlutterInjector.instance().deferredComponentManager() != null) {
            io.flutter.FlutterInjector.instance().deferredComponentManager().destroy();
            this.deferredComponentChannel.setDeferredComponentManager(null);
        }
        idToEngine.remove(java.lang.Long.valueOf(this.engineId));
    }

    public void destroyInAnyThread() {
        io.flutter.Log.i(TAG, "Destroying not in main thread.");
        this.flutterJNI.detachFromNativeAndReleaseResourcesNotInMainThread();
    }

    public void dumpGPUMemoryStatistics(boolean z17) {
        this.flutterJNI.dumpGPUMemoryStatistics(z17);
    }

    public io.flutter.embedding.engine.systemchannels.AccessibilityChannel getAccessibilityChannel() {
        return this.accessibilityChannel;
    }

    public io.flutter.embedding.engine.plugins.activity.ActivityControlSurface getActivityControlSurface() {
        return this.pluginRegistry;
    }

    public io.flutter.embedding.engine.systemchannels.BackGestureChannel getBackGestureChannel() {
        return this.backGestureChannel;
    }

    public io.flutter.embedding.engine.plugins.broadcastreceiver.BroadcastReceiverControlSurface getBroadcastReceiverControlSurface() {
        return this.pluginRegistry;
    }

    public io.flutter.embedding.engine.plugins.contentprovider.ContentProviderControlSurface getContentProviderControlSurface() {
        return this.pluginRegistry;
    }

    public io.flutter.embedding.engine.dart.DartExecutor getDartExecutor() {
        return this.dartExecutor;
    }

    public io.flutter.embedding.engine.systemchannels.DeferredComponentChannel getDeferredComponentChannel() {
        return this.deferredComponentChannel;
    }

    public long getEngineId() {
        return this.engineId;
    }

    public long getGPUMemoryUsageInBytes() {
        return this.flutterJNI.getGPUMemoryUsageInBytes();
    }

    public io.flutter.embedding.engine.systemchannels.LifecycleChannel getLifecycleChannel() {
        return this.lifecycleChannel;
    }

    public io.flutter.embedding.engine.systemchannels.LocalizationChannel getLocalizationChannel() {
        return this.localizationChannel;
    }

    public io.flutter.plugin.localization.LocalizationPlugin getLocalizationPlugin() {
        return this.localizationPlugin;
    }

    public io.flutter.embedding.engine.systemchannels.MouseCursorChannel getMouseCursorChannel() {
        return this.mouseCursorChannel;
    }

    public io.flutter.embedding.engine.systemchannels.NavigationChannel getNavigationChannel() {
        return this.navigationChannel;
    }

    public io.flutter.embedding.engine.systemchannels.PlatformChannel getPlatformChannel() {
        return this.platformChannel;
    }

    public io.flutter.plugin.platform.PlatformViewsController getPlatformViewsController() {
        return this.platformViewsController;
    }

    public io.flutter.plugin.platform.PlatformViewsController2 getPlatformViewsController2() {
        return this.platformViewsController2;
    }

    public io.flutter.embedding.engine.plugins.PluginRegistry getPlugins() {
        return this.pluginRegistry;
    }

    public io.flutter.embedding.engine.systemchannels.ProcessTextChannel getProcessTextChannel() {
        return this.processTextChannel;
    }

    public io.flutter.embedding.engine.renderer.FlutterRenderer getRenderer() {
        return this.renderer;
    }

    public io.flutter.embedding.engine.systemchannels.RestorationChannel getRestorationChannel() {
        return this.restorationChannel;
    }

    public io.flutter.embedding.engine.systemchannels.ScribeChannel getScribeChannel() {
        return this.scribeChannel;
    }

    public io.flutter.embedding.engine.systemchannels.SensitiveContentChannel getSensitiveContentChannel() {
        return this.sensitiveContentChannel;
    }

    public io.flutter.embedding.engine.plugins.service.ServiceControlSurface getServiceControlSurface() {
        return this.pluginRegistry;
    }

    public io.flutter.embedding.engine.systemchannels.SettingsChannel getSettingsChannel() {
        return this.settingsChannel;
    }

    public io.flutter.embedding.engine.systemchannels.SkiaChannel getSkiaChannel() {
        return this.skiaChannel;
    }

    public io.flutter.embedding.engine.systemchannels.SpellCheckChannel getSpellCheckChannel() {
        return this.spellCheckChannel;
    }

    public io.flutter.embedding.engine.systemchannels.StatChannel getStatChannel() {
        return this.statChannel;
    }

    public io.flutter.embedding.engine.systemchannels.SystemChannel getSystemChannel() {
        return this.systemChannel;
    }

    public io.flutter.embedding.engine.systemchannels.TextInputChannel getTextInputChannel() {
        return this.textInputChannel;
    }

    public void markFlutterViewDraw() {
        this.flutterJNI.markFlutterViewDraw();
    }

    public void preCreateThreadMerger(boolean z17) {
        this.flutterJNI.preCreateThreadMerger(z17);
    }

    public void recordStartupTiming(java.lang.String str) {
        this.flutterJNI.recordStartupTiming(str);
    }

    public void recordStartupTimingWithTimestamp(java.lang.String str, long j17) {
        this.flutterJNI.recordStartupTimingWithTimestamp(str, j17);
    }

    public void releaseGPUResource() {
        this.flutterJNI.releaseGPUResource();
    }

    public void removeEngineLifecycleListener(io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        this.engineLifecycleListeners.remove(engineLifecycleListener);
    }

    public void requestPreRender(int i17, int i18, io.flutter.embedding.engine.renderer.FlutterPreRenderFinishedListener flutterPreRenderFinishedListener) {
        this.flutterJNI.addPreRenderFinishedListener(flutterPreRenderFinishedListener);
        this.flutterJNI.requestPreRender(i17, i18);
    }

    public void setBackgroundExecutor(java.util.concurrent.Executor executor, boolean z17) {
        this.renderer.setBackgroundExecutor(executor);
        this.flutterJNI.setBackgroundExecutor(executor, z17);
    }

    public io.flutter.embedding.engine.FlutterEngine spawn(android.content.Context context, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint, java.lang.String str, java.util.List<java.lang.String> list, io.flutter.plugin.platform.PlatformViewsController platformViewsController, boolean z17, boolean z18) {
        return spawn(context, dartEntrypoint, str, list, platformViewsController, z17, z18, false, true);
    }

    public void swapMemFromFile(java.lang.String str, boolean z17, boolean z18) {
        this.flutterJNI.swapMemoryToFile(str, false, z17, z18);
    }

    public void swapMemToFile(java.lang.String str, boolean z17, boolean z18) {
        this.flutterJNI.swapMemoryToFile(str, true, z17, z18);
    }

    @Override // io.flutter.util.ViewUtils.DisplayUpdater
    public void updateDisplayMetrics(float f17, float f18, float f19) {
        this.flutterJNI.updateDisplayMetrics(0, f17, f18, f19);
    }

    public FlutterEngine(android.content.Context context, java.lang.String[] strArr) {
        this(context, null, null, strArr, true);
    }

    public io.flutter.embedding.engine.FlutterEngine spawn(android.content.Context context, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint, java.lang.String str, java.util.List<java.lang.String> list, io.flutter.plugin.platform.PlatformViewsController platformViewsController, boolean z17, boolean z18, boolean z19, boolean z27) {
        io.flutter.embedding.engine.FlutterJNI spawnNotInMainThread;
        if (isAttachedToJni()) {
            long nanoTime = java.lang.System.nanoTime();
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                spawnNotInMainThread = this.flutterJNI.spawn(dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, str, list, z19, z27, false, nextEngineId);
            } else {
                spawnNotInMainThread = this.flutterJNI.spawnNotInMainThread(dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, str, list, z19, z27, false, nextEngineId);
            }
            spawnNotInMainThread.recordStartupTimingWithTimestamp("java_spawn_start", nanoTime);
            spawnNotInMainThread.recordStartupTiming("java_spawn_jni_created");
            io.flutter.embedding.engine.FlutterEngine flutterEngine = new io.flutter.embedding.engine.FlutterEngine(context, null, spawnNotInMainThread, platformViewsController, null, z17, z18);
            spawnNotInMainThread.recordStartupTiming("java_spawn_engine_created");
            return flutterEngine;
        }
        throw new java.lang.IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    public FlutterEngine(android.content.Context context, java.lang.String[] strArr, boolean z17) {
        this(context, null, null, strArr, z17);
    }

    public FlutterEngine(android.content.Context context, java.lang.String[] strArr, boolean z17, boolean z18) {
        this(context, null, null, new io.flutter.plugin.platform.PlatformViewsController(), strArr, z17, z18);
    }

    public FlutterEngine(android.content.Context context, io.flutter.embedding.engine.loader.FlutterLoader flutterLoader, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        this(context, flutterLoader, flutterJNI, null, true);
    }

    public FlutterEngine(android.content.Context context, io.flutter.embedding.engine.loader.FlutterLoader flutterLoader, io.flutter.embedding.engine.FlutterJNI flutterJNI, java.lang.String[] strArr, boolean z17) {
        this(context, flutterLoader, flutterJNI, new io.flutter.plugin.platform.PlatformViewsController(), strArr, z17);
    }

    public FlutterEngine(android.content.Context context, io.flutter.embedding.engine.loader.FlutterLoader flutterLoader, io.flutter.embedding.engine.FlutterJNI flutterJNI, io.flutter.plugin.platform.PlatformViewsController platformViewsController, java.lang.String[] strArr, boolean z17) {
        this(context, flutterLoader, flutterJNI, platformViewsController, strArr, z17, false);
    }

    public FlutterEngine(android.content.Context context, io.flutter.embedding.engine.loader.FlutterLoader flutterLoader, io.flutter.embedding.engine.FlutterJNI flutterJNI, io.flutter.plugin.platform.PlatformViewsController platformViewsController, java.lang.String[] strArr, boolean z17, boolean z18) {
        this(context, flutterLoader, flutterJNI, platformViewsController, strArr, z17, z18, "", null);
    }

    public FlutterEngine(android.content.Context context, io.flutter.embedding.engine.loader.FlutterLoader flutterLoader, io.flutter.embedding.engine.FlutterJNI flutterJNI, io.flutter.plugin.platform.PlatformViewsController platformViewsController, java.lang.String[] strArr, boolean z17, boolean z18, java.lang.String str) {
        this(context, flutterLoader, flutterJNI, platformViewsController, strArr, z17, z18, str, null);
    }

    public FlutterEngine(final android.content.Context context, io.flutter.embedding.engine.loader.FlutterLoader flutterLoader, io.flutter.embedding.engine.FlutterJNI flutterJNI, io.flutter.plugin.platform.PlatformViewsController platformViewsController, java.lang.String[] strArr, boolean z17, boolean z18, java.lang.String str, io.flutter.embedding.engine.FlutterEngineGroup flutterEngineGroup) {
        android.content.res.AssetManager assets;
        this.engineLifecycleListeners = new java.util.HashSet();
        this.engineLifecycleListener = new io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener() { // from class: io.flutter.embedding.engine.FlutterEngine.1
            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onEngineWillDestroy() {
            }

            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onPreEngineRestart() {
                io.flutter.Log.v(io.flutter.embedding.engine.FlutterEngine.TAG, "onPreEngineRestart()");
                java.util.Iterator it = io.flutter.embedding.engine.FlutterEngine.this.engineLifecycleListeners.iterator();
                while (it.hasNext()) {
                    ((io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener) it.next()).onPreEngineRestart();
                }
                io.flutter.embedding.engine.FlutterEngine.this.platformViewsController.onPreEngineRestart();
                io.flutter.embedding.engine.FlutterEngine.this.platformViewsController2.onPreEngineRestart();
                io.flutter.embedding.engine.FlutterEngine.this.restorationChannel.clearData();
            }
        };
        long nanoTime = java.lang.System.nanoTime();
        long j17 = nextEngineId;
        nextEngineId = 1 + j17;
        this.engineId = j17;
        idToEngine.put(java.lang.Long.valueOf(j17), this);
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        long nanoTime2 = java.lang.System.nanoTime();
        io.flutter.FlutterInjector instance = io.flutter.FlutterInjector.instance();
        io.flutter.embedding.engine.FlutterJNI provideFlutterJNI = flutterJNI == null ? instance.getFlutterJNIFactory().provideFlutterJNI() : flutterJNI;
        this.flutterJNI = provideFlutterJNI;
        provideFlutterJNI.recordStartupTimingWithTimestamp("java_flutter_engine_constructor_start", nanoTime);
        provideFlutterJNI.recordStartupTimingWithTimestamp("java_asset_manager_created", nanoTime2);
        io.flutter.embedding.engine.dart.DartExecutor dartExecutor = new io.flutter.embedding.engine.dart.DartExecutor(provideFlutterJNI, assets, this.engineId);
        this.dartExecutor = dartExecutor;
        provideFlutterJNI.recordStartupTiming("java_dart_executor_created");
        dartExecutor.onAttachedToJNI();
        io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager deferredComponentManager = io.flutter.FlutterInjector.instance().deferredComponentManager();
        provideFlutterJNI.startStartupTimingDuration("java_channels_creation");
        this.accessibilityChannel = new io.flutter.embedding.engine.systemchannels.AccessibilityChannel(dartExecutor, provideFlutterJNI);
        io.flutter.embedding.engine.systemchannels.DeferredComponentChannel deferredComponentChannel = new io.flutter.embedding.engine.systemchannels.DeferredComponentChannel(dartExecutor);
        this.deferredComponentChannel = deferredComponentChannel;
        this.lifecycleChannel = new io.flutter.embedding.engine.systemchannels.LifecycleChannel(dartExecutor);
        io.flutter.embedding.engine.systemchannels.LocalizationChannel localizationChannel = new io.flutter.embedding.engine.systemchannels.LocalizationChannel(dartExecutor);
        this.localizationChannel = localizationChannel;
        this.mouseCursorChannel = new io.flutter.embedding.engine.systemchannels.MouseCursorChannel(dartExecutor);
        this.navigationChannel = new io.flutter.embedding.engine.systemchannels.NavigationChannel(dartExecutor);
        this.backGestureChannel = new io.flutter.embedding.engine.systemchannels.BackGestureChannel(dartExecutor);
        this.platformChannel = new io.flutter.embedding.engine.systemchannels.PlatformChannel(dartExecutor);
        this.processTextChannel = new io.flutter.embedding.engine.systemchannels.ProcessTextChannel(dartExecutor, context.getPackageManager());
        this.restorationChannel = new io.flutter.embedding.engine.systemchannels.RestorationChannel(dartExecutor, z18);
        this.scribeChannel = new io.flutter.embedding.engine.systemchannels.ScribeChannel(dartExecutor);
        this.sensitiveContentChannel = new io.flutter.embedding.engine.systemchannels.SensitiveContentChannel(dartExecutor);
        this.settingsChannel = new io.flutter.embedding.engine.systemchannels.SettingsChannel(dartExecutor);
        this.spellCheckChannel = new io.flutter.embedding.engine.systemchannels.SpellCheckChannel(dartExecutor);
        this.systemChannel = new io.flutter.embedding.engine.systemchannels.SystemChannel(dartExecutor);
        this.textInputChannel = new io.flutter.embedding.engine.systemchannels.TextInputChannel(dartExecutor);
        this.skiaChannel = new io.flutter.embedding.engine.systemchannels.SkiaChannel(dartExecutor);
        this.statChannel = new io.flutter.embedding.engine.systemchannels.StatChannel(dartExecutor);
        provideFlutterJNI.endStartupTimingDuration("java_channels_creation");
        if (deferredComponentManager != null) {
            deferredComponentManager.setDeferredComponentChannel(deferredComponentChannel);
        }
        io.flutter.plugin.localization.LocalizationPlugin localizationPlugin = new io.flutter.plugin.localization.LocalizationPlugin(context, localizationChannel);
        this.localizationPlugin = localizationPlugin;
        io.flutter.embedding.engine.loader.FlutterLoader flutterLoader2 = flutterLoader == null ? instance.flutterLoader() : flutterLoader;
        provideFlutterJNI.startStartupTimingDuration("java_flutter_loader_init");
        if (!provideFlutterJNI.isAttached()) {
            flutterLoader2.startInitialization(context.getApplicationContext());
            flutterLoader2.ensureInitializationComplete(context, strArr, android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        }
        provideFlutterJNI.endStartupTimingDuration("java_flutter_loader_init");
        io.flutter.plugin.platform.PlatformViewsController2 platformViewsController2 = new io.flutter.plugin.platform.PlatformViewsController2();
        platformViewsController2.setRegistry(platformViewsController.getRegistry());
        platformViewsController2.setFlutterJNI(provideFlutterJNI);
        platformViewsController.setFlutterJNI(provideFlutterJNI);
        provideFlutterJNI.setIsolateGroupName(str);
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            provideFlutterJNI.addEngineLifecycleListener(this.engineLifecycleListener);
            provideFlutterJNI.setPlatformViewsController(platformViewsController);
            provideFlutterJNI.setPlatformViewsController2(platformViewsController2);
            provideFlutterJNI.setLocalizationPlugin(localizationPlugin);
            provideFlutterJNI.setDeferredComponentManager(instance.deferredComponentManager());
        } else {
            provideFlutterJNI.addEngineLifecycleListenerNotInMainThread(this.engineLifecycleListener);
            provideFlutterJNI.setPlatformViewsControllerNotInMainThread(platformViewsController);
            provideFlutterJNI.setPlatformViewsController2NotInMainThread(platformViewsController2);
            provideFlutterJNI.setLocalizationPluginNotInMainThread(localizationPlugin);
            provideFlutterJNI.setDeferredComponentManagerNotInMainThread(instance.deferredComponentManager());
        }
        if (!provideFlutterJNI.isAttached()) {
            provideFlutterJNI.recordStartupTiming("java_attach_to_jni_start");
            attachToJni();
            provideFlutterJNI.recordStartupTiming("java_attach_to_jni_end");
        }
        this.renderer = new io.flutter.embedding.engine.renderer.FlutterRenderer(provideFlutterJNI);
        this.platformViewsController = platformViewsController;
        this.platformViewsController2 = platformViewsController2;
        io.flutter.embedding.engine.FlutterEngineConnectionRegistry flutterEngineConnectionRegistry = new io.flutter.embedding.engine.FlutterEngineConnectionRegistry(context.getApplicationContext(), this, flutterLoader2, flutterEngineGroup);
        this.pluginRegistry = flutterEngineConnectionRegistry;
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            localizationPlugin.sendLocalesToFlutter(context.getResources().getConfiguration());
        } else {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: io.flutter.embedding.engine.FlutterEngine$$a
                @Override // java.lang.Runnable
                public final void run() {
                    io.flutter.embedding.engine.FlutterEngine.this.lambda$new$0(context);
                }
            });
        }
        if (z17 && flutterLoader2.automaticallyRegisterPlugins()) {
            io.flutter.embedding.engine.plugins.util.GeneratedPluginRegister.registerGeneratedPlugins(this);
        }
        io.flutter.util.ViewUtils.calculateMaximumDisplayMetrics(context, this);
        flutterEngineConnectionRegistry.add(new io.flutter.plugin.text.ProcessTextPlugin(getProcessTextChannel()));
        provideFlutterJNI.recordStartupTiming("java_flutter_engine_done");
    }
}
