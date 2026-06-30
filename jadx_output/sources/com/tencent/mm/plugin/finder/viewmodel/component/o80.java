package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class o80 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.t80 f135447d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o80(com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var) {
        super(0);
        this.f135447d = t80Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = false;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127750i7).getValue()).r()).intValue() == 1;
        com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = this.f135447d;
        androidx.appcompat.app.AppCompatActivity activity = t80Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        if (finderHomeUIC != null && finderHomeUIC.S6() != t80Var.T6()) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("Finder.TimelineUIC", "FinderNextTabPreloadEvent: tabType=" + t80Var.T6() + ", showPreloadResultWhenSwitchTab=" + z18 + ", isFragmentUnFocus=" + z17);
        if (z18 && z17) {
            com.tencent.mm.plugin.finder.feed.bt btVar = t80Var.f135994d;
            if (btVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            ((com.tencent.mm.plugin.finder.feed.pz) btVar).C.getDataListJustForAdapter().clear();
            com.tencent.mm.plugin.finder.feed.ct ctVar = t80Var.f135995e;
            if (ctVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = ((com.tencent.mm.plugin.finder.feed.v00) ctVar).getRecyclerView();
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        }
        return jz5.f0.f302826a;
    }
}
