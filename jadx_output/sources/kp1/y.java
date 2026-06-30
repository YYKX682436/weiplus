package kp1;

/* loaded from: classes11.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList f310952d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList) {
        super(0);
        this.f310952d = audioPanelTaskBarViewRecommendMusicList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList = this.f310952d;
        audioPanelTaskBarViewRecommendMusicList.n(audioPanelTaskBarViewRecommendMusicList.getMCurrentPlayState());
        return jz5.f0.f302826a;
    }
}
