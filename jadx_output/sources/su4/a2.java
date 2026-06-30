package su4;

/* loaded from: classes8.dex */
public class a2 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412808d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412809e;

    /* renamed from: f, reason: collision with root package name */
    public final int f412810f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f412811g;

    public a2(r45.lq5 lq5Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1134;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/searchreport";
        lVar.f70664a = lq5Var;
        lVar.f70665b = new r45.mq5();
        this.f412809e = lVar.a();
        this.f412810f = lq5Var.f379743d;
        this.f412811g = lq5Var.f379756t;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        int i17 = this.f412810f;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.NetSceneWebSearchReport", "doScene %d", java.lang.Integer.valueOf(i17));
        su4.k3.e(5);
        su4.k3.g(i17, 4, 0, 0, this.f412811g);
        this.f412808d = u0Var;
        return dispatch(sVar, this.f412809e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1134;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.NetSceneWebSearchReport", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f412808d.onSceneEnd(i18, i19, str, this);
            su4.k3.e(7);
        } else {
            this.f412808d.onSceneEnd(i18, i19, str, this);
            su4.k3.e(6);
            su4.k3.g(this.f412810f, 5, i18, i19, this.f412811g);
        }
    }
}
