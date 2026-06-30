package ey4;

/* loaded from: classes8.dex */
public class q implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter f257628a;

    public q(com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter) {
        this.f257628a = webViewRedesignInputFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        try {
            com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = this.f257628a;
            if (webViewRedesignInputFooter.f187308w) {
                nw4.n nVar = ((com.tencent.mm.plugin.webview.ui.tools.va) webViewRedesignInputFooter.f187293e).f186971a.f183844p0;
                if (nVar != null) {
                    nVar.M(str);
                }
            } else {
                webViewRedesignInputFooter.a(str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewInputFooter", "appendText, exp = %s", e17);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        ey4.t tVar;
        com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewRedesignInputFooter webViewRedesignInputFooter = this.f257628a;
        if (!webViewRedesignInputFooter.f187308w || (tVar = webViewRedesignInputFooter.f187293e) == null) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = webViewRedesignInputFooter.f187300o;
            if (mMEditText != null) {
                mMEditText.t();
                return;
            }
            return;
        }
        nw4.n nVar = ((com.tencent.mm.plugin.webview.ui.tools.va) tVar).f186971a.f183844p0;
        if (nVar != null) {
            nVar.M("[DELETE_EMOTION]");
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
