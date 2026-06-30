package lr1;

/* loaded from: classes2.dex */
public class h0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f320672d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f320673e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f320674f;

    /* renamed from: g, reason: collision with root package name */
    public final long f320675g;

    /* renamed from: h, reason: collision with root package name */
    public r45.yw5 f320676h;

    /* renamed from: i, reason: collision with root package name */
    public final int f320677i;

    public h0(java.lang.String str, long j17, int i17) {
        this.f320674f = str;
        this.f320675g = j17;
        this.f320677i = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchHomePageNew", "Constructors: keyword (%s) , businessType (%d), scene (%d)", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchHomePageNew", "doScene");
        this.f320672d = u0Var;
        java.lang.String str = this.f320674f;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSearchHomePageNew", "keyword is unavailable");
            return -1;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1070;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/bizsearch/homepage";
        lVar.f70664a = new r45.xw5();
        lVar.f70665b = new r45.yw5();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f320673e = a17;
        r45.xw5 xw5Var = (r45.xw5) a17.f70710a.f70684a;
        xw5Var.f390559e = str;
        xw5Var.f390560f = lr1.o.a();
        long j17 = this.f320675g;
        xw5Var.f390558d = j17;
        xw5Var.f390561g = this.f320677i;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchHomePageNew", "businessTypeList is %d", java.lang.Long.valueOf(j17));
        return dispatch(sVar, this.f320673e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1070;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.o oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSearchHomePageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0 && (oVar = this.f320673e) != null) {
            this.f320676h = (r45.yw5) oVar.f70711b.f70700a;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f320672d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
