package d0;

/* loaded from: classes14.dex */
public final class g2 extends androidx.compose.ui.platform.i3 implements s1.i0 {

    /* renamed from: d, reason: collision with root package name */
    public final d0.d2 f225122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(d0.d2 paddingValues, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(paddingValues, "paddingValues");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f225122d = paddingValues;
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
        d0.g2 g2Var = obj instanceof d0.g2 ? (d0.g2) obj : null;
        if (g2Var == null) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f225122d, g2Var.f225122d);
    }

    @Override // s1.i0
    public s1.u0 g(s1.x0 measure, s1.r0 measurable, long j17) {
        kotlin.jvm.internal.o.g(measure, "$this$measure");
        kotlin.jvm.internal.o.g(measurable, "measurable");
        p2.s layoutDirection = measure.getLayoutDirection();
        d0.d2 d2Var = this.f225122d;
        boolean z17 = false;
        float f17 = 0;
        if (java.lang.Float.compare(((d0.e2) d2Var).a(layoutDirection), f17) >= 0 && java.lang.Float.compare(((d0.e2) d2Var).f225109b, f17) >= 0) {
            if (java.lang.Float.compare(((d0.e2) d2Var).b(measure.getLayoutDirection()), f17) >= 0 && java.lang.Float.compare(((d0.e2) d2Var).f225111d, f17) >= 0) {
                z17 = true;
            }
        }
        if (!z17) {
            throw new java.lang.IllegalArgumentException("Padding must be non-negative".toString());
        }
        int G = measure.G(((d0.e2) d2Var).a(measure.getLayoutDirection())) + measure.G(((d0.e2) d2Var).b(measure.getLayoutDirection()));
        int G2 = measure.G(((d0.e2) d2Var).f225109b) + measure.G(((d0.e2) d2Var).f225111d);
        s1.o1 m17 = measurable.m(p2.d.f(j17, -G, -G2));
        return s1.v0.b(measure, p2.d.e(j17, m17.f402050d + G), p2.d.d(j17, m17.f402051e + G2), null, new d0.f2(m17, measure, this), 4, null);
    }

    public int hashCode() {
        return this.f225122d.hashCode();
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
