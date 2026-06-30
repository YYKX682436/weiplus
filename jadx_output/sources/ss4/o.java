package ss4;

/* loaded from: classes2.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.di3 f412112d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f412113e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412114f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412115g;

    public o(java.lang.String str, boolean z17) {
        this.f412113e = z17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ci3();
        lVar.f70665b = new r45.di3();
        if (z17) {
            lVar.f70667d = 2803;
            lVar.f70666c = "/cgi-bin/mmpay-bin/mktgetf2flottery";
        } else {
            lVar.f70667d = 2508;
            lVar.f70666c = "/cgi-bin/mmpay-bin/mktgetlottery";
        }
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412114f = a17;
        ((r45.ci3) a17.f70710a.f70684a).f371573d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMktGetLottery", "NetSceneMktGetLottery, getLotteryParams: %s, isF2f: %s", str, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412115g = u0Var;
        return dispatch(sVar, this.f412114f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return this.f412113e ? 2803 : 2508;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMktGetLottery", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f412112d = (r45.di3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f412115g;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
