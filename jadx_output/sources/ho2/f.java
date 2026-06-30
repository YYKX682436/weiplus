package ho2;

/* loaded from: classes2.dex */
public final class f extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public int f282868t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.qt2 qt2Var, com.tencent.mm.protobuf.g gVar, java.lang.String str, int i17, int i18, kotlin.jvm.internal.i iVar) {
        super(null, null, 3, null);
        qt2Var = (i18 & 1) != 0 ? null : qt2Var;
        gVar = (i18 & 2) != 0 ? null : gVar;
        str = (i18 & 4) != 0 ? null : str;
        r45.i81 i81Var = new r45.i81();
        i81Var.f376809d = db2.t4.f228171a.b(10305, qt2Var);
        i81Var.f376811f = gVar;
        i81Var.f376810e = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = i81Var;
        r45.j81 j81Var = new r45.j81();
        j81Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = j81Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = j81Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetmembercardlist";
        lVar.f70667d = 10305;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.j81 resp = (r45.j81) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Cgi.FinderGetMemberCardListCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
