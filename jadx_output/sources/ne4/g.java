package ne4;

/* loaded from: classes9.dex */
public class g implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ne4.h f336551d;

    public g(ne4.h hVar) {
        this.f336551d = hVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        boolean z17;
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginSoter", "account not ready.");
            return false;
        }
        ((ku5.t0) ku5.t0.f312615d).k(new ne4.e(this), 2000L);
        java.lang.String str = ((ie0.q) i95.n0.c(ie0.q.class)).f290970d;
        java.lang.String b17 = !com.tencent.mm.sdk.platformtools.t8.K0(str) ? str : c01.z1.b();
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_LAST_USERNAME_STRING_SYNC;
        java.lang.String str2 = (java.lang.String) c17.m(u3Var, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginSoter", "username old: %s, new: %s, %s", str2, b17, str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17) && this.f336551d.f336553d < 10) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginSoter", "username is null, delay init");
            this.f336551d.f336553d++;
            return true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !str2.equals(b17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginSoter", "have changed username, old: %s, new: %s", str2, b17);
            re4.g0.f394535a = str2;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            gm0.j1.u().c().x(u3Var, b17);
            re4.g0.f394535a = b17;
        } else {
            re4.g0.f394535a = b17;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginSoter", "do init soter: %s, %s, %s", java.lang.Integer.valueOf(this.f336551d.f336553d), b17, re4.g0.f394535a);
        int i17 = this.f336551d.f336553d;
        if (i17 >= 10) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 44);
        } else if (i17 > 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 45);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 47);
        }
        this.f336551d.getClass();
        re4.v a17 = re4.u.a();
        if (!((com.tencent.mm.sdk.platformtools.t8.K0(a17.f394553a) || com.tencent.mm.sdk.platformtools.t8.K0(a17.f394554b)) ? false : true)) {
            java.lang.String m17 = wo.w0.m();
            if (!("NCE-AL10".equals(m17) || "NCE-AL00".equals(m17) || "NCE-TL10".equals(m17))) {
                z17 = true;
                se4.h.a(z17, true, new ne4.f(this));
                return false;
            }
        }
        z17 = false;
        se4.h.a(z17, true, new ne4.f(this));
        return false;
    }
}
