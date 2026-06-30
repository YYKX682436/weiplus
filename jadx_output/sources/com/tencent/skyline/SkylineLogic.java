package com.tencent.skyline;

/* loaded from: classes15.dex */
public class SkylineLogic {
    private static final int DEFAULT_MODE = 1;
    public static final int MODE_MULTI_FLUTTER_ENGINE_GROUP = 1;
    public static final int MODE_SINGLE_FLUTTER_ENGINE_GROUP = 2;
    private static final java.lang.String SKYLINE_INIT_NAME = "Skyline_Invoke_MethodChannel";
    private static final java.lang.String SKYLINE_NAME = "Skyline_MethodChannel";
    private static final java.lang.String SKYLINE_TEXTURE = "skyline_texture";
    private static final java.lang.String TAG = "SkylineLogic";
    public static final int TYPE_IMAGE = 3;
    public static final int TYPE_SURFACE = 2;
    public static final int TYPE_TEXTURE = 1;
    private static java.util.HashMap<java.lang.Integer, com.tencent.skyline.FlutterEngineAddon> activeEngines;
    private static boolean isInit;
    private static java.util.HashMap<java.lang.Long, java.lang.Integer> runtimePtr2Id = new java.util.HashMap<>();
    private static android.os.Handler mainHandler = null;
    private static int mode = 1;
    private static int firstId = 0;
    private static java.util.concurrent.ConcurrentHashMap<java.lang.Long, com.tencent.skyline.FlutterJNIAddon> preloadFlutterJNIs = new java.util.concurrent.ConcurrentHashMap<>();
    private static final io.flutter.embedding.engine.renderer.FlutterUiDisplayListener sFlutterUiDisplayListener = new io.flutter.embedding.engine.renderer.FlutterUiDisplayListener() { // from class: com.tencent.skyline.SkylineLogic.2
        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiDisplayed() {
            com.tencent.skyline.SkylineLog.i(com.tencent.skyline.SkylineLogic.TAG, "onFlutterUiDisplayed");
        }

        @Override // io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
        public void onFlutterUiNoLongerDisplayed() {
            com.tencent.skyline.SkylineLog.i(com.tencent.skyline.SkylineLogic.TAG, "onFlutterUiNoLongerDisplayed");
        }
    };

    public static /* synthetic */ boolean access$100() {
        return isSingleFlutterEngineGroup();
    }

