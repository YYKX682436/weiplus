package ow3;

/* loaded from: classes9.dex */
public class k extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349421r;

    /* renamed from: s, reason: collision with root package name */
    public r45.qh5 f349422s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349423t;

    public k() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ph5();
        lVar.f70665b = new r45.qh5();
        lVar.f70667d = 1378;
        lVar.f70666c = "/cgi-bin/mmpay-bin/tsrecordlist_tsbc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f349421r = lVar.a();
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitQueryTransferList", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.qh5 qh5Var = (r45.qh5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f349422s = qh5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitQueryTransferList", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(qh5Var.f384001d), this.f349422s.f384002e);
        com.tencent.mm.modelbase.u0 u0Var = this.f349423t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.qh5 qh5Var = (r45.qh5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = qh5Var.f384001d;
        this.f214030h = qh5Var.f384002e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349423t = u0Var;
        return dispatch(sVar, this.f349421r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1378;
    }
}
