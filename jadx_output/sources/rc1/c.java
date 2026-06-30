package rc1;

/* loaded from: classes7.dex */
public final class c extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1351;
    private static final java.lang.String NAME = "updateCapsuleIcon";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (jSONObject == null || c0Var == null) {
            return;
        }
        c0Var.V0().g4(jSONObject.optString("sessionBuffer"));
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("key_appid", c0Var.t3().f74803n);
        lVarArr[1] = new jz5.l("key_type", mi1.a.KOUBEI);
        lVarArr[2] = new jz5.l("key_img_url", jSONObject.optString("iconUrl"));
        lVarArr[3] = new jz5.l("key_img_url_dark", jSONObject.optString("darkModeIconUrl"));
        com.tencent.mm.plugin.appbrand.page.n7 N2 = c0Var.t3().N2();
        lVarArr[4] = new jz5.l("key_page_path", N2 != null ? N2.X1() : null);
        lVarArr[5] = new jz5.l("key_session_buffer", jSONObject.optString("sessionBuffer"));
        lVarArr[6] = new jz5.l("key_show_duration", 4000L);
        lVarArr[7] = new jz5.l("key_allow_animation", java.lang.Boolean.TRUE);
        java.util.Map k17 = kz5.c1.k(lVarArr);
        mi1.f a17 = mi1.c.a(c0Var.t3());
        if (a17 != null) {
            a17.k(k17, mi1.e.TAIL, "");
        }
    }
}
