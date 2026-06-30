package db2;

/* loaded from: classes.dex */
public final class w5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f228223g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228224h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228225i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w5(int i17, java.lang.String reportData) {
        super(null, 1, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(reportData, "reportData");
        this.f228223g = "Finder.NetSceneFinderPassReport";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4093;
        r45.ho2 ho2Var = new r45.ho2();
        ho2Var.set(1, java.lang.Integer.valueOf(i17));
        ho2Var.set(2, reportData);
        lVar.f70664a = ho2Var;
        r45.io2 io2Var = new r45.io2();
        io2Var.set(0, new r45.ie());
        lVar.f70665b = io2Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderpassreport";
        this.f228224h = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderPassReport", "NetSceneFinderPassReport " + i17 + ", " + reportData);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f228223g, "NetSceneFinderPassReport onGYNetEnd " + i18 + ' ' + i19 + ' ' + str + ' ');
        com.tencent.mm.modelbase.u0 u0Var = this.f228225i;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228225i = u0Var;
        com.tencent.mars.xlog.Log.i(this.f228223g, "NetSceneFinderPassReport doScene");
        return dispatch(sVar, this.f228224h, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4093;
    }
}
