package su4;

/* loaded from: classes.dex */
public class k1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412974d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412975e;

    /* renamed from: f, reason: collision with root package name */
    public r45.aa7 f412976f;

    /* renamed from: g, reason: collision with root package name */
    public final su4.r1 f412977g;

    public k1(su4.r1 r1Var) {
        this.f412977g = r1Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4384;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/emojichatsearch";
        lVar.f70664a = new r45.z97();
        lVar.f70665b = new r45.aa7();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412975e = a17;
        r1Var.a((r45.z97) a17.f70710a.f70684a, 10, su4.r2.i(), su4.r2.g());
        su4.k2.d(r1Var.f413066f, r1Var.f413082v, r1Var.f413083w, r1Var.f413067g, r1Var.f413063c, r1Var.f413061a == 1, r1Var.f413085y, r1Var.f413062b, r1Var.f413064d);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412974d = u0Var;
        return dispatch(sVar, this.f412975e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4384;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneEmojiSearch", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        r45.aa7 aa7Var = (r45.aa7) this.f412975e.f70711b.f70700a;
        this.f412976f = aa7Var;
        su4.r1 r1Var = this.f412977g;
        if (i18 != 0 || i19 != 0) {
            su4.k2.e(r1Var.f413066f, r1Var.f413082v, r1Var.f413083w, r1Var.f413067g, r1Var.f413063c, r1Var.f413061a == 1, r1Var.f413085y, false, r1Var.f413062b, r1Var.f413064d);
        } else if (aa7Var != null) {
            su4.k2.e(r1Var.f413066f, r1Var.f413082v, r1Var.f413083w, r1Var.f413067g, r1Var.f413063c, r1Var.f413061a == 1, r1Var.f413085y, true, r1Var.f413062b, r1Var.f413064d);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f412974d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
