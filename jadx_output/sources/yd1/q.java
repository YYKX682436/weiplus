package yd1;

/* loaded from: classes7.dex */
public class q implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f461020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f461021b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd1.t f461022c;

    public q(yd1.t tVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f461022c = tVar;
        this.f461020a = c0Var;
        this.f461021b = i17;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            jSONObject.put("errCode", i18);
            jSONObject.put("errMsg", this.f461022c.k() + ":" + str);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaTrack", "createMediaTrack result, %s", jSONObject.toString());
        } catch (org.json.JSONException unused) {
        }
        this.f461020a.a(this.f461021b, jSONObject.toString());
    }
}
