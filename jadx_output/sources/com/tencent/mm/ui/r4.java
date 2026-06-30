package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class r4 implements vg3.d4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f209596a;

    public r4(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI) {
        this.f209596a = findMoreFriendsUI;
    }

    @Override // vg3.d4
    public void h0(java.lang.String str, java.util.Map map, com.tencent.mm.modelbase.p0 p0Var) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!str.equals("lifeappreddot") || map == null) {
            return;
        }
        boolean equals = "1".equals(map.get(".sysmsg.lifeappreddot"));
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "life around xml msg content, showRedDot: %s.", java.lang.Boolean.valueOf(equals));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_RED_DOT_TAG_BOOLEAN, java.lang.Boolean.valueOf(equals));
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f209596a;
        if (!equals) {
            findMoreFriendsUI.f196659x1 = com.tencent.mm.ui.e6.TYPE_NONE;
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_RED_DOT_TYPE_STRING, "0");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_RED_DOT_TEXT_STRING, "");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_RED_DOT_IMG_URL_STRING, "");
            return;
        }
        java.lang.String str2 = (java.lang.String) map.get(".sysmsg.lifeappreddot.$type");
        java.lang.String str3 = (java.lang.String) map.get(".sysmsg.lifeappreddot.$text");
        java.lang.String str4 = (java.lang.String) map.get(".sysmsg.lifeappreddot.$imageurl");
        java.util.List list = com.tencent.mm.ui.FindMoreFriendsUI.R1;
        if (findMoreFriendsUI.x1(str3, str4)) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_RED_DOT_TYPE_STRING, str2);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_RED_DOT_TEXT_STRING, str3);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.MY_LIFE_AROUND_APP_RED_DOT_IMG_URL_STRING, str4);
        }
    }
}
