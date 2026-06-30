package z73;

/* loaded from: classes11.dex */
public class g extends z73.a {

    /* renamed from: q, reason: collision with root package name */
    public static final bm5.p1 f470582q = new z73.e();

    /* renamed from: p, reason: collision with root package name */
    public final boolean f470583p;

    public g(java.lang.String str, java.lang.String str2, java.util.List list, boolean z17) {
        this.f470583p = true;
        if (z17) {
            this.f470575o = 0;
        } else {
            str = lp0.a.f320256j;
            str2 = lp0.a.a();
            list = z73.h.c();
            this.f470575o = 1;
        }
        this.f470569f = str;
        this.f470570g = str2;
        this.f470571h.addAll(list);
        this.f470583p = z17;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(24470, this.f470572i, "", java.lang.Integer.valueOf(this.f470575o), java.lang.Boolean.FALSE);
        g0Var.A(1821, 1);
    }

    @Override // z73.a, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        sc0.h hVar = (sc0.h) f470582q.b();
        z73.f fVar = new z73.f(this);
        y45.t tVar = (y45.t) hVar;
        synchronized (tVar.f459391b) {
            if (tVar.f459391b[0] != null) {
                d55.u.d("MicroMsg.RecoveryWatchDog", "[!] %s: previous called begin() was not ended, cancel it first.", tVar.f459390a);
                y45.u.a().removeCallbacks(tVar.f459391b[0]);
            }
            tVar.f459391b[0] = new y45.s(tVar, fVar);
            y45.u.a().postDelayed(tVar.f459391b[0], 60000L);
            d55.u.b("MicroMsg.RecoveryWatchDog", "[+] %s: begin() was called, stack: %s", tVar.f459390a, android.util.Log.getStackTraceString(new java.lang.Throwable()));
        }
        return super.doScene(sVar, u0Var);
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "errType:%d errCode:%d errMsg:%s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f470568e.onSceneEnd(i18, i19, str, this);
        bm5.p1 p1Var = f470582q;
        if (i18 != 0 || i19 != 0) {
            if (i18 == 4) {
                ((y45.t) ((sc0.h) p1Var.b())).a();
            }
            y73.a.a(5, i18);
            return;
        }
        ((y45.t) ((sc0.h) p1Var.b())).a();
        r45.g35 g35Var = (r45.g35) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        r45.j35 j35Var = g35Var.f374853d;
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse g17 = y73.p.g();
        oq1.n nVar = null;
        if (j35Var == null && g17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "no other patch, try to use x mmdiff patch.");
            nVar = y73.p.h(null, true);
        }
        if (j35Var == null && g17 == null && nVar == null) {
            int i27 = g35Var.f374858i;
            if (i27 == 1) {
                y73.a.a(1, 0);
                return;
            }
            if (i27 == 2) {
                y73.a.a(2, 0);
                return;
            }
            if (i27 == 3) {
                y73.a.a(3, 0);
                return;
            }
            if (i27 == 4) {
                y73.a.a(6, 0);
                return;
            } else if (i27 == 6) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "revoke this patch.");
                return;
            } else {
                y73.a.a(5, 0);
                return;
            }
        }
        boolean z17 = this.f470583p;
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "check from setting about ui. ");
            return;
        }
        com.tencent.mm.plugin.hp.util.TinkerSyncResponse tinkerSyncResponse = new com.tencent.mm.plugin.hp.util.TinkerSyncResponse(j35Var);
        if (g17 == null || !y73.p.b(g17)) {
            g17 = tinkerSyncResponse;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "user repair hardcode");
        }
        g17.f142423v = true;
        oq1.n h17 = y73.p.h(g17, true);
        if ((h17 instanceof com.tencent.mm.plugin.hp.util.TinkerSyncResponse) && y73.p.b(h17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "user xkey patch hardcode");
            g17 = (com.tencent.mm.plugin.hp.util.TinkerSyncResponse) h17;
        } else {
            g17.f142425x = true;
            g17.f142426y = true;
            g17.f142427z = false;
            g17.B = 6;
            g17.C = 1;
        }
        if (g17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Tinker.NetSceneCheckTinkerUpdate", "syncResponse is null.");
        } else {
            new y73.d0(g17).j(z17);
            y73.a.a(4, 0);
        }
    }
}
