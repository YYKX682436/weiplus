package su4;

/* loaded from: classes.dex */
public class t1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413098d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413099e;

    /* renamed from: f, reason: collision with root package name */
    public r45.aa7 f413100f;

    /* renamed from: g, reason: collision with root package name */
    public final su4.r1 f413101g;

    public t1(su4.r1 r1Var) {
        this.f413101g = r1Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4858;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/mmtagsearch";
        lVar.f70664a = new r45.z97();
        lVar.f70665b = new r45.aa7();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413099e = a17;
        r1Var.a((r45.z97) a17.f70710a.f70684a, 6, su4.r2.i(), su4.r2.g());
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413098d = u0Var;
        return dispatch(sVar, this.f413099e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4858;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneTagSearch", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f413100f = (r45.aa7) this.f413099e.f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f413098d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
