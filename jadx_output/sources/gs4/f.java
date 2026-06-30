package gs4;

/* loaded from: classes9.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f275081a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f275082b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f275083c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f275084d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f275085e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f275086f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f275087g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f275088h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f275089i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.ArrayList f275090j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f275091k;

    public static gs4.f a(java.lang.String str) {
        gs4.f fVar = new gs4.f();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            fVar.f275081a = jSONObject.optInt("retcode");
            fVar.f275091k = jSONObject.optBoolean("disabled");
            fVar.f275082b = jSONObject.optString("entrance_name");
            fVar.f275083c = jSONObject.optBoolean("reddot");
            fVar.f275084d = jSONObject.optString("refund_lingqian_title");
            fVar.f275085e = jSONObject.optString("refund_lingqian_desc");
            fVar.f275086f = jSONObject.optString("refund_origin_title");
            fVar.f275087g = jSONObject.optString("refund_origin_desc");
            fVar.f275088h = jSONObject.optString("top_tip");
            fVar.f275089i = jSONObject.optString("refund_time_title");
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("refund_time");
            int length = optJSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                java.util.ArrayList arrayList = fVar.f275090j;
                org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i17);
                gs4.g gVar = new gs4.g();
                gVar.f275092a = jSONObject2.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                gVar.f275093b = jSONObject2.optString("desc");
                gVar.f275094c = jSONObject2.optString("iconurl");
                gVar.f275095d = jSONObject2.optString("iconmd5");
                arrayList.add(gVar);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetHbRefundConfig", "doGetHbRefundConfig() Exception:%s", e17.getMessage());
        }
        return fVar;
    }

    public java.lang.String b() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("retcode", this.f275081a);
            jSONObject.put("disabled", this.f275091k);
            jSONObject.put("entrance_name", this.f275082b);
            jSONObject.put("reddot", this.f275083c);
            jSONObject.put("refund_lingqian_title", this.f275084d);
            jSONObject.put("refund_lingqian_desc", this.f275085e);
            jSONObject.put("refund_origin_title", this.f275086f);
            jSONObject.put("refund_origin_desc", this.f275087g);
            jSONObject.put("top_tip", this.f275088h);
            jSONObject.put("refund_time_title", this.f275089i);
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            java.util.Iterator it = this.f275090j.iterator();
            while (it.hasNext()) {
                jSONArray.put(((gs4.g) it.next()).a());
            }
            jSONObject.put("refund_time", jSONArray);
            return jSONObject.toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetHbRefundConfig", "HbRefundConfig getJSONObjectString() Exception: %s", e17.getMessage());
            return "";
        }
    }

    public java.lang.String toString() {
        return "HbRefundConfig{retcode=" + this.f275081a + ", entrance_name='" + this.f275082b + "', reddot=" + this.f275083c + ", refund_lingqian_title='" + this.f275084d + "', refund_lingqian_desc='" + this.f275085e + "', refund_origin_title='" + this.f275086f + "', refund_origin_desc='" + this.f275087g + "', top_tip='" + this.f275088h + "', refund_time_title='" + this.f275089i + "', refund_time=" + this.f275090j + ", disabled=" + this.f275091k + '}';
    }
}
