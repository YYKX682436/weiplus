package i03;

/* loaded from: classes11.dex */
public final class c implements io.flutter.plugin.report.FlutterSlowRunnerReport.ReportCallback {
    public static final java.lang.String a(i03.c cVar, java.lang.String str, int i17) {
        cVar.getClass();
        java.lang.String u17 = r26.i0.u(str, ',', ' ', false, 4, null);
        if (u17.length() <= i17) {
            return u17;
        }
        java.lang.String substring = u17.substring(0, i17);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }

    @Override // io.flutter.plugin.report.FlutterSlowRunnerReport.ReportCallback
    public void onReport(java.lang.String str, java.lang.String[] strArr, long j17, java.lang.String str2) {
        int Ai;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onReport, runner:");
        sb6.append(str);
        sb6.append(", duration:");
        sb6.append(j17);
        sb6.append(", stackTraces:");
        sb6.append(strArr != null ? java.lang.Integer.valueOf(strArr.length) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterSlowRunnerReport", sb6.toString());
        if (strArr != null) {
            if ((strArr.length == 0) || (Ai = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ai()) == 0) {
                return;
            }
            pm0.v.K(null, new i03.b(str, j17, this, strArr, str2, Ai));
        }
    }
}
