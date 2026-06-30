package z12;

/* loaded from: classes15.dex */
public final class v extends com.tencent.mm.modelbase.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469371d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469372e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f469373f = "MicroMsg.NetSceneGetEmotionStoreRecList";

    /* renamed from: g, reason: collision with root package name */
    public final int f469374g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.network.l0 f469375h;

    public v() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.no3();
        lVar.f70665b = new r45.oo3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getstorereclist";
        lVar.f70667d = 6910;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f469371d = lVar.a();
        this.f469375h = new z12.u(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469372e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469371d;
        java.lang.Object obj = oVar != null ? oVar.f70710a.f70684a : null;
        if ((obj instanceof r45.no3 ? (r45.no3) obj : null) == null) {
            com.tencent.mars.xlog.Log.i(this.f469373f, "doScene failed, GetStoreRecListRequest null");
        }
        return dispatch(sVar, oVar, this.f469375h);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6910;
    }
}
