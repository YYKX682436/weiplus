package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class g1 extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.h1 f184418a;

    public g1(com.tencent.mm.plugin.webview.ui.tools.fts.h1 h1Var, com.tencent.mm.plugin.webview.ui.tools.fts.v0 v0Var) {
        this.f184418a = h1Var;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onPageFinished %s", str);
        com.tencent.mm.plugin.webview.ui.tools.fts.h1 h1Var = this.f184418a;
        h1Var.f184428c.showOptionMenu(false);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI = h1Var.f184428c;
        if (fTSBaseWebViewUI.F4 == null || fTSBaseWebViewUI.R3) {
            return;
        }
        fTSBaseWebViewUI.getClass();
        h1Var.f184428c.F4.getFtsEditText().d();
        h1Var.f184428c.hideVKB();
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSBaseWebViewUI", "onPageStarted %s", str);
        com.tencent.mm.plugin.webview.ui.tools.fts.h1 h1Var = this.f184418a;
        h1Var.f184428c.showOptionMenu(false);
        com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI fTSBaseWebViewUI = h1Var.f184428c;
        com.tencent.mm.ui.search.WebSearchView webSearchView = fTSBaseWebViewUI.F4;
        if (webSearchView != null && !fTSBaseWebViewUI.R3) {
            webSearchView.getFtsEditText().d();
            fTSBaseWebViewUI.hideVKB();
        }
        su4.k3.f(fTSBaseWebViewUI.K4, 1);
        su4.k3.g(fTSBaseWebViewUI.K4, 1, 0, 0, "");
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void i(com.tencent.xweb.WebView webView, int i17, java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            com.tencent.mm.plugin.webview.ui.tools.fts.h1 h1Var = this.f184418a;
            if (str2.equals(h1Var.f184428c.F7())) {
                su4.k3.f(h1Var.f184428c.K4, 16);
            }
        }
    }
}
