package xa4;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final xa4.a f452819a = new xa4.a();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f452820b;

    public final void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
        com.tencent.mm.autogen.mmdata.rpt.SnsActivityPostActionReportStruct snsActivityPostActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsActivityPostActionReportStruct();
        snsActivityPostActionReportStruct.f60433d = i17;
        if (i17 == 3 || i17 == 5) {
            snsActivityPostActionReportStruct.f60434e = snsActivityPostActionReportStruct.b("sessionid", ca4.z0.l(), true);
        }
        snsActivityPostActionReportStruct.k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
    }
}
