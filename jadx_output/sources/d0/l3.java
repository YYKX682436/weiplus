package d0;

/* loaded from: classes14.dex */
public final class l3 extends androidx.compose.ui.platform.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final d0.q0 f225166d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f225167e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.p f225168f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f225169g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(d0.q0 direction, boolean z17, yz5.p alignmentCallback, java.lang.Object align, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(direction, "direction");
        kotlin.jvm.internal.o.g(alignmentCallback, "alignmentCallback");
        kotlin.jvm.internal.o.g(align, "align");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f225166d = direction;
        this.f225167e = z17;
        this.f225168f = alignmentCallback;
        this.f225169g = align;
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
        if (!(obj instanceof d0.l3)) {
            return false;
        }
        d0.l3 l3Var = (d0.l3) obj;
        return this.f225166d == l3Var.f225166d && this.f225167e == l3Var.f225167e && kotlin.jvm.internal.o.b(this.f225169g, l3Var.f225169g);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        d0.q0 q0Var = d0.q0.Vertical;
        d0.q0 q0Var2 = this.f225166d;
        int j18 = q0Var2 != q0Var ? 0 : p2.c.j(j17);
        d0.q0 q0Var3 = d0.q0.Horizontal;
        int i17 = q0Var2 == q0Var3 ? p2.c.i(j17) : 0;
        boolean z17 = this.f225167e;
        s1.o1 m17 = measurable.m(p2.d.a(j18, (q0Var2 == q0Var || !z17) ? p2.c.h(j17) : Integer.MAX_VALUE, i17, (q0Var2 == q0Var3 || !z17) ? p2.c.g(j17) : Integer.MAX_VALUE));
        int f17 = e06.p.f(m17.f402050d, p2.c.j(j17), p2.c.h(j17));
        int f18 = e06.p.f(m17.f402051e, p2.c.i(j17), p2.c.g(j17));
        return s1.v0.b(measure, f17, f18, null, new d0.k3(this, f17, m17, f18, measure), 4, null);
    }

    public int hashCode() {
        return (((this.f225166d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f225167e)) * 31) + this.f225169g.hashCode();
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
