package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l52.g f164906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.statistics.n0 f164907e;

    public m0(com.tencent.mm.plugin.sns.statistics.n0 n0Var, l52.g gVar) {
        this.f164907e = n0Var;
        this.f164906d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        int size;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3$1");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = this.f164907e.f164913a;
        java.lang.String str = this.f164906d.f316607a.f382838d;
        java.lang.Integer num = com.tencent.mm.plugin.sns.statistics.s0.f164936j0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        s0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exposeSnsFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        s0Var.f164946d0 = str;
        synchronized (s0Var.f164954h0) {
            try {
                s0Var.f164954h0.add(str);
                size = s0Var.f164954h0.size();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposeSnsFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkIsExposeLastSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        if (s0Var.f164948e0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsExposeLastSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(s0Var.f164944c0) && com.tencent.mm.sdk.platformtools.t8.D0(s0Var.f164944c0, str)) {
                s0Var.E(3);
                s0Var.f164948e0 = true;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsExposeLastSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkIsPushExposeSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        int i18 = s0Var.f164950f0;
        if (i18 > 0 && (i17 = size / i18) > s0Var.f164952g0) {
            s0Var.f164952g0 = i17;
            s0Var.E(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIsPushExposeSnsFeedEvent", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exposeSnsFeed", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3$1");
    }
}
