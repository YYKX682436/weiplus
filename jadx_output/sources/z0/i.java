package z0;

/* loaded from: classes14.dex */
public final class i implements z0.t {

    /* renamed from: d, reason: collision with root package name */
    public final z0.t f468909d;

    /* renamed from: e, reason: collision with root package name */
    public final z0.t f468910e;

    public i(z0.t outer, z0.t inner) {
        kotlin.jvm.internal.o.g(outer, "outer");
        kotlin.jvm.internal.o.g(inner, "inner");
        this.f468909d = outer;
        this.f468910e = inner;
    }

    @Override // z0.t
    public boolean E(yz5.l predicate) {
        kotlin.jvm.internal.o.g(predicate, "predicate");
        return this.f468909d.E(predicate) && this.f468910e.E(predicate);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof z0.i) {
            z0.i iVar = (z0.i) obj;
            if (kotlin.jvm.internal.o.b(this.f468909d, iVar.f468909d) && kotlin.jvm.internal.o.b(this.f468910e, iVar.f468910e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f468909d.hashCode() + (this.f468910e.hashCode() * 31);
    }

    @Override // z0.t
    public z0.t k(z0.t tVar) {
        return z0.q.a(this, tVar);
    }

    @Override // z0.t
    public java.lang.Object m(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return this.f468909d.m(this.f468910e.m(obj, operation), operation);
    }

    public java.lang.String toString() {
        return "[" + ((java.lang.String) u("", z0.h.f468908d)) + ']';
    }

    @Override // z0.t
    public java.lang.Object u(java.lang.Object obj, yz5.p operation) {
        kotlin.jvm.internal.o.g(operation, "operation");
        return this.f468910e.u(this.f468909d.u(obj, operation), operation);
    }
}
