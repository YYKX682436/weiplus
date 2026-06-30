package yx5;

/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f467978a;

    public a(org.json.JSONObject jSONObject) {
        this.f467978a = jSONObject;
    }

    public double a(java.lang.String str) {
        org.json.JSONObject jSONObject = this.f467978a;
        if (!jSONObject.has(str)) {
            by5.c4.g("ThrottleConfig", "updatePercent, no config key: " + str + ", return 0");
            return 0.0d;
        }
        try {
            return jSONObject.getJSONObject(str).getInt("percent") / 10000.0d;
        } catch (org.json.JSONException e17) {
            by5.c4.c("ThrottleConfig", "An error occurs when parsing 'percent'. Config: \n" + jSONObject + "\nError: \n" + e17.getMessage());
            return 0.0d;
        }
    }
}
