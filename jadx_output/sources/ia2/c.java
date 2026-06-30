package ia2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.m implements yz5.l {
    public c(java.lang.Object obj) {
        super(1, obj, ia2.e.class, "handleMenuItemClick", "handleMenuItemClick(Lcom/tencent/mm/feature/location/api/POIMoreActionSheetMenuId;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        z80.u0 p07 = (z80.u0) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        ia2.e eVar = (ia2.e) this.receiver;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BasicPOIMoreActionSheet", "handleMenuItemClick: " + p07);
        int ordinal = p07.ordinal();
        if (ordinal == 0) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("view_id", "forward_button_in_menu_in_poi_page");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, linkedHashMap, 27051);
            eVar.a("forward_friend_more_poi");
        } else if (ordinal == 2) {
            eVar.a("copy_more_poi");
        } else if (ordinal == 3) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.tencent.mm.plugin.finder.service.p3 p3Var = com.tencent.mm.plugin.finder.service.p3.f126174a;
            p3Var.c(null, false, true, "poi_info_from_qqmap_guide", null);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p3Var.c(null, true, false, "click_report_addr_in_menu_in_poi_page", new java.util.LinkedHashMap());
            eVar.a("feedback_more_poi");
        }
        return jz5.f0.f302826a;
    }
}
