package yf2;

/* loaded from: classes3.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ze2 f461793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf2.z0 f461794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(r45.ze2 ze2Var, yf2.z0 z0Var) {
        super(0);
        this.f461793d = ze2Var;
        this.f461794e = z0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f461793d == null) {
            pf5.u uVar = pf5.u.f353936a;
            if (((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
                jz5.l P6 = ((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).P6();
                r45.d64 d64Var = new r45.d64();
                d64Var.f372174d = ((java.lang.Number) P6.f302833d).floatValue();
                d64Var.f372175e = ((java.lang.Number) P6.f302834e).floatValue();
                d64Var.f372179i = 0;
                d64Var.f372176f = 1;
                yf2.z0 z0Var = this.f461794e;
                yf2.z0.Z6(z0Var, d64Var, z0Var);
                ((ku5.t0) ku5.t0.f312615d).B(new yf2.t0(this.f461794e));
                return jz5.f0.f302826a;
            }
        }
        r45.ze2 ze2Var = this.f461793d;
        if (ze2Var != null) {
            ya2.p1 p1Var = this.f461794e.f461824m;
            if (p1Var != null) {
                ((yv2.b) p1Var).f466202h = ze2Var;
            }
            if (p1Var != null) {
                ((yv2.b) p1Var).d(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
