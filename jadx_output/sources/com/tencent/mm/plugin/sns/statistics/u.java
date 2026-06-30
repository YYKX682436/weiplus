package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f164978f;

    public u(int i17, java.lang.String str, java.util.Map map) {
        this.f164976d = i17;
        this.f164977e = str;
        this.f164978f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$reportPageEvent$1");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSNS_MM_LOG_ID$cp", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSNS_MM_LOG_ID$cp", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter");
        ((cy1.a) rVar).Gj(this.f164976d, this.f164977e, this.f164978f, 36244);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsNewReporter$reportPageEvent$1");
    }
}
