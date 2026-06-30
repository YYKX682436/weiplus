package y16;

/* loaded from: classes16.dex */
public abstract class t implements y16.s {
    @Override // y16.s
    public java.util.Set a() {
        y16.i iVar = y16.i.f458956p;
        int i17 = o26.l.f342604a;
        java.util.Collection f17 = f(iVar, o26.j.f342602d);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : f17) {
            if (obj instanceof o06.v1) {
                n16.g name = ((r06.v) ((o06.v1) obj)).getName();
                kotlin.jvm.internal.o.f(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return kz5.p0.f313996d;
    }

    @Override // y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return kz5.p0.f313996d;
    }

    @Override // y16.s
    public java.util.Set d() {
        return null;
    }

    @Override // y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return null;
    }

    @Override // y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        return kz5.p0.f313996d;
    }

    @Override // y16.s
    public java.util.Set g() {
        y16.i iVar = y16.i.f458957q;
        int i17 = o26.l.f342604a;
        java.util.Collection f17 = f(iVar, o26.j.f342602d);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (java.lang.Object obj : f17) {
            if (obj instanceof o06.v1) {
                n16.g name = ((r06.v) ((o06.v1) obj)).getName();
                kotlin.jvm.internal.o.f(name, "getName(...)");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
