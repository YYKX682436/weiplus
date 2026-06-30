package jr2;

/* loaded from: classes8.dex */
public final class c0 implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map values, com.tencent.mm.modelbase.p0 p27) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(p27, "p2");
        if (!kotlin.jvm.internal.o.b(str, "finderuserreinit")) {
            return null;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1279L, 25L, 1L);
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_USER_VERSION_INT_SYNC, 0);
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(".sysmsg.userver"), 0);
        java.lang.String str2 = (java.lang.String) values.get(".sysmsg.username");
        int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(".sysmsg.usertype"), 0);
        boolean z17 = D12 == 1 ? kotlin.jvm.internal.o.b(g92.b.f269769e.T0(), str2) : D12 == 2 && kotlin.jvm.internal.o.b(c01.z1.r(), str2);
        com.tencent.mars.xlog.Log.i("Finder.ReInitSysMsgConsumer", "[consumeNewXml] subType=" + str + " userVersion=" + D1 + " curUserVersion=" + r17 + " username=" + str2 + " userType=" + D12 + " isValid=" + z17);
        if (!z17) {
            return null;
        }
        if (D12 == 1) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, "");
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC, 0);
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MY_FINDER_REINIT_USERNAME_STRING_SYNC, str2);
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_REINIT_USER_VERSION_INT_SYNC, java.lang.Integer.valueOf(D1));
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_USER_HARD_REINIT_INT_SYNC, 1);
        return null;
    }
}
