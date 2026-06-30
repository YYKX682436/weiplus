package ms3;

/* loaded from: classes4.dex */
public class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f330989d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f330990e;

    /* renamed from: f, reason: collision with root package name */
    public final long f330991f;

    public f(long j17) {
        this.f330991f = j17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 14418;
        lVar.f70666c = "/cgi-bin/xmmailbroker/mb_syncconact";
        ks3.n1 n1Var = new ks3.n1();
        n1Var.f311726e = j17;
        n1Var.f311725d = gm0.j1.b().h();
        lVar.f70664a = n1Var;
        lVar.f70665b = new ks3.o1();
        this.f330989d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f330990e = u0Var;
        return dispatch(sVar, this.f330989d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 14418;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f330990e.onSceneEnd(i18, i19, str, this);
    }
}
