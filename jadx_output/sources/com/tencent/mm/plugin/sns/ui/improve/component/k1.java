package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168928d;

    public k1(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC) {
        this.f168928d = improveMainUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleToolBarDoubleClick$1");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = this.f168928d;
        if (improveMainUIC.a7()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getHeaderUIC$p", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getHeaderUIC$p", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            improveMainUIC.f168705q.showNormalHeader();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDataUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC X6 = improveMainUIC.X6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDataUIC", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
            X6.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeToNormalData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            X6.T6().d7(com.tencent.mm.plugin.sns.ui.improve.component.p0.f168968d, false);
            com.tencent.mm.plugin.mvvmlist.MvvmList S6 = X6.S6();
            lc4.e eVar = lc4.e.f317960d;
            S6.getClass();
            v65.i.b(S6.f152060g, null, new xm3.i0(eVar, S6, false, null), 1, null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeToNormalData", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC");
            improveMainUIC.getRecycleView().getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.sns.ui.improve.component.i1(improveMainUIC));
        } else {
            if (improveMainUIC.getLayoutManager().w() > 5) {
                com.tencent.mm.plugin.sns.ui.improve.view.ImproveLayoutManager layoutManager = improveMainUIC.getLayoutManager();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(layoutManager, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$handleToolBarDoubleClick$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                layoutManager.scrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(layoutManager, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$handleToolBarDoubleClick$1", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView recycleView = improveMainUIC.getRecycleView();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(recycleView, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$handleToolBarDoubleClick$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recycleView.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(recycleView, "com/tencent/mm/plugin/sns/ui/improve/component/ImproveMainUIC$handleToolBarDoubleClick$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
        improveMainUIC.getRecycleView().i(new com.tencent.mm.plugin.sns.ui.improve.component.j1(improveMainUIC));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleToolBarDoubleClick$1");
    }
}
