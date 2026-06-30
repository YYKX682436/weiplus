package db2;

/* loaded from: classes.dex */
public final class j extends com.tencent.mm.modelbase.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f228023m;

    public j(java.lang.String finderUsername, com.tencent.mm.protobuf.g gVar, int i17) {
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        java.lang.String concat = "Cgi.FinderAccountRecommend#".concat(finderUsername);
        this.f228023m = concat;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ct0 ct0Var = new r45.ct0();
        ct0Var.set(1, db2.t4.f228171a.a(10027));
        ct0Var.set(2, finderUsername);
        ct0Var.set(4, gVar);
        ct0Var.set(5, java.lang.Integer.valueOf(i17));
        lVar.f70664a = ct0Var;
        lVar.f70665b = new r45.dt0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderacctrecommend";
        lVar.f70667d = 10027;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i(concat, "[CgiFinderAccountRecommend] created...");
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.dt0 resp = (r45.dt0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228023m, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }

    @Override // com.tencent.mm.modelbase.i
    public pq5.g l() {
        com.tencent.mars.xlog.Log.i(this.f228023m, "[run]...");
        pq5.g l17 = super.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        return l17;
    }
}
