package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class um implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f136144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f136145b;

    public um(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar, com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        this.f136144a = mnVar;
        this.f136145b = finderFeedShareRelativeListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar = this.f136144a;
        androidx.recyclerview.widget.RecyclerView recyclerView = mnVar.T6().getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        mnVar.W6(false);
        com.tencent.mm.plugin.finder.viewmodel.component.mn.O6(mnVar, false);
        recyclerView.post(new com.tencent.mm.plugin.finder.viewmodel.component.tm(this.f136145b, (com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager, mnVar));
    }
}
