package io.flutter.embedding.engine.plugins.util;

/* loaded from: classes11.dex */
public class GeneratedPluginRegister {
    private static final java.lang.String TAG = "GeneratedPluginsRegister";

    public static void registerGeneratedPlugins(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        try {
            io.flutter.plugins.GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", io.flutter.embedding.engine.FlutterEngine.class).invoke(null, flutterEngine);
        } catch (java.lang.Exception e17) {
            io.flutter.Log.e(TAG, "Tried to automatically register plugins with FlutterEngine (" + flutterEngine + ") but could not find or invoke the GeneratedPluginRegistrant.");
            io.flutter.Log.e(TAG, "Received exception while registering", e17);
        }
    }
}
