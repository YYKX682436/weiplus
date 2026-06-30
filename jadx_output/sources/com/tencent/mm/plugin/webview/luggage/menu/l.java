package com.tencent.mm.plugin.webview.luggage.menu;

/* loaded from: classes8.dex */
public class l extends com.tencent.mm.plugin.webview.luggage.menu.a {
    public l() {
        super(12);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void a(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, db5.g4 g4Var) {
        boolean z17 = e0Var.f406657n.getBoolean("is_favorite_item", false);
        boolean z18 = e0Var.f406657n.getBoolean("key_detail_can_delete", true);
        if (z17 && z18) {
            g4Var.g(12, context.getString(com.tencent.mm.R.string.c_a), com.tencent.mm.R.raw.bottomsheet_icon_addtag);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.menu.a
    public void b(android.content.Context context, com.tencent.mm.plugin.webview.luggage.e0 e0Var, com.tencent.mm.plugin.webview.luggage.menu.z zVar) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_fav_scene", 2);
        intent.putExtra("key_fav_item_id", e0Var.f406657n.getLong("fav_local_id", -1L));
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        o72.x1.L0(context, ".ui.FavTagEditUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(com.tencent.mm.plugin.appbrand.jsapi.ga.CTRL_INDEX, 1);
    }
}
