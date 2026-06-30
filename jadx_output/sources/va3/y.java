package va3;

/* loaded from: classes8.dex */
public class y extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f434384d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f434385e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f434386f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f434387g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f434388h;

    public y(double d17, double d18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zd3();
        lVar.f70665b = new r45.ae3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getcurlocation";
        lVar.f70667d = 665;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f434385e = a17;
        r45.zd3 zd3Var = (r45.zd3) a17.f70710a.f70684a;
        zd3Var.f391931e = d17;
        zd3Var.f391930d = d18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f434384d = u0Var;
        return dispatch(sVar, this.f434385e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 665;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.ae3 ae3Var = (r45.ae3) this.f434385e.f70711b.f70700a;
            this.f434388h = ae3Var.f369968f;
            this.f434386f = ae3Var.f369966d;
            this.f434387g = ae3Var.f369967e;
        }
        this.f434384d.onSceneEnd(i18, i19, str, this);
    }
}
