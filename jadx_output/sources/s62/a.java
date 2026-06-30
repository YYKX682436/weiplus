package s62;

/* loaded from: classes4.dex */
public final class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f403405d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f403406e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f403407f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f403408g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f403409h;

    /* renamed from: i, reason: collision with root package name */
    public r45.eq3 f403410i;

    public a(java.lang.String appid, java.lang.String packageName, java.lang.String signature, com.tencent.mm.modelbase.u0 u0Var) {
        kotlin.jvm.internal.o.g(appid, "appid");
        kotlin.jvm.internal.o.g(packageName, "packageName");
        kotlin.jvm.internal.o.g(signature, "signature");
        this.f403405d = appid;
        this.f403406e = packageName;
        this.f403407f = signature;
        this.f403408g = u0Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f403409h = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.dq3 dq3Var = new r45.dq3();
        dq3Var.f372664d = this.f403405d;
        dq3Var.f372665e = this.f403406e;
        dq3Var.f372666f = this.f403407f;
        lVar.f70664a = dq3Var;
        r45.eq3 eq3Var = new r45.eq3();
        this.f403410i = eq3Var;
        lVar.f70665b = eq3Var;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/getuserauth";
        lVar.f70667d = 2711;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        return dispatch(sVar, lVar.a(), this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2711;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f403408g;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mm.modelbase.u0 u0Var2 = this.f403409h;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
