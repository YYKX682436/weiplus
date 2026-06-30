package d0;

/* loaded from: classes14.dex */
public final class s0 extends androidx.compose.ui.platform.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final d0.q0 f225204d;

    /* renamed from: e, reason: collision with root package name */
    public final float f225205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(d0.q0 direction, float f17, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(direction, "direction");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f225204d = direction;
        this.f225205e = f17;
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
        if (!(obj instanceof d0.s0)) {
            return false;
        }
        d0.s0 s0Var = (d0.s0) obj;
        if (this.f225204d == s0Var.f225204d) {
            return (this.f225205e > s0Var.f225205e ? 1 : (this.f225205e == s0Var.f225205e ? 0 : -1)) == 0;
        }
        return false;
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        int j18;
        int h17;
        int g17;
        int i17;
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        boolean d17 = p2.c.d(j17);
        float f17 = this.f225205e;
        d0.q0 q0Var = this.f225204d;
        if (!d17 || q0Var == d0.q0.Vertical) {
            j18 = p2.c.j(j17);
            h17 = p2.c.h(j17);
        } else {
            j18 = e06.p.f(a06.d.b(p2.c.h(j17) * f17), p2.c.j(j17), p2.c.h(j17));
            h17 = j18;
        }
        if (!p2.c.c(j17) || q0Var == d0.q0.Horizontal) {
            int i18 = p2.c.i(j17);
            g17 = p2.c.g(j17);
            i17 = i18;
        } else {
            i17 = e06.p.f(a06.d.b(p2.c.g(j17) * f17), p2.c.i(j17), p2.c.g(j17));
            g17 = i17;
        }
        s1.o1 m17 = measurable.m(p2.d.a(j18, h17, i17, g17));
        return s1.v0.b(measure, m17.f402050d, m17.f402051e, null, new d0.r0(m17), 4, null);
    }

    public int hashCode() {
        return (this.f225204d.hashCode() * 31) + java.lang.Float.hashCode(this.f225205e);
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
