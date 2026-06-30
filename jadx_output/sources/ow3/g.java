package ow3;

/* loaded from: classes4.dex */
public class g extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349407r;

    /* renamed from: s, reason: collision with root package name */
    public r45.pa3 f349408s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349409t;

    public g() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.oa3();
        lVar.f70665b = new r45.pa3();
        lVar.f70667d = v31.k.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getbanklist_tsbc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f349407r = a17;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitGetBankList", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.pa3 pa3Var = (r45.pa3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f349408s = pa3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitGetBankList", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(pa3Var.f382909d), this.f349408s.f382910e);
        if (!this.f214031i && this.f349408s.f382909d != 0) {
            this.f214032m = true;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f349409t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.pa3 pa3Var = (r45.pa3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = pa3Var.f382909d;
        this.f214030h = pa3Var.f382910e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349409t = u0Var;
        return dispatch(sVar, this.f349407r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return v31.k.CTRL_INDEX;
    }
}
