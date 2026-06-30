package kp1;

/* loaded from: classes11.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView f310921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarBaseView) {
        super(0);
        this.f310921d = audioPanelTaskBarBaseView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        np1.a currentAudioPlayingInfo;
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView audioPanelTaskBarBaseView = this.f310921d;
        currentAudioPlayingInfo = audioPanelTaskBarBaseView.getCurrentAudioPlayingInfo();
        pm0.v.X(new kp1.n(audioPanelTaskBarBaseView, currentAudioPlayingInfo));
        return jz5.f0.f302826a;
    }
}
