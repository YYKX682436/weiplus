package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ng extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bh f119185d;

    public ng(com.tencent.mm.plugin.finder.live.widget.bh bhVar) {
        this.f119185d = bhVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget$initContent$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f119185d;
        r45.js1 js1Var = bhVar.R;
        if ((js1Var != null && js1Var.getInteger(2) == 1) && !bhVar.T) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int x17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).x();
            if (x17 >= 0) {
                bm2.v2 v2Var = bhVar.Q;
                if (x17 >= v2Var.getItemCount() - 10) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load more item:");
                    sb6.append(v2Var.getItemCount());
                    sb6.append('/');
                    r45.js1 js1Var2 = bhVar.R;
                    sb6.append(js1Var2 != null ? java.lang.Integer.valueOf(js1Var2.getInteger(3)) : null);
                    com.tencent.mars.xlog.Log.i("FinderLiveFansListWidget", sb6.toString());
                    bhVar.T = true;
                    bhVar.g(false, new com.tencent.mm.plugin.finder.live.widget.zg(bhVar));
                }
            } else {
                bhVar.getClass();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget$initContent$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget$initContent$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget$initContent$2$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
