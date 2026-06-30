package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class o9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f132772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f132773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Window f132774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderFavDrawer f132775g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f132776h;

    public o9(android.content.Context context, android.widget.FrameLayout.LayoutParams layoutParams, android.view.Window window, com.tencent.mm.plugin.finder.view.FinderFavDrawer finderFavDrawer, kotlin.jvm.internal.h0 h0Var) {
        this.f132772d = context;
        this.f132773e = layoutParams;
        this.f132774f = window;
        this.f132775g = finderFavDrawer;
        this.f132776h = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f132772d;
        int g17 = com.tencent.mm.ui.bl.g(context);
        android.widget.FrameLayout.LayoutParams layoutParams = this.f132773e;
        layoutParams.bottomMargin = g17;
        com.tencent.mars.xlog.Log.i("Finder.FinderFavDrawer", "[initView] bottomMargin= " + g17);
        android.view.Window window = this.f132774f;
        android.view.View decorView = window.getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        com.tencent.mm.plugin.finder.view.FinderFavDrawer finderFavDrawer = this.f132775g;
        ((android.widget.FrameLayout) decorView).addView(finderFavDrawer, layoutParams);
        android.view.View decorView2 = window.getDecorView();
        kotlin.jvm.internal.o.e(decorView2, "null cannot be cast to non-null type android.widget.FrameLayout");
        com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView mEHolderView = new com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView(context, null);
        mEHolderView.setId(com.tencent.mm.R.id.qyf);
        ((android.widget.FrameLayout) decorView2).addView(mEHolderView, layoutParams);
        kotlin.jvm.internal.h0 h0Var = this.f132776h;
        yw2.f fVar = (yw2.f) h0Var.f310123d;
        android.widget.FrameLayout headerLayout = finderFavDrawer.getHeaderLayout();
        fVar.getClass();
        kotlin.jvm.internal.o.g(headerLayout, "headerLayout");
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.bpv, fVar.h().getHeaderLayout());
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.d4v);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        fVar.f466633e = textView;
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.d4r);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        fVar.f466634f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.bzb);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.byz);
        android.view.View findViewById4 = inflate.findViewById(com.tencent.mm.R.id.d4y);
        if (com.tencent.mm.ui.bk.C()) {
            findViewById3.setBackgroundResource(com.tencent.mm.R.drawable.f481833ad5);
        } else {
            findViewById3.setBackgroundResource(com.tencent.mm.R.drawable.ad6);
        }
        viewGroup.setOnClickListener(new yw2.b(fVar));
        ((com.tencent.mm.plugin.finder.feed.f8) fVar.f466632d).getClass();
        com.tencent.mm.plugin.finder.view.FinderFavDrawer h17 = fVar.h();
        kotlin.jvm.internal.o.d(findViewById3);
        h17.k(findViewById3);
        com.tencent.mm.plugin.finder.view.FinderFavDrawer h18 = fVar.h();
        kotlin.jvm.internal.o.d(findViewById4);
        h18.k(findViewById4);
        yw2.f fVar2 = (yw2.f) h0Var.f310123d;
        com.tencent.mm.view.RefreshLoadMoreLayout rlLayout = finderFavDrawer.getCenterLayout();
        fVar2.getClass();
        kotlin.jvm.internal.o.g(rlLayout, "rlLayout");
        fVar2.f466635g = rlLayout;
        final com.tencent.mm.plugin.finder.feed.f8 f8Var = (com.tencent.mm.plugin.finder.feed.f8) fVar2.f466632d;
        f8Var.getClass();
        android.view.View inflate2 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489227bs5, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate2, "inflate(...)");
        rlLayout.setLoadMoreFooter(inflate2);
        androidx.recyclerview.widget.RecyclerView recyclerView = rlLayout.getRecyclerView();
        recyclerView.setHasFixedSize(true);
        androidx.recyclerview.widget.n2 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f12171f = 0L;
        }
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(context, 1, false));
        recyclerView.N(new com.tencent.mm.plugin.finder.feed.p7());
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new in5.s() { // from class: com.tencent.mm.plugin.finder.feed.FinderFavListDrawerPresenter$getItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.finder.convert.l8(new com.tencent.mm.plugin.finder.feed.o7(com.tencent.mm.plugin.finder.feed.f8.this));
            }
        }, f8Var.f106719p, true);
        wxRecyclerAdapter.setHasStableIds(false);
        wxRecyclerAdapter.f293105o = f8Var;
        wxRecyclerAdapter.f293104n = f8Var;
        recyclerView.setAdapter(wxRecyclerAdapter);
        yw2.f fVar3 = (yw2.f) h0Var.f310123d;
        android.widget.FrameLayout loadingLayout = finderFavDrawer.getLoadingLayout();
        fVar3.getClass();
        kotlin.jvm.internal.o.g(loadingLayout, "loadingLayout");
        fVar3.f466637i = loadingLayout;
        android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ahv, (android.view.ViewGroup) loadingLayout, true);
        android.view.View findViewById5 = inflate3.findViewById(com.tencent.mm.R.id.i1w);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        fVar3.f466638m = findViewById5;
        android.view.View findViewById6 = inflate3.findViewById(com.tencent.mm.R.id.kc7);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        fVar3.f466639n = (android.widget.TextView) findViewById6;
        fVar3.k().setText(context.getString(com.tencent.mm.R.string.cuv));
        android.view.View findViewById7 = inflate3.findViewById(com.tencent.mm.R.id.m2e);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        fVar3.f466640o = findViewById7;
        android.view.View view = fVar3.f466638m;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        fVar3.k().setVisibility(8);
        android.view.View l17 = fVar3.l();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(l17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        l17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(l17, "com/tencent/mm/plugin/finder/view/builder/FinderFavDrawerBuilder", "onBuildLoading", "(Landroid/content/Context;Landroid/widget/FrameLayout;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
