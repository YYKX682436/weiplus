package y1;

/* loaded from: classes14.dex */
public final class q implements y1.o {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f458785f;

    /* renamed from: d, reason: collision with root package name */
    public final int f458786d;

    /* renamed from: e, reason: collision with root package name */
    public final y1.l f458787e;

    static {
        new y1.p(null);
        f458785f = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public q(int i17, boolean z17, boolean z18, yz5.l properties) {
        kotlin.jvm.internal.o.g(properties, "properties");
        this.f458786d = i17;
        y1.l lVar = new y1.l();
        lVar.f458767e = z17;
        lVar.f458768f = z18;
        properties.invoke(lVar);
        this.f458787e = lVar;
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
        if (!(obj instanceof y1.q)) {
            return false;
        }
        y1.q qVar = (y1.q) obj;
        if (this.f458786d != qVar.f458786d) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f458787e, qVar.f458787e);
    }

    public int hashCode() {
        return (this.f458787e.hashCode() * 31) + java.lang.Integer.hashCode(this.f458786d);
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
