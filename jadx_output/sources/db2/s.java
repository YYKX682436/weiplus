package db2;

/* loaded from: classes.dex */
public final class s extends az2.o {

    /* renamed from: t, reason: collision with root package name */
    public int f228147t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(long j17, java.lang.String nonceId, int i17, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.av0 av0Var = new r45.av0();
        db2.t4 t4Var = db2.t4.f228171a;
        av0Var.set(1, t4Var.b(11856, qt2Var));
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        av0Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        av0Var.set(6, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        av0Var.set(10, t4Var.n());
        av0Var.set(3, java.lang.Long.valueOf(j17));
        av0Var.set(7, nonceId);
        av0Var.set(4, java.lang.Integer.valueOf(i17));
        av0Var.set(2, gVar);
        lVar.f70664a = av0Var;
        r45.bv0 bv0Var = new r45.bv0();
        bv0Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) bv0Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = bv0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderauthorsingleflow";
        lVar.f70667d = 11856;
        p(lVar.a());
        com.tencent.mm.plugin.finder.report.v1.f125393a.m(1001, true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init feeId:");
        sb6.append(pm0.v.u(j17));
        sb6.append(", displayTabType=");
        sb6.append(i17);
        sb6.append(", lastBuffer=");
        sb6.append(gVar != null);
        com.tencent.mars.xlog.Log.i("CgiFinderAuthorSingleFlow", sb6.toString());
    }

    @Override // az2.o, az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.bv0 resp = (r45.bv0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        super.A(i17, i18, str, resp, m1Var);
        com.tencent.mars.xlog.Log.i("CgiFinderAuthorSingleFlow", "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " resp=" + resp);
        com.tencent.mm.plugin.finder.report.v1 v1Var = com.tencent.mm.plugin.finder.report.v1.f125393a;
        v1Var.m(1001, false);
        if (i17 != 0 || i18 != 0) {
            v1Var.w(1001, this.f16135n);
            return;
        }
        v1Var.h(1001, false);
        yr2.a aVar = yr2.a.f464659a;
        r45.sq2 sq2Var = (r45.sq2) resp.getCustom(5);
        java.util.LinkedList list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        aVar.b(sq2Var, list, 3688);
        v1Var.a(1001, resp.getList(1).size());
    }

    @Override // az2.o
    public java.util.List C(com.tencent.mm.protobuf.f fVar) {
        r45.bv0 resp = (r45.bv0) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.o
    public long D() {
        com.tencent.mm.protobuf.f fVar = this.f70646f.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAuthorSingleFlowReq");
        r45.kv0 kv0Var = (r45.kv0) ((r45.av0) fVar).getCustom(1);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }
}
