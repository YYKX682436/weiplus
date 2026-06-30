package io.flutter.embedding.engine;

/* loaded from: classes11.dex */
public class WxaFlutterEngineGroup {
    final java.util.List<io.flutter.embedding.engine.FlutterEngine> activeEngines;

    public WxaFlutterEngineGroup(android.content.Context context) {
        this(context, null);
    }

    public io.flutter.embedding.engine.FlutterEngine createAndRunDefaultEngine(android.content.Context context) {
        return createAndRunEngine(context, null);
    }

    public io.flutter.embedding.engine.FlutterEngine createAndRunEngine(android.content.Context context, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint) {
        return createAndRunEngine(context, dartEntrypoint, null);
    }

    public io.flutter.embedding.engine.FlutterEngine createEngine(android.content.Context context) {
        return new io.flutter.embedding.engine.FlutterEngine(context, new java.lang.String[0]);
    }

    public WxaFlutterEngineGroup(android.content.Context context, java.lang.String[] strArr) {
        this.activeEngines = new java.util.ArrayList();
        io.flutter.embedding.engine.loader.FlutterLoader flutterLoader = io.flutter.FlutterInjector.instance().flutterLoader();
        if (flutterLoader.initialized()) {
            return;
        }
        flutterLoader.startInitialization(context.getApplicationContext());
        flutterLoader.ensureInitializationComplete(context, strArr);
    }

    public io.flutter.embedding.engine.FlutterEngine createAndRunEngine(android.content.Context context, io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint, java.lang.String str) {
        final io.flutter.embedding.engine.FlutterEngine spawn;
        if (dartEntrypoint == null) {
            dartEntrypoint = io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint.createDefault();
        }
        io.flutter.embedding.engine.dart.DartExecutor.DartEntrypoint dartEntrypoint2 = dartEntrypoint;
        if (this.activeEngines.size() == 0) {
            spawn = createEngine(context);
            if (str != null) {
                spawn.getNavigationChannel().setInitialRoute(str);
            }
        } else {
            spawn = this.activeEngines.get(0).spawn(context, dartEntrypoint2, str, null, null, false, false);
        }
        this.activeEngines.add(spawn);
        spawn.addEngineLifecycleListener(new io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener() { // from class: io.flutter.embedding.engine.WxaFlutterEngineGroup.1
            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onEngineWillDestroy() {
                io.flutter.embedding.engine.WxaFlutterEngineGroup.this.activeEngines.remove(spawn);
            }

            @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
            public void onPreEngineRestart() {
            }
        });
        return spawn;
    }
}
