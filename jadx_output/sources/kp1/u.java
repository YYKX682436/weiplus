package kp1;

/* loaded from: classes11.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList f310940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList) {
        super(0);
        this.f310940d = audioPanelTaskBarViewRecommendMusicList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gp1.o onEnterPlayerCallback = this.f310940d.getOnEnterPlayerCallback();
        if (onEnterPlayerCallback != null) {
            ((oh4.a) onEnterPlayerCallback).a();
        }
        return jz5.f0.f302826a;
    }
}
