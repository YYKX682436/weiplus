package ho2;

/* loaded from: classes4.dex */
public final class i extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r45.qt2 qt2Var, java.lang.String finderUsername, java.lang.String query, com.tencent.mm.protobuf.g gVar) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(query, "query");
        r45.pu2 pu2Var = new r45.pu2();
        pu2Var.f383406d = db2.t4.f228171a.b(7645, qt2Var);
        pu2Var.f383407e = finderUsername;
        byte[] bytes = query.getBytes(r26.c.f368865a);
        kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
        pu2Var.f383408f = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
        pu2Var.f383409g = gVar;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = pu2Var;
        r45.qu2 qu2Var = new r45.qu2();
        qu2Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = qu2Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = qu2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findersearchmemberzone";
        lVar.f70667d = 7645;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.qu2 resp = (r45.qu2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Cgi.FinderSearchMemberZoneCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
