package db2;

/* loaded from: classes2.dex */
public final class f6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f227974g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f227975h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f227976i;

    /* renamed from: m, reason: collision with root package name */
    public final int f227977m;

    public f6(int i17, int i18, java.lang.String str, java.lang.String str2, com.tencent.mm.protobuf.g gVar, int i19, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f227974g = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.wi2 wi2Var = new r45.wi2();
        lVar.f70664a = wi2Var;
        wi2Var.f389195d = str;
        wi2Var.f389197f = str2 == null ? xy2.c.f(qt2Var) : str2;
        wi2Var.f389199h = i18;
        wi2Var.f389201m = i17;
        if (i17 == 0) {
            wi2Var.f389198g = gVar;
        } else if (i17 == 1) {
            wi2Var.f389202n = gVar;
        } else if (i17 == 3) {
            wi2Var.f389203o = gVar;
        }
        this.f227977m = i19;
        wi2Var.f389196e = db2.t4.f228171a.b(11732, qt2Var);
        lVar.f70665b = new r45.xi2();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findermusicalbumuserpage";
        lVar.f70667d = 11732;
        this.f227976i = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderTingMusicUserPage", "NetSceneFinderTingMusicUserPage init enterType:" + i18 + " actionType:" + i17 + " finderUserName " + str + " finderSelfUserName: " + str2 + " lastBuffer:" + gVar);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderTingMusicUserPage", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f227975h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    public final java.util.LinkedList K() {
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        com.tencent.mm.protobuf.f fVar = this.f227976i.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicAlbumUserPageResponse");
        r45.fc6 fc6Var = ((r45.xi2) fVar).f390133h;
        if (fc6Var != null && (linkedList = fc6Var.f374209e) != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.dg4 dg4Var = (r45.dg4) obj;
                kotlin.jvm.internal.o.d(dg4Var);
                linkedList2.add(new ms2.e(dg4Var));
                i17 = i18;
            }
        }
        return linkedList2;
    }

    public final boolean L() {
        r45.i66 i66Var;
        com.tencent.mm.protobuf.f fVar = this.f227976i.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderMusicAlbumUserPageResponse");
        r45.fc6 fc6Var = ((r45.xi2) fVar).f390133h;
        return (fc6Var == null || (i66Var = fc6Var.f374208d) == null || i66Var.f376767d != 1) ? false : true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f227975h = u0Var;
        return dispatch(sVar, this.f227976i, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 11732;
    }
}
