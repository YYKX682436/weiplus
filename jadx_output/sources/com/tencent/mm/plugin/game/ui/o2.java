package com.tencent.mm.plugin.game.ui;

/* loaded from: classes4.dex */
public class o2 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI f141691d;

    public o2(com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI gameDetailRankLikedUI) {
        this.f141691d = gameDetailRankLikedUI;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI gameDetailRankLikedUI = this.f141691d;
        if (i17 != 0 || i18 != 0) {
            int i19 = com.tencent.mm.plugin.game.ui.GameDetailRankLikedUI.f140740g;
            com.tencent.mars.xlog.Log.e("MicroMsgGameDetailRankLikedUI", "CGI return is not OK. (%d, %d)(%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            gameDetailRankLikedUI.finish();
            return 0;
        }
        m53.r2 r2Var = (m53.r2) oVar.f70711b.f70700a;
        com.tencent.mm.plugin.game.ui.q2 q2Var = gameDetailRankLikedUI.f140742e;
        java.util.LinkedList linkedList = r2Var.f324004d;
        if (linkedList == null) {
            q2Var.getClass();
        } else {
            java.util.LinkedList linkedList2 = (java.util.LinkedList) q2Var.f141726e;
            linkedList2.clear();
            linkedList2.addAll(linkedList);
            q2Var.notifyDataSetChanged();
        }
        gameDetailRankLikedUI.f140743f.dismiss();
        return 0;
    }
}
