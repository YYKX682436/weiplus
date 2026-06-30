package p06;

/* loaded from: classes16.dex */
public final class r implements p06.k {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f350774d;

    public r(java.util.List delegates) {
        kotlin.jvm.internal.o.g(delegates, "delegates");
        this.f350774d = delegates;
    }

    @Override // p06.k
    public boolean I(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        java.util.Iterator it = ((kz5.k0) kz5.n0.J(this.f350774d)).iterator();
        while (it.hasNext()) {
            if (((p06.k) it.next()).I(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // p06.k
    public p06.c a(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        return (p06.c) q26.h0.l(q26.h0.p(kz5.n0.J(this.f350774d), new p06.p(fqName)));
    }

    @Override // p06.k
    public boolean isEmpty() {
        java.util.List list = this.f350774d;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((p06.k) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new q26.j((q26.k) q26.h0.m(kz5.n0.J(this.f350774d), p06.q.f350773d));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(p06.k... delegates) {
        this(kz5.z.z0(delegates));
        kotlin.jvm.internal.o.g(delegates, "delegates");
    }
}
