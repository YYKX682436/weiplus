package kp1;

/* loaded from: classes11.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList f310938d;

    public t(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList) {
        this.f310938d = audioPanelTaskBarViewRecommendMusicList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendMusicList$initRecentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList.f92995z;
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList = this.f310938d;
        if (audioPanelTaskBarViewRecommendMusicList.t()) {
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView.l(audioPanelTaskBarViewRecommendMusicList, false, true, 1, null);
            ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).f252196d = java.lang.Boolean.TRUE;
            gm4.a.f273557a.g("key_clicked_recommend", true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendMusicList$initRecentView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
