package pi0;

/* loaded from: classes11.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f354665a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f354666b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f354667c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f354668d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f354669e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f354670f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.HashMap f354671g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f354672h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f354673i = true;

    public m1(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.HashMap hashMap) {
        this.f354665a = str;
        this.f354666b = str2;
        this.f354667c = str3;
        this.f354670f = hashMap;
    }

    public java.lang.String a() {
        java.lang.String str = this.f354667c;
        boolean isEmpty = str.isEmpty();
        java.lang.String str2 = this.f354665a;
        if (isEmpty || str.equals("/")) {
            return str2;
        }
        return str2 + "/" + str;
    }

    public java.lang.String b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("plugin", this.f354665a);
            jSONObject.put("entry", this.f354666b);
            jSONObject.put(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE, this.f354667c);
            jSONObject.put("engineId", this.f354668d);
            jSONObject.put("paramsKey", this.f354669e);
            if (this.f354671g != null) {
                jSONObject.put("initParams", new org.json.JSONObject(this.f354671g));
            }
            jSONObject.put("parentPageType", 0);
            jSONObject.put("isInitRoute", this.f354672h);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject.toString();
    }

    public java.lang.String toString() {
        return b();
    }
}
