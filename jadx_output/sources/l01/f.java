package l01;

/* loaded from: classes7.dex */
public final class f implements l01.o, java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f314763d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l01.b f314764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l01.h0 f314765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r.a f314766g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314767h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f314768i;

    public f(l01.b bVar, l01.b bVar2, l01.h0 h0Var, r.a aVar, java.lang.String str, java.util.Map map) {
        this.f314764e = bVar2;
        this.f314765f = h0Var;
        this.f314766g = aVar;
        this.f314767h = str;
        this.f314768i = map;
    }

    @Override // l01.o
    public void a() {
        java.io.InputStream b17;
        if (this.f314763d) {
            return;
        }
        try {
            if (this.f314765f.b()) {
                b17 = l01.h0.a(this.f314765f, null);
            } else {
                b17 = ((l01.k) this.f314764e.f314744f).b(this.f314765f.f314773b);
            }
            if (b17 != null) {
                r.a aVar = this.f314766g;
                if (aVar != null) {
                    aVar.apply(b17);
                } else {
                    s46.d.a(b17);
                }
                c();
                return;
            }
            if (!this.f314765f.b()) {
                ((ku5.t0) ku5.t0.f312615d).g(new l01.e(this));
            } else {
                r.a aVar2 = this.f314766g;
                if (aVar2 != null) {
                    aVar2.apply(null);
                }
                c();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Luggage.AppBrandSimpleImageLoader", "loadIntoDiskCache diskCache.openRead failed, url=%s, e=%s", this.f314767h, th6);
            r.a aVar3 = this.f314766g;
            if (aVar3 != null) {
                aVar3.apply(null);
            }
            c();
        }
    }

    @Override // l01.o
    public void b() {
        this.f314763d = true;
    }

    public final void c() {
        l01.p pVar = this.f314764e.f314742d;
        pVar.f314784a.post(new l01.d(this));
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.b bVar = this.f314764e;
        l01.p pVar = bVar.f314742d;
        l01.h0 h0Var = this.f314765f;
        boolean d17 = pVar.d(h0Var.f314773b);
        l01.p pVar2 = bVar.f314742d;
        java.lang.String str = h0Var.f314773b;
        if (d17) {
            pVar2.a(str, this);
            return;
        }
        pVar2.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((java.util.HashMap) pVar2.f314786c).put(str, java.lang.Boolean.TRUE);
        }
        a();
    }
}
