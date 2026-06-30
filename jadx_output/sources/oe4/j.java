package oe4;

/* loaded from: classes9.dex */
public class j extends com.tencent.mm.modelbase.m1 implements iu5.e, com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f344809d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.network.v0 f344810e;

    /* renamed from: f, reason: collision with root package name */
    public iu5.b f344811f = null;

    @Override // iu5.a
    public void B(iu5.b bVar) {
        this.f344811f = bVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f344809d = u0Var;
        return dispatch(sVar, this.f344810e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.z4.CTRL_INDEX;
    }

    @Override // iu5.a
    public void j(java.lang.Object obj) {
        iu5.c cVar = (iu5.c) obj;
        oe4.b bVar = new oe4.b();
        this.f344810e = bVar;
        r45.ts6 ts6Var = ((oe4.c) bVar.getReqObj()).f344800a;
        ts6Var.f386761d = cVar.f295052b;
        ts6Var.f386762e = cVar.f295051a;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadSoterASKRsa", "errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f344809d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa successfully");
            iu5.b bVar = this.f344811f;
            if (bVar != null) {
                bVar.a(new iu5.d(true));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadSoterASKRsa", "netscene upload soter ask rsa failed");
        iu5.b bVar2 = this.f344811f;
        if (bVar2 != null) {
            bVar2.a(new iu5.d(false));
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // iu5.a
    public void x() {
        gm0.j1.d().g(this);
    }
}
