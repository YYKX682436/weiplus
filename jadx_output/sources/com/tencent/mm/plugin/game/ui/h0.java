package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameCenterBaseUI f141402d;

    public h0(com.tencent.mm.plugin.game.ui.GameCenterBaseUI gameCenterBaseUI) {
        this.f141402d = gameCenterBaseUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.GameCenterBaseUI gameCenterBaseUI = this.f141402d;
        if (gameCenterBaseUI.f140699h) {
            com.tencent.mm.plugin.game.model.e1 m17 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().m();
            gameCenterBaseUI.f140701m = m17;
            if (m17 != null) {
                m17.t0();
            }
            com.tencent.mm.plugin.game.model.e1 l17 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().l();
            gameCenterBaseUI.f140702n = l17;
            if (l17 != null) {
                l17.t0();
            }
        }
        com.tencent.mm.plugin.game.model.e1 j17 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().j();
        gameCenterBaseUI.f140703o = j17;
        if (j17 != null) {
            j17.t0();
        }
        if (gameCenterBaseUI.f140699h) {
            com.tencent.mm.plugin.game.model.e1 e1Var = gameCenterBaseUI.f140702n;
            if (e1Var != null && e1Var.field_isHidden == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f140291p2.f140323a)) {
                gameCenterBaseUI.f140704p = true;
                com.tencent.mm.plugin.game.model.e1 e1Var2 = gameCenterBaseUI.f140702n;
                r53.f.r(gameCenterBaseUI.getBaseContext(), e1Var2, "game_center_h5_floatlayer");
                com.tencent.mm.game.report.l.d(gameCenterBaseUI, 10, 1006, 1, 1, 0, e1Var2.field_appId, 0, e1Var2.S2, e1Var2.field_gameMsgId, e1Var2.T2, null);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(858L, 18L, 1L, false);
                gameCenterBaseUI.f140702n.field_isRead = true;
                ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().update(gameCenterBaseUI.f140702n, new java.lang.String[0]);
            }
            ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().f();
        }
    }
}
