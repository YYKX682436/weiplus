package io.flutter.plugins.webviewflutter;

/* loaded from: classes13.dex */
public class JavaObjectHostApiImpl implements io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectHostApi {
    private final io.flutter.plugins.webviewflutter.InstanceManager instanceManager;

    public JavaObjectHostApiImpl(io.flutter.plugins.webviewflutter.InstanceManager instanceManager) {
        this.instanceManager = instanceManager;
    }

    @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectHostApi
    public void dispose(java.lang.Long l17) {
        java.lang.Object instanceManager = this.instanceManager.getInstance(l17.longValue());
        if (instanceManager instanceof io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewPlatformView) {
            ((io.flutter.plugins.webviewflutter.WebViewHostApiImpl.WebViewPlatformView) instanceManager).destroy();
        }
        this.instanceManager.remove(l17.longValue());
    }
}
