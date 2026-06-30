package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderNativeDramaTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderNativeDramaTabFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {
    public FinderNativeDramaTabFragment() {
        super(com.tencent.mm.R.string.p5n, 39);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        return kz5.p1.d(com.tencent.mm.plugin.finder.viewmodel.component.d1.class, com.tencent.mm.plugin.finder.viewmodel.component.zp.class);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
        java.lang.String valueOf = java.lang.String.valueOf(397);
        ((m30.m) qVar).getClass();
        a52.a.d(valueOf);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.UIComponentFragment", "onCreate");
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return 397;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void s0() {
        com.tencent.mm.plugin.finder.viewmodel.component.zp zpVar = (com.tencent.mm.plugin.finder.viewmodel.component.zp) j0(com.tencent.mm.plugin.finder.viewmodel.component.zp.class);
        com.tencent.mars.xlog.Log.i("FinderNativeDramaGridUIC", "onActionbarClick isDouble=true tabType=" + zpVar.O6());
        com.tencent.mm.plugin.finder.feed.ym ymVar = zpVar.f136711f;
        if (ymVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = ymVar.getRecyclerView().getLayoutManager();
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager ? (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager : null;
        if (staggeredGridLayoutManager != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderNativeDramaGridUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderNativeDramaGridUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        com.tencent.mm.plugin.finder.feed.ym ymVar2 = zpVar.f136711f;
        if (ymVar2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        ymVar2.f106180m.postDelayed(new com.tencent.mm.plugin.finder.feed.vm(ymVar2, false), 150L);
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1) {
            androidx.appcompat.app.AppCompatActivity context = zpVar.getActivity();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            if (nyVar != null) {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).aj(nyVar.V6(), 5, zpVar.O6());
            }
        }
    }
}
