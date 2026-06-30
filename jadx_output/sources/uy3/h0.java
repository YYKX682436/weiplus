package uy3;

/* loaded from: classes8.dex */
public final class h0 extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f431943a;

    public h0(uy3.j0 j0Var) {
        this.f431943a = j0Var;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void f(com.tencent.xweb.WebView webView, java.lang.String str) {
        m();
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        m();
    }

    public final void m() {
        uy3.j0 j0Var = this.f431943a;
        if (j0Var.C) {
            return;
        }
        j0Var.C = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxDialog", "webViewReady showAfterWebViewReady: %b, pendingShow: %b", java.lang.Boolean.valueOf(j0Var.B), java.lang.Boolean.valueOf(j0Var.D));
        if (j0Var.B && j0Var.D) {
            j0Var.D = false;
            j0Var.show();
        }
    }
}
