package d0;

/* loaded from: classes14.dex */
public final class c2 extends androidx.compose.ui.platform.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final float f225089d;

    /* renamed from: e, reason: collision with root package name */
    public final float f225090e;

    /* renamed from: f, reason: collision with root package name */
    public final float f225091f;

    /* renamed from: g, reason: collision with root package name */
    public final float f225092g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f225093h;

    public c2(float f17, float f18, float f19, float f27, boolean z17, yz5.l lVar, kotlin.jvm.internal.i iVar) {
        super(lVar);
        this.f225089d = f17;
        this.f225090e = f18;
        this.f225091f = f19;
        this.f225092g = f27;
        this.f225093h = z17;
        if (!((f17 >= 0.0f || p2.h.a(f17, Float.NaN)) && (f18 >= 0.0f || p2.h.a(f18, Float.NaN)) && ((f19 >= 0.0f || p2.h.a(f19, Float.NaN)) && (f27 >= 0.0f || p2.h.a(f27, Float.NaN))))) {
            throw new java.lang.IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i0
    public int O(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.d(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int Q(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.a(this, uVar, tVar, i17);
    }

    @Override // s1.i0
    public int S(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.c(this, uVar, tVar, i17);
    }

    public boolean equals(java.lang.Object obj) {
        d0.c2 c2Var = obj instanceof d0.c2 ? (d0.c2) obj : null;
        return c2Var != null && p2.h.a(this.f225089d, c2Var.f225089d) && p2.h.a(this.f225090e, c2Var.f225090e) && p2.h.a(this.f225091f, c2Var.f225091f) && p2.h.a(this.f225092g, c2Var.f225092g) && this.f225093h == c2Var.f225093h;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        int G = measure.G(this.f225089d) + measure.G(this.f225091f);
        int G2 = measure.G(this.f225090e) + measure.G(this.f225092g);
        s1.o1 m17 = measurable.m(p2.d.f(j17, -G, -G2));
        return s1.v0.b(measure, p2.d.e(j17, m17.f402050d + G), p2.d.d(j17, m17.f402051e + G2), null, new d0.b2(this, m17, measure), 4, null);
    }

    public int hashCode() {
        return (((((((java.lang.Float.hashCode(this.f225089d) * 31) + java.lang.Float.hashCode(this.f225090e)) * 31) + java.lang.Float.hashCode(this.f225091f)) * 31) + java.lang.Float.hashCode(this.f225092g)) * 31) + java.lang.Boolean.hashCode(this.f225093h);
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(this, obj);
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }

    @Override // s1.i0
    public int x(s1.u uVar, s1.t tVar, int i17) {
        return s1.h0.b(this, uVar, tVar, i17);
    }
}
