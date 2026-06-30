package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes4.dex */
public class d0 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156802d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156803e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cl4 f156804f;

    public d0(java.lang.String str, double d17, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bl4();
        lVar.f70665b = new r45.cl4();
        lVar.f70667d = 4954;
        lVar.f70666c = "/cgi-bin/mmpay-bin/sjtpaypurchase";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156803e = a17;
        r45.bl4 bl4Var = (r45.bl4) a17.f70710a.f70684a;
        bl4Var.f370852d = str;
        long i07 = com.tencent.mm.wallet_core.ui.r1.i0(d17 + "", "100");
        bl4Var.f370853e = i07;
        bl4Var.f370854f = str2;
        bl4Var.f370856h = str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMerchantPayPlaceOrder", "scanId: %s, totalAmount: %s , payerRemark：%s , qrcodeSenderUsername：%s", str, java.lang.Long.valueOf(i07), str2, str3);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156802d = u0Var;
        return dispatch(sVar, this.f156803e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4954;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMerchantPayPlaceOrder", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.cl4 cl4Var = (r45.cl4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156804f = cl4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMerchantPayPlaceOrder", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(cl4Var.f371651d), this.f156804f.f371652e);
        com.tencent.mm.modelbase.u0 u0Var = this.f156802d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
