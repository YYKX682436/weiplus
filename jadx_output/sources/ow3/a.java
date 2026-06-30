package ow3;

/* loaded from: classes4.dex */
public class a extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349389r;

    /* renamed from: s, reason: collision with root package name */
    public r45.sa f349390s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349391t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f349392u;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ra();
        lVar.f70665b = new r45.sa();
        lVar.f70667d = 1348;
        lVar.f70666c = "/cgi-bin/mmpay-bin/appointbank_tsbc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f349389r = a17;
        r45.ra raVar = (r45.ra) a17.f70710a.f70684a;
        raVar.f384683d = str;
        raVar.f384685f = str2;
        raVar.f384684e = str3;
        this.f349392u = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitAppointBank", "seqno: %s, timing_id: %s, bankType: %s", str, str2, str3);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitAppointBank", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.sa saVar = (r45.sa) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f349390s = saVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitAppointBank", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(saVar.f385591d), this.f349390s.f385592e);
        com.tencent.mm.modelbase.u0 u0Var = this.f349391t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.sa saVar = (r45.sa) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = saVar.f385591d;
        this.f214030h = saVar.f385592e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349391t = u0Var;
        return dispatch(sVar, this.f349389r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1348;
    }
}
