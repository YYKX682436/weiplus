package db2;

/* loaded from: classes.dex */
public final class m2 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m2(int i17, java.lang.String reportData, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(reportData, "reportData");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4093;
        r45.ho2 ho2Var = new r45.ho2();
        ho2Var.set(1, java.lang.Integer.valueOf(i17));
        ho2Var.set(2, reportData);
        lVar.f70664a = ho2Var;
        r45.io2 io2Var = new r45.io2();
        io2Var.set(0, new r45.ie());
        lVar.f70665b = io2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpassreport";
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderPassReport", "CgiFinderPassReport " + i17 + ", " + reportData);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.io2 resp = (r45.io2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderPassReport", "CgiFinderPassReport onCgiEnd errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
    }
}
