package sc2;

/* loaded from: classes2.dex */
public final class a5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.b5 f405753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f405754e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405755f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405756g;

    public a5(sc2.b5 b5Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.view.View view, java.lang.String str) {
        this.f405753d = b5Var;
        this.f405754e = baseFinderFeed;
        this.f405755f = view;
        this.f405756g = str;
    }

    public static final void a(sc2.b5 b5Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str, android.view.View view) {
        java.util.Map map = sc2.b5.f405781y;
        int i17 = !b5Var.H(baseFinderFeed) ? 1 : 2;
        com.tencent.mars.xlog.Log.i(b5Var.f405782w, "CgiFinderAudienceReserveLiveNotification do op=" + i17);
        az2.j Ni = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ni(str, 2, i17, null, 9, baseFinderFeed.getFeedObject().getFeedObject().getId());
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        Ni.t(context, view.getContext().getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        Ni.l().K(new sc2.z4(i17, b5Var, baseFinderFeed, view, str));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/component/FeedJumperNextLiveNoticeObserver$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        sc2.b5 b5Var = this.f405753d;
        kotlinx.coroutines.r2 r2Var = b5Var.f405783x;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f405754e;
        boolean H = b5Var.H(baseFinderFeed);
        java.lang.String str = this.f405756g;
        android.view.View view2 = this.f405755f;
        if (H) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(view2.getContext(), 1, true);
            k0Var.X1 = true;
            k0Var.f211872n = new sc2.w4(view2);
            k0Var.f211881s = new sc2.x4(b5Var, baseFinderFeed, str, view2);
            k0Var.v();
        } else {
            a(b5Var, baseFinderFeed, str, view2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/component/FeedJumperNextLiveNoticeObserver$onBindView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
