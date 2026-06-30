package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class n4 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout f132692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f132693e;

    public n4(com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout, so2.n1 n1Var) {
        this.f132692d = finderColumnFrameLayout;
        this.f132693e = n1Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$7$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = this.f132692d;
        if (finderColumnFrameLayout.getCurrentStats() != i17) {
            finderColumnFrameLayout.setLastState(finderColumnFrameLayout.getCurrentStats());
            finderColumnFrameLayout.setCurrentStats(i17);
        }
        if (finderColumnFrameLayout.getCurrentStats() == 0) {
            com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout.b(finderColumnFrameLayout, recyclerView);
            finderColumnFrameLayout.setDraggingDistance(0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$7$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$7$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            if (!layoutManager.getF98486n()) {
                i17 = i18;
            }
            com.tencent.mm.plugin.finder.view.FinderColumnFrameLayout finderColumnFrameLayout = this.f132692d;
            if (finderColumnFrameLayout.getCurrentStats() == 1) {
                finderColumnFrameLayout.setDraggingDistance(finderColumnFrameLayout.getDraggingDistance() + i17);
                int i19 = finderColumnFrameLayout.e(this.f132693e) ? com.tencent.mm.plugin.finder.view.x.f133311d : finderColumnFrameLayout.f130917u;
                int draggingDistance = finderColumnFrameLayout.getDraggingDistance();
                int i27 = finderColumnFrameLayout.f130918v;
                if (draggingDistance < 0 || java.lang.Math.abs(finderColumnFrameLayout.getDraggingDistance()) > (i27 / 2) - i19) {
                    com.tencent.mars.xlog.Log.i("FinderColumnFrameLayout", "handleOnScrolled draggingDistance:" + finderColumnFrameLayout.getDraggingDistance() + " offset:" + i17 + " widthPixels:" + i27);
                    finderColumnFrameLayout.setDraggingDistance(0);
                    finderColumnFrameLayout.setLastSnappedPosition(-1);
                    recyclerView.post(new com.tencent.mm.plugin.finder.view.m4(finderColumnFrameLayout));
                } else {
                    com.tencent.mars.xlog.Log.i("FinderColumnFrameLayout", "handleOnScrolled x draggingDistance:" + finderColumnFrameLayout.getDraggingDistance() + " offset:" + i17 + " widthPixels:" + i27);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderColumnFrameLayout$bindColumn$7$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
