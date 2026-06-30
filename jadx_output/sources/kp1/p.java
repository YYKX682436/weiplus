package kp1;

/* loaded from: classes11.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList f310930d;

    public p(com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList) {
        this.f310930d = audioPanelTaskBarViewRecommendMusicList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendMusicList$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList.f92995z;
        com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarViewRecommendMusicList audioPanelTaskBarViewRecommendMusicList = this.f310930d;
        if (audioPanelTaskBarViewRecommendMusicList.t()) {
            com.tencent.mm.plugin.ball.audio_panel.view.AudioPanelTaskBarBaseView.l(audioPanelTaskBarViewRecommendMusicList, true, false, 2, null);
            bw5.o50 o50Var = audioPanelTaskBarViewRecommendMusicList.f93001u;
            if (o50Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "jumpCategoryPage categoryItem is null");
            } else {
                bw5.qb0 qb0Var = audioPanelTaskBarViewRecommendMusicList.f93002v;
                if (qb0Var != null && qb0Var.f32032d == 1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "jumpCategoryPage categoryId: " + o50Var.c() + ", type: " + o50Var.f30964n);
                    il4.e eVar = new il4.e(null, 0, 5, false, null, null, 0, 0, false, false, null, 5, null, null, null, null, false, false, null, null, false, null, false, null, false, 33552379, null);
                    eVar.f292116m = java.lang.Boolean.TRUE;
                    eVar.f292122s.f292130b = true;
                    qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
                    android.content.Context context = audioPanelTaskBarViewRecommendMusicList.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    bw5.lp0 lp0Var = audioPanelTaskBarViewRecommendMusicList.f93000t;
                    qk.f9.d(aj6, context, o50Var, lp0Var != null ? kz5.c0.d(lp0Var) : null, qk.ja.f364192e, bw5.ar0.TingScene_MediaControlCenter, eVar, new kp1.u(audioPanelTaskBarViewRecommendMusicList), null, null, null, false, 1920, null);
                    ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Ni(com.tencent.mm.plugin.appbrand.jsapi.pay.z.CTRL_INDEX, o50Var);
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AudioPanelTaskBarViewRecommendMusicList", "jumpCategoryPage not valid type");
                }
            }
            ((ef0.d4) ((qk.h9) i95.n0.c(qk.h9.class))).f252196d = java.lang.Boolean.TRUE;
            gm4.a.f273557a.g("key_clicked_recommend", true);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/audio_panel/view/AudioPanelTaskBarViewRecommendMusicList$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
