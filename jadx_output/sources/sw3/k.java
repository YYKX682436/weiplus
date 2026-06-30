package sw3;

/* loaded from: classes9.dex */
public class k extends sw3.a {

    /* renamed from: t, reason: collision with root package name */
    public r45.rp6 f413476t;

    /* renamed from: u, reason: collision with root package name */
    public final int f413477u;

    /* renamed from: v, reason: collision with root package name */
    public final int f413478v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f413479w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f413480x;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, double d17, java.lang.String str4, int i17, java.lang.String str5, java.lang.String str6, boolean z17, java.lang.String str7, boolean z18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.qp6();
        lVar.f70665b = new r45.rp6();
        lVar.f70667d = 2878;
        lVar.f70666c = "/cgi-bin/mmpay-bin/transferphoneplaceorder";
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413459r = a17;
        r45.qp6 qp6Var = (r45.qp6) a17.f70710a.f70684a;
        qp6Var.f384192d = str;
        qp6Var.f384193e = str2;
        qp6Var.f384194f = str3;
        qp6Var.f384195g = (int) java.lang.Math.round(100.0d * d17);
        qp6Var.f384196h = str4;
        qp6Var.f384197i = i17;
        qp6Var.f384198m = str5;
        qp6Var.f384199n = str6;
        if (z17) {
            qp6Var.f384200o = str7 == null ? "" : str7;
        }
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = str3;
        objArr[3] = java.lang.Double.valueOf(d17);
        objArr[4] = str4;
        objArr[5] = java.lang.Integer.valueOf(i17);
        objArr[6] = str5;
        objArr[7] = str6;
        objArr[8] = java.lang.Boolean.valueOf(z17);
        objArr[9] = str7 == null ? "null" : str7;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitPlaceOrder", "do scene NetSceneMobileRemitGetRecord rcvr_openid:%s rcvr_token:%s get_rcvr_ext%s amount:%s desc:%s delay_code:%s real_name_token:%s timestamp_ms:%s isFromForceCheckName:%s replaceorder_token:%s", objArr);
        this.f413477u = qp6Var.f384195g;
        this.f413478v = qp6Var.f384197i;
        this.f413479w = z17;
        this.f413480x = z18;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitPlaceOrder", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.rp6 rp6Var = (r45.rp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f413476t = rp6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitPlaceOrder", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(rp6Var.f385080d), this.f413476t.f385081e);
        com.tencent.mm.modelbase.u0 u0Var = this.f413460s;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.rp6 rp6Var = (r45.rp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = rp6Var.f385080d;
        this.f214030h = rp6Var.f385081e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2878;
    }
}
