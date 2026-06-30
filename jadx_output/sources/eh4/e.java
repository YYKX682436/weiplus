package eh4;

/* loaded from: classes4.dex */
public class e extends eh4.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f252945d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f252946e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f252947f;

    /* renamed from: g, reason: collision with root package name */
    public final int f252948g;

    public e(java.lang.String str, int i17, long j17, int i18) {
        this.f252948g = 0;
        this.f252948g = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.kk6();
        lVar.f70665b = new r45.lk6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/talknoop";
        lVar.f70667d = 335;
        lVar.f70668e = com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX;
        lVar.f70669f = 1000000149;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f252946e = a17;
        r45.kk6 kk6Var = (r45.kk6) a17.f70710a.f70684a;
        kk6Var.f378793d = i17;
        kk6Var.f378794e = j17;
        kk6Var.f378795f = (int) com.tencent.mm.sdk.platformtools.t8.i1();
        this.f252947f = str;
        kk6Var.f378796g = i18;
    }

    @Override // eh4.f
    public java.lang.String H() {
        return this.f252947f;
    }

    @Override // eh4.f
    public int I() {
        return this.f252948g;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f252945d = u0Var;
        return dispatch(sVar, this.f252946e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 335;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            this.f252945d.onSceneEnd(i18, i19, str, this);
        } else {
            this.f252945d.onSceneEnd(i18, i19, str, this);
        }
    }
}
