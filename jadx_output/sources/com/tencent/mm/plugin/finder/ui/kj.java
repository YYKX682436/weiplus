package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class kj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI f129443d;

    public kj(com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI) {
        this.f129443d = finderShareFeedRelUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int y17;
        com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI finderShareFeedRelUI = this.f129443d;
        com.tencent.mm.plugin.finder.feed.w8 w8Var = finderShareFeedRelUI.E;
        if (w8Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        if (!(w8Var.getRecyclerView().getLayoutManager() instanceof androidx.recyclerview.widget.LinearLayoutManager) || ((androidx.recyclerview.widget.LinearLayoutManager) r1).y() - 1 < 0) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.w8 w8Var2 = finderShareFeedRelUI.E;
        if (w8Var2 == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = w8Var2.getRecyclerView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(y17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$7$3$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/finder/ui/FinderShareFeedRelUI$initData$7$3$2", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
