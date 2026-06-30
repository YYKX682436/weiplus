package s1;

/* loaded from: classes14.dex */
public final class b0 extends androidx.compose.ui.platform.i3 implements s1.l1, s1.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f401989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.Object layoutId, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(layoutId, "layoutId");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f401989d = layoutId;
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
        s1.b0 b0Var = obj instanceof s1.b0 ? (s1.b0) obj : null;
        if (b0Var == null) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f401989d, b0Var.f401989d);
    }

    public int hashCode() {
        return this.f401989d.hashCode();
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
        return this;
    }

    public java.lang.String toString() {
        return "LayoutId(id=" + this.f401989d + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
