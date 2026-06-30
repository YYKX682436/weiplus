package y;

/* loaded from: classes14.dex */
public final class s1 extends y.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final z.p f458440d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f458441e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f458442f;

    /* renamed from: g, reason: collision with root package name */
    public y.p1 f458443g;

    public s1(z.p animSpec, kotlinx.coroutines.y0 scope) {
        kotlin.jvm.internal.o.g(animSpec, "animSpec");
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f458440d = animSpec;
        this.f458441e = scope;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        long a17 = p2.r.a(m17.f402050d, m17.f402051e);
        y.p1 p1Var = this.f458443g;
        if (p1Var != null) {
            z.e eVar = p1Var.f458424a;
            if (!p2.q.a(a17, ((p2.q) ((n0.q4) eVar.f468634e).getValue()).f351396a)) {
                p1Var.f458425b = ((p2.q) eVar.d()).f351396a;
                kotlinx.coroutines.l.d(this.f458441e, null, null, new y.q1(p1Var, a17, this, null), 3, null);
            }
        } else {
            p1Var = new y.p1(new z.e(new p2.q(a17), z.q3.f468808h, new p2.q(p2.r.a(1, 1))), a17, null);
        }
        this.f458443g = p1Var;
        long j18 = ((p2.q) p1Var.f458424a.d()).f351396a;
        return s1.v0.b(measure, (int) (j18 >> 32), p2.q.b(j18), null, new y.r1(m17), 4, null);
    }
}
