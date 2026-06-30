package ho2;

/* loaded from: classes2.dex */
public final class d extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f282866t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.qt2 qt2Var, java.lang.String finderUsername, com.tencent.mm.protobuf.g gVar, int i17, kotlin.jvm.internal.i iVar) {
        super(null, null, 3, null);
        qt2Var = (i17 & 1) != 0 ? null : qt2Var;
        gVar = (i17 & 4) != 0 ? null : gVar;
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        r45.as0 as0Var = new r45.as0();
        this.f282866t = gVar;
        as0Var.f370237d = db2.t4.f228171a.b(8718, qt2Var);
        as0Var.f370238e = finderUsername;
        as0Var.f370239f = gVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = as0Var;
        r45.bs0 bs0Var = new r45.bs0();
        bs0Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = bs0Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = bs0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/fetchfindermymembershipsubscriber";
        lVar.f70667d = 8718;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.bs0 resp = (r45.bs0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Cgi.FinderFetchMyMembershipSubscriberCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
