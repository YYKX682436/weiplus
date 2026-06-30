package com.tencent.qqmusic.mediaplayer.perf;

/* loaded from: classes13.dex */
public class PerformanceTracer {
    private com.tencent.qqmusic.mediaplayer.upstream.IDataSource dataSource;
    private long totalPcmInByte;
    private final java.util.Map<java.lang.String, com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck> speedMap = new java.util.LinkedHashMap();
    private long lastTimeStampNanoSecond = 0;
    private long playStartTimestampNanoSec = 0;
    private long totalTimeCostInNanoSec = 0;

    /* loaded from: classes8.dex */
    public static class BufferSizeCheck {
        private final java.lang.String name;
        private int sizeMismatchCount = 0;
        private int lastSize = 0;
        private int maxMismatch = 0;

        public BufferSizeCheck(java.lang.String str) {
            this.name = str;
        }

        public int getMaxMismatch() {
            return this.maxMismatch;
        }

        public java.lang.String getName() {
            return this.name;
        }

        public int getSizeMismatchCount() {
            return this.sizeMismatchCount;
        }

        public void onEnd(int i17) {
            int i18 = this.lastSize;
            if (i17 != i18) {
                int i19 = i18 - i17;
                if (java.lang.Math.abs(i19) > this.maxMismatch) {
                    this.maxMismatch = i19;
                }
                this.sizeMismatchCount++;
            }
        }

        public void onStart(int i17) {
            this.lastSize = i17;
        }
    }

    /* loaded from: classes13.dex */
    public static class OverallInfo {
        final com.tencent.qqmusic.mediaplayer.upstream.IDataSource dataSource;
        final long timeCostInMs;
        final long totalPcmToBePlayed;

        public OverallInfo(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource, long j17, long j18) {
            this.dataSource = iDataSource;
            this.timeCostInMs = j17;
            this.totalPcmToBePlayed = j18;
        }
    }

    /* loaded from: classes13.dex */
    public static class SpeedCheck {

        /* renamed from: f, reason: collision with root package name */
        private static final double f215254f = 1000000.0d;
        private double avg;
        private double max;
        private double min;
        private final java.lang.String name;
        private long totalBufferLength;
        private long totalTimeNanoSecond;

        /* JADX INFO: Access modifiers changed from: private */
        public void compute() {
            this.avg = (this.totalBufferLength * f215254f) / this.totalTimeNanoSecond;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void update(int i17, long j17) {
            this.totalBufferLength += i17;
            this.totalTimeNanoSecond += j17;
            double d17 = (i17 * f215254f) / j17;
            double d18 = this.max;
            if (d17 > d18 || d18 == 0.0d) {
                this.max = d17;
                return;
            }
            double d19 = this.min;
            if (d17 < d19 || d19 == 0.0d) {
                this.min = d17;
            }
        }

        public double getAvg() {
            return this.avg;
        }

        public double getMax() {
            return this.max;
        }

        public double getMin() {
            return this.min;
        }

        public java.lang.String getName() {
            return this.name;
        }

        public long getTotalBufferLength() {
            return this.totalBufferLength;
        }

        public long getTotalTimeMs() {
            return java.lang.Math.round(this.totalTimeNanoSecond / f215254f);
        }

        public void reset() {
            this.avg = 0.0d;
            this.max = 0.0d;
            this.min = 0.0d;
            this.totalTimeNanoSecond = 0L;
            this.totalBufferLength = 0L;
        }

        public java.lang.String toString() {
            compute();
            return java.lang.String.format(java.util.Locale.getDefault(), "%10s%15.2f%15.2f%15.2f%10d%15d", this.name, java.lang.Double.valueOf(this.avg), java.lang.Double.valueOf(this.max), java.lang.Double.valueOf(this.min), java.lang.Long.valueOf(this.totalTimeNanoSecond), java.lang.Long.valueOf(this.totalBufferLength));
        }

        private SpeedCheck(java.lang.String str) {
            this.name = str;
        }
    }

    /* loaded from: classes13.dex */
    public interface Visitor {
        void visitSpeedCheck(java.util.List<com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck> list, com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.OverallInfo overallInfo);
    }

    private com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck getSpeedCheck(java.lang.String str) {
        com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck speedCheck = this.speedMap.get(str);
        if (speedCheck != null) {
            return speedCheck;
        }
        com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck speedCheck2 = new com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck(str);
        this.speedMap.put(str, speedCheck2);
        return speedCheck2;
    }

    public void accept(com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.Visitor visitor) {
        java.util.ArrayList arrayList = new java.util.ArrayList(this.speedMap.values());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck) it.next()).compute();
        }
        visitor.visitSpeedCheck(arrayList, new com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.OverallInfo(this.dataSource, java.lang.Math.round(this.totalTimeCostInNanoSec / 1000000.0d), this.totalPcmInByte));
    }

    public void end(java.lang.String str, int i17) {
        getSpeedCheck(str).update(i17, java.lang.System.nanoTime() - this.lastTimeStampNanoSecond);
    }

    public void init(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        this.dataSource = iDataSource;
        this.lastTimeStampNanoSecond = 0L;
        java.util.Iterator<com.tencent.qqmusic.mediaplayer.perf.PerformanceTracer.SpeedCheck> it = this.speedMap.values().iterator();
        while (it.hasNext()) {
            it.next().reset();
        }
    }

    public void playEnd() {
    }

    public void playStart() {
        this.totalPcmInByte = 0L;
    }

    public void roundEnd(int i17) {
        this.totalPcmInByte += i17;
        this.totalTimeCostInNanoSec += java.lang.System.nanoTime() - this.playStartTimestampNanoSec;
    }

    public void roundStart() {
        this.playStartTimestampNanoSec = java.lang.System.nanoTime();
    }

    public void start(java.lang.String str) {
        getSpeedCheck(str);
        this.lastTimeStampNanoSecond = java.lang.System.nanoTime();
    }
}
