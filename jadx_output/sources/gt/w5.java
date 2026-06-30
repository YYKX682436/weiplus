package gt;

/* loaded from: classes7.dex */
public class w5 implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        boolean z17;
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.appbrand.appusage.f2[] f2VarArr = com.tencent.mm.plugin.appbrand.appusage.f2.f76431d;
            z17 = true;
        } else {
            z17 = false;
        }
        if (z17) {
            com.tencent.mm.plugin.appbrand.appusage.k2 k2Var = com.tencent.mm.plugin.appbrand.appusage.k2.f76499a;
            java.lang.String g17 = x51.j1.g(p0Var.f70726a.f377561h);
            if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
                return;
            }
            java.util.Set set = com.tencent.mm.plugin.appbrand.utils.s0.f90550a;
            ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.appusage.j2(k2Var, g17));
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
        if (gm0.j1.a()) {
            com.tencent.mm.plugin.appbrand.appusage.f2[] f2VarArr = com.tencent.mm.plugin.appbrand.appusage.f2.f76431d;
        }
    }
}
