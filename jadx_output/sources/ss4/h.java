package ss4;

/* loaded from: classes8.dex */
public class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412061d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412062e;

    /* renamed from: f, reason: collision with root package name */
    public r45.la3 f412063f;

    public h(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ka3();
        lVar.f70665b = new r45.la3();
        lVar.f70666c = "/cgi-bin/mmpay-bin/tenpay/getbanpaymobileinfo";
        lVar.f70667d = 1667;
        com.tencent.mm.wallet_core.ui.r1.J(str);
        lVar.f70671h = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412062e = a17;
        ((r45.ka3) a17.f70710a.f70684a).f378531d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412061d = u0Var;
        return dispatch(sVar, this.f412062e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1667;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBanpayMobileInfo", "NetSceneGetBanpayMobileInfo, netId: %s, errType: %s, errCode: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f412063f = (r45.la3) this.f412062e.f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f412061d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
