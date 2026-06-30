package jb4;

/* loaded from: classes14.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jb4.z f298857d;

    public y(jb4.z zVar) {
        this.f298857d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$3$1");
        jb4.z zVar = this.f298857d;
        zVar.f298860f.V.d(zVar.f298859e);
        com.tencent.mars.xlog.Log.i("SphereImageView.SphereView", "onUpdateImage, isAvailable=" + zVar.f298860f.isAvailable());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageView$3$1");
    }
}
