package ly2;

/* loaded from: classes.dex */
public final class c extends az2.j {
    public c(java.lang.String str, com.tencent.mm.protobuf.g gVar, long j17) {
        super(null, null, 3, null);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.iv1 iv1Var = new r45.iv1();
        iv1Var.set(1, db2.t4.f228171a.a(7485));
        iv1Var.set(3, str);
        iv1Var.set(2, gVar);
        iv1Var.set(4, java.lang.Long.valueOf(j17));
        lVar.f70664a = iv1Var;
        r45.jv1 jv1Var = new r45.jv1();
        jv1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) jv1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = jv1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivegetvotinghistory";
        lVar.f70667d = 7485;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[CgiFinderLiveGetVotingHistory] init username=");
        sb6.append(str);
        sb6.append(", objectId=");
        sb6.append(j17);
        sb6.append(", hasLastBuffer=");
        sb6.append(gVar != null);
        com.tencent.mars.xlog.Log.i("CgiFinderLiveGetVotingHistory", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.jv1 resp = (r45.jv1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderLiveGetVotingHistory", "[CgiFinderLiveGetVotingHistory] CgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
