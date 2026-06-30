package d0;

/* loaded from: classes14.dex */
public final class z1 extends androidx.compose.ui.platform.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f225249d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f225250e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(yz5.l offset, boolean z17, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(offset, "offset");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f225249d = offset;
        this.f225250e = z17;
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
        d0.z1 z1Var = obj instanceof d0.z1 ? (d0.z1) obj : null;
        if (z1Var == null) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f225249d, z1Var.f225249d) && this.f225250e == z1Var.f225250e;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        s1.o1 m17 = measurable.m(j17);
        return s1.v0.b(measure, m17.f402050d, m17.f402051e, null, new d0.y1(this, measure, m17), 4, null);
    }

    public int hashCode() {
        return (this.f225249d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f225250e);
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
        return "OffsetPxModifier(offset=" + this.f225249d + ", rtlAware=" + this.f225250e + ')';
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
