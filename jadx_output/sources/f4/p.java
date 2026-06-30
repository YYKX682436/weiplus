package f4;

/* loaded from: classes15.dex */
public final class p extends f4.o {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(f4.i jankStats, android.view.View view, android.view.Window window) {
        super(jankStats, view, window);
        kotlin.jvm.internal.o.g(jankStats, "jankStats");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(window, "window");
    }

    @Override // f4.n
    public long b(android.view.FrameMetrics metrics) {
        kotlin.jvm.internal.o.g(metrics, "metrics");
        return metrics.getMetric(13);
    }

    @Override // f4.n
    public f4.e c(long j17, long j18, android.view.FrameMetrics frameMetrics) {
        kotlin.jvm.internal.o.g(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
        long j19 = j17 + metric;
        this.f259401h = j19;
        f4.u uVar = this.f259394d.f259404a;
        return new f4.f(j17, metric, frameMetrics.getMetric(6) + metric + frameMetrics.getMetric(7), frameMetrics.getMetric(8) - frameMetrics.getMetric(13), metric > j18, uVar != null ? uVar.c(j17, j19) : kz5.p0.f313996d);
    }
}
