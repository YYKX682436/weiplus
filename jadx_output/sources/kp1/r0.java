package kp1;

/* loaded from: classes11.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV4 f310935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV4 audioPanelTaskBarViewV4) {
        super(0);
        this.f310935d = audioPanelTaskBarViewV4;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewV4.B;
        gp1.o onEnterPlayerCallback = this.f310935d.getOnEnterPlayerCallback();
        if (onEnterPlayerCallback != null) {
            ((oh4.a) onEnterPlayerCallback).a();
        }
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ui(bw5.yq0.TingReportAction_ControlAreaClickRecent, null, null);
        return jz5.f0.f302826a;
    }
}
