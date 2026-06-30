package db2;

/* loaded from: classes.dex */
public final class p1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public int f228110t;

    public p1(r45.qt2 qt2Var, java.lang.String str, com.tencent.mm.protobuf.g gVar, java.lang.Integer num, long j17, java.lang.String str2) {
        super(qt2Var, null, 2, null);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.w91 w91Var = new r45.w91();
        db2.t4 t4Var = db2.t4.f228171a;
        r45.kv0 b17 = t4Var.b(21396, qt2Var);
        if (j17 != 0) {
            if (!(str2 == null || str2.length() == 0)) {
                java.util.LinkedList list = b17.getList(7);
                if (list != null) {
                    r45.fl2 fl2Var = new r45.fl2();
                    fl2Var.set(0, java.lang.Long.valueOf(j17));
                    fl2Var.set(1, str2);
                    list.add(fl2Var);
                }
                b17.set(1, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderGetRecommendReasonStream sourceFeedId=");
                sb6.append(j17);
                sb6.append(", sourceSessionBuffer=");
                sb6.append(str2);
                sb6.append(", commentScene=");
                sb6.append(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
                com.tencent.mars.xlog.Log.i("CgiFinderGetRecommendReasonHeader", sb6.toString());
            }
        }
        w91Var.set(1, b17);
        w91Var.set(2, str);
        w91Var.set(3, gVar);
        if (num != null) {
            num.intValue();
            w91Var.set(5, java.lang.Integer.valueOf(num.intValue()));
        }
        w91Var.set(4, t4Var.n());
        lVar.f70664a = w91Var;
        r45.x91 x91Var = new r45.x91();
        x91Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) x91Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = x91Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetrecommendreasonstream";
        lVar.f70667d = 21396;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderGetRecommendReasonHeader", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list;
        r45.x91 resp = (r45.x91) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderGetRecommendReasonHeader", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
        if (i17 == 0 && i18 == 0 && (list = resp.getList(2)) != null) {
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.d(finderObject);
                o3Var.cl(finderObject, this.f16135n);
            }
        }
    }
}
