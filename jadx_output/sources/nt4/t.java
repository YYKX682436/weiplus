package nt4;

/* loaded from: classes9.dex */
public class t extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f339848d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f339849e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f339850f;

    public t(int i17, int i18, java.lang.String str, r45.py3 py3Var, r45.oy3 oy3Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cx6();
        lVar.f70665b = new r45.dx6();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/boss/verifyandroidiappackage";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 1;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f339848d = a17;
        r45.cx6 cx6Var = (r45.cx6) a17.f70710a.f70684a;
        cx6Var.f371914d = i17;
        cx6Var.f371915e = i18;
        this.f339850f = str;
        cx6Var.f371917g = py3Var;
        cx6Var.f371916f = oy3Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f339849e = u0Var;
        return dispatch(sVar, this.f339848d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.z.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVerifyAndroidIapPackage", "ErrType:" + i18 + ",errCode:" + i19 + ",errMsg:" + str);
        if (i18 != 0 || i19 != 0) {
            this.f339849e.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.dx6 dx6Var = (r45.dx6) this.f339848d.f70711b.f70700a;
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVerifyAndroidIapPackage", "business: errCode:" + dx6Var.f372840d + ",errMsg:" + dx6Var.f372841e);
        this.f339849e.onSceneEnd(i18, dx6Var.f372840d, str, this);
    }
}
