package g16;

/* loaded from: classes15.dex */
public abstract class g extends g16.l implements b26.d {

    /* renamed from: c, reason: collision with root package name */
    public final e26.v f267626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e26.c0 storageManager, g16.k0 kotlinClassFinder) {
        super(kotlinClassFinder);
        kotlin.jvm.internal.o.g(storageManager, "storageManager");
        kotlin.jvm.internal.o.g(kotlinClassFinder, "kotlinClassFinder");
        this.f267626c = ((e26.u) storageManager).c(new g16.f(this));
    }

    @Override // b26.d
    public java.lang.Object g(b26.x0 container, i16.u0 proto, f26.o0 expectedType) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(expectedType, "expectedType");
        return t(container, proto, b26.c.PROPERTY, expectedType, g16.e.f267615d);
    }

    @Override // b26.d
    public java.lang.Object i(b26.x0 container, i16.u0 proto, f26.o0 expectedType) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(proto, "proto");
        kotlin.jvm.internal.o.g(expectedType, "expectedType");
        return t(container, proto, b26.c.PROPERTY_GETTER, expectedType, g16.a.f267590d);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(b26.x0 r16, i16.u0 r17, b26.c r18, f26.o0 r19, yz5.p r20) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g16.g.t(b26.x0, i16.u0, b26.c, f26.o0, yz5.p):java.lang.Object");
    }
}
