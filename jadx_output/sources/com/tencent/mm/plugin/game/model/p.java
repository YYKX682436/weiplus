package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public long f140396a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f140397b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f140398c = -10;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f140399d = new java.util.ArrayList();

    public static com.tencent.mm.plugin.game.model.p a(java.lang.String str) {
        com.tencent.mm.plugin.game.model.p pVar = new com.tencent.mm.plugin.game.model.p();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return pVar;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            pVar.f140396a = jSONObject.optLong("startTime", 0L);
            pVar.f140397b = jSONObject.optLong("endTime", 0L);
            pVar.f140398c = jSONObject.optInt("basicType", -10);
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("msgIdList");
            if (optJSONArray != null) {
                for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                    ((java.util.ArrayList) pVar.f140399d).add(optJSONArray.optString(i17));
                }
            }
        } catch (org.json.JSONException unused) {
        }
        return pVar;
    }
}
