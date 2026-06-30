package n0;

/* loaded from: classes14.dex */
public final class f2 implements y0.b, java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.g2 f333506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333507e;

    public f2(n0.g2 g2Var, int i17) {
        this.f333506d = g2Var;
        this.f333507e = i17;
    }

    @Override // y0.a
    public java.lang.Iterable d() {
        return this;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        n0.g2 g2Var = this.f333506d;
        g2Var.b();
        n0.k4 k4Var = g2Var.f333511d;
        int i17 = this.f333507e;
        return new n0.g2(k4Var, i17 + 1, i17 + n0.l4.c(k4Var.f333590d, i17));
    }
}
