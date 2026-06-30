package com.tencent.mm.wallet_core.model;

/* loaded from: classes9.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f213948a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f213949b;

    public n(java.lang.String str) {
        this.f213948a = "";
        this.f213949b = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            this.f213948a = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            jSONObject.optString("body1");
            jSONObject.optString("body2");
            this.f213949b = jSONObject.optString("button");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CrtRtnWoding", "crtwoding error %s", e17.getMessage());
        }
    }

    public n() {
        this.f213948a = "";
        this.f213949b = "";
    }
}
