package wr4;

/* loaded from: classes8.dex */
public class k implements com.tencent.mm.storage.p3 {
    @Override // com.tencent.mm.storage.p3
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        vr4.f1 wi6 = vr4.f1.wi();
        wi6.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.o1(obj, 0) == 339975) {
            gm0.j1.i();
            int intValue = ((java.lang.Integer) gm0.j1.u().c().l(339975, 0)).intValue();
            if (intValue != wi6.f439720d) {
                ((kt.u0) ((lt.s0) i95.n0.c(lt.s0.class))).wi();
                wi6.f439720d = intValue;
                return;
            }
            return;
        }
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC;
        if (u3Var.equals(obj)) {
            gm0.j1.i();
            int intValue2 = ((java.lang.Integer) gm0.j1.u().c().m(u3Var, 0)).intValue();
            if (intValue2 != wi6.f439721e) {
                ((kt.u0) ((lt.s0) i95.n0.c(lt.s0.class))).wi();
                wi6.f439721e = intValue2;
            }
        }
    }
}
