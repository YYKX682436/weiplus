package n84;

/* loaded from: classes4.dex */
public class n implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener {
    public n(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView) {
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnVideoSizeChangedListener
    public void onVideoSizeChanged(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$5");
        n84.w.a("AdAlphaPlayerView", "onVideoSizeChanged() called with: player = [" + iTPPlayer + "], width = [" + j17 + "], height = [" + j18 + "]");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoSizeChanged", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$5");
    }
}
