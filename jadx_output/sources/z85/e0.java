package z85;

/* loaded from: classes12.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f470793a;

    /* renamed from: b, reason: collision with root package name */
    public int f470794b;

    /* renamed from: c, reason: collision with root package name */
    public long f470795c;

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("key", this.f470793a);
            jSONObject.put("use_count", this.f470794b);
            jSONObject.put("last_time", this.f470795c);
            return jSONObject;
        } catch (org.json.JSONException unused) {
            return null;
        }
    }
}
