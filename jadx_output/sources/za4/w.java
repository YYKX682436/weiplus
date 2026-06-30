package za4;

/* loaded from: classes4.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ za4.z f471209d;

    public w(za4.z zVar) {
        this.f471209d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2$1");
        za4.e0 e0Var = this.f471209d.f471231a;
        if (e0Var != null) {
            e0Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageDownloadFileHelper$2$1");
    }
}
