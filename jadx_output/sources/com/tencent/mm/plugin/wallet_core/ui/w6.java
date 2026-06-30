package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class w6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f180764a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f180765b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f180766c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f180767d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f180768e;

    public w6(com.tencent.mm.plugin.wallet_core.ui.WalletOrderInfoOldUI walletOrderInfoOldUI, org.json.JSONObject jSONObject) {
        org.json.JSONObject optJSONObject;
        if (jSONObject == null || (optJSONObject = jSONObject.optJSONObject("activity_change_info")) == null) {
            return;
        }
        this.f180764a = optJSONObject.optString("url");
        this.f180765b = optJSONObject.optString("wording");
        this.f180766c = optJSONObject.optString("icon");
        this.f180767d = optJSONObject.optString("btn_text");
        this.f180768e = optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
    }

    public java.lang.String toString() {
        return this.f180764a + " , " + this.f180765b + " , " + this.f180766c + " , " + this.f180767d + " , " + this.f180768e;
    }
}
