package ek2;

/* loaded from: classes.dex */
public final class h0 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(long j17, long j18, int i17, java.lang.String reportData) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(reportData, "reportData");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ce1 ce1Var = new r45.ce1();
        ce1Var.set(1, db2.t4.f228171a.a(8488));
        ce1Var.set(3, java.lang.Long.valueOf(j18));
        ce1Var.set(4, java.lang.Integer.valueOf(i17));
        ce1Var.set(2, java.lang.Long.valueOf(j17));
        ce1Var.set(5, reportData);
        lVar.f70664a = ce1Var;
        r45.de1 de1Var = new r45.de1();
        de1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) de1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = de1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveadreport";
        lVar.f70667d = 8488;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderLiveAdReport", "[CgiFinderLiveAdReport] feedId=" + j17 + " liveId=" + j18 + " scene=" + i17);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.de1 resp = (r45.de1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderLiveAdReport", "[CgiFinderLiveAdReport] failed errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
