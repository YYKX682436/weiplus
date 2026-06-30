package com.tencent.tav.report;

/* loaded from: classes16.dex */
public class AverageTimeReporter {
    private long total = 0;
    private long count = 0;

    public void add(long j17) {
        this.total += j17;
        this.count++;
    }

    public long average() {
        long j17 = this.count;
        if (j17 == 0) {
            return 0L;
        }
        return this.total / j17;
    }

    public double averageDouble() {
        long j17 = this.count;
        if (j17 == 0) {
            return 0.0d;
        }
        return this.total / j17;
    }

    public long getCount() {
        return this.count;
    }

    public long getTotal() {
        return this.total;
    }

    public void reset() {
        this.total = 0L;
        this.count = 0L;
    }

    public java.lang.String toString() {
        return "AverageTimeReporter{total=" + this.total + ", count=" + this.count + ", average=" + averageDouble() + '}';
    }

    public void add(com.tencent.tav.report.AverageTimeReporter averageTimeReporter) {
        if (averageTimeReporter != null) {
            this.total += averageTimeReporter.getTotal();
            this.count += averageTimeReporter.getCount();
        }
    }
}
