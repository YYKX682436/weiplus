package im1;

/* loaded from: classes10.dex */
public final class q extends t85.f {

    /* renamed from: g, reason: collision with root package name */
    public org.json.JSONObject f292204g;

    @Override // t85.f, t85.a
    public org.json.JSONObject b() {
        org.json.JSONObject jSONObject;
        org.json.JSONObject b17 = super.b();
        org.json.JSONObject optJSONObject = b17.optJSONObject("params");
        if (optJSONObject != null && (jSONObject = this.f292204g) != null) {
            try {
                optJSONObject.put("template_trans_set", jSONObject);
            } catch (java.lang.Exception unused) {
            }
        }
        return b17;
    }
}
