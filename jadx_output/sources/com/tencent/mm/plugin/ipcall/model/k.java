package com.tencent.mm.plugin.ipcall.model;

/* loaded from: classes8.dex */
public class k implements com.tencent.mm.modelbase.u0 {

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.plugin.ipcall.model.k f142474g;

    /* renamed from: d, reason: collision with root package name */
    public int f142475d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f142476e = false;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f142477f;

    public k() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f142477f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent>(a0Var) { // from class: com.tencent.mm.plugin.ipcall.model.IPCallCoutryConfigUpdater$1
            {
                this.__eventId = -443124368;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent dynamicConfigUpdatedEvent) {
                if (dynamicConfigUpdatedEvent instanceof com.tencent.mm.autogen.events.DynamicConfigUpdatedEvent) {
                    com.tencent.mm.storage.n3 p17 = c01.d9.b().p();
                    com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_IPCALL_COUNTRY_CODE_RESTRCTION_INT;
                    int intValue = ((java.lang.Integer) p17.m(u3Var, 0)).intValue();
                    int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("WeChatOutCountryCodeRestrictionPackageID", 0);
                    if (intValue != b17) {
                        c01.d9.b().p().x(u3Var, java.lang.Integer.valueOf(b17));
                        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
                        f21.r0.Bi().n0(26);
                        com.tencent.mm.plugin.ipcall.model.j a17 = com.tencent.mm.plugin.ipcall.model.j.a();
                        a17.getClass();
                        try {
                            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(lp0.b.e() + "ipcallCountryCodeConfig.cfg");
                            if (r6Var.m()) {
                                r6Var.l();
                            }
                            a17.f142473c = false;
                            a17.f142472b.clear();
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.IPCallCountryCodeConfig", "deleteRestrictionCountryConfigIfExist, error: %s", e17.getMessage());
                        }
                        com.tencent.mm.plugin.ipcall.model.k.this.d(true);
                    }
                }
                return false;
            }
        };
    }

    public static com.tencent.mm.plugin.ipcall.model.k a() {
        if (f142474g == null) {
            f142474g = new com.tencent.mm.plugin.ipcall.model.k();
        }
        return f142474g;
    }

    public final void b() {
        this.f142476e = false;
        this.f142475d = 0;
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_IPCALL_COUNTRY_CODE_LASTUPDATE_TIME_LONG, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }

    public final void c() {
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.i0[] D0 = f21.r0.Bi().D0(26);
        c01.d9.e().g(new f21.g0(26, D0 != null && D0.length > 0));
    }

    public void d(boolean z17) {
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, acc not ready");
            return;
        }
        if (this.f142476e) {
            com.tencent.mars.xlog.Log.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate updating");
            return;
        }
        if (!z17) {
            long longValue = ((java.lang.Long) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_IPCALL_COUNTRY_CODE_LASTUPDATE_TIME_LONG, 0L)).longValue();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (longValue != 0 && java.lang.Math.abs(currentTimeMillis - longValue) < 86400000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.IPCallCoutryConfigUpdater", "tryUpdate, not reach the update time limit");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.IPCallCoutryConfigUpdater", "try update now");
        this.f142476e = true;
        c01.d9.e().a(com.tencent.mm.plugin.appbrand.jsapi.audio.e0.CTRL_INDEX, this);
        c01.d9.e().a(160, this);
        c();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (this.f142476e) {
            boolean z17 = i17 == 0 || i18 == 0;
            if (m1Var.getType() != 159) {
                if (m1Var.getType() == 160 && z17) {
                    com.tencent.mm.plugin.ipcall.model.j.a().b(true);
                    b();
                    return;
                }
                return;
            }
            if (!z17) {
                int i19 = this.f142475d;
                if (i19 >= 3) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.IPCallCoutryConfigUpdater", "reach retry limit");
                    return;
                } else {
                    this.f142475d = i19 + 1;
                    c();
                    return;
                }
            }
            ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
            f21.i0[] D0 = f21.r0.Bi().D0(26);
            if (D0 == null || D0.length == 0) {
                b();
                return;
            }
            f21.i0 i0Var = D0[0];
            int i27 = i0Var.f258919g;
            int i28 = i0Var.f258918f;
            if (i28 == 3) {
                return;
            }
            if (i28 == 5) {
                c01.d9.e().g(new f21.f0(i0Var.f258913a, 26));
            } else {
                com.tencent.mm.plugin.ipcall.model.j.a().b(true);
                b();
            }
        }
    }
}
