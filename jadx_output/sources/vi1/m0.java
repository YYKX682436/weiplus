package vi1;

/* loaded from: classes7.dex */
public final class m0 {
    public m0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem a(java.lang.String jsonStr) {
        kotlin.jvm.internal.o.g(jsonStr, "jsonStr");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(jsonStr);
            java.lang.String optString = jSONObject.optString("mobile");
            java.lang.String optString2 = jSONObject.optString("show_mobile");
            boolean optBoolean = jSONObject.optBoolean("need_auth", true);
            boolean optBoolean2 = jSONObject.optBoolean("allow_send_sms", true);
            java.lang.String optString3 = jSONObject.optString("encryptedData");
            java.lang.String optString4 = jSONObject.optString("iv");
            boolean optBoolean3 = jSONObject.optBoolean("is_wechat", false);
            boolean optBoolean4 = jSONObject.optBoolean("is_check", false);
            java.lang.String optString5 = jSONObject.optString("cloud_id", "");
            java.lang.String optString6 = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "");
            kotlin.jvm.internal.o.d(optString);
            kotlin.jvm.internal.o.d(optString2);
            kotlin.jvm.internal.o.d(optString3);
            kotlin.jvm.internal.o.d(optString4);
            kotlin.jvm.internal.o.d(optString5);
            kotlin.jvm.internal.o.d(optString6);
            return new com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem(optString, optString2, optString3, optString4, optString5, optBoolean, optBoolean2, optBoolean3, optBoolean4, optString6);
        } catch (org.json.JSONException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PhoneItem", "jsonStr:%s", jsonStr);
            return null;
        }
    }
}
