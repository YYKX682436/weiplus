package n84;

/* loaded from: classes4.dex */
public class i implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView f335679d;

    public i(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView) {
        this.f335679d = adAlphaPlayerView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = this.f335679d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$1");
        try {
            if (adAlphaPlayerView.f163490s == null) {
                com.tencent.mars.xlog.Log.e("AdAlphaPlayerView", "onTimerExpired, mProgressListener is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$1");
                return false;
            }
            kk4.c cVar = adAlphaPlayerView.f163479e;
            if (cVar != null) {
                long currentPositionMs = ((kk4.f0) cVar).getCurrentPositionMs();
                com.tencent.mars.xlog.Log.i("AdAlphaPlayerView", "onTimerExpired, onPlayProgress is " + currentPositionMs);
                ((com.tencent.mm.plugin.sns.ui.widget.h0) adAlphaPlayerView.f163490s).a(currentPositionMs);
            } else {
                com.tencent.mars.xlog.Log.w("AdAlphaPlayerView", "onTimerExpired, mPlayer is null, may be created timeout");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$1");
            return true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdAlphaPlayerView", "onTimerExpired error is " + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTimerExpired", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$1");
            return false;
        }
    }
}
