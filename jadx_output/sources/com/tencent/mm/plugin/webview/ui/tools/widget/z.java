package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class z implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.d0 f187615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.JsapiPermissionWrapper f187616e;

    public z(com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var, com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper) {
        this.f187615d = d0Var;
        this.f187616e = jsapiPermissionWrapper;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.webview.ui.tools.widget.d0 d0Var = this.f187615d;
        android.content.Context d17 = d0Var.d();
        android.app.Activity activity = d17 instanceof android.app.Activity ? (android.app.Activity) d17 : null;
        boolean z17 = false;
        if (activity != null && activity.isFinishing()) {
            z17 = true;
        }
        if (z17) {
            return;
        }
        d0Var.getClass();
        g4Var.clear();
        com.tencent.mm.protocal.JsapiPermissionWrapper jsapiPermissionWrapper = this.f187616e;
        if (com.tencent.mm.plugin.webview.ui.tools.widget.d0.a(d0Var, jsapiPermissionWrapper, 21) && d0Var.c(1)) {
            g4Var.j(1, d0Var.d().getString(com.tencent.mm.R.string.hr_), com.tencent.mm.R.raw.icons_filled_share, d0Var.d().getResources().getColor(com.tencent.mm.R.color.f478502m), com.tencent.mm.plugin.webview.ui.tools.widget.d0.b(d0Var, jsapiPermissionWrapper, 21));
            if (!com.tencent.mm.plugin.webview.ui.tools.widget.d0.b(d0Var, jsapiPermissionWrapper, 21)) {
                android.content.Context d18 = d0Var.d();
                com.tencent.mm.plugin.webview.core.r0 e17 = d0Var.e();
                com.tencent.mm.ui.widget.dialog.k0 k0Var = d0Var.f187143a;
                hy4.m0 recentForwardReporter = d0Var.f187146d;
                d0Var.getClass();
                kotlin.jvm.internal.o.g(recentForwardReporter, "recentForwardReporter");
                if (k0Var != null) {
                    ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
                    com.tencent.mm.pluginsdk.forward.m mVar = new com.tencent.mm.pluginsdk.forward.m();
                    k0Var.f211876p = new com.tencent.mm.plugin.webview.ui.tools.widget.p(k0Var, mVar, d18, e17, recentForwardReporter, null);
                    k0Var.f211885w = new com.tencent.mm.plugin.webview.ui.tools.widget.r(mVar, recentForwardReporter, null, e17);
                    k0Var.f211886x = new com.tencent.mm.plugin.webview.ui.tools.widget.s(mVar, k0Var);
                }
            }
        }
        if (com.tencent.mm.plugin.webview.ui.tools.widget.d0.a(d0Var, jsapiPermissionWrapper, 23) && d0Var.c(2)) {
            g4Var.j(2, d0Var.d().getString(com.tencent.mm.R.string.hra), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, com.tencent.mm.plugin.webview.ui.tools.widget.d0.b(d0Var, jsapiPermissionWrapper, 23));
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = d0Var.f187143a;
        kotlin.jvm.internal.o.d(k0Var2);
        k0Var2.j();
    }
}
