package rx4;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f401123a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401124b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401125c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f401126d;

    /* renamed from: e, reason: collision with root package name */
    public final rx4.c f401127e;

    public d(org.json.JSONObject raw) {
        kotlin.jvm.internal.o.g(raw, "raw");
        this.f401123a = raw;
        this.f401124b = "";
        this.f401126d = new java.util.ArrayList();
        java.lang.String optString = raw.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f401124b = optString;
        raw.optInt("type", 1);
        this.f401125c = raw.optInt("parenttype", com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC);
        kotlin.jvm.internal.o.f(raw.optString("docInfo", ""), "optString(...)");
        try {
            org.json.JSONObject optJSONObject = raw.optJSONObject("moreInfo");
            if (optJSONObject != null) {
                this.f401127e = new rx4.c(optJSONObject);
            }
        } catch (org.json.JSONException unused) {
        }
        try {
            org.json.JSONArray optJSONArray = this.f401123a.optJSONArray("list");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    java.util.List list = this.f401126d;
                    org.json.JSONObject optJSONObject2 = optJSONArray.optJSONObject(i17);
                    kotlin.jvm.internal.o.f(optJSONObject2, "optJSONObject(...)");
                    list.add(new rx4.b(optJSONObject2));
                }
            }
        } catch (org.json.JSONException unused2) {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.d) && kotlin.jvm.internal.o.b(this.f401123a, ((rx4.d) obj).f401123a);
    }

    public int hashCode() {
        return this.f401123a.hashCode();
    }

    public java.lang.String toString() {
        return "FTSDramaTab(raw=" + this.f401123a + ')';
    }
}
