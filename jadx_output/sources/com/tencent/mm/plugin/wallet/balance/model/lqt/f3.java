package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes4.dex */
public class f3 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public r45.p15 f177632d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f177633e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f177634f;

    public f3(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.o15();
        lVar.f70665b = new r45.p15();
        lVar.f70667d = 2996;
        lVar.f70666c = "/cgi-bin/mmpay-bin/openlqbaccount";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f177633e = a17;
        r45.o15 o15Var = (r45.o15) a17.f70710a.f70684a;
        o15Var.f381822d = str;
        o15Var.f381823e = str2;
        o15Var.f381824f = com.tencent.mm.plugin.wallet.balance.model.lqt.c3.f177624a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLqbAccount", "NetSceneOpenLqbAccount, eCardType: %s, extraData: %s", str, str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f177634f = u0Var;
        return dispatch(sVar, this.f177633e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2996;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLqbAccount", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.p15 p15Var = (r45.p15) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f177632d = p15Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneOpenLqbAccount", "onGYNetEnd, retcode: %s, retmsg: %s", java.lang.Integer.valueOf(p15Var.f382661d), this.f177632d.f382662e);
        r45.p15 p15Var2 = this.f177632d;
        if (p15Var2.f382661d == 0) {
            com.tencent.mm.plugin.wallet.balance.model.lqt.c3.c(p15Var2.f382664g);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f177634f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
