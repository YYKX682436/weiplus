package ke2;

/* loaded from: classes.dex */
public final class l extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306963t;

    /* renamed from: u, reason: collision with root package name */
    public final ke2.k f306964u;

    public l(int i17, long j17, ke2.k kVar) {
        super(null, null, 3, null);
        this.f306963t = "Finder.CgiFinderLiveClearAliasRole";
        this.f306964u = kVar;
        r45.pn1 pn1Var = new r45.pn1();
        pn1Var.set(1, db2.t4.f228171a.a(4020));
        pn1Var.set(2, java.lang.Integer.valueOf(i17));
        pn1Var.getLong(3);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = pn1Var;
        r45.qn1 qn1Var = new r45.qn1();
        qn1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) qn1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = qn1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveclearaliasrole";
        lVar.f70667d = 4020;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init live_identity:");
        r45.kv0 kv0Var = (r45.kv0) pn1Var.getCustom(1);
        sb6.append(kv0Var != null ? java.lang.Integer.valueOf(kv0Var.getInteger(6)) : null);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveClearAliasRole", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.qn1 resp = (r45.qn1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306963t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
        ke2.k kVar = this.f306964u;
        if (i17 == 0 && i18 == 0) {
            if (kVar != null) {
                pm0.v.X(new com.tencent.mm.plugin.finder.live.viewmodel.p9(((com.tencent.mm.plugin.finder.live.viewmodel.q9) kVar).f117349a));
            }
        } else if (kVar != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.viewmodel.o9(i18, ((com.tencent.mm.plugin.finder.live.viewmodel.q9) kVar).f117349a));
        }
    }
}
