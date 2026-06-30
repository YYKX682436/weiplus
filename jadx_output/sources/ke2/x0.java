package ke2;

/* loaded from: classes2.dex */
public final class x0 extends az2.v {

    /* renamed from: g, reason: collision with root package name */
    public int f306997g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f306998h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f306999i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(java.lang.String targetUsername, java.lang.String myUsername, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(targetUsername, "targetUsername");
        kotlin.jvm.internal.o.g(myUsername, "myUsername");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5870;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderliveuserpage";
        r45.wd2 wd2Var = new r45.wd2();
        wd2Var.set(3, myUsername);
        wd2Var.set(2, targetUsername);
        wd2Var.set(4, gVar);
        db2.t4 t4Var = db2.t4.f228171a;
        wd2Var.set(5, t4Var.n());
        wd2Var.set(1, t4Var.b(5870, qt2Var));
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.s0().r()).booleanValue()) {
            wd2Var.set(6, java.lang.Long.valueOf(wd2Var.getLong(6) | 8));
        }
        lVar.f70664a = wd2Var;
        lVar.f70665b = new r45.xd2();
        this.f306998h = lVar.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(wd2Var.getString(2));
        sb6.append(',');
        sb6.append(wd2Var.getString(3));
        sb6.append(',');
        sb6.append(wd2Var.getByteString(4) == null);
        com.tencent.mars.xlog.Log.i("NetSceneFinderLiveUserPage", sb6.toString());
    }

    @Override // az2.v, az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.J(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("NetSceneFinderLiveUserPage", "onCgiEnd: errType=" + i18 + ", errCode=" + i19 + ", errMsg=" + str + ",resp list:" + cm2.a.f43328a.e(M()));
        com.tencent.mm.modelbase.u0 u0Var = this.f306999i;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // az2.v
    public java.util.List K(com.tencent.mm.network.v0 v0Var) {
        java.util.List M = M();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(M, 10));
        java.util.Iterator it = M.iterator();
        while (it.hasNext()) {
            arrayList.add(com.tencent.mm.plugin.finder.storage.h90.b(com.tencent.mm.plugin.finder.storage.FinderItem.Companion, (com.tencent.mm.protocal.protobuf.FinderObject) it.next(), 0, 2, null));
        }
        return arrayList;
    }

    @Override // az2.v
    public long L() {
        com.tencent.mm.protobuf.f fVar = this.f306998h.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageRequest");
        r45.kv0 kv0Var = (r45.kv0) ((r45.wd2) fVar).getCustom(1);
        if (kv0Var != null) {
            return kv0Var.getLong(5);
        }
        return 0L;
    }

    public final java.util.List M() {
        com.tencent.mm.protobuf.f fVar = this.f306998h.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveUserPageResponse");
        java.util.LinkedList list = ((r45.xd2) fVar).getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        return list;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f306999i = u0Var;
        return dispatch(sVar, this.f306998h, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5870;
    }
}
