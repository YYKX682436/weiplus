package db2;

/* loaded from: classes.dex */
public final class l1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public int f228052t;

    public l1(r45.qt2 qt2Var, java.lang.String str, com.tencent.mm.protobuf.g gVar, int i17, int i18) {
        super(qt2Var, null, 2, null);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.i91 i91Var = new r45.i91();
        db2.t4 t4Var = db2.t4.f228171a;
        i91Var.set(1, t4Var.b(13571, qt2Var));
        i91Var.set(2, str);
        i91Var.set(3, gVar);
        i91Var.set(5, java.lang.Integer.valueOf(i17));
        i91Var.set(6, java.lang.Integer.valueOf(i18));
        i91Var.set(4, t4Var.n());
        lVar.f70664a = i91Var;
        r45.j91 j91Var = new r45.j91();
        j91Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) j91Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = j91Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetpostplaysquarecontainer";
        lVar.f70667d = 13571;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderGetPostPlaySquareContainer", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list;
        r45.j91 resp = (r45.j91) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderGetPostPlaySquareContainer", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
        if (i17 == 0 && i18 == 0 && (list = resp.getList(1)) != null) {
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.d(finderObject);
                o3Var.cl(finderObject, this.f16135n);
            }
        }
    }
}
