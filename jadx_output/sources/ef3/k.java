package ef3;

/* loaded from: classes9.dex */
public class k extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f252414d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f252415e;

    /* renamed from: f, reason: collision with root package name */
    public r45.o93 f252416f;

    /* renamed from: g, reason: collision with root package name */
    public final int f252417g;

    public k(int i17, boolean z17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.n93();
        lVar.f70665b = new r45.o93();
        lVar.f70667d = 4362;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getallfunction";
        lVar.f70678o = 1;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f252414d = a17;
        r45.n93 n93Var = (r45.n93) a17.f70710a.f70684a;
        this.f252417g = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPayFunctionListNew", "walletRegion: %s, hasCache: %s", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        n93Var.f381181d = i17;
        n93Var.f381182e = !z17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f252415e = u0Var;
        return dispatch(sVar, this.f252414d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4362;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPayFunctionListNew", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.o93 o93Var = (r45.o93) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            this.f252416f = o93Var;
            if (o93Var != null) {
                try {
                    ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().j(bt4.d.f(this.f252417g), ot5.e.a(o93Var.toByteArray()));
                    ((com.tencent.mm.plugin.wxpay.g) ((j05.f) i95.n0.c(j05.f.class))).wi().g(true);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MallLogic", "save config exp, " + e17.getLocalizedMessage());
                }
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f252415e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
