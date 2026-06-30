package tr4;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f421435d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f421436e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f421437f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f421438g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f421439h;

    public c(java.lang.String str, com.tencent.mm.pluginsdk.wallet.PayInfo payInfo) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Map<java.lang.String, java.lang.String> hashMap2 = new java.util.HashMap<>();
        setPayInfo(payInfo, hashMap, hashMap2);
        gm0.j1.i();
        kk.v vVar = new kk.v(com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(9, null), 0));
        this.f421439h = str;
        hashMap.put("import_code", str);
        hashMap.put("qqid", "" + vVar.toString());
        setRequestData(hashMap);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 37;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        this.f421435d = new java.util.ArrayList();
        try {
            "1".equals(jSONObject.optString("is_reg", "0"));
            this.f421436e = jSONObject.optString("token", "");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("Array");
            int length = jSONArray.length();
            for (int i18 = 0; i18 < length; i18++) {
                org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                com.tencent.mm.plugin.wallet_core.model.Bankcard c17 = at4.i.a().c(jSONObject2);
                if (c17 != null) {
                    if (2 == jSONObject2.optInt("bank_acc_type", 2)) {
                        int i19 = c17.field_cardType;
                        l75.e0 e0Var = com.tencent.mm.plugin.wallet_core.model.Bankcard.A3;
                        c17.field_cardType = i19 | 2;
                    }
                    c17.field_bankcardTail = jSONObject2.optString("bank_tail");
                    c17.J2 = "************" + c17.field_bankcardTail;
                    c17.field_trueName = jSONObject2.optString("true_name");
                    c17.I2 = jSONObject2.optString("cre_id");
                    c17.X2 = jSONObject2.optInt("cre_type", -1);
                    c17.Y2 = this.f421439h;
                    c17.Z2 = 1 == jSONObject2.optInt("samecardexist", 0);
                    if (c17.v0()) {
                        c17.field_desc = c17.field_bankName;
                    } else if (c17.w0()) {
                        c17.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkj, c17.field_bankName, c17.field_bankcardTail);
                    } else if (c17.F0()) {
                        c17.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l28, c17.field_bankName, c17.field_bankcardTail);
                    } else {
                        c17.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kl9, c17.field_bankName, c17.field_bankcardTail);
                    }
                    org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("bankappservice");
                    if (optJSONObject != null) {
                        this.f421437f = optJSONObject.optString(dm.i4.COL_USERNAME);
                        this.f421438g = optJSONObject.optString("app_recommend_desc");
                    }
                    this.f421435d.add(c17);
                }
            }
            this.f421435d.size();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneTenpayQueryBindBankcard", e17, "", new java.lang.Object[0]);
        }
    }
}
