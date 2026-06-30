package e71;

/* loaded from: classes4.dex */
public final class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f249875d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f249876e;

    /* renamed from: f, reason: collision with root package name */
    public final e71.h f249877f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f249878g;

    public g(e71.h hVar, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rs6();
        lVar.f70665b = new r45.ss6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/updatesafedevice";
        lVar.f70667d = 361;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f249876e = a17;
        this.f249877f = hVar;
        this.f249878g = str;
        r45.rs6 rs6Var = (r45.rs6) a17.f70710a.f70684a;
        rs6Var.f385178d = hVar.field_uid;
        rs6Var.f385179e = str;
        rs6Var.f385180f = hVar.field_devicetype;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        e71.h hVar = this.f249877f;
        if (com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_uid) || com.tencent.mm.sdk.platformtools.t8.K0(this.f249878g) || com.tencent.mm.sdk.platformtools.t8.K0(hVar.field_devicetype)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetscenUpdateSafeDevice", "null device is or device name or device type");
            return -1;
        }
        this.f249875d = u0Var;
        return dispatch(sVar, this.f249876e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 361;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetscenUpdateSafeDevice", "errType = " + i18 + ", errCode = " + i19);
        if (i18 == 0 && i19 == 0) {
            this.f249877f.field_name = this.f249878g;
        }
        this.f249875d.onSceneEnd(i18, i19, str, this);
    }
}
