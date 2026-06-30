package rx4;

/* loaded from: classes8.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f401314a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f401315b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401316c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401317d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f401318e;

    /* renamed from: f, reason: collision with root package name */
    public final rx4.v0 f401319f;

    public w0(org.json.JSONObject raw, boolean z17) {
        int length;
        kotlin.jvm.internal.o.g(raw, "raw");
        this.f401314a = raw;
        this.f401315b = z17;
        this.f401317d = "";
        this.f401318e = new java.util.ArrayList();
        this.f401316c = raw.optInt("type", 0);
        java.lang.String optString = raw.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "");
        kotlin.jvm.internal.o.f(optString, "optString(...)");
        this.f401317d = optString;
        try {
            org.json.JSONArray optJSONArray = raw.optJSONArray("items");
            if (optJSONArray != null && optJSONArray.length() - 1 >= 0) {
                int i17 = 0;
                while (true) {
                    java.util.List list = this.f401318e;
                    org.json.JSONObject optJSONObject = optJSONArray.optJSONObject(i17);
                    kotlin.jvm.internal.o.f(optJSONObject, "optJSONObject(...)");
                    list.add(new rx4.x0(optJSONObject, i17, this.f401315b));
                    if (i17 == length) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
        } catch (org.json.JSONException unused) {
        }
        org.json.JSONObject optJSONObject2 = this.f401314a.optJSONObject("bannerInfo");
        if (optJSONObject2 != null) {
            org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("jumpInfo");
            int optInt = optJSONObject2.optInt("type", 0);
            java.lang.String optString2 = optJSONObject2.optString("iconUrl", "");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            java.lang.String optString3 = optJSONObject2.optString("subTitle", "");
            kotlin.jvm.internal.o.f(optString3, "optString(...)");
            int optInt2 = optJSONObject2.optInt("parentType", 64);
            java.lang.String optString4 = optJSONObject2.optString("mixerCommonContext", "");
            kotlin.jvm.internal.o.f(optString4, "optString(...)");
            int optInt3 = optJSONObject3 != null ? optJSONObject3.optInt("jumpType", 0) : 0;
            java.lang.String optString5 = optJSONObject3 != null ? optJSONObject3.optString("appId", "") : null;
            java.lang.String str = optString5 == null ? "" : optString5;
            java.lang.String optString6 = optJSONObject3 != null ? optJSONObject3.optString("weappUrl", "") : null;
            optString6 = optString6 == null ? "" : optString6;
            java.lang.String optString7 = optJSONObject3 != null ? optJSONObject3.optString("userName", "") : null;
            java.lang.String str2 = optString7 == null ? "" : optString7;
            java.lang.String optString8 = optJSONObject3 != null ? optJSONObject3.optString("action", "") : null;
            java.lang.String str3 = optString8 == null ? "" : optString8;
            java.lang.String optString9 = optJSONObject3 != null ? optJSONObject3.optString("ecsJumpInfoBase64", "") : null;
            this.f401319f = new rx4.v0(optInt, optString2, optString3, optInt2, optString4, optInt3, str, optString6, str2, str3, optString9 == null ? "" : optString9);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx4.w0)) {
            return false;
        }
        rx4.w0 w0Var = (rx4.w0) obj;
        return kotlin.jvm.internal.o.b(this.f401314a, w0Var.f401314a) && this.f401315b == w0Var.f401315b;
    }

    public int hashCode() {
        return (this.f401314a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f401315b);
    }

    public java.lang.String toString() {
        return "FTSRecommendBlock(raw=" + this.f401314a + ", isNewStyle=" + this.f401315b + ')';
    }
}
