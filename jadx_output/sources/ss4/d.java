package ss4;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412028d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412029e;

    /* renamed from: f, reason: collision with root package name */
    public r45.y10 f412030f = null;

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, java.lang.String str8, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.x10();
        lVar.f70665b = new r45.y10();
        lVar.f70666c = "/cgi-bin/mmpay-bin/checkpayjsapi";
        lVar.f70667d = 580;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412029e = a17;
        r45.x10 x10Var = (r45.x10) a17.f70710a.f70684a;
        x10Var.f389633d = str;
        x10Var.f389635f = str2;
        x10Var.f389634e = str3;
        x10Var.f389636g = str4;
        x10Var.f389638i = str5;
        x10Var.f389637h = str6;
        x10Var.f389639m = str7;
        x10Var.f389640n = i17;
        x10Var.f389641o = at4.g0.c();
        if (com.tencent.mm.wallet_core.model.i1.f213914a) {
            x10Var.f389642p = com.tencent.mm.wallet_core.model.i1.f213916c;
        }
        x10Var.f389645s = 1;
        x10Var.f389647u = str8;
        x10Var.f389646t = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckPayJsapi", "appId: %s, url: %s, jsapiScene: %s", str, str7, java.lang.Integer.valueOf(i17));
    }

    public java.lang.String H() {
        return ((r45.y10) this.f412029e.f70711b.f70700a).f390704h;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412028d = u0Var;
        return dispatch(sVar, this.f412029e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 580;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        java.lang.String str2;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
            r45.y10 y10Var = (r45.y10) oVar.f70711b.f70700a;
            this.f412030f = y10Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + y10Var.f390700d + " resp.ErrMsg is " + y10Var.f390701e);
            r45.x10 x10Var = (r45.x10) oVar.f70710a.f70684a;
            java.lang.String str3 = x10Var.f389639m;
            if (str3 != null) {
                java.lang.String queryParameter = android.net.Uri.parse(str3).getQueryParameter("appid");
                if (queryParameter != x10Var.f389633d) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, y10Var.f390704h, "", java.lang.Integer.valueOf(x10Var.f389640n), x10Var.f389647u, x10Var.f389633d, java.lang.Integer.valueOf(x10Var.f389645s), java.lang.Integer.valueOf(x10Var.f389646t), x10Var.f389639m, queryParameter);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, y10Var.f390704h, "", java.lang.Integer.valueOf(x10Var.f389640n), x10Var.f389647u, x10Var.f389633d, java.lang.Integer.valueOf(x10Var.f389645s), java.lang.Integer.valueOf(x10Var.f389646t), x10Var.f389639m);
                }
            } else if (x10Var.f389643q != null && x10Var.f389644r != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, y10Var.f390704h, "", java.lang.Integer.valueOf(x10Var.f389640n), x10Var.f389647u, x10Var.f389633d, java.lang.Integer.valueOf(x10Var.f389645s), java.lang.Integer.valueOf(x10Var.f389646t), x10Var.f389644r, x10Var.f389643q);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckPayJsapi", "NetSceneCheckPayJsapi resp.ErrCode is " + y10Var.f390700d + " resp.ErrMsg is " + y10Var.f390701e);
            str2 = y10Var.f390701e;
        } else {
            str2 = str;
        }
        this.f412028d.onSceneEnd(i18, i19, str2, this);
    }

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, java.lang.String str7, java.lang.String str8, java.lang.String str9, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.x10();
        lVar.f70665b = new r45.y10();
        lVar.f70666c = "/cgi-bin/mmpay-bin/checkpayjsapi";
        lVar.f70667d = 580;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412029e = a17;
        r45.x10 x10Var = (r45.x10) a17.f70710a.f70684a;
        x10Var.f389633d = str;
        x10Var.f389635f = str2;
        x10Var.f389634e = str3;
        x10Var.f389636g = str4;
        x10Var.f389638i = str5;
        x10Var.f389637h = str6;
        x10Var.f389640n = i17;
        x10Var.f389643q = str7;
        x10Var.f389644r = str8;
        x10Var.f389645s = 2;
        x10Var.f389647u = str9;
        x10Var.f389646t = i18;
        x10Var.f389641o = at4.g0.c();
        if (com.tencent.mm.wallet_core.model.i1.f213914a) {
            x10Var.f389642p = com.tencent.mm.wallet_core.model.i1.f213916c;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckPayJsapi", "appId: %s, UserName: %s, path: %s，requestCode：%s", str, str7, str8, str9);
    }
}
