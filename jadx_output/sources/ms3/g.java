package ms3;

/* loaded from: classes.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f330992d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f330993e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f330994f;

    public g(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 11480;
        lVar.f70666c = "/cgi-bin/xmmailbroker/mb_updatemailstatus";
        ks3.p1 p1Var = new ks3.p1();
        p1Var.f311736e.add(str);
        p1Var.f311735d = gm0.j1.b().h();
        p1Var.f311737f = i17;
        lVar.f70664a = p1Var;
        lVar.f70665b = new ks3.q1();
        this.f330992d = lVar.a();
        this.f330994f = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f330993e = u0Var;
        return dispatch(sVar, this.f330992d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 11480;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f330993e.onSceneEnd(i18, i19, str, this);
    }
}
