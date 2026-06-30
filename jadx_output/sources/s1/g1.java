package s1;

/* loaded from: classes14.dex */
public final class g1 extends androidx.compose.ui.platform.i3 implements s1.f1 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f402011d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(yz5.l callback, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f402011d = callback;
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
        if (!(obj instanceof s1.g1)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f402011d, ((s1.g1) obj).f402011d);
    }

    public int hashCode() {
        return this.f402011d.hashCode();
    }

    @Override // z0.t
    public z0.t k(z0.t other) {
        kotlin.jvm.internal.o.g(other, "other");
        return z0.q.a(this, other);
    }

    @Override // s1.f1
    public void l(s1.z coordinates) {
        kotlin.jvm.internal.o.g(coordinates, "coordinates");
        this.f402011d.invoke(coordinates);
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
}
