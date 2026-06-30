package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes8.dex */
public class d6 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f145230d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f145231e;

    public d6(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneLuckyMoneyReport", "NetSceneLuckyMoneyReport() sendId:%s unique_id:%s reportType:%s sendUsername:%s recvUserName:%s", str, str2, java.lang.Integer.valueOf(i17), str3, str4);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.vp5 vp5Var = new r45.vp5();
        vp5Var.f388425d = str;
        vp5Var.f388426e = str2;
        vp5Var.f388427f = i17;
        vp5Var.f388428g = str3;
        vp5Var.f388429h = str4;
        lVar.f70664a = vp5Var;
        lVar.f70665b = new r45.wp5();
        lVar.f70666c = "/cgi-bin/mmpay-bin/ftfhb/wxhbreport";
        lVar.f70667d = 2715;
        this.f145230d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f145231e = u0Var;
        return dispatch(sVar, this.f145230d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2715;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneLuckyMoneyReport", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
        }
        this.f145231e.onSceneEnd(i18, i19, str, this);
    }
}
