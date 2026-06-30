package f2;

/* loaded from: classes14.dex */
public final class k implements f2.g {

    /* renamed from: a, reason: collision with root package name */
    public final f2.u f258807a;

    /* renamed from: b, reason: collision with root package name */
    public final f2.x f258808b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.e0 f258809c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.o f258810d;

    /* renamed from: e, reason: collision with root package name */
    public final f2.t f258811e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f258812f;

    public k(f2.u platformFontLoader, f2.x platformResolveInterceptor, f2.e0 typefaceRequestCache, f2.o fontListFontFamilyTypefaceAdapter, f2.t platformFamilyTypefaceAdapter, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 2) != 0) {
            int i18 = f2.x.f258830a;
            platformResolveInterceptor = f2.w.f258829a;
        }
        typefaceRequestCache = (i17 & 4) != 0 ? f2.l.f258813a : typefaceRequestCache;
        fontListFontFamilyTypefaceAdapter = (i17 & 8) != 0 ? new f2.o(f2.l.f258814b, null, 2, null) : fontListFontFamilyTypefaceAdapter;
        platformFamilyTypefaceAdapter = (i17 & 16) != 0 ? new f2.t() : platformFamilyTypefaceAdapter;
        kotlin.jvm.internal.o.g(platformFontLoader, "platformFontLoader");
        kotlin.jvm.internal.o.g(platformResolveInterceptor, "platformResolveInterceptor");
        kotlin.jvm.internal.o.g(typefaceRequestCache, "typefaceRequestCache");
        kotlin.jvm.internal.o.g(fontListFontFamilyTypefaceAdapter, "fontListFontFamilyTypefaceAdapter");
        kotlin.jvm.internal.o.g(platformFamilyTypefaceAdapter, "platformFamilyTypefaceAdapter");
        this.f258807a = platformFontLoader;
        this.f258808b = platformResolveInterceptor;
        this.f258809c = typefaceRequestCache;
        this.f258810d = fontListFontFamilyTypefaceAdapter;
        this.f258811e = platformFamilyTypefaceAdapter;
        this.f258812f = new f2.i(this);
    }

    public final n0.e5 a(f2.c0 typefaceRequest) {
        f2.g0 g0Var;
        f2.e0 e0Var = this.f258809c;
        f2.j jVar = new f2.j(this, typefaceRequest);
        e0Var.getClass();
        kotlin.jvm.internal.o.g(typefaceRequest, "typefaceRequest");
        synchronized (e0Var.f258799a) {
            g0Var = (f2.g0) e0Var.f258800b.a(typefaceRequest);
            if (g0Var != null) {
                if (!g0Var.a()) {
                }
            }
            try {
                g0Var = (f2.g0) jVar.invoke(new f2.d0(e0Var, typefaceRequest));
                synchronized (e0Var.f258799a) {
                    if (e0Var.f258800b.a(typefaceRequest) == null && g0Var.a()) {
                        e0Var.f258800b.b(typefaceRequest, g0Var);
                    }
                }
            } catch (java.lang.Exception e17) {
                throw new java.lang.IllegalStateException("Could not load font", e17);
            }
        }
        return g0Var;
    }

    public n0.e5 b(f2.h hVar, f2.r fontWeight, int i17, int i18) {
        kotlin.jvm.internal.o.g(fontWeight, "fontWeight");
        f2.x xVar = this.f258808b;
        f2.h c17 = xVar.c(hVar);
        f2.r b17 = xVar.b(fontWeight);
        int a17 = xVar.a(i17);
        int d17 = xVar.d(i18);
        this.f258807a.getClass();
        return a(new f2.c0(c17, b17, a17, d17, null, null));
    }
}
