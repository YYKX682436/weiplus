package rx4;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f401094a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401095b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f401096c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401097d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f401098e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f401099f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f401100g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f401101h;

    public b(org.json.JSONObject raw) {
        kotlin.jvm.internal.o.g(raw, "raw");
        this.f401094a = raw;
        this.f401095b = "";
        this.f401096c = "";
        this.f401097d = "";
        this.f401098e = "";
        this.f401099f = "";
        this.f401100g = "";
        this.f401101h = new java.util.ArrayList();
        java.lang.String optString = raw.optString("hotword", "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f401095b = optString;
        java.lang.String optString2 = raw.optString(dm.i4.COL_ID, "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f401096c = optString2;
        java.lang.String optString3 = raw.optString("subtitle", "");
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        this.f401097d = optString3;
        java.lang.String optString4 = raw.optString("coverUrl", "");
        kotlin.jvm.internal.o.f(optString4, "optString(...)");
        this.f401098e = optString4;
        java.lang.String optString5 = raw.optString("mixerCommonContext", "");
        kotlin.jvm.internal.o.f(optString5, "optString(...)");
        this.f401099f = optString5;
        java.lang.String optString6 = raw.optString("docInfo", "");
        kotlin.jvm.internal.o.f(optString6, "optString(...)");
        this.f401100g = optString6;
        kotlin.jvm.internal.o.f(raw.optString("finderSessionBuffer", ""), "optString(...)");
        try {
            org.json.JSONArray optJSONArray = raw.optJSONArray("tags");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    if (optJSONObject != null) {
                        this.f401101h.add(new rx4.y0(optJSONObject));
                    }
                }
            }
        } catch (org.json.JSONException unused) {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.b) && kotlin.jvm.internal.o.b(this.f401094a, ((rx4.b) obj).f401094a);
    }

    public int hashCode() {
        return this.f401094a.hashCode();
    }

    public java.lang.String toString() {
        return "FTSDramaItem(raw=" + this.f401094a + ')';
    }
}
