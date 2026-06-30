package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class i0 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156853d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156854e;

    /* renamed from: f, reason: collision with root package name */
    public r45.hs f156855f;

    public i0(r45.yr yrVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePersonalPaySuccPage", "personalpay_order_id = %s ,trans_id = %s ,total_amount = %s，placeorder_ext = %s", yrVar.f391310d, yrVar.f391311e, java.lang.Long.valueOf(yrVar.f391312f), yrVar.f391313g);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gs();
        lVar.f70665b = new r45.hs();
        lVar.f70667d = 4587;
        lVar.f70666c = "/cgi-bin/mmpay-bin/personalpaysuccpage";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156853d = a17;
        ((r45.gs) a17.f70710a.f70684a).f375507d = yrVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156854e = u0Var;
        return dispatch(sVar, this.f156853d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4587;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePersonalPaySuccPage", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f156855f = (r45.hs) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f156854e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
