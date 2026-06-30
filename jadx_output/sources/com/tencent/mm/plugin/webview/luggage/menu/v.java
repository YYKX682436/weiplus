package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class v extends com.tencent.mm.plugin.webview.luggage.menu.a {
    public v() {
        super(1);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var) {
        if (e0Var.v(21)) {
            g4Var.h(this.f182559a, context.getString(com.tencent.mm.R.string.hr_), com.tencent.mm.R.raw.icons_filled_share, context.getResources().getColor(com.tencent.mm.R.color.f478502m));
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.luggage.menu.z zVar) {
        com.tencent.mm.plugin.webview.luggage.jsapi.w3.f182494f = 0;
        ((java.util.HashSet) e0Var.L.f182659e).add("sendAppMessage");
        e0Var.f406655i.c(new com.tencent.mm.plugin.webview.luggage.menu.u(this));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.ga.CTRL_INDEX, 9);
    }
}
