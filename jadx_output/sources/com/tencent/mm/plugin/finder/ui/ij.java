package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ij implements com.tencent.mm.plugin.finder.feed.model.internal.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader f129370b;

    public ij(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI, com.tencent.mm.plugin.finder.feed.model.FinderFeedShareRelativeListLoader finderFeedShareRelativeListLoader) {
        this.f129369a = finderShareFeedRelUI;
        this.f129370b = finderFeedShareRelativeListLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.q0
    public void call(int i17) {
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129369a;
        com.tencent.mm.plugin.finder.feed.w8 w8Var = finderShareFeedRelUI.E;
        if (w8Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = w8Var.getRecyclerView();
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
        finderShareFeedRelUI.R7(false);
        finderShareFeedRelUI.S7(false);
        recyclerView.post(new com.tencent.mm.plugin.finder.ui.hj((com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager) layoutManager, this.f129370b, finderShareFeedRelUI));
        com.tencent.mm.plugin.finder.ui.qm qmVar = finderShareFeedRelUI.D;
        if (qmVar != null) {
            qmVar.x0();
        } else {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
    }
}
