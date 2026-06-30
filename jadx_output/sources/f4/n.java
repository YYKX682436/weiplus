package f4;

/* loaded from: classes15.dex */
public class n extends f4.l {

    /* renamed from: j, reason: collision with root package name */
    public static android.os.Handler f259397j;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.Window f259398e;

    /* renamed from: f, reason: collision with root package name */
    public long f259399f;

    /* renamed from: g, reason: collision with root package name */
    public long f259400g;

    /* renamed from: h, reason: collision with root package name */
    public long f259401h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.Window.OnFrameMetricsAvailableListener f259402i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(f4.i jankStats, android.view.View view, android.view.Window window) {
        super(jankStats, view);
        kotlin.jvm.internal.o.g(jankStats, "jankStats");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(window, "window");
        this.f259398e = window;
        this.f259402i = new f4.m(this, jankStats);
    }

    @Override // f4.q
    public void a(boolean z17) {
        java.util.List list;
        android.view.Window.OnFrameMetricsAvailableListener onFrameMetricsAvailableListener = this.f259402i;
        android.view.Window window = this.f259398e;
        if (!z17) {
            f4.a aVar = (f4.a) window.getDecorView().getTag(com.tencent.mm.R.id.jic);
            if (aVar != null && (list = aVar.f259376a) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(list);
                arrayList.remove(onFrameMetricsAvailableListener);
                if (arrayList.isEmpty()) {
                    window.removeOnFrameMetricsAvailableListener(aVar);
                    window.getDecorView().setTag(com.tencent.mm.R.id.jic, null);
                }
                aVar.f259376a = arrayList;
            }
            this.f259400g = 0L;
            return;
        }
        if (this.f259400g == 0) {
            f4.a aVar2 = (f4.a) window.getDecorView().getTag(com.tencent.mm.R.id.jic);
            if (aVar2 == null) {
                f4.a aVar3 = new f4.a(new java.util.ArrayList());
                if (f259397j == null) {
                    android.os.HandlerThread handlerThread = new android.os.HandlerThread("FrameMetricsAggregator");
                    handlerThread.start();
                    f259397j = new android.os.Handler(handlerThread.getLooper());
                }
                window.addOnFrameMetricsAvailableListener(aVar3, f259397j);
                window.getDecorView().setTag(com.tencent.mm.R.id.jic, aVar3);
                aVar2 = aVar3;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.addAll(aVar2.f259376a);
            arrayList2.add(onFrameMetricsAvailableListener);
            aVar2.f259376a = arrayList2;
            this.f259400g = java.lang.System.nanoTime();
        }
    }

    public long b(android.view.FrameMetrics metrics) {
        kotlin.jvm.internal.o.g(metrics, "metrics");
        return f4.c.f259377d.a((android.view.View) this.f259392b.get());
    }

    public f4.e c(long j17, long j18, android.view.FrameMetrics frameMetrics) {
        kotlin.jvm.internal.o.g(frameMetrics, "frameMetrics");
        long metric = frameMetrics.getMetric(0) + frameMetrics.getMetric(1) + frameMetrics.getMetric(2) + frameMetrics.getMetric(3) + frameMetrics.getMetric(4) + frameMetrics.getMetric(5);
        long j19 = j17 + metric;
        this.f259401h = j19;
        f4.u uVar = this.f259394d.f259404a;
        return new f4.e(j17, metric, frameMetrics.getMetric(6) + metric + frameMetrics.getMetric(7), metric > j18, uVar != null ? uVar.c(j17, j19) : kz5.p0.f313996d);
    }

    public long d(android.view.FrameMetrics frameMetrics) {
        kotlin.jvm.internal.o.g(frameMetrics, "frameMetrics");
        java.lang.Object obj = f4.c.f259378e.get(this.f259393c);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Long");
        return ((java.lang.Long) obj).longValue();
    }
}
