package wz2;

/* loaded from: classes14.dex */
public abstract class a {
    public static android.os.Bundle a(org.json.JSONObject jSONObject) {
        android.os.Bundle bundle = new android.os.Bundle();
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String obj = keys.next().toString();
            java.lang.Object opt = jSONObject.opt(obj);
            if (opt instanceof java.lang.Integer) {
                bundle.putInt(obj, ((java.lang.Integer) opt).intValue());
            } else if (opt instanceof java.lang.String) {
                bundle.putString(obj, (java.lang.String) opt);
            } else if (opt instanceof java.lang.Long) {
                bundle.putLong(obj, ((java.lang.Long) opt).longValue());
            }
        }
        return bundle;
    }

    public static java.lang.String b(org.json.JSONObject jSONObject, java.lang.String str) {
        java.lang.String optString = jSONObject.optString("err_tip", jSONObject.optString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, jSONObject.optString("errormsg", jSONObject.optString("err_msg", str))));
        if (android.text.TextUtils.isEmpty(optString)) {
            vz2.c.k("msgVerify", str);
            return str;
        }
        vz2.c.k("msgVerify", optString);
        return optString;
    }

    public static java.lang.String c(android.content.Context context, java.lang.String str) {
        return context.getResources().getString(context.getResources().getIdentifier(str, "string", com.tencent.mm.sdk.platformtools.x2.f193072b));
    }

    public static boolean d(org.json.JSONObject jSONObject) {
        return jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.LiveExKeys.LIVE_EX_ERR_CODE, 0) == 271449101;
    }

    public static boolean e() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_face_restore_switch, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashUtils", "[isOpenFaceRestoreSwitch] %s", java.lang.Boolean.valueOf(fj6));
        return fj6;
    }

    public static boolean f() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_face_check_cross_switch, false);
        boolean z17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Pay_FaceCheckCross_Int, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceFlashUtils", "isOpenCrossSwitch: %s, %s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(z17));
        if (z17) {
            return true;
        }
        return fj6;
    }

    public static boolean g(java.util.HashMap hashMap, java.lang.String str, int i17) {
        return hashMap.containsKey(str) && ((java.lang.Integer) hashMap.get(str)).intValue() == i17;
    }

    public static void h(android.content.Context context, java.util.HashMap hashMap) {
        try {
            if (hashMap.containsKey(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(java.lang.String.valueOf(hashMap.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)));
                java.lang.String string = jSONObject.getString("errormsg");
                if (android.text.TextUtils.isEmpty(string)) {
                    return;
                }
                jSONObject.put("errormsg", c(context, string));
                hashMap.put(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, jSONObject.toString());
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashUtils", e17, "replaceErrorMsg", new java.lang.Object[0]);
        }
    }

    public static void i(java.util.HashMap hashMap, java.lang.String str) {
        try {
            if (hashMap.containsKey(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(java.lang.String.valueOf(hashMap.get(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)));
                if (android.text.TextUtils.isEmpty(str)) {
                    return;
                }
                jSONObject.put("err_msg", str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceFlashUtils", e17, "setErrorMsg", new java.lang.Object[0]);
        }
    }

    public static void j(android.widget.TextView textView, java.lang.String str) {
        textView.setText("");
        textView.setTextSize(0, i65.a.h(textView.getContext(), com.tencent.mm.R.dimen.f479854h3));
        textView.setText(str);
    }
}
