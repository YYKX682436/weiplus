package db2;

/* loaded from: classes.dex */
public final class r0 extends az2.j {
    public r0(com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(null, null, 3, null);
        r45.m51 m51Var = new r45.m51();
        m51Var.set(1, db2.t4.f228171a.b(7394, qt2Var));
        m51Var.set(2, gVar);
        r45.n51 n51Var = new r45.n51();
        n51Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) n51Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = m51Var;
        lVar.f70665b = n51Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetcourselist";
        lVar.f70667d = 7394;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetCollectionList", "init lastBuffer:" + gVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.n51 resp = (r45.n51) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetCollectionList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        java.util.LinkedList<r45.uz0> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getCourse_info(...)");
        for (r45.uz0 uz0Var : list) {
            cu2.g0 g0Var = cu2.g0.f222404a;
            kotlin.jvm.internal.o.d(uz0Var);
            g0Var.c(g0Var.e(uz0Var));
        }
    }
}
