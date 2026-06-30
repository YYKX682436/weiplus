package ow3;

/* loaded from: classes9.dex */
public class m extends ow3.b implements com.tencent.mm.wallet_core.model.t {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349426r;

    /* renamed from: s, reason: collision with root package name */
    public r45.or5 f349427s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349428t;

    public m(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, java.lang.String str4, int i19, int i27, java.lang.String str5, java.lang.String str6, com.tencent.mm.protobuf.g gVar, int i28) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str6 == null ? "" : str6;
        objArr[1] = android.util.Base64.encodeToString(gVar.g(), 2);
        objArr[2] = java.lang.Integer.valueOf(i28);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitRequestOrder", "unique_id:%s last_transfer_bill_id:%s unpay_type:%s", objArr);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nr5();
        lVar.f70665b = new r45.or5();
        lVar.f70667d = 1380;
        lVar.f70666c = "/cgi-bin/mmpay-bin/request_tsbc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f349426r = a17;
        r45.nr5 nr5Var = (r45.nr5) a17.f70710a.f70684a;
        nr5Var.f381619d = str;
        nr5Var.f381620e = str2;
        nr5Var.f381621f = str3;
        nr5Var.f381622g = i17;
        nr5Var.f381623h = i18;
        nr5Var.f381624i = str4;
        nr5Var.f381625m = i19;
        nr5Var.f381626n = i27;
        nr5Var.f381627o = str5;
        nr5Var.f381628p = str6;
        nr5Var.f381629q = gVar;
        nr5Var.f381630r = i28;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitRequestOrder", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.or5 or5Var = (r45.or5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f349427s = or5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitRequestOrder", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(or5Var.f382464d), this.f349427s.f382465e);
        com.tencent.mm.modelbase.u0 u0Var = this.f349428t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.or5 or5Var = (r45.or5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = or5Var.f382464d;
        this.f214030h = or5Var.f382465e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public boolean M() {
        r45.h7 h7Var = this.f349427s.f382471n;
        return h7Var == null || h7Var.f375892d != 1;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349428t = u0Var;
        return dispatch(sVar, this.f349426r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1380;
    }
}
