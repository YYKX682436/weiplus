package l94;

/* loaded from: classes4.dex */
public final class z extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l94.b0 f317410d;

    public z(l94.b0 b0Var) {
        this.f317410d = b0Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView rv6, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(rv6, "rv");
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            l94.b0 b0Var = this.f317410d;
            boolean z17 = b0Var.f317323i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            if (z17) {
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = rv6.getLayoutManager();
                com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager scaleLayoutManager = layoutManager instanceof com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager ? (com.tencent.mm.plugin.sns.ad.wsfold.ui.component.recycler.ScaleLayoutManager) layoutManager : null;
                int n17 = scaleLayoutManager != null ? scaleLayoutManager.n() : 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setScrollIdleIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                b0Var.f317332r = n17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setScrollIdleIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getScrollIdleIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                int i18 = b0Var.f317332r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getScrollIdleIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTouchDownIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                int i19 = b0Var.f317331q;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTouchDownIndex$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                if (i18 != i19) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getScrollCount$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    int i27 = b0Var.f317330p;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getScrollCount$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setScrollCount$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                    b0Var.f317330p = i27 + 1;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setScrollCount$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                b0Var.f317323i = false;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setUserInteracting$p", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                float n18 = l94.b0.n(b0Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
                b0Var.o(n18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$animateSnapToPx", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$3");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldRecyclerAdComponent$setupListeners$3", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldRecyclerAdComponent$setupListeners$3");
    }
}
