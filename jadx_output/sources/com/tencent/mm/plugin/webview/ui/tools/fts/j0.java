package com.tencent.mm.plugin.webview.ui.tools.fts;

/* loaded from: classes8.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f184448d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.fts.k0 f184449e;

    public j0(com.tencent.mm.plugin.webview.ui.tools.fts.k0 k0Var, java.util.Map map) {
        this.f184449e = k0Var;
        this.f184448d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.fts.k0 k0Var = this.f184449e;
        nw4.n nVar = k0Var.f184491p.f183844p0;
        if (nVar != null) {
            nVar.i0("onSearchInputChange", this.f184448d, null);
        }
        com.tencent.mm.plugin.webview.ui.tools.fts.r0 r0Var = k0Var.f184490o;
        if (r0Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = ((com.tencent.mm.plugin.webview.ui.tools.fts.b) r0Var).f184342a;
            baseSOSWebViewUI.W4 = false;
            baseSOSWebViewUI.qa();
        }
    }
}
