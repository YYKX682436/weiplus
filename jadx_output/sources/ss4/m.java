package ss4;

/* loaded from: classes2.dex */
public class m extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.yf0 f412092d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412093e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412094f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f412095g;

    public m(java.lang.String str, int i17, boolean z17) {
        this.f412095g = z17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xf0();
        lVar.f70665b = new r45.yf0();
        if (z17) {
            lVar.f70667d = 1859;
            lVar.f70666c = "/cgi-bin/mmpay-bin/mktdrawf2flottery";
        } else {
            lVar.f70667d = 2547;
            lVar.f70666c = "/cgi-bin/mmpay-bin/mktdrawlottery";
        }
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412093e = a17;
        r45.xf0 xf0Var = (r45.xf0) a17.f70710a.f70684a;
        xf0Var.f390047d = str;
        xf0Var.f390048e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMktDrawLottery", "NetSceneMktDrawLottery, drawLotteryParams: %s, drawLotteryType: %s, isF2f: %s", str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412094f = u0Var;
        return dispatch(sVar, this.f412093e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return this.f412095g ? 1859 : 2547;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMktDrawLottery", "onGYNetEnd netId: %s, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f412092d = (r45.yf0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f412094f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
