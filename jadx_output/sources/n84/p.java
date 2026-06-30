package n84;

/* loaded from: classes4.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView f335686d;

    public p(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView) {
        this.f335686d = adAlphaPlayerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7");
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = this.f335686d;
        if (com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.a(adAlphaPlayerView) != null) {
            ((com.tencent.mm.plugin.sns.ui.widget.g0) com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.a(adAlphaPlayerView)).a(adAlphaPlayerView, "init player failed");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$7");
    }
}
