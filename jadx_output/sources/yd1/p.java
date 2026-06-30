package yd1;

/* loaded from: classes7.dex */
public class p implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f461017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f461018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd1.t f461019c;

    public p(yd1.t tVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f461019c = tVar;
        this.f461017a = c0Var;
        this.f461018b = i17;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            jSONObject.put("errCode", i18);
            jSONObject.put("errMsg", this.f461019c.k() + ":" + str);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "getMediaTrack result, %s", jSONObject.toString());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", e17, e17.getMessage(), new java.lang.Object[0]);
        }
        this.f461017a.a(this.f461018b, jSONObject.toString());
    }
}
