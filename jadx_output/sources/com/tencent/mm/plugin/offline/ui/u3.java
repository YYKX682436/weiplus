package com.tencent.mm.plugin.offline.ui;

/* loaded from: classes9.dex */
public class u3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f152732a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f152733b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f152734c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f152735d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f152736e;

    /* renamed from: f, reason: collision with root package name */
    public int f152737f;

    public u3(com.tencent.mm.plugin.offline.ui.WalletOfflineCoinPurseUI.AnonymousClass1 anonymousClass1) {
    }

    public static void a(com.tencent.mm.plugin.offline.ui.u3 u3Var, org.json.JSONObject jSONObject) {
        u3Var.f152732a = jSONObject.optString("icon_url");
        u3Var.f152733b = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        u3Var.f152734c = jSONObject.optString("tiny_app_username");
        u3Var.f152735d = jSONObject.optString("tiny_app_path");
        u3Var.f152736e = jSONObject.optString("h5_url");
        u3Var.f152737f = jSONObject.optInt("jump_type");
    }
}
