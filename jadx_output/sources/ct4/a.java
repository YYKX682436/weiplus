package ct4;

/* loaded from: classes9.dex */
public class a extends at4.i {

    /* renamed from: b, reason: collision with root package name */
    public static ct4.a f222304b;

    @Override // at4.i
    public com.tencent.mm.plugin.wallet_core.model.Bankcard c(org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard c17 = super.c(jSONObject);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("cvv_length", jSONObject.optInt("cvv_length"));
            jSONObject2.put("information", jSONObject.optString("information"));
            jSONObject2.put("verified", jSONObject.optBoolean("verified"));
            jSONObject2.put("card_expiry", jSONObject.optString("card_expiry"));
            jSONObject2.put("is_credit", jSONObject.optString("bank_type").equals("CREDITCARD_PAYU"));
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BankcardPayUWrapper", e17, "", new java.lang.Object[0]);
        }
        c17.field_ext_msg = jSONObject2.toString();
        c17.field_bankcardClientType = 1;
        c17.field_desc = jSONObject.optString("description");
        c17.field_trueName = jSONObject.optString("name_on_card");
        if ("CREDITCARD_PAYU".equals(jSONObject.optString("bank_type"))) {
            int i17 = c17.field_cardType;
            l75.e0 e0Var = com.tencent.mm.plugin.wallet_core.model.Bankcard.A3;
            c17.field_cardType = i17 | 2;
        } else {
            int i18 = c17.field_cardType;
            l75.e0 e0Var2 = com.tencent.mm.plugin.wallet_core.model.Bankcard.A3;
            c17.field_cardType = i18 | 8;
        }
        return c17;
    }
}
