package ly2;

/* loaded from: classes.dex */
public final class b extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, long j18, java.lang.String objectNonceId, r45.le2 le2Var, int i17) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.jo1 jo1Var = new r45.jo1();
        jo1Var.set(1, db2.t4.f228171a.a(9620));
        jo1Var.set(2, java.lang.Long.valueOf(j17));
        jo1Var.set(3, java.lang.Long.valueOf(j18));
        jo1Var.set(4, objectNonceId);
        jo1Var.set(5, le2Var);
        jo1Var.set(6, java.lang.Integer.valueOf(i17));
        lVar.f70664a = jo1Var;
        r45.ko1 ko1Var = new r45.ko1();
        ko1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ko1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ko1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivecreatevoting";
        lVar.f70667d = 9620;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderLiveCreateVoting", "[CgiFinderLiveCreateVoting] feedId=" + j18 + " liveId=" + j17 + ' ');
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ko1 resp = (r45.ko1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderLiveCreateVoting", "[CgiFinderLiveCreateVoting] CgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
