package w62;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f443274d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f443275e;

    /* renamed from: f, reason: collision with root package name */
    public int f443276f = -1;

    public a(java.lang.String str, int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.a00();
        lVar.f70665b = new r45.b00();
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkcamerascan";
        lVar.f70667d = 782;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f443274d = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckUrlAvailableInWx", "hy: checking url: %s", str);
        r45.a00 a00Var = (r45.a00) a17.f70710a.f70684a;
        a00Var.f369578d = str;
        a00Var.f369579e = i17;
        a00Var.f369580f = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f443275e = u0Var;
        return dispatch(sVar, this.f443274d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 782;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.b00 b00Var = (r45.b00) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            this.f443276f = b00Var.f370388d;
        }
        this.f443275e.onSceneEnd(i18, i19, str, this);
    }
}
