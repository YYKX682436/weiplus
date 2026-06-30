package n1;

/* loaded from: classes14.dex */
public final class d implements t1.b, t1.d, s1.i1 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f334030d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f334031e;

    /* renamed from: f, reason: collision with root package name */
    public c1.p f334032f;

    /* renamed from: g, reason: collision with root package name */
    public n1.d f334033g;

    /* renamed from: h, reason: collision with root package name */
    public u1.w f334034h;

    public d(yz5.l lVar, yz5.l lVar2) {
        this.f334030d = lVar;
        this.f334031e = lVar2;
    }

    @Override // t1.b
    public void B(t1.e scope) {
        o0.i iVar;
        o0.i iVar2;
        kotlin.jvm.internal.o.g(scope, "scope");
        c1.p pVar = this.f334032f;
        if (pVar != null && (iVar2 = pVar.f37778t) != null) {
            iVar2.k(this);
        }
        c1.p pVar2 = (c1.p) scope.a(c1.w.f37782a);
        this.f334032f = pVar2;
        if (pVar2 != null && (iVar = pVar2.f37778t) != null) {
            iVar.b(this);
        }
        this.f334033g = (n1.d) scope.a(n1.f.f334036a);
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return z0.r.a(this, predicate);
    }

    public final boolean a(android.view.KeyEvent keyEvent) {
        kotlin.jvm.internal.o.g(keyEvent, "keyEvent");
        yz5.l lVar = this.f334030d;
        java.lang.Boolean bool = lVar != null ? (java.lang.Boolean) lVar.invoke(new n1.b(keyEvent)) : null;
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            return bool.booleanValue();
        }
        n1.d dVar = this.f334033g;
        if (dVar != null) {
            return dVar.a(keyEvent);
        }
        return false;
    }

    public final boolean b(android.view.KeyEvent keyEvent) {
        kotlin.jvm.internal.o.g(keyEvent, "keyEvent");
        n1.d dVar = this.f334033g;
        java.lang.Boolean valueOf = dVar != null ? java.lang.Boolean.valueOf(dVar.b(keyEvent)) : null;
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
            return valueOf.booleanValue();
        }
        yz5.l lVar = this.f334031e;
        if (lVar != null) {
            return ((java.lang.Boolean) lVar.invoke(new n1.b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // t1.d
    public t1.f getKey() {
        return n1.f.f334036a;
    }

    @Override // t1.d
    public java.lang.Object getValue() {
        return this;
    }

    @Override // s1.i1
    public void i(s1.z coordinates) {
        kotlin.jvm.internal.o.g(coordinates, "coordinates");
        this.f334034h = ((u1.c1) coordinates).f423554h;
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
