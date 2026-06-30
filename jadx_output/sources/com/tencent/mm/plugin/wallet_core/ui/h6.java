package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class h6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f180307a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f180308b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f180309c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f180310d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f180311e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f180312f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f180313g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f180314h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f180315i;

    /* renamed from: j, reason: collision with root package name */
    public final int f180316j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f180317k;

    public h6(org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("activity_change_info")) == null) {
            return;
        }
        this.f180307a = optJSONObject.optString("url");
        this.f180308b = optJSONObject.optString("wording");
        this.f180309c = optJSONObject.optString("icon");
        this.f180310d = optJSONObject.optString("btn_text");
        this.f180311e = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        optJSONObject.optString("tinyapp_name");
        this.f180312f = optJSONObject.optString("tinyapp_logo");
        this.f180313g = optJSONObject.optString("tinyapp_desc");
        this.f180314h = optJSONObject.optString("tinyapp_username");
        this.f180315i = optJSONObject.optString("tinyapp_path");
        this.f180317k = optJSONObject.optString("activity_tinyapp_btn_text");
    }

    public java.lang.String toString() {
        return this.f180307a + " , " + this.f180308b + " , " + this.f180309c + " , " + this.f180310d + " , " + this.f180311e;
    }

    public h6(r45.fh5 fh5Var) {
        r45.y1 y1Var;
        if (fh5Var == null || (y1Var = fh5Var.f374359f) == null) {
            return;
        }
        this.f180307a = y1Var.f390692d;
        java.lang.String str = y1Var.f390693e;
        this.f180308b = str;
        java.lang.String str2 = y1Var.f390694f;
        this.f180309c = str2;
        java.lang.String str3 = y1Var.f390695g;
        this.f180310d = str3;
        this.f180311e = y1Var.f390696h;
        this.f180314h = y1Var.f390697i;
        this.f180315i = y1Var.f390698m;
        this.f180316j = y1Var.f390699n;
        this.f180312f = str2;
        this.f180313g = str;
        this.f180317k = str3;
    }
}
