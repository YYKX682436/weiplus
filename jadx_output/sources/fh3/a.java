package fh3;

/* loaded from: classes4.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f262655d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f262656e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ow4 f262657f;

    /* renamed from: g, reason: collision with root package name */
    public final int f262658g;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[1] = str == null ? "" : str;
        objArr[2] = str == null ? "" : str;
        objArr[3] = com.tencent.mm.sdk.platformtools.t8.G1(str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.openim.NetSceneOpenImNotAutoSucceed", "NetSceneNotAutoSucceed action:%s originTpusername:%s op:%s heirTpusername%s", objArr);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/notautosucceed";
        lVar.f70667d = 3713;
        lVar.f70664a = new r45.nw4();
        lVar.f70665b = new r45.ow4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f262656e = a17;
        this.f262658g = i17;
        r45.nw4 nw4Var = (r45.nw4) a17.f70710a.f70684a;
        nw4Var.f381710d = str == null ? "" : str;
        nw4Var.f381711e = str2 == null ? "" : str2;
        nw4Var.f381712f = str3 == null ? "" : str3;
        nw4Var.f381713g = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f262655d = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f262656e;
        this.f262657f = (r45.ow4) oVar.f70711b.f70700a;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3713;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.openim.NetSceneOpenImNotAutoSucceed", "onGYNetEnd:[%d,%d,%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f262655d.onSceneEnd(i18, i19, str, this);
    }
}
