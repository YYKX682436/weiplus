package gq4;

@j95.b
/* loaded from: classes14.dex */
public class v extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.h2[] f274606d = {null};

    /* renamed from: e, reason: collision with root package name */
    public final qq4.b[] f274607e = {null};

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.ui.t0[] f274608f = {null};

    /* renamed from: g, reason: collision with root package name */
    public rs0.n f274609g;

    public static com.tencent.mm.plugin.voip.ui.t0 Ai() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        com.tencent.mm.plugin.voip.ui.t0[] t0VarArr = ((gq4.v) i95.n0.c(gq4.v.class)).f274608f;
        if (t0VarArr[0] == null) {
            synchronized (t0VarArr) {
                if (t0VarArr[0] == null) {
                    t0VarArr[0] = new com.tencent.mm.plugin.voip.ui.t0();
                }
            }
        }
        return t0VarArr[0];
    }

    public static com.tencent.mm.plugin.voip.model.h2 Bi() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        com.tencent.mm.plugin.voip.model.h2[] h2VarArr = ((gq4.v) i95.n0.c(gq4.v.class)).f274606d;
        if (h2VarArr[0] == null) {
            synchronized (h2VarArr) {
                if (h2VarArr[0] == null) {
                    h2VarArr[0] = new com.tencent.mm.plugin.voip.model.h2();
                }
            }
        }
        return h2VarArr[0];
    }

    public static void Di(boolean z17) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_VOIP_STATUS_PUSH_BOOLEAN, java.lang.Boolean.valueOf(z17));
        gm0.j1.u().c().i(true);
    }

    public static boolean Ni() {
        return (c01.z1.j() & 137438953472L) == 0;
    }

    public static qq4.b wi() {
        if (!gm0.j1.a()) {
            throw new c01.c();
        }
        qq4.b[] bVarArr = ((gq4.v) i95.n0.c(gq4.v.class)).f274607e;
        if (bVarArr[0] == null) {
            synchronized (bVarArr) {
                if (bVarArr[0] == null) {
                    bVarArr[0] = new qq4.b();
                }
            }
        }
        return bVarArr[0];
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        java.lang.String str;
        super.onAccountInitialized(context);
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_VOIP_STATUS_PUSH_BOOLEAN, null);
        if (!com.tencent.mm.plugin.voip.model.j0.d() && m17 != null && !((java.lang.Boolean) m17).booleanValue()) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_VOIP_STATUS_VIDEO_MODE_BOOLEAN;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            boolean booleanValue = ((java.lang.Boolean) c17.m(u3Var, bool)).booleanValue();
            boolean booleanValue2 = ((java.lang.Boolean) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_VOIP_STATUS_OUT_CALL_BOOLEAN, bool)).booleanValue();
            long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_VOIP_STATUS_BEFORE_TIME_LONG, 0)).longValue();
            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_VOIP_STATUS_TO_USER_STRING, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVoip", "voip message need push is %s,%s,%s,%s", java.lang.Boolean.valueOf(booleanValue), java.lang.Boolean.valueOf(booleanValue2), java.lang.Long.valueOf(longValue), str2);
            if (booleanValue) {
                int i17 = com.tencent.mm.storage.f9.f193926r2;
                str = "voip_content_video";
            } else {
                int i18 = com.tencent.mm.storage.f9.f193926r2;
                str = "voip_content_voice";
            }
            com.tencent.mm.plugin.voip.model.b2.c(str2, str, booleanValue2 ? 1 : 0, 6, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kcp));
            Di(true);
        }
        nq4.f.f339014a.d();
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPBubbleHelper", "checkCrashCgi: ");
        ((ku5.t0) ku5.t0.f312615d).g(com.tencent.mm.plugin.voip.model.h0.f176554d);
        uo.q qVar = uo.q.f429532a;
        uo.q.f429534c = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginCamera", "initCameraNumbers start, useMMKVCache : true");
        uo.q.f429535d = new java.util.concurrent.FutureTask(uo.o.f429530d);
        ((ku5.t0) ku5.t0.f312615d).g(uo.p.f429531d);
        it0.g.f294495a = new java.util.concurrent.FutureTask(it0.e.f294493d);
        ((ku5.t0) ku5.t0.f312615d).g(it0.f.f294494d);
        ((ku5.t0) ku5.t0.f312615d).g(new gq4.u(this));
        Bi().getClass();
        rs0.n nVar = new rs0.n();
        this.f274609g = nVar;
        nVar.a();
        ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f(40);
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        boolean booleanValue3 = ((java.lang.Boolean) c18.l(73217, bool2)).booleanValue();
        boolean booleanValue4 = ((java.lang.Boolean) gm0.j1.u().c().l(73218, bool2)).booleanValue();
        boolean b17 = ip.b.b();
        com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_VOIP_MSG_SOUND_DIFF_STAT_BOOLEAN_SYNC;
        boolean booleanValue5 = ((java.lang.Boolean) c19.m(u3Var2, java.lang.Boolean.FALSE)).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreVoip", "voipSound: %s, voipAudioSound: %s, msgSound: %s, hasReport: %s", java.lang.Boolean.valueOf(booleanValue3), java.lang.Boolean.valueOf(booleanValue4), java.lang.Boolean.valueOf(b17), java.lang.Boolean.valueOf(booleanValue5));
        if (!booleanValue5) {
            boolean z17 = booleanValue3 || booleanValue4;
            if (z17 != b17) {
                if (z17 && !b17) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 13L, 1L, false);
                } else if (!z17 && b17) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 14L, 1L, false);
                }
            }
            gm0.j1.u().c().x(u3Var2, bool2);
        }
        if (z65.c.a()) {
            com.tencent.mm.plugin.voip.ui.s0 s0Var = com.tencent.mm.plugin.voip.ui.s0.f176982a;
            if (z65.c.a()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "setup");
                com.tencent.mm.plugin.voip.ui.s0.f176985d.alive();
            }
        }
        c01.a9.a(1);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        boolean z17;
        com.tencent.mm.sdk.platformtools.n3 n3Var;
        com.tencent.mm.sdk.platformtools.n3 n3Var2;
        super.onAccountReleased(context);
        synchronized (this.f274608f) {
            z17 = false;
            if (this.f274608f[0] != null) {
                com.tencent.mm.sdk.platformtools.u3.h(new gq4.t(this));
            }
        }
        rs0.n nVar = this.f274609g;
        if (nVar != null) {
            com.tencent.mm.sdk.platformtools.n3 n3Var3 = nVar.f399309c;
            if (n3Var3 != null) {
                n3Var3.removeCallbacksAndMessages(null);
            }
            com.tencent.mm.sdk.platformtools.n3 n3Var4 = nVar.f399309c;
            if (n3Var4 != null && !n3Var4.isQuit()) {
                z17 = true;
            }
            if (z17 && (n3Var2 = nVar.f399309c) != null) {
                n3Var2.post(new rs0.m(nVar));
            }
        }
        nq4.f.f339014a.d();
        com.tencent.mm.plugin.voip.model.i1 i1Var = Bi().f176558a.f176411a.A;
        if (i1Var != null && (n3Var = i1Var.f176666u) != null) {
            n3Var.quitSafely();
            i1Var.f176666u = null;
        }
        Bi().R();
        com.tencent.mm.plugin.voip.ui.s0 s0Var = com.tencent.mm.plugin.voip.ui.s0.f176982a;
        com.tencent.mars.xlog.Log.i("MicroMsg.VoipAutomatedTestSetupShell", "destroy");
        com.tencent.mm.plugin.voip.ui.s0.f176985d.dead();
    }
}
