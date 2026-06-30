package l81;

/* loaded from: classes2.dex */
public class d1 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public float f317052d;

    /* renamed from: e, reason: collision with root package name */
    public float f317053e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f317054f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f317055g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f317056h;

    /* renamed from: i, reason: collision with root package name */
    public long f317057i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f317058m;

    @Override // l81.p0
    public java.lang.String a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("latitude", this.f317052d);
            jSONObject.put("longitude", this.f317053e);
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f317054f);
            jSONObject.put("clickTime", this.f317057i);
            jSONObject.put("cityName", this.f317056h);
            jSONObject.put("cityCode", this.f317055g);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f317058m)) {
                jSONObject.put("poiId", this.f317058m);
            }
            return new org.json.JSONObject().put(ya.b.LOCATION, jSONObject).toString();
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeAppOpenPoiNativeExtraData", e17, "", new java.lang.Object[0]);
            return "{}";
        }
    }
}
