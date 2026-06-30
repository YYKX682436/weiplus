package ms3;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f330986d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f330987e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f330988f;

    public e(java.lang.String str, ks3.z0 z0Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 11166;
        lVar.f70666c = "/cgi-bin/xmmailbroker/mb_sendmail";
        ks3.k1 k1Var = new ks3.k1();
        k1Var.f311711d = gm0.j1.b().h();
        k1Var.f311712e = z0Var;
        lVar.f70664a = k1Var;
        lVar.f70665b = new ks3.l1();
        this.f330986d = lVar.a();
        this.f330988f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f330987e = u0Var;
        return dispatch(sVar, this.f330986d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 11166;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f330987e.onSceneEnd(i18, i19, str, this);
    }
}
