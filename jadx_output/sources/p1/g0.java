package p1;

/* loaded from: classes14.dex */
public final class g0 implements p1.z {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f350820d;

    /* renamed from: e, reason: collision with root package name */
    public p1.k0 f350821e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f350822f;

    /* renamed from: g, reason: collision with root package name */
    public final p1.y f350823g = new p1.f0(this);

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // p1.z
    public p1.y N() {
        return this.f350823g;
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
