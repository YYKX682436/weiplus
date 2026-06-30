package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f164829f;

    public a0(int i17, java.lang.String str, java.util.Map map) {
        this.f164827d = i17;
        this.f164828e = str;
        this.f164829f = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter$reportPageEvent$1");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSNS_MM_LOG_ID$cp", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSNS_MM_LOG_ID$cp", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter");
        ((cy1.a) rVar).Gj(this.f164827d, this.f164828e, this.f164829f, 36244);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.statistics.SnsProfileReporter$reportPageEvent$1");
    }
}
