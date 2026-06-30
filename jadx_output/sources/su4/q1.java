package su4;

/* loaded from: classes.dex */
public class q1 extends su4.a implements com.tencent.mm.network.l0 {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413046i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413047m;

    /* renamed from: n, reason: collision with root package name */
    public int f413048n = -1;

    /* renamed from: o, reason: collision with root package name */
    public r45.g66 f413049o;

    public q1(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, int i19, java.lang.String str5, java.lang.String str6) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.f66();
        lVar.f70665b = new r45.g66();
        lVar.f70666c = "/cgi-bin/mmsearch-bin/searchsimilaremoticon";
        lVar.f70667d = 2999;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413046i = a17;
        r45.f66 f66Var = (r45.f66) a17.f70710a.f70684a;
        f66Var.f374056d = str;
        f66Var.f374057e = i17;
        f66Var.f374059g = str2;
        f66Var.f374060h = str3;
        f66Var.f374063n = i18;
        f66Var.f374064o = str4;
        f66Var.f374061i = com.tencent.mm.plugin.websearch.l2.a(0);
        f66Var.f374058f = i19;
        f66Var.f374062m = su4.r2.i();
        f66Var.f374067r = str6;
        f66Var.f374066q = str5;
        f66Var.f374068s = su4.r2.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneQuerySimilarEmotion", "Md5 %s Offset %d SearchId %s SessionId %s Tab %s RequestId %s Scene %d", str, java.lang.Integer.valueOf(i17), str2, str3, java.lang.Integer.valueOf(i18), str4, java.lang.Integer.valueOf(i19));
    }

    @Override // su4.a
    public java.lang.String H() {
        return null;
    }

    @Override // su4.a
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413047m = u0Var;
        return dispatch(sVar, this.f413046i, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2999;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneQuerySimilarEmotion", "netId %d errType %d errCode %d %s errMsg", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f413049o = (r45.g66) this.f413046i.f70711b.f70700a;
        this.f413047m.onSceneEnd(i18, i19, str, this);
    }
}
