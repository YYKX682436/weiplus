package io.flutter.embedding.android;

/* loaded from: classes13.dex */
public class FlutterPlayStoreSplitApplication extends com.google.android.play.core.splitcompat.SplitCompatApplication {
    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate() {
        super.onCreate();
        io.flutter.FlutterInjector.setInstance(new io.flutter.FlutterInjector.Builder().setDeferredComponentManager(new io.flutter.embedding.engine.deferredcomponents.PlayStoreDeferredComponentManager(this, null)).build());
    }
}
