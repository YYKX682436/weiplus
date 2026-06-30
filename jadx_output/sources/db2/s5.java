package db2;

/* loaded from: classes2.dex */
public final class s5 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228154d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228155e;

    public s5(java.lang.String shortUrl) {
        kotlin.jvm.internal.o.g(shortUrl, "shortUrl");
        r45.ho3 ho3Var = new r45.ho3();
        ho3Var.set(1, db2.t4.f228171a.a(6963));
        ho3Var.set(6, shortUrl);
        ho3Var.set(3, 3);
        ho3Var.set(5, 11);
        ho3Var.set(4, java.lang.Integer.valueOf(com.tencent.maas.MJMaasVersion.VERSION_NUMBER_INT_VALUE));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ho3Var;
        lVar.f70667d = 6963;
        lVar.f70665b = new r45.io3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findertemplategetspecific";
        this.f228154d = lVar.a();
        com.tencent.mars.xlog.Log.i("NetSceneFinderGetSpecificTemplate", "[init] shortUrl:".concat(shortUrl));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228155e = u0Var;
        return dispatch(sVar, this.f228154d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6963;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("NetSceneFinderGetSpecificTemplate", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f228155e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
