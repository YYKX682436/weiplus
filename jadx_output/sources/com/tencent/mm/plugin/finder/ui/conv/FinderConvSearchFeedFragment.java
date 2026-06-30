package com.tencent.mm.plugin.finder.ui.conv;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "Lq40/e;", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class FinderConvSearchFeedFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment implements q40.e {
    public com.tencent.mm.plugin.finder.ui.conv.l A;
    public int B;
    public yz5.a C;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f129003t;

    /* renamed from: u, reason: collision with root package name */
    public final androidx.lifecycle.j0 f129004u;

    /* renamed from: v, reason: collision with root package name */
    public final androidx.lifecycle.j0 f129005v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f129006w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f129007x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f129008y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.conv.c f129009z;

    public FinderConvSearchFeedFragment(java.lang.String conversation) {
        kotlin.jvm.internal.o.g(conversation, "conversation");
        this.f129003t = conversation;
        this.f129004u = new androidx.lifecycle.j0();
        this.f129005v = new androidx.lifecycle.j0();
        this.f129008y = "";
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bcp;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.z.D0(new java.lang.Class[]{com.tencent.mm.plugin.finder.viewmodel.component.ny.class, com.tencent.mm.plugin.finder.viewmodel.component.ut.class});
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (this.f129009z != null) {
            return;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        fc2.o Z6;
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f129009z = new com.tencent.mm.plugin.finder.ui.conv.c();
        androidx.fragment.app.FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.o.f(requireActivity, "requireActivity(...)");
        com.tencent.mm.plugin.finder.ui.conv.c cVar = this.f129009z;
        if (cVar == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.ui.conv.l lVar = new com.tencent.mm.plugin.finder.ui.conv.l(requireActivity, this, cVar, view, this.f129003t);
        this.A = lVar;
        com.tencent.mm.plugin.finder.ui.conv.c cVar2 = this.f129009z;
        if (cVar2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        cVar2.f129013e = lVar;
        com.tencent.mm.plugin.finder.ui.conv.l c17 = cVar2.c();
        c17.f129031j = (android.widget.FrameLayout) c17.a(com.tencent.mm.R.id.f484229dg3);
        c17.f129032k = c17.a(com.tencent.mm.R.id.lbi);
        c17.f129033l = c17.a(com.tencent.mm.R.id.dft);
        c17.f129034m = c17.a(com.tencent.mm.R.id.m2g);
        c17.f129028g = (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) c17.a(com.tencent.mm.R.id.m6e);
        android.view.View a17 = c17.a(com.tencent.mm.R.id.ebt);
        c17.f129035n = a17;
        android.app.Activity activity = c17.f129022a;
        a17.setBackgroundColor(activity.getResources().getColor(com.tencent.mm.R.color.f478491c));
        android.view.View view2 = c17.f129035n;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("dateHeaderContainer");
            throw null;
        }
        android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.ebs);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        c17.f129036o = (android.widget.TextView) findViewById;
        com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter finderLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter(activity, null);
        finderLoaderMoreFooter.j(com.tencent.mm.R.layout.f489227bs5);
        c17.f129038q = finderLoaderMoreFooter;
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout c18 = c17.c();
        on5.c cVar3 = c17.f129038q;
        kotlin.jvm.internal.o.d(cVar3);
        c18.D(cVar3);
        androidx.recyclerview.widget.RecyclerView recyclerView = c17.c().getRecyclerView();
        kotlin.jvm.internal.o.e(recyclerView, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerView");
        c17.f129030i = (com.tencent.mm.view.recyclerview.WxRecyclerView) recyclerView;
        com.tencent.mm.view.recyclerview.WxRecyclerView b17 = c17.b();
        com.tencent.mm.plugin.finder.storage.vj0 vj0Var = c17.f129037p;
        b17.setLayoutManager(vj0Var.d(activity));
        c17.b().setItemAnimator(null);
        c17.f129029h = new com.tencent.mm.view.recyclerview.WxRecyclerAdapter(new com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedStaggeredConfig$getItemConvertFactory$1((com.tencent.mm.plugin.finder.ui.conv.d) vj0Var, null), c17.f129024c.f129012d, false);
        c17.b().N(new com.tencent.mm.plugin.finder.storage.ij0());
        com.tencent.mm.view.recyclerview.WxRecyclerView b18 = c17.b();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = c17.f129029h;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        b18.setAdapter(wxRecyclerAdapter);
        c17.b().i(new com.tencent.mm.plugin.finder.ui.conv.g(c17));
        com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment fragment = c17.f129023b;
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(fragment).e(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        if (nyVar != null && (Z6 = nyVar.Z6(-1)) != null) {
            Z6.d(c17.b());
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = c17.f129029h;
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter2.f293105o = new com.tencent.mm.plugin.finder.ui.conv.h(c17);
        if (wxRecyclerAdapter2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter2.f293104n = new com.tencent.mm.plugin.finder.ui.conv.k(c17);
        this.f129004u.observe(requireActivity(), new com.tencent.mm.plugin.finder.ui.conv.a(this));
        this.f129005v.observe(requireActivity(), new com.tencent.mm.plugin.finder.ui.conv.b(this));
        this.f129006w = true;
        if (this.f129007x) {
            z0();
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getF121515s() {
        return 197;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public int x0() {
        return 3;
    }

    public void y0(java.lang.String query, java.util.List dataList) {
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        com.tencent.mars.xlog.Log.i("Finder.ConvSearchFeedFragment", "onSearchResult query=" + query + " size=" + dataList.size());
        this.f129008y = query;
        this.f129004u.postValue(dataList);
    }

    public void z0() {
        if (!this.f129006w) {
            this.f129007x = true;
            return;
        }
        com.tencent.mm.plugin.finder.ui.conv.l lVar = this.A;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        android.widget.FrameLayout frameLayout = lVar.f129031j;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("loadingLayout");
            throw null;
        }
        frameLayout.setVisibility(0);
        android.view.View view = lVar.f129032k;
        if (view == null) {
            kotlin.jvm.internal.o.o("loadingView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = lVar.f129033l;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("nothingView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = lVar.f129034m;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("retryView");
            throw null;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/ui/conv/FinderConvSearchFeedViewCallback", "showLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
