package go0;

/* loaded from: classes13.dex */
public final class r1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go0.s1 f273834d;

    public r1(go0.s1 s1Var) {
        this.f273834d = s1Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        go0.s1 s1Var = this.f273834d;
        int i17 = s1Var.f273847g;
        if (i17 <= 5) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorRendererAnchorFpsLow");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1383L, 0L, 1L);
        } else if (i17 <= 10) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorRendererAnchorFpsMiddle");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1383L, 1L, 1L);
        } else if (i17 > 10) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorRendererAnchorFpsHigh");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1383L, 2L, 1L);
        }
        int i18 = s1Var.f273847g;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorPerformanceIDKeyStat", "markVisitorRendererAnchorFps value is " + i18);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.m(1383, 3, 4, i18, false);
        s1Var.f273847g = 0;
        return true;
    }
}
