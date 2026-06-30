package d0;

/* loaded from: classes14.dex */
public final class x1 extends androidx.compose.ui.platform.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final float f225238d;

    /* renamed from: e, reason: collision with root package name */
    public final float f225239e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f225240f;

    public x1(float f17, float f18, boolean z17, yz5.l lVar, kotlin.jvm.internal.i iVar) {
        super(lVar);
        this.f225238d = f17;
        this.f225239e = f18;
        this.f225240f = z17;
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
        if (this == obj) {
            return true;
        }
        d0.x1 x1Var = obj instanceof d0.x1 ? (d0.x1) obj : null;
        if (x1Var == null) {
            return false;
        }
        return p2.h.a(this.f225238d, x1Var.f225238d) && p2.h.a(this.f225239e, x1Var.f225239e) && this.f225240f == x1Var.f225240f;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        return s1.v0.b(measure, m17.f402050d, m17.f402051e, null, new d0.w1(this, m17, measure), 4, null);
    }

    public int hashCode() {
        return (((java.lang.Float.hashCode(this.f225238d) * 31) + java.lang.Float.hashCode(this.f225239e)) * 31) + java.lang.Boolean.hashCode(this.f225240f);
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

    public java.lang.String toString() {
        return "OffsetModifier(x=" + ((java.lang.Object) p2.h.b(this.f225238d)) + ", y=" + ((java.lang.Object) p2.h.b(this.f225239e)) + ", rtlAware=" + this.f225240f + ')';
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
