package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMFragmentActivity f130229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f130230e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer f130231f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f130232g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.d2 f130233h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f130234i;

    public e2(com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity, android.view.View view, com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer uniCommentDrawer, android.widget.FrameLayout.LayoutParams layoutParams, com.tencent.mm.plugin.finder.uniComments.d2 d2Var, boolean z17) {
        this.f130229d = mMFragmentActivity;
        this.f130230e = view;
        this.f130231f = uniCommentDrawer;
        this.f130232g = layoutParams;
        this.f130233h = d2Var;
        this.f130234i = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = this.f130229d;
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.CommentDrawer", "[initView] bottomMargin= " + com.tencent.mm.ui.bl.g(mMFragmentActivity));
        android.view.View view = this.f130230e;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        com.tencent.mm.plugin.finder.uniComments.UniCommentDrawer uniCommentDrawer = this.f130231f;
        ((android.widget.FrameLayout) view).addView(uniCommentDrawer, this.f130232g);
        android.widget.FrameLayout headerLayout = uniCommentDrawer.getHeaderLayout();
        com.tencent.mm.plugin.finder.uniComments.a5 a5Var = (com.tencent.mm.plugin.finder.uniComments.a5) this.f130233h;
        a5Var.getClass();
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        a5Var.f130193i = headerLayout;
        boolean z17 = this.f130234i;
        android.view.View inflate = z17 ? com.tencent.mm.ui.id.b(mMFragmentActivity).inflate(com.tencent.mm.R.layout.d2m, headerLayout) : com.tencent.mm.ui.id.b(mMFragmentActivity).inflate(com.tencent.mm.R.layout.d2l, headerLayout);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.d4v);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        a5Var.f130189e = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.ear);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        a5Var.f130199r = findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.eap);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        com.tencent.mm.ui.bk.r0(a5Var.o().getPaint(), 0.8f);
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = uniCommentDrawer.getCenterLayout();
        a5Var.getClass();
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        a5Var.f130190f = rlLayout;
        android.view.View inflate2 = com.tencent.mm.ui.id.b(mMFragmentActivity).inflate(com.tencent.mm.R.layout.d2r, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        rlLayout.setLoadMoreFooter(inflate2);
        androidx.recyclerview.widget.RecyclerView recyclerView = rlLayout.getRecyclerView();
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(mMFragmentActivity));
        final com.tencent.mm.plugin.finder.uniComments.q3 q3Var = (com.tencent.mm.plugin.finder.uniComments.q3) a5Var.f130188d;
        q3Var.getClass();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.uniComments.UniCommentDrawerPresenter$getAdapter$adapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 1) {
                    return new gv2.n0(com.tencent.mm.plugin.finder.uniComments.q3.this, false);
                }
                if (type == 2) {
                    return new gv2.c1(com.tencent.mm.plugin.finder.uniComments.q3.this);
                }
                hc2.l.a("MicroMsg.MusicUni.DrawerPresenter", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, q3Var.f130369f.f130360a, false);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f293105o = q3Var;
        wxRecyclerAdapter.f293104n = q3Var;
        recyclerView.setAdapter(wxRecyclerAdapter);
        if (com.tencent.mm.ui.bk.C()) {
            recyclerView.setRecycledViewPool(((ey2.o1) pf5.z.f353948a.a(mMFragmentActivity).a(ey2.o1.class)).f257460i);
        } else {
            recyclerView.setRecycledViewPool(((ey2.o1) pf5.z.f353948a.a(mMFragmentActivity).a(ey2.o1.class)).f257459h);
        }
        recyclerView.i(new com.tencent.mm.plugin.finder.uniComments.v4(a5Var));
        int[] iArr = new int[4];
        iArr[0] = (int) mMFragmentActivity.getResources().getDimension(com.tencent.mm.R.dimen.f479727dj);
        recyclerView.N(new dx2.a(new android.graphics.drawable.ColorDrawable(mMFragmentActivity.getResources().getColor(com.tencent.mm.R.color.BW_90)), (int) mMFragmentActivity.getResources().getDimension(com.tencent.mm.R.dimen.f480414x9), iArr, (int) mMFragmentActivity.getResources().getDimension(com.tencent.mm.R.dimen.x_)));
        java.lang.Object parent = rlLayout.getParent();
        kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
        a5Var.h().getFooterLayout().addOnLayoutChangeListener(new com.tencent.mm.plugin.finder.uniComments.w4(a5Var, (android.view.View) parent));
        android.widget.FrameLayout footerLayout = uniCommentDrawer.getFooterLayout();
        a5Var.getClass();
        kotlin.jvm.internal.o.g(footerLayout, "footerLayout");
        android.view.View findViewById4 = com.tencent.mm.ui.id.b(mMFragmentActivity).inflate(com.tencent.mm.R.layout.d2k, footerLayout).findViewById(com.tencent.mm.R.id.eat);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        a5Var.f130191g = (com.tencent.mm.plugin.finder.uniComments.UniCommentFooter) findViewById4;
        a5Var.l().setBackClickListener(new com.tencent.mm.plugin.finder.uniComments.x4(z17, a5Var));
        a5Var.l().setSwitchSceneListener(new com.tencent.mm.plugin.finder.uniComments.y4(a5Var));
        a5Var.l().setSelfProfile(a5Var.h().isSelfProfile);
        a5Var.l().setScene(a5Var.h().getSceneForReply());
        a5Var.l().setBanSwitchScene(a5Var.h().getBanSwitch());
        com.tencent.mars.xlog.Log.i("MicroMsg.MusicUni.TimelineDrawerBuilder", "drawerFooter.scene " + a5Var.l().getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE java.lang.String());
        a5Var.l().l(false);
        a5Var.l().k(false);
        a5Var.h().setKeyboardHeightObserver(a5Var.l());
        a5Var.h().setFooter(a5Var.l());
        android.widget.FrameLayout loadingLayout = uniCommentDrawer.getLoadingLayout();
        a5Var.getClass();
        kotlin.jvm.internal.o.g(loadingLayout, "loadingLayout");
        a5Var.f130194m = loadingLayout;
        android.view.View inflate3 = android.view.LayoutInflater.from(mMFragmentActivity).inflate(com.tencent.mm.R.layout.d2q, (android.view.ViewGroup) loadingLayout, true);
        android.view.View findViewById5 = inflate3.findViewById(com.tencent.mm.R.id.c7i);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        a5Var.f130195n = findViewById5;
        android.view.View findViewById6 = inflate3.findViewById(com.tencent.mm.R.id.f486141kc0);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        a5Var.f130196o = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = inflate3.findViewById(com.tencent.mm.R.id.m2a);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        a5Var.f130197p = findViewById7;
        android.view.View findViewById8 = inflate3.findViewById(com.tencent.mm.R.id.c7v);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.view.View findViewById9 = inflate3.findViewById(com.tencent.mm.R.id.c7w);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.view.View view2 = a5Var.f130195n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a5Var.q().setVisibility(8);
        android.view.View r17 = a5Var.r();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(r17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(r17, "com/tencent/mm/plugin/finder/uniComments/UniTimelineDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
