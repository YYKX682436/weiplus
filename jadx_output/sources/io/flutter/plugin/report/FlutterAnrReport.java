package io.flutter.plugin.report;

/* loaded from: classes11.dex */
public class FlutterAnrReport {
    private static io.flutter.plugin.report.FlutterAnrReport.ReportCallback callback;

    /* loaded from: classes11.dex */
    public interface ReportCallback {
        void onReport(java.lang.String str, long j17, java.lang.String str2);
    }

    private static void report(java.lang.String str, long j17, java.lang.String str2) {
        io.flutter.plugin.report.FlutterAnrReport.ReportCallback reportCallback = callback;
        if (reportCallback != null) {
            reportCallback.onReport(str, j17, str2);
        }
    }

    public static void setCallback(io.flutter.plugin.report.FlutterAnrReport.ReportCallback reportCallback) {
        callback = reportCallback;
    }
}
