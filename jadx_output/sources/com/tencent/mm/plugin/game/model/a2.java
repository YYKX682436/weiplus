package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class a2 {

    /* renamed from: a, reason: collision with root package name */
    public long f140198a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f140199b = 0;

    public boolean a() {
        boolean z17 = com.tencent.mm.plugin.game.commlib.i.m() != null ? com.tencent.mm.plugin.game.commlib.i.m().f323584f : false;
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRedDotService", "disableFinderReddot:%b", java.lang.Boolean.valueOf(z17));
        return !z17;
    }

    public boolean b() {
        if (a()) {
            return ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().p("Game.Entrance", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Game.Entrance"));
        }
        return false;
    }

    public void c(com.tencent.mm.plugin.game.model.n1 n1Var) {
        com.tencent.mm.plugin.game.model.e1 n17 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().n();
        if (n17 == null) {
            return;
        }
        com.tencent.mm.plugin.game.model.o1 Di = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di();
        long j17 = n17.field_msgId;
        Di.getClass();
        Di.execSQL("GameRawMessage", "update GameRawMessage set isRedDotExited=1 where msgId=" + j17);
        com.tencent.mm.sdk.platformtools.o4.M("game_redot").putString("outer_color_text", "");
        com.tencent.mm.plugin.game.model.i1 Ai = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai();
        Ai.g();
        Ai.f();
        Ai.e();
        Ai.d();
        if (n1Var == com.tencent.mm.plugin.game.model.n1.GAME_REDDOT_EXIT_USER_CLICK) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LAST_CLICK_GAME_REDDOT_TIME_LONG, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
        }
        n17.t0();
        e(n17, n1Var);
        if (this.f140199b == n17.field_msgId) {
            com.tencent.mm.sdk.platformtools.o4.M("game_redot").putLong("red_dot_exit_time", java.lang.System.currentTimeMillis());
            com.tencent.mm.sdk.platformtools.o4.M("game_redot").putInt("red_dot_exit_reason", n1Var.ordinal());
            com.tencent.mm.sdk.platformtools.o4.M("game_redot").putString("red_dot_exit_gamemsgid", n17.field_gameMsgId);
            com.tencent.mm.sdk.platformtools.o4.M("game_redot").putLong("red_dot_exit_msgid", n17.field_msgId);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRedDotService", "gamelog.srv_msg, service, reddotExit, msgId: %d gameMsgId:%s exit with exposured cnt: %d, reason: %s, title:%s.", java.lang.Long.valueOf(n17.field_msgId), n17.field_gameMsgId, java.lang.Integer.valueOf(n17.field_exposuredCount), n1Var, n17.f140279d2.f140412c);
        if (a()) {
            com.tencent.mm.autogen.events.FinderGameRedDotEvent finderGameRedDotEvent = new com.tencent.mm.autogen.events.FinderGameRedDotEvent();
            finderGameRedDotEvent.f54278g.f6935a = 3;
            finderGameRedDotEvent.e();
        }
    }

    public int d() {
        java.lang.String[] split = ((java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_SINGLE_DAY_REDDOT_EXPOSURED_CNT_STRING, "")).split("_");
        if (split.length != 2) {
            return 0;
        }
        try {
            boolean T0 = com.tencent.mm.sdk.platformtools.t8.T0(java.lang.Long.parseLong(split[0]), java.lang.System.currentTimeMillis());
            int parseInt = java.lang.Integer.parseInt(split[1]);
            if (T0) {
                return parseInt;
            }
            return 0;
        } catch (java.lang.NumberFormatException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameRedDotService", e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    public boolean e(com.tencent.mm.plugin.game.model.e1 e1Var, com.tencent.mm.plugin.game.model.n1 n1Var) {
        if (e1Var == null || e1Var.field_gameMsgId == null) {
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("reddot_strategy", com.tencent.mm.plugin.game.commlib.util.d.a() ? "1" : "0");
        hashMap.put("channel", java.lang.Integer.toString(e1Var.field_channel));
        hashMap.put("expo_times", java.lang.String.valueOf(e1Var.field_exposuredCount));
        hashMap.put("cexpo_times", java.lang.String.valueOf(e1Var.field_completeExposuredCount));
        hashMap.put("exit_reason", java.lang.String.valueOf(n1Var.ordinal()));
        com.tencent.mm.plugin.game.model.k0 k0Var = e1Var.O2;
        if (k0Var != null) {
            hashMap.put("mt", java.lang.String.valueOf(k0Var.f140347a));
        }
        hashMap.put("iee", e1Var.Y2 ? "1" : "0");
        java.lang.String a17 = com.tencent.mm.game.report.l.a("resource", java.lang.String.valueOf(e1Var.field_msgType), e1Var.U2, hashMap);
        if (!e1Var.field_needReport) {
            return true;
        }
        com.tencent.mm.game.report.l.d(com.tencent.mm.sdk.platformtools.x2.f193071a, 9, 901, 1, 96, 0, e1Var.field_appId, 0, e1Var.S2, e1Var.field_gameMsgId, e1Var.T2, a17);
        return true;
    }

    public boolean f() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_game_reddot_newsync_ios, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameRedDotService", "shouldEnableGameNewSync:%b", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }
}
