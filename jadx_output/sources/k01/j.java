package k01;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k01.j f303039a = new k01.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f303040b = kz5.c0.i("wx57f75d9ad73fa413", "wxb9fdcb9fdba754f3", "wxc954aec3c98f03e5");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.List f303041c = kz5.c0.i("gh_dbe35d1f01ff@app", "gh_143c22d410e7@app", "gh_1067e1418cf5@app");

    public final java.lang.Object a(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandLiteGameUtil", "getLiteGameInfoJsonValue error, liteGameInfo:" + str + ", fieldName:" + str2);
            return null;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has(str2)) {
                return jSONObject.get(str2);
            }
            return null;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandLiteGameUtil", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final boolean b(java.lang.String str, java.lang.String str2) {
        return kz5.n0.O(f303041c, str) || kz5.n0.O(f303040b, str2);
    }
}
