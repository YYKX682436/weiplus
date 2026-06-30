package xz1;

/* loaded from: classes13.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f458203a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f458204b;

    public final void a(org.json.JSONObject jSONObject) {
        int optInt = jSONObject.optInt(dm.i4.COL_ID);
        java.lang.String optString = jSONObject.optJSONObject("params").optString("url");
        com.tencent.mars.xlog.Log.i("MicroMsg.DevTools.DevtoolsSourcesDealer", "page on rev " + optString);
        java.lang.String str = (java.lang.String) ((java.util.HashMap) this.f458203a).get(optString);
        if (str != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(dm.i4.COL_ID, optInt);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("content", str);
            jSONObject3.put("base64Encoded", true);
            jSONObject2.put("result", jSONObject3);
            this.f458204b = jSONObject2.toString();
        }
    }

    public final void b(org.json.JSONObject jSONObject) {
        int optInt = jSONObject.optInt(dm.i4.COL_ID);
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        org.json.JSONObject jSONObject4 = new org.json.JSONObject();
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (java.lang.String str : ((java.util.HashMap) this.f458203a).keySet()) {
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put("url", str);
                java.lang.String[] split = str.split("\\.");
                if (split.length > 0) {
                    java.lang.String str2 = split[split.length - 1];
                    if ("jpeg".equals(str2) || "jpg".equals(str2)) {
                        jSONObject6.put("mimeType", "image/jpeg");
                    }
                    if ("svg".equals(str2)) {
                        jSONObject6.put("mimeType", "image/svg+xml");
                    }
                }
                jSONObject6.put("type", "Image");
            } catch (org.json.JSONException unused) {
            }
            jSONArray.put(jSONObject6);
        }
        jSONObject5.put(dm.i4.COL_ID, "1");
        jSONObject5.put("mimeType", "text/html");
        jSONObject5.put("loaderId", "1");
        jSONObject5.put("secureContextType", "Secure");
        jSONObject5.put("securityOrigin", "");
        jSONObject5.put("url", "");
        jSONObject4.put("frame", jSONObject5);
        jSONObject4.put("resources", jSONArray);
        jSONObject3.put("frameTree", jSONObject4);
        jSONObject2.put(dm.i4.COL_ID, optInt);
        jSONObject2.put("result", jSONObject3);
        com.tencent.mars.xlog.Log.i("spacex", jSONObject2.toString());
        this.f458204b = jSONObject2.toString();
    }

    public xz1.m c(java.lang.String str) {
        org.json.JSONObject jSONObject;
        java.lang.String optString;
        boolean equals;
        xz1.m mVar;
        try {
            jSONObject = new org.json.JSONObject(str);
            optString = jSONObject.optString(ya.b.METHOD);
            equals = "Page.getResourceTree".equals(optString);
            mVar = xz1.m.DEAL_CLIENT_FRAMEWORK;
        } catch (org.json.JSONException unused) {
        }
        if (equals) {
            b(jSONObject);
            return mVar;
        }
        if ("Page.enable".equals(optString)) {
            int optInt = jSONObject.optInt(dm.i4.COL_ID);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(dm.i4.COL_ID, optInt);
            jSONObject2.put("result", new org.json.JSONObject());
            this.f458204b = jSONObject2.toString();
            return mVar;
        }
        if ("Page.getResourceContent".equals(optString)) {
            a(jSONObject);
            return mVar;
        }
        boolean startsWith = optString.startsWith("CSS");
        xz1.m mVar2 = xz1.m.DEAL_FRONT;
        if (startsWith || optString.startsWith("DOM") || optString.startsWith("Exparser")) {
            return mVar2;
        }
        boolean startsWith2 = optString.startsWith("Target");
        xz1.m mVar3 = xz1.m.DEAL_CLIENT_BIZ;
        if (startsWith2 || optString.startsWith("Overlay") || optString.startsWith("Emulation") || optString.startsWith("Page") || "Runtime.runIfWaitingForDebugger".equals(optString) || optString.startsWith("WeChat")) {
            return mVar3;
        }
        return xz1.m.DEAL_V8;
    }
}
