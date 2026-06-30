package ff3;

/* loaded from: classes9.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261648d;

    public m(ff3.n nVar, java.lang.String str) {
        this.f261648d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        bt4.f b17 = bt4.f.b();
        b17.getClass();
        java.lang.String str = this.f261648d;
        com.tencent.mm.plugin.wallet_core.model.mall.MallNews e17 = bt4.f.e(str);
        if (e17 != null) {
            boolean equals = "2".equals(e17.f179845u);
            java.util.Map map = b17.f24470a;
            java.lang.String str2 = e17.f179833f;
            if (equals) {
                java.util.Objects.toString(e17);
                java.util.HashMap hashMap = (java.util.HashMap) map;
                com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = (com.tencent.mm.plugin.wallet_core.model.mall.MallNews) hashMap.get(str2);
                if (mallNews == null || !mallNews.f179834g.equals(e17.f179834g) || !mallNews.f179835h.equals(e17.f179835h)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MallNewsManager", "onRecieveMsg cancel not found!");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.MallNewsManager", "onRecieveMsg remove : " + str2);
                hashMap.remove(str2);
                return;
            }
            ((java.util.HashMap) map).put(str2, e17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MallNewsManager", "onRecieveMsg : " + str);
            b17.g();
            gm0.j1.i();
            java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_MALL_NEWS_MARKED_STRING_SYNC, "");
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(str3.split(","));
            com.tencent.mars.xlog.Log.i("MicroMsg.MallNewsManager", "tryCheckOutOfDateRedDot markedString %s", str3);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(e17.f179834g) && P1.contains(e17.f179834g)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MallNewsManager", "set OutOfDateRedDot");
                return;
            }
            int i17 = e17.f179846v;
            if (i17 == 0) {
                int i18 = e17.f179847w;
                if (i18 == 0 || i18 == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MallNewsManager", "showType New");
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().r(262156, true);
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_PUSH_DATE_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MallNewsManager", "showType New with wallet region:%d", java.lang.Integer.valueOf(i18));
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC, java.lang.Integer.valueOf(e17.f179847w));
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC, 1);
                }
            } else if (i17 == 1) {
                int i19 = e17.f179847w;
                if (i19 == 0 || i19 == 1) {
                    ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
                    bk0.a.g().p(262156, true);
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_PUSH_DATE_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MallNewsManager", "showType dot with wallet region:%d", java.lang.Integer.valueOf(i19));
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_INT_SYNC, java.lang.Integer.valueOf(e17.f179847w));
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_ENTRY_REDDOT_WALLET_REGION_TYPE_INT_SYNC, 2);
                }
            }
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_WALLET_RED_DOT_WORDING_STRING, "");
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LQT_WALLET_RED_DOT_INT, -1);
        }
    }
}
