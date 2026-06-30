package io.flutter.embedding.engine;

/* loaded from: classes11.dex */
public class FlutterEngineGroup {
    final java.util.List<io.flutter.embedding.engine.FlutterEngine> activeEngines;
    private boolean isShareIsolateMode;
    private io.flutter.embedding.engine.FlutterEngine rootEngine;

    /* loaded from: classes11.dex */
    public static class Options {
        private android.content.Context context;
        private io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint;
        private java.util.List<java.lang.String> dartEntrypointArgs;
        private java.lang.String initialRoute;
        private io.flutter.plugin.platform.PlatformViewsController platformViewsController;
        private boolean automaticallyRegisterPlugins = true;
        private boolean waitForRestorationData = false;

        public Options(android.content.Context context) {
            this.context = context;
        }

        public boolean getAutomaticallyRegisterPlugins() {
            return this.automaticallyRegisterPlugins;
        }

        public android.content.Context getContext() {
            return this.context;
        }

        public io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint getDartEntrypoint() {
            return this.dartEntrypoint;
        }

        public java.util.List<java.lang.String> getDartEntrypointArgs() {
            return this.dartEntrypointArgs;
        }

        public java.lang.String getInitialRoute() {
            return this.initialRoute;
        }

        public io.flutter.plugin.platform.PlatformViewsController getPlatformViewsController() {
            return this.platformViewsController;
        }

        public boolean getWaitForRestorationData() {
            return this.waitForRestorationData;
        }

        public io.flutter.embedding.engine.FlutterEngineGroup.Options setAutomaticallyRegisterPlugins(boolean z17) {
            this.automaticallyRegisterPlugins = z17;
            return this;
        }

        public io.flutter.embedding.engine.FlutterEngineGroup.Options setDartEntrypoint(io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint) {
            this.dartEntrypoint = dartEntrypoint;
            return this;
        }

        public io.flutter.embedding.engine.FlutterEngineGroup.Options setDartEntrypointArgs(java.util.List<java.lang.String> list) {
            this.dartEntrypointArgs = list;
            return this;
        }

        public io.flutter.embedding.engine.FlutterEngineGroup.Options setInitialRoute(java.lang.String str) {
            this.initialRoute = str;
            return this;
        }

        public io.flutter.embedding.engine.FlutterEngineGroup.Options setPlatformViewsController(io.flutter.plugin.platform.PlatformViewsController platformViewsController) {
            this.platformViewsController = platformViewsController;
            return this;
        }

        public io.flutter.embedding.engine.FlutterEngineGroup.Options setWaitForRestorationData(boolean z17) {
            this.waitForRestorationData = z17;
            return this;
        }
    }

    public FlutterEngineGroup(android.content.Context context) {
        this(context, null);
    }

    private io.flutter.embedding.engine.FlutterShellArgs createFlutterShellArgs(java.lang.String[] strArr, boolean z17) {
        if (strArr == null) {
            strArr = new java.lang.String[0];
        }
        return new io.flutter.embedding.engine.FlutterShellArgs(strArr);
    }

    public io.flutter.embedding.engine.FlutterEngine createAndRunDefaultEngine(android.content.Context context) {
        return createAndRunEngine(context, null);
    }

    public io.flutter.embedding.engine.FlutterEngine createAndRunEngine(android.content.Context context, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint) {
        return createAndRunEngine(context, dartEntrypoint, null);
    }

    public io.flutter.embedding.engine.FlutterEngine createEngine(android.content.Context context, io.flutter.plugin.platform.PlatformViewsController platformViewsController, boolean z17, boolean z18, java.lang.String str) {
        return new io.flutter.embedding.engine.FlutterEngine(context, null, null, platformViewsController, null, z17, z18, str, this);
    }

    public FlutterEngineGroup(android.content.Context context, java.lang.String[] strArr) {
        this(context, strArr, false);
    }

    public io.flutter.embedding.engine.FlutterEngine createAndRunEngine(android.content.Context context, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint, java.lang.String str) {
        return createAndRunEngine(context, dartEntrypoint, str, true);
    }

    public FlutterEngineGroup(android.content.Context context, java.lang.String[] strArr, boolean z17) {
        this.activeEngines = new java.util.ArrayList();
        io.flutter.embedding.engine.loader.FlutterLoader flutterLoader = io.flutter.FlutterInjector.instance().flutterLoader();
        this.isShareIsolateMode = z17;
        if (flutterLoader.initialized()) {
            return;
        }
        io.flutter.embedding.engine.FlutterShellArgs createFlutterShellArgs = createFlutterShellArgs(strArr, z17);
        flutterLoader.startInitialization(context.getApplicationContext());
        flutterLoader.ensureInitializationComplete(context.getApplicationContext(), createFlutterShellArgs.toArray());
    }

    public io.flutter.embedding.engine.FlutterEngine createAndRunEngine(android.content.Context context, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint, java.lang.String str, boolean z17) {
        return createAndRunEngine(new io.flutter.embedding.engine.FlutterEngineGroup.Options(context).setDartEntrypoint(dartEntrypoint).setInitialRoute(str).setAutomaticallyRegisterPlugins(z17));
    }

    public io.flutter.embedding.engine.FlutterEngine createAndRunEngine(io.flutter.embedding.engine.FlutterEngineGroup.Options options) {
        final io.flutter.embedding.engine.FlutterEngine spawn;
        android.content.Context context = options.getContext();
        io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint = options.getDartEntrypoint();
        java.lang.String initialRoute = options.getInitialRoute();
        java.util.List<java.lang.String> dartEntrypointArgs = options.getDartEntrypointArgs();
        io.flutter.plugin.platform.PlatformViewsController platformViewsController = options.getPlatformViewsController();
        if (platformViewsController == null) {
            platformViewsController = new io.flutter.plugin.platform.PlatformViewsController();
        }
        io.flutter.plugin.platform.PlatformViewsController platformViewsController2 = platformViewsController;
        boolean automaticallyRegisterPlugins = options.getAutomaticallyRegisterPlugins();
        boolean waitForRestorationData = options.getWaitForRestorationData();
        if (dartEntrypoint == null) {
            dartEntrypoint = io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint.createDefault();
        }
        io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint2 = dartEntrypoint;
        if (this.activeEngines.size() == 0) {
            spawn = createEngine(context, platformViewsController2, automaticallyRegisterPlugins, waitForRestorationData, initialRoute);
            if (initialRoute != null) {
                spawn.getNavigationChannel().setInitialRoute(initialRoute);
            }
            spawn.getDartExecutor().executeDartEntrypoint(dartEntrypoint2, dartEntrypointArgs);
            this.rootEngine = spawn;
        } else {
            spawn = this.activeEngines.get(0).spawn(context, dartEntrypoint2, initialRoute, dartEntrypointArgs, platformViewsController2, automaticallyRegisterPlugins, waitForRestorationData);
        }
        this.activeEngines.add(spawn);
        spawn.addEngineLifecycleListener(new io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener() { // from class: io.flutter.embedding.engine.FlutterEngineGroup.1
            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onEngineWillDestroy() {
                io.flutter.embedding.engine.FlutterEngineGroup.this.activeEngines.remove(spawn);
                if (io.flutter.embedding.engine.FlutterEngineGroup.this.activeEngines.size() == 0) {
                    io.flutter.embedding.engine.FlutterEngineGroup.this.rootEngine = null;
                }
            }

            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onPreEngineRestart() {
            }
        });
        return spawn;
    }
}
