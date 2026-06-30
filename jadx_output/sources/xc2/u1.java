package xc2;

/* loaded from: classes9.dex */
public final class u1 implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f453309a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f453310b;

    public u1(in5.s0 s0Var, xc2.p0 p0Var) {
        this.f453309a = s0Var;
        this.f453310b = p0Var;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        in5.s0 s0Var;
        kotlin.jvm.internal.o.g(appBundle, "appBundle");
        if (appBundle instanceof l81.b1) {
            l81.b1 b1Var = (l81.b1) appBundle;
            if (kotlin.jvm.internal.o.b(b1Var.G, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.Y) || (s0Var = this.f453309a) == null) {
                return;
            }
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.a4 a4Var = (com.tencent.mm.plugin.finder.viewmodel.component.a4) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.a4.class);
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.fragment.app.Fragment fragment = ((sc2.a8) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(sc2.a8.class)).getFragment();
            xc2.p0 p0Var = this.f453310b;
            com.tencent.mm.plugin.finder.view.FinderWeAppHalfScreenScListener finderWeAppHalfScreenScListener = new com.tencent.mm.plugin.finder.view.FinderWeAppHalfScreenScListener(true, a4Var.T6(fragment, p0Var.f453244f, s0Var));
            com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig = b1Var.G;
            if (halfScreenConfig != null) {
                halfScreenConfig.f77366p = finderWeAppHalfScreenScListener;
            }
            b1Var.L = new xc2.t1();
            eq.a.f255778b = true;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpEcs in Finder, isHalfMiniProgramShowing, feedid is ");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = p0Var.f453244f;
            sb6.append(baseFinderFeed != null ? java.lang.Long.valueOf(baseFinderFeed.getItemId()) : null);
            com.tencent.mars.xlog.Log.i("Finder.JumperUtils", sb6.toString());
        }
    }
}
