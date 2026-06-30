package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public abstract class b {
    public static r45.vq0 a(org.json.JSONObject jSONObject) {
        r45.vq0 vq0Var = new r45.vq0();
        vq0Var.f388445s = jSONObject.optString("business_receipt_no");
        vq0Var.f388447u = jSONObject.optString("extend_str");
        vq0Var.f388439m = jSONObject.optString("fav_desc");
        vq0Var.f388437h = jSONObject.optLong("fav_id", 0L);
        vq0Var.f388438i = jSONObject.optString("fav_name");
        vq0Var.f388442p = jSONObject.optString("fav_price");
        vq0Var.f388435f = jSONObject.optLong("fav_property", 0L);
        vq0Var.f388444r = jSONObject.optInt("fav_scope_type", 0);
        vq0Var.f388434e = jSONObject.optLong("fav_sub_type", 0L);
        vq0Var.f388433d = jSONObject.optLong("fav_type", 0L);
        vq0Var.f388441o = jSONObject.optString("favor_remarks");
        vq0Var.f388436g = jSONObject.optString("favor_type_desc");
        vq0Var.f388440n = jSONObject.optString("favor_use_manual");
        vq0Var.f388443q = jSONObject.optString("real_fav_fee");
        vq0Var.f388446t = jSONObject.optInt("unavailable");
        return vq0Var;
    }

    public static java.util.LinkedList b(org.json.JSONArray jSONArray) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (jSONArray == null) {
            return linkedList;
        }
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            try {
                linkedList.add(a(jSONArray.getJSONObject(i17)));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiFavorInfoParser", e17, "", new java.lang.Object[0]);
            }
        }
        return linkedList;
    }
}
