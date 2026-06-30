package nd1;

/* loaded from: classes7.dex */
public class d extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static int CTRL_INDEX = 71;
    public static java.lang.String NAME = "getCurrentRoute";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.tencent.map.geolocation.sapp.internal.TencentExtraKeys.LOCATION_KEY_ROUTE, ((com.tencent.mm.plugin.appbrand.page.v5) lVar).X1());
        return p("ok", hashMap);
    }
}
