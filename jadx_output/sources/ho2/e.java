package ho2;

/* loaded from: classes4.dex */
public final class e extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final r45.cs0 f282867t;

    public e(r45.qt2 qt2Var, java.lang.String str, int i17, int i18, int i19) {
        super(null, null, 3, null);
        r45.cs0 cs0Var = new r45.cs0();
        this.f282867t = cs0Var;
        cs0Var.f371802d = db2.t4.f228171a.b(8732, qt2Var);
        cs0Var.f371803e = str;
        cs0Var.f371804f = i17;
        cs0Var.f371805g = i18;
        cs0Var.f371807i = java.lang.String.valueOf(i19);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = cs0Var;
        r45.ds0 ds0Var = new r45.ds0();
        ds0Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = ds0Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = ds0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/fetchfindersubscribemembershippaybill";
        lVar.f70667d = 8732;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ds0 resp = (r45.ds0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Cgi.FinderFetchSubscribeMembershipPayBillCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + " inletSource=" + this.f282867t.f371807i);
    }
}
