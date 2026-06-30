package ss4;

/* loaded from: classes9.dex */
public class z extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f412147d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.ElementQuery f412148e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f412149f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f412150g;

    /* renamed from: h, reason: collision with root package name */
    public final int f412151h;

    /* renamed from: i, reason: collision with root package name */
    public int f412152i;

    /* renamed from: m, reason: collision with root package name */
    public int f412153m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.id_verify.model.Profession[] f412154n;

    /* renamed from: o, reason: collision with root package name */
    public int f412155o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String[] f412156p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.ArrayList f412157q;

    public z(java.lang.String str, java.lang.String str2, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        this(3, str, str2, payInfo, null, -1, -1, 0);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return hc1.i.CTRL_INDEX;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 73;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/elementquerynew";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        this.f412147d = new java.util.ArrayList();
        try {
            jSONObject.optString("time_stamp");
            java.lang.String optString = jSONObject.optString("bank_type");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f412150g)) {
                optString = this.f412150g;
            }
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("Array");
            int length = jSONArray.length();
            int i18 = 0;
            while (true) {
                boolean z17 = true;
                if (i18 >= length) {
                    break;
                }
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery = new com.tencent.mm.plugin.wallet_core.model.ElementQuery();
                elementQuery.d(jSONObject2);
                int i19 = this.f412151h;
                int i27 = elementQuery.I;
                l75.e0 e0Var = com.tencent.mm.plugin.wallet_core.model.Bankcard.A3;
                if ((i19 & i27) <= 0) {
                    z17 = false;
                }
                if (z17) {
                    ((java.util.ArrayList) this.f412147d).add(elementQuery);
                }
                if (optString != null && optString.equals(elementQuery.f179659s)) {
                    this.f412148e = elementQuery;
                }
                i18++;
            }
            android.util.SparseArray sparseArray = new android.util.SparseArray();
            org.json.JSONArray jSONArray2 = jSONObject.getJSONArray("cre_type_map");
            int length2 = jSONArray2.length();
            for (int i28 = 0; i28 < length2; i28++) {
                org.json.JSONObject jSONObject3 = jSONArray2.getJSONObject(i28);
                int optInt = jSONObject3.optInt("key", 0);
                if (optInt > 0) {
                    sparseArray.put(optInt, jSONObject3.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL));
                }
            }
            this.f412152i = jSONObject.optInt("need_area");
            this.f412153m = jSONObject.optInt("need_profession");
            com.tencent.mm.plugin.wallet_core.model.ElementQuery elementQuery2 = this.f412148e;
            if (elementQuery2 != null && elementQuery2.I != 1) {
                com.tencent.mars.xlog.Log.i(com.tencent.mm.wallet_core.tenpay.model.o.TAG, "oversea card, no need area and profession");
                this.f412152i = 0;
                this.f412153m = 0;
            }
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("profession_array");
            if (optJSONArray != null) {
                this.f412154n = new com.tencent.mm.plugin.wallet_core.id_verify.model.Profession[optJSONArray.length()];
                for (int i29 = 0; i29 < optJSONArray.length(); i29++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i29);
                    if (optJSONObject != null) {
                        java.lang.String optString2 = optJSONObject.optString("profession_name");
                        int optInt2 = optJSONObject.optInt("profession_type");
                        if (com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
                            com.tencent.mars.xlog.Log.i(com.tencent.mm.wallet_core.tenpay.model.o.TAG, "empty profession_name!");
                        } else {
                            this.f412154n[i29] = new com.tencent.mm.plugin.wallet_core.id_verify.model.Profession(optString2, optInt2);
                        }
                    }
                }
            }
            this.f412155o = jSONObject.optInt("need_nationality", 0);
            org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("nationality_exclude_array");
            if (optJSONArray2 != null) {
                this.f412156p = new java.lang.String[optJSONArray2.length()];
                for (int i37 = 0; i37 < optJSONArray2.length(); i37++) {
                    this.f412156p[i37] = optJSONArray2.optString(i37);
                }
            }
            org.json.JSONArray optJSONArray3 = jSONObject.optJSONArray("bank_card_info");
            if (optJSONArray3 != null) {
                this.f412157q = new java.util.ArrayList();
                for (int i38 = 0; i38 < optJSONArray3.length(); i38++) {
                    org.json.JSONObject optJSONObject2 = optJSONArray3.optJSONObject(i38);
                    if (optJSONObject2 != null) {
                        ys4.a aVar = new ys4.a();
                        aVar.f465219a = optJSONObject2.optString("bank_type");
                        aVar.f465220b = optJSONObject2.optString("mobile_hint");
                        aVar.f465221c = optJSONObject2.optString("mobile_tips");
                        this.f412157q.add(aVar);
                    }
                }
            }
            at4.b1 b1Var = ((pg0.a3) i95.n0.c(pg0.a3.class)).f353953d;
            java.util.List list = this.f412147d;
            java.util.ArrayList arrayList = this.f412157q;
            b1Var.f13810a = sparseArray;
            b1Var.f13811b = list;
            b1Var.f13812c = arrayList;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(com.tencent.mm.wallet_core.tenpay.model.o.TAG, e17, "", new java.lang.Object[0]);
        }
    }

    public z(java.lang.String str, java.lang.String str2, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, java.lang.String str3, int i17, int i18, int i19) {
        this(3, str, str2, payInfo, str3, i17, i18, i19);
    }

    public z(int i17, java.lang.String str, java.lang.String str2, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo, java.lang.String str3, int i18, int i19, int i27) {
        this.f412147d = null;
        this.f412148e = null;
        this.f412149f = null;
        this.f412150g = null;
        this.f412151h = 3;
        this.f412154n = null;
        this.f412156p = null;
        this.f412149f = str2;
        this.f412151h = i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        setPayInfo(payInfo, hashMap, hashMap2);
        hashMap.put("req_key", str);
        hashMap.put("flag", "4");
        hashMap.put("card_id", str2);
        i17 = (i17 > 3 || i17 < 1) ? 3 : i17;
        if (i19 > 0) {
            hashMap.put("realname_scene", i19 + "");
            com.tencent.mars.xlog.Log.i(com.tencent.mm.wallet_core.tenpay.model.o.TAG, "realname_scene=%d", java.lang.Integer.valueOf(i19));
        }
        if (i18 == 8) {
            hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1003");
        }
        hashMap.put("bank_card_tag", i17 + "");
        hashMap.put("token", str3);
        hashMap.put("newrealname", i27 + "");
        setRequestData(hashMap);
        if (com.tencent.mm.wallet_core.model.i1.f213914a) {
            hashMap2.put("uuid_for_bindcard", com.tencent.mm.wallet_core.model.i1.f213916c);
            hashMap2.put("bindcard_scene", "" + com.tencent.mm.wallet_core.model.i1.f213915b);
        }
        setWXRequestData(hashMap2);
    }
}
