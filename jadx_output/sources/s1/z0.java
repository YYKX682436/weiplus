package s1;

/* loaded from: classes14.dex */
public final class z0 implements s1.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final s1.t f402095d;

    /* renamed from: e, reason: collision with root package name */
    public final s1.b1 f402096e;

    /* renamed from: f, reason: collision with root package name */
    public final s1.c1 f402097f;

    public z0(s1.t measurable, s1.b1 minMax, s1.c1 widthHeight) {
        kotlin.jvm.internal.o.g(measurable, "measurable");
        kotlin.jvm.internal.o.g(minMax, "minMax");
        kotlin.jvm.internal.o.g(widthHeight, "widthHeight");
        this.f402095d = measurable;
        this.f402096e = minMax;
        this.f402097f = widthHeight;
    }

    @Override // s1.t
    public java.lang.Object g() {
        return this.f402095d.g();
    }

    @Override // s1.t
    public int i(int i17) {
        return this.f402095d.i(i17);
    }

    @Override // s1.t
    public int j(int i17) {
        return this.f402095d.j(i17);
    }

    @Override // s1.t
    public int k(int i17) {
        return this.f402095d.k(i17);
    }

    @Override // s1.t
    public int l(int i17) {
        return this.f402095d.l(i17);
    }

    @Override // s1.r0
    public s1.o1 m(long j17) {
        s1.c1 c1Var = s1.c1.Width;
        s1.b1 b1Var = s1.b1.Max;
        s1.b1 b1Var2 = this.f402096e;
        s1.t tVar = this.f402095d;
        if (this.f402097f == c1Var) {
            return new s1.a1(b1Var2 == b1Var ? tVar.l(p2.c.g(j17)) : tVar.k(p2.c.g(j17)), p2.c.g(j17));
        }
        return new s1.a1(p2.c.h(j17), b1Var2 == b1Var ? tVar.i(p2.c.h(j17)) : tVar.j(p2.c.h(j17)));
    }
}
