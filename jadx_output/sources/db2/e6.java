package db2;

/* loaded from: classes2.dex */
public final class e6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f227961g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f227962h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f227963i;

    /* renamed from: m, reason: collision with root package name */
    public final int f227964m;

    public e6(int i17, int i18, java.lang.String str, java.lang.String str2, com.tencent.mm.protobuf.g gVar, int i19, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f227961g = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.vu0 vu0Var = new r45.vu0();
        lVar.f70664a = vu0Var;
        vu0Var.f388574e = str;
        vu0Var.f388576g = gVar;
        this.f227964m = i19;
        vu0Var.f388573d = db2.t4.f228171a.b(8460, qt2Var);
        lVar.f70665b = new r45.wu0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderaudiouserpage";
        lVar.f70667d = 8460;
        this.f227963i = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderTingAudioUserPage", "init enterType:" + i18 + " actionType:" + i17 + " finderUserName " + str + " finderSelfUserName: " + str2 + " lastBuffer:" + gVar);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderTingAudioUserPage", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f227962h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    public final boolean K() {
        com.tencent.mm.protobuf.f fVar = this.f227963i.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        return (((r45.wu0) fVar).f389471o & 1) > 0;
    }

    public final boolean L() {
        com.tencent.mm.protobuf.f fVar = this.f227963i.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        return (((r45.wu0) fVar).f389471o & 2) > 0;
    }

    public final java.util.LinkedList M() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.protobuf.f fVar = this.f227963i.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        r45.wu0 wu0Var = (r45.wu0) fVar;
        java.util.LinkedList linkedList2 = wu0Var.f389468i;
        if (linkedList2 != null) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList2) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.ig4 ig4Var = (r45.ig4) obj;
                kotlin.jvm.internal.o.d(ig4Var);
                linkedList.add(new ms2.c(ig4Var, wu0Var.f389469m));
                i17 = i18;
            }
        }
        return linkedList;
    }

    public final r45.wx0 N() {
        com.tencent.mm.protobuf.f fVar = this.f227963i.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        return ((r45.wu0) fVar).f389470n;
    }

    public final r45.sd1 O() {
        com.tencent.mm.protobuf.f fVar = this.f227963i.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        return ((r45.wu0) fVar).f389472p;
    }

    public final boolean P() {
        com.tencent.mm.protobuf.f fVar = this.f227963i.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderAudioUserPageResponse");
        return ((r45.wu0) fVar).f389468i.isEmpty();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f227962h = u0Var;
        return dispatch(sVar, this.f227963i, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 8460;
    }
}
