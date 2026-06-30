package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168751d;

    public c1(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC) {
        this.f168751d = improveMainUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$forceSmoothToPositionWithOffset$1");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = this.f168751d;
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView recycleView = improveMainUIC.getRecycleView();
        int n17 = pc4.d.f353410a.n(improveMainUIC.getContext());
        recycleView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("forceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        recycleView.f1();
        recycleView.r0(0, 0);
        recycleView.g1(1, n17, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("forceScrollToPosition", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRecyclerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$forceSmoothToPositionWithOffset$1");
    }
}
