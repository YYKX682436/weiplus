package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC f168739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f168741f;

    public a0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC, android.view.View view, int i17) {
        this.f168739d = improveInputUIC;
        this.f168740e = view;
        this.f168741f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$checkFeedRelocate$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFixScrollUtilMatchViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        this.f168739d.S6(this.f168740e, this.f168741f, true, 5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$checkFeedRelocate$1$1");
    }
}
