package im1;

/* loaded from: classes15.dex */
public final class e extends im1.a {

    /* renamed from: b, reason: collision with root package name */
    public int f292178b;

    /* renamed from: a, reason: collision with root package name */
    public float f292177a = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public int f292179c = -1;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f292180d = "";

    /* renamed from: e, reason: collision with root package name */
    public float f292181e = -1.0f;

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        kotlin.jvm.internal.o.g(jsonObj, "jsonObj");
        org.json.JSONObject optJSONObject = jsonObj.optJSONObject("params");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlattenEyeBrowInfo", "fromJson, paramsJsonObj is null");
            return this;
        }
        this.f292177a = (float) optJSONObject.optDouble("alpha", -1.0d);
        this.f292178b = optJSONObject.optInt("face_model", 0);
        this.f292179c = optJSONObject.optInt("blend_mode", -1);
        java.lang.String optString = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f292180d = optString;
        this.f292181e = (float) optJSONObject.optDouble("shrink_rate", -1.0d);
        return this;
    }

    @Override // im1.a, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject b17 = super.b();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("alpha", java.lang.Float.valueOf(this.f292177a));
        jSONObject.put("face_model", this.f292178b);
        jSONObject.put("blend_mode", this.f292179c);
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f292180d);
        jSONObject.put("shrink_rate", java.lang.Float.valueOf(this.f292181e));
        b17.put("params", jSONObject);
        return b17;
    }

    @Override // im1.a
    public java.lang.String c() {
        return "EyeBrow";
    }
}
