package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f180932a;

    /* renamed from: b, reason: collision with root package name */
    public r45.n34 f180933b;

    /* renamed from: c, reason: collision with root package name */
    public r45.n34 f180934c;

    /* renamed from: d, reason: collision with root package name */
    public int f180935d;

    /* renamed from: e, reason: collision with root package name */
    public int f180936e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f180937f;

    /* renamed from: g, reason: collision with root package name */
    public int f180938g;

    public static com.tencent.mm.plugin.wallet_core.utils.n a(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.InterceptWin", "createFromJSONObject() jsonObject == null");
            return null;
        }
        com.tencent.mm.plugin.wallet_core.utils.n nVar = new com.tencent.mm.plugin.wallet_core.utils.n();
        nVar.f180932a = jSONObject.optString("wording");
        try {
            nVar.f180933b = com.tencent.mm.wallet_core.model.f0.a(jSONObject.getJSONObject("left_button"));
            nVar.f180934c = com.tencent.mm.wallet_core.model.f0.a(jSONObject.getJSONObject("right_button"));
            nVar.f180935d = jSONObject.optInt("win_type");
            nVar.f180936e = jSONObject.optInt("show_type");
            nVar.f180937f = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            nVar.f180938g = jSONObject.optInt("icon_type");
            return nVar;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.InterceptWin", "createFromJSONObject() Exception:%s", e17.getMessage());
            return null;
        }
    }

    public static com.tencent.mm.plugin.wallet_core.utils.n b(r45.g04 g04Var) {
        if (g04Var == null) {
            return null;
        }
        com.tencent.mm.plugin.wallet_core.utils.n nVar = new com.tencent.mm.plugin.wallet_core.utils.n();
        nVar.f180932a = g04Var.f374777d;
        nVar.f180933b = g04Var.f374778e;
        nVar.f180934c = g04Var.f374779f;
        nVar.f180935d = g04Var.f374780g;
        nVar.f180936e = g04Var.f374781h;
        nVar.f180937f = g04Var.f374782i;
        nVar.f180938g = g04Var.f374783m;
        return nVar;
    }
}
