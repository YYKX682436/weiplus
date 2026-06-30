package nu3;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONArray f340185a = new org.json.JSONArray();

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f340186b = new java.lang.Object();

    public final void a(int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("aid", i17);
        jSONObject.put("td", this.f340185a.length() + 1);
        if (this.f340185a.toString().length() + jSONObject.toString().length() <= 1000) {
            synchronized (this.f340186b) {
                this.f340185a.put(jSONObject);
            }
        }
    }

    public final java.lang.String b() {
        java.lang.String t17;
        synchronized (this.f340186b) {
            java.lang.String jSONArray = this.f340185a.toString();
            kotlin.jvm.internal.o.f(jSONArray, "toString(...)");
            t17 = r26.i0.t(jSONArray, ",", ";", false);
        }
        return t17;
    }
}
