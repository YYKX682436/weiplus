package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes8.dex */
public final class sc extends com.tencent.mm.plugin.webview.ui.tools.newjsapi.oc {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f186526c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f186527d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f186528e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f186529f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f186530g;

    public sc(java.lang.String str) {
        super(str);
        try {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f186416a = true;
            }
            org.json.JSONObject jSONObject = str != null ? new org.json.JSONObject(str) : null;
            if (jSONObject != null) {
                this.f186526c = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                this.f186527d = jSONObject.optString("link");
                this.f186528e = jSONObject.optString("desc");
                this.f186529f = jSONObject.optString("img_url");
                this.f186530g = jSONObject.optString("appId");
            }
        } catch (java.lang.RuntimeException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareCustomContent", "FixedShareData: RuntimeException, e = " + e17.getMessage());
            this.f186417b = true;
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareCustomContent", "FixedShareData: JSONException, e = " + e18.getMessage());
            this.f186417b = true;
        }
    }

    public boolean a() {
        if (this.f186416a) {
            return (this.f186417b || com.tencent.mm.sdk.platformtools.t8.K0(this.f186526c) || com.tencent.mm.sdk.platformtools.t8.K0(this.f186527d) || com.tencent.mm.sdk.platformtools.t8.K0(this.f186529f)) ? false : true;
        }
        return true;
    }
}
