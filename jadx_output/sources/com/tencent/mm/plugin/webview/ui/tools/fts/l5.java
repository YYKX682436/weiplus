package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class l5 extends q35.c {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.m5 f184510g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.n5 f184511h;

    public l5(com.tencent.mm.plugin.webview.ui.tools.fts.n5 n5Var, com.tencent.mm.plugin.webview.ui.tools.fts.m5 m5Var) {
        this.f184511h = n5Var;
        this.f184510g = m5Var;
    }

    @Override // q35.c
    public void a() {
    }

    @Override // q35.c
    public void b(boolean z17) {
        com.tencent.mm.plugin.websearch.webview.BaseWebSearchWebView webView;
        com.tencent.mars.xlog.Log.i("WebSearchShakeCheckingManager", "onShake");
        com.tencent.mm.plugin.webview.ui.tools.fts.n5 n5Var = this.f184511h;
        long j17 = n5Var.f184543b;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        if (n5Var.f184544c) {
            if (elapsedRealtime < 1000) {
                return;
            }
        } else if (elapsedRealtime < 1200) {
            return;
        }
        n5Var.f184543b = android.os.SystemClock.elapsedRealtime();
        n5Var.f184544c = true;
        com.tencent.mm.plugin.webview.ui.tools.fts.m5 m5Var = this.f184510g;
        if (m5Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startCheck , deviceMotionMonitor onshake. uiWebView = ");
            qx4.d0 d0Var = ((qx4.l) m5Var).f367421a;
            av4.j jVar = d0Var.f14326a;
            sb6.append(jVar != null ? jVar.getWebView() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WebSearchJSApi", sb6.toString());
            av4.j jVar2 = d0Var.f14326a;
            if (jVar2 == null || (webView = jVar2.getWebView()) == null) {
                return;
            }
            qx4.k kVar = new qx4.k(webView, nw4.x2.c(d0Var.f367400i, null, false, webView.getRandomStr()), d0Var);
            if (com.tencent.mm.sdk.platformtools.u3.e()) {
                kVar.run();
            } else {
                com.tencent.mm.sdk.platformtools.u3.h(kVar);
            }
        }
    }
}
