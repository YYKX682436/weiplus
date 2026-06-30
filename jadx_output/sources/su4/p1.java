package su4;

/* loaded from: classes12.dex */
public class p1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413034d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413035e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.h55 f413036f;

    public p1(r45.g55 g55Var) {
        g55Var.f374896n = com.tencent.mm.ui.bk.C() ? 1 : 0;
        g55Var.f374890e = su4.r2.i();
        g55Var.f374899q = su4.r2.g();
        r45.h55 h55Var = new r45.h55();
        this.f413036f = h55Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1076;
        lVar.f70666c = "/cgi-bin/mmsearch-bin/pardussearch";
        lVar.f70664a = g55Var;
        lVar.f70665b = h55Var;
        this.f413035e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413034d = u0Var;
        return dispatch(sVar, this.f413035e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1076;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.NetScenePardusSearch", "netId %d errType %d errCode %d errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f413034d.onSceneEnd(i18, i19, str, this);
    }
}
