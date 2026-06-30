package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes2.dex */
public class g0 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156824d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156825e;

    /* renamed from: f, reason: collision with root package name */
    public r45.fs f156826f;

    public g0(java.lang.String str, java.lang.String str2, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePersonalPayPlaceOrder", "appID = %s ，outPrepayId = %s ,,totalAmount = %s", str, str2, java.lang.Long.valueOf(j17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.es();
        lVar.f70665b = new r45.fs();
        lVar.f70667d = 4304;
        lVar.f70666c = "/cgi-bin/mmpay-bin/personalpayplaceorder";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156824d = a17;
        r45.es esVar = (r45.es) a17.f70710a.f70684a;
        esVar.f373695d = str;
        esVar.f373696e = str2;
        esVar.f373697f = j17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156825e = u0Var;
        return dispatch(sVar, this.f156824d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4304;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePersonalPayPlaceOrder", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f156826f = (r45.fs) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f156825e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
