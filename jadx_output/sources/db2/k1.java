package db2;

/* loaded from: classes.dex */
public final class k1 extends az2.j {
    public k1(com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(null, null, 3, null);
        r45.e91 e91Var = new r45.e91();
        e91Var.set(1, db2.t4.f228171a.b(14144, qt2Var));
        e91Var.set(2, gVar);
        r45.f91 f91Var = new r45.f91();
        f91Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) f91Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = e91Var;
        lVar.f70665b = f91Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetpaidcollectionlist";
        lVar.f70667d = 14144;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetCollectionList", "init lastBuffer:" + gVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.f91 resp = (r45.f91) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderGetCollectionList", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
        java.util.LinkedList<r45.do2> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getCollection_info(...)");
        for (r45.do2 do2Var : list) {
            r45.uz0 uz0Var = (r45.uz0) do2Var.getCustom(0);
            if (uz0Var != null) {
                cu2.g0 g0Var = cu2.g0.f222404a;
                g0Var.c(g0Var.e(uz0Var));
            }
            r45.n11 n11Var = (r45.n11) do2Var.getCustom(1);
            if (n11Var != null) {
                cu2.g0 g0Var2 = cu2.g0.f222404a;
                com.tencent.mm.plugin.finder.storage.ak0 ak0Var = new com.tencent.mm.plugin.finder.storage.ak0();
                ak0Var.field_topic_id = n11Var.getLong(0);
                ak0Var.field_dramaInfo = n11Var;
                ak0Var.field_courseInfo = new r45.uz0();
                g0Var2.c(ak0Var);
            }
        }
    }
}
