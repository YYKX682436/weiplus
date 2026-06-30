package fu4;

/* loaded from: classes9.dex */
public class k extends oe4.g implements iu5.e {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f266900d;

    /* renamed from: e, reason: collision with root package name */
    public iu5.b f266901e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f266902f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f266903g;

    public k(java.lang.String str) {
        this.f266903g = null;
        this.f266903g = str;
    }

    @Override // iu5.a
    public void B(iu5.b bVar) {
        this.f266901e = bVar;
    }

    @Override // oe4.g
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "hy: authkey required");
        com.tencent.mm.modelbase.u0 u0Var = this.f266900d;
        if (u0Var != null) {
            u0Var.onSceneEnd(4, -1, "", this);
        }
        if (this.f266901e != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "pay auth key expired when upload pay auth key");
            this.f266901e.a(new iu5.d(false));
        }
    }

    @Override // oe4.g
    public void I(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadWalletLockSoterAuthKey", "hy: onError: errType: %d, errcode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.u0 u0Var = this.f266900d;
        if (u0Var != null) {
            u0Var.onSceneEnd(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f266900d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        re4.g0.f394537c = str;
        iu5.b bVar = this.f266901e;
        if (bVar != null) {
            if (i18 == 0 && i19 == 0) {
                bVar.a(new iu5.d(true));
            } else {
                bVar.a(new iu5.d(false));
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f266900d = u0Var;
        return dispatch(sVar, this.f266902f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1665;
    }

    @Override // iu5.a
    public void j(java.lang.Object obj) {
        iu5.c cVar = (iu5.c) obj;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fo6();
        lVar.f70665b = new r45.go6();
        lVar.f70666c = "/cgi-bin/mmpay-bin/touchlockupdateauthkey";
        lVar.f70667d = 1244;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f266902f = a17;
        r45.fo6 fo6Var = (r45.fo6) a17.f70710a.f70684a;
        fo6Var.f374494d = cVar.f295051a;
        fo6Var.f374496f = cVar.f295052b;
        java.lang.String str = this.f266903g;
        fo6Var.f374495e = str;
        com.tencent.mm.autogen.events.GetWcPaySignEvent getWcPaySignEvent = new com.tencent.mm.autogen.events.GetWcPaySignEvent();
        getWcPaySignEvent.f54420g.f8195a = str;
        getWcPaySignEvent.e();
        fo6Var.f374497g = getWcPaySignEvent.f54421h.f8281a;
    }

    @Override // iu5.a
    public void x() {
        gm0.j1.d().g(this);
    }
}
