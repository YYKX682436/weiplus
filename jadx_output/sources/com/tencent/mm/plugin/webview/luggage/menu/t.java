package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class t extends com.tencent.mm.plugin.webview.luggage.menu.a {
    public t() {
        super(31);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var) {
        g4Var.g(31, context.getString(com.tencent.mm.R.string.f493693lb3), com.tencent.mm.R.raw.search_in_page);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.luggage.menu.z zVar) {
        e0Var.J(true);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.ga.CTRL_INDEX, 8);
    }
}
