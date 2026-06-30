package r06;

/* loaded from: classes15.dex */
public final class u implements o06.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f368535a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f368536b;

    public u(java.util.List providers, java.lang.String debugName) {
        kotlin.jvm.internal.o.g(providers, "providers");
        kotlin.jvm.internal.o.g(debugName, "debugName");
        this.f368535a = providers;
        this.f368536b = debugName;
        providers.size();
        kz5.n0.X0(providers).size();
    }

    @Override // o06.j1
    public void a(n16.c fqName, java.util.Collection packageFragments) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(packageFragments, "packageFragments");
        java.util.Iterator it = this.f368535a.iterator();
        while (it.hasNext()) {
            o06.i1.a((o06.e1) it.next(), fqName, packageFragments);
        }
    }

    @Override // o06.e1
    public java.util.List b(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f368535a.iterator();
        while (it.hasNext()) {
            o06.i1.a((o06.e1) it.next(), fqName, arrayList);
        }
        return kz5.n0.S0(arrayList);
    }

    @Override // o06.j1
    public boolean c(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        java.util.List list = this.f368535a;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!o06.i1.b((o06.e1) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // o06.e1
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = this.f368535a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((o06.e1) it.next()).l(fqName, nameFilter));
        }
        return hashSet;
    }

    public java.lang.String toString() {
        return this.f368536b;
    }
}
