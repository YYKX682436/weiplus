package se4;

/* loaded from: classes9.dex */
public class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public km5.b f406931a = null;

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        this.f406931a = km5.u.b();
        if (!cu5.b.c()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SoterSaveDeviceInfoFunc", "not support soter");
            this.f406931a.a(nm5.j.c(2, "not support soter"));
            return java.lang.Boolean.TRUE;
        }
        if (!bool.booleanValue()) {
            return java.lang.Boolean.TRUE;
        }
        re4.u.c();
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e());
        if (M != null) {
            java.lang.String string = M.getString("cpu_id", null);
            java.lang.String string2 = M.getString("uid", null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SoterDeviceInfoManager", "old cpuId: %s, old uid: %s", string, string2);
            zt5.r c17 = wt5.a.c();
            if (c17 != null) {
                java.lang.String str = c17.f475615c;
                java.lang.String valueOf = java.lang.String.valueOf(c17.f475614b);
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterDeviceInfoManager", "new cpuid: %s, uid: %s", str, valueOf);
                if (str.equals(string) && !valueOf.equals(string2)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 20);
                }
                if (string2 != null && string2.equals("0")) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 21);
                }
                if ("0".equals(valueOf) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 32);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(valueOf)) {
                    re4.u.b(str, valueOf);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1104, 22);
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
