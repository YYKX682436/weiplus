package n84;

/* loaded from: classes4.dex */
public class l implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView f335683d;

    public l(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView) {
        this.f335683d = adAlphaPlayerView;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnErrorListener
    public void onError(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, int i17, int i18, long j17, long j18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$3");
        n84.w.b("AdAlphaPlayerView", "onError() called with: player = [" + iTPPlayer + "], errorType = [" + i17 + "], errorCode = [" + i18 + "], arg1 = [" + j17 + "], arg2 = [" + j18 + "]");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1913, 3);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("arg1=");
        sb6.append(j17);
        sb6.append("|arg2=");
        sb6.append(j18);
        sb6.append("|");
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = this.f335683d;
        int i19 = com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.f163477u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        java.lang.String str = adAlphaPlayerView.f163488q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        sb6.append(str);
        ca4.e0.b("break_video_error_info", "1", i17, i18, sb6.toString());
        ((ku5.t0) ku5.t0.f312615d).B(new n84.k(this));
        this.f335683d.h();
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView2 = this.f335683d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        n84.v vVar = adAlphaPlayerView2.f163478d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (vVar != null) {
            com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView3 = this.f335683d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            n84.v vVar2 = adAlphaPlayerView3.f163478d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            vVar2.d();
        }
        try {
            kk4.c cVar = this.f335683d.f163479e;
            if (cVar != null) {
                ((kk4.f0) cVar).stopAsync();
                ((kk4.f0) this.f335683d.f163479e).release();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$3");
    }
}
