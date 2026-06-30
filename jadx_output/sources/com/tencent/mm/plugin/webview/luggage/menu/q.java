package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class q extends com.tencent.mm.plugin.webview.luggage.menu.a {
    public q() {
        super(35);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var) {
        com.tencent.mm.plugin.webview.luggage.x3 x3Var = e0Var.E;
        if (!e0Var.x() || x3Var == null) {
            return;
        }
        g4Var.g(35, context.getString(com.tencent.mm.R.string.hrh), com.tencent.mm.R.raw.icons_outlined_multitask);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.luggage.menu.z zVar) {
        com.tencent.mm.plugin.webview.luggage.x3 x3Var = e0Var.E;
        if (x3Var != null) {
            x3Var.B(true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.ga.CTRL_INDEX, 4);
        }
    }
}
