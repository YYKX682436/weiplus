package db2;

/* loaded from: classes2.dex */
public final class s3 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f228150t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f228151u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.kx2 f228152v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(java.util.LinkedList feedIdList, com.tencent.mm.protobuf.g gVar) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(feedIdList, "feedIdList");
        this.f228150t = feedIdList;
        this.f228151u = gVar;
        r45.kx2 kx2Var = new r45.kx2();
        this.f228152v = kx2Var;
        kx2Var.set(2, gVar);
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        kx2Var.set(3, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        kx2Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        kx2Var.set(5, db2.t4.f228171a.n());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = feedIdList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) it.next();
            r45.zw2 zw2Var = new r45.zw2();
            zw2Var.set(0, java.lang.Long.valueOf(finderObject.getId()));
            zw2Var.set(1, finderObject.getSessionBuffer());
            linkedList.add(zw2Var);
        }
        kx2Var.set(6, linkedList);
        com.tencent.mars.xlog.Log.i("CgiFinderStreamReRank", "initCommReqResp feedIds=" + kz5.n0.g0(this.f228150t, ";", null, null, 0, null, db2.p3.f228118d, 30, null) + ", lastBuffer=" + this.f228151u);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = this.f228152v;
        r45.lx2 lx2Var = new r45.lx2();
        lx2Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) lx2Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = lx2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderstreamrerank";
        lVar.f70667d = 19525;
        p(lVar.a());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.lx2 resp = (r45.lx2) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCgiEnd: errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(", requestFeedIds:");
        java.util.LinkedList list = resp.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        sb6.append(kz5.n0.g0(list, ";", null, null, 0, null, db2.q3.f228127d, 30, null));
        sb6.append(" rerank_last_buffer:");
        sb6.append(resp.getByteString(2));
        com.tencent.mars.xlog.Log.i("CgiFinderStreamReRank", sb6.toString());
        if (i17 == 0 && i18 == 0) {
            pm0.v.V(0L, new db2.r3(this, resp));
        }
    }
}
