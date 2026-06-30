package sc3;

/* loaded from: classes7.dex */
public final class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f406538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f406539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f406540g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f406541h;

    public u0(sc3.k1 k1Var, int i17, android.view.Surface surface, int i18, int i19) {
        this.f406537d = k1Var;
        this.f406538e = i17;
        this.f406539f = surface;
        this.f406540g = i18;
        this.f406541h = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pc3.c cVar = (pc3.c) this.f406537d.f406489u.get(java.lang.Integer.valueOf(this.f406538e));
        if (cVar != null) {
            int i17 = this.f406540g;
            int i18 = this.f406541h;
            android.view.Surface surface = this.f406539f;
            kotlin.jvm.internal.o.g(surface, "surface");
            cVar.f353371e = surface;
            gh.t tVar = cVar.f353370d;
            if (tVar != null) {
                gh.s.a(tVar, surface, i17, i18, false, false, 16, null);
            }
        }
    }
}
