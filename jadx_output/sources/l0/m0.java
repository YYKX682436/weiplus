package l0;

/* loaded from: classes14.dex */
public final class m0 implements m0.y {

    /* renamed from: a, reason: collision with root package name */
    public static final l0.m0 f314378a = new l0.m0();

    @Override // m0.y
    public m0.j a(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-1419762518);
        m0.j jVar = ((l0.i) y0Var.i(l0.k.f314314a)).l() ? ((double) e1.a0.g(((e1.y) y0Var.i(l0.p.f314416a)).f246322a)) > 0.5d ? m0.a0.f322426b : m0.a0.f322427c : m0.a0.f322428d;
        y0Var.o(false);
        return jVar;
    }

    @Override // m0.y
    public long b(n0.o oVar, int i17) {
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(550536719);
        long j17 = ((e1.y) y0Var.i(l0.p.f314416a)).f246322a;
        boolean l17 = ((l0.i) y0Var.i(l0.k.f314314a)).l();
        float g17 = e1.a0.g(j17);
        if (!l17 && g17 < 0.5d) {
            int i18 = e1.y.f246321l;
            j17 = e1.y.f246315f;
        }
        y0Var.o(false);
        return j17;
    }
}
