package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
class q1 implements com.tencent.mm.ipcinvoker.j {
    private q1() {
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d);
        android.os.Bundle bundle = new android.os.Bundle();
        if (e17 == null) {
            rVar.a(bundle);
        }
        java.lang.String optString = e17.optString("current");
        org.json.JSONArray optJSONArray = e17.optJSONArray("urls");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiImagePreview", "fail, urls is null");
            rVar.a(bundle);
        }
        for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
            java.lang.String optString2 = optJSONArray.optString(i17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(optString2) || optString2.equalsIgnoreCase("null")) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiImagePreview", "null url, i = %d", java.lang.Integer.valueOf(i17));
            } else {
                if (optString2.startsWith("weixin://resourceid/")) {
                    com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b17 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(optString2);
                    if (b17 != null) {
                        optString2 = b17.f182738g;
                    }
                }
                arrayList.add(optString2);
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = strArr[0];
        } else if (optString.startsWith("weixin://resourceid/")) {
            com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem b18 = com.tencent.mm.plugin.webview.modeltools.z.Zi().b(optString);
            optString = b18 != null ? b18.f182738g : "";
        }
        bundle.putString("nowUrl", optString);
        bundle.putStringArray("urlList", strArr);
        rVar.a(bundle);
    }
}
