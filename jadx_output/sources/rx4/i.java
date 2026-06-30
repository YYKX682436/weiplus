package rx4;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f401185a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401186b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f401187c;

    /* renamed from: d, reason: collision with root package name */
    public final int f401188d;

    /* renamed from: e, reason: collision with root package name */
    public final int f401189e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f401190f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f401191g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f401192h;

    /* renamed from: i, reason: collision with root package name */
    public int f401193i;

    public i(org.json.JSONObject raw) {
        kotlin.jvm.internal.o.g(raw, "raw");
        this.f401185a = raw;
        this.f401186b = "";
        this.f401187c = "";
        this.f401190f = "";
        this.f401192h = "";
        java.lang.String optString = raw.optString("hotword", "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f401186b = optString;
        java.lang.String optString2 = raw.optString("mixerCommonContext", "");
        kotlin.jvm.internal.o.f(optString2, "optString(...)");
        this.f401187c = optString2;
        this.f401188d = raw.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        this.f401189e = raw.optInt("businesstype", 0);
        java.lang.String optString3 = raw.optString("searchId", raw.optString("searchID", ""));
        kotlin.jvm.internal.o.f(optString3, "optString(...)");
        this.f401190f = optString3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[hitest] FTSHistoryItem init, hotwordLen=");
        sb6.append(optString.length());
        sb6.append(", hasSearchId=");
        sb6.append(this.f401190f.length() > 0);
        com.tencent.mars.xlog.Log.i("FTSNativeTeachHistoryBoxUIC", sb6.toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rx4.i) && kotlin.jvm.internal.o.b(this.f401185a, ((rx4.i) obj).f401185a);
    }

    public int hashCode() {
        return this.f401185a.hashCode();
    }

    public java.lang.String toString() {
        return "FTSHistoryItem(raw=" + this.f401185a + ')';
    }
}
