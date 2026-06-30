package z12;

/* loaded from: classes4.dex */
public class r extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f469355d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469356e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f469357f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f469358g;

    public r(java.lang.String str, byte[] bArr) {
        this.f469357f = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.te3();
        lVar.f70665b = new r45.ue3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmgetemotiondonorlist";
        lVar.f70667d = 299;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f469355d = lVar.a();
        this.f469357f = bArr;
        this.f469358g = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469356e = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f469355d;
        r45.te3 te3Var = (r45.te3) oVar.f70710a.f70684a;
        byte[] bArr = this.f469357f;
        if (bArr != null) {
            te3Var.f386351e = x51.j1.a(bArr);
        } else {
            te3Var.f386351e = new r45.cu5();
        }
        te3Var.f386350d = this.f469358g;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 299;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.cu5 cu5Var = ((r45.ue3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f387298f;
        if (cu5Var != null) {
            this.f469357f = x51.j1.d(cu5Var);
        }
        this.f469356e.onSceneEnd(i18, i19, str, this);
    }
}
