package n0;

/* loaded from: classes14.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f333797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.y0 f333798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f333799f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yz5.p pVar, n0.y0 y0Var, java.lang.Object obj) {
        super(0);
        this.f333797d = pVar;
        this.f333798e = y0Var;
        this.f333799f = obj;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n0.y0 y0Var = this.f333798e;
        yz5.p pVar = this.f333797d;
        if (pVar != null) {
            y0Var.R(200, n0.e1.f333492a);
            kotlin.jvm.internal.m0.e(pVar, 2);
            pVar.invoke(y0Var, 1);
            y0Var.o(false);
        } else {
            y0Var.getClass();
            if (((java.util.ArrayList) y0Var.f333778s).isEmpty()) {
                y0Var.f333772m += y0Var.E.m();
            } else {
                n0.j4 j4Var = y0Var.E;
                int e17 = j4Var.e();
                int i17 = j4Var.f333574f;
                int i18 = j4Var.f333575g;
                int[] iArr = j4Var.f333570b;
                java.lang.Object j17 = i17 < i18 ? j4Var.j(iArr, i17) : null;
                java.lang.Object d17 = j4Var.d();
                y0Var.a0(e17, j17, d17);
                y0Var.T(n0.l4.f(iArr, j4Var.f333574f), null);
                y0Var.F();
                j4Var.c();
                y0Var.b0(e17, j17, d17);
            }
        }
        return jz5.f0.f302826a;
    }
}
