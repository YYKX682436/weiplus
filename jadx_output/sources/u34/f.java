package u34;

/* loaded from: classes4.dex */
public class f implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f424421a;

    public f(u34.g gVar, java.lang.String str) {
        this.f424421a = str;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene$2");
        com.tencent.mars.xlog.Log.e("RandomSpriteAnimScene", "doDownloadSpriteImg img err, url=" + this.f424421a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene$2");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene$2");
    }
}
