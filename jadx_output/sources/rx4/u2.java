package rx4;

/* loaded from: classes8.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f401291a;

    /* renamed from: b, reason: collision with root package name */
    public final org.json.JSONArray f401292b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f401293c;

    /* renamed from: d, reason: collision with root package name */
    public final int f401294d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f401295e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f401296f;

    /* renamed from: g, reason: collision with root package name */
    public final int f401297g;

    public u2(java.lang.String jsonString) {
        kotlin.jvm.internal.o.g(jsonString, "jsonString");
        this.f401291a = jsonString;
        this.f401293c = "";
        this.f401295e = "";
        this.f401296f = "";
        org.json.JSONObject jSONObject = new org.json.JSONObject(jsonString);
        this.f401292b = jSONObject.optJSONArray(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.lang.String optString = jSONObject.optString("placeholder", "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f401293c = optString;
        this.f401294d = jSONObject.optInt("placeholderSource", 0);
        java.lang.String optString2 = jSONObject.optString("placeholderMixerCommonContext", "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f401295e = optString2;
        java.lang.String optString3 = jSONObject.optString("searchID");
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        this.f401296f = optString3;
        this.f401297g = jSONObject.optInt("reqtype", 0);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.u2) && kotlin.jvm.internal.o.b(this.f401291a, ((rx4.u2) obj).f401291a);
    }

    public int hashCode() {
        return this.f401291a.hashCode();
    }

    public java.lang.String toString() {
        return "WebSearchTeachRespJSON(jsonString=" + this.f401291a + ')';
    }
}
