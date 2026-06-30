package er3;

/* loaded from: classes8.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f256018d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f256019e;

    /* renamed from: f, reason: collision with root package name */
    public r45.kk3 f256020f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f256021g;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetOpenUrl", "NetSceneGetOpenUrl username:%s ticket:%s climsgid:%s content:%s ", str, str2, str3, com.tencent.mm.sdk.platformtools.t8.G1(str4));
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getopenurl";
        lVar.f70667d = 913;
        lVar.f70664a = new r45.jk3();
        lVar.f70665b = new r45.kk3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f256019e = a17;
        r45.jk3 jk3Var = (r45.jk3) a17.f70710a.f70684a;
        jk3Var.f377900d = 1;
        r45.w0 w0Var = new r45.w0();
        w0Var.f388739d = str;
        w0Var.f388740e = str2;
        w0Var.f388741f = str3;
        w0Var.f388742g = str4;
        jk3Var.f377901e = w0Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f256018d = u0Var;
        return dispatch(sVar, this.f256019e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 913;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f256018d.onSceneEnd(i18, i19, str, this);
        this.f256021g = str;
    }
}
