package com.tencent.tavkit.report;

/* loaded from: classes16.dex */
public class FilterChainReportSession {
    private static com.tencent.tavkit.report.FilterChainReportSession.IReporter reporter;
    private java.util.Map<java.lang.String, com.tencent.tavkit.report.FilterChainReportSession.TimeConsumer> timeConsumerMap = new java.util.HashMap();

    /* loaded from: classes16.dex */
    public interface IReporter {
        void onCommit(java.util.Map<java.lang.String, java.lang.Long> map);
    }

    /* loaded from: classes16.dex */
    public static class TimeConsumer {
        private final java.lang.String key;
        private long totalUs = 0;
        private long count = 0;

        public TimeConsumer(java.lang.String str) {
            this.key = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getAvgTimeUs() {
            long j17 = this.count;
            if (j17 == 0) {
                return 0L;
            }
            return this.totalUs / j17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void tick(long j17) {
            this.totalUs += j17;
            this.count++;
        }
    }

    public static synchronized void setReporter(com.tencent.tavkit.report.FilterChainReportSession.IReporter iReporter) {
        synchronized (com.tencent.tavkit.report.FilterChainReportSession.class) {
            reporter = iReporter;
        }
    }

    public void commit() {
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.tencent.tavkit.report.FilterChainReportSession.TimeConsumer timeConsumer : this.timeConsumerMap.values()) {
            if (timeConsumer != null) {
                hashMap.put(timeConsumer.key, java.lang.Long.valueOf(timeConsumer.getAvgTimeUs()));
            }
        }
        synchronized (com.tencent.tavkit.report.FilterChainReportSession.class) {
            com.tencent.tavkit.report.FilterChainReportSession.IReporter iReporter = reporter;
            if (iReporter != null) {
                iReporter.onCommit(hashMap);
            }
        }
    }

    public void tick(java.lang.String str, long j17) {
        com.tencent.tavkit.report.FilterChainReportSession.TimeConsumer timeConsumer = this.timeConsumerMap.get(str);
        if (timeConsumer == null) {
            timeConsumer = new com.tencent.tavkit.report.FilterChainReportSession.TimeConsumer(str);
            this.timeConsumerMap.put(timeConsumer.key, timeConsumer);
        }
        timeConsumer.tick(j17 / 1000);
    }
}
