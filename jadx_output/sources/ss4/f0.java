package ss4;

/* loaded from: classes9.dex */
public class f0 extends com.tencent.mm.wallet_core.tenpay.model.o {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.model.Orders f412058d;

    public f0(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("trans_id", str);
        setRequestData(hashMap);
    }

    @Override // com.tencent.mm.wallet_core.tenpay.model.o
    public int getTenpayCgicmd() {
        return 3;
    }

    @Override // com.tencent.mm.wallet_core.model.z0
    public void onGYNetEnd(int i17, java.lang.String str, org.json.JSONObject jSONObject) {
        int i18;
        if (jSONObject != null) {
            try {
                this.f412058d = new com.tencent.mm.plugin.wallet_core.model.Orders();
                com.tencent.mm.plugin.wallet_core.model.Orders.Commodity commodity = new com.tencent.mm.plugin.wallet_core.model.Orders.Commodity();
                commodity.f179703d = jSONObject.getString("buy_uin");
                commodity.f179704e = jSONObject.getString("buy_name");
                commodity.f179705f = jSONObject.optString("sale_uin");
                commodity.f179706g = jSONObject.optString("sale_name");
                commodity.f179714r = jSONObject.getString("trans_id");
                commodity.f179707h = jSONObject.optString("goods_name");
                commodity.f179709m = jSONObject.optDouble("pay_num") / 100.0d;
                commodity.f179711o = jSONObject.getString("trade_state");
                commodity.f179712p = jSONObject.getString("trade_state_name");
                commodity.f179715s = jSONObject.getString("buy_bank_name");
                commodity.f179721y = jSONObject.optString("discount", "");
                commodity.f179713q = jSONObject.optInt("modify_timestamp");
                commodity.f179716t = jSONObject.optString("fee_type");
                commodity.f179717u = jSONObject.optString("appusername");
                commodity.f179719w = jSONObject.optString("app_telephone");
                commodity.f179710n = jSONObject.optDouble("original_total_fee", -1.0d) / 100.0d;
                commodity.f179716t = jSONObject.optString("fee_type", "");
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("subscribe_biz_info");
                if (optJSONObject != null) {
                    com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions = new com.tencent.mm.plugin.wallet_core.model.Orders.Promotions();
                    promotions.f179771d = 0;
                    promotions.f179773f = optJSONObject.optString("nickname");
                    java.lang.String optString = optJSONObject.optString(dm.i4.COL_USERNAME);
                    promotions.f179776i = optString;
                    commodity.f179718v = optString;
                    promotions.f179772e = optJSONObject.optString("logo_round_url");
                    promotions.f179775h = optJSONObject.optString("subscribe_biz_url");
                    i18 = optJSONObject.optInt("recommend_level");
                    commodity.f179722z = i18;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(promotions.f179773f)) {
                        commodity.H.add(promotions);
                    }
                } else {
                    i18 = 1;
                }
                org.json.JSONArray jSONArray = jSONObject.getJSONArray("activity_info");
                int length = jSONArray.length();
                for (int i19 = 0; i19 < length; i19++) {
                    org.json.JSONObject jSONObject2 = jSONArray.getJSONObject(i19);
                    com.tencent.mm.plugin.wallet_core.model.Orders.Promotions promotions2 = new com.tencent.mm.plugin.wallet_core.model.Orders.Promotions();
                    promotions2.f179771d = 1;
                    promotions2.f179772e = jSONObject2.optString("icon");
                    promotions2.f179773f = jSONObject2.optString("wording");
                    promotions2.f179775h = jSONObject2.optString("url");
                    promotions2.f179774g = jSONObject2.optString("btn_text");
                    promotions2.f179778n = jSONObject2.optInt("type");
                    promotions2.f179777m = jSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                    promotions2.f179779o = jSONObject2.optLong(com.tencent.mm.opensdk.constants.ConstantsAPI.WXWebPage.KEY_ACTIVITY_ID);
                    promotions2.f179780p = jSONObject2.optInt("activity_type", 0);
                    promotions2.f179781q = jSONObject2.optInt("award_id");
                    promotions2.f179782r = jSONObject2.optInt("send_record_id");
                    promotions2.f179783s = jSONObject2.optInt("user_record_id");
                    promotions2.f179785u = jSONObject2.optString("activity_tinyapp_username");
                    promotions2.f179786v = jSONObject2.optString("activity_tinyapp_path");
                    promotions2.f179787w = jSONObject2.optLong("activity_mch_id");
                    promotions2.f179788x = jSONObject2.optInt("activity_tinyapp_version");
                    promotions2.f179789y = jSONObject2.optString("get_award_params");
                    promotions2.f179790z = jSONObject2.optString("query_award_status_params");
                    com.tencent.mm.plugin.wallet_core.model.Orders.d(promotions2, jSONObject2.optJSONObject("exposure_info"));
                    commodity.H.add(promotions2);
                }
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("discount_array");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    int length2 = optJSONArray.length();
                    commodity.A = new java.util.ArrayList();
                    for (int i27 = 0; i27 < length2; i27++) {
                        org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i27);
                        com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo discountInfo = new com.tencent.mm.plugin.wallet_core.model.Orders.DiscountInfo();
                        discountInfo.f179740d = optJSONObject2.optDouble("payment_amount");
                        discountInfo.f179741e = optJSONObject2.optString("favor_desc");
                        commodity.A.add(discountInfo);
                    }
                }
                commodity.B = jSONObject.optString("rateinfo");
                jSONObject.optString("discount_rateinfo");
                commodity.C = jSONObject.optString("original_feeinfo");
                this.f412058d.M = new java.util.ArrayList();
                this.f412058d.M.add(commodity);
                this.f412058d.C = jSONObject.optString("trade_state_name");
                this.f412058d.A = i18;
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", e17, "", new java.lang.Object[0]);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneTenpayQueryOrderInfo", e18, "", new java.lang.Object[0]);
            }
        }
    }

    public f0(java.lang.String str, int i17) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("trans_id", str);
        hashMap.put("pay_type", "" + i17);
        setRequestData(hashMap);
    }
}
