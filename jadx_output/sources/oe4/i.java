package oe4;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.modelbase.m1 implements iu5.e, com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f344806d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f344807e;

    /* renamed from: f, reason: collision with root package name */
    public iu5.b f344808f = null;

    @Override // iu5.a
    public void B(iu5.b bVar) {
        this.f344808f = bVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f344806d = u0Var;
        return dispatch(sVar, this.f344807e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.ka.CTRL_INDEX;
    }

    @Override // iu5.a
    public void j(java.lang.Object obj) {
        iu5.c cVar = (iu5.c) obj;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ts6();
        lVar.f70665b = new r45.us6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/updatesoterask";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.ka.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f344807e = a17;
        r45.ts6 ts6Var = (r45.ts6) a17.f70710a.f70684a;
        ts6Var.f386763f = com.tencent.mm.plugin.appbrand.jsapi.ka.CTRL_INDEX;
        java.lang.String str = cVar.f295052b;
        ts6Var.f386761d = str;
        java.lang.String str2 = cVar.f295051a;
        ts6Var.f386762e = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadSoterASK", "keyJson: %s, signature: %s", str2, str);
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadSoterASK", "MicroMsg.NetSceneUploadSoterASK errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f344806d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        re4.g0.f394536b = str;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask successfully");
            iu5.b bVar = this.f344808f;
            if (bVar != null) {
                bVar.a(new iu5.d(true));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadSoterASK", "netscene upload soter ask failed");
        iu5.b bVar2 = this.f344808f;
        if (bVar2 != null) {
            bVar2.a(new iu5.d(false));
        }
    }

    @Override // iu5.a
    public void x() {
        gm0.j1.d().g(this);
    }
}
