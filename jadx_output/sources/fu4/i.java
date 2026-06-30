package fu4;

/* loaded from: classes2.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f266894d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f266895e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f266896f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f266897g = false;

    public i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.do6();
        lVar.f70665b = new r45.eo6();
        lVar.f70666c = "/cgi-bin/mmpay-bin/touchlockgetchallenge";
        lVar.f70667d = 1548;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f266895e = a17;
        r45.do6 do6Var = (r45.do6) a17.f70710a.f70684a;
        do6Var.f372626d = 1548;
        do6Var.f372627e = str;
        do6Var.f372628f = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f266894d = u0Var;
        return dispatch(sVar, this.f266895e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1548;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetTouchWalletLockChallenge", "get touch wallet lock challenge errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.eo6 eo6Var = (r45.eo6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f266896f = eo6Var.f373627d;
        if (eo6Var.f373628e == 1) {
            this.f266897g = true;
        } else {
            this.f266897g = false;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f266894d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
