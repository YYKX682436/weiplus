package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public abstract class a {
    public static org.json.JSONArray a(java.util.List list, r45.vq0 vq0Var) {
        if (list == null) {
            return new org.json.JSONArray();
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            while (it.hasNext()) {
                jSONArray.put(i17, d((r45.vq0) it.next()));
                i17++;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e17, "", new java.lang.Object[0]);
        }
        return jSONArray;
    }

    public static org.json.JSONObject b(r45.k6 k6Var) {
        if (k6Var == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("channel", k6Var.f378416f);
            jSONObject.put("favor_compose_info", c(k6Var.f378420m));
            jSONObject.put("f2f_id", k6Var.f378414d);
            jSONObject.put("payok_checksign", k6Var.f378419i);
            jSONObject.put("receiver_openid", k6Var.f378422o);
            jSONObject.put("receiver_username", k6Var.f378421n);
            jSONObject.put("scan_scene", k6Var.f378417g);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, k6Var.f378418h);
            jSONObject.put("total_amount", k6Var.f378423p);
            jSONObject.put("trans_id", k6Var.f378415e);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e17, "", new java.lang.Object[0]);
        }
        return jSONObject;
    }

    public static org.json.JSONObject c(r45.uq0 uq0Var) {
        if (uq0Var == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("favor_compose_id", uq0Var.f387564d);
            jSONObject.put("favor_info_list,", a(uq0Var.f387565e, new r45.vq0()));
            jSONObject.put("show_favor_amount,", uq0Var.f387566f);
            jSONObject.put("show_pay_amount,", uq0Var.f387567g);
            jSONObject.put("total_favor_amount,", uq0Var.f387568h);
            jSONObject.put("favor_desc", uq0Var.f387569i);
            jSONObject.put("compose_sort_flag", uq0Var.f387570m);
            jSONObject.put("extend_str", uq0Var.f387571n);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e17, "", new java.lang.Object[0]);
        }
        return jSONObject;
    }

    public static org.json.JSONObject d(r45.vq0 vq0Var) {
        if (vq0Var == null) {
            return new org.json.JSONObject();
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("fav_type", vq0Var.f388433d);
            jSONObject.put("fav_sub_type", vq0Var.f388434e);
            jSONObject.put("fav_property", vq0Var.f388435f);
            jSONObject.put("favor_type_desc", vq0Var.f388436g);
            jSONObject.put("fav_id", vq0Var.f388437h);
            jSONObject.put("fav_name", vq0Var.f388438i);
            jSONObject.put("fav_desc", vq0Var.f388439m);
            jSONObject.put("favor_use_manual", vq0Var.f388440n);
            jSONObject.put("favor_remarks", vq0Var.f388441o);
            jSONObject.put("fav_price", vq0Var.f388442p);
            jSONObject.put("real_fav_fee", vq0Var.f388443q);
            jSONObject.put("fav_scope_type", vq0Var.f388444r);
            jSONObject.put("business_receipt_no", vq0Var.f388445s);
            jSONObject.put("unavailable", vq0Var.f388446t);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BusiF2FFavorHelper", e17, "", new java.lang.Object[0]);
            return jSONObject;
        }
    }
}
