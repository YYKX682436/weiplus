package m1;

/* loaded from: classes14.dex */
public class b implements t1.b, t1.d {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f322613d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f322614e;

    /* renamed from: f, reason: collision with root package name */
    public final t1.f f322615f;

    /* renamed from: g, reason: collision with root package name */
    public m1.b f322616g;

    public b(yz5.l lVar, yz5.l lVar2, t1.f key) {
        kotlin.jvm.internal.o.g(key, "key");
        this.f322613d = lVar;
        this.f322614e = lVar2;
        this.f322615f = key;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        kotlin.jvm.internal.o.g(scope, "scope");
        this.f322616g = (m1.b) scope.a(this.f322615f);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final boolean a(m1.a aVar) {
        yz5.l lVar = this.f322613d;
        if (lVar != null && ((java.lang.Boolean) lVar.invoke(aVar)).booleanValue()) {
            return true;
        }
        m1.b bVar = this.f322616g;
        if (bVar != null) {
            return bVar.a(aVar);
        }
        return false;
    }

    public final boolean b(m1.a aVar) {
        m1.b bVar = this.f322616g;
        if (bVar != null && bVar.b(aVar)) {
            return true;
        }
        yz5.l lVar = this.f322614e;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.invoke(aVar)).booleanValue();
        }
        return false;
    }

    @Override // t1.d
    public t1.f getKey() {
        return this.f322615f;
    }

    @Override // t1.d
    public java.lang.Object getValue() {
        return this;
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
