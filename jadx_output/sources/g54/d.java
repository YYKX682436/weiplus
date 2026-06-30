package g54;

/* loaded from: classes4.dex */
public class d implements com.tencent.mm.pluginsdk.ui.b1, com.tencent.mm.pluginsdk.ui.d1 {
    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mars.xlog.Log.i("AdMMVideoViewCallback", "the video end, " + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mars.xlog.Log.i("AdMMVideoViewCallback", "the video error!!, " + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mars.xlog.Log.i("AdMMVideoViewCallback", "the onPlayProgress : " + i17 + " s");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    @Override // com.tencent.mm.pluginsdk.ui.d1
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mars.xlog.Log.i("AdMMVideoViewCallback", "the video onLoopCompletion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mars.xlog.Log.i("AdMMVideoViewCallback", "the video paused, " + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mars.xlog.Log.i("AdMMVideoViewCallback", "the video play, " + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mars.xlog.Log.i("AdMMVideoViewCallback", "the video prepared, " + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
        com.tencent.mars.xlog.Log.i("AdMMVideoViewCallback", "onGetVideoPlayFps, " + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdMMVideoViewCallback");
    }
}
