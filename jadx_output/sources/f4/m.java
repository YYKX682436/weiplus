package f4;

/* loaded from: classes15.dex */
public final class m implements android.view.Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f4.n f259395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f4.i f259396b;

    public m(f4.n nVar, f4.i iVar) {
        this.f259395a = nVar;
        this.f259396b = iVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int i17) {
        kotlin.jvm.internal.o.d(frameMetrics);
        f4.n nVar = this.f259395a;
        long max = java.lang.Math.max(nVar.d(frameMetrics), nVar.f259401h);
        if (max < nVar.f259400g || max == nVar.f259399f) {
            return;
        }
        float b17 = (float) nVar.b(frameMetrics);
        f4.i iVar = this.f259396b;
        f4.e c17 = this.f259395a.c(max, b17 * iVar.f259391d, frameMetrics);
        c17.f259384f = frameMetrics;
        iVar.f259388a.execute(new f4.h(iVar, c17));
        nVar.f259399f = max;
    }
}
