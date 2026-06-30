package if1;

/* loaded from: classes7.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public int f291093a;

    /* renamed from: b, reason: collision with root package name */
    public float f291094b;

    /* renamed from: c, reason: collision with root package name */
    public float f291095c;

    public r(int i17, float f17, float f18) {
        this.f291093a = i17;
        this.f291094b = f17;
        this.f291095c = f18;
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(dm.i4.COL_ID, this.f291093a);
            jSONObject.put("x", this.f291094b / ik1.w.f());
            jSONObject.put("y", this.f291095c / ik1.w.f());
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return a().toString();
    }
}
