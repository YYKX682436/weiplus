package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class a4 extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.b4 f184340a;

    public a4(com.tencent.mm.plugin.webview.ui.tools.fts.b4 b4Var, com.tencent.mm.plugin.webview.ui.tools.fts.p3 p3Var) {
        this.f184340a = b4Var;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "onPageFinished %s", str);
        com.tencent.mm.plugin.webview.ui.tools.fts.b4 b4Var = this.f184340a;
        b4Var.f184356c.showOptionMenu(false);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI = b4Var.f184356c;
        if (fTSWeAppBaseWebViewUI.F4 == null || fTSWeAppBaseWebViewUI.R3) {
            return;
        }
        fTSWeAppBaseWebViewUI.getClass();
        b4Var.f184356c.F4.getFtsEditText().d();
        b4Var.f184356c.hideVKB();
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSWeAppBaseWebViewUI", "onPageStarted %s", str);
        com.tencent.mm.plugin.webview.ui.tools.fts.b4 b4Var = this.f184340a;
        b4Var.f184356c.showOptionMenu(false);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSWeAppBaseWebViewUI fTSWeAppBaseWebViewUI = b4Var.f184356c;
        tj5.z zVar = fTSWeAppBaseWebViewUI.F4;
        if (zVar != null && !fTSWeAppBaseWebViewUI.R3) {
            zVar.getFtsEditText().d();
            fTSWeAppBaseWebViewUI.hideVKB();
        }
        su4.k3.f(fTSWeAppBaseWebViewUI.K4, 1);
        su4.k3.g(fTSWeAppBaseWebViewUI.K4, 1, 0, 0, "");
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void i(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            com.tencent.mm.plugin.webview.ui.tools.fts.b4 b4Var = this.f184340a;
            if (str2.equals(b4Var.f184356c.F7())) {
                su4.k3.f(b4Var.f184356c.K4, 16);
            }
        }
    }
}
