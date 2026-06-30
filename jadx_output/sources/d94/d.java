package d94;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d94.e f227536e;

    public d(d94.e eVar, java.lang.String str) {
        this.f227536e = eVar;
        this.f227535d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2$1");
        d94.f fVar = this.f227536e.f227537a;
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f227535d, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        fVar.f227553p = J2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$2$1");
    }
}
