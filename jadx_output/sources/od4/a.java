package od4;

/* loaded from: classes4.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final od4.a f344647d = new od4.a();

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport$1");
        java.util.Map e17 = wo.w0.e();
        od4.b bVar = od4.b.f344648a;
        java.lang.String str = (java.lang.String) ((java.util.HashMap) e17).get("hardware");
        java.lang.String t17 = str != null ? r26.i0.t(str, ",", ";", false) : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setCpuName$p", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        od4.b.f344650c = t17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setCpuName$p", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get cpu name:");
        od4.b bVar2 = od4.b.f344648a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        java.lang.String str2 = od4.b.f344650c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCpuName", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMethodReport", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport$1");
    }
}
