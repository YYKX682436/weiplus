package ho2;

/* loaded from: classes2.dex */
public final class a extends bq.e {

    /* renamed from: o, reason: collision with root package name */
    public final int f282862o;

    /* renamed from: p, reason: collision with root package name */
    public final int f282863p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r45.qt2 qt2Var, java.lang.String finderUsername, java.lang.String finderMemberTicket, int i17, com.tencent.mm.protobuf.g gVar, int i18) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(finderMemberTicket, "finderMemberTicket");
        this.f282862o = i17;
        this.f282863p = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.qr0 qr0Var = new r45.qr0();
        qr0Var.f384218d = db2.t4.f228171a.b(7439, qt2Var);
        qr0Var.f384219e = finderUsername;
        qr0Var.f384220f = finderMemberTicket;
        qr0Var.f384221g = gVar;
        qr0Var.f384222h = i17;
        lVar.f70664a = qr0Var;
        r45.rr0 rr0Var = new r45.rr0();
        rr0Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = rr0Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = rr0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/fetchfindermemberfeedpreview";
        lVar.f70667d = 7439;
        p(lVar.a());
    }

    @Override // bq.e
    public void s(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.rr0 resp = (r45.rr0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("FinderFetchMemberFeedPreviewCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
