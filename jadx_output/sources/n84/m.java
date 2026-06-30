package n84;

/* loaded from: classes4.dex */
public class m implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView f335684d;

    public m(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView) {
        this.f335684d = adAlphaPlayerView;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnCompletionListener
    public void onCompletion(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$4");
        n84.w.e("AdAlphaPlayerView", "onCompletion");
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = this.f335684d;
        if (com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.a(adAlphaPlayerView) != null) {
            ((com.tencent.mm.plugin.sns.ui.widget.g0) com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.a(adAlphaPlayerView)).b(5);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCompletion", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$4");
    }
}
