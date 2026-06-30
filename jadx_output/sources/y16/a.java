package y16;

/* loaded from: classes16.dex */
public abstract class a implements y16.s {
    @Override // y16.s
    public java.util.Set a() {
        return i().a();
    }

    @Override // y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return i().b(name, location);
    }

    @Override // y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return i().c(name, location);
    }

    @Override // y16.s
    public java.util.Set d() {
        return i().d();
    }

    @Override // y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return i().e(name, location);
    }

    @Override // y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        return i().f(kindFilter, nameFilter);
    }

    @Override // y16.s
    public java.util.Set g() {
        return i().g();
    }

    public final y16.s h() {
        if (!(i() instanceof y16.a)) {
            return i();
        }
        y16.s i17 = i();
        kotlin.jvm.internal.o.e(i17, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((y16.a) i17).h();
    }

    public abstract y16.s i();
}
