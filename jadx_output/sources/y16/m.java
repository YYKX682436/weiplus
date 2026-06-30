package y16;

/* loaded from: classes16.dex */
public final class m extends y16.t {

    /* renamed from: b, reason: collision with root package name */
    public final y16.s f458968b;

    public m(y16.s workerScope) {
        kotlin.jvm.internal.o.g(workerScope, "workerScope");
        this.f458968b = workerScope;
    }

    @Override // y16.t, y16.s
    public java.util.Set a() {
        return this.f458968b.a();
    }

    @Override // y16.t, y16.s
    public java.util.Set d() {
        return this.f458968b.d();
    }

    @Override // y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        o06.j e17 = this.f458968b.e(name, location);
        if (e17 == null) {
            return null;
        }
        o06.g gVar = e17 instanceof o06.g ? (o06.g) e17 : null;
        if (gVar != null) {
            return gVar;
        }
        if (e17 instanceof o06.d2) {
            return (o06.d2) e17;
        }
        return null;
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        int i17 = y16.i.f458952l & kindFilter.f458961b;
        y16.i iVar = i17 == 0 ? null : new y16.i(i17, kindFilter.f458960a);
        if (iVar == null) {
            return kz5.p0.f313996d;
        }
        java.util.Collection f17 = this.f458968b.f(iVar, nameFilter);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f17) {
            if (obj instanceof o06.k) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // y16.t, y16.s
    public java.util.Set g() {
        return this.f458968b.g();
    }

    public java.lang.String toString() {
        return "Classes from " + this.f458968b;
    }
}
