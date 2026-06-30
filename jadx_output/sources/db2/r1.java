package db2;

/* loaded from: classes.dex */
public final class r1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228139t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(java.lang.String finderUsername, long j17, long j18, int i17, java.lang.String ecSource, java.lang.String productCardKey, int i18) {
        super(null, null, 2, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(ecSource, "ecSource");
        kotlin.jvm.internal.o.g(productCardKey, "productCardKey");
        this.f228139t = "Finder.CgiFinderGetShareProductInfo";
        r45.da1 da1Var = new r45.da1();
        da1Var.set(1, db2.t4.f228171a.b(4117, null));
        da1Var.set(2, finderUsername);
        da1Var.set(3, java.lang.Long.valueOf(j17));
        da1Var.set(4, java.lang.Long.valueOf(j18));
        da1Var.set(5, java.lang.Integer.valueOf(i17));
        da1Var.set(9, ecSource);
        da1Var.set(10, java.lang.Integer.valueOf(i18));
        da1Var.set(11, productCardKey);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = da1Var;
        r45.ea1 ea1Var = new r45.ea1();
        ea1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ea1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ea1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetshareproductinfo";
        lVar.f70667d = 4117;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetShareProductInfo", "init finderUsername:" + finderUsername + ", objectId:" + pm0.v.u(j17) + ", productId:" + pm0.v.u(j18) + ", shareScene:" + i17 + " reqType:" + i18);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ea1 resp = (r45.ea1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228139t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}
