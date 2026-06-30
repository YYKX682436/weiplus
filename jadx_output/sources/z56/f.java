package z56;

/* loaded from: classes16.dex */
public final class f implements p56.m {

    /* renamed from: d, reason: collision with root package name */
    public final p56.r f470292d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f470293e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f470294f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f470295g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f470296h;

    public f(p56.r rVar) {
        this.f470292d = rVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        this.f470292d.a(obj);
    }

    public void b(java.lang.Object obj, s56.j jVar) {
        if (!this.f470296h) {
            synchronized (this) {
                this.f470293e = false;
                if (this.f470294f) {
                    if (this.f470295g == null) {
                        this.f470295g = new java.util.ArrayList();
                    }
                    this.f470295g.add(obj);
                    return;
                }
                this.f470296h = true;
            }
        }
        jVar.a(this.f470292d, obj);
    }

    @Override // p56.m
    public void onCompleted() {
        this.f470292d.onCompleted();
    }

    @Override // p56.m
    public void onError(java.lang.Throwable th6) {
        this.f470292d.onError(th6);
    }
}
