package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class JavaScriptChannel {
    private final io.flutter.plugins.webviewflutter.JavaScriptChannelFlutterApiImpl flutterApi;
    final java.lang.String javaScriptChannelName;
    private final android.os.Handler platformThreadHandler;

    public JavaScriptChannel(io.flutter.plugins.webviewflutter.JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, java.lang.String str, android.os.Handler handler) {
        this.flutterApi = javaScriptChannelFlutterApiImpl;
        this.javaScriptChannelName = str;
        this.platformThreadHandler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$postMessage$0(java.lang.Void r07) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$postMessage$1(java.lang.String str) {
        this.flutterApi.postMessage(this, str, new io.flutter.plugins.webviewflutter.JavaScriptChannel$$a());
    }

    @android.webkit.JavascriptInterface
    public void postMessage(final java.lang.String str) {
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: io.flutter.plugins.webviewflutter.JavaScriptChannel$$b
            @Override // java.lang.Runnable
            public final void run() {
                io.flutter.plugins.webviewflutter.JavaScriptChannel.this.lambda$postMessage$1(str);
            }
        };
        if (this.platformThreadHandler.getLooper() == android.os.Looper.myLooper()) {
            runnable.run();
        } else {
            this.platformThreadHandler.post(runnable);
        }
    }
}
