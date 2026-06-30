package y16;

/* loaded from: classes16.dex */
public final class c implements y16.s {

    /* renamed from: d, reason: collision with root package name */
    public static final y16.b f458926d = new y16.b(null);

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f458927b;

    /* renamed from: c, reason: collision with root package name */
    public final y16.s[] f458928c;

    public c(java.lang.String str, y16.s[] sVarArr, kotlin.jvm.internal.i iVar) {
        this.f458927b = str;
        this.f458928c = sVarArr;
    }

    @Override // y16.s
    public java.util.Set a() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (y16.s sVar : this.f458928c) {
            kz5.h0.u(linkedHashSet, sVar.a());
        }
        return linkedHashSet;
    }

    @Override // y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        y16.s[] sVarArr = this.f458928c;
        int length = sVarArr.length;
        if (length == 0) {
            return kz5.p0.f313996d;
        }
        if (length == 1) {
            return sVarArr[0].b(name, location);
        }
        java.util.Collection collection = null;
        for (y16.s sVar : sVarArr) {
            collection = n26.a.a(collection, sVar.b(name, location));
        }
        return collection == null ? kz5.r0.f314002d : collection;
    }

    @Override // y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        y16.s[] sVarArr = this.f458928c;
        int length = sVarArr.length;
        if (length == 0) {
            return kz5.p0.f313996d;
        }
        if (length == 1) {
            return sVarArr[0].c(name, location);
        }
        java.util.Collection collection = null;
        for (y16.s sVar : sVarArr) {
            collection = n26.a.a(collection, sVar.c(name, location));
        }
        return collection == null ? kz5.r0.f314002d : collection;
    }

    @Override // y16.s
    public java.util.Set d() {
        return y16.u.a(kz5.z.B(this.f458928c));
    }

    @Override // y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        o06.j jVar = null;
        for (y16.s sVar : this.f458928c) {
            o06.j e17 = sVar.e(name, location);
            if (e17 != null) {
                if (!(e17 instanceof o06.k) || !((o06.k) e17).l0()) {
                    return e17;
                }
                if (jVar == null) {
                    jVar = e17;
                }
            }
        }
        return jVar;
    }

    @Override // y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        y16.s[] sVarArr = this.f458928c;
        int length = sVarArr.length;
        if (length == 0) {
            return kz5.p0.f313996d;
        }
        if (length == 1) {
            return sVarArr[0].f(kindFilter, nameFilter);
        }
        java.util.Collection collection = null;
        for (y16.s sVar : sVarArr) {
            collection = n26.a.a(collection, sVar.f(kindFilter, nameFilter));
        }
        return collection == null ? kz5.r0.f314002d : collection;
    }

    @Override // y16.s
    public java.util.Set g() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (y16.s sVar : this.f458928c) {
            kz5.h0.u(linkedHashSet, sVar.g());
        }
        return linkedHashSet;
    }

    public java.lang.String toString() {
        return this.f458927b;
    }
}
