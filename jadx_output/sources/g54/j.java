package g54;

/* loaded from: classes15.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView f268935d;

    public j(com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView) {
        this.f268935d = adThumbPlayerVideoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners$onInfo$1");
        int i17 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setDelayBufferingAction$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView adThumbPlayerVideoView = this.f268935d;
        adThumbPlayerVideoView.f163032y = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setDelayBufferingAction$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView");
        com.tencent.mm.pluginsdk.ui.tools.b4 a17 = com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView.k(adThumbPlayerVideoView).a();
        if (a17 != null) {
            a17.k(701, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.AdThumbPlayerVideoView$PlayerListeners$onInfo$1");
    }
}
