package f4;

/* loaded from: classes15.dex */
public class o extends f4.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(f4.i jankStats, android.view.View view, android.view.Window window) {
        super(jankStats, view, window);
        kotlin.jvm.internal.o.g(jankStats, "jankStats");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(window, "window");
    }

    @Override // f4.n
    public long d(android.view.FrameMetrics frameMetrics) {
        kotlin.jvm.internal.o.g(frameMetrics, "frameMetrics");
        return frameMetrics.getMetric(10);
    }
}
