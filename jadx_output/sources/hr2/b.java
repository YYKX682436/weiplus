package hr2;

/* loaded from: classes15.dex */
public final class b extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView f283368d;

    public b(com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView) {
        this.f283368d = finderParentRecyclerView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            int i18 = com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView.f122233p2;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispatchChildFling isScrollEnd: ");
            com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = this.f283368d;
            sb6.append(finderParentRecyclerView.h1());
            sb6.append(" velocityY: ");
            sb6.append(finderParentRecyclerView.f122238n2);
            com.tencent.mars.xlog.Log.i("FinderParentRecyclerView", sb6.toString());
            if (finderParentRecyclerView.h1()) {
                finderParentRecyclerView.setCanScrollVertically(false);
                int i19 = finderParentRecyclerView.f122238n2;
                if (i19 != 0) {
                    com.tencent.mm.plugin.finder.live.util.b1 b1Var = finderParentRecyclerView.f122234j2;
                    double a17 = b1Var.a(i19);
                    double d17 = finderParentRecyclerView.totalDy;
                    if (a17 > d17) {
                        int b17 = b1Var.b(a17 - d17);
                        com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView g17 = finderParentRecyclerView.g1();
                        if (g17 != null) {
                            g17.startNestedScroll(2);
                            g17.r0(0, b17);
                            com.tencent.mars.xlog.Log.i("FinderParentRecyclerView", "childFling " + b17);
                        }
                    }
                }
            }
            finderParentRecyclerView.totalDy = 0;
            finderParentRecyclerView.f122238n2 = 0;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = this.f283368d;
        if (finderParentRecyclerView.isStartFling) {
            finderParentRecyclerView.setTotalDy(0);
            finderParentRecyclerView.setStartFling(false);
        }
        finderParentRecyclerView.setTotalDy(finderParentRecyclerView.getTotalDy() + i18);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nest/FinderParentRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
