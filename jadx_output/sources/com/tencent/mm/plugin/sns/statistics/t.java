package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f164975e;

    public t(java.lang.String str, java.util.Map map) {
        this.f164974d = str;
        this.f164975e = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$reportEvent$1");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSNS_MM_LOG_ID$cp", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSNS_MM_LOG_ID$cp", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        ((cy1.a) rVar).Ej(this.f164974d, this.f164975e, 36244);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$reportEvent$1");
    }
}
