package ox5;

/* loaded from: classes15.dex */
public interface l extends io.flutter.embedding.android.FlutterEngineConfigurator {
    default boolean b0(java.lang.Runnable runnable) {
        return false;
    }

    /* renamed from: getActivity */
    android.app.Activity m42getActivity();

    java.lang.String getAppBundlePath();

    java.lang.String getCachedEngineId();

    android.content.Context getContext();

    java.lang.String getDartEntrypointFunctionName();

    mx5.b getFlutterActivity();

    java.lang.String getInitialRoute();

    /* renamed from: getLifecycle */
    androidx.lifecycle.o mo133getLifecycle();

    io.flutter.embedding.android.RenderMode getRenderMode();

    io.flutter.embedding.android.TransparencyMode getTransparencyMode();

    void onFlutterUiDisplayed();

    io.flutter.plugin.platform.PlatformPlugin providePlatformPlugin(android.app.Activity activity, io.flutter.embedding.engine.FlutterEngine flutterEngine);

    boolean shouldAttachEngineToActivity();
}
