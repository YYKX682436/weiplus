package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class o extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156919d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ap f156920e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156921f;

    public o(r45.k6 k6Var, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zo();
        lVar.f70665b = new r45.ap();
        lVar.f70667d = 1241;
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2fpaycheck";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156919d = a17;
        r45.zo zoVar = (r45.zo) a17.f70710a.f70684a;
        zoVar.f392246d = k6Var;
        zoVar.f392247e = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fPayCheck", "NetSceneBusiF2fPayCheck, f2fId: %s, transId: %s, amount: %s req: %s", k6Var.f378414d, k6Var.f378415e, java.lang.Integer.valueOf(k6Var.f378423p), com.tencent.mm.plugin.remittance.model.a.b(k6Var));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156921f = u0Var;
        return dispatch(sVar, this.f156919d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1241;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fPayCheck", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.ap apVar = (r45.ap) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156920e = apVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fPayCheck", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(apVar.f370169d), this.f156920e.f370170e);
        com.tencent.mm.modelbase.u0 u0Var = this.f156921f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
