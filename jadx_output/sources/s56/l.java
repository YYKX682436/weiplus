package s56;

/* loaded from: classes16.dex */
public final class l extends p56.r {

    /* renamed from: h, reason: collision with root package name */
    public final p56.r f403220h;

    /* renamed from: i, reason: collision with root package name */
    public final r56.e f403221i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f403222m;

    public l(p56.r rVar, r56.e eVar) {
        this.f403220h = rVar;
        this.f403221i = eVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        try {
            this.f403220h.a(this.f403221i.call(obj));
        } catch (java.lang.Throwable th6) {
            q56.f.b(th6);
            c();
            onError(q56.m.a(th6, obj));
        }
    }

    @Override // p56.r
    public void g(p56.n nVar) {
        this.f403220h.g(nVar);
    }

    @Override // p56.m
    public void onCompleted() {
        if (this.f403222m) {
            return;
        }
        this.f403220h.onCompleted();
    }

    @Override // p56.m
    public void onError(java.lang.Throwable th6) {
        if (this.f403222m) {
            x56.m.a(th6);
        } else {
            this.f403222m = true;
            this.f403220h.onError(th6);
        }
    }
}
