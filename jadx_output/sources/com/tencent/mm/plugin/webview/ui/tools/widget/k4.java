package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class k4 extends com.tencent.mm.plugin.webview.core.f3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187365b;

    public k4(com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var) {
        this.f187365b = o4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.webview.core.f3
    public void a(int i17, java.lang.String reqUrl) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = this.f187365b;
        com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var = o4Var.f187474s;
        com.tencent.mm.plugin.webview.core.r0 r0Var = o4Var.G;
        d0Var.getClass();
        if (r0Var == null) {
            return;
        }
        com.tencent.mm.plugin.webview.permission.w wVar = r0Var.R;
        if (wVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HalfScreenWebViewMenuHelper", "setShareFuncFlag params failed");
            return;
        }
        java.lang.String Z = r0Var.Z();
        if (com.tencent.mm.sdk.platformtools.t8.K0(Z)) {
            return;
        }
        try {
            if (kotlin.jvm.internal.o.b(new java.net.URL(Z).getHost(), com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fy9))) {
                com.tencent.mm.protocal.JsapiPermissionWrapper c17 = wVar.c();
                kotlin.jvm.internal.o.f(c17, "getJsPerm(...)");
                boolean f17 = d0Var.f(c17, 21, 1);
                int i18 = f17;
                if (d0Var.f(c17, 23, 2)) {
                    i18 = (f17 ? 1 : 0) | 2;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.HalfScreenWebViewMenuHelper", "getShareFuncFlag %d", java.lang.Integer.valueOf(i18));
                if (r0Var.g0() != null) {
                    r0Var.g0().T("setFuncFlag", i18);
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HalfScreenWebViewMenuHelper", "create url fail : " + e17.getLocalizedMessage());
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void e() {
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = this.f187365b;
        try {
            com.tencent.mm.plugin.webview.core.r0 r0Var = o4Var.G;
            if (r0Var != null) {
                com.tencent.mm.plugin.webview.stub.v0 e07 = r0Var.e0();
                com.tencent.mm.plugin.webview.core.r0 r0Var2 = o4Var.G;
                e07.A5(r0Var2 != null ? r0Var2.U() : 0);
            }
            com.tencent.mm.plugin.webview.core.r0 r0Var3 = o4Var.G;
            if (r0Var3 != null) {
                com.tencent.mm.plugin.webview.stub.v0 e08 = r0Var3.e0();
                com.tencent.mm.plugin.webview.ui.tools.widget.m6 g17 = o4Var.g();
                com.tencent.mm.plugin.webview.core.r0 r0Var4 = o4Var.G;
                e08.rg(g17, r0Var4 != null ? r0Var4.U() : 0);
            }
            com.tencent.mm.plugin.webview.core.r0 r0Var5 = o4Var.G;
            if (r0Var5 != null) {
                r0Var5.s0(o4Var.f187466h);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMWebViewWithController", th6, "initWebViewController exception", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void j() {
        nw4.n g07;
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = this.f187365b;
        com.tencent.mm.plugin.webview.core.r0 r0Var = o4Var.G;
        if (r0Var == null || (g07 = r0Var.g0()) == null) {
            return;
        }
        g07.A("onCreate", o4Var.f187464f.f187176b);
    }
}
