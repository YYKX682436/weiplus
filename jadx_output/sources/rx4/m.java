package rx4;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f401228a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401229b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f401230c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401231d;

    /* renamed from: e, reason: collision with root package name */
    public final int f401232e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f401233f;

    public m(org.json.JSONObject raw) {
        kotlin.jvm.internal.o.g(raw, "raw");
        this.f401228a = raw;
        java.lang.String str = "";
        this.f401229b = "";
        this.f401230c = "";
        this.f401231d = "";
        this.f401232e = -1;
        this.f401233f = "";
        java.lang.String optString = raw.optString("hotword", "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f401229b = optString;
        java.lang.String optString2 = raw.optString(dm.i4.COL_ID, "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f401230c = optString2;
        java.lang.String optString3 = raw.optString("mixerCommonContext", "");
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        this.f401231d = optString3;
        this.f401232e = raw.optInt("isOpenSearchWebView", -1);
        try {
            java.lang.String optString4 = raw.optJSONArray("tags").optJSONObject(0).optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
            kotlin.jvm.internal.o.d(optString4);
            str = optString4;
        } catch (java.lang.Exception unused) {
        }
        this.f401233f = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.m) && kotlin.jvm.internal.o.b(this.f401228a, ((rx4.m) obj).f401228a);
    }

    public int hashCode() {
        return this.f401228a.hashCode();
    }

    public java.lang.String toString() {
        return "FTSHotspotItem(raw=" + this.f401228a + ')';
    }
}
