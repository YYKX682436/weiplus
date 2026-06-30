package db2;

/* loaded from: classes.dex */
public final class o1 extends az2.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(r45.qt2 qt2Var, java.lang.String str, java.lang.String jumpInfoNativeByPassInfo) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(jumpInfoNativeByPassInfo, "jumpInfoNativeByPassInfo");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.u91 u91Var = new r45.u91();
        u91Var.set(1, db2.t4.f228171a.b(8755, qt2Var));
        u91Var.set(2, str);
        u91Var.set(4, jumpInfoNativeByPassInfo);
        lVar.f70664a = u91Var;
        r45.v91 v91Var = new r45.v91();
        v91Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) v91Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = v91Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetrecommendreasonheader";
        lVar.f70667d = 16734;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderGetRecommendReasonHeader", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.v91 resp = (r45.v91) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderGetRecommendReasonHeader", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
    }
}
