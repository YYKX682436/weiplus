package d94;

/* loaded from: classes4.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f227533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d94.f f227534e;

    public c(d94.f fVar, java.lang.String str) {
        this.f227534e = fVar;
        this.f227533d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$1");
        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(this.f227533d, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        this.f227534e.f227553p = J2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleAnimConfig$1");
    }
}
