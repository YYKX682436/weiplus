package kp1;

/* loaded from: classes11.dex */
public final class e1 implements gp1.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f310896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 f310897b;

    public e1(boolean z17, com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV5 audioPanelTaskBarViewV5) {
        this.f310896a = z17;
        this.f310897b = audioPanelTaskBarViewV5;
    }

    @Override // gp1.m
    public void onEnter() {
        rk4.p6 p6Var = (rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class));
        if (p6Var.Ai()) {
            p6Var.Zi(new rk4.e6(p6Var, this.f310896a));
        }
        gp1.o onEnterPlayerCallback = this.f310897b.getOnEnterPlayerCallback();
        if (onEnterPlayerCallback != null) {
            ((oh4.a) onEnterPlayerCallback).a();
        }
    }
}
