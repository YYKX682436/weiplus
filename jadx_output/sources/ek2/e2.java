package ek2;

/* loaded from: classes.dex */
public final class e2 extends ek2.g0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f253442u;

    /* renamed from: v, reason: collision with root package name */
    public final ek2.d2 f253443v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(long j17, long j18, java.lang.String str, java.lang.String audienceUsername, long j19, int i17, int i18, int i19, r45.qt2 qt2Var, int i27, ek2.d2 d2Var) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(audienceUsername, "audienceUsername");
        this.f253442u = "Finder.CgiFinderLivePromoteProduct";
        this.f253443v = d2Var;
        r45.g52 g52Var = new r45.g52();
        g52Var.set(3, java.lang.Long.valueOf(j17));
        g52Var.set(4, java.lang.Long.valueOf(j18));
        g52Var.set(2, audienceUsername);
        g52Var.set(5, java.lang.Long.valueOf(j19));
        r45.y46 y46Var = new r45.y46();
        y46Var.set(0, java.lang.Long.valueOf(j19));
        y46Var.set(1, java.lang.Integer.valueOf(i27));
        g52Var.set(14, y46Var);
        g52Var.set(6, java.lang.Integer.valueOf(i18));
        g52Var.set(8, java.lang.Integer.valueOf(i17));
        g52Var.set(13, java.lang.Integer.valueOf(i19));
        db2.t4 t4Var = db2.t4.f228171a;
        g52Var.set(1, t4Var.a(5800));
        t4Var.h((r45.kv0) g52Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(j18), str)));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = g52Var;
        r45.h52 h52Var = new r45.h52();
        h52Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) h52Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = h52Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivepromoteproduct";
        lVar.f70667d = 5800;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLivePromoteProduct", "CgiFinderLivePromoteProduct init " + g52Var.getLong(3) + ',' + g52Var.getString(2) + ",productId:" + g52Var.getLong(5) + ",ad_id:" + g52Var.getLong(9) + ",promoteType:" + g52Var.getInteger(8) + ",scene:" + g52Var.getInteger(6));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.h52 resp = (r45.h52) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f253442u, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ek2.d2 d2Var = this.f253443v;
        if (d2Var != null) {
            d2Var.a(i17, i18, str, resp);
        }
    }
}
