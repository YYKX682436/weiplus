package n84;

/* loaded from: classes4.dex */
public class o implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView f335685d;

    public o(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView) {
        this.f335685d = adAlphaPlayerView;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener
    public void onInfo(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, long j17, long j18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onInfo", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$6");
        n84.w.e("AdAlphaPlayerView", "onInfo() called with: player = [" + iTPPlayer + "], what = [" + i17 + "], arg1 = [" + j17 + "], arg2 = [" + j18 + "], extraObject = [" + obj + "]");
        com.tencent.thumbplayer.api.ITPPlayerListener.IOnInfoListener iOnInfoListener = this.f335685d.f163489r;
        if (iOnInfoListener != null) {
            ((com.tencent.mm.plugin.sns.ui.widget.f0) iOnInfoListener).onInfo(iTPPlayer, i17, j17, j18, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onInfo", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$6");
    }
}
