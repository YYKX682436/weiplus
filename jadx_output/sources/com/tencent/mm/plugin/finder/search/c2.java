package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125644d;

    public c2(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        this.f125644d = finderFeedSearchUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125644d;
        androidx.recyclerview.widget.RecyclerView recyclerView = finderFeedSearchUI.P;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        if (!(recyclerView.getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView2 = finderFeedSearchUI.P;
        if (recyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
        androidx.recyclerview.widget.RecyclerView recyclerView3 = finderFeedSearchUI.P;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = recyclerView3.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).y();
        if (w17 > y17) {
            return;
        }
        while (true) {
            if (w17 >= 0) {
                com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer dataBuffer = finderFeedSearchUI.C;
                if (w17 < dataBuffer.size()) {
                    finderFeedSearchUI.d7(((so2.j5) dataBuffer.get(w17)).getItemId(), w17, 2);
                }
            }
            if (w17 == y17) {
                return;
            } else {
                w17++;
            }
        }
    }
}
