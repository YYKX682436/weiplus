package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f164986f;

    public v(java.lang.String str, java.lang.String str2, java.util.Map map) {
        this.f164984d = str;
        this.f164985e = str2;
        this.f164986f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$reportViewEvent$1");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSNS_MM_LOG_ID$cp", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSNS_MM_LOG_ID$cp", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        ((cy1.a) rVar).Hj(this.f164984d, this.f164985e, this.f164986f, 36244);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$reportViewEvent$1");
    }
}
