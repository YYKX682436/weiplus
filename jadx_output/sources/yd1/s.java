package yd1;

/* loaded from: classes7.dex */
public class s implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f461026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f461027b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd1.t f461028c;

    public s(yd1.t tVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f461028c = tVar;
        this.f461026a = c0Var;
        this.f461027b = i17;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            jSONObject.put("errCode", i18);
            jSONObject.put("errMsg", this.f461028c.k() + ":" + str);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "removeMediaTrack result, %s", jSONObject.toString());
        } catch (org.json.JSONException unused) {
        }
        this.f461026a.a(this.f461027b, jSONObject.toString());
    }
}
