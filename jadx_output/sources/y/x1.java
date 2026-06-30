package y;

/* loaded from: classes14.dex */
public final class x1 extends y.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final z.c2 f458474d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.e5 f458475e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.e5 f458476f;

    /* renamed from: g, reason: collision with root package name */
    public final yz5.l f458477g;

    public x1(z.c2 lazyAnimation, n0.e5 slideIn, n0.e5 slideOut) {
        kotlin.jvm.internal.o.g(lazyAnimation, "lazyAnimation");
        kotlin.jvm.internal.o.g(slideIn, "slideIn");
        kotlin.jvm.internal.o.g(slideOut, "slideOut");
        this.f458474d = lazyAnimation;
        this.f458475e = slideIn;
        this.f458476f = slideOut;
        this.f458477g = new y.w1(this);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        return s1.v0.b(measure, m17.f402050d, m17.f402051e, null, new y.v1(this, m17, p2.r.a(m17.f402050d, m17.f402051e)), 4, null);
    }
}
