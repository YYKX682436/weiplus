package com.tencent.mm.ui.mmfb.sdk;

/* loaded from: classes13.dex */
public abstract class o {
    public static android.os.Bundle a(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        if (str != null) {
            for (java.lang.String str2 : str.split("&")) {
                java.lang.String[] split = str2.split("=");
                bundle.putString(java.net.URLDecoder.decode(split[0]), java.net.URLDecoder.decode(split[1]));
            }
        }
        return bundle;
    }

    public static java.lang.String b(android.os.Bundle bundle) {
        if (bundle == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean z17 = true;
        for (java.lang.String str : bundle.keySet()) {
            if (z17) {
                z17 = false;
            } else {
                sb6.append('&');
            }
            sb6.append(java.net.URLEncoder.encode(str) + "=" + java.net.URLEncoder.encode(bundle.getString(str)));
        }
        return sb6.toString();
    }

    public static org.json.JSONObject c(java.lang.String str) {
        if (str.equals("false")) {
            throw new com.tencent.mm.ui.mmfb.sdk.n("request failed");
        }
        if (str.equals("true")) {
            str = "{value : true}";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        if (jSONObject.has("error")) {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("error");
            throw new com.tencent.mm.ui.mmfb.sdk.n(jSONObject2.getString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE), jSONObject2.getString("type"), 0);
        }
        if (jSONObject.has(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE) && jSONObject.has("error_msg")) {
            throw new com.tencent.mm.ui.mmfb.sdk.n(jSONObject.getString("error_msg"), "", java.lang.Integer.parseInt(jSONObject.getString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE)));
        }
        if (jSONObject.has(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE)) {
            throw new com.tencent.mm.ui.mmfb.sdk.n("request failed", "", java.lang.Integer.parseInt(jSONObject.getString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.ERROR_CODE)));
        }
        if (jSONObject.has("error_msg")) {
            throw new com.tencent.mm.ui.mmfb.sdk.n(jSONObject.getString("error_msg"));
        }
        if (jSONObject.has("error_reason")) {
            throw new com.tencent.mm.ui.mmfb.sdk.n(jSONObject.getString("error_reason"));
        }
        return jSONObject;
    }

    public static java.lang.String d(java.io.InputStream inputStream) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream), 1000);
        while (true) {
            java.lang.String readLine = bufferedReader.readLine();
            if (readLine == null) {
                inputStream.close();
                return sb6.toString();
            }
            sb6.append(readLine);
        }
    }
}
