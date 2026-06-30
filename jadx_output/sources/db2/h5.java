package db2;

/* loaded from: classes3.dex */
public final class h5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f228008g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228009h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228010i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(long j17, java.lang.String str, int i17, java.lang.String reportData, java.lang.String bypassData) {
        super(null, 1, null);
        java.util.LinkedList list;
        r45.fl2 fl2Var;
        java.lang.String string;
        kotlin.jvm.internal.o.g(reportData, "reportData");
        kotlin.jvm.internal.o.g(bypassData, "bypassData");
        this.f228008g = "Finder.NetSceneFinderAdCommentReport";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8083;
        r45.lt0 lt0Var = new r45.lt0();
        lt0Var.set(2, reportData);
        lt0Var.set(3, bypassData);
        db2.t4 t4Var = db2.t4.f228171a;
        lt0Var.set(1, t4Var.a(8083));
        t4Var.h((r45.kv0) lt0Var.getCustom(1), null, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), str)));
        lVar.f70664a = lt0Var;
        r45.mt0 mt0Var = new r45.mt0();
        mt0Var.set(0, new r45.ie());
        lVar.f70665b = mt0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderadcommentreport";
        this.f228009h = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderAdCommentReport", "NetSceneFinderAdCommentReport  ".concat(reportData));
        r45.kv0 kv0Var = (r45.kv0) lt0Var.getCustom(1);
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderAdCommentReport", "NetSceneFinderAdCommentReport sessionBuffer: ".concat((kv0Var == null || (list = kv0Var.getList(7)) == null || (fl2Var = (r45.fl2) kz5.n0.Z(list)) == null || (string = fl2Var.getString(1)) == null) ? "" : string));
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f228008g, "NetSceneFinderCommentAdReport onGYNetEnd " + i18 + ' ' + i19 + ' ' + str + ' ');
        com.tencent.mm.modelbase.u0 u0Var = this.f228010i;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228010i = u0Var;
        com.tencent.mars.xlog.Log.i(this.f228008g, "NetSceneFinderAdCommentReport doScene");
        return dispatch(sVar, this.f228009h, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 8083;
    }
}
