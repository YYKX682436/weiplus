package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class t3 implements com.tencent.mm.plugin.finder.search.l3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f125857d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.search.k3 f125858e;

    /* renamed from: f, reason: collision with root package name */
    public final int f125859f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f125860g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout f125861h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout f125862i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f125863m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f125864n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f125865o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f125866p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f125867q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f125868r;

    /* renamed from: s, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f125869s;

    public t3(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.search.k3 presenter, int i17) {
        float dimension;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar;
        fc2.o Z6;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2;
        fc2.o Z62;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f125857d = context;
        this.f125858e = presenter;
        this.f125859f = i17;
        this.f125860g = "Finder.FinderMixSearchViewCallback";
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) context.findViewById(com.tencent.mm.R.id.m6e);
        this.f125861h = finderRefreshLayout;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout2 = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) context.findViewById(com.tencent.mm.R.id.m6f);
        this.f125862i = finderRefreshLayout2;
        this.f125863m = (android.widget.TextView) context.findViewById(com.tencent.mm.R.id.kcj);
        this.f125864n = context.findViewById(com.tencent.mm.R.id.im7);
        this.f125865o = context.findViewById(com.tencent.mm.R.id.eg9);
        this.f125866p = jz5.h.b(new com.tencent.mm.plugin.finder.search.r3(this));
        this.f125867q = context.findViewById(com.tencent.mm.R.id.j8y);
        androidx.recyclerview.widget.RecyclerView recyclerView = finderRefreshLayout.getRecyclerView();
        this.f125868r = recyclerView;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = finderRefreshLayout2.getRecyclerView();
        this.f125869s = recyclerView2;
        if (g()) {
            android.view.View findViewById = context.findViewById(com.tencent.mm.R.id.j8y);
            kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.view.View");
            finderRefreshLayout.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478512u));
            finderRefreshLayout2.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478512u));
            findViewById.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.f478512u));
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1));
        }
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1));
        }
        com.tencent.mm.plugin.finder.search.p3 p3Var = new com.tencent.mm.plugin.finder.search.p3(this, g());
        if (recyclerView != null) {
            recyclerView.setAdapter(p3Var);
        }
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(p3Var);
        }
        if (g()) {
            android.content.res.Resources resources = context.getResources();
            kotlin.jvm.internal.o.d(resources);
            dimension = resources.getDimension(com.tencent.mm.R.dimen.f479672c9);
        } else {
            android.content.res.Resources resources2 = context.getResources();
            kotlin.jvm.internal.o.d(resources2);
            dimension = resources2.getDimension(com.tencent.mm.R.dimen.f479646bl);
        }
        com.tencent.mm.plugin.finder.search.q3 q3Var = new com.tencent.mm.plugin.finder.search.q3(this, (int) dimension);
        if (recyclerView != null) {
            recyclerView.N(q3Var);
        }
        if (recyclerView2 != null) {
            recyclerView2.N(q3Var);
        }
        com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter finderLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter(context, null);
        boolean g17 = g();
        int i18 = com.tencent.mm.R.layout.bsc;
        finderLoaderMoreFooter.j(g17 ? com.tencent.mm.R.layout.bsc : com.tencent.mm.R.layout.f489227bs5);
        finderRefreshLayout.D(finderLoaderMoreFooter);
        com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter finderLoaderMoreFooter2 = new com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter(context, null);
        finderLoaderMoreFooter2.j(g() ? i18 : com.tencent.mm.R.layout.f489227bs5);
        finderRefreshLayout2.D(finderLoaderMoreFooter2);
        com.tencent.mm.plugin.finder.search.s3 s3Var = new com.tencent.mm.plugin.finder.search.s3(this);
        finderRefreshLayout.setOnSimpleAction(s3Var);
        finderRefreshLayout2.setOnSimpleAction(s3Var);
        if (recyclerView != null && (nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)) != null && (Z62 = nyVar2.Z6(-1)) != null) {
            Z62.d(recyclerView);
        }
        if (recyclerView2 == null || (nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)) == null || (Z6 = nyVar.Z6(-1)) == null) {
            return;
        }
        Z6.d(recyclerView2);
    }

    public static final int a(com.tencent.mm.plugin.finder.search.t3 t3Var) {
        com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter = (com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter) t3Var.f125858e;
        int size = finderMixSearchPresenter.f125571m.size();
        boolean f17 = finderMixSearchPresenter.f();
        if (size > 3 && f17) {
            return 4;
        }
        if (size > 0) {
            return size + 1;
        }
        return 0;
    }

    public final boolean g() {
        return this.f125859f == 13;
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f125857d;
    }

    public final void j() {
        android.view.View view = this.f125865o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "showSearchResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "showSearchResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f125867q;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "showSearchResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "showSearchResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
