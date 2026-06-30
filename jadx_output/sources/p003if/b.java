package p003if;

/* loaded from: classes7.dex */
public final class b extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "getSkylineInfo";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        java.util.HashMap a17 = p003if.a.f291007a.a(yVar);
        com.tencent.mars.xlog.Log.i("JsApiGetSkylineInfo", "getSkylineInfo: " + a17);
        if (yVar != null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            a17.put("errno", 0);
            yVar.a(i17, t("ok", a17));
        }
    }
}
