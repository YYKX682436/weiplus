package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class k extends com.tencent.mm.plugin.webview.luggage.menu.a {
    public k() {
        super(9);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var) {
        boolean z17 = e0Var.f406657n.getBoolean("is_favorite_item", false);
        boolean z18 = e0Var.f406657n.getBoolean("key_detail_can_delete", true);
        if (z17 && z18) {
            g4Var.g(9, context.getString(com.tencent.mm.R.string.f490367t0), com.tencent.mm.R.raw.bottomsheet_icon_del);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.luggage.menu.z zVar) {
        db5.e1.b(context, context.getString(com.tencent.mm.R.string.f490369t2), null, null, context.getString(com.tencent.mm.R.string.f490367t0), new com.tencent.mm.plugin.webview.luggage.menu.j(this, e0Var));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.ga.CTRL_INDEX, 3);
    }
}
