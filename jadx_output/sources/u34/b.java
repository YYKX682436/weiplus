package u34;

/* loaded from: classes4.dex */
public final class b implements ym5.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u34.d f424407a;

    public b(u34.d dVar) {
        this.f424407a = dVar;
    }

    @Override // ym5.v1
    public void onFlush() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPagUpdateListener$1");
        u34.d dVar = this.f424407a;
        dVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        long j17 = dVar.f424417i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        if (j17 == 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            dVar.f424417i = currentTimeMillis;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        int i17 = dVar.f424416h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        dVar.f424416h = i17 + 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        int i18 = dVar.f424416h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        if (i18 >= 30) {
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            long j18 = dVar.f424417i;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            long j19 = currentTimeMillis2 - j18;
            if (j19 != 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                int i19 = dVar.f424416h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                float f17 = (i19 * 1000.0f) / ((float) j19);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                int i27 = dVar.f424418j;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                if (f17 < i27) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                    dVar.f424418j = (int) f17;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            dVar.f424416h = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMFrameCount", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            dVar.f424417i = 0L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMFrameStartTime", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlush", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPagUpdateListener$1");
    }
}
