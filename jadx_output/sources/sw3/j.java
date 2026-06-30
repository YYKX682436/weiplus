package sw3;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413473d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pp6 f413474e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413475f;

    public j(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.op6();
        lVar.f70665b = new r45.pp6();
        lVar.f70667d = 2817;
        lVar.f70666c = "/cgi-bin/mmpay-bin/transferphonepaycheck";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413473d = a17;
        r45.op6 op6Var = (r45.op6) a17.f70710a.f70684a;
        op6Var.f382429d = str;
        op6Var.f382430e = str2;
        op6Var.f382431f = str3;
        op6Var.f382432g = str4;
        op6Var.f382433h = j17;
        op6Var.f382434i = str5;
        op6Var.f382435m = str6;
        op6Var.f382436n = str7;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "do scene NetSceneMobileRemitPayCheck reqKey:%s transferId:%s transactionId:%s receiverOpenid:%s fee:%s extendStr:%s rcvrToken:%s placeorderToken:%s", str, str2, str3, str4, java.lang.Long.valueOf(j17), str5, str6, str7);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413475f = u0Var;
        return dispatch(sVar, this.f413473d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2817;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.pp6 pp6Var = (r45.pp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f413474e = pp6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(pp6Var.f383295d), this.f413474e.f383296e);
        com.tencent.mm.modelbase.u0 u0Var = this.f413475f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
