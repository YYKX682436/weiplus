package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class y extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.a0 f184727a;

    public y(com.tencent.mm.plugin.webview.ui.tools.fts.a0 a0Var, com.tencent.mm.plugin.webview.ui.tools.fts.l lVar) {
        this.f184727a = a0Var;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.fts.a0 a0Var = this.f184727a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "scene %d, onPageFinished %s", java.lang.Integer.valueOf(a0Var.f184334c.Y3), str);
        a0Var.f184334c.showOptionMenu(false);
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = a0Var.f184334c;
        if (baseSOSWebViewUI.J4 != null && !baseSOSWebViewUI.R3) {
            baseSOSWebViewUI.getClass();
            a0Var.f184334c.J4.d();
            a0Var.f184334c.hideVKB();
        }
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI2 = a0Var.f184334c;
        boolean z17 = baseSOSWebViewUI2.A3;
        if (z17) {
            return;
        }
        su4.k2.f(baseSOSWebViewUI2.Y3, baseSOSWebViewUI2.B3, baseSOSWebViewUI2.C3, true, baseSOSWebViewUI2.f184246c4, baseSOSWebViewUI2.f184244a4, "", z17, baseSOSWebViewUI2.f184250g4);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.fts.a0 a0Var = this.f184727a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "scene %d,onPageStarted %s", java.lang.Integer.valueOf(a0Var.f184334c.Y3), str);
        a0Var.f184334c.showOptionMenu(false);
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = a0Var.f184334c;
        if (baseSOSWebViewUI.J4 != null && !baseSOSWebViewUI.R3) {
            baseSOSWebViewUI.getClass();
            a0Var.f184334c.J4.d();
            a0Var.f184334c.hideVKB();
        }
        com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI2 = a0Var.f184334c;
        boolean z17 = baseSOSWebViewUI2.A3;
        if (z17) {
            return;
        }
        su4.k2.g(baseSOSWebViewUI2.Y3, baseSOSWebViewUI2.B3, baseSOSWebViewUI2.C3, true, baseSOSWebViewUI2.f184246c4, baseSOSWebViewUI2.f184244a4, "", z17, baseSOSWebViewUI2.f184250g4);
    }
}
