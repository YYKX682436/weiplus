package yc4;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final yc4.s f460864a = new yc4.s();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f460865b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f460866c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f460867d = -1;

    static {
        ((ku5.t0) ku5.t0.f312615d).g(yc4.r.f460863d);
    }

    public final void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("check", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        java.util.HashMap hashMap = f460865b;
        if (!hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            hashMap.put(java.lang.Integer.valueOf(i17), new com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("check", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
    }

    public final void b(int i17, long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillContentCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        a(i17);
        com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct snsMethodReportStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct) f460865b.get(java.lang.Integer.valueOf(i17));
        if (snsMethodReportStruct != null) {
            snsMethodReportStruct.f60614g = (int) j17;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillContentCost", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
    }

    public final void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct snsMethodReportStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct) f460865b.remove(java.lang.Integer.valueOf(i17));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_method_report, false)) {
            if (snsMethodReportStruct != null) {
                snsMethodReportStruct.f60611d = snsMethodReportStruct.b("CpuInfo", f460866c, true);
            }
            if (snsMethodReportStruct != null) {
                snsMethodReportStruct.f60617j = f460867d;
            }
            if (snsMethodReportStruct != null) {
                snsMethodReportStruct.f60619l = 1;
            }
            if (snsMethodReportStruct != null) {
                snsMethodReportStruct.k();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
    }

    public final void d(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        a(i17);
        com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct snsMethodReportStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct) f460865b.get(java.lang.Integer.valueOf(i17));
        if (snsMethodReportStruct != null) {
            snsMethodReportStruct.f60618k = z17 ? 1 : 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
    }

    public final void e(int i17, java.lang.String name) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
        kotlin.jvm.internal.o.g(name, "name");
        a(i17);
        com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct snsMethodReportStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct) f460865b.get(java.lang.Integer.valueOf(i17));
        if (snsMethodReportStruct != null) {
            snsMethodReportStruct.f60612e = snsMethodReportStruct.b("FeedType", name, true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setName", "com.tencent.mm.plugin.sns.ui.improve.report.ImproveSnsMethodReport");
    }
}
