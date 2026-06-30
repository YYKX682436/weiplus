package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes2.dex */
public class u5 extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.vr6 f145659r;

    public u5(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ur6();
        lVar.f70665b = new r45.vr6();
        lVar.f70667d = 5160;
        lVar.f70666c = "/cgi-bin/mmpay-bin/unionhb/businesscallbackunionhb";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.ur6 ur6Var = (r45.ur6) a17.f70710a.f70684a;
        ur6Var.f387602d = str;
        ur6Var.f387603e = str2;
        ur6Var.f387604f = str3;
        ur6Var.f387605g = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBusinessCallbackUnion", "NetSceneLuckyMoneyBusinessCallbackUnion request sendId: %s, %s", str, str3);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.vr6 vr6Var = (r45.vr6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f145659r = vr6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBusinessCallbackUnion", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(vr6Var.f388480d), this.f145659r.f388481e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.vr6 vr6Var = (r45.vr6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = vr6Var.f388480d;
        this.f214030h = vr6Var.f388481e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5160;
    }
}
