package zr4;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public double f475200d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f475201e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f475202f;

    public c(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("token", str);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getFuncId() {
        return 1603;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 123;
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/tenpay/webankloanordershow";
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2;
        if (i17 == 0) {
            this.f475201e = jSONObject.optString("fee_type");
            this.f475200d = jSONObject.optDouble("total_fee") / 100.0d;
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("Array");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.f475202f = ((org.json.JSONObject) optJSONArray.opt(0)).optString("desc");
            }
            at4.t1 bj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).bj();
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("bindqueryresp");
            bj6.f13973a.clear();
            if (optJSONObject == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "parse from json error,json is null");
                return;
            }
            org.json.JSONArray optJSONArray2 = optJSONObject.optJSONArray("Array");
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "repayment bankcard list is null");
            } else {
                for (int i18 = 0; i18 < optJSONArray2.length(); i18++) {
                    at4.i a17 = at4.i.a();
                    try {
                        jSONObject2 = (org.json.JSONObject) optJSONArray2.get(i18);
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletRepaymentBankcardMgr", e17, "", new java.lang.Object[0]);
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        com.tencent.mm.plugin.wallet_core.model.Bankcard c17 = a17.c(jSONObject2);
                        if (c17.v0()) {
                            c17.field_desc = c17.field_bankName;
                        } else if (c17.w0()) {
                            c17.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kkj, c17.field_bankName, c17.field_bankcardTail);
                        } else if (c17.F0()) {
                            c17.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.l28, c17.field_bankName, c17.field_bankcardTail);
                        } else {
                            c17.field_desc = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kl9, c17.field_bankName, c17.field_bankcardTail);
                        }
                        bj6.f13973a.add(c17);
                    }
                }
            }
            org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject("user_info");
            if (optJSONObject2 != null) {
                bj6.f13974b = optJSONObject2.optString("last_card_bind_serialno");
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletRepaymentBankcardMgr", "user_info is null");
            }
        }
    }
}
