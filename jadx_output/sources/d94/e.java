package d94;

/* loaded from: classes4.dex */
public class e implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d94.f f227537a;

    public e(d94.f fVar) {
        this.f227537a = fVar;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        d94.f fVar = this.f227537a;
        fVar.f227554q = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        com.tencent.mars.xlog.Log.w("ParticleAnimConfig", "onDownloadError, url=" + fVar.imgUrl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
        d94.f fVar = this.f227537a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        fVar.f227554q = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        com.tencent.mars.xlog.Log.i("ParticleAnimConfig", "onDownloaded, url=" + this.f227537a.imgUrl);
        ((ku5.t0) ku5.t0.f312615d).g(new d94.d(this, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2");
    }
}
