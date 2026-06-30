package ia2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d extends kotlin.jvm.internal.m implements yz5.l {
    public d(java.lang.Object obj) {
        super(1, obj, ia2.e.class, "handleRecentForwardMenuItemClick", "handleRecentForwardMenuItemClick(Ljava/lang/String;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        ia2.e eVar = (ia2.e) this.receiver;
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BasicPOIMoreActionSheet", "handleRecentForwardMenuItemClick: " + str);
        if (str != null && !kotlin.jvm.internal.o.b(str, "")) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", str);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hashMap.put("view_id", "forward_recent_user_in_menu_in_poi_page");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", null, hashMap, 27051);
            eVar.a("forward_recent_more_poi");
        }
        return jz5.f0.f302826a;
    }
}
