package y;

/* loaded from: classes14.dex */
public final class h1 extends y.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final z.c2 f458357d;

    /* renamed from: e, reason: collision with root package name */
    public final z.c2 f458358e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.e5 f458359f;

    /* renamed from: g, reason: collision with root package name */
    public final n0.e5 f458360g;

    /* renamed from: h, reason: collision with root package name */
    public final n0.e5 f458361h;

    /* renamed from: i, reason: collision with root package name */
    public z0.d f458362i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f458363m;

    public h1(z.c2 sizeAnimation, z.c2 offsetAnimation, n0.e5 expand, n0.e5 shrink, n0.e5 alignment) {
        kotlin.jvm.internal.o.g(sizeAnimation, "sizeAnimation");
        kotlin.jvm.internal.o.g(offsetAnimation, "offsetAnimation");
        kotlin.jvm.internal.o.g(expand, "expand");
        kotlin.jvm.internal.o.g(shrink, "shrink");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        this.f458357d = sizeAnimation;
        this.f458358e = offsetAnimation;
        this.f458359f = expand;
        this.f458360g = shrink;
        this.f458361h = alignment;
        this.f458363m = new y.g1(this);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        long j18;
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        long a17 = p2.r.a(m17.f402050d, m17.f402051e);
        long j19 = ((p2.q) ((z.b2) this.f458357d.a(this.f458363m, new y.d1(this, a17))).getValue()).f351396a;
        long j27 = ((p2.m) ((z.b2) this.f458358e.a(y.e1.f458338d, new y.f1(this, a17))).getValue()).f351390a;
        z0.d dVar = this.f458362i;
        if (dVar != null) {
            j18 = ((z0.g) dVar).a(a17, j19, p2.s.Ltr);
        } else {
            int i17 = p2.m.f351389c;
            j18 = p2.m.f351388b;
        }
        return s1.v0.b(measure, (int) (j19 >> 32), p2.q.b(j19), null, new y.c1(m17, j18, j27), 4, null);
    }
}
