package n84;

/* loaded from: classes4.dex */
public class b implements com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.c f335671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView f335672e;

    public b(com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView, kk4.c cVar) {
        this.f335672e = adAlphaPlayerView;
        this.f335671d = cVar;
    }

    @Override // com.tencent.thumbplayer.api.ITPPlayerListener.IOnPreparedListener
    public void onPrepared(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$10");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onGLComponentsInited: videosize(");
        kk4.f0 f0Var = (kk4.f0) this.f335671d;
        sb6.append(f0Var.getVideoWidth());
        sb6.append(", ");
        sb6.append(f0Var.getVideoHeight());
        sb6.append(")");
        n84.w.e("AdAlphaPlayerView", sb6.toString());
        int i17 = com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView.f163477u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = this.f335672e;
        adAlphaPlayerView.f163485n = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$602", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        m3.a aVar = adAlphaPlayerView.f163487p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        if (aVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            m3.a aVar2 = adAlphaPlayerView.f163487p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            aVar2.accept(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$702", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            adAlphaPlayerView.f163487p = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$702", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView$10");
    }
}
