package ms3;

/* loaded from: classes4.dex */
public class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f330983d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f330984e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f330985f;

    public d(java.lang.String str) {
        this.f330985f = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 11016;
        lVar.f70666c = "/cgi-bin/xmmailbroker/mb_searchmailaddr";
        ks3.i1 i1Var = new ks3.i1();
        i1Var.f311688d = gm0.j1.b().h();
        i1Var.f311689e = str;
        lVar.f70664a = i1Var;
        lVar.f70665b = new ks3.j1();
        this.f330983d = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f330984e = u0Var;
        return dispatch(sVar, this.f330983d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 11016;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f330984e.onSceneEnd(i18, i19, str, this);
    }
}
