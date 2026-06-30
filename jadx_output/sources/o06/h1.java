package o06;

/* loaded from: classes15.dex */
public final class h1 implements o06.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Collection f341968a;

    public h1(java.util.Collection packageFragments) {
        kotlin.jvm.internal.o.g(packageFragments, "packageFragments");
        this.f341968a = packageFragments;
    }

    @Override // o06.j1
    public void a(n16.c fqName, java.util.Collection packageFragments) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(packageFragments, "packageFragments");
        for (java.lang.Object obj : this.f341968a) {
            if (kotlin.jvm.internal.o.b(((r06.z0) ((o06.d1) obj)).f368566h, fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // o06.e1
    public java.util.List b(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        java.util.Collection collection = this.f341968a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (kotlin.jvm.internal.o.b(((r06.z0) ((o06.d1) obj)).f368566h, fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // o06.j1
    public boolean c(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        java.util.Collection collection = this.f341968a;
        if ((collection instanceof java.util.Collection) && collection.isEmpty()) {
            return true;
        }
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.o.b(((r06.z0) ((o06.d1) it.next())).f368566h, fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // o06.e1
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        return q26.h0.y(q26.h0.i(q26.h0.o(kz5.n0.J(this.f341968a), o06.f1.f341956d), new o06.g1(fqName)));
    }
}
