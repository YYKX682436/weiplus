package pf1;

/* loaded from: classes7.dex */
public final class l extends com.tencent.xweb.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf1.n f353780a;

    public l(pf1.n nVar) {
        this.f353780a = nVar;
    }

    @Override // com.tencent.xweb.h1
    public void m(com.tencent.xweb.WebView webView, java.lang.String str) {
        this.f353780a.b();
    }

    @Override // com.tencent.xweb.h1
    public void n(com.tencent.xweb.WebView webView, java.lang.String str) {
        this.f353780a.b();
    }

    @Override // com.tencent.xweb.h1
    public void o(com.tencent.xweb.WebView webView, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f353780a.getClass();
    }

    @Override // com.tencent.xweb.h1
    public void p(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        this.f353780a.c(str2, i17, str);
    }

    @Override // com.tencent.xweb.h1
    public void q(com.tencent.xweb.WebView webView, com.tencent.xweb.x0 x0Var, com.tencent.xweb.w0 w0Var) {
        if (w0Var == null) {
            return;
        }
        java.lang.String url = webView != null ? webView.getUrl() : null;
        int b17 = w0Var.b();
        java.lang.CharSequence a17 = w0Var.a();
        this.f353780a.c(url, b17, a17 != null ? a17.toString() : null);
    }
}
