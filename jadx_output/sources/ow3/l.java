package ow3;

/* loaded from: classes2.dex */
public class l extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349424r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349425s;

    public l(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitReportPayRes", "NetSceneBankRemitReportPayRes() transfer_bill_id:%s unique_id:%s unpay_type:%s", str, str2, java.lang.Integer.valueOf(i17));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.hq5 hq5Var = new r45.hq5();
        hq5Var.f376387d = new com.tencent.mm.protobuf.g(("" + str).getBytes());
        hq5Var.f376388e = str2;
        hq5Var.f376389f = i17;
        lVar.f70664a = hq5Var;
        lVar.f70665b = new r45.iq5();
        lVar.f70666c = "/cgi-bin/mmpay-bin/reportpayres_tsbc";
        lVar.f70667d = 2739;
        this.f349424r = lVar.a();
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitReportPayRes", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f349425s;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.iq5 iq5Var = (r45.iq5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = iq5Var.f377269d;
        this.f214030h = iq5Var.f377270e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349425s = u0Var;
        return dispatch(sVar, this.f349424r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2739;
    }
}
