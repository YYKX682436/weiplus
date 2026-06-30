package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class b extends com.tencent.mm.plugin.finder.storage.vj0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f124484a;

    public b(java.lang.String reportSessionId) {
        kotlin.jvm.internal.o.g(reportSessionId, "reportSessionId");
        this.f124484a = reportSessionId;
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public in5.s b(yz5.l lVar) {
        return new com.tencent.mm.plugin.finder.profile.widget.FinderProfileProductConfig$getItemConvertFactory$1(this);
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.p2 c() {
        return new com.tencent.mm.plugin.finder.profile.widget.a();
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.RecyclerView.LayoutManager d(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = new com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager(2, 1);
        finderStaggeredGridLayoutManager.setItemPrefetchEnabled(true);
        return finderStaggeredGridLayoutManager;
    }

    @Override // com.tencent.mm.plugin.finder.storage.vj0
    public androidx.recyclerview.widget.y2 e(com.tencent.mm.ui.MMActivity context) {
        kotlin.jvm.internal.o.g(context, "context");
        return null;
    }
}
