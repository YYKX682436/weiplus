package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC f168988d;

    public s0(com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC improveMainUIC) {
        this.f168988d = improveMainUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$afterUpdate$1");
        this.f168988d.d7(com.tencent.mm.plugin.sns.ui.improve.component.p0.f168968d, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$afterUpdate$1");
    }
}
