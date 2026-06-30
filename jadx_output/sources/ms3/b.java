package ms3;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f330978d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f330979e;

    public b() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 12213;
        lVar.f70666c = "/cgi-bin/xmmailbroker/mb_getunreadcount";
        ks3.c1 c1Var = new ks3.c1();
        c1Var.f311649d = gm0.j1.b().h();
        lVar.f70664a = c1Var;
        lVar.f70665b = new ks3.d1();
        this.f330978d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f330979e = u0Var;
        return dispatch(sVar, this.f330978d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 12213;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f330979e.onSceneEnd(i18, i19, str, this);
    }
}
