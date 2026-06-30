package wt3;

/* loaded from: classes.dex */
public final class o0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f449461d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f449462e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f449463f = "Finder.NetSceneAudioPanelGetFinderFavList";

    public o0(com.tencent.mm.protobuf.g gVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3966;
        r45.w51 w51Var = new r45.w51();
        w51Var.set(3, gVar);
        w51Var.set(2, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(null));
        w51Var.set(4, 0);
        r45.kv0 kv0Var = new r45.kv0();
        kv0Var.set(1, 101);
        w51Var.set(1, kv0Var);
        lVar.f70664a = w51Var;
        lVar.f70667d = 3966;
        lVar.f70665b = new r45.x51();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfavlist";
        this.f449461d = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneAudioPanelGetFinderFavList", " init:NetSceneAudioPanelGetFinderFavList " + w51Var.getString(2));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f449462e = u0Var;
        return dispatch(sVar, this.f449461d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3966;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f449463f, "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f449462e;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
