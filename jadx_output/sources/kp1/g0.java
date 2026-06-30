package kp1;

/* loaded from: classes11.dex */
public final class g0 implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 f310902d;

    public g0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2) {
        this.f310902d = audioPanelTaskBarViewRecommendV2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendV2 audioPanelTaskBarViewRecommendV2 = this.f310902d;
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
        return jz5.f0.f302826a;
    }
}
