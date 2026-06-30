package nd1;

/* loaded from: classes7.dex */
public class t1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 418;
    public static final java.lang.String NAME = "setTabBarItem";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        try {
            int i18 = jSONObject.getInt(ya.b.INDEX);
            nd1.s1 s1Var = new nd1.s1(this, e9Var, i17, jSONObject.optString("iconPath", ""), i18, jSONObject.optString(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, null), jSONObject.optString("selectedIconPath", ""));
            if (e9Var.getRuntime().Q1()) {
                e9Var.getRuntime().I1(s1Var);
            } else {
                s1Var.run();
            }
        } catch (java.lang.Exception unused) {
            e9Var.a(i17, o("fail:invalid data"));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
