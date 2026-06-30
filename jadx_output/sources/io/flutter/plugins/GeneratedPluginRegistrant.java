package io.flutter.plugins;

/* loaded from: classes11.dex */
public final class GeneratedPluginRegistrant {
    private static final java.lang.String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(io.flutter.embedding.engine.FlutterEngine flutterEngine) {
        try {
            flutterEngine.getPlugins().add(new ty5.a());
        } catch (java.lang.Exception e17) {
            io.flutter.Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e17);
        }
        try {
            flutterEngine.getPlugins().add(new vy5.h());
        } catch (java.lang.Exception e18) {
            io.flutter.Log.e(TAG, "Error registering plugin connectivity_plus, dev.fluttercommunity.plus.connectivity.ConnectivityPlugin", e18);
        }
        try {
            flutterEngine.getPlugins().add(new k8.d());
        } catch (java.lang.Exception e19) {
            io.flutter.Log.e(TAG, "Error registering plugin orientation, com.github.sososdk.orientation.OrientationPlugin", e19);
        }
        try {
            flutterEngine.getPlugins().add(new uy5.a());
        } catch (java.lang.Exception e27) {
            io.flutter.Log.e(TAG, "Error registering plugin package_info_plus, dev.fluttercommunity.plus.packageinfo.PackageInfoPlugin", e27);
        }
        try {
            flutterEngine.getPlugins().add(new io.flutter.plugins.pathprovider.PathProviderPlugin());
        } catch (java.lang.Exception e28) {
            io.flutter.Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e28);
        }
        try {
            flutterEngine.getPlugins().add(new yy5.a());
        } catch (java.lang.Exception e29) {
            io.flutter.Log.e(TAG, "Error registering plugin screen, flutter.plugins.screen.screen.ScreenPlugin", e29);
        }
        try {
            flutterEngine.getPlugins().add(new zi0.f());
        } catch (java.lang.Exception e37) {
            io.flutter.Log.e(TAG, "Error registering plugin video_player, com.tencent.mm.flutter.plugins.videoplayer.VideoPlayerPlugin", e37);
        }
    }
}
