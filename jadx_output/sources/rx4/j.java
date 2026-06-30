package rx4;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f401199a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401200b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f401201c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401202d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f401203e;

    /* renamed from: f, reason: collision with root package name */
    public final int f401204f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f401205g;

    public j(org.json.JSONObject raw, java.lang.String searchId) {
        kotlin.jvm.internal.o.g(raw, "raw");
        kotlin.jvm.internal.o.g(searchId, "searchId");
        this.f401199a = raw;
        this.f401200b = searchId;
        java.lang.String str = "";
        this.f401201c = "";
        this.f401202d = "";
        this.f401203e = "";
        try {
            java.lang.String optString = raw.optString("word", "");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            this.f401201c = optString;
            java.lang.String optString2 = raw.optString("mixerCommonContext", "");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            this.f401202d = optString2;
            org.json.JSONObject optJSONObject = raw.optJSONObject("tag");
            java.lang.String optString3 = optJSONObject != null ? optJSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "") : null;
            if (optString3 != null) {
                str = optString3;
            }
            this.f401203e = str;
            int optInt = optJSONObject != null ? optJSONObject.optInt("type", 0) : 0;
            this.f401204f = optInt;
            if (optInt == 6 || optInt == 11) {
                this.f401205g = true;
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("FTSNativeTeachHistoryBoxUIC", "FTSHistoryLiveItem, init error: " + e17);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.j)) {
            return false;
        }
        rx4.j jVar = (rx4.j) obj;
        return kotlin.jvm.internal.o.b(this.f401199a, jVar.f401199a) && kotlin.jvm.internal.o.b(this.f401200b, jVar.f401200b);
    }

    public int hashCode() {
        return (this.f401199a.hashCode() * 31) + this.f401200b.hashCode();
    }

    public java.lang.String toString() {
        return "FTSHistoryLiveItem(raw=" + this.f401199a + ", searchId=" + this.f401200b + ')';
    }
}
