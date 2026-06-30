package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class vp extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.zp f136262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp(com.tencent.mm.plugin.finder.viewmodel.component.zp zpVar) {
        super(0);
        this.f136262d = zpVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean z17 = false;
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127750i7).getValue()).r()).intValue() == 1;
        com.tencent.mm.plugin.finder.viewmodel.component.zp zpVar = this.f136262d;
        androidx.appcompat.app.AppCompatActivity activity = zpVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
        if (finderHomeUIC != null && finderHomeUIC.S6() != zpVar.O6()) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("FinderNativeDramaGridUIC", "FinderNextTabPreloadEvent: showPreloadResultWhenSwitchTab=" + z18 + " isFragmentUnFocus=" + z17 + " tabType=" + zpVar.O6());
        if (z18 && z17) {
            com.tencent.mm.plugin.finder.feed.um umVar = zpVar.f136710e;
            if (umVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            umVar.f107156e.getDataListJustForAdapter().clear();
            com.tencent.mm.plugin.finder.feed.ym ymVar = zpVar.f136711f;
            if (ymVar == null) {
                kotlin.jvm.internal.o.o("viewCallback");
                throw null;
            }
            androidx.recyclerview.widget.f2 adapter = ymVar.getRecyclerView().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        }
        return jz5.f0.f302826a;
    }
}
