package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class hc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184812d;

    public hc(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f184812d = webViewUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184812d;
        webViewUI.L1.E(webViewUI.f183847p3);
        webViewUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "resetFloatBallInfo");
        nw4.n nVar = webViewUI.f183844p0;
        if (nVar != null && nVar.f340895i) {
            webViewUI.R8(true, true);
        }
        webViewUI.f183804a3.f(webViewUI.L1.Z());
        com.tencent.mm.plugin.webview.ui.tools.floatball.x xVar = webViewUI.L1.Y0;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(xVar.f184237b)) {
            webViewUI.setMMTitle(xVar.f184237b);
        }
        com.tencent.mm.plugin.webview.ui.tools.ld ldVar = webViewUI.f183866w2;
        if (ldVar != null) {
            ldVar.n();
        }
        try {
            xVar.f184236a = false;
            java.util.Iterator it = xVar.f184238c.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.webview.ui.tools.floatball.e eVar = (com.tencent.mm.plugin.webview.ui.tools.floatball.e) it.next();
                ((com.tencent.mm.plugin.webview.ui.tools.u7) webViewUI.N2).i(eVar.f184194a, eVar.f184195b);
            }
            xVar.f184236a = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewUI", "resetFloatBallInfo ex = %s ", e17.getMessage());
        }
    }
}
