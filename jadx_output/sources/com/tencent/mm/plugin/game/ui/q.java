package com.tencent.mm.plugin.game.ui;

/* loaded from: classes9.dex */
public class q implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI f141722d;

    public q(com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI createOrJoinChatroomUI) {
        this.f141722d = createOrJoinChatroomUI;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        m53.k1 k1Var = (m53.k1) oVar.f70711b.f70700a;
        com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI createOrJoinChatroomUI = this.f141722d;
        if (i17 == 0 && i18 == 0) {
            java.lang.String str2 = k1Var.f323835d;
            com.tencent.mars.xlog.Log.i("MicroMsg.CreateOrJoinChatroomUI", "Join Url: %s", str2);
            int i19 = com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI.f140645q;
            createOrJoinChatroomUI.P6();
            com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI.O6(createOrJoinChatroomUI, str2);
            return 0;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.CreateOrJoinChatroomUI", "CGI return is not OK. (%d, %d)(%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 4) {
            int i27 = k1Var.f323836e;
            int i28 = com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI.f140645q;
            createOrJoinChatroomUI.Q6(i27);
        } else {
            int i29 = com.tencent.mm.plugin.game.ui.CreateOrJoinChatroomUI.f140645q;
            createOrJoinChatroomUI.Q6(-1);
        }
        createOrJoinChatroomUI.P6();
        createOrJoinChatroomUI.finish();
        return 0;
    }
}
