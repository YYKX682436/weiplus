package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes2.dex */
public class h0 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156849d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156850e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lr5 f156851f;

    public h0(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePersonalPayRequestPayment", "appID = %s，out_prepay_id = %s", str, str2);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.kr5();
        lVar.f70665b = new r45.lr5();
        lVar.f70667d = 4912;
        lVar.f70666c = "/cgi-bin/mmpay-bin/personalpayrequestpayment";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156849d = a17;
        r45.kr5 kr5Var = (r45.kr5) a17.f70710a.f70684a;
        kr5Var.f378909d = str;
        kr5Var.f378910e = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156850e = u0Var;
        return dispatch(sVar, this.f156849d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4912;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePersonalPayRequestPayment", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f156851f = (r45.lr5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f156850e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
