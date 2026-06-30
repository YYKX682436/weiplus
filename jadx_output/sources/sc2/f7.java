package sc2;

/* loaded from: classes2.dex */
public final class f7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ad2.h f405890e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405892g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405893h;

    public f7(xc2.p0 p0Var, ad2.h hVar, in5.s0 s0Var, android.view.View view, java.lang.String str) {
        this.f405889d = p0Var;
        this.f405890e = hVar;
        this.f405891f = s0Var;
        this.f405892g = view;
        this.f405893h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xc2.p0 p0Var = this.f405889d;
        p0Var.A = false;
        ad2.h hVar = this.f405890e;
        if (hVar != null) {
            ad2.k.b(hVar, this.f405891f, this.f405892g, p0Var, true, null, 16, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onJumpViewFocus source=");
        sb6.append(this.f405893h);
        sb6.append(", feedId=");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f405889d.f453244f;
        sb6.append(pm0.v.u(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L));
        sb6.append(" onRealShow view.isVisible=");
        sb6.append(this.f405892g.getVisibility() == 0);
        com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", sb6.toString());
    }
}
