package kp1;

/* loaded from: classes8.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList f310936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList) {
        super(0);
        this.f310936d = audioPanelTaskBarViewRecommendMusicList;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bw5.lp0 lp0Var;
        byte[] b17;
        ef0.d4 d4Var = (ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class));
        if (d4Var.f252198f == null && (b17 = gm4.a.f273557a.b("key_taskbar_recommend_data")) != null) {
            bw5.qb0 qb0Var = new bw5.qb0();
            qb0Var.parseFrom(b17);
            d4Var.f252198f = qb0Var;
        }
        bw5.qb0 qb0Var2 = d4Var.f252198f;
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList = this.f310936d;
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList.q(audioPanelTaskBarViewRecommendMusicList, qb0Var2);
        ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).getClass();
        byte[] b18 = gm4.a.f273557a.b("key_task_bar_play_item");
        if (b18 != null) {
            lp0Var = new bw5.lp0();
            lp0Var.parseFrom(b18);
        } else {
            lp0Var = null;
        }
        audioPanelTaskBarViewRecommendMusicList.f93000t = lp0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "initLocalRecommendData categoryItem: %s, playingItem: %s", audioPanelTaskBarViewRecommendMusicList.f93001u, lp0Var);
        pm0.v.X(new kp1.r(audioPanelTaskBarViewRecommendMusicList));
        return jz5.f0.f302826a;
    }
}
