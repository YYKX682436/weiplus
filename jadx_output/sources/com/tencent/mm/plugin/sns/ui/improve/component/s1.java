package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168989d;

    public s1(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC) {
        this.f168989d = improveMainUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$showEndLineView$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC = this.f168989d;
        com.tencent.mm.plugin.sns.ui.improve.component.h2 U6 = improveMainUIC.U6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        android.view.KeyEvent.Callback findViewByPosition = improveMainUIC.getLayoutManager().findViewByPosition(U6.getData().size());
        if (findViewByPosition instanceof tc4.s0) {
            ((tc4.s0) findViewByPosition).a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getBottomLoadingView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView W6 = improveMainUIC.W6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getBottomLoadingView", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC");
        int i17 = com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView.f169150g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showEndLine$default", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        W6.a(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEndLine$default", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$showEndLineView$1");
    }
}
