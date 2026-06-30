package com.unionpay;

/* loaded from: classes13.dex */
final class ab extends android.webkit.WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.b f220699a;

    public ab(com.unionpay.b bVar, byte b17) {
        this.f220699a = bVar;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(android.webkit.ConsoleMessage consoleMessage) {
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(android.webkit.WebView webView, java.lang.String str, java.lang.String str2, android.webkit.JsResult jsResult) {
        jsResult.cancel();
        android.widget.Toast.makeText(this.f220699a.f220701e, str2, 0).show();
        return true;
    }
}
