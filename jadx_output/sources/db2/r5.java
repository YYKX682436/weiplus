package db2;

/* loaded from: classes2.dex */
public final class r5 extends az2.v {

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f228142g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228143h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f228144i;

    /* renamed from: m, reason: collision with root package name */
    public int f228145m;

    /* renamed from: n, reason: collision with root package name */
    public final int f228146n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(int i17, com.tencent.mm.protobuf.g gVar, int i18, float f17, float f18, r45.xu2 sectionInfo, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(sectionInfo, "sectionInfo");
        this.f228144i = "Finder.NetSceneFinderGetRelatedList";
        this.f228146n = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3688;
        r45.z91 z91Var = new r45.z91();
        z91Var.set(3, 0L);
        z91Var.set(7, "");
        z91Var.set(4, java.lang.Integer.valueOf(i17));
        z91Var.set(5, java.lang.Float.valueOf(f17));
        z91Var.set(6, java.lang.Float.valueOf(f18));
        z91Var.set(2, gVar);
        db2.t4 t4Var = db2.t4.f228171a;
        z91Var.set(1, t4Var.b(3688, this.f16154d));
        z91Var.set(9, java.lang.Integer.valueOf(i18));
        z91Var.set(11, sectionInfo);
        z91Var.set(14, t4Var.n());
        db2.t4.i(t4Var, (r45.kv0) z91Var.getCustom(1), kz5.b0.c(new jz5.l(java.lang.Integer.valueOf(i18), 0L)), null, 4, null);
        lVar.f70664a = z91Var;
        lVar.f70665b = new r45.aa1();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetrelatedlist";
        this.f228142g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetRelatedList", "NetSceneFinderGetRelatedList feedId 0 tabType " + i17 + " category  lastBuffer " + gVar);
    }

    @Override // az2.v, az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.J(i17, i18, i19, str, v0Var, bArr);
        java.lang.String str2 = this.f228144i;
        com.tencent.mars.xlog.Log.i(str2, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i(str2, "feedId 0 tabType=" + this.f228146n + ", " + hc2.o0.k(M()));
            java.util.Iterator it = M().iterator();
            while (it.hasNext()) {
                ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).cl((com.tencent.mm.protocal.protobuf.FinderObject) it.next(), this.f16154d);
            }
            com.tencent.mm.modelbase.o oVar = this.f228142g;
            if (oVar == null) {
                kotlin.jvm.internal.o.o("rr");
                throw null;
            }
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            if (fVar instanceof r45.aa1) {
                yr2.a aVar = yr2.a.f464659a;
                r45.aa1 aa1Var = (r45.aa1) fVar;
                r45.sq2 sq2Var = (r45.sq2) aa1Var.getCustom(5);
                java.util.LinkedList list = aa1Var.getList(1);
                kotlin.jvm.internal.o.f(list, "getObject(...)");
                aVar.b(sq2Var, list, 3688);
                dq.b b17 = cq.k1.b();
                r45.rf6 rf6Var = (r45.rf6) aa1Var.getCustom(22);
                b17.d(rf6Var != null ? rf6Var.getInteger(0) : 0, str2);
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f228143h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // az2.v
    public java.util.List K(com.tencent.mm.network.v0 v0Var) {
        com.tencent.mm.modelbase.o oVar = this.f228142g;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("rr");
            throw null;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = ((r45.aa1) fVar).getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(h90Var.a(finderObject, 0));
        }
        return arrayList;
    }

    @Override // az2.v
    public long L() {
        com.tencent.mm.modelbase.o oVar = this.f228142g;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("rr");
            throw null;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListReq");
        r45.kv0 kv0Var = (r45.kv0) ((r45.z91) fVar).getCustom(1);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }

    public final java.util.LinkedList M() {
        com.tencent.mm.modelbase.o oVar = this.f228142g;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("rr");
            throw null;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
        java.util.LinkedList list = ((r45.aa1) fVar).getList(1);
        return list == null ? new java.util.LinkedList() : list;
    }

    public final boolean N() {
        com.tencent.mm.modelbase.o oVar = this.f228142g;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("rr");
            throw null;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetRelatedListResp");
        return ((r45.aa1) fVar).getInteger(3) != 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228143h = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f228142g;
        if (oVar != null) {
            return dispatch(sVar, oVar, this);
        }
        kotlin.jvm.internal.o.o("rr");
        throw null;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3688;
    }
}
