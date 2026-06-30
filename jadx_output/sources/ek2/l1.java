package ek2;

/* loaded from: classes3.dex */
public final class l1 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253494u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.k1 f253495v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(long j17, long j18, java.lang.String finderUsername, java.lang.String stockId, int i17, int i18, long j19, ek2.k1 callback) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(stockId, "stockId");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253494u = "Finder.CgiFinderLiveIssueCoupon";
        this.f253495v = callback;
        r45.rw1 rw1Var = new r45.rw1();
        rw1Var.set(1, db2.t4.f228171a.a(5941));
        rw1Var.set(4, java.lang.Long.valueOf(j17));
        rw1Var.set(3, java.lang.Long.valueOf(j18));
        rw1Var.set(2, finderUsername);
        rw1Var.set(5, stockId);
        rw1Var.set(6, java.lang.Integer.valueOf(i17));
        rw1Var.set(7, java.lang.Integer.valueOf(i18));
        rw1Var.set(8, java.lang.Long.valueOf(j19));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = rw1Var;
        r45.sw1 sw1Var = new r45.sw1();
        sw1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) sw1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = sw1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveissuecoupon";
        lVar.f70667d = 5941;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveIssueCoupon", "init " + rw1Var.getLong(4) + ", " + rw1Var.getString(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.sw1 resp = (r45.sw1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253494u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        dk2.v2 v2Var = (dk2.v2) this.f253495v;
        v2Var.getClass();
        pm0.v.X(new dk2.u2(i17, i18, v2Var.f234228a, str, resp));
    }
}
