package qx4;

/* loaded from: classes8.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final qx4.h0 f367409d = new qx4.h0();

    public h0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView2;
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView baseWebSearchWebView3;
        for (java.util.Map.Entry entry : qx4.l0.f367423b.entrySet()) {
            int intValue = ((java.lang.Number) entry.getKey()).intValue();
            qx4.m0 m0Var = (qx4.m0) entry.getValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchPreloadLogic", "MultiWebView-Trace destroy " + ((m0Var != null ? m0Var.f367427c : null) != null ? 1 : 0) + " webView for WebSearch, preloadScene:" + intValue);
            if (m0Var != null && (baseWebSearchWebView3 = m0Var.f367427c) != null) {
                baseWebSearchWebView3.clearHistory();
            }
            if (m0Var != null && (baseWebSearchWebView2 = m0Var.f367427c) != null) {
                baseWebSearchWebView2.clearView();
            }
            if (m0Var != null && (baseWebSearchWebView = m0Var.f367427c) != null) {
                baseWebSearchWebView.destroy();
            }
            if (m0Var != null) {
                m0Var.f367427c = null;
            }
        }
        qx4.l0.f367423b.clear();
        return jz5.f0.f302826a;
    }
}
