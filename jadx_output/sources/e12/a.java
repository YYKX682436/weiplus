package e12;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f246402d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f246403e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Long f246404f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f246405g;

    public a(com.tencent.mm.protobuf.g discountCouponParams) {
        kotlin.jvm.internal.o.g(discountCouponParams, "discountCouponParams");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ry5();
        lVar.f70665b = new r45.sy5();
        lVar.f70666c = "/cgi-bin/mmpay-bin/mktsendaward";
        lVar.f70667d = 2812;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f246402d = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SendAwardRequest");
        ((r45.ry5) fVar).f385304d = discountCouponParams;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f246403e = callback;
        return dispatch(dispatcher, this.f246402d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2812;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAcceptCoupon", "onGYNetEnd errType: %s, errCode: %s, errMsg: %s.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.protobuf.f fVar = this.f246402d.f70711b.f70700a;
        r45.sy5 sy5Var = fVar instanceof r45.sy5 ? (r45.sy5) fVar : null;
        this.f246404f = sy5Var != null ? java.lang.Long.valueOf(sy5Var.f386018d) : null;
        this.f246405g = sy5Var != null ? sy5Var.f386019e : null;
        com.tencent.mm.modelbase.u0 u0Var = this.f246403e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }
}
