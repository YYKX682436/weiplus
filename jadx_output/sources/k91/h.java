package k91;

/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f305595a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f305596b;

    public h(org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAppConfig", "renderBackend is null");
            this.f305595a = "webview";
            this.f305596b = new java.lang.String[0];
            return;
        }
        this.f305595a = jSONObject.optString("default", "webview");
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("allUsed");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            this.f305596b = new java.lang.String[0];
        } else {
            this.f305596b = new java.lang.String[optJSONArray.length()];
            for (int i17 = 0; i17 < optJSONArray.length(); i17++) {
                this.f305596b[i17] = optJSONArray.optString(i17, this.f305595a);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAppConfig", "renderBackend is %s, default is %s", jSONObject, this.f305595a);
    }
}
