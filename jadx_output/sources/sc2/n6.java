package sc2;

/* loaded from: classes2.dex */
public final class n6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406100e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ad2.h f406103h;

    public n6(in5.s0 s0Var, android.view.View view, java.lang.String str, xc2.p0 p0Var, ad2.h hVar) {
        this.f406099d = s0Var;
        this.f406100e = view;
        this.f406101f = str;
        this.f406102g = p0Var;
        this.f406103h = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC$Companion$setViewExposedAndClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        in5.s0 s0Var = this.f406099d;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) s0Var.p(com.tencent.mm.R.id.e_k);
        boolean z17 = finderVideoLayout != null && finderVideoLayout.D();
        android.view.View view2 = this.f406100e;
        if (view2.getVisibility() != 8) {
            if (!(view2.getAlpha() == 0.0f) && !z17) {
                xc2.p0 p0Var = this.f406102g;
                if (p0Var.C) {
                    this.f406103h.r(s0Var, view2, p0Var);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC$Companion$setViewExposedAndClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "[onClick] not visible, visibility:" + view2.getVisibility() + " alpha:" + view2.getVisibility() + " isInScaleMode:" + z17 + ", feedId=" + this.f406101f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC$Companion$setViewExposedAndClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
