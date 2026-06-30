package db2;

/* loaded from: classes.dex */
public final class q1 extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f228124o;

    public q1(int i17, int i18, java.lang.String str) {
        super(null, 1, null);
        this.f228124o = "Finder.CgiFinderGetSelfHistoryList";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.g91 g91Var = new r45.g91();
        g91Var.set(2, str);
        g91Var.set(3, java.lang.Integer.valueOf(i17));
        g91Var.set(4, java.lang.Integer.valueOf(i18));
        g91Var.set(1, db2.t4.f228171a.a(7011));
        lVar.f70664a = g91Var;
        lVar.f70667d = 7011;
        lVar.f70665b = new r45.h91();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetplaylist";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetSelfHistoryList", "CgiFinderGetSelfHistoryList tabType: " + i17 + ", itemType: " + i18);
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.h91 resp = (r45.h91) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228124o, "errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
    }
}
