package f0;

/* loaded from: classes14.dex */
public final class o1 implements s1.s1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.r1 f258179d;

    public o1(f0.r1 r1Var) {
        this.f258179d = r1Var;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.s1
    public void j(s1.r1 remeasurement) {
        kotlin.jvm.internal.o.g(remeasurement, "remeasurement");
        this.f258179d.f258219m = remeasurement;
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
}