    public static void appIsDetached(int i17) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(i17));
        if (flutterEngineAddon == null) {
            com.tencent.skyline.SkylineLog.e(TAG, "flutterEngine is null, appIsDetached fail return");
        } else {
            flutterEngineAddon.getFlutterEngine().getLifecycleChannel().appIsDetached();
        }
    }

    public static void appIsInactive(int i17) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(i17));
        if (flutterEngineAddon == null) {
            com.tencent.skyline.SkylineLog.e(TAG, "flutterEngine is null, appIsInactive fail return");
        } else {
            flutterEngineAddon.getFlutterEngine().getLifecycleChannel().appIsInactive();
        }
    }

    public static void appIsPaused(int i17) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(i17));
        if (flutterEngineAddon == null) {
            com.tencent.skyline.SkylineLog.e(TAG, "flutterEngine is null, appIsPaused fail return");
        } else {
            flutterEngineAddon.getFlutterEngine().getLifecycleChannel().appIsPaused();
        }
    }

    public static void appIsResumed(int i17) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(i17));
        if (flutterEngineAddon == null) {
            com.tencent.skyline.SkylineLog.e(TAG, "flutterEngine is null, appIsResumed fail return");
        } else {
            flutterEngineAddon.getFlutterEngine().getLifecycleChannel().appIsResumed();
        }
    }

    public static void attachFlutterEngine(int i17, io.flutter.embedding.android.FlutterView flutterView) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(i17));
        if (flutterEngineAddon == null) {
            com.tencent.skyline.SkylineLog.e(TAG, "flutterEngine is null, attachFlutterEngine fail return");
        } else {
            flutterView.attachToFlutterEngine(flutterEngineAddon.getFlutterEngine());
            flutterView.addOnFirstFrameRenderedListener(sFlutterUiDisplayListener);
        }
    }

    private static io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint createDartEntryPoint(com.tencent.skyline.SkylineConfig skylineConfig) {
        return new io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint(io.flutter.FlutterInjector.instance().flutterLoader().findAppBundlePath(), skylineConfig.getLibraryURI(), skylineConfig.getEntryPointName());
    }

    public static boolean createFlutterEngine(android.content.Context context, final com.tencent.skyline.SkylineConfig skylineConfig) {
        final io.flutter.embedding.engine.FlutterEngine spawnExport;
        final android.content.res.AssetManager assets;
        final int id6 = skylineConfig.getId();
        com.tencent.skyline.SkylineLog.i(TAG, "createFlutterEngine id:" + id6 + " config:" + skylineConfig.toJSON());
        if (activeEngines.containsKey(java.lang.Integer.valueOf(id6))) {
            com.tencent.skyline.SkylineLog.w(TAG, "already init flutter engine, return");
            return true;
        }
        long runtimePtr = isSingleFlutterEngineGroup() ? 0L : skylineConfig.getRuntimePtr();
        if (!runtimePtr2Id.containsKey(java.lang.Long.valueOf(runtimePtr))) {
            final io.flutter.embedding.engine.FlutterJNI flutterJNI = getFlutterJNI(runtimePtr);
            boolean z17 = flutterJNI != null;
            skylineConfig.setPreloadTaskRunner(z17);
            if (!z17) {
                flutterJNI = new io.flutter.embedding.engine.FlutterJNI();
            }
            runtimePtr2Id.put(java.lang.Long.valueOf(runtimePtr), java.lang.Integer.valueOf(id6));
            spawnExport = createFlutterEngine(context, id6, flutterJNI);
            runOnMainThread(new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.skyline.SkylineLogic.lambda$createFlutterEngine$1(io.flutter.embedding.engine.FlutterEngine.this, skylineConfig);
                }
            });
            final io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint createDartEntryPoint = createDartEntryPoint(skylineConfig);
            if (z17) {
                try {
                    assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
                } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                    assets = context.getAssets();
                }
                runOnMainThread(new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.skyline.SkylineLogic.lambda$createFlutterEngine$2(io.flutter.embedding.engine.FlutterJNI.this, createDartEntryPoint, assets, spawnExport);
                    }
                });
            } else {
                runOnMainThread(new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.skyline.SkylineLogic.lambda$createFlutterEngine$3(io.flutter.embedding.engine.FlutterEngine.this, createDartEntryPoint);
                    }
                });
            }
            if (isSingleFlutterEngineGroup()) {
                firstId = id6;
            }
        } else {
            spawnExport = spawnExport(context, id6, runtimePtr, createDartEntryPoint(skylineConfig), skylineConfig);
        }
        io.flutter.embedding.engine.FlutterEngine flutterEngine = spawnExport;
        if (flutterEngine == null) {
            com.tencent.skyline.SkylineLog.e(TAG, "createFlutterEngine fail, return");
            return false;
        }
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), SKYLINE_NAME);
        activeEngines.put(java.lang.Integer.valueOf(id6), new com.tencent.skyline.FlutterEngineAddon(flutterEngine, new io.flutter.plugin.common.MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), SKYLINE_INIT_NAME), new io.flutter.plugin.common.MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), SKYLINE_TEXTURE), new com.tencent.skyline.jsapi.SkylineJsApiInvoker(new com.tencent.skyline.jsapi.JsApiMethodChannelExecutor(flutterEngine.getDartExecutor().getBinaryMessenger())), skylineConfig));
        flutterEngine.addEngineLifecycleListener(new io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener() { // from class: com.tencent.skyline.SkylineLogic.1
            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onEngineWillDestroy() {
                com.tencent.skyline.SkylineLog.i(com.tencent.skyline.SkylineLogic.TAG, "onEngineWillDestroy id:" + id6);
                com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = (com.tencent.skyline.FlutterEngineAddon) com.tencent.skyline.SkylineLogic.activeEngines.remove(java.lang.Integer.valueOf(id6));
                if (com.tencent.skyline.SkylineLogic.access$100() || flutterEngineAddon == null) {
                    return;
                }
                com.tencent.skyline.SkylineConfig config = flutterEngineAddon.getConfig();
                if (config.getCreateRuntime()) {
                    com.tencent.skyline.SkylineLog.i(com.tencent.skyline.SkylineLogic.TAG, "flutterJNIs remove id:" + id6 + " runtimePtr:" + config.getRuntimePtr());
                    com.tencent.skyline.SkylineLogic.runtimePtr2Id.remove(java.lang.Long.valueOf(config.getRuntimePtr()));
                    com.tencent.skyline.SkylineLogic.preloadFlutterJNIs.remove(java.lang.Long.valueOf(config.getRuntimePtr()));
                }
            }

            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onPreEngineRestart() {
            }
        });
        methodChannel.setMethodCallHandler(new com.tencent.skyline.SkylineLogic$$d());
        flutterEngine.getPlatformViewsController().attach(context, flutterEngine.getRenderer(), flutterEngine.getDartExecutor());
        return true;
    }

    public static io.flutter.embedding.android.FlutterView createFlutterView(android.content.Context context, int i17, int i18, int i19) {
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? new io.flutter.embedding.android.FlutterView(context, new io.flutter.embedding.android.FlutterTextureView(context)) : new io.flutter.embedding.android.FlutterView(context, new io.flutter.embedding.android.FlutterImageView(context, i17, i18, io.flutter.embedding.android.FlutterImageView.SurfaceKind.background)) : new io.flutter.embedding.android.FlutterView(context, new io.flutter.embedding.android.FlutterSurfaceView(context)) : new io.flutter.embedding.android.FlutterView(context, new io.flutter.embedding.android.FlutterTextureView(context));
    }

    public static void destroyFlutterEngine(int i17) {
        if (isSingleFlutterEngineGroup()) {
            if (firstId == i17) {
                com.tencent.skyline.SkylineLog.i(TAG, "destroyFlutterEngine id:" + i17 + " ignore, when singleFlutterEngineGroup");
                return;
            }
            return;
        }
        com.tencent.skyline.FlutterEngineAddon remove = activeEngines.remove(java.lang.Integer.valueOf(i17));
        if (remove != null) {
            remove.getFlutterEngine().destroy();
            com.tencent.skyline.SkylineConfig config = remove.getConfig();
            if (config.getCreateRuntime()) {
                com.tencent.skyline.SkylineLog.i(TAG, "destroyFlutterEngine flutterJNIs remove id:" + i17 + " runtimePtr:" + config.getRuntimePtr());
                runtimePtr2Id.remove(java.lang.Long.valueOf(config.getRuntimePtr()));
            }
        }
    }

    public static void destroyTaskRunner(long j17) {
        com.tencent.skyline.SkylineLog.i(TAG, "destroyTaskRunner " + j17);
        com.tencent.skyline.FlutterJNIAddon remove = preloadFlutterJNIs.remove(java.lang.Long.valueOf(j17));
        if (remove != null) {
            remove.getTaskRunnerJNI().destroy();
        }
    }

    public static void detachFlutterView(io.flutter.embedding.android.FlutterView flutterView) {
        flutterView.detachFromFlutterEngine();
        flutterView.removeOnFirstFrameRenderedListener(sFlutterUiDisplayListener);
    }

    public static io.flutter.embedding.engine.FlutterEngine getFlutterEngine(int i17) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(i17));
        if (flutterEngineAddon != null) {
            return flutterEngineAddon.getFlutterEngine();
        }
        return null;
    }

    @java.lang.Deprecated
    public static io.flutter.embedding.engine.FlutterJNI getFlutterJNI() {
        return null;
    }

    @java.lang.Deprecated
    public static io.flutter.embedding.engine.TaskRunnerJNI getTaskRunner() {
        return null;
    }

    public static io.flutter.plugin.common.MethodChannel getTextureChannel(int i17) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(i17));
        if (flutterEngineAddon != null) {
            return flutterEngineAddon.getSkylineTextureChannel();
        }
        return null;
    }

    public static synchronized void init(final android.content.Context context) {
        synchronized (com.tencent.skyline.SkylineLogic.class) {
            if (!isInit) {
                isInit = true;
                initLibrary();
                activeEngines = new java.util.HashMap<>();
                mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
                final io.flutter.FlutterInjector instance = io.flutter.FlutterInjector.instance();
                runOnMainThread(new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$f
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.skyline.SkylineLogic.lambda$init$0(io.flutter.FlutterInjector.this, context);
                    }
                });
            }
        }
    }

    public static synchronized void initAsync(android.content.Context context, final java.lang.Runnable runnable) {
        synchronized (com.tencent.skyline.SkylineLogic.class) {
            if (!isInit) {
                isInit = true;
                initLibrary();
                activeEngines = new java.util.HashMap<>();
                mainHandler = new android.os.Handler(android.os.Looper.getMainLooper());
                io.flutter.FlutterInjector instance = io.flutter.FlutterInjector.instance();
                if (instance.flutterLoader().initialized()) {
                    java.util.Objects.requireNonNull(runnable);
                    runOnMainThread(new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$e
                        @Override // java.lang.Runnable
                        public final void run() {
                            runnable.run();
                        }
                    });
                } else {
                    instance.flutterLoader().startInitializationAsync(context);
                    io.flutter.embedding.engine.FlutterShellArgs flutterShellArgs = new io.flutter.embedding.engine.FlutterShellArgs(new java.lang.String[0]);
                    flutterShellArgs.add(io.flutter.embedding.engine.FlutterShellArgs.ARG_BIND_CPU_CORES);
                    flutterShellArgs.add("--no-enable-merged-platform-ui-thread");
                    flutterShellArgs.add(io.flutter.embedding.engine.FlutterShellArgs.ARG_DISABLE_IMPELLER);
                    io.flutter.embedding.engine.loader.FlutterLoader flutterLoader = instance.flutterLoader();
                    java.lang.String[] array = flutterShellArgs.toArray();
                    android.os.Handler handler = mainHandler;
                    java.util.Objects.requireNonNull(runnable);
                    flutterLoader.ensureInitializationCompleteAsync(context, array, handler, new java.lang.Runnable() { // from class: com.tencent.skyline.SkylineLogic$$e
                        @Override // java.lang.Runnable
                        public final void run() {
                            runnable.run();
                        }
                    });
                }
            }
        }
    }

    private static void initLibrary() {
        com.tencent.skyline.jni.SkylineLibraryLoader.beforeLoad();
        com.tencent.skyline.jni.SkylineLibraryLoader.load("skyline");
        com.tencent.skyline.jni.SkylineLibraryLoader.afterLoad();
    }

    public static synchronized void initMode(int i17) {
        synchronized (com.tencent.skyline.SkylineLogic.class) {
            com.tencent.skyline.SkylineLog.i(TAG, "initMode mode:" + i17);
            mode = i17;
        }
    }

    public static void invokeJsApi(int i17, java.lang.String str, org.json.JSONObject jSONObject, int i18, com.tencent.skyline.jsapi.SkylineJsApiInvoker.SkylineJsApiCallback skylineJsApiCallback) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(i17));
        if (flutterEngineAddon != null) {
            flutterEngineAddon.getJsApiInvoker().invoke(str, jSONObject, i18, skylineJsApiCallback);
        }
    }

    private static boolean isSingleFlutterEngineGroup() {
        return mode == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFlutterEngine$1(io.flutter.embedding.engine.FlutterEngine flutterEngine, com.tencent.skyline.SkylineConfig skylineConfig) {
        flutterEngine.getNavigationChannel().setInitialRoute(skylineConfig.toJSON());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFlutterEngine$2(io.flutter.embedding.engine.FlutterJNI flutterJNI, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint, android.content.res.AssetManager assetManager, io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        if (flutterJNI.isAttached()) {
            flutterJNI.runBundleAndSnapshotFromLibrary(dartEntrypoint.pathToBundle, dartEntrypoint.dartEntrypointFunctionName, dartEntrypoint.dartEntrypointLibrary, assetManager, null, flutterEngine.getEngineId());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFlutterEngine$3(io.flutter.embedding.engine.FlutterEngine flutterEngine, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint) {
        flutterEngine.getDartExecutor().executeDartEntrypoint(dartEntrypoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFlutterEngine$4(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        com.tencent.skyline.SkylineLog.w(TAG, methodCall.method + " not support.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$0(io.flutter.FlutterInjector flutterInjector, android.content.Context context) {
        if (flutterInjector.flutterLoader().initialized()) {
            return;
        }
        flutterInjector.flutterLoader().startInitialization(context.getApplicationContext());
        io.flutter.embedding.engine.FlutterShellArgs flutterShellArgs = new io.flutter.embedding.engine.FlutterShellArgs(new java.lang.String[0]);
        flutterShellArgs.add("--no-enable-merged-platform-ui-thread");
        flutterShellArgs.add(io.flutter.embedding.engine.FlutterShellArgs.ARG_DISABLE_IMPELLER);
        flutterInjector.flutterLoader().ensureInitializationComplete(context, flutterShellArgs.toArray());
    }

    public static android.graphics.Bitmap obtainBitmap(int i17) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(i17));
        if (flutterEngineAddon != null) {
            return flutterEngineAddon.getFlutterEngine().getRenderer().getBitmap();
        }
        return null;
    }

    public static io.flutter.embedding.engine.renderer.FlutterRenderer obtainRenderer(int i17) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(i17));
        if (flutterEngineAddon != null) {
            return flutterEngineAddon.getFlutterEngine().getRenderer();
        }
        return null;
    }

    public static void preloadFlutterJNI(long j17) {
        if (java.lang.Thread.currentThread().getId() == mainHandler.getLooper().getThread().getId()) {
            com.tencent.skyline.FlutterJNIAddon flutterJNIAddon = preloadFlutterJNIs.get(java.lang.Long.valueOf(j17));
            if (flutterJNIAddon == null || flutterJNIAddon.getFlutterJNI() == null) {
                return;
            }
            flutterJNIAddon.getFlutterJNI().attachToNative();
            return;
        }
        com.tencent.skyline.FlutterJNIAddon flutterJNIAddon2 = preloadFlutterJNIs.get(java.lang.Long.valueOf(j17));
        if (flutterJNIAddon2 != null) {
            flutterJNIAddon2.getFlutterJNI().attachNotInMainThread();
        }
    }

    public static void preloadTaskRunner(long j17) {
        com.tencent.skyline.SkylineLog.i(TAG, "preloadTaskRunner " + j17);
        io.flutter.embedding.engine.FlutterJNI flutterJNI = new io.flutter.embedding.engine.FlutterJNI();
        io.flutter.embedding.engine.TaskRunnerJNI taskRunnerJNI = new io.flutter.embedding.engine.TaskRunnerJNI();
        flutterJNI.attachUITaskRunner(taskRunnerJNI);
        preloadFlutterJNIs.put(java.lang.Long.valueOf(j17), new com.tencent.skyline.FlutterJNIAddon(flutterJNI, taskRunnerJNI));
    }

    public static void reportMemoryUsage(int i17) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(i17));
        if (flutterEngineAddon != null) {
            flutterEngineAddon.getFlutterEngine().getStatChannel().reportMemoryUsage();
        }
    }

    private static void runOnMainThread(java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread().getId() == mainHandler.getLooper().getThread().getId()) {
            runnable.run();
        } else {
            mainHandler.post(runnable);
        }
    }

    private static io.flutter.embedding.engine.FlutterEngine spawnExport(android.content.Context context, int i17, long j17, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint, com.tencent.skyline.SkylineConfig skylineConfig) {
        com.tencent.skyline.FlutterEngineAddon flutterEngineAddon = activeEngines.get(java.lang.Integer.valueOf(runtimePtr2Id.get(java.lang.Long.valueOf(j17)).intValue()));
        if (flutterEngineAddon != null) {
            return flutterEngineAddon.getFlutterEngine().spawn(context, dartEntrypoint, skylineConfig.toJSON(), null, new io.flutter.plugin.platform.SkylinePlatformViewsController(i17), true, false, false, true);
        }
        throw new java.lang.IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    public static java.lang.String version() {
        return "skyline/1.4.20 (-1;#1290;8a7dd6a5a5214e9082c18cdb4f02400b11e7002d;engine-c84b1c37a5875c60a6955c9235badf69804192be;)";
    }

    public static io.flutter.embedding.engine.FlutterJNI getFlutterJNI(long j17) {
        com.tencent.skyline.FlutterJNIAddon flutterJNIAddon = preloadFlutterJNIs.get(java.lang.Long.valueOf(j17));
        if (flutterJNIAddon != null) {
            return flutterJNIAddon.getFlutterJNI();
        }
        return null;
    }

    public static io.flutter.embedding.engine.TaskRunnerJNI getTaskRunner(long j17) {
        com.tencent.skyline.FlutterJNIAddon flutterJNIAddon = preloadFlutterJNIs.get(java.lang.Long.valueOf(j17));
        if (flutterJNIAddon != null) {
            return flutterJNIAddon.getTaskRunnerJNI();
        }
        return null;
    }

    @java.lang.Deprecated
    public static void preloadTaskRunner() {
        com.tencent.skyline.SkylineLog.w(TAG, "preloadTaskRunner");
    }

    @java.lang.Deprecated
    public static void preloadFlutterJNI() {
        com.tencent.skyline.SkylineLog.w(TAG, "preloadFlutterJNI");
    }

    private static io.flutter.embedding.engine.FlutterEngine createFlutterEngine(android.content.Context context, int i17, io.flutter.embedding.engine.FlutterJNI flutterJNI) {
        return new io.flutter.embedding.engine.FlutterEngine(context, null, flutterJNI, new io.flutter.plugin.platform.SkylinePlatformViewsController(i17), null, true);
    }
}
