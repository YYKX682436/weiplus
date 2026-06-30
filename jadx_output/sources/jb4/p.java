package jb4;

/* loaded from: classes4.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jb4.q f298833d;

    public p(jb4.q qVar) {
        this.f298833d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1$1");
        jb4.q qVar = this.f298833d;
        jb4.u uVar = qVar.f298838e.f298852a;
        if (uVar != null) {
            uVar.a(false, "onDownloadError", null, qVar.f298834a);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.SphereImageLoader$1$1");
    }
}
