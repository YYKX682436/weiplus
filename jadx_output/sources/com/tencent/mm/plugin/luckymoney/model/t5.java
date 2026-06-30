package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes2.dex */
public class t5 extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.uu3 f145641r;

    public t5(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tu3();
        lVar.f70665b = new r45.uu3();
        lVar.f70667d = 2929;
        lVar.f70666c = "/cgi-bin/mmpay-bin/ftfhb/businesscallbackwxhb";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.tu3 tu3Var = (r45.tu3) a17.f70710a.f70684a;
        tu3Var.f386812d = str;
        tu3Var.f386813e = str2;
        tu3Var.f386814f = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBusinessCallback", "sendId: %s, %s", str, str3);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.uu3 uu3Var = (r45.uu3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f145641r = uu3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyBusinessCallback", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(uu3Var.f387649d), this.f145641r.f387650e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.uu3 uu3Var = (r45.uu3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = uu3Var.f387649d;
        this.f214030h = uu3Var.f387650e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2929;
    }
}
