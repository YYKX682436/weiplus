package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f132206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f132207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentDrawer f132208f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f132209g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.g5 f132210h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f132211i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, android.view.View view, com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer, android.widget.FrameLayout.LayoutParams layoutParams, com.tencent.mm.plugin.finder.view.g5 g5Var, boolean z17) {
        super(0);
        this.f132206d = mMFragmentActivity;
        this.f132207e = view;
        this.f132208f = finderCommentDrawer;
        this.f132209g = layoutParams;
        this.f132210h = g5Var;
        this.f132211i = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f132206d;
        com.tencent.mars.xlog.Log.i("Finder.CommentDrawer", "[initView] bottomMargin= " + com.tencent.mm.ui.bl.g(mMFragmentActivity));
        android.view.View view = this.f132207e;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        android.widget.FrameLayout.LayoutParams layoutParams = this.f132209g;
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.f132208f;
        ((android.widget.FrameLayout) view).addView(finderCommentDrawer, layoutParams);
        android.widget.FrameLayout headerLayout = finderCommentDrawer.getHeaderLayout();
        boolean z17 = this.f132211i;
        com.tencent.mm.plugin.finder.view.g5 g5Var = this.f132210h;
        g5Var.g(mMFragmentActivity, headerLayout, z17);
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = finderCommentDrawer.getCenterLayout();
        yw2.a0 a0Var = (yw2.a0) g5Var;
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        a0Var.f466609e = true;
        a0Var.f466615n = rlLayout;
        android.view.View inflate = com.tencent.mm.ui.id.b(mMFragmentActivity).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.tencent.mm.R.id.ilg) : null;
        if (findViewById != null) {
            findViewById.setPadding(inflate.getPaddingLeft(), inflate.getPaddingTop(), inflate.getPaddingRight(), 0);
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = findViewById != null ? findViewById.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = (int) mMFragmentActivity.getResources().getDimension(com.tencent.mm.R.dimen.f479732dp);
        }
        if (inflate != null) {
            rlLayout.setLoadMoreFooter(inflate);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = rlLayout.getRecyclerView();
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(mMFragmentActivity);
        finderLinearLayoutManager.f132641z = -1;
        finderLinearLayoutManager.setItemPrefetchEnabled(true);
        recyclerView.setLayoutManager(finderLinearLayoutManager);
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter = a0Var.f466608d;
        recyclerView.setAdapter(nPresenter.a(mMFragmentActivity));
        if (com.tencent.mm.ui.bk.C()) {
            recyclerView.setRecycledViewPool(((ey2.o1) pf5.z.f353948a.a(mMFragmentActivity).a(ey2.o1.class)).f257460i);
        } else {
            recyclerView.setRecycledViewPool(((ey2.o1) pf5.z.f353948a.a(mMFragmentActivity).a(ey2.o1.class)).f257459h);
        }
        recyclerView.i(new yw2.q(mMFragmentActivity, a0Var));
        androidx.recyclerview.widget.p2 b17 = nPresenter.b(mMFragmentActivity);
        if (b17 != null) {
            recyclerView.N(b17);
        }
        java.lang.Object parent = rlLayout.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        a0Var.k().getFooterLayout().addOnLayoutChangeListener(new yw2.r(a0Var, (android.view.View) parent));
        android.widget.FrameLayout footerLayout = finderCommentDrawer.getFooterLayout();
        kotlin.jvm.internal.o.g(footerLayout, "footerLayout");
        android.view.View inflate2 = com.tencent.mm.ui.id.b(mMFragmentActivity).inflate(com.tencent.mm.R.layout.f488660zs, footerLayout);
        footerLayout.setBackgroundResource(com.tencent.mm.R.color.a9e);
        android.view.View findViewById2 = inflate2.findViewById(com.tencent.mm.R.id.eat);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        a0Var.f466616o = (com.tencent.mm.plugin.finder.view.FinderCommentFooter) findViewById2;
        a0Var.n().setSwitchSceneListener(new yw2.s(a0Var));
        a0Var.n().setBanSwitchScene(a0Var.k().getBanSwitch());
        com.tencent.mars.xlog.Log.i("Finder.TimelineDrawerBuilder", "drawerFooter.scene " + a0Var.n().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String());
        a0Var.n().z(false);
        com.tencent.mm.plugin.finder.view.FinderCommentFooter.v(a0Var.n(), false, false, 2, null);
        a0Var.k().setKeyboardHeightObserver(a0Var.n());
        a0Var.k().setFooter(a0Var.n());
        android.widget.FrameLayout loadingLayout = finderCommentDrawer.getLoadingLayout();
        kotlin.jvm.internal.o.g(loadingLayout, "loadingLayout");
        a0Var.f466619r = loadingLayout;
        android.view.View inflate3 = android.view.LayoutInflater.from(mMFragmentActivity).inflate(com.tencent.mm.R.layout.afd, (android.view.ViewGroup) loadingLayout, true);
        android.view.View findViewById3 = inflate3.findViewById(com.tencent.mm.R.id.c7i);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        a0Var.f466620s = findViewById3;
        android.view.View findViewById4 = inflate3.findViewById(com.tencent.mm.R.id.f486141kc0);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        a0Var.f466621t = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate3.findViewById(com.tencent.mm.R.id.m2a);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        a0Var.f466622u = findViewById5;
        android.view.View view2 = a0Var.f466620s;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a0Var.q().setVisibility(8);
        android.view.View r17 = a0Var.r();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(r17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/finder/view/builder/FinderTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
