package vo0;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final wo0.c f438471a;

    /* renamed from: b, reason: collision with root package name */
    public final yo0.i f438472b;

    /* renamed from: c, reason: collision with root package name */
    public final ep0.g f438473c;

    /* renamed from: d, reason: collision with root package name */
    public final ep0.e f438474d;

    /* renamed from: e, reason: collision with root package name */
    public final ep0.d f438475e;

    /* renamed from: f, reason: collision with root package name */
    public final ep0.f f438476f;

    /* renamed from: g, reason: collision with root package name */
    public final ep0.c f438477g;

    /* renamed from: h, reason: collision with root package name */
    public final zo0.g f438478h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.loader.cache.memory.e f438479i;

    /* renamed from: j, reason: collision with root package name */
    public final xo0.d f438480j;

    /* renamed from: k, reason: collision with root package name */
    public final zo0.j f438481k;

    /* renamed from: l, reason: collision with root package name */
    public final zo0.i f438482l;

    /* renamed from: m, reason: collision with root package name */
    public final dp0.a f438483m;

    /* renamed from: n, reason: collision with root package name */
    public dp0.a f438484n;

    /* renamed from: o, reason: collision with root package name */
    public final ep0.a f438485o;

    /* renamed from: p, reason: collision with root package name */
    public fp0.o f438486p;

    /* renamed from: q, reason: collision with root package name */
    public final ep0.h f438487q;

    /* renamed from: r, reason: collision with root package name */
    public final int f438488r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.animation.Animation f438489s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f438490t;

    /* renamed from: u, reason: collision with root package name */
    public ip0.a f438491u;

    /* renamed from: v, reason: collision with root package name */
    public cp0.f f438492v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f438493w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [ep0.e] */
    public h(wo0.c builder, yo0.e mImageLoaderConfiguration) {
        android.graphics.drawable.Drawable drawable;
        kotlin.jvm.internal.o.g(builder, "builder");
        kotlin.jvm.internal.o.g(mImageLoaderConfiguration, "mImageLoaderConfiguration");
        this.f438471a = builder;
        ap0.j jVar = new ap0.j(null);
        yo0.i iVar = builder.f447872c;
        iVar = iVar == null ? mImageLoaderConfiguration.e() : iVar;
        this.f438472b = iVar;
        this.f438473c = builder.f447877h;
        ?? r37 = builder.f447873d;
        this.f438474d = r37 != 0 ? r37 : jVar;
        this.f438475e = builder.f447874e;
        ep0.f fVar = builder.f447875f;
        this.f438476f = fVar == null ? mImageLoaderConfiguration.m() : fVar;
        this.f438477g = builder.f447876g;
        this.f438478h = mImageLoaderConfiguration.i();
        this.f438479i = mImageLoaderConfiguration.l();
        this.f438480j = mImageLoaderConfiguration.b();
        mImageLoaderConfiguration.j();
        if (builder.f447878i == null) {
            mImageLoaderConfiguration.a();
        }
        this.f438481k = mImageLoaderConfiguration.f();
        this.f438482l = mImageLoaderConfiguration.k();
        dp0.a aVar = builder.f447880k;
        this.f438483m = aVar == null ? mImageLoaderConfiguration.d() : aVar;
        this.f438484n = null;
        this.f438485o = builder.f447879j;
        this.f438486p = mImageLoaderConfiguration.h();
        mImageLoaderConfiguration.c();
        this.f438487q = mImageLoaderConfiguration.g();
        this.f438488r = iVar.f464102g;
        this.f438489s = iVar.f464105j;
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193075e;
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        int i17 = iVar.f464103h;
        if (i17 != 0) {
            drawable = new android.graphics.drawable.ColorDrawable(resources.getColor(i17));
        } else {
            int i18 = iVar.f464102g;
            drawable = i18 != 0 ? resources.getDrawable(i18) : iVar.f464104i;
        }
        this.f438490t = drawable;
        this.f438491u = builder.f447870a;
        this.f438493w = "";
    }

    public final cp0.f a() {
        cp0.f fVar = this.f438492v;
        if (fVar != null) {
            return fVar;
        }
        kotlin.jvm.internal.o.o("target");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004f, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) r2) != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vo0.h.b():void");
    }
}
