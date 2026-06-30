package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class x extends com.tencent.mm.plugin.webview.luggage.menu.a {
    public x() {
        super(2);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var) {
        if (e0Var.v(23)) {
            g4Var.h(2, context.getString(com.tencent.mm.R.string.hra), com.tencent.mm.R.raw.bottomsheet_icon_moment, 0);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.luggage.menu.z zVar) {
        ((java.util.HashSet) e0Var.L.f182659e).add(com.tencent.mm.plugin.appbrand.jsapi.share.g1.NAME);
        e0Var.f406655i.c(new com.tencent.mm.plugin.webview.luggage.menu.w(this));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.ga.CTRL_INDEX, 10);
    }
}
