package k0;

/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ k0.u f302962a = new k0.u();

    /* renamed from: b, reason: collision with root package name */
    public static final k0.v f302963b;

    /* renamed from: c, reason: collision with root package name */
    public static final k0.v f302964c;

    static {
        new k0.p();
        f302963b = new k0.n();
        f302964c = new k0.t();
        new k0.r();
        new k0.o();
    }

    public static final long a(k0.u uVar, a2.k1 k1Var, long j17, yz5.l lVar) {
        uVar.getClass();
        if (k1Var.f765a.f754a.length() == 0) {
            return a2.m1.f781b;
        }
        int H = r26.n0.H(k1Var.f765a.f754a);
        int i17 = a2.m1.f782c;
        long j18 = ((a2.m1) lVar.invoke(java.lang.Integer.valueOf(e06.p.f((int) (j17 >> 32), 0, H)))).f783a;
        long j19 = ((a2.m1) lVar.invoke(java.lang.Integer.valueOf(e06.p.f(a2.m1.c(j17), 0, H)))).f783a;
        return a2.n1.a(a2.m1.g(j17) ? a2.m1.c(j18) : (int) (j18 >> 32), a2.m1.g(j17) ? (int) (j19 >> 32) : a2.m1.c(j19));
    }
}
