package com.unionpay;

/* loaded from: classes13.dex */
public final class d implements com.unionpay.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f220709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.b f220710b;

    public d(com.unionpay.b bVar, java.lang.String str) {
        this.f220710b = bVar;
        this.f220709a = str;
    }

    public final void a(java.lang.String str) {
        com.unionpay.b bVar = this.f220710b;
        bVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("responseId", this.f220709a);
        hashMap.put("responseData", str);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        "sending:".concat(java.lang.String.valueOf(jSONObject));
        bVar.f220701e.runOnUiThread(new com.unionpay.d0(bVar, java.lang.String.format("javascript:WebViewJavascriptBridge._handleMessageFromJava('%s');", jSONObject.replace("\\", "\\\\").replace("\"", "\\\"").replace("'", "\\'").replace("\n", "\\n").replace("\r", "\\r").replace("\f", "\\f"))));
    }
}
