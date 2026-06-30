package rx4;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f401109a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401110b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401111c;

    /* renamed from: d, reason: collision with root package name */
    public final int f401112d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f401113e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f401114f;

    public c(org.json.JSONObject raw) {
        kotlin.jvm.internal.o.g(raw, "raw");
        this.f401109a = raw;
        this.f401110b = "";
        this.f401113e = "";
        this.f401114f = "";
        java.lang.String optString = raw.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f401110b = optString;
        this.f401111c = raw.optInt("type", 0);
        try {
            org.json.JSONObject optJSONObject = raw.optJSONObject("jumpInfo");
            if (optJSONObject != null) {
                this.f401112d = optJSONObject.optInt("jumpType", 0);
                java.lang.String optString2 = optJSONObject.optString("appId", "");
                kotlin.jvm.internal.o.f(optString2, "optString(...)");
                this.f401113e = optString2;
                java.lang.String optString3 = optJSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
                kotlin.jvm.internal.o.f(optString3, "optString(...)");
                this.f401114f = optString3;
            }
        } catch (org.json.JSONException unused) {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.c) && kotlin.jvm.internal.o.b(this.f401109a, ((rx4.c) obj).f401109a);
    }

    public int hashCode() {
        return this.f401109a.hashCode();
    }

    public java.lang.String toString() {
        return "FTSDramaMoreInfo(raw=" + this.f401109a + ')';
    }
}
