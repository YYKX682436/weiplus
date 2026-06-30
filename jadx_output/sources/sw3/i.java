package sw3;

/* loaded from: classes9.dex */
public class i extends sw3.a {

    /* renamed from: t, reason: collision with root package name */
    public r45.tp6 f413472t;

    public i(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sp6();
        lVar.f70665b = new r45.tp6();
        lVar.f70667d = 1903;
        lVar.f70666c = "/cgi-bin/mmpay-bin/transferphonesuccpage";
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413459r = a17;
        r45.sp6 sp6Var = (r45.sp6) a17.f70710a.f70684a;
        sp6Var.f385899d = str;
        sp6Var.f385900e = str2;
        sp6Var.f385901f = str3;
        sp6Var.f385902g = str4;
        sp6Var.f385903h = i17;
        sp6Var.f385904i = str5;
        sp6Var.f385905m = str6;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetSuccPage", "do scene NetSceneMobileRemitGetSuccPage out_trade_no:%s trans_id:%s rcvr_openid:%s rcvr_token:%s amount:%s placeorder_token:%s placeorder_ext:%s", str, str2, str3, str4, java.lang.Integer.valueOf(i17), str5, str6);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetSuccPage", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.tp6 tp6Var = (r45.tp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f413472t = tp6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetSuccPage", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(tp6Var.f386659d), this.f413472t.f386660e);
        com.tencent.mm.modelbase.u0 u0Var = this.f413460s;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.tp6 tp6Var = (r45.tp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = tp6Var.f386659d;
        this.f214030h = tp6Var.f386660e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1903;
    }
}
