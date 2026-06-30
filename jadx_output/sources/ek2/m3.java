package ek2;

/* loaded from: classes.dex */
public final class m3 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253505g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253506h;

    /* renamed from: i, reason: collision with root package name */
    public int f253507i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(int i17, long j17, long j18, java.lang.String objectNonceId, com.tencent.mm.protobuf.g gVar) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 22440;
        r45.gu1 gu1Var = new r45.gu1();
        gu1Var.set(3, java.lang.Integer.valueOf(i17));
        gu1Var.set(1, db2.t4.f228171a.a(22440));
        gu1Var.set(2, xy2.c.f(this.f16154d));
        gu1Var.set(4, java.lang.Long.valueOf(j17));
        gu1Var.set(5, java.lang.Long.valueOf(j18));
        gu1Var.set(7, gVar);
        gu1Var.set(6, objectNonceId);
        lVar.f70664a = gu1Var;
        lVar.f70665b = new r45.hu1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetprizehistory";
        this.f253505g = lVar.a();
        com.tencent.mars.xlog.Log.i("NetSceneFinderLiveLotteryHistory", "NetSceneFinderLiveLotteryHistory init, finderUsername = " + gu1Var.getString(2) + ", liveId = " + j17 + ", objectId = " + j18 + ", objectNonceId = " + objectNonceId + ", scene = " + i17 + ",  lastBuffer = " + gVar);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("NetSceneFinderLiveLotteryHistory", "onGYNetEnd, errType:" + i18 + ", errCode:" + i19 + ", errMsg:" + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f253506h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f253506h = u0Var;
        return dispatch(sVar, this.f253505g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 22440;
    }
}
