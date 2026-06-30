package np1;

/* loaded from: classes.dex */
public final class d extends org.json.JSONObject {
    public d(java.lang.Object obj) {
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
            return;
        }
        if (obj instanceof java.lang.Double) {
            put("type", 4);
            put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL, obj);
        } else if (obj instanceof java.lang.Boolean) {
            put("type", 5);
            put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL, obj);
        } else if (obj instanceof byte[]) {
            put("type", 6);
            put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL, android.util.Base64.encodeToString((byte[]) obj, 2));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.BallInfo", "not support type, class:%s", obj.getClass());
            put("type", 0);
        }
    }

    public static void a(android.os.Bundle bundle, java.lang.String str, org.json.JSONObject jSONObject) {
        try {
            switch (jSONObject.getInt("type")) {
                case 1:
                    bundle.putString(str, jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL));
                    break;
                case 2:
                    bundle.putInt(str, jSONObject.getInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL));
                    break;
                case 3:
                    bundle.putLong(str, jSONObject.getLong(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL));
                    break;
                case 4:
                    bundle.putDouble(str, jSONObject.getDouble(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL));
                    break;
                case 5:
                    bundle.putBoolean(str, jSONObject.getBoolean(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL));
                    break;
                case 6:
                    bundle.putByteArray(str, android.util.Base64.decode(jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.JSON_KEY_VAL), 2));
                    break;
                default:
                    com.tencent.mars.xlog.Log.w("MicroMsg.BallInfo", "restoreToBundle, not support type");
                    break;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BallInfo", e17, "restoreToBundle fail, exception:%s", e17);
        }
    }
}
