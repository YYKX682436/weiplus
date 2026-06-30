package db2;

/* loaded from: classes2.dex */
public final class o5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228106g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228107h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f228108i;

    public o5(com.tencent.mm.protobuf.g gVar) {
        super(null, 1, null);
        this.f228108i = "Finder.NetSceneFinderGetFollowList";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 713;
        r45.k61 k61Var = new r45.k61();
        k61Var.set(1, gVar);
        k61Var.set(3, db2.t4.f228171a.a(713));
        lVar.f70664a = k61Var;
        lVar.f70665b = new r45.l61();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfollowlist";
        this.f228106g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetFollowList", "NetSceneFinderGetFollowList init ");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String str2 = this.f228108i;
        com.tencent.mars.xlog.Log.i(str2, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            jx3.f.INSTANCE.idkeyStat(1279L, 7L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1279L, 8L, 1L, false);
        }
        com.tencent.mm.modelbase.o oVar = this.f228106g;
        com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListRequest");
        if (((r45.k61) fVar).getByteString(1) == null) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_FOLLOW_COUNT_INT_SYNC;
            com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
            c17.x(u3Var, java.lang.Integer.valueOf(((r45.l61) fVar2).getInteger(4)));
        }
        java.util.LinkedList K = K();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("firstPage ");
        sb6.append(L() == null);
        sb6.append(", get ");
        sb6.append(K.size());
        sb6.append(" follow contact ");
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        java.util.Iterator it = K.iterator();
        while (it.hasNext()) {
            ya2.h.f460484a.j((com.tencent.mm.protocal.protobuf.FinderContact) it.next());
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f228107h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    public final java.util.LinkedList K() {
        com.tencent.mm.protobuf.f fVar = this.f228106g.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFollowListResponse");
        java.util.LinkedList list = ((r45.l61) fVar).getList(1);
        kotlin.jvm.internal.o.f(list, "getContactList(...)");
        return list;
    }

    public final com.tencent.mm.protobuf.g L() {
        com.tencent.mm.protobuf.f fVar = this.f228106g.f70711b.f70700a;
        r45.l61 l61Var = fVar instanceof r45.l61 ? (r45.l61) fVar : null;
        if (l61Var != null) {
            return l61Var.getByteString(2);
        }
        return null;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228107h = u0Var;
        return dispatch(sVar, this.f228106g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 713;
    }
}
