package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class f0 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156813d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156814e;

    public f0(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePersonalPayCheck", "personalpay_order_id = %s ,trans_id = %s ,total_amount = %s，placeorder_ext = %s", str, str2, java.lang.Long.valueOf(j17), str3);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cs();
        lVar.f70665b = new r45.ds();
        lVar.f70667d = 5047;
        lVar.f70666c = "/cgi-bin/mmpay-bin/personalpaypaycheck";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156813d = a17;
        r45.cs csVar = (r45.cs) a17.f70710a.f70684a;
        r45.yr yrVar = new r45.yr();
        yrVar.f391310d = str;
        yrVar.f391311e = str2;
        yrVar.f391312f = j17;
        yrVar.f391313g = str3;
        csVar.f371801d = yrVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156814e = u0Var;
        return dispatch(sVar, this.f156813d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5047;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePersonalPayCheck", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f156814e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
