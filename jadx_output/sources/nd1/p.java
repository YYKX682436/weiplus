package nd1;

/* loaded from: classes7.dex */
public class p extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 15;
    public static final java.lang.String NAME = "navigateBack";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        yVar.m(new nd1.o(this, yVar, jSONObject, jSONObject.optInt("skipIntermediate", 0) == 1, i17, jSONObject.optJSONObject("singlePageData"), jSONObject.optString("routeId")));
    }
}
