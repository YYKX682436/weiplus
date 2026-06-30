package su4;

/* loaded from: classes.dex */
public class l1 extends su4.a implements com.tencent.mm.network.l0 {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412980i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412981m;

    /* renamed from: n, reason: collision with root package name */
    public r45.qn3 f412982n;

    public l1(su4.r1 r1Var) {
        this.f412805g = r1Var.f413085y;
        r45.pn3 pn3Var = new r45.pn3();
        pn3Var.f383225d = r1Var.f413066f;
        pn3Var.f383226e = r1Var.B;
        pn3Var.f383227f = com.tencent.mm.plugin.websearch.l2.a(0);
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(r1Var.f413066f), r1Var.B};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneGetSearchResult", "create NetSceneGetSearchResult scene:%s requestKey:%s", objArr);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1003;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/getsearchresult";
        lVar.f70664a = pn3Var;
        lVar.f70665b = new r45.qn3();
        this.f412981m = lVar.a();
    }

    @Override // su4.a
    public java.lang.String H() {
        r45.qn3 qn3Var = this.f412982n;
        if (qn3Var != null) {
            return qn3Var.f384106d;
        }
        return null;
    }

    @Override // su4.a
    public int J() {
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412980i = u0Var;
        return dispatch(sVar, this.f412981m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1003;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneGetSearchResult", "netId: %s errType:%s errCode:%s errMsg:%s", objArr);
        if (i18 == 0 && i19 == 0) {
            this.f412982n = (r45.qn3) this.f412981m.f70711b.f70700a;
        }
        this.f412980i.onSceneEnd(i18, i19, str, this);
    }
}
