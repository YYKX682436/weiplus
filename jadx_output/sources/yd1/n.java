package yd1;

/* loaded from: classes7.dex */
public class n implements ta1.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f461014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f461015b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yd1.o f461016c;

    public n(yd1.o oVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f461016c = oVar;
        this.f461014a = c0Var;
        this.f461015b = i17;
    }

    @Override // ta1.t0
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
        try {
            jSONObject.put("errCode", i18);
            jSONObject.put("errMsg", this.f461016c.k() + ":" + str);
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecord.JsApiScreenRecorderOperateMediaContainer", "removeMediaContainer result, %s", jSONObject.toString());
        } catch (org.json.JSONException unused) {
        }
        this.f461014a.a(this.f461015b, jSONObject.toString());
    }
}
