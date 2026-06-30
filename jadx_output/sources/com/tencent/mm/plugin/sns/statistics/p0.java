package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.statistics.s0 f164926d;

    public p0(com.tencent.mm.plugin.sns.statistics.s0 s0Var) {
        this.f164926d = s0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$5");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = this.f164926d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.util.HashSet hashSet = s0Var.f164954h0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        synchronized (hashSet) {
            try {
                com.tencent.mm.plugin.sns.statistics.s0 s0Var2 = this.f164926d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                java.util.HashSet hashSet2 = s0Var2.f164954h0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                hashSet2.clear();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$5");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.statistics.s0 s0Var3 = this.f164926d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.lang.String str = s0Var3.f164946d0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        s0Var3.f164944c0 = str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var4 = this.f164926d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1002", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        s0Var4.f164952g0 = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1002", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_SNS_EXPOSE_LAST_FEED_STRING;
        com.tencent.mm.plugin.sns.statistics.s0 s0Var5 = this.f164926d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.lang.String str2 = s0Var5.f164944c0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        c17.x(u3Var, str2);
        com.tencent.mm.plugin.sns.statistics.s0 s0Var6 = this.f164926d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.lang.String str3 = s0Var6.f164944c0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var7 = this.f164926d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        java.lang.String str4 = s0Var7.f164946d0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportHelper", "push exit sns timeline event lastExitSnsLastFeedId[%s] currExposeFeedId[%s]", str3, str4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$5");
    }
}
