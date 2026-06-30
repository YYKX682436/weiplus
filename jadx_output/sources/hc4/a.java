package hc4;

/* loaded from: classes14.dex */
public final class a extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI f280357d;

    public a(com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI improveSnsJankUI) {
        this.f280357d = improveSnsJankUI;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$onCreate$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int i18 = com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI.f168628r;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI improveSnsJankUI = this.f280357d;
        improveSnsJankUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        if (i17 != 0) {
            if ((i17 == 1 || i17 == 2) && !improveSnsJankUI.f168638p) {
                improveSnsJankUI.f168638p = true;
                improveSnsJankUI.f168637o = java.lang.System.currentTimeMillis();
            }
        } else if (improveSnsJankUI.f168638p) {
            improveSnsJankUI.f168638p = false;
            hc4.e eVar = improveSnsJankUI.f168635m;
            eVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            long j17 = eVar.f280363c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            long currentTimeMillis = j17 + (java.lang.System.currentTimeMillis() - improveSnsJankUI.f168637o);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
            eVar.f280363c = currentTimeMillis;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageScrollTimeMs", "com.tencent.mm.plugin.sns.ui.improve.JankModel");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$onCreate$1");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$onCreate$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/ImproveSnsJankUI$onCreate$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsJankUI$onCreate$1");
    }
}
