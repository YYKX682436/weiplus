package sm4;

/* loaded from: classes.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f409922d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f409923e;

    /* renamed from: f, reason: collision with root package name */
    public final long f409924f = java.lang.System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f409925g;

    public a(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2582;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/searchwebcomm";
        lVar.f70664a = new r45.d97();
        lVar.f70665b = new r45.e97();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f409923e = a17;
        r45.d97 d97Var = (r45.d97) a17.f70710a.f70684a;
        d97Var.f372259d = str2;
        d97Var.f372260e = str;
        this.f409925g = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f409922d = u0Var;
        return dispatch(sVar, this.f409923e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2582;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.NetSceneSearchWebComm", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f409924f));
        this.f409922d.onSceneEnd(i18, i19, str, this);
    }
}
