package d05;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public d05.k f225587d;

    public d(java.lang.String str, boolean z17, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("bind_serialno", str);
        hashMap.put("bank_type", str2);
        if (z17) {
            hashMap.put("query_method", "1");
        } else {
            hashMap.put("query_method", "0");
        }
        setRequestData(hashMap);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        hashMap2.put("banktype", str2);
        setWXRequestData(hashMap2);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 57;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        if (i17 != 0) {
            return;
        }
        try {
            d05.k kVar = new d05.k();
            this.f225587d = kVar;
            kVar.f225595a = jSONObject.optInt("credit_state");
            this.f225587d.f225596b = jSONObject.optInt("credit_amount") / 100.0d;
            this.f225587d.f225597c = jSONObject.optInt("credit_usable") / 100.0d;
            this.f225587d.f225598d = jSONObject.optInt("bill_amount") / 100.0d;
            d05.k kVar2 = this.f225587d;
            jSONObject.optInt("bill_date");
            kVar2.getClass();
            this.f225587d.f225599e = jSONObject.optInt("repay_amount") / 100.0d;
            d05.k kVar3 = this.f225587d;
            jSONObject.optInt("repay_minimum");
            kVar3.getClass();
            d05.k kVar4 = this.f225587d;
            boolean z17 = true;
            if (jSONObject.optInt("upgrade_amount") != 1) {
                z17 = false;
            }
            kVar4.f225600f = z17;
            d05.k kVar5 = this.f225587d;
            jSONObject.optInt("bill_month");
            kVar5.getClass();
            this.f225587d.f225601g = jSONObject.optString("repay_url");
            this.f225587d.f225602h = jSONObject.optString("repay_lasttime");
            this.f225587d.f225606l = jSONObject.optString("lasttime");
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("jump_url_array");
            if (jSONArray != null && jSONArray.length() > 0) {
                int length = jSONArray.length();
                for (int i18 = 0; i18 < length; i18++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i18);
                    java.lang.String string = jSONObject2.getString("jump_name");
                    if ("account_rights_url".equals(string)) {
                        this.f225587d.f225604j = jSONObject2.getString("jump_url");
                    } else if ("bill_url".equals(string)) {
                        this.f225587d.f225605k = jSONObject2.getString("jump_url");
                    } else if ("card_detail_url".equals(string)) {
                        this.f225587d.f225603i = jSONObject2.getString("jump_url");
                    } else if ("know_more_url".equals(string)) {
                        this.f225587d.f225607m = jSONObject2.getString("jump_url");
                    }
                }
            }
            org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("appservice");
            if (jSONObject3 != null) {
                this.f225587d.f225608n = new d05.j();
                jSONObject3.getString("app_telephone");
                d05.j jVar = this.f225587d.f225608n;
                jSONObject3.getString("nickname");
                jVar.getClass();
                this.f225587d.f225608n.f225594a = jSONObject3.getString(dm.i4.COL_USERNAME);
                d05.j jVar2 = this.f225587d.f225608n;
                jSONObject3.getString("jump_url");
                jVar2.getClass();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Micromsg.NetSceneTenpayCheckPwd", e17, "", new java.lang.Object[0]);
        }
    }
}
