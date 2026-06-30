package i61;

/* loaded from: classes2.dex */
public class p extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f288932r;

    /* renamed from: s, reason: collision with root package name */
    public r45.lh5 f288933s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f288934t;

    public p(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.kh5();
        lVar.f70665b = new r45.lh5();
        lVar.f70667d = 1809;
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaaquerypfinfo";
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f288932r = a17;
        r45.kh5 kh5Var = (r45.kh5) a17.f70710a.f70684a;
        kh5Var.f378699d = str;
        kh5Var.f378700e = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", "do scene NetSceneNewAAQueryPFInfo pf_order_no:%s appid:%s", str, str2);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.lh5 lh5Var = (r45.lh5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f288933s = lh5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(lh5Var.f379484d), this.f288933s.f379485e);
        com.tencent.mm.modelbase.u0 u0Var = this.f288934t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.lh5 lh5Var = (r45.lh5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = lh5Var.f379484d;
        this.f214030h = lh5Var.f379485e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.NetSceneNewAAQueryPFInfo", "doScene");
        this.f288934t = u0Var;
        return dispatch(sVar, this.f288932r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1809;
    }
}
