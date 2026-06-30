package db2;

/* loaded from: classes.dex */
public final class m1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public int f228069t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(r45.qt2 qt2Var, java.lang.String str, com.tencent.mm.protobuf.g gVar, int i17, long j17, int i18, long j18, java.lang.String jumpInfoNativeByPassInfo, java.lang.String str2) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(jumpInfoNativeByPassInfo, "jumpInfoNativeByPassInfo");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.k91 k91Var = new r45.k91();
        db2.t4 t4Var = db2.t4.f228171a;
        r45.kv0 b17 = t4Var.b(20556, qt2Var);
        if (!(str2 == null || str2.length() == 0) && j18 != 0) {
            java.util.LinkedList list = b17.getList(7);
            if (list != null) {
                r45.fl2 fl2Var = new r45.fl2();
                fl2Var.set(0, java.lang.Long.valueOf(j18));
                fl2Var.set(1, str2);
                list.add(fl2Var);
            }
            b17.set(1, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderGetPostPlayStream fromObjectId=");
            sb6.append(j18);
            sb6.append(", sourceSessionBuffer=");
            sb6.append(str2);
            sb6.append(", commentScene=");
            sb6.append(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null);
            com.tencent.mars.xlog.Log.i("CgiFinderGetPostPlayStream", sb6.toString());
        }
        k91Var.set(1, b17);
        k91Var.set(3, str);
        k91Var.set(4, gVar);
        k91Var.set(6, java.lang.Integer.valueOf(i17));
        k91Var.set(2, java.lang.Long.valueOf(j17));
        k91Var.set(7, java.lang.Integer.valueOf(i18));
        k91Var.set(8, java.lang.Long.valueOf(j18));
        k91Var.set(5, t4Var.n());
        k91Var.set(9, jumpInfoNativeByPassInfo);
        lVar.f70664a = k91Var;
        r45.l91 l91Var = new r45.l91();
        l91Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) l91Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = l91Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetpostplaystream";
        lVar.f70667d = 20556;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("CgiFinderGetPostPlayStream", "CgiFinderGetPostPlayStream topicId=" + j17 + ", tabId=" + i18 + ", byPassInfo=" + str + ", lastBuffer=" + gVar);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list;
        r45.l91 resp = (r45.l91) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i("CgiFinderGetPostPlayStream", "[onCgiEnd] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
        if (i17 == 0 && i18 == 0 && (list = resp.getList(3)) != null) {
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.d(finderObject);
                o3Var.cl(finderObject, this.f16135n);
            }
        }
    }
}
