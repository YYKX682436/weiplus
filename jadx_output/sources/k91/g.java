package k91;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f305583a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f305584b;

    public g(java.lang.String str, org.json.JSONObject jSONObject) {
        this.f305583a = str;
        this.f305584b = jSONObject.getString("desc");
    }

    public java.lang.String toString() {
        return "Permission{name='" + this.f305583a + "', desc='" + this.f305584b + "'}";
    }
}
