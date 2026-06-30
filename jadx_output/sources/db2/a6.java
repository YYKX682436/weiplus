package db2;

/* loaded from: classes.dex */
public final class a6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f227900g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f227901h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f227902i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f227903m;

    public a6(com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        this.f227902i = "Finder.NetSceneFinderSnsGetLiveObjectList";
        this.f227903m = new java.util.ArrayList();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6847;
        r45.nw2 nw2Var = new r45.nw2();
        nw2Var.set(2, gVar);
        nw2Var.set(1, db2.t4.f228171a.b(6847, qt2Var));
        lVar.f70664a = nw2Var;
        lVar.f70665b = new r45.ow2();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findersnsgetliveobjectlist";
        this.f227900g = lVar.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NetSceneFinderSnsGetLiveObjectList pullType:");
        sb6.append(0);
        sb6.append(" lastBuffer:");
        sb6.append(gVar == null ? "null" : com.tencent.mm.sdk.platformtools.w2.b(gVar.f192156a));
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSnsGetLiveObjectList", sb6.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d3 A[LOOP:2: B:24:0x00a1->B:36:0x00d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd A[EDGE_INSN: B:37:0x00dd->B:38:0x00dd BREAK  A[LOOP:2: B:24:0x00a1->B:36:0x00d3], SYNTHETIC] */
    @Override // az2.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(int r21, int r22, int r23, java.lang.String r24, com.tencent.mm.network.v0 r25, byte[] r26) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.a6.J(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f227901h = u0Var;
        return dispatch(sVar, this.f227900g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6847;
    }
}
