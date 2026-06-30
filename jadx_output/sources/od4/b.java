package od4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final od4.b f344648a = new od4.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f344649b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f344650c = "";

    /* renamed from: d, reason: collision with root package name */
    public static int f344651d = -1;

    static {
        ((ku5.t0) ku5.t0.f312615d).g(od4.a.f344647d);
    }

    public final void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct snsMethodReportStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct) f344649b.remove(java.lang.Integer.valueOf(i17));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_method_report, false)) {
            if (snsMethodReportStruct != null) {
                snsMethodReportStruct.f60611d = snsMethodReportStruct.b("CpuInfo", f344650c, true);
            }
            if (snsMethodReportStruct != null) {
                snsMethodReportStruct.f60617j = f344651d;
            }
            if (snsMethodReportStruct != null) {
                snsMethodReportStruct.f60619l = 2;
            }
            if (snsMethodReportStruct != null) {
                snsMethodReportStruct.k();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
    }

    public final void b(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
        com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct snsMethodReportStruct = (com.tencent.mm.autogen.mmdata.rpt.SnsMethodReportStruct) f344649b.get(java.lang.Integer.valueOf(i17));
        if (snsMethodReportStruct != null) {
            snsMethodReportStruct.f60618k = z17 ? 1 : 2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.item.improve.report.SnsMethodReport");
    }
}
