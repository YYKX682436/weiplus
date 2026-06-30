package ka1;

@j95.b
/* loaded from: classes7.dex */
public class g extends i95.w implements yd.z {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.xweb.WebView f305995d;

    @Override // yd.z
    public void N7(yd.y yVar) {
        this.f305995d.setWebViewClient(new ka1.f(this, yVar));
    }

    @Override // yd.z
    public yd.w O4() {
        return new ka1.e(this, this.f305995d.getSettings());
    }

    @Override // yd.z
    public void Pf(android.content.Context context) {
        this.f305995d = new com.tencent.xweb.WebView(context, null);
    }

    @Override // yd.z
    public void addJavascriptInterface(java.lang.Object obj, java.lang.String str) {
        this.f305995d.addJavascriptInterface(obj, str);
    }

    @Override // yd.z
    public void destroy() {
        this.f305995d.destroy();
    }

    @Override // yd.z
    public android.view.View getView() {
        return this.f305995d;
    }

    @Override // yd.z
    public void jf(java.lang.String str) {
        this.f305995d.evaluateJavascript(str, null);
    }

    @Override // yd.z
    public void loadUrl(java.lang.String str) {
        this.f305995d.loadUrl(str);
    }
}
