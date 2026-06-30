package tb3;

/* loaded from: classes2.dex */
public class b extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f416981d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f416982e;

    /* renamed from: f, reason: collision with root package name */
    public int f416983f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f416984g;

    public b(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70664a = new r45.wn0();
        lVar.f70665b = new r45.xn0();
        lVar.f70667d = 1971;
        lVar.f70666c = "/cgi-bin/mmpay-bin/ftfhb/ffwxhbinvalidateshareurl";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f416981d = a17;
        r45.wn0 wn0Var = (r45.wn0) a17.f70710a.f70684a;
        r45.r1 c17 = at4.g0.c();
        if (c17 != null) {
            wn0Var.f389308e = c17.f384409f;
            wn0Var.f389309f = c17.f384410g;
        }
        wn0Var.f389307d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f416982e = u0Var;
        return dispatch(sVar, this.f416981d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1971;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i(" NetSceneF2FLuckyMoneyInvalid", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.xn0 xn0Var = (r45.xn0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        int i27 = xn0Var.f390249d;
        this.f416983f = i27;
        java.lang.String str2 = xn0Var.f390250e;
        this.f416984g = str2;
        com.tencent.mm.modelbase.u0 u0Var = this.f416982e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i27, str2, this);
        }
    }
}
