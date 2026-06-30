package sw3;

/* loaded from: classes9.dex */
public class h extends sw3.a {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f413468w = 0;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f413469t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f413470u;

    /* renamed from: v, reason: collision with root package name */
    public r45.jp6 f413471v;

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ip6();
        lVar.f70665b = new r45.jp6();
        lVar.f70667d = 1495;
        lVar.f70666c = "/cgi-bin/mmpay-bin/transferphonegetrcvr";
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413459r = a17;
        r45.ip6 ip6Var = (r45.ip6) a17.f70710a.f70684a;
        ip6Var.f377257d = str;
        ip6Var.f377258e = str2;
        ip6Var.f377259f = str3;
        ip6Var.f377260g = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecvInfo", "do scene NetSceneMobileRemitGetRecvInfo phone:%s rcvr_id:%s input_type:%s", str, str2, java.lang.Integer.valueOf(i17));
        this.f413469t = str2;
        this.f413470u = str;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecvInfo", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.jp6 jp6Var = (r45.jp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f413471v = jp6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecvInfo", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(jp6Var.f378017d), this.f413471v.f378018e);
        com.tencent.mm.modelbase.u0 u0Var = this.f413460s;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.jp6 jp6Var = (r45.jp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = jp6Var.f378017d;
        this.f214030h = jp6Var.f378018e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1495;
    }
}
