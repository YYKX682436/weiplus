package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes2.dex */
public class b0 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156788d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156789e;

    /* renamed from: f, reason: collision with root package name */
    public r45.yk4 f156790f;

    public b0(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xk4();
        lVar.f70665b = new r45.yk4();
        lVar.f70667d = 4839;
        lVar.f70666c = "/cgi-bin/mmpay-bin/sjtpaystate";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156789e = a17;
        r45.xk4 xk4Var = (r45.xk4) a17.f70710a.f70684a;
        xk4Var.f390183d = str;
        xk4Var.f390184e = i17;
        xk4Var.f390185f = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMerchantPayCheckPay", "doScene trade_no：%s, pay_stats：%s, scan_id：%s", str, java.lang.Integer.valueOf(i17), xk4Var.f390185f);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156788d = u0Var;
        return dispatch(sVar, this.f156789e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4708;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMerchantPayCheckPay", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.yk4 yk4Var = (r45.yk4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156790f = yk4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMerchantPayCheckPay", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(yk4Var.f391178d), this.f156790f.f391179e);
        com.tencent.mm.modelbase.u0 u0Var = this.f156788d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
