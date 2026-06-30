package im1;

/* loaded from: classes15.dex */
public final class d extends im1.a {

    /* renamed from: b, reason: collision with root package name */
    public int f292174b;

    /* renamed from: a, reason: collision with root package name */
    public float f292173a = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public int f292175c = -1;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f292176d = "";

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        kotlin.jvm.internal.o.g(jsonObj, "jsonObj");
        org.json.JSONObject optJSONObject = jsonObj.optJSONObject("params");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlattenBlusherStickInfo", "fromJson, paramsJsonObj is null");
            return this;
        }
        this.f292173a = (float) optJSONObject.optDouble("alpha", -1.0d);
        this.f292174b = optJSONObject.optInt("face_model", 0);
        this.f292175c = optJSONObject.optInt("blend_mode", -1);
        java.lang.String optString = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f292176d = optString;
        return this;
    }

    @Override // im1.a, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject b17 = super.b();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("alpha", java.lang.Float.valueOf(this.f292173a));
        jSONObject.put("face_model", this.f292174b);
        jSONObject.put("blend_mode", this.f292175c);
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f292176d);
        b17.put("params", jSONObject);
        return b17;
    }

    @Override // im1.a
    public java.lang.String c() {
        return "BlusherStick";
    }
}
