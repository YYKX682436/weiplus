package gx4;

/* loaded from: classes.dex */
public final class m extends org.json.JSONObject {
    public m(java.lang.Object obj) {
        if (obj instanceof java.lang.String) {
            put("type", 1);
            put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL, obj);
            return;
        }
        if (obj instanceof java.lang.Integer) {
            put("type", 2);
            put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL, obj);
            return;
        }
        if (obj instanceof java.lang.Long) {
            put("type", 3);
            put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL, obj);
        } else if (obj instanceof java.lang.Boolean) {
            put("type", 4);
            put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL, obj);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebViewBagIntentLogic", "put not support type;class:%s", obj.getClass());
            put("type", 0);
            put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL, obj);
        }
    }

    public static void a(android.os.Bundle bundle, java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            int i17 = jSONObject.getInt("type");
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewBagIntentLogic", "restoreToBundle key:%s type：%d", str, java.lang.Integer.valueOf(i17));
            if (i17 == 1) {
                bundle.putString(str, jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL));
            } else if (i17 == 2) {
                bundle.putInt(str, jSONObject.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL));
            } else if (i17 == 3) {
                bundle.putLong(str, jSONObject.getLong(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL));
            } else if (i17 != 4) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewBagIntentLogic", "not support type");
            } else {
                bundle.putBoolean(str, jSONObject.getBoolean(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewBagIntentLogic", "restoreToBundle e:%s", e17);
        }
    }
}
