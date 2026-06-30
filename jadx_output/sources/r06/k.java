package r06;

/* loaded from: classes16.dex */
public final class k implements f26.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r06.l f368474a;

    public k(r06.l lVar) {
        this.f368474a = lVar;
    }

    @Override // f26.c2
    public java.util.Collection a() {
        java.util.Collection a17 = ((d26.p0) this.f368474a).v0().w0().a();
        kotlin.jvm.internal.o.f(a17, "getSupertypes(...)");
        return a17;
    }

    @Override // f26.c2
    public java.util.List getParameters() {
        java.util.List list = ((d26.p0) this.f368474a).f226043v;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.o.o("typeConstructorParameters");
        throw null;
    }

    @Override // f26.c2
    public l06.o h() {
        return v16.f.e(this.f368474a);
    }

    @Override // f26.c2
    public o06.j i() {
        return this.f368474a;
    }

    @Override // f26.c2
    public boolean j() {
        return true;
    }

    public java.lang.String toString() {
        return "[typealias " + this.f368474a.getName().h() + ']';
    }
}
