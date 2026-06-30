package y92;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f460333d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f460334e;

    public c(java.lang.String shortUrl) {
        kotlin.jvm.internal.o.g(shortUrl, "shortUrl");
        r45.la1 la1Var = new r45.la1();
        la1Var.set(1, db2.t4.f228171a.a(6277));
        la1Var.set(7, shortUrl);
        this.f460333d = y92.b.f460331u.a(la1Var);
        com.tencent.mars.xlog.Log.i("NetSceneFinderGetTopicInfo", "[init] shortUrl:".concat(shortUrl));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f460334e = u0Var;
        return dispatch(sVar, this.f460333d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6277;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("NetSceneFinderGetTopicInfo", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f460334e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
