package hr2;

/* loaded from: classes15.dex */
public final class a extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView f283367d;

    public a(com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView) {
        this.f283367d = finderChildRecyclerView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        int i18;
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nest/FinderChildRecyclerView$initScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 == 0) {
            com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView = this.f283367d;
            if (finderChildRecyclerView.mFinderParentRecyclerView == null) {
                android.view.ViewParent parent = finderChildRecyclerView.getParent();
                while (true) {
                    z17 = parent instanceof com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView;
                    if (z17) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                finderChildRecyclerView.mFinderParentRecyclerView = z17 ? (com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView) parent : null;
            }
            com.tencent.mm.plugin.finder.nest.FinderParentRecyclerView finderParentRecyclerView = finderChildRecyclerView.mFinderParentRecyclerView;
            if (finderParentRecyclerView != null && finderChildRecyclerView.g1() && (i18 = finderChildRecyclerView.f122229k2) != 0) {
                com.tencent.mm.plugin.finder.live.util.b1 b1Var = finderChildRecyclerView.f122228j2;
                double a17 = b1Var.a(i18);
                if (a17 > java.lang.Math.abs(finderChildRecyclerView.totalDy)) {
                    finderParentRecyclerView.r0(0, -b1Var.b(a17 + finderChildRecyclerView.totalDy));
                }
                finderChildRecyclerView.totalDy = 0;
                finderChildRecyclerView.f122229k2 = 0;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nest/FinderChildRecyclerView$initScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nest/FinderChildRecyclerView$initScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.nest.FinderChildRecyclerView finderChildRecyclerView = this.f283367d;
        if (finderChildRecyclerView.isStartFling) {
            finderChildRecyclerView.setTotalDy(0);
            finderChildRecyclerView.setStartFling(false);
        }
        finderChildRecyclerView.setTotalDy(finderChildRecyclerView.getTotalDy() + i18);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/nest/FinderChildRecyclerView$initScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
