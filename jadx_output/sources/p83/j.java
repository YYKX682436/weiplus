package p83;

/* loaded from: classes2.dex */
public class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352757d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.r57 f352758e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352759f = null;

    public j(java.lang.String str) {
        this.f352757d = null;
        this.f352758e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.r57();
        lVar.f70665b = new r45.s57();
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/micromsg-bin/wcopurchasepackage";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352757d = a17;
        r45.r57 r57Var = (r45.r57) a17.f70710a.f70684a;
        this.f352758e = r57Var;
        r57Var.f384566d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallPurchasePackage", "NetSceneIPCallPurchasePackage ProductID:%s", str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352759f = u0Var;
        return dispatch(sVar, this.f352757d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.bio.soter.k.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallPurchasePackage", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.u0 u0Var = this.f352759f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
