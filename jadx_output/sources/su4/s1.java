package su4;

/* loaded from: classes.dex */
public class s1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413088d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413089e;

    /* renamed from: f, reason: collision with root package name */
    public final long f413090f = java.lang.System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f413091g;

    /* renamed from: h, reason: collision with root package name */
    public final int f413092h;

    public s1(java.lang.String str, java.lang.String str2, int i17) {
        this.f413092h = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 2975;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/searchwebquery";
        lVar.f70664a = new r45.sx5();
        lVar.f70665b = new r45.e97();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413089e = a17;
        r45.sx5 sx5Var = (r45.sx5) a17.f70710a.f70684a;
        sx5Var.f386009d = str2;
        sx5Var.f386010e = str;
        r45.e64 i18 = su4.r2.i();
        sx5Var.f386012g = i18;
        this.f413091g = str;
        if (i18 == null) {
            r45.e64 e64Var = new r45.e64();
            sx5Var.f386012g = e64Var;
            e64Var.f373053n = !su4.r2.j() ? 1 : 0;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413088d = u0Var;
        return dispatch(sVar, this.f413089e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2975;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneSearchWebQuery", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f413090f));
        this.f413088d.onSceneEnd(i18, i19, str, this);
    }
}
