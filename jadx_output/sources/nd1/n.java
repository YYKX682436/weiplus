package nd1;

/* loaded from: classes7.dex */
public class n extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "initReady";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public java.lang.String z(com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject) {
        java.lang.String appId = yVar.getAppId();
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = yVar.t3();
        nd1.m mVar = new nd1.m(this, yVar, jSONObject, appId);
        com.tencent.mm.plugin.appbrand.ff ffVar = t37.f74799h;
        android.os.Handler handler = ffVar.f78054b;
        if (handler != null) {
            handler.postAtFrontOfQueue(mVar);
        } else {
            ffVar.f78053a.postAtFrontOfQueue(mVar);
        }
        return o("ok");
    }
}
