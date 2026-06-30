package com.tencent.mm.plugin.finder.ui.fragment;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderFollowTabFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFollowTabFragment extends com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment {

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f129262t;

    public FinderFollowTabFragment() {
        super(com.tencent.mm.R.string.f6c, 3);
        this.f129262t = jz5.h.b(wu2.o.f449693d);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    /* renamed from: l0 */
    public java.util.Set getF123295n() {
        jz5.g gVar = this.f129262t;
        java.util.HashSet d17 = kz5.p1.d((java.lang.Class) ((jz5.n) gVar).getValue(), com.tencent.mm.plugin.finder.viewmodel.component.d1.class, com.tencent.mm.plugin.finder.viewmodel.component.c70.class, ni3.n.class, cs2.k.class, com.tencent.mm.plugin.finder.viewmodel.component.pv.class, com.tencent.mm.plugin.finder.viewmodel.component.ye.class);
        d17.add(com.tencent.mm.plugin.finder.viewmodel.component.th.class);
        if (kotlin.jvm.internal.o.b((java.lang.Class) ((jz5.n) gVar).getValue(), com.tencent.mm.plugin.finder.viewmodel.component.t80.class)) {
            d17.add(qt2.u.class);
            d17.add(qt2.e.class);
        }
        return d17;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment, com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        super.o0();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(this, "special_enter_source", java.lang.Integer.valueOf(((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Bi()));
        n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
        java.lang.String valueOf = java.lang.String.valueOf(getB());
        ((m30.m) qVar).getClass();
        a52.a.d(valueOf);
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderFollowTabFragment);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "FinderFollowTabFragment");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ck(this, true);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, wu2.n.f449692a);
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment
    /* renamed from: r0 */
    public int getB() {
        return kotlin.jvm.internal.o.b((java.lang.Class) ((jz5.n) this.f129262t).getValue(), com.tencent.mm.plugin.finder.viewmodel.component.t80.class) ? 17 : 155;
    }

    @Override // com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment
    public void s0() {
        if (kotlin.jvm.internal.o.b((java.lang.Class) ((jz5.n) this.f129262t).getValue(), com.tencent.mm.plugin.finder.viewmodel.component.t80.class)) {
            ((com.tencent.mm.plugin.finder.viewmodel.component.t80) j0(com.tencent.mm.plugin.finder.viewmodel.component.t80.class)).X6(true);
        } else {
            com.tencent.mm.plugin.finder.viewmodel.component.k90 k90Var = (com.tencent.mm.plugin.finder.viewmodel.component.k90) j0(com.tencent.mm.plugin.finder.viewmodel.component.k90.class);
            com.tencent.mm.plugin.finder.feed.xa xaVar = k90Var.f134939f;
            if (xaVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = xaVar.getRecyclerView().getLayoutManager();
            androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager ? (androidx.recyclerview.widget.StaggeredGridLayoutManager) layoutManager : null;
            if (staggeredGridLayoutManager != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(staggeredGridLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTwoFlowTimelineUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.O(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                yj0.a.f(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTwoFlowTimelineUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            com.tencent.mm.plugin.finder.feed.xa xaVar2 = k90Var.f134939f;
            if (xaVar2 == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            xaVar2.f106180m.postDelayed(new com.tencent.mm.plugin.finder.feed.qa(xaVar2, false), 150L);
            if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.Q0().r()).intValue() == 1) {
                androidx.appcompat.app.AppCompatActivity context = k90Var.getActivity();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
                if (nyVar != null) {
                    ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).aj(nyVar.V6(), 5, k90Var.O6());
                }
            }
        }
    }
}
