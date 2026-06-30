package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ub extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderHorizontalViewPager f133164d;

    public ub(com.tencent.mm.plugin.finder.view.FinderHorizontalViewPager finderHorizontalViewPager) {
        this.f133164d = finderHorizontalViewPager;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        int currentSnappedPosition;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.view.FinderHorizontalViewPager finderHorizontalViewPager = this.f133164d;
        if (i17 == 0) {
            currentSnappedPosition = finderHorizontalViewPager.getCurrentSnappedPosition();
            if (currentSnappedPosition != -1 && currentSnappedPosition != finderHorizontalViewPager.f131150e2) {
                finderHorizontalViewPager.f131150e2 = currentSnappedPosition;
                boolean z17 = !finderHorizontalViewPager.f131151f2;
                com.tencent.mm.plugin.finder.view.sb sbVar = finderHorizontalViewPager.pageChangeListener;
                if (sbVar != null) {
                    sbVar.a(currentSnappedPosition, true, z17);
                }
            }
            finderHorizontalViewPager.f131151f2 = false;
        } else if (i17 == 1) {
            finderHorizontalViewPager.f131151f2 = true;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderHorizontalViewPager$setAdapter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
