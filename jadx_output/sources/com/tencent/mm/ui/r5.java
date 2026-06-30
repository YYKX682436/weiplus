package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f209597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.s5 f209598e;

    public r5(com.tencent.mm.ui.s5 s5Var, int i17) {
        this.f209598e = s5Var;
        this.f209597d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.s5 s5Var = this.f209598e;
        com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI = s5Var.f209775j;
        findMoreFriendsUI.E = true;
        com.tencent.mm.ui.GameIconViewTipPreference gameIconViewTipPreference = (com.tencent.mm.ui.GameIconViewTipPreference) findMoreFriendsUI.f196656w.h("more_tab_game_recommend");
        int i17 = s5Var.f209770e;
        if (i17 == 3) {
            gameIconViewTipPreference.V = s5Var.f209775j.getString(com.tencent.mm.R.string.f490501wv);
            gameIconViewTipPreference.W = com.tencent.mm.R.drawable.asx;
            s5Var.f209775j.r1(gameIconViewTipPreference, 0, 8, 8, false, 8, 8, 8, s5Var.f209766a);
            s5Var.f209775j.n1(s5Var.f209771f, 1, s5Var.f209772g, s5Var.f209773h);
        } else if (i17 == 4) {
            gameIconViewTipPreference.d0(s5Var.f209774i, -1, android.graphics.Color.parseColor("#8c8c8c"));
            s5Var.f209775j.r1(gameIconViewTipPreference, 8, 8, 0, true, 8, 8, 8, s5Var.f209766a);
            s5Var.f209775j.n1(s5Var.f209771f, 2, s5Var.f209772g, s5Var.f209773h);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FindMoreFriendsUI", "gamelog.reddot, finder, update, download entrance image failed, msgId:%d, showType:%d", java.lang.Long.valueOf(s5Var.f209771f), java.lang.Integer.valueOf(s5Var.f209770e));
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.idkeyStat(858L, 12L, 1L, false);
        if (this.f209597d == 2) {
            g0Var.idkeyStat(858L, 14L, 1L, false);
        }
    }
}
