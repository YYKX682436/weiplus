package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class g90 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.k90 f134483d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g90(com.tencent.mm.plugin.finder.viewmodel.component.k90 k90Var) {
        super(0);
        this.f134483d = k90Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.recyclerview.widget.f2 adapter;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = false;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127750i7).getValue()).r()).intValue() == 1;
        com.tencent.mm.plugin.finder.viewmodel.component.k90 k90Var = this.f134483d;
        androidx.appcompat.app.AppCompatActivity activity = k90Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        if (finderHomeUIC != null && finderHomeUIC.S6() != k90Var.O6()) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("FinderTwoFlowTimelineUIC", "FinderNextTabPreloadEvent: showPreloadResultWhenSwitchTab=" + z18 + ", isFragmentUnFocus=" + z17);
        if (z18 && z17) {
            com.tencent.mm.plugin.finder.feed.oa oaVar = k90Var.f134938e;
            if (oaVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            oaVar.f107156e.getDataListJustForAdapter().clear();
            com.tencent.mm.plugin.finder.feed.xa xaVar = k90Var.f134939f;
            if (xaVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = xaVar.getRecyclerView();
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        }
        return jz5.f0.f302826a;
    }
}
