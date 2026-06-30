package xf1;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: c, reason: collision with root package name */
    public static final xf1.n f454246c = new xf1.n(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f454247a;

    /* renamed from: b, reason: collision with root package name */
    public final long f454248b;

    public o(java.lang.String name, long j17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f454247a = name;
        this.f454248b = j17;
    }

    public org.json.JSONObject a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, this.f454247a);
            jSONObject.put("lastModified", this.f454248b);
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandResCacheChecker", "FileMetaData#toJson, fail since " + e17);
            return null;
        }
    }
}
