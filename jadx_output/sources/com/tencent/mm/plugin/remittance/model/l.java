package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes2.dex */
public class l extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156878d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156879e;

    public l(r45.to toVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = toVar;
        lVar.f70665b = new r45.uo();
        lVar.f70667d = 4611;
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2fcancelpay";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f156878d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156879e = u0Var;
        return dispatch(sVar, this.f156878d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4611;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fCancelPay", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f156879e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
