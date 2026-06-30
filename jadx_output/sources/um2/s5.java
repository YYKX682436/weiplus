package um2;

/* loaded from: classes3.dex */
public final class s5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428959d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(um2.x5 x5Var) {
        super(1);
        this.f428959d = x5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        um2.x5 x5Var;
        com.tencent.mm.plugin.finder.live.plugin.et etVar;
        km2.r rVar;
        km2.r rVar2;
        if (((java.lang.Boolean) obj).booleanValue() && (etVar = (x5Var = this.f428959d).f429086x) != null) {
            int S6 = ((mm2.j2) x5Var.c(mm2.j2.class)).S6();
            com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "resend comment:" + etVar.V + ",floatType:" + S6);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(etVar.V)) {
                r45.xn1 xn1Var = etVar.W;
                if (xn1Var != null) {
                    r45.qt2 qt2Var = new r45.qt2();
                    km2.n nVar = dk2.ef.H;
                    int i17 = 0;
                    qt2Var.set(7, java.lang.Integer.valueOf((nVar == null || (rVar2 = nVar.f309151c) == null) ? 0 : rVar2.f309206k));
                    km2.n nVar2 = dk2.ef.H;
                    if (nVar2 != null && (rVar = nVar2.f309151c) != null) {
                        i17 = rVar.f309206k;
                    }
                    qt2Var.set(5, java.lang.Integer.valueOf(i17));
                    ke2.p0 p0Var = ke2.q0.f306981w;
                    gk2.e S0 = etVar.S0();
                    long j17 = etVar.X;
                    int i18 = etVar.Y;
                    java.lang.String str = etVar.V;
                    kn0.e a17 = hn0.v.f282440a.a();
                    new ke2.q0(p0Var.c(S0, xn1Var, j17, i18, str, a17 != null ? a17.B : null, S6), etVar.S0(), qt2Var, null).l();
                } else {
                    dk2.q4.f233938a.e(etVar.R, etVar.S0(), ek2.r0.f253519y.a(etVar.V, 1, S6), zl2.q4.f473933a.m(), null);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
