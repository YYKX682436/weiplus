package nw4;

/* loaded from: classes7.dex */
public abstract class z2 {
    public static nw4.y2 a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgWrapperHelper", "fromString fail, src is null");
            return null;
        }
        nw4.y2 y2Var = new nw4.y2();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            y2Var.f341012b = jSONObject.optString("__msg_type", "");
            y2Var.f341013c = jSONObject.optString("__callback_id", "-1");
            y2Var.f341019i = jSONObject.getString("func");
            y2Var.f340790a = new java.util.HashMap();
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            if (android.text.TextUtils.isEmpty(y2Var.f341019i) || !u46.a.b(o45.vf.f343014b, y2Var.f341019i)) {
                y2Var.f341014d = null;
            } else {
                y2Var.f341014d = jSONObject2;
            }
            if (jSONObject2 != null) {
                d(jSONObject2, y2Var.f340790a);
            }
            return y2Var;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgWrapperHelper", "fromString fail, exception = " + e17.getMessage());
            return null;
        }
    }

    public static java.util.List b(java.lang.String str, boolean z17, java.lang.String str2) {
        org.json.JSONArray jSONArray;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgWrapperHelper", "getMsgList fail, src is null");
            return null;
        }
        try {
            if (z17) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                jSONArray = jSONObject.getJSONArray("__json_message");
                java.lang.String string = jSONObject.getString("__sha_key");
                java.lang.String b17 = kk.r.b(jSONArray.toString().replaceAll("\\\\/", "/") + str2);
                if (!string.equals(b17)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgWrapperHelper", "fromString SHA1 verification failed, sha1Str = %s, calSha1Str = %s, jsonList = %s", string, b17, jSONArray.toString().replaceAll("\\\\/", "/"));
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(894L, 6L, 1L, false);
                    return null;
                }
            } else {
                jSONArray = new org.json.JSONArray(str);
            }
            if (jSONArray.length() == 0) {
                return null;
            }
            java.util.LinkedList linkedList = new java.util.LinkedList();
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                linkedList.add(a(jSONArray.getString(i17)));
            }
            return linkedList;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgWrapperHelper", "dealMsgQueue fail, exception = " + e17.getMessage());
            return null;
        }
    }

    public static nw4.y2 c(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        nw4.y2 y2Var = new nw4.y2();
        y2Var.f341012b = "call";
        y2Var.f341019i = str;
        y2Var.f340790a = new java.util.HashMap();
        y2Var.f341013c = str3;
        org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
        if (android.text.TextUtils.isEmpty(y2Var.f341019i) || !u46.a.b(o45.vf.f343014b, y2Var.f341019i)) {
            y2Var.f341014d = null;
        } else {
            y2Var.f341014d = jSONObject;
        }
        d(jSONObject, y2Var.f340790a);
        return y2Var;
    }

    public static void d(org.json.JSONObject jSONObject, java.util.Map map) {
        java.util.Iterator<java.lang.String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            java.lang.String string = jSONObject.getString(next);
            if (string == null) {
                string = "";
            }
            if ("urls".equalsIgnoreCase(next) || "localCacheIds".equalsIgnoreCase(next)) {
                try {
                    org.json.JSONArray jSONArray = new org.json.JSONArray(string);
                    int length = jSONArray.length();
                    java.lang.String[] strArr = new java.lang.String[length];
                    for (int i17 = 0; i17 < length; i17++) {
                        strArr[i17] = jSONArray.getString(i17);
                    }
                    map.put(next, strArr);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MsgWrapperHelper", "parse JSONArray fail, ex = %s", e17.getMessage());
                }
            } else {
                map.put(next, string);
            }
        }
    }
}
