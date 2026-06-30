package qx4;

/* loaded from: classes8.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f367412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(int i17) {
        super(0);
        this.f367412d = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qx4.l0 l0Var = qx4.l0.f367422a;
        int i17 = this.f367412d;
        qx4.m0 b17 = l0Var.b(i17);
        if (b17 != null) {
            try {
                com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView = b17.f367427c;
                if (baseWebSearchWebView != null) {
                    baseWebSearchWebView.clearHistory();
                }
                com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView2 = b17.f367427c;
                if (baseWebSearchWebView2 != null) {
                    baseWebSearchWebView2.clearView();
                }
                com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView3 = b17.f367427c;
                if (baseWebSearchWebView3 != null) {
                    baseWebSearchWebView3.destroy();
                }
                b17.f367427c = null;
                qx4.l0.f367423b.remove(java.lang.Integer.valueOf(i17));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WebSearchPreloadLogic", jz5.a.b(e17));
            }
        }
        return jz5.f0.f302826a;
    }
}
