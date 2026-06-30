package ek2;

/* loaded from: classes.dex */
public final class l3 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253496g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253497h;

    public l3(long j17, long j18, java.lang.String str, com.tencent.mm.protobuf.g gVar, int i17) {
        super(null, 1, null);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4168;
        r45.a81 a81Var = new r45.a81();
        a81Var.set(1, db2.t4.f228171a.a(4168));
        a81Var.set(3, xy2.c.f(this.f16154d));
        a81Var.set(2, java.lang.Long.valueOf(j17));
        a81Var.set(4, java.lang.Long.valueOf(j18));
        a81Var.set(6, gVar);
        a81Var.set(5, str);
        a81Var.set(7, java.lang.Integer.valueOf(i17));
        lVar.f70664a = a81Var;
        lVar.f70665b = new r45.b81();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetliverewardgains";
        this.f253496g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetLiveReward", "NetSceneFinderGetLiveReward init, finderUsername = " + a81Var.getString(3) + ", liveId = " + j17 + ", objectId = " + j18 + ", objectNonceId = " + str + ",  lastBuffer = " + gVar + ", reward_type:" + i17);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetLiveReward", "onGYNetEnd, errType:" + i18 + ", errCode:" + i19 + ", errMsg:" + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f253497h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    public final java.util.LinkedList K() {
        com.tencent.mm.protobuf.f fVar = this.f253496g.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveRewardGainsResponse");
        java.util.LinkedList list = ((r45.b81) fVar).getList(5);
        return list == null ? new java.util.LinkedList() : list;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f253497h = u0Var;
        return dispatch(sVar, this.f253496g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4168;
    }
}
