package ek2;

/* loaded from: classes.dex */
public final class u1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253549u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.t1 f253550v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(long j17, long j18, java.lang.String audienceUsername, r45.hx0 finderCmdItem, ek2.t1 callback) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(audienceUsername, "audienceUsername");
        kotlin.jvm.internal.o.g(finderCmdItem, "finderCmdItem");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253549u = "Finder.CgiFinderLiveModifyShopShelf";
        this.f253550v = callback;
        r45.n12 n12Var = new r45.n12();
        n12Var.set(3, java.lang.Long.valueOf(j17));
        n12Var.set(2, java.lang.Long.valueOf(j18));
        n12Var.set(5, xy2.c.f(this.f16135n));
        n12Var.set(1, db2.t4.f228171a.a(6675));
        n12Var.set(4, finderCmdItem);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = n12Var;
        r45.o12 o12Var = new r45.o12();
        o12Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) o12Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = o12Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivemodshopshelf";
        lVar.f70667d = 6675;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init ");
        sb6.append(n12Var.getLong(3));
        sb6.append(',');
        r45.hx0 hx0Var = (r45.hx0) n12Var.getCustom(4);
        sb6.append(hx0Var != null ? java.lang.Integer.valueOf(hx0Var.getInteger(0)) : null);
        sb6.append(',');
        sb6.append(n12Var.getString(5));
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveModifyShopShelf", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.o12 resp = (r45.o12) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253549u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        dk2.x2 x2Var = (dk2.x2) this.f253550v;
        x2Var.getClass();
        pm0.v.X(new dk2.w2(i17, i18, x2Var.f234298a, resp, str, x2Var.f234299b, x2Var.f234300c));
    }
}
