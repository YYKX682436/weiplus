package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.statistics.l0 f164868d;

    public k0(com.tencent.mm.plugin.sns.statistics.l0 l0Var) {
        this.f164868d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$1$1");
        com.tencent.mm.plugin.sns.statistics.l0 l0Var = this.f164868d;
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = l0Var.f164896e;
        java.lang.Integer num = com.tencent.mm.plugin.sns.statistics.s0.f164936j0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.util.LinkedHashMap linkedHashMap = s0Var.f164947e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = l0Var.f164896e;
        java.util.LinkedHashMap linkedHashMap2 = l0Var.f164895d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        s0Var2.f164947e = linkedHashMap2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        linkedHashMap.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$1$1");
    }
}
