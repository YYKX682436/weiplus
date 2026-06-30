package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes2.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f122312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f122313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer f122314g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.playlist.l0 f122315h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, android.widget.FrameLayout.LayoutParams layoutParams, android.view.View view, com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer, com.tencent.mm.plugin.finder.playlist.l0 l0Var) {
        super(0);
        this.f122311d = context;
        this.f122312e = layoutParams;
        this.f122313f = view;
        this.f122314g = finderPlayListDrawer;
        this.f122315h = l0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f122311d;
        int g17 = com.tencent.mm.ui.bl.g(context);
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListDrawer", "[initView] bottomMargin= " + g17);
        android.widget.FrameLayout.LayoutParams layoutParams = this.f122312e;
        layoutParams.bottomMargin = g17;
        android.view.View view = this.f122313f;
        kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer finderPlayListDrawer = this.f122314g;
        ((android.widget.FrameLayout) view).addView(finderPlayListDrawer, layoutParams);
        android.widget.FrameLayout headerLayout = finderPlayListDrawer.getHeaderLayout();
        com.tencent.mm.plugin.finder.playlist.l0 l0Var = this.f122315h;
        l0Var.getClass();
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b4v, headerLayout);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.d4v);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        l0Var.f122340f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.qek);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        l0Var.f122341g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.d4r);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        l0Var.f122342h = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.t5j);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        l0Var.f122356y = findViewById4;
        l0Var.n().setOnClickListener(new com.tencent.mm.plugin.finder.playlist.o(context));
        android.view.View findViewById5 = inflate.findViewById(com.tencent.mm.R.id.t5k);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        l0Var.f122357z = findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.tencent.mm.R.id.d4s);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        l0Var.f122347p = findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.tencent.mm.R.id.d4p);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        l0Var.f122348q = findViewById7;
        android.view.View findViewById8 = inflate.findViewById(com.tencent.mm.R.id.d4x);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        l0Var.f122349r = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = inflate.findViewById(com.tencent.mm.R.id.t5i);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        l0Var.B = (android.widget.Button) findViewById9;
        android.view.View findViewById10 = inflate.findViewById(com.tencent.mm.R.id.t5g);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        l0Var.A = (android.widget.Button) findViewById10;
        android.view.View findViewById11 = inflate.findViewById(com.tencent.mm.R.id.t5h);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        l0Var.C = findViewById11;
        android.widget.ImageView imageView = l0Var.f122349r;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("headerMoreIv");
            throw null;
        }
        imageView.setOnClickListener(new com.tencent.mm.plugin.finder.playlist.p(l0Var));
        android.widget.ImageView imageView2 = l0Var.f122349r;
        if (imageView2 == null) {
            kotlin.jvm.internal.o.o("headerMoreIv");
            throw null;
        }
        ym5.a1.h(imageView2, new com.tencent.mm.plugin.finder.playlist.q(l0Var));
        android.view.View findViewById12 = inflate.findViewById(com.tencent.mm.R.id.jfo);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        l0Var.f122343i = (android.widget.TextView) findViewById12;
        android.widget.TextView textView = l0Var.f122340f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("headerTitleTv");
            throw null;
        }
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer q17 = l0Var.q();
        android.view.View findViewById13 = inflate.findViewById(com.tencent.mm.R.id.f484134rj0);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        q17.k(findViewById13);
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer q18 = l0Var.q();
        android.view.View findViewById14 = inflate.findViewById(com.tencent.mm.R.id.t5j);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        q18.k(findViewById14);
        com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawer q19 = l0Var.q();
        android.view.View findViewById15 = inflate.findViewById(com.tencent.mm.R.id.t5h);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        q19.k(findViewById15);
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = finderPlayListDrawer.getCenterLayout();
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        l0Var.f122354w = rlLayout;
        android.view.View inflate2 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b4z, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        rlLayout.setLoadMoreFooter(inflate2);
        rlLayout.setLimitTopRequest(((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f480496zi)) - ((int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479657bu)));
        rlLayout.setDamping(1.85f);
        androidx.recyclerview.widget.RecyclerView recyclerView = rlLayout.getRecyclerView();
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager(context));
        final com.tencent.mm.plugin.finder.playlist.s1 s1Var = l0Var.f122338d;
        s1Var.getClass();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.playlist.FinderPlayListDrawerPresenter$getAdapter$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == com.tencent.mm.plugin.finder.playlist.z1.class.getName().hashCode()) {
                    com.tencent.mm.plugin.finder.playlist.s1 s1Var2 = com.tencent.mm.plugin.finder.playlist.s1.this;
                    return new com.tencent.mm.plugin.finder.playlist.y1(false, s1Var2.f122429i, true, s1Var2.f122443w, 1, null);
                }
                hc2.l.a("Finder.FinderPlayListDrawerPresenter", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        }, s1Var.f122422b.f122296a, false);
        s1Var.f122426f = wxRecyclerAdapter;
        wxRecyclerAdapter.f293105o = new com.tencent.mm.plugin.finder.playlist.v0(s1Var);
        recyclerView.setAdapter(wxRecyclerAdapter);
        android.view.View inflate3 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489056di4, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.d(inflate3);
        com.tencent.mm.view.HeadFooterLayout.c(rlLayout, inflate3, false, 2, null);
        l0Var.f122346o = (android.widget.TextView) inflate3.findViewById(com.tencent.mm.R.id.qel);
        l0Var.f122345n = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) inflate3.findViewById(com.tencent.mm.R.id.qem);
        l0Var.f122344m = inflate3;
        android.widget.FrameLayout loadingLayout = finderPlayListDrawer.getLoadingLayout();
        kotlin.jvm.internal.o.g(loadingLayout, "loadingLayout");
        l0Var.f122350s = loadingLayout;
        android.view.View inflate4 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489058b50, (android.view.ViewGroup) loadingLayout, true);
        android.view.View findViewById16 = inflate4.findViewById(com.tencent.mm.R.id.kxq);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        l0Var.f122351t = findViewById16;
        android.view.View findViewById17 = inflate4.findViewById(com.tencent.mm.R.id.kcd);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        l0Var.f122352u = findViewById17;
        android.view.View findViewById18 = inflate4.findViewById(com.tencent.mm.R.id.m2f);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        l0Var.f122353v = findViewById18;
        android.view.View view2 = l0Var.f122351t;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p17 = l0Var.p();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View t17 = l0Var.t();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(t17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        t17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(t17, "com/tencent/mm/plugin/finder/playlist/FinderPlayListDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.FrameLayout footerLayout = finderPlayListDrawer.getFooterLayout();
        kotlin.jvm.internal.o.g(footerLayout, "footerLayout");
        android.view.View findViewById19 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489052di1, (android.view.ViewGroup) footerLayout, true).findViewById(com.tencent.mm.R.id.kqj);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        l0Var.f122355x = findViewById19;
        ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        com.tencent.mm.plugin.finder.playlist.a0 a0Var = new com.tencent.mm.plugin.finder.playlist.a0(context, l0Var, new com.tencent.mm.pluginsdk.forward.m());
        l0Var.E = a0Var;
        a0Var.q();
        return jz5.f0.f302826a;
    }
}
