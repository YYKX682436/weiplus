package rx4;

/* loaded from: classes8.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f401324a;

    /* renamed from: b, reason: collision with root package name */
    public final int f401325b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f401326c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401327d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f401328e;

    /* renamed from: f, reason: collision with root package name */
    public final int f401329f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f401330g;

    /* renamed from: h, reason: collision with root package name */
    public final rx4.y0 f401331h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f401332i;

    public x0(org.json.JSONObject raw, int i17, boolean z17) {
        org.json.JSONObject optJSONObject;
        int i18;
        kotlin.jvm.internal.o.g(raw, "raw");
        this.f401324a = raw;
        this.f401325b = i17;
        this.f401326c = z17;
        this.f401327d = "";
        this.f401328e = "";
        this.f401332i = "";
        java.lang.String optString = raw.optString("hotword", "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f401327d = optString;
        java.lang.String optString2 = raw.optString("mixerCommonContext", "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f401328e = optString2;
        boolean z18 = false;
        this.f401329f = raw.optInt(ya.b.SOURCE, 0);
        java.lang.String optString3 = raw.optString("showText", "");
        kotlin.jvm.internal.o.d(optString3);
        if (optString3.length() > 0) {
            this.f401330g = r26.n0.B(optString3, "font-color-BOLD", false);
        }
        org.json.JSONArray optJSONArray = raw.optJSONArray("tags");
        if (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) {
            return;
        }
        rx4.y0 y0Var = new rx4.y0(optJSONObject);
        this.f401332i = y0Var.f401338b;
        if (r26.n0.D(y0Var.f401340d, "var(--ORANGE)", false, 2, null) || (i18 = y0Var.f401339c) == 1 || i18 == 35 || (z17 && (i18 == 6 || i18 == 11))) {
            z18 = true;
        }
        if (z18) {
            this.f401331h = y0Var;
        }
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f401325b;
        sb6.append(i17 + 1);
        sb6.append('|');
        sb6.append(i17 + 1);
        sb6.append('|');
        sb6.append(fp.s0.b(this.f401327d, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        sb6.append("||1|");
        sb6.append(fp.s0.b(this.f401332i, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        sb6.append("|||title|");
        sb6.append(this.f401329f);
        return sb6.toString();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.x0)) {
            return false;
        }
        rx4.x0 x0Var = (rx4.x0) obj;
        return kotlin.jvm.internal.o.b(this.f401324a, x0Var.f401324a) && this.f401325b == x0Var.f401325b && this.f401326c == x0Var.f401326c;
    }

    public int hashCode() {
        return (((this.f401324a.hashCode() * 31) + java.lang.Integer.hashCode(this.f401325b)) * 31) + java.lang.Boolean.hashCode(this.f401326c);
    }

    public java.lang.String toString() {
        return "FTSRecommendItem(raw=" + this.f401324a + ", index=" + this.f401325b + ", isNewStyle=" + this.f401326c + ')';
    }
}
