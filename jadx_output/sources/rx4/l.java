package rx4;

/* loaded from: classes8.dex */
public final class l {

    /* renamed from: g, reason: collision with root package name */
    public static final rx4.k f401218g = new rx4.k(null);

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f401219a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401220b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401221c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f401222d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f401223e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f401224f;

    public l(org.json.JSONObject raw) {
        kotlin.jvm.internal.o.g(raw, "raw");
        this.f401219a = raw;
        this.f401220b = "";
        this.f401222d = new java.util.ArrayList();
        this.f401223e = "";
        this.f401224f = "";
        java.lang.String optString = raw.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f401220b = optString;
        this.f401221c = raw.optInt("parenttype", 68);
        java.lang.String optString2 = raw.optString("bgImage", "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f401223e = optString2;
        java.lang.String optString3 = raw.optString("bgImageDark", "");
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        this.f401224f = optString3;
        try {
            org.json.JSONArray optJSONArray = raw.optJSONArray("items");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.util.List list = this.f401222d;
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    kotlin.jvm.internal.o.f(optJSONObject, "optJSONObject(...)");
                    list.add(new rx4.m(optJSONObject));
                }
            }
        } catch (org.json.JSONException unused) {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.l) && kotlin.jvm.internal.o.b(this.f401219a, ((rx4.l) obj).f401219a);
    }

    public int hashCode() {
        return this.f401219a.hashCode();
    }

    public java.lang.String toString() {
        return "FTSHotspotBlock(raw=" + this.f401219a + ')';
    }
}
