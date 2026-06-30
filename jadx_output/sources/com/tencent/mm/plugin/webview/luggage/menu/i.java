package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class i extends com.tencent.mm.plugin.webview.luggage.menu.a {
    public i() {
        super(6);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var) {
        if (e0Var.v(44)) {
            g4Var.g(6, context.getString(com.tencent.mm.R.string.la_), com.tencent.mm.R.raw.icons_outlined_link);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.luggage.menu.z zVar) {
        java.lang.String p17 = e0Var.f182178J.p(e0Var.u());
        if (com.tencent.mm.sdk.platformtools.t8.K0(p17)) {
            p17 = e0Var.u();
        }
        com.tencent.mm.sdk.platformtools.b0.e(p17);
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.laa), 0).show();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.ga.CTRL_INDEX, 0);
    }
}
