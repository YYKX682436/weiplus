package su4;

/* loaded from: classes.dex */
public class x1 extends su4.a implements com.tencent.mm.network.l0 {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413132i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413133m;

    /* renamed from: n, reason: collision with root package name */
    public final su4.r1 f413134n;

    /* renamed from: o, reason: collision with root package name */
    public r45.u97 f413135o;

    public x1(su4.r1 r1Var) {
        this.f413134n = r1Var;
        this.f412805g = r1Var.f413085y;
        r45.t97 t97Var = new r45.t97();
        t97Var.f386223e = 1;
        t97Var.f386222d = r1Var.C;
        this.f413135o = new r45.u97();
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(r1Var.f413066f), r1Var.B};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSearchAiScanImageRetrieval", "create NetSceneWebSearchAiScanImageRetrieval scene:%s requestKey:%s", objArr);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1532;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/aiscan_image_retrieval";
        lVar.f70664a = t97Var;
        lVar.f70665b = this.f413135o;
        this.f413133m = lVar.a();
    }

    @Override // su4.a
    public java.lang.String H() {
        return this.f413135o.f387163d;
    }

    @Override // su4.a
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413132i = u0Var;
        return dispatch(sVar, this.f413133m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1532;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneWebSearchAiScanImageRetrieval", "netId: %s errType:%s errCode:%s errMsg:%s", objArr);
        if (i18 == 0 || i19 == 0) {
            this.f413135o = (r45.u97) this.f413133m.f70711b.f70700a;
        }
        this.f413132i.onSceneEnd(i18, i19, str, this);
    }
}
