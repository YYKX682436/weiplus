package ot4;

/* loaded from: classes8.dex */
public class b extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f348868d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f348869e;

    /* renamed from: f, reason: collision with root package name */
    public r45.o65 f348870f;

    public b(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.n65();
        lVar.f70665b = new r45.o65();
        ss4.p0 p0Var = ss4.p0.f412124a;
        ss4.n0 n0Var = ss4.n0.f412108g;
        int a17 = p0Var.a(n0Var, 2540);
        java.lang.String b17 = p0Var.b(n0Var, "/cgi-bin/mmpay-bin/payibgquickgetoverseawallet");
        lVar.f70667d = a17;
        lVar.f70666c = b17;
        com.tencent.mm.modelbase.o a18 = lVar.a();
        this.f348868d = a18;
        ((r45.n65) a18.f70710a.f70684a).f381102d = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f348869e = u0Var;
        return dispatch(sVar, this.f348868d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2540;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePayIBGQuickGetOverseaWallet", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f348870f = (r45.o65) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f348869e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
