package mg4;

/* loaded from: classes.dex */
public final class d extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 644;
    public static final java.lang.String NAME = "preloadMiniProgramEnv";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l component, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("MicroMsg.SurfaceApp.JsApiPreloadMiniProgramEnv", "preloadEnv");
        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.f88833x);
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String format = objArr.length > 0 ? java.lang.String.format("ok", objArr) : "ok";
        hashMap.putAll(new java.util.HashMap());
        java.lang.String p17 = p(format, hashMap);
        kotlin.jvm.internal.o.f(p17, "makeReturnJson(...)");
        return p17;
    }
}
