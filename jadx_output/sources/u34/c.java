package u34;

/* loaded from: classes4.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u34.d f424408d;

    public c(u34.d dVar) {
        this.f424408d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$startAnim$1");
        com.tencent.mm.view.MMPAGView c17 = u34.d.c(this.f424408d);
        if (c17 != null) {
            c17.g();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$startAnim$1");
    }
}
