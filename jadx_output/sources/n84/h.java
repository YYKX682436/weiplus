package n84;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView f335678d;

    public h(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView) {
        this.f335678d = adAlphaPlayerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$16");
        try {
            com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = this.f335678d;
            int i17 = com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.f163477u;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            com.tencent.mm.sdk.platformtools.b4 b4Var = adAlphaPlayerView.f163491t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            b4Var.d();
            com.tencent.mars.xlog.Log.i("AdAlphaPlayerView", "stopTimer");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdAlphaPlayerView", "stopTimer error is " + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$16");
    }
}
