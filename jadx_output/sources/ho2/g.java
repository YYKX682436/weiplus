package ho2;

/* loaded from: classes2.dex */
public final class g extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r45.qt2 qt2Var, java.lang.String finderUsername, int i17, int i18, long j17, long j18) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        r45.ei4 ei4Var = new r45.ei4();
        ei4Var.f373534d = db2.t4.f228171a.b(22720, qt2Var);
        ei4Var.f373535e = finderUsername;
        ei4Var.f373536f = i17;
        ei4Var.f373537g = i18;
        ei4Var.f373538h = j17;
        ei4Var.f373539i = j18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ei4Var;
        r45.fi4 fi4Var = new r45.fi4();
        fi4Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = fi4Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = fi4Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/managefindermemberuser";
        lVar.f70667d = 22720;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.fi4 resp = (r45.fi4) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Cgi.FinderManagerMemberUserCgi", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread());
    }
}
