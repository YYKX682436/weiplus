package wt3;

/* loaded from: classes.dex */
public final class p0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f449467d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f449468e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f449469f = "Finder.NetSceneAudioPanelGetFinderLikedList";

    public p0(com.tencent.mm.protobuf.g gVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3965;
        r45.c71 c71Var = new r45.c71();
        c71Var.set(1, 0L);
        c71Var.set(3, gVar);
        c71Var.set(2, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(null));
        c71Var.set(5, "");
        c71Var.set(6, 0);
        r45.kv0 kv0Var = new r45.kv0();
        kv0Var.set(1, 101);
        c71Var.set(4, kv0Var);
        lVar.f70664a = c71Var;
        lVar.f70667d = 3965;
        lVar.f70665b = new r45.d71();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetlikedlist";
        this.f449467d = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneAudioPanelGetFinderLikedList", " init:NetSceneAudioPanelGetFinderLikedList " + c71Var.getString(2));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f449468e = u0Var;
        return dispatch(sVar, this.f449467d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3965;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f449469f, "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f449468e;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
