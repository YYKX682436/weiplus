package g0;

/* loaded from: classes14.dex */
public abstract class b implements t1.b, s1.i1 {

    /* renamed from: d, reason: collision with root package name */
    public final g0.e f267337d;

    /* renamed from: e, reason: collision with root package name */
    public g0.e f267338e;

    /* renamed from: f, reason: collision with root package name */
    public s1.z f267339f;

    public b(g0.e defaultParent) {
        kotlin.jvm.internal.o.g(defaultParent, "defaultParent");
        this.f267337d = defaultParent;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f267338e = (g0.e) scope.a(g0.d.f267341a);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    @Override // s1.i1
    public void i(s1.z coordinates) {
        kotlin.jvm.internal.o.g(coordinates, "coordinates");
        this.f267339f = coordinates;
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
