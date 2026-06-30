package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.QueryGameLifeMsgEvent f209404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.FindMoreFriendsUI f209405e;

    public n5(com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI, com.tencent.mm.autogen.events.QueryGameLifeMsgEvent queryGameLifeMsgEvent) {
        this.f209405e = findMoreFriendsUI;
        this.f209404d = queryGameLifeMsgEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject;
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = this.f209405e;
        com.tencent.mm.ui.GameIconViewTipPreference gameIconViewTipPreference = (com.tencent.mm.ui.GameIconViewTipPreference) findMoreFriendsUI.f196656w.h("more_tab_game_recommend");
        if (gameIconViewTipPreference == null) {
            return;
        }
        if (findMoreFriendsUI.f196655v.b()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, gamemsg handleUpdateGameLife but in finder reddot.");
            return;
        }
        gameIconViewTipPreference.h0();
        if (com.tencent.mm.plugin.game.commlib.i.r().booleanValue()) {
            findMoreFriendsUI.q1(gameIconViewTipPreference, 8, 8, 8, false, 8, 8, 8);
            com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, gamemsg handleUpdateGameLife but in silenceMode.");
            return;
        }
        com.tencent.mm.autogen.events.QueryGameLifeMsgEvent queryGameLifeMsgEvent = this.f209404d;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(queryGameLifeMsgEvent.f54636g.f6483b);
        am.dp dpVar = queryGameLifeMsgEvent.f54636g;
        if (!K0) {
            gameIconViewTipPreference.d0(dpVar.f6483b, -1, android.graphics.Color.parseColor("#8c8c8c"));
        }
        gameIconViewTipPreference.N();
        if (com.tencent.mm.sdk.platformtools.t8.K0(dpVar.f6484c)) {
            findMoreFriendsUI.q1(gameIconViewTipPreference, 8, 8, 0, false, 8, 8, 8);
        } else {
            gameIconViewTipPreference.R(null);
            ng5.a.a(gameIconViewTipPreference.S, dpVar.f6484c);
            findMoreFriendsUI.q1(gameIconViewTipPreference, 8, 8, 0, false, 0, 0, 0);
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GAME_LIFE_REPORTED_MSG_ID_LONG;
        if (com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) c17.m(u3Var, 0L)) != dpVar.f6486e) {
            gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(dpVar.f6486e));
            if (m33.a1.a() != null && findMoreFriendsUI.I) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, report, gamelife exposure | unreadcount:%d", java.lang.Integer.valueOf(dpVar.f6485d));
                int i17 = dpVar.f6485d;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                z53.j Ni = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ni();
                int i18 = Ni.f470254d;
                try {
                    jSONObject = new org.json.JSONObject(Ni.f470253c);
                    try {
                        jSONObject.put("chatmsg_num", java.lang.String.valueOf(i17));
                    } catch (org.json.JSONException e17) {
                        e = e17;
                        jSONObject2 = jSONObject;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameDelegateImpl", e, "", new java.lang.Object[0]);
                        jSONObject = jSONObject2;
                        com.tencent.mm.game.report.l.d(com.tencent.mm.sdk.platformtools.x2.f193071a, 9, 901, 1, 1, 0, null, 0, i18, null, null, com.tencent.mm.game.report.l.a("resource", java.lang.String.valueOf(4), jSONObject.toString(), null));
                        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, gamelife complete | unreadcount:%d ｜title:%s", java.lang.Integer.valueOf(dpVar.f6485d), dpVar.f6483b);
                        findMoreFriendsUI.G = true;
                        findMoreFriendsUI.f196648J = dpVar.f6485d;
                    }
                } catch (org.json.JSONException e18) {
                    e = e18;
                }
                com.tencent.mm.game.report.l.d(com.tencent.mm.sdk.platformtools.x2.f193071a, 9, 901, 1, 1, 0, null, 0, i18, null, null, com.tencent.mm.game.report.l.a("resource", java.lang.String.valueOf(4), jSONObject.toString(), null));
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, gamelife complete | unreadcount:%d ｜title:%s", java.lang.Integer.valueOf(dpVar.f6485d), dpVar.f6483b);
        findMoreFriendsUI.G = true;
        findMoreFriendsUI.f196648J = dpVar.f6485d;
    }
}
