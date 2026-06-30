package p83;

/* loaded from: classes2.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f352740d;

    /* renamed from: e, reason: collision with root package name */
    public r45.pr3 f352741e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f352742f = null;

    public e() {
        this.f352740d = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.or3();
        lVar.f70665b = new r45.pr3();
        lVar.f70667d = 831;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getwcopackageproductlist";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f352740d = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallGetPackageProductList", "NetSceneIPCallGetPackageProductList");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f352742f = u0Var;
        return dispatch(sVar, this.f352740d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 831;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIPCallGetPackageProductList", "onGYNetEnd, errType: %d, errCode: %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f352741e = (r45.pr3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f352742f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
