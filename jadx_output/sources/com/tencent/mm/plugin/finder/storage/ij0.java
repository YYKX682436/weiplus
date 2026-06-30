package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class ij0 extends androidx.recyclerview.widget.p2 {
    @Override // androidx.recyclerview.widget.p2
    public void getItemOffsets(android.graphics.Rect outRect, android.view.View view, androidx.recyclerview.widget.RecyclerView parent, androidx.recyclerview.widget.h3 state) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(outRect);
        arrayList.add(view);
        arrayList.add(parent);
        arrayList.add(state);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemDecoration$1", "com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemDecoration$androidx/recyclerview/widget/RecyclerView$ItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V", this, array);
        kotlin.jvm.internal.o.g(outRect, "outRect");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(state, "state");
        int dimension = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);
        int dimension2 = (int) view.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
        if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams).f11941i) {
            outRect.left = 0;
            outRect.right = 0;
            outRect.bottom = 0;
            outRect.top = 0;
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
            if (((androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) layoutParams2).e() % 2 == 0) {
                outRect.left = dimension;
                outRect.right = dimension2;
                outRect.bottom = dimension2;
                outRect.top = dimension2;
            } else {
                outRect.left = dimension2;
                outRect.right = dimension;
                outRect.bottom = dimension2;
                outRect.top = dimension2;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemDecoration$1", "com/tencent/mm/plugin/finder/storage/FinderStaggeredConfig$getItemDecoration$androidx/recyclerview/widget/RecyclerView$ItemDecoration", "getItemOffsets", "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V");
    }
}
