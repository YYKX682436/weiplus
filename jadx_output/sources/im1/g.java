package im1;

/* loaded from: classes15.dex */
public final class g extends im1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f292186a;

    /* renamed from: b, reason: collision with root package name */
    public float f292187b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f292188c = "";

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        kotlin.jvm.internal.o.g(jsonObj, "jsonObj");
        org.json.JSONObject optJSONObject = jsonObj.optJSONObject("params");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlattenFaceContourInfo", "fromJson, paramsJsonObj is null");
            return this;
        }
        this.f292186a = optJSONObject.optInt("face_model", 0);
        this.f292187b = (float) optJSONObject.optDouble("alpha", -1.0d);
        java.lang.String optString = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f292188c = optString;
        return this;
    }

    @Override // im1.a, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject b17 = super.b();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("face_model", this.f292186a);
        jSONObject.put("alpha", java.lang.Float.valueOf(this.f292187b));
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, this.f292188c);
        b17.put("params", jSONObject);
        return b17;
    }

    @Override // im1.a
    public java.lang.String c() {
        return "FaceContour";
    }
}
