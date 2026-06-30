package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public class n0 implements e62.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.statistics.s0 f164913a;

    public n0(com.tencent.mm.plugin.sns.statistics.s0 s0Var) {
        this.f164913a = s0Var;
    }

    @Override // e62.e
    public void a(java.lang.Object obj, l52.g gVar, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDisappear", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDisappear", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3");
    }

    @Override // e62.e
    public void b(java.lang.Object obj, l52.g gVar, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAppear", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3");
        ((ku5.t0) ku5.t0.f312615d).r(new com.tencent.mm.plugin.sns.statistics.m0(this, gVar), "sns_feed_expose_tag");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAppear", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper$3");
    }
}
