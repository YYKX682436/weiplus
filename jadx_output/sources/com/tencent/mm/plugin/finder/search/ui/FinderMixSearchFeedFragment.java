package com.tencent.mm.plugin.finder.search.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "pt2/d", "pt2/e", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderMixSearchFeedFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {
    public static final /* synthetic */ int A = 0;

    /* renamed from: t, reason: collision with root package name */
    public final int f125903t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter f125904u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f125905v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f125906w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f125907x;

    /* renamed from: y, reason: collision with root package name */
    public sc2.s8 f125908y;

    /* renamed from: z, reason: collision with root package name */
    public final pt2.g f125909z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderMixSearchFeedFragment(nt2.a tabData, int i17, com.tencent.mm.plugin.finder.search.FinderMixSearchPresenter finderMixSearchPresenter) {
        super(0, tabData.f339702a);
        kotlin.jvm.internal.o.g(tabData, "tabData");
        this.f125903t = i17;
        this.f125904u = finderMixSearchPresenter;
        this.f125905v = tabData.f339704c;
        this.f125906w = jz5.h.b(new pt2.i(this));
        this.f125907x = jz5.h.b(new pt2.h(this));
        jz5.h.b(new pt2.j(this));
        this.f125909z = new pt2.g();
    }

    public final boolean A0() {
        return this.f125903t == 13;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public int getLayoutId() {
        return A0() ? com.tencent.mm.R.layout.b37 : com.tencent.mm.R.layout.f489034b36;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.r0.f314002d;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        sc2.s8 s8Var;
        super.onDestroy();
        y0().V0(this.f125909z);
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.S1().r()).intValue() != 1 || (s8Var = this.f125908y) == null) {
            return;
        }
        y0().V0(s8Var);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        y0().setLayoutManager(new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1));
        y0().setAdapter(new pt2.d(this));
        y0().N(new pt2.e(this, (int) (A0() ? getResources().getDimension(com.tencent.mm.R.dimen.f479672c9) : getResources().getDimension(com.tencent.mm.R.dimen.f479738dv))));
        com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter finderLoaderMoreFooter = new com.tencent.mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter(getActivity(), null);
        finderLoaderMoreFooter.j(A0() ? com.tencent.mm.R.layout.bsc : com.tencent.mm.R.layout.f489227bs5);
        z0().D(finderLoaderMoreFooter);
        z0().setOnSimpleAction(new pt2.f(this));
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.S1().r()).intValue() == 1) {
            com.tencent.mm.plugin.finder.view.FinderRefreshLayout z07 = z0();
            kotlin.jvm.internal.o.f(z07, "<get-rlLayout>(...)");
            sc2.s8 s8Var = new sc2.s8("Finder.MixSearchFeedFragment", z07, 2);
            this.f125908y = s8Var;
            y0().i(s8Var);
        }
        y0().i(this.f125909z);
    }

    public final androidx.recyclerview.widget.RecyclerView y0() {
        return (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.f125907x).getValue();
    }

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout z0() {
        return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) ((jz5.n) this.f125906w).getValue();
    }
}
