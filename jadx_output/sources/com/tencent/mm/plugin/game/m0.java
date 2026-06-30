package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class m0 extends com.tencent.mm.app.s2 {
    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "appForegroundListener, onAppBackground(%s)", str);
            r53.d dVar = r53.b.f392640a;
            long j17 = dVar.f392649c.f392645d;
            if (j17 > 0 && j17 < java.lang.System.currentTimeMillis()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                r53.c cVar = dVar.f392649c;
                cVar.f392644c += currentTimeMillis - cVar.f392645d;
            }
            com.tencent.mm.plugin.game.n0.F.c(600000L, 0L);
            if (com.tencent.mm.sdk.platformtools.o4.M("del_game_msg").getBoolean("del_mark", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "gamelog.dbClean, del mark: true");
                com.tencent.mm.sdk.platformtools.o4.M("del_game_msg").putBoolean("del_mark", false);
                com.tencent.mm.plugin.game.model.i1 Ai = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai();
                Ai.getClass();
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.model.m1(Ai));
            }
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "appForegroundListener, onAppForeground(%s)", str);
            r53.c cVar = r53.b.f392640a.f392649c;
            if (cVar.f392642a > 0) {
                cVar.f392645d = java.lang.System.currentTimeMillis();
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_TIME_LONG, 0L)));
            if (valueOf.longValue() == 0 || com.tencent.mm.sdk.platformtools.t8.i1() <= valueOf.longValue()) {
                java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_CLIENT_VERSION_STRING, "");
                if (v17 == null) {
                    v17 = "";
                }
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193111g;
                com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "checkClientVersionChange preClientVersion:%s, currentClientVersion:%s", v17, str2);
                if (!str2.equals(v17)) {
                    com.tencent.mm.plugin.game.commlib.j.a().b(true, 5);
                }
            } else {
                com.tencent.mm.plugin.game.commlib.j.a().b(true, 1);
            }
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GAME_LAST_SAVED_VERSION_CODE_INT;
            int intValue = ((java.lang.Integer) c17.m(u3Var, 0)).intValue();
            if (3120 != intValue) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameEventListener", "checkVersionChange lastVersion:%d, currentVersion:%d", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(com.tencent.mm.boot.BuildConfig.VERSION_CODE));
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(com.tencent.mm.boot.BuildConfig.VERSION_CODE));
                com.tencent.mm.autogen.events.GameCommOperationEvent gameCommOperationEvent = new com.tencent.mm.autogen.events.GameCommOperationEvent();
                am.le leVar = gameCommOperationEvent.f54358g;
                leVar.f7243a = 5;
                leVar.f7244b = java.lang.String.valueOf(5);
                gameCommOperationEvent.e();
            }
            com.tencent.mm.plugin.game.n0.F.d();
            d43.b bVar = d43.b.f226411d;
            b43.d dVar = d43.b.f226412e;
            synchronized (dVar) {
                com.tencent.mars.xlog.Log.i("GameChatRoom.GetMyChatRoomKeepAliveService", "resumeKeepAlive");
                if (dVar.f17806h && dVar.f17805g) {
                    dVar.a(dVar.f17811p, dVar.f17808m, dVar.f17809n);
                    dVar.f17806h = false;
                }
            }
        }
    }
}
