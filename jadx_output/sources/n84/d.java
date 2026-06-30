package n84;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView f335674d;

    public d(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView) {
        this.f335674d = adAlphaPlayerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$12");
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = this.f335674d;
        if (com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.a(adAlphaPlayerView) != null) {
            ((com.tencent.mm.plugin.sns.ui.widget.g0) com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.a(adAlphaPlayerView)).a(adAlphaPlayerView, "opengl component init failed");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$12");
    }
}
