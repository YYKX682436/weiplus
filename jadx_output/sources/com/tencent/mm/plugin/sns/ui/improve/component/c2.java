package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class c2 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.f2 f168752d;

    public c2(com.tencent.mm.plugin.sns.ui.improve.component.f2 f2Var) {
        this.f168752d = f2Var;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.f2 f2Var = this.f168752d;
        i64.b1 b1Var = f2Var.f168794d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        b1Var.e(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsAdStatistic$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        boolean z17 = i17 == 0;
        i64.b1 b1Var2 = f2Var.f168794d;
        b1Var2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        b1Var2.f289110y = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStatistic", "onScrollStateChanged, isIdle=" + z17 + ", isImproveUI=" + b1Var2.f289103r);
        if (z17) {
            b1Var2.t();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic");
        int d17 = l52.k.d(recyclerView);
        com.tencent.mars.xlog.Log.i("MicroMsg.OldVersionUIC", "onScrollStateChanged newState:" + i17 + " position:" + d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        int i18 = f2Var.f168802o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        int max = java.lang.Integer.max(i18, d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        f2Var.f168802o = max;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMaxItemIndex$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        f2Var.f168801n = d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMaxItemIndex$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrollStateChanged", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        int d17 = l52.k.d(recyclerView);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.f2 f2Var = this.f168752d;
        int i19 = f2Var.f168802o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        int max = java.lang.Integer.max(i19, d17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        f2Var.f168802o = max;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMaxItemIndex2$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMaxItemIndex$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        f2Var.f168801n = d17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMaxItemIndex$p", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/component/OldVersionUIC$adExposeListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScrolled", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$adExposeListener$1");
    }
}
