package kp1;

/* loaded from: classes11.dex */
public final class f0 implements gp1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 f310899a;

    public f0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2) {
        this.f310899a = audioPanelTaskBarViewRecommendV2;
    }

    @Override // gp1.m
    public void onEnter() {
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2 = this.f310899a;
        gp1.o onEnterPlayerCallback = audioPanelTaskBarViewRecommendV2.getOnEnterPlayerCallback();
        if (onEnterPlayerCallback != null) {
            ((oh4.a) onEnterPlayerCallback).a();
        }
        qk.e9 e9Var = (qk.e9) i95.n0.c(qk.e9.class);
        bw5.xb0 xb0Var = audioPanelTaskBarViewRecommendV2.f93014x;
        java.lang.String str = audioPanelTaskBarViewRecommendV2.f93015y;
        rk4.p6 p6Var = (rk4.p6) e9Var;
        if (p6Var.Ai()) {
            p6Var.Zi(new rk4.n6(p6Var, xb0Var, str));
        }
    }
}
