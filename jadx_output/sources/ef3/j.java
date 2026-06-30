package ef3;

/* loaded from: classes4.dex */
public class j extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f252410d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f252411e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f252412f;

    /* renamed from: g, reason: collision with root package name */
    public final int f252413g;

    public j(int i17, java.lang.String str, int i18) {
        this(i17, str, null, null, i18);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f252411e = u0Var;
        return dispatch(sVar, this.f252412f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPayFunctionList", "errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            r45.uk3 uk3Var = (r45.uk3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPayFunctionList", "resp.PayFunctionList wallet_regionL " + this.f252413g + " " + uk3Var.f387427d);
            try {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(uk3Var.f387427d)) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(uk3Var.f387427d);
                    java.lang.String optString = jSONObject.optString("pay_func_list");
                    this.f252410d = bt4.d.h(new org.json.JSONArray(optString));
                    java.lang.String optString2 = jSONObject.optString("global_activity_list");
                    java.lang.String optString3 = jSONObject.optString("pay_banner_list");
                    java.lang.String optString4 = jSONObject.optString("type_info_list");
                    pg0.a3 a3Var = (pg0.a3) i95.n0.c(pg0.a3.class);
                    a3Var.getClass();
                    if (!gm0.j1.a()) {
                        throw new c01.c();
                    }
                    ((dt4.f) a3Var.f353962p.a()).y0(this.f252413g, optString, optString2, optString3, optString4, uk3Var.f387430g);
                    ef3.r.wi().f252428d.clear();
                }
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetPayFunctionList", e17, "", new java.lang.Object[0]);
            }
        }
        this.f252411e.onSceneEnd(i18, i19, str, this);
    }

    public j(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18) {
        this(i17, str, str3, java.lang.String.format("appid=%s&funcid=%s&url=%s", str2, str3, java.net.URLEncoder.encode(str4, com.tencent.kinda.framework.app.KindaConfigCacheStg.SAVE_CHARSET).toString()), i18);
    }

    public j(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        java.util.ArrayList<java.lang.String> arrayList = null;
        this.f252410d = null;
        this.f252413g = 0;
        this.f252413g = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tk3();
        lVar.f70665b = new r45.uk3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getpayfunctionlist";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.bio.face.j.CTRL_INDEX;
        lVar.f70668e = 227;
        lVar.f70669f = 1000000227;
        lVar.f70678o = 1;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f252412f = a17;
        r45.tk3 tk3Var = (r45.tk3) a17.f70710a.f70684a;
        tk3Var.f386517d = str;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews = (com.tencent.mm.plugin.wallet_core.model.mall.MallNews) ((java.util.HashMap) bt4.f.b().f24470a).get(str2);
            if (mallNews != null && !com.tencent.mm.sdk.platformtools.t8.K0(mallNews.f179835h)) {
                arrayList = new java.util.ArrayList();
                arrayList.add(mallNews.f179835h);
            }
        } else {
            bt4.f b17 = bt4.f.b();
            b17.getClass();
            arrayList = new java.util.ArrayList();
            for (com.tencent.mm.plugin.wallet_core.model.mall.MallNews mallNews2 : ((java.util.HashMap) b17.f24470a).values()) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(mallNews2.f179835h)) {
                    arrayList.add(mallNews2.f179835h);
                }
            }
            arrayList.size();
        }
        if (arrayList != null && arrayList.size() > 0) {
            java.lang.String str4 = "";
            for (java.lang.String str5 : arrayList) {
                r45.du5 du5Var = new r45.du5();
                du5Var.c(str5);
                linkedList.add(du5Var);
                str4 = str4 + "; + " + str5;
            }
        }
        tk3Var.f386519f = linkedList;
        tk3Var.f386518e = linkedList.size();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            tk3Var.f386520g = java.lang.String.format("tpa_country=%s", java.lang.Integer.valueOf(i17));
        } else {
            tk3Var.f386520g = java.lang.String.format("%s&tpa_country=%s", str3, java.lang.Integer.valueOf(i17));
        }
        tk3Var.f386521h = i18;
    }
}
