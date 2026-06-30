package s1;

/* loaded from: classes14.dex */
public final class k1 extends androidx.compose.ui.platform.i3 implements s1.j1 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f402024d;

    /* renamed from: e, reason: collision with root package name */
    public long f402025e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(yz5.l onSizeChanged, yz5.l inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.o.g(onSizeChanged, "onSizeChanged");
        kotlin.jvm.internal.o.g(inspectorInfo, "inspectorInfo");
        this.f402024d = onSizeChanged;
        this.f402025e = p2.r.a(Integer.MIN_VALUE, Integer.MIN_VALUE);
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
        if (!(obj instanceof s1.k1)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f402024d, ((s1.k1) obj).f402024d);
    }

    public int hashCode() {
        return this.f402024d.hashCode();
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

    @Override // s1.j1
    public void y(long j17) {
        if (p2.q.a(this.f402025e, j17)) {
            return;
        }
        this.f402024d.invoke(new p2.q(j17));
        this.f402025e = j17;
    }
}
