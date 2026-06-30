package ow3;

/* loaded from: classes4.dex */
public class d extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349396r;

    /* renamed from: s, reason: collision with root package name */
    public r45.sz f349397s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349398t;

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rz();
        lVar.f70665b = new r45.sz();
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.dd.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/mmpay-bin/checkbankbind_tsbc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f349396r = a17;
        r45.rz rzVar = (r45.rz) a17.f70710a.f70684a;
        rzVar.f385310d = str;
        rzVar.f385311e = str2;
        rzVar.f385312f = str3;
        rzVar.f385313g = str4;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitCheckBankBind", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.sz szVar = (r45.sz) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f349397s = szVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitCheckBankBind", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(szVar.f386024d), this.f349397s.f386025e);
        com.tencent.mm.modelbase.u0 u0Var = this.f349398t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.sz szVar = (r45.sz) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = szVar.f386024d;
        this.f214030h = szVar.f386025e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349398t = u0Var;
        return dispatch(sVar, this.f349396r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.dd.CTRL_INDEX;
    }
}
