package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class JavaScriptChannelHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelHostApi {
    private final io.flutter.plugins.webviewflutter.JavaScriptChannelFlutterApiImpl flutterApi;
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;
    private final io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl.JavaScriptChannelCreator javaScriptChannelCreator;
    private android.os.Handler platformThreadHandler;

    /* loaded from: classes16.dex */
    public static class JavaScriptChannelCreator {
        public io.flutter.plugins.webviewflutter.JavaScriptChannel createJavaScriptChannel(io.flutter.plugins.webviewflutter.JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, java.lang.String str, android.os.Handler handler) {
            return new io.flutter.plugins.webviewflutter.JavaScriptChannel(javaScriptChannelFlutterApiImpl, str, handler);
        }
    }

    public JavaScriptChannelHostApiImpl(io.flutter.plugins.webviewflutter.InstanceManager instanceManager, io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl.JavaScriptChannelCreator javaScriptChannelCreator, io.flutter.plugins.webviewflutter.JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, android.os.Handler handler) {
        this.instanceManager = instanceManager;
        this.javaScriptChannelCreator = javaScriptChannelCreator;
        this.flutterApi = javaScriptChannelFlutterApiImpl;
        this.platformThreadHandler = handler;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelHostApi
    public void create(java.lang.Long l17, java.lang.String str) {
        this.instanceManager.addDartCreatedInstance(this.javaScriptChannelCreator.createJavaScriptChannel(this.flutterApi, str, this.platformThreadHandler), l17.longValue());
    }

    public void setPlatformThreadHandler(android.os.Handler handler) {
        this.platformThreadHandler = handler;
    }
}
