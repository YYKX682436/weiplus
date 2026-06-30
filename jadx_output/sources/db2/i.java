package db2;

/* loaded from: classes2.dex */
public final class i extends az2.j {
    public i(r45.qt2 qt2Var, long j17, long j18, long j19, com.tencent.mm.protobuf.g gVar) {
        super(qt2Var, null, 2, null);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.fa1 fa1Var = new r45.fa1();
        fa1Var.set(1, db2.t4.f228171a.b(15018, qt2Var));
        fa1Var.set(4, java.lang.Long.valueOf(j17));
        fa1Var.set(2, java.lang.Long.valueOf(j18));
        fa1Var.set(3, java.lang.Long.valueOf(j19));
        if (gVar != null) {
            fa1Var.set(5, gVar);
        }
        lVar.f70664a = fa1Var;
        r45.ga1 ga1Var = new r45.ga1();
        ga1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) ga1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = ga1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetsubtitle";
        lVar.f70667d = 15018;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFInderGetSubtitle", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.ga1 resp = (r45.ga1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFInderGetSubtitle", "onCgiEnd " + resp);
    }
}
