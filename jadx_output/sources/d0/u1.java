package d0;

/* loaded from: classes14.dex */
public final class u1 extends androidx.compose.ui.platform.i3 implements s1.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final float f225214d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f225215e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(float f17, boolean z17, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f225214d = f17;
        this.f225215e = z17;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        d0.u1 u1Var = obj instanceof d0.u1 ? (d0.u1) obj : null;
        if (u1Var == null) {
            return false;
        }
        return ((this.f225214d > u1Var.f225214d ? 1 : (this.f225214d == u1Var.f225214d ? 0 : -1)) == 0) && this.f225215e == u1Var.f225215e;
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f225214d) * 31) + java.lang.Boolean.hashCode(this.f225215e);
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

    @Override // s1.l1
    public java.lang.Object s(p2.f fVar, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        d0.k2 k2Var = obj instanceof d0.k2 ? (d0.k2) obj : null;
        if (k2Var == null) {
            k2Var = new d0.k2(0.0f, false, null, 7, null);
        }
        k2Var.f225156a = this.f225214d;
        k2Var.f225157b = this.f225215e;
        return k2Var;
    }

    public java.lang.String toString() {
        return "LayoutWeightImpl(weight=" + this.f225214d + ", fill=" + this.f225215e + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
