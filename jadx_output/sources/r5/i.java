package r5;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f392525a;

    /* renamed from: b, reason: collision with root package name */
    public c6.c f392526b;

    /* renamed from: c, reason: collision with root package name */
    public r5.c f392527c;

    /* renamed from: d, reason: collision with root package name */
    public final h6.j f392528d;

    /* renamed from: e, reason: collision with root package name */
    public final double f392529e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f392530f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f392531g;

    public i(android.content.Context context) {
        double d17;
        java.lang.Object systemService;
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.o.f(applicationContext, "context.applicationContext");
        this.f392525a = applicationContext;
        this.f392526b = c6.c.f38772m;
        this.f392527c = null;
        this.f392528d = new h6.j(false, false, false, 7, null);
        try {
            systemService = b3.l.getSystemService(applicationContext, android.app.ActivityManager.class);
        } catch (java.lang.Exception unused) {
        }
        if (systemService == null) {
            throw new java.lang.IllegalStateException(("System service of type " + android.app.ActivityManager.class + " was not found.").toString());
        }
        if (((android.app.ActivityManager) systemService).isLowRamDevice()) {
            d17 = 0.15d;
            this.f392529e = d17;
            this.f392530f = true;
            this.f392531g = true;
        }
        d17 = 0.2d;
        this.f392529e = d17;
        this.f392530f = true;
        this.f392531g = true;
    }

    public final r5.j a() {
        int i17;
        java.lang.Object systemService;
        android.content.Context context = this.f392525a;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            systemService = b3.l.getSystemService(context, android.app.ActivityManager.class);
        } catch (java.lang.Exception unused) {
            i17 = 256;
        }
        if (systemService == null) {
            throw new java.lang.IllegalStateException(("System service of type " + android.app.ActivityManager.class + " was not found.").toString());
        }
        android.app.ActivityManager activityManager = (android.app.ActivityManager) systemService;
        i17 = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        double d17 = this.f392529e * i17;
        double d18 = 1024;
        long j17 = (long) (d17 * d18 * d18);
        int i18 = (int) (j17 * 0.0d);
        int i19 = (int) (j17 - i18);
        s5.a dVar = i18 == 0 ? new s5.d() : new s5.f(i18, null, null, null, 6, null);
        a6.d0 yVar = this.f392531g ? new a6.y(null) : a6.d.f1649a;
        s5.c gVar = this.f392530f ? new s5.g(yVar, dVar, null) : s5.e.f403006a;
        int i27 = a6.a0.f1641a;
        a6.s sVar = new a6.s(i19 > 0 ? new a6.v(yVar, gVar, i19, null) : yVar instanceof a6.y ? new a6.e(yVar) : a6.b.f1642b, yVar, gVar, dVar);
        android.content.Context context2 = this.f392525a;
        c6.c cVar = this.f392526b;
        s5.a aVar = sVar.f1693d;
        r5.h hVar = new r5.h(this);
        l36.i0 i0Var = h6.d.f279116a;
        final jz5.g b17 = jz5.h.b(hVar);
        l36.m mVar = new l36.m() { // from class: h6.d$$a
            @Override // l36.m
            public final l36.n a(l36.w0 w0Var) {
                jz5.g lazy = jz5.g.this;
                kotlin.jvm.internal.o.g(lazy, "$lazy");
                return ((l36.m) lazy.getValue()).a(w0Var);
            }
        };
        r5.f fVar = r5.f.f392522a;
        r5.c cVar2 = this.f392527c;
        if (cVar2 == null) {
            kz5.p0 p0Var = kz5.p0.f313996d;
            cVar2 = new r5.c(p0Var, p0Var, p0Var, p0Var);
        }
        return new r5.p(context2, cVar, aVar, sVar, mVar, fVar, cVar2, this.f392528d, null);
    }
}
