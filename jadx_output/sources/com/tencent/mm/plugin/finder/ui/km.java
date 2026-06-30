package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class km extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.gj f129447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.qm f129448e;

    public km(com.tencent.mm.plugin.finder.feed.gj gjVar, com.tencent.mm.plugin.finder.ui.qm qmVar) {
        this.f129447d = gjVar;
        this.f129448e = qmVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.RandomAccess dataListJustForAdapter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onAttach$7", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.tencent.mm.plugin.finder.feed.gj gjVar = this.f129447d;
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = gjVar.getRecyclerView().getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int w17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).w();
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager2 = gjVar.getRecyclerView().getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int y17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager2).y();
            com.tencent.mm.plugin.finder.ui.qm qmVar = this.f129448e;
            int i18 = qmVar.f129750x1;
            if (i18 != -1 && qmVar.f129752y1 != null && w17 != i18 && w17 == y17) {
                com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader baseFeedLoader = qmVar.f106570t;
                if (baseFeedLoader != null && (dataListJustForAdapter = baseFeedLoader.getDataListJustForAdapter()) != null) {
                    kotlin.jvm.internal.m0.a(dataListJustForAdapter).remove(qmVar.f129752y1);
                }
                com.tencent.mm.plugin.finder.feed.i0 i0Var = qmVar.f106424g;
                if (i0Var != null) {
                    i0Var.a().notifyItemRemoved(qmVar.f129750x1);
                }
                qmVar.f129750x1 = -1;
                qmVar.f129752y1 = null;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onAttach$7", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onAttach$7", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/ShareRelPresenter$onAttach$7", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
