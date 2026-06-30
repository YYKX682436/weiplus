package i61;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f288923d;

    /* renamed from: e, reason: collision with root package name */
    public r45.s f288924e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f288925f;

    public i() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.r();
        lVar.f70665b = new r45.s();
        lVar.f70667d = 1698;
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaaoperation";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f288923d = a17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f288925f = u0Var;
        return dispatch(sVar, this.f288923d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1698;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAOperation", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.s sVar = (r45.s) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f288924e = sVar;
        if (i18 == 0 && i19 == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(sVar.f385338d);
            r45.s sVar2 = this.f288924e;
            java.lang.String str2 = sVar2.f385339e;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(sVar2.f385340f);
            java.lang.Integer valueOf3 = java.lang.Integer.valueOf(this.f288924e.f385341g);
            java.lang.Integer valueOf4 = java.lang.Integer.valueOf(this.f288924e.f385342h);
            java.lang.Long valueOf5 = java.lang.Long.valueOf(this.f288924e.f385343i);
            java.lang.Long valueOf6 = java.lang.Long.valueOf(this.f288924e.f385344m);
            r45.s sVar3 = this.f288924e;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAOperation", "retCode: %s, retMsg: %s, max_payer_num: %s, max_receiver_num: %s, max_total_num: %s, max_total_amount: %s, max_per_amount: %s, notice: %s, notice_url: %s", valueOf, str2, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, sVar3.f385345n, sVar3.f385346o);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f288925f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
