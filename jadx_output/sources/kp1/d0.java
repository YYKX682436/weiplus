package kp1;

/* loaded from: classes11.dex */
public final class d0 extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 f310892d;

    public d0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2) {
        this.f310892d = audioPanelTaskBarViewRecommendV2;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        this.f310892d.f93012v = true;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2 = this.f310892d;
        if (audioPanelTaskBarViewRecommendV2.f93012v) {
            audioPanelTaskBarViewRecommendV2.f93012v = false;
            audioPanelTaskBarViewRecommendV2.p(kp1.c0.f310887e);
        }
    }
}
