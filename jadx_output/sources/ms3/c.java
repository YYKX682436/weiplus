package ms3;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f330980d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f330981e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f330982f;

    public c(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 11312;
        lVar.f70666c = "/cgi-bin/xmmailbroker/mb_readmail";
        ks3.f1 f1Var = new ks3.f1();
        f1Var.f311670e = str;
        f1Var.f311669d = gm0.j1.b().h();
        lVar.f70664a = f1Var;
        lVar.f70665b = new ks3.g1();
        this.f330980d = lVar.a();
        this.f330982f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f330981e = u0Var;
        return dispatch(sVar, this.f330980d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 11312;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f330981e.onSceneEnd(i18, i19, str, this);
    }
}
