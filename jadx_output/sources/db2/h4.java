package db2;

/* loaded from: classes2.dex */
public final class h4 extends com.tencent.mm.modelbase.i {
    public h4(java.lang.String finderUserName, int i17, com.tencent.mm.protobuf.g gVar, long j17, int i18) {
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.a61 a61Var = new r45.a61();
        a61Var.f369770e = finderUserName;
        a61Var.f369771f = i17;
        a61Var.f369773h = j17;
        a61Var.f369772g = gVar;
        a61Var.f369774i = i18;
        a61Var.f369769d = db2.t4.f228171a.a(3871);
        lVar.f70664a = a61Var;
        r45.b61 b61Var = new r45.b61();
        b61Var.setBaseResponse(new r45.ie());
        r45.ie baseResponse = b61Var.getBaseResponse();
        if (baseResponse != null) {
            baseResponse.f376960e = new r45.du5();
        }
        lVar.f70665b = b61Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfeedfavlist ";
        lVar.f70667d = 3871;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiGetFinderFeedLikedList init finderUsername=");
        sb6.append(finderUserName);
        sb6.append(" scene=");
        sb6.append(i17);
        sb6.append(" lastBuffer=");
        sb6.append(gVar != null);
        com.tencent.mars.xlog.Log.i("Finder.CgiGetFinderFeedLikedList", sb6.toString());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("Finder.CgiGetFinderFeedLikedList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + ((r45.b61) fVar) + " thread=" + java.lang.Thread.currentThread());
    }
}
