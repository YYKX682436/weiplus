package i03;

/* loaded from: classes11.dex */
public class a implements io.flutter.plugin.report.FlutterAnrReport.ReportCallback {
    @Override // io.flutter.plugin.report.FlutterAnrReport.ReportCallback
    public void onReport(java.lang.String str, long j17, java.lang.String str2) {
        int Ai;
        if (gm0.j1.a() && (Ai = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ai()) != 0) {
            com.tencent.mm.autogen.mmdata.rpt.FlutterAnrReportStruct flutterAnrReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FlutterAnrReportStruct();
            flutterAnrReportStruct.f58134d = flutterAnrReportStruct.b("StackTrace", str, true);
            flutterAnrReportStruct.f58135e = j17;
            flutterAnrReportStruct.f58136f = Ai;
            flutterAnrReportStruct.f58137g = flutterAnrReportStruct.b("Revision", a03.h.a(), true);
            flutterAnrReportStruct.f58138h = flutterAnrReportStruct.b("Phase", str2, true);
            flutterAnrReportStruct.f58139i = flutterAnrReportStruct.b("rev", com.tencent.mm.sdk.platformtools.z.f193109e, true);
            flutterAnrReportStruct.k();
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterAnrReport", "ANR happened\n" + flutterAnrReportStruct.n());
        }
    }
}
