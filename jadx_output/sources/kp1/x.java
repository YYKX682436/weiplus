package kp1;

/* loaded from: classes11.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList f310948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f310949e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList, java.lang.String str) {
        super(0);
        this.f310948d = audioPanelTaskBarViewRecommendMusicList;
        this.f310949e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String subTitle;
        int i17 = com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList.f92995z;
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList = this.f310948d;
        boolean z17 = !audioPanelTaskBarViewRecommendMusicList.t();
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList.r(audioPanelTaskBarViewRecommendMusicList, this.f310949e, z17);
        subTitle = audioPanelTaskBarViewRecommendMusicList.getSubTitle();
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList.s(audioPanelTaskBarViewRecommendMusicList, subTitle, z17);
        return jz5.f0.f302826a;
    }
}
