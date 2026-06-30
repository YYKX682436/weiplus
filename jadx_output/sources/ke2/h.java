package ke2;

/* loaded from: classes.dex */
public final class h extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306953t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.jl1 f306954u;

    public h(int i17, com.tencent.mm.protobuf.g gVar, long j17, long j18, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        this.f306953t = "CgiFinderLiveAudienceOpFanClub";
        r45.jl1 jl1Var = new r45.jl1();
        this.f306954u = jl1Var;
        jl1Var.set(1, db2.t4.f228171a.a(4143));
        jl1Var.set(2, xy2.c.f(qt2Var));
        jl1Var.set(3, java.lang.Integer.valueOf(i17));
        jl1Var.set(4, gVar);
        jl1Var.set(5, java.lang.Long.valueOf(j17));
        jl1Var.set(6, java.lang.Long.valueOf(j18));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = jl1Var;
        r45.kl1 kl1Var = new r45.kl1();
        kl1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) kl1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = kl1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveaudienceopfanclub";
        lVar.f70667d = 4143;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderLiveAudienceOpFanClub", "init " + jl1Var.getString(2) + ',' + jl1Var.getInteger(3) + ',' + jl1Var.getByteString(4) + ',' + jl1Var.getLong(5) + ',' + jl1Var.getLong(6));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.kl1 resp = (r45.kl1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306953t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }

    @Override // az2.j
    public java.util.List s() {
        return kz5.b0.c(new jz5.l("op_code", java.lang.String.valueOf(this.f306954u.getInteger(3))));
    }
}
