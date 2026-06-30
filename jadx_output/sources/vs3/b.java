package vs3;

/* loaded from: classes9.dex */
public abstract class b {
    public static java.lang.String a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String replaceAll = str.replaceAll("\\D", "");
        return replaceAll.startsWith("86") ? replaceAll.substring(2) : replaceAll;
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str.replaceAll(" ", ""));
        int length = sb6.length();
        if (length < 4) {
            return sb6.toString();
        }
        sb6.insert(3, ' ');
        if (length >= 8) {
            sb6.insert(8, ' ');
        }
        return sb6.toString();
    }

    public static com.tencent.mm.plugin.recharge.model.MallRechargeProduct c(java.lang.String str, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.recharge.model.MallRechargeProduct mallRechargeProduct = new com.tencent.mm.plugin.recharge.model.MallRechargeProduct(jSONObject.optInt("need_getlatestinfo", 1) == 1);
        mallRechargeProduct.f155070d = str;
        mallRechargeProduct.f155072f = jSONObject.getString("product_id");
        mallRechargeProduct.f155073g = jSONObject.getString("product_name");
        mallRechargeProduct.f155074h = jSONObject.optString("product_desc");
        mallRechargeProduct.f155075i = jSONObject.getInt("product_min_price") / 100.0f;
        mallRechargeProduct.f155076m = jSONObject.getInt("product_max_price") / 100.0f;
        mallRechargeProduct.f155071e = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
        mallRechargeProduct.f155077n = jSONObject.getInt("is_infinite") == 1;
        mallRechargeProduct.f155078o = jSONObject.getInt("left_count");
        mallRechargeProduct.f155079p = jSONObject.getInt("discount");
        mallRechargeProduct.f155080q = jSONObject.optInt("is_default_choose", 0) == 1;
        mallRechargeProduct.f155081r = jSONObject.optInt("product_type", 0);
        return mallRechargeProduct;
    }

    public static java.util.ArrayList d(java.lang.String str, org.json.JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                arrayList.add(c(str, jSONArray.getJSONObject(i17)));
            }
            return arrayList;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MallLogic", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
