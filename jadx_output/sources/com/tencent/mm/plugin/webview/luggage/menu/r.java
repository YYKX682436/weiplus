package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class r extends com.tencent.mm.plugin.webview.luggage.menu.a {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.modeltools.h f182568b;

    public r() {
        super(7);
        this.f182568b = new com.tencent.mm.plugin.webview.modeltools.h();
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var) {
        g4Var.h(7, context.getString(com.tencent.mm.R.string.lad), com.tencent.mm.R.raw.bottomsheet_icon_brower, context.getResources().getColor(com.tencent.mm.R.color.f478522a3));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.luggage.menu.z zVar) {
        java.lang.String p17 = e0Var.f182178J.p(e0Var.u());
        if (com.tencent.mm.sdk.platformtools.t8.K0(p17)) {
            p17 = e0Var.u();
        }
        if (context instanceof android.app.Activity) {
            this.f182568b.c((android.app.Activity) context, p17);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.ga.CTRL_INDEX, 6);
    }
}
