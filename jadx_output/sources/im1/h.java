package im1;

/* loaded from: classes15.dex */
public final class h extends im1.a {

    /* renamed from: a, reason: collision with root package name */
    public float f292189a = -1.0f;

    /* renamed from: b, reason: collision with root package name */
    public int f292190b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f292191c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f292192d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f292193e;

    /* renamed from: f, reason: collision with root package name */
    public int f292194f;

    /* renamed from: g, reason: collision with root package name */
    public int f292195g;

    @Override // t85.a
    public t85.a a(org.json.JSONObject jsonObj) {
        kotlin.jvm.internal.o.g(jsonObj, "jsonObj");
        org.json.JSONObject optJSONObject = jsonObj.optJSONObject("params");
        if (optJSONObject == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlattenLipStickInfo", "fromJson, paramsJsonObj is null");
            return this;
        }
        this.f292189a = (float) optJSONObject.optDouble("alpha", -1.0d);
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("color");
        if (optJSONArray == null || 1 > optJSONArray.length()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FlattenLipStickInfo", "fromJson, colorJsonArr2d is illegal");
        } else {
            org.json.JSONArray jSONArray = optJSONArray.getJSONArray(0);
            if (jSONArray == null || 3 != optJSONArray.length()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FlattenLipStickInfo", "fromJson, colorJsonArr is illegal");
            } else {
                this.f292190b = jSONArray.optInt(0, -1);
                this.f292191c = jSONArray.optInt(1, -1);
                this.f292192d = jSONArray.optInt(2, -1);
            }
        }
        this.f292193e = optJSONObject.optInt("lipstick_type", 0);
        this.f292194f = optJSONObject.optInt("face_model", 0);
        this.f292195g = optJSONObject.optInt("mouth_shape", 0);
        return this;
    }

    @Override // im1.a, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject b17 = super.b();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("alpha", java.lang.Float.valueOf(this.f292189a));
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONArray jSONArray2 = new org.json.JSONArray();
        jSONArray2.put(this.f292190b);
        jSONArray2.put(this.f292191c);
        jSONArray2.put(this.f292192d);
        jSONArray.put(jSONArray2);
        jSONObject.put("color", jSONArray);
        jSONObject.put("lipstick_type", this.f292193e);
        jSONObject.put("face_model", this.f292194f);
        jSONObject.put("mouth_shape", this.f292195g);
        b17.put("params", jSONObject);
        return b17;
    }

    @Override // im1.a
    public java.lang.String c() {
        return "LipStickV2";
    }
}
