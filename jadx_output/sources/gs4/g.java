package gs4;

/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f275092a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f275093b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f275094c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f275095d;

    public g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f275092a = str;
        this.f275093b = str2;
        this.f275094c = str3;
        this.f275095d = str4;
    }

    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, this.f275092a);
            jSONObject.put("desc", this.f275093b);
            jSONObject.put("iconurl", this.f275094c);
            jSONObject.put("iconmd5", this.f275095d);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetHbRefundConfig", "HbRefundTimeParcelable getJSONObjectString() Exception: %s", e17.getMessage());
        }
        return jSONObject;
    }

    public java.lang.String toString() {
        return "HbRefundTimeParcelable{title='" + this.f275092a + "', desc='" + this.f275093b + "', iconurl='" + this.f275094c + "', iconmd5='" + this.f275095d + "'}";
    }
}
