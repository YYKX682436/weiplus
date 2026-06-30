package k14;

/* loaded from: classes2.dex */
public class g0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f303333d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f303334e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f303335f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303336g = null;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303337h = null;

    public g0(boolean z17, java.lang.String str) {
        this.f303333d = z17;
        this.f303334e = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.a36();
        lVar.f70665b = new r45.b36();
        lVar.f70666c = "/cgi-bin/micromsg-bin/settranslationlanguageoplog";
        lVar.f70667d = 8222;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f303335f = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f303336g = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f303335f;
        r45.a36 a36Var = (r45.a36) oVar.f70710a.f70684a;
        a36Var.f369706d = !this.f303333d;
        a36Var.f369707e = this.f303334e;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 8222;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f303336g.onSceneEnd(i18, i19, str, this);
        com.tencent.mm.modelbase.u0 u0Var = this.f303337h;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
