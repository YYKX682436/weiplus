package j0;

/* loaded from: classes16.dex */
public final class k5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final j0.k5 f296418d = new j0.k5();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil$markExitTimeline$1");
        com.tencent.mm.sdk.platformtools.o4.J("mmkv_report_16242", gm0.j1.b().h(), 1).B("MicroMsg.SnsReportUtil", com.tencent.mm.plugin.sns.model.l4.Fj().h2(0L, 1, true));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil$markExitTimeline$1");
    }
}
