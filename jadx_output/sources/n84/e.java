package n84;

/* loaded from: classes4.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView f335675d;

    public e(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView) {
        this.f335675d = adAlphaPlayerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$13");
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView playerView = this.f335675d;
        if (com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.a(playerView) != null) {
            ((com.tencent.mm.plugin.sns.ui.widget.g0) com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.a(playerView)).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRelease", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
            kotlin.jvm.internal.o.g(playerView, "playerView");
            playerView.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRelease", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$13");
    }
}
