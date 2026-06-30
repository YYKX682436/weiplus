package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class wm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f136352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.u1 f136353e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar, so2.u1 u1Var) {
        super(0);
        this.f136352d = mnVar;
        this.f136353e = u1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f136352d;
        mnVar.P6(this.f136353e);
        com.tencent.mm.plugin.finder.feed.cc ccVar = mnVar.f135184i;
        if (ccVar == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = ccVar.getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager finderLinearLayoutManager = layoutManager instanceof com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager ? (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager : null;
        if (finderLinearLayoutManager != null) {
            recyclerView.post(new com.tencent.mm.plugin.finder.viewmodel.component.ym(mnVar, finderLinearLayoutManager, recyclerView));
        }
        return jz5.f0.f302826a;
    }
}
