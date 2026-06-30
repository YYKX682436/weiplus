package h14;

/* loaded from: classes9.dex */
public class a implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        long j17;
        java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
        if (g17 == null || g17.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CrowdTestListener", "onReceiveMsg, crowdtest msgContent is null");
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        if (d17 == null) {
            return;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.crowdtest.$clientversion"), 0);
        if (P <= o45.wf.f343029g) {
            return;
        }
        try {
            j17 = new java.text.SimpleDateFormat("yyyy-MM-dd").parse((java.lang.String) d17.get(".sysmsg.crowdtest.apply.$expire")).getTime();
        } catch (java.lang.Exception unused) {
            j17 = 0;
        }
        if (j17 < java.lang.System.currentTimeMillis()) {
            f14.j.wi();
            return;
        }
        java.lang.String str = (java.lang.String) d17.get(".sysmsg.crowdtest.apply.link");
        java.lang.String str2 = (java.lang.String) d17.get(".sysmsg.crowdtest.feedback.link");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CROWDTEST_CLIENT_VERSION_INT, java.lang.Integer.valueOf(P));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CROWDTEST_APPLY_EXPIRE_LONG, java.lang.Long.valueOf(j17));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CROWDTEST_APPLY_LINK_STRING, str);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_CROWDTEST_FEEDBACK_LINK_STRING, str2);
        int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".sysmsg.crowdtest.apply.reddotlevel"), 0);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().p(262157, P2 >= 1);
        if (P2 < 3) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262157, 266261);
        }
        if (P2 < 2) {
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().h(262157, 266262);
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
