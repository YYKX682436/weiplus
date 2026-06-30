package kp1;

/* loaded from: classes11.dex */
public final class j0 implements qk.v8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 f310913a;

    public j0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2) {
        this.f310913a = audioPanelTaskBarViewRecommendV2;
    }

    public void a(bw5.ac0 ac0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSyncResult headerOpen: false, isBackground: ");
        int i17 = com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2.B;
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2 = this.f310913a;
        audioPanelTaskBarViewRecommendV2.getClass();
        sb6.append(audioPanelTaskBarViewRecommendV2.f93012v);
        sb6.append(", syncItem: ");
        sb6.append(ac0Var != null ? ac0Var.b() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendV2", sb6.toString());
        audioPanelTaskBarViewRecommendV2.f93014x = ac0Var != null ? ac0Var.b() : null;
        ef0.m3 m3Var = (ef0.m3) ((qk.w8) i95.n0.c(qk.w8.class));
        java.lang.String str = m3Var.f252276f;
        if (str == null) {
            str = gm4.a.f273557a.e("ting_listen_sync_session_buffer", null);
            m3Var.f252276f = str;
        }
        audioPanelTaskBarViewRecommendV2.f93015y = str;
        pm0.v.X(new kp1.m0(audioPanelTaskBarViewRecommendV2));
    }
}
