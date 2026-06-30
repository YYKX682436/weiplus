package f01;

/* loaded from: classes11.dex */
public class f1 implements com.tencent.mm.storage.c8 {
    @Override // com.tencent.mm.storage.c8
    public com.tencent.mm.storage.z3 get(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.storage.c8
    public int o0(com.tencent.mm.storage.z3 z3Var, boolean z17) {
        return 0;
    }

    @Override // com.tencent.mm.storage.c8
    public void w0(com.tencent.mm.storage.e8 e8Var, com.tencent.mm.storage.z3 z3Var) {
        java.lang.String d17 = z3Var.d1();
        if (com.tencent.mm.storage.z3.H3(z3Var.d1())) {
            z3Var.X1(com.tencent.mm.storage.z3.Y4(z3Var.d1()));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.T0())) {
            z3Var.R1(x51.k.b(z3Var.P0()));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.U0())) {
            z3Var.S1(x51.k.a(z3Var.P0()));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.z0())) {
            z3Var.p1(x51.k.b(z3Var.w0()));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.y0())) {
            z3Var.o1(x51.k.a(z3Var.w0()));
        }
        java.util.Set set = c01.e2.f37117a;
        boolean z17 = false;
        if (com.tencent.mm.storage.z3.R4(z3Var.d1()) && z3Var.r2()) {
            z17 = true;
        }
        if (z17) {
            z3Var.T1(43);
            z3Var.R1(x51.k.b(z3Var.f2()));
            z3Var.S1(x51.k.a(z3Var.f2()));
            z3Var.o1(x51.k.a(z3Var.g2()));
            z3Var.p1(z3Var.g2());
            return;
        }
        if (c01.e2.D(d17)) {
            z3Var.N2();
            z3Var.V2(4);
            z3Var.T1(33);
            z3Var.X1(d17);
            z3Var.N2();
            c01.v7.c(z3Var);
            z3Var.U2();
        }
        if (z3Var.t2()) {
            z3Var.T1(z3Var.c2());
        }
        if (com.tencent.mm.storage.z3.k4(d17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMCore", "update official account helper showhead %d", 31);
            z3Var.T1(31);
        }
        if (z3Var.o2()) {
            ((com.tencent.mm.storage.m4) c01.d9.b().r()).P(new java.lang.String[]{d17}, "@blacklist");
        }
        z3Var.T0();
    }
}
