package yc4;

/* loaded from: classes4.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final yc4.r f460863d = new yc4.r();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport$1");
        java.util.Map e17 = wo.w0.e();
        yc4.s sVar = yc4.s.f460864a;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) e17).get("hardware");
        java.lang.String t17 = str != null ? r26.i0.t(str, ",", ";", false) : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setCpuName$p", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        yc4.s.f460866c = t17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setCpuName$p", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get cpu name:");
        yc4.s sVar2 = yc4.s.f460864a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        java.lang.String str2 = yc4.s.f460866c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMethodReport", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport$1");
    }
}
