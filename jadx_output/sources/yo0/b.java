package yo0;

/* loaded from: classes15.dex */
public final class b implements yo0.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.loader.cache.memory.e f464047a;

    /* renamed from: b, reason: collision with root package name */
    public final xo0.d f464048b;

    /* renamed from: c, reason: collision with root package name */
    public final zo0.g f464049c;

    /* renamed from: d, reason: collision with root package name */
    public final zo0.i f464050d;

    /* renamed from: e, reason: collision with root package name */
    public final ep0.h f464051e;

    /* renamed from: f, reason: collision with root package name */
    public final dp0.a f464052f;

    /* renamed from: g, reason: collision with root package name */
    public final yo0.i f464053g;

    /* renamed from: h, reason: collision with root package name */
    public final ep0.f f464054h;

    /* renamed from: i, reason: collision with root package name */
    public final ep0.b f464055i;

    /* renamed from: j, reason: collision with root package name */
    public final zo0.j f464056j;

    /* renamed from: k, reason: collision with root package name */
    public final fp0.o f464057k;

    public b(yo0.c cVar) {
        this.f464047a = cVar.f464059b;
        xo0.d dVar = cVar.f464060c;
        if (dVar == null) {
            kotlin.jvm.internal.o.o("builder_diskCache");
            throw null;
        }
        this.f464048b = dVar;
        zo0.g gVar = cVar.f464061d;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("builder_dataFetcher");
            throw null;
        }
        this.f464049c = gVar;
        zo0.i iVar = cVar.f464063f;
        if (iVar == null) {
            kotlin.jvm.internal.o.o("imageProducer");
            throw null;
        }
        this.f464050d = iVar;
        this.f464051e = cVar.f464062e;
        this.f464052f = cVar.f464064g;
        this.f464053g = cVar.f464058a;
        this.f464054h = cVar.f464067j;
        this.f464055i = cVar.f464066i;
        this.f464056j = cVar.f464065h;
        cVar.getClass();
        this.f464057k = null;
    }

    @Override // yo0.e
    public ep0.b a() {
        return this.f464055i;
    }

    @Override // yo0.e
    public xo0.d b() {
        return this.f464048b;
    }

    @Override // yo0.e
    public zo0.a c() {
        return null;
    }

    @Override // yo0.e
    public dp0.a d() {
        return this.f464052f;
    }

    @Override // yo0.e
    public yo0.i e() {
        return this.f464053g;
    }

    @Override // yo0.e
    public zo0.j f() {
        return this.f464056j;
    }

    @Override // yo0.e
    public ep0.h g() {
        return this.f464051e;
    }

    @Override // yo0.e
    public fp0.o h() {
        return this.f464057k;
    }

    @Override // yo0.e
    public zo0.g i() {
        return this.f464049c;
    }

    @Override // yo0.e
    public zo0.h j() {
        return null;
    }

    @Override // yo0.e
    public zo0.i k() {
        return this.f464050d;
    }

    @Override // yo0.e
    public com.tencent.mm.loader.cache.memory.e l() {
        return this.f464047a;
    }

    @Override // yo0.e
    public ep0.f m() {
        return this.f464054h;
    }
}
