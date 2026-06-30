package io.flutter.plugin.report;

/* loaded from: classes11.dex */
public class FlutterSlowRunnerReport {
    private static io.flutter.plugin.report.FlutterSlowRunnerReport.ReportCallback callback;

    /* loaded from: classes11.dex */
    public interface ReportCallback {
        void onReport(java.lang.String str, java.lang.String[] strArr, long j17, java.lang.String str2);
    }

    private static void report(java.lang.String str, java.lang.String[] strArr, long j17, java.lang.String str2) {
        io.flutter.plugin.report.FlutterSlowRunnerReport.ReportCallback reportCallback = callback;
        if (reportCallback != null) {
            reportCallback.onReport(str, strArr, j17, str2);
        }
    }

    public static void setCallback(io.flutter.plugin.report.FlutterSlowRunnerReport.ReportCallback reportCallback) {
        callback = reportCallback;
    }
}
