package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC f168915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f168917f;

    public i2(com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC, android.view.View view, int i17) {
        this.f168915d = snsWsFoldInputUIC;
        this.f168916e = view;
        this.f168917f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$checkFeedRelocate$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFixScrollUtilMatchViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        this.f168915d.T6(this.f168916e, this.f168917f, true, 5);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFixScrollUtilMatchViewBottom$default", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$checkFeedRelocate$1$1");
    }
}
