package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public final class y3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f140533a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f140534b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f140535c;

    /* renamed from: d, reason: collision with root package name */
    public int f140536d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f140537e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f140538f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f140539g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f140540h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f140541i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f140542j;

    public y3(com.tencent.mm.plugin.game.model.x3 x3Var) {
    }

    public com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.QQDownloaderSDKWrapper", "params is : [%s]", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.QQDownloaderSDKWrapper", "params is null or nil");
        } else {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                this.f140535c = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_TASK_APKID);
                this.f140537e = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_VIA);
                this.f140536d = jSONObject.optInt(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_TASK_VERSION);
                this.f140541i = jSONObject.optString("channelID");
                this.f140539g = jSONObject.optString("uin");
                this.f140533a = jSONObject.optString("SNGAppId");
                this.f140534b = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_TASK_APPID);
                this.f140540h = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_UINTYPE);
                this.f140538f = jSONObject.optString(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_TASK_PACKAGENAME);
                this.f140542j = jSONObject.optString("actionFlag");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.QQDownloaderSDKWrapper", "parse parms failed:[%s]", e17.getMessage());
            }
        }
        return new com.tencent.tmassistantsdk.openSDK.TMQQDownloaderOpenSDKParam(this.f140533a, this.f140534b, this.f140535c, this.f140536d, this.f140537e, this.f140538f, this.f140539g, this.f140540h, this.f140541i, this.f140542j);
    }
}
