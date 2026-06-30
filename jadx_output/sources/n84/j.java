package n84;

/* loaded from: classes4.dex */
public class j implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.c f335680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView f335681e;

    public j(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView, kk4.c cVar) {
        this.f335681e = adAlphaPlayerView;
        this.f335680d = cVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnStateChangeListener
    public void onStateChange(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStateChange", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$2");
        n84.w.e("AdAlphaPlayerView", "onStateChange() called with: preState = [" + i17 + "], curState = [" + i18 + "]");
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = this.f335681e;
        if (com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.a(adAlphaPlayerView) != null) {
            ((com.tencent.mm.plugin.sns.ui.widget.g0) com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.a(adAlphaPlayerView)).getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayerStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayerStateChange", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$startPrepare$2");
        }
        if (i18 == 4) {
            try {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                boolean z17 = adAlphaPlayerView.f163486o;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                if (z17) {
                    ((kk4.f0) this.f335680d).start();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdAlphaPlayerView", "try start error", th6);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStateChange", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$2");
    }
}
