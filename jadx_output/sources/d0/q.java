package d0;

/* loaded from: classes14.dex */
public final class q extends androidx.compose.ui.platform.i3 implements s1.l1 {

    /* renamed from: d, reason: collision with root package name */
    public final z0.d f225191d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f225192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(z0.d alignment, boolean z17, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(alignment, "alignment");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f225191d = alignment;
        this.f225192e = z17;
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
        d0.q qVar = obj instanceof d0.q ? (d0.q) obj : null;
        if (qVar == null) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f225191d, qVar.f225191d) && this.f225192e == qVar.f225192e;
    }

    public int hashCode() {
        return (this.f225191d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f225192e);
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
        return "BoxChildData(alignment=" + this.f225191d + ", matchParentSize=" + this.f225192e + ')';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return operation.invoke(obj, this);
    }
}
