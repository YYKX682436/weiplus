package yd;

/* loaded from: classes7.dex */
public class h implements yd.z {

    /* renamed from: d, reason: collision with root package name */
    public android.webkit.WebView f460950d;

    @Override // yd.z
    public void N7(yd.y yVar) {
        this.f460950d.setWebViewClient(new yd.g(this, yVar));
    }

    @Override // yd.z
    public yd.w O4() {
        return new yd.f(this, this.f460950d.getSettings());
    }

    @Override // yd.z
    public void Pf(android.content.Context context) {
        this.f460950d = new android.webkit.WebView(context);
    }

    @Override // yd.z
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        this.f460950d.addJavascriptInterface(obj, str);
    }

    @Override // yd.z
    public void destroy() {
        this.f460950d.destroy();
    }

    @Override // yd.z
    public android.view.View getView() {
        return this.f460950d;
    }

    @Override // yd.z
    public void jf(java.lang.String str) {
        this.f460950d.evaluateJavascript(str, null);
    }

    @Override // yd.z
    public void loadUrl(java.lang.String str) {
        this.f460950d.loadUrl(str);
    }
}
