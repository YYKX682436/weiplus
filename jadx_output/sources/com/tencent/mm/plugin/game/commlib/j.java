package com.tencent.mm.plugin.game.commlib;

/* loaded from: classes8.dex */
public class j implements com.tencent.mm.modelbase.u0 {

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.plugin.game.commlib.j f139383f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f139384d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f139385e = false;

    public static com.tencent.mm.plugin.game.commlib.j a() {
        if (f139383f == null) {
            synchronized (com.tencent.mm.plugin.game.commlib.j.class) {
                if (f139383f == null) {
                    f139383f = new com.tencent.mm.plugin.game.commlib.j();
                }
            }
        }
        return f139383f;
    }

    public synchronized void b(boolean z17, int i17) {
        boolean z18;
        if (!z17) {
            if (java.lang.Math.abs(com.tencent.mm.sdk.platformtools.t8.H1(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_GLOBAL_CONFIG_UPDATE_TIME_LONG, 0L))).longValue())) <= 86400) {
                z18 = false;
                if ((!z18 || (!com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.game.commlib.i.c()))) && !this.f139384d) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigUpdater", "Game config start update. force update(%b)", java.lang.Boolean.valueOf(z17));
                    this.f139384d = false;
                    gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.pay.s.CTRL_INDEX, this);
                    this.f139384d = true;
                    this.f139385e = z17;
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_TIME_LONG, 0L);
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_CLIENT_VERSION_STRING, com.tencent.mm.sdk.platformtools.z.f193111g);
                    gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.pay.s.CTRL_INDEX, this);
                    gm0.j1.d().g(new com.tencent.mm.plugin.game.commlib.k(i17));
                }
            }
        }
        z18 = true;
        if (!z18) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigUpdater", "Game config start update. force update(%b)", java.lang.Boolean.valueOf(z17));
        this.f139384d = false;
        gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.pay.s.CTRL_INDEX, this);
        this.f139384d = true;
        this.f139385e = z17;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_TIME_LONG, 0L);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_PULL_GLOBAL_CONFIG_CLIENT_VERSION_STRING, com.tencent.mm.sdk.platformtools.z.f193111g);
        gm0.j1.d().a(com.tencent.mm.plugin.appbrand.jsapi.pay.s.CTRL_INDEX, this);
        gm0.j1.d().g(new com.tencent.mm.plugin.game.commlib.k(i17));
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() == 1311) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigUpdater", "getGameCenterGlobalSetting sceneEnd, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (gm0.j1.b().m()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameConfigUpdater", "updateTime, isForceUpdate: %b", java.lang.Boolean.valueOf(this.f139385e));
                if (!this.f139385e) {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_GAME_GLOBAL_CONFIG_UPDATE_TIME_LONG, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.GameConfigUpdater", "account not init.");
            }
            this.f139384d = false;
            gm0.j1.d().q(com.tencent.mm.plugin.appbrand.jsapi.pay.s.CTRL_INDEX, this);
        }
    }
}
