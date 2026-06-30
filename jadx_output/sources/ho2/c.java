package ho2;

/* loaded from: classes2.dex */
public final class c extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f282865t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(r45.qt2 qt2Var, java.lang.String finderUsername, int i17) {
        super(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        this.f282865t = finderUsername;
        r45.wr0 wr0Var = new r45.wr0();
        wr0Var.f389397d = db2.t4.f228171a.b(9537, qt2Var);
        wr0Var.f389398e = finderUsername;
        wr0Var.f389399f = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = wr0Var;
        r45.xr0 xr0Var = new r45.xr0();
        xr0Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = xr0Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = xr0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/fetchfindermemberstatus";
        lVar.f70667d = 9537;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.xr0 resp = (r45.xr0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Cgi.FinderFetchMemberStatusCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + " memberStatus=" + resp.f390351d + " visitorStatus=" + resp.f390352e + " username=" + this.f282865t);
    }

    public /* synthetic */ c(r45.qt2 qt2Var, java.lang.String str, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? null : qt2Var, str, (i18 & 4) != 0 ? 0 : i17);
    }
}
