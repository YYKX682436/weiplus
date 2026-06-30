package rx4;

/* loaded from: classes8.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f401337a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401338b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401339c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401340d;

    public y0(org.json.JSONObject raw) {
        kotlin.jvm.internal.o.g(raw, "raw");
        this.f401337a = raw;
        this.f401338b = "";
        this.f401340d = "";
        java.lang.String optString = raw.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f401338b = optString;
        this.f401339c = raw.optInt("type", 0);
        java.lang.String optString2 = raw.optString("color", "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f401340d = optString2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.y0) && kotlin.jvm.internal.o.b(this.f401337a, ((rx4.y0) obj).f401337a);
    }

    public int hashCode() {
        return this.f401337a.hashCode();
    }

    public java.lang.String toString() {
        return "FTSTeachTag(raw=" + this.f401337a + ')';
    }
}
