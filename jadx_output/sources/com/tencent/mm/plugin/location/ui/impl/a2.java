package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes8.dex */
public class a2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.y1 f144749d;

    public a2(com.tencent.mm.plugin.location.ui.impl.y1 y1Var) {
        this.f144749d = y1Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.location.ui.impl.y1 y1Var = this.f144749d;
        if (itemId != 2) {
            if (java.util.Objects.equals(menuItem.getTitle(), y1Var.f144728d.getString(com.tencent.mm.R.string.bry))) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Retr_Msg_content", va3.w.b(y1Var.f144731g));
                intent.putExtra("Retr_Msg_Id", y1Var.f144876y);
                intent.putExtra("Retr_Msg_Type", 48);
                intent.putExtra("Retr_MsgTalker", y1Var.f144740s);
                j45.l.u(y1Var.f144728d, ".ui.chatting.ChattingSendDataToDeviceUI", intent, null);
                return;
            }
            java.util.Map map = y1Var.X;
            if (map != null) {
                for (java.util.Map.Entry entry : map.entrySet()) {
                    if (((java.lang.String) entry.getValue()).equals(menuItem.getTitle())) {
                        y1Var.f144729e.g(y1Var.f144731g, y1Var.f144732h, (java.lang.String) entry.getKey(), false, true);
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 4, entry.getKey());
                        return;
                    }
                }
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "click tencent map: %s", java.lang.Boolean.valueOf(y1Var.X.containsKey("com.tencent.map")));
        boolean containsKey = y1Var.X.containsKey("com.tencent.map");
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackMapUI", "install tencent map: %s.", java.lang.Boolean.valueOf(containsKey));
        if (containsKey) {
            y1Var.f144729e.g(y1Var.f144731g, y1Var.f144732h, "com.tencent.map", false, true);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 4, "com.tencent.map");
            return;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_tencent_map_show_max_limit, 99);
        int i18 = y1Var.Y;
        if (i18 < Ni) {
            y1Var.Y = i18 + 1;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TENCENT_MAP_COUNT_INT, java.lang.Integer.valueOf(y1Var.Y));
        }
        boolean z17 = 1 == ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_tencent_map_download_page_direct, 0);
        android.app.Activity activity = y1Var.f144728d;
        if (z17) {
            new com.tencent.mm.plugin.location.ui.impl.n2(activity, y1Var.f144951p1).execute(com.tencent.mm.plugin.location.ui.impl.y1.f144948y1);
            return;
        }
        gw4.f fVar = new gw4.f(activity);
        fVar.f276157b = "mmdownloadapp_JjNedmtv7FDUquSYR5";
        ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 5);
    }
}
