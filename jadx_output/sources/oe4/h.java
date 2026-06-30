package oe4;

/* loaded from: classes9.dex */
public class h extends oe4.g implements iu5.e {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f344803d;

    /* renamed from: e, reason: collision with root package name */
    public iu5.b f344804e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f344805f;

    @Override // iu5.a
    public void B(iu5.b bVar) {
        this.f344804e = bVar;
    }

    @Override // oe4.g
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy:NetSceneSoterMPUpdateAuthKey authkey required");
        com.tencent.mm.modelbase.u0 u0Var = this.f344803d;
        if (u0Var != null) {
            u0Var.onSceneEnd(4, -1, "", this);
        }
        iu5.b bVar = this.f344804e;
        if (bVar != null) {
            bVar.a(new iu5.d(false));
        }
    }

    @Override // oe4.g
    public void I(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterMPUpdateAuthKey", "hy: NetSceneSoterMPUpdateAuthKey onError: errType: %d, errcode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.u0 u0Var = this.f344803d;
        if (u0Var != null) {
            u0Var.onSceneEnd(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f344803d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        iu5.b bVar = this.f344804e;
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
        this.f344803d = u0Var;
        return dispatch(sVar, this.f344805f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1185;
    }

    @Override // iu5.a
    public void j(java.lang.Object obj) {
        iu5.c cVar = (iu5.c) obj;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.su6();
        lVar.f70665b = new r45.tu6();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/uploadsoterauthkey";
        lVar.f70667d = 1185;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f344805f = a17;
        r45.su6 su6Var = (r45.su6) a17.f70710a.f70684a;
        su6Var.f385977d = cVar.f295051a;
        su6Var.f385978e = cVar.f295052b;
    }

    @Override // iu5.a
    public void x() {
        gm0.j1.d().g(this);
    }
}
