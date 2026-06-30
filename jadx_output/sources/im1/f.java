package im1;

/* loaded from: classes15.dex */
public final class f extends im1.a {

    /* renamed from: a, reason: collision with root package name */
    public float f292182a = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f292183b = -1;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f292184c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f292185d;

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        kotlin.jvm.internal.o.g(jsonObj, "jsonObj");
        org.json.JSONObject optJSONObject = jsonObj.optJSONObject("params");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlattenEyeShadowInfo", "fromJson, paramsJsonObj is null");
            return this;
        }
        this.f292182a = (float) optJSONObject.optDouble("alpha", -1.0d);
        this.f292183b = optJSONObject.optInt("blend_mode", -1);
        java.lang.String optString = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f292184c = optString;
        this.f292185d = optJSONObject.optString("shimmer_position", null);
        return this;
    }

    @Override // im1.a, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject b17 = super.b();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("alpha", java.lang.Float.valueOf(this.f292182a));
        jSONObject.put("blend_mode", this.f292183b);
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f292184c);
        java.lang.String str = this.f292185d;
        if (str != null) {
            jSONObject.put("shimmer_position", str);
        }
        jSONObject.put("eyeshadow_type", this.f292185d != null ? 1 : 0);
        b17.put("params", jSONObject);
        return b17;
    }

    @Override // im1.a
    public java.lang.String c() {
        return "EyeShadowV2";
    }
}
