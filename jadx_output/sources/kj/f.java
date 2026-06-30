package kj;

/* loaded from: classes12.dex */
public class f implements android.view.Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public float f308210a;

    /* renamed from: b, reason: collision with root package name */
    public float f308211b;

    /* renamed from: c, reason: collision with root package name */
    public int f308212c;

    /* renamed from: d, reason: collision with root package name */
    public int f308213d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f308214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kj.m f308215f;

    public f(kj.m mVar) {
        this.f308215f = mVar;
        float f17 = kj.m.f308242x;
        this.f308210a = f17;
        this.f308211b = (mVar.f308247i / 60.0f) * f17;
        this.f308212c = -1;
        this.f308213d = -1;
        this.f308214e = null;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public void onFrameMetricsAvailable(android.view.Window window, android.view.FrameMetrics frameMetrics, int i17) {
        this.f308215f.getClass();
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        if (com.tencent.matrix.lifecycle.owners.f0.f52739u) {
            for (int i18 = 0; i18 <= 8; i18++) {
                long metric = frameMetrics.getMetric(kj.i.f308219e[i18]);
                if (metric < 0 || metric >= 4611686018427387903L) {
                    return;
                }
            }
            android.view.FrameMetrics frameMetrics2 = new android.view.FrameMetrics(frameMetrics);
            if (this.f308214e == null) {
                this.f308214e = window.getAttributes();
            }
            int i19 = this.f308214e.preferredDisplayModeId;
            int i27 = this.f308212c;
            kj.m mVar = this.f308215f;
            if (i19 != i27 || this.f308213d != mVar.f308247i) {
                this.f308212c = i19;
                this.f308213d = mVar.f308247i;
                float j17 = mVar.j(window);
                this.f308210a = j17;
                this.f308211b = (mVar.f308247i / 60.0f) * j17;
            }
            long metric2 = frameMetrics2.getMetric(8);
            float f17 = 1.0E9f / this.f308210a;
            float max = java.lang.Math.max(0.0f, (((float) metric2) - f17) / f17);
            kj.m mVar2 = this.f308215f;
            mVar2.f308243e += max;
            jj.b bVar = mVar2.f308246h;
            if (bVar != null && max >= this.f308211b) {
                ((jr0.d) bVar).a(com.tencent.matrix.lifecycle.owners.f0.f52740v, frameMetrics2, max, this.f308210a);
            }
            synchronized (this.f308215f.f308248m) {
                java.util.Iterator it = this.f308215f.f308248m.iterator();
                while (it.hasNext()) {
                    ((jj.c) it.next()).a(com.tencent.matrix.lifecycle.owners.f0.f52740v, frameMetrics2, max, this.f308210a);
                }
            }
        }
    }
}
