package g26;

/* loaded from: classes16.dex */
public final class v implements g26.u {

    /* renamed from: c, reason: collision with root package name */
    public final g26.l f268015c;

    /* renamed from: d, reason: collision with root package name */
    public final g26.j f268016d;

    /* renamed from: e, reason: collision with root package name */
    public final r16.x f268017e;

    public v(g26.l kotlinTypeRefiner, g26.j kotlinTypePreparator, int i17, kotlin.jvm.internal.i iVar) {
        int i18 = i17 & 2;
        g26.h hVar = g26.h.f267993a;
        kotlinTypePreparator = i18 != 0 ? hVar : kotlinTypePreparator;
        kotlin.jvm.internal.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlin.jvm.internal.o.g(kotlinTypePreparator, "kotlinTypePreparator");
        this.f268015c = kotlinTypeRefiner;
        this.f268016d = kotlinTypePreparator;
        this.f268017e = new r16.x(r16.x.f368680e, kotlinTypeRefiner, hVar, null);
    }

    public boolean a(f26.o0 a17, f26.o0 b17) {
        kotlin.jvm.internal.o.g(a17, "a");
        kotlin.jvm.internal.o.g(b17, "b");
        f26.b2 a18 = g26.a.a(false, false, null, this.f268016d, this.f268015c, 6, null);
        f26.c3 a19 = a17.z0();
        f26.c3 b18 = b17.z0();
        kotlin.jvm.internal.o.g(a19, "a");
        kotlin.jvm.internal.o.g(b18, "b");
        return f26.g.f259162a.e(a18, a19, b18);
    }

    public boolean b(f26.o0 subtype, f26.o0 supertype) {
        kotlin.jvm.internal.o.g(subtype, "subtype");
        kotlin.jvm.internal.o.g(supertype, "supertype");
        f26.b2 a17 = g26.a.a(true, false, null, this.f268016d, this.f268015c, 6, null);
        f26.c3 subType = subtype.z0();
        f26.c3 superType = supertype.z0();
        kotlin.jvm.internal.o.g(subType, "subType");
        kotlin.jvm.internal.o.g(superType, "superType");
        return f26.g.i(f26.g.f259162a, a17, subType, superType, false, 8, null);
    }
}
