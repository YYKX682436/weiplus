package ke2;

/* loaded from: classes.dex */
public final class p extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f306979t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String anchorFinderUserName, com.tencent.mm.protobuf.g gVar, long j17, long j18, java.lang.String str, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(anchorFinderUserName, "anchorFinderUserName");
        this.f306979t = "CgiFinderLiveFanClubGetIntimacy";
        r45.cq1 cq1Var = new r45.cq1();
        cq1Var.set(1, db2.t4.f228171a.a(5985));
        cq1Var.set(2, anchorFinderUserName);
        cq1Var.set(3, gVar);
        cq1Var.set(5, java.lang.Long.valueOf(j17));
        cq1Var.set(4, java.lang.Long.valueOf(j18));
        cq1Var.set(6, str);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = cq1Var;
        r45.dq1 dq1Var = new r45.dq1();
        dq1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) dq1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = dq1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivefanclubgetintimacy";
        lVar.f70667d = 5985;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderLiveFanClubGetIntimacy", "init " + cq1Var.getString(2) + ',' + cq1Var.getByteString(3) + ',' + cq1Var.getLong(5) + ',' + cq1Var.getLong(4));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.dq1 resp = (r45.dq1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f306979t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + ' ' + pm0.b0.g(resp));
    }
}
