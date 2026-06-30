package nl3;

/* loaded from: classes2.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f338187d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f338188e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f338189f = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f338190g;

    public c(java.lang.String str) {
        this.f338190g = "";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 769;
        lVar.f70666c = "/cgi-bin/micromsg-bin/getshakemusicurl";
        lVar.f70664a = new r45.xn3();
        lVar.f70665b = new r45.yn3();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f338188e = a17;
        ((r45.xn3) a17.f70710a.f70684a).f390251d = str;
        this.f338190g = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "request music url:%s", str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f338187d = u0Var;
        return dispatch(sVar, this.f338188e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 769;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f338187d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.yn3 yn3Var = (r45.yn3) this.f338188e.f70711b.f70700a;
        this.f338187d.onSceneEnd(i18, i19, str, this);
        if (yn3Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.NetSceneGetShakeMusicUrl", "response is null");
            return;
        }
        java.lang.String str2 = yn3Var.f391242d;
        this.f338189f = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.NetSceneGetShakeMusicUrl", "tempPlayUrl:%s", str2);
    }
}
