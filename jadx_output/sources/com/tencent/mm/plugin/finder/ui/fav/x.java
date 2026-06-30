package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f129217a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment f129218b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.fav.a f129219c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f129220d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderRefreshLayout f129221e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f129222f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f129223g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.FrameLayout f129224h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f129225i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f129226j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f129227k;

    /* renamed from: l, reason: collision with root package name */
    public final yz5.r f129228l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.vj0 f129229m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter f129230n;

    public x(android.app.Activity context, com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment fragment, com.tencent.mm.plugin.finder.ui.fav.a presenter, android.view.View view) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f129217a = context;
        this.f129218b = fragment;
        this.f129219c = presenter;
        this.f129220d = view;
        com.tencent.mm.plugin.finder.ui.fav.w wVar = new com.tencent.mm.plugin.finder.ui.fav.w(this);
        this.f129228l = wVar;
        this.f129229m = new com.tencent.mm.plugin.finder.ui.fav.q(wVar);
    }

    public final android.view.View a(int i17) {
        android.view.View view = this.f129220d;
        android.view.View findViewById = view != null ? view.findViewById(i17) : null;
        if (findViewById != null) {
            return findViewById;
        }
        android.view.View findViewById2 = this.f129217a.findViewById(i17);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        return findViewById2;
    }

    public com.tencent.mm.plugin.finder.storage.vj0 b() {
        return this.f129229m;
    }

    public com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter(context, null);
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView d() {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = this.f129223g;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        kotlin.jvm.internal.o.o("recyclerView");
        throw null;
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout e() {
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = this.f129221e;
        if (finderRefreshLayout != null) {
            return finderRefreshLayout;
        }
        kotlin.jvm.internal.o.o("rlLayout");
        throw null;
    }

    public final void f() {
        android.widget.FrameLayout frameLayout = this.f129224h;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(8);
        android.view.View view = this.f129227k;
        if (view != null) {
            view.setOnClickListener(null);
        } else {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
    }

    public final void g() {
        fc2.o Z6;
        this.f129224h = (android.widget.FrameLayout) a(com.tencent.mm.R.id.f484229dg3);
        this.f129225i = a(com.tencent.mm.R.id.lbi);
        this.f129226j = a(com.tencent.mm.R.id.dft);
        this.f129227k = a(com.tencent.mm.R.id.m2g);
        this.f129221e = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) a(com.tencent.mm.R.id.m6e);
        android.app.Activity activity = this.f129217a;
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter c17 = c(activity);
        com.tencent.mm.plugin.finder.ui.fav.a aVar = this.f129219c;
        c17.setDataList(aVar.c());
        c17.removeAllViews();
        android.view.View.inflate(c17.getContext(), com.tencent.mm.R.layout.bsa, c17);
        this.f129230n = c17;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout e17 = e();
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter finderGlobalFavLoaderMoreFooter = this.f129230n;
        kotlin.jvm.internal.o.d(finderGlobalFavLoaderMoreFooter);
        e17.D(finderGlobalFavLoaderMoreFooter);
        androidx.recyclerview.widget.RecyclerView recyclerView = e().getRecyclerView();
        kotlin.jvm.internal.o.e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
        this.f129223g = (com.tencent.mm.view.recyclerview.WxRecyclerView) recyclerView;
        d().setLayoutManager(b().d(activity));
        d().setItemAnimator(null);
        this.f129222f = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(b().a(), aVar.c(), false, 4, null);
        d().N(b().c());
        com.tencent.mm.view.recyclerview.WxRecyclerView d17 = d();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f129222f;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        d17.setAdapter(wxRecyclerAdapter);
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavFeedFragment fragment = this.f129218b;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (Z6 = nyVar.Z6(-1)) != null) {
            Z6.d(d());
        }
        in5.o.b(d(), new com.tencent.mm.plugin.finder.ui.fav.r(this), com.tencent.mm.plugin.finder.ui.fav.s.f129203d);
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = this.f129222f;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter2.f293105o = new com.tencent.mm.plugin.finder.ui.fav.t(this);
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter2.f293104n = new com.tencent.mm.plugin.finder.ui.fav.u(this);
        e().setOnSimpleAction(new com.tencent.mm.plugin.finder.ui.fav.v(this));
    }

    public boolean h(r45.qt2 qt2Var, android.view.View view, int i17, so2.j5 feed) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(feed, "feed");
        return false;
    }

    public final void i(java.util.List positionList) {
        kotlin.jvm.internal.o.g(positionList, "positionList");
        java.util.ArrayList<so2.j5> arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.finder.ui.fav.a aVar = this.f129219c;
        int i17 = 0;
        for (java.lang.Object obj : aVar.c()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) obj;
            if (positionList.contains(java.lang.Integer.valueOf(i17))) {
                arrayList.add(j5Var);
            }
            i17 = i18;
        }
        java.util.Collections.reverse(arrayList);
        for (so2.j5 j5Var2 : arrayList) {
            int indexOf = aVar.c().indexOf(j5Var2);
            aVar.c().remove(j5Var2);
            androidx.recyclerview.widget.f2 adapter = d().getAdapter();
            if (adapter != null) {
                adapter.notifyItemRemoved(indexOf);
            }
            androidx.recyclerview.widget.f2 adapter2 = d().getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeChanged(indexOf, aVar.c().size() - indexOf);
            }
        }
        com.tencent.mm.plugin.finder.ui.fav.FinderGlobalFavLoaderMoreFooter finderGlobalFavLoaderMoreFooter = this.f129230n;
        if (finderGlobalFavLoaderMoreFooter != null) {
            finderGlobalFavLoaderMoreFooter.k();
        }
    }

    public final void j() {
        android.widget.FrameLayout frameLayout = this.f129224h;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f129225i;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f129226j;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f129227k;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void k() {
        android.widget.FrameLayout frameLayout = this.f129224h;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = this.f129225i;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f129226j;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f129227k;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/fav/FinderGlobalFavViewCallback", "showNothingTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
