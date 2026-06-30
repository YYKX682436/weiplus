package ow3;

/* loaded from: classes2.dex */
public class f extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349403r;

    /* renamed from: s, reason: collision with root package name */
    public r45.na3 f349404s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349405t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f349406u;

    public f(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ma3();
        lVar.f70665b = new r45.na3();
        lVar.f70667d = 1542;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getbankinfo_tsbc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f349403r = a17;
        ((r45.ma3) a17.f70710a.f70684a).f380293d = str;
        this.f349406u = str2;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitGetBankInfo", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.na3 na3Var = (r45.na3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f349404s = na3Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitGetBankInfo", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(na3Var.f381192d), this.f349404s.f381193e);
        com.tencent.mm.modelbase.u0 u0Var = this.f349405t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.na3 na3Var = (r45.na3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = na3Var.f381192d;
        this.f214030h = na3Var.f381193e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349405t = u0Var;
        return dispatch(sVar, this.f349403r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1542;
    }
}
