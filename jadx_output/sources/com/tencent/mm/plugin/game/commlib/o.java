package com.tencent.mm.plugin.game.commlib;

/* loaded from: classes8.dex */
public class o extends com.tencent.mm.app.s2 {
    public o(com.tencent.mm.plugin.game.commlib.p pVar) {
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            if (gm0.m.r()) {
                return;
            }
            java.lang.String str2 = com.tencent.mm.plugin.game.commlib.util.m.f139419a;
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_GAME_FILE_CLEAN_TIME_LONG;
            if (com.tencent.mm.sdk.platformtools.t8.H1(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) c17.m(u3Var, 0L))).longValue()) > 86400) {
                gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                m43.c.b().a("game_cache_clean", new com.tencent.mm.plugin.game.commlib.util.k());
            }
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        if (gm0.j1.a() && gm0.j1.b().f273254q) {
            gm0.j1.b();
            gm0.m.r();
        }
    }
}
