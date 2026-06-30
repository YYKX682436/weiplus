package ss4;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412033d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412034e;

    /* renamed from: f, reason: collision with root package name */
    public r45.v20 f412035f;

    public e(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i17, java.lang.String str8, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u20();
        lVar.f70665b = new r45.v20();
        lVar.f70666c = "/cgi-bin/mmpay-bin/checkuserauthjsapi";
        lVar.f70667d = 2728;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412034e = a17;
        r45.u20 u20Var = (r45.u20) a17.f70710a.f70684a;
        u20Var.f386954d = str;
        u20Var.f386956f = str2;
        u20Var.f386955e = str3;
        u20Var.f386957g = str4;
        u20Var.f386959i = str5;
        u20Var.f386958h = str6;
        u20Var.f386960m = str7;
        u20Var.f386961n = i17;
        u20Var.f386962o = at4.g0.c();
        u20Var.f386965r = 1;
        u20Var.f386963p = null;
        u20Var.f386964q = null;
        u20Var.f386971x = str8;
        u20Var.f386970w = i18;
        mz2.a aVar = (mz2.a) ((pz2.a) gm0.j1.s(pz2.a.class));
        boolean a18 = aVar.a();
        re4.v a19 = re4.u.a();
        u20Var.f386966s = aVar.isRoot() ? 1 : 0;
        u20Var.f386967t = a19.f394553a;
        u20Var.f386968u = a19.f394554b;
        u20Var.f386969v = a18 ? 1 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckUserAuthJsapi", "appId: %s, url: %s, jsapiScene: %s, isOpenTouchPay: %b", str, str7, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(a18));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412033d = u0Var;
        return dispatch(sVar, this.f412034e, this);
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
            r45.v20 v20Var = (r45.v20) oVar.f70711b.f70700a;
            this.f412035f = v20Var;
            r45.u20 u20Var = (r45.u20) oVar.f70710a.f70684a;
            java.lang.String str3 = u20Var.f386960m;
            if (str3 != null) {
                java.lang.String queryParameter = android.net.Uri.parse(str3).getQueryParameter("appid");
                if (queryParameter != u20Var.f386954d) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, this.f412035f.f387823h, "", java.lang.Integer.valueOf(u20Var.f386961n), u20Var.f386971x, u20Var.f386954d, java.lang.Integer.valueOf(u20Var.f386965r), java.lang.Integer.valueOf(u20Var.f386970w), u20Var.f386960m, queryParameter);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, this.f412035f.f387823h, "", java.lang.Integer.valueOf(u20Var.f386961n), u20Var.f386971x, u20Var.f386954d, java.lang.Integer.valueOf(u20Var.f386965r), java.lang.Integer.valueOf(u20Var.f386970w), u20Var.f386960m);
                }
            } else if (u20Var.f386963p != null && u20Var.f386964q != null) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14954, v20Var.f387823h, "", java.lang.Integer.valueOf(u20Var.f386961n), u20Var.f386971x, u20Var.f386954d, java.lang.Integer.valueOf(u20Var.f386965r), java.lang.Integer.valueOf(u20Var.f386970w), u20Var.f386964q, u20Var.f386963p);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCheckUserAuthJsapi", "CheckUserAuthJsapiResponse resp.ErrCode is " + this.f412035f.f387819d + " resp.ErrMsg is " + this.f412035f.f387820e);
            str2 = this.f412035f.f387820e;
        } else {
            str2 = str;
        }
        this.f412033d.onSceneEnd(i18, i19, str2, this);
    }
}
