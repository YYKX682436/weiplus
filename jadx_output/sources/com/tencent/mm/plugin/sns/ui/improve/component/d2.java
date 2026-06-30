package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.f2 f168760d;

    public d2(com.tencent.mm.plugin.sns.ui.improve.component.f2 f2Var) {
        this.f168760d = f2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$onBeforeFinish$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.OldVersionUIC", "exec checkLeakFutureEx");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$releaseBaseAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.improve.component.f2 f2Var = this.f168760d;
        f2Var.Q6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$releaseBaseAdapter", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$releaseBase", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        f2Var.P6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$releaseBase", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$releaseADAbout", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        f2Var.O6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$releaseADAbout", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.OldVersionUIC$onBeforeFinish$1");
    }
}
