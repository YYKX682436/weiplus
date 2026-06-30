package nd1;

/* loaded from: classes7.dex */
public class p1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 389;
    public static final java.lang.String NAME = "setTabBarBadge";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        try {
            int i18 = jSONObject.getInt(ya.b.INDEX);
            java.lang.String optString = jSONObject.optString("type", com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE);
            java.lang.String optString2 = jSONObject.optString("badgeValue", "");
            java.lang.String optString3 = jSONObject.optString("badgeColor", "");
            java.lang.String optString4 = jSONObject.optString("badgeTextColor", "");
            com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
            pBool.value = false;
            ck5.f fVar = new ck5.f(optString2);
            fVar.f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;
            fVar.f42561f = 0;
            fVar.f42560e = 4;
            fVar.f42556a = true;
            fVar.d(new nd1.n1(this, pBool));
            nd1.o1 o1Var = new nd1.o1(this, e9Var, i17, i18, optString, pBool.value ? "…" : optString2, optString3, optString4);
            if (e9Var.t3().Q1()) {
                e9Var.t3().I1(o1Var);
            } else {
                o1Var.run();
            }
        } catch (java.lang.Exception unused) {
            e9Var.a(i17, o("fail"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
