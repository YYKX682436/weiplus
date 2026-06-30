package d0;

/* loaded from: classes14.dex */
public final class j3 extends androidx.compose.ui.platform.i3 implements s1.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final z0.c f225154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(z0.c vertical, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(vertical, "vertical");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f225154d = vertical;
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
        d0.j3 j3Var = obj instanceof d0.j3 ? (d0.j3) obj : null;
        if (j3Var == null) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f225154d, j3Var.f225154d);
    }

    public int hashCode() {
        return this.f225154d.hashCode();
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
        z0.c vertical = this.f225154d;
        kotlin.jvm.internal.o.g(vertical, "vertical");
        k2Var.f225158c = new d0.o0(vertical);
        return k2Var;
    }

    public java.lang.String toString() {
        return "VerticalAlignModifier(vertical=" + this.f225154d + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
