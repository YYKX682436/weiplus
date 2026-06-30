package d0;

/* loaded from: classes14.dex */
public final class t0 extends androidx.compose.ui.platform.i3 implements s1.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final z0.b f225208d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(z0.b horizontal, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(horizontal, "horizontal");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f225208d = horizontal;
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
        d0.t0 t0Var = obj instanceof d0.t0 ? (d0.t0) obj : null;
        if (t0Var == null) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f225208d, t0Var.f225208d);
    }

    public int hashCode() {
        return this.f225208d.hashCode();
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
        z0.b horizontal = this.f225208d;
        kotlin.jvm.internal.o.g(horizontal, "horizontal");
        k2Var.f225158c = new d0.n0(horizontal);
        return k2Var;
    }

    public java.lang.String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.f225208d + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
