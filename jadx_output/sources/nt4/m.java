package nt4;

/* loaded from: classes9.dex */
public class m extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f339842d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f339843e;

    /* renamed from: f, reason: collision with root package name */
    public r45.oy3 f339844f;

    /* renamed from: g, reason: collision with root package name */
    public r45.py3 f339845g;

    public m(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, java.lang.String str4, int i19, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.q93();
        lVar.f70665b = new r45.r93();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/boss/getandroidiappackage";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.pay.z.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 1;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f339842d = a17;
        r45.q93 q93Var = (r45.q93) a17.f70710a.f70684a;
        q93Var.f383770e = str;
        q93Var.f383769d = i17;
        q93Var.f383772g = java.lang.Integer.parseInt(str2);
        q93Var.f383771f = str3;
        q93Var.f383774i = i18;
        q93Var.f383775m = i19;
        q93Var.f383773h = str4;
        q93Var.f383776n = str5;
        q93Var.f383777o = str6;
        q93Var.f383778p = str7;
        q93Var.f383780r = str8;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f339843e = u0Var;
        return dispatch(sVar, this.f339842d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.pay.z.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAndroidIapPackage", "ErrType:" + i18 + ",errCode:" + i19 + ",errMsg:" + str);
        if (i18 != 0 || i19 != 0) {
            this.f339843e.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.r93 r93Var = (r45.r93) this.f339842d.f70711b.f70700a;
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetAndroidIapPackage", "business: errCode:" + r93Var.f384654d + ",errMsg:" + r93Var.f384655e);
        int i27 = r93Var.f384654d;
        java.lang.String str2 = r93Var.f384655e;
        if (i27 == 0) {
            this.f339844f = r93Var.f384656f;
            this.f339845g = r93Var.f384657g;
        }
        this.f339843e.onSceneEnd(i18, i27, str2, this);
    }
}
