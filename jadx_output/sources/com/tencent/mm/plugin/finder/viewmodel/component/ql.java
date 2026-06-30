package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ql extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.zl f135721d;

    public ql(com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar) {
        this.f135721d = zlVar;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC$bindRecyclerViewLoader$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC$bindRecyclerViewLoader$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC$bindRecyclerViewLoader$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.viewmodel.component.zl zlVar = this.f135721d;
        if (!zlVar.f136703u) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC$bindRecyclerViewLoader$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            if (!(layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC$bindRecyclerViewLoader$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            }
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            int w17 = linearLayoutManager.w();
            boolean z17 = linearLayoutManager.y() == zlVar.f136691f.f122296a.size() - 1;
            if ((w17 == 0) && zlVar.f136694i && !zlVar.f136702t) {
                com.tencent.mm.plugin.finder.viewmodel.component.zl.Q6(zlVar, false);
                zlVar.f136702t = true;
                yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC$bindRecyclerViewLoader$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
                return;
            } else if (z17 && zlVar.f136695m && !zlVar.f136701s) {
                com.tencent.mm.plugin.finder.viewmodel.component.zl.Q6(zlVar, true);
                zlVar.f136701s = true;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalCollectionUIC$bindRecyclerViewLoader$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
