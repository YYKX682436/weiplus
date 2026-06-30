package pf1;

/* loaded from: classes7.dex */
public final class x implements pf1.d {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f353807d;

    public x(com.tencent.mm.ui.widget.MMWebView webview) {
        kotlin.jvm.internal.o.g(webview, "webview");
        this.f353807d = webview;
    }

    @Override // pf1.d
    public boolean a() {
        return this.f353807d.u(1040);
    }

    @Override // pf1.d
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        this.f353807d.addJavascriptInterface(obj, str);
    }

    @Override // pf1.d
    public void destroy() {
        this.f353807d.destroy();
    }

    @Override // pf1.d
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback valueCallback) {
        this.f353807d.evaluateJavascript(str, valueCallback);
    }

    @Override // pf1.d
    public void onHide() {
        this.f353807d.onHide();
    }

    @Override // pf1.d
    public void onShow() {
        this.f353807d.onShow();
    }
}
