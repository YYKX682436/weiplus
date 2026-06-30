package h26;

/* loaded from: classes16.dex */
public final class f implements o06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public static final h26.f f278330d = new h26.f();

    /* renamed from: e, reason: collision with root package name */
    public static final n16.g f278331e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f278332f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f278333g;

    static {
        h26.b[] bVarArr = h26.b.f278327d;
        f278331e = n16.g.m("<Error module>");
        f278332f = kz5.p0.f313996d;
        f278333g = jz5.h.b(h26.e.f278329d);
    }

    @Override // o06.v0
    public java.lang.Object I(o06.u0 capability) {
        kotlin.jvm.internal.o.g(capability, "capability");
        return null;
    }

    @Override // o06.v0
    public java.util.List K() {
        return f278332f;
    }

    @Override // o06.v0
    public o06.k1 Q(n16.c fqName) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        throw new java.lang.IllegalStateException("Should not be called!");
    }

    @Override // o06.m
    public o06.m a() {
        return this;
    }

    @Override // o06.v0
    public boolean b0(o06.v0 targetModule) {
        kotlin.jvm.internal.o.g(targetModule, "targetModule");
        return false;
    }

    @Override // o06.m
    public o06.m e() {
        return null;
    }

    @Override // p06.a
    public p06.k getAnnotations() {
        int i17 = p06.k.Z0;
        return p06.i.f350765a;
    }

    @Override // o06.x0
    public n16.g getName() {
        return f278331e;
    }

    @Override // o06.v0
    public l06.o h() {
        return (l06.o) ((jz5.n) f278333g).getValue();
    }

    @Override // o06.v0
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(fqName, "fqName");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        return kz5.p0.f313996d;
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(visitor, "visitor");
        return null;
    }
}
