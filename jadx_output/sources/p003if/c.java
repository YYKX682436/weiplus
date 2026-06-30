package p003if;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "getSkylineInfoSync";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.util.HashMap a17 = p003if.a.f291007a.a((com.tencent.mm.plugin.appbrand.y) lVar);
        com.tencent.mars.xlog.Log.i("JsApiGetSkylineInfoSync", "getSkylineInfoSync: " + a17);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        a17.put("errno", 0);
        java.lang.String t17 = t("ok", a17);
        kotlin.jvm.internal.o.f(t17, "makeReturnJson(...)");
        return t17;
    }
}
