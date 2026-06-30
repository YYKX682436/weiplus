package w85;

/* loaded from: classes2.dex */
public final class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f444031d = "MicroMsg.NetSceneGetLensInfo";

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f444032e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f444033f;

    public a() {
        r45.uh3 uh3Var = new r45.uh3();
        uh3Var.f387383d = "com.tencent.xin.lens.lens_test1";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = uh3Var;
        lVar.f70665b = new r45.vh3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getlensinfo";
        lVar.f70667d = 3903;
        this.f444032e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f444033f = u0Var;
        return dispatch(sVar, this.f444032e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3903;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f444031d, "onGYNetEnd: " + i18 + ", " + i19);
        com.tencent.mm.modelbase.u0 u0Var = this.f444033f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
