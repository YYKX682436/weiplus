package com.tencent.tavkit.report;

/* loaded from: classes16.dex */
public final class CompositingReportSession {
    private static final int FLUSH_DURATION_THRESHOLD = 10;
    private static final java.lang.String REPORT_EVENT = "android_tavkit_compositing";
    public static final java.lang.String REPORT_KEY_AVG_RENDER_TIME_US = "avg_render_time_us";
    private static final java.lang.String REPORT_SERVICE = "TAVKit_Android";
    private static final java.lang.String REPORT_VERSION = "3.0";
    private static final java.lang.String TAG = "CompositingReportSessio";
    private static com.tencent.tavkit.report.CompositingReportSession.IReporter reporter;
    private final com.tencent.tavkit.report.CompositingReportSession.FilterChainReporter filterChainReporter;
    private float renderHeight;
    private float renderWidth;
    private long beginTimeMs = 0;
    private int successCount = 0;
    private int failureCount = 0;
    private long totalCostUs = 0;

    /* loaded from: classes16.dex */
    public static class FilterChainReporter implements com.tencent.tavkit.report.FilterChainReportSession.IReporter {
        private java.util.Map<java.lang.String, java.lang.Long> values;

        private FilterChainReporter() {
            this.values = new java.util.HashMap();
        }

        @Override // com.tencent.tavkit.report.FilterChainReportSession.IReporter
        public void onCommit(java.util.Map<java.lang.String, java.lang.Long> map) {
            map.putAll(map);
        }
    }

    /* loaded from: classes6.dex */
    public interface IReporter {
        void onCommit(java.util.Map<java.lang.String, java.lang.Long> map, java.util.Map<java.lang.String, java.lang.Long> map2);
    }

    public CompositingReportSession(float f17, float f18) {
        this.renderWidth = f17;
        this.renderHeight = f18;
        com.tencent.tavkit.report.CompositingReportSession.FilterChainReporter filterChainReporter = new com.tencent.tavkit.report.CompositingReportSession.FilterChainReporter();
        this.filterChainReporter = filterChainReporter;
        com.tencent.tavkit.report.FilterChainReportSession.setReporter(filterChainReporter);
    }

    private void commit() {
    }

    private void reset() {
        this.beginTimeMs = 0L;
        this.totalCostUs = 0L;
        this.successCount = 0;
    }

    public static synchronized void setReporter(com.tencent.tavkit.report.CompositingReportSession.IReporter iReporter) {
        synchronized (com.tencent.tavkit.report.CompositingReportSession.class) {
            reporter = iReporter;
        }
    }

    public final void flush() {
        if (this.beginTimeMs == 0) {
            return;
        }
        if (this.successCount >= 10) {
            commit();
        }
        reset();
    }

    public void tickFailed() {
        this.failureCount++;
    }

    public final void tickSuccess(long j17) {
        if (this.beginTimeMs == 0) {
            this.beginTimeMs = java.lang.System.currentTimeMillis() - ((j17 / 1000) / 1000);
        }
        this.successCount++;
        this.totalCostUs += j17 / 1000;
    }
}
