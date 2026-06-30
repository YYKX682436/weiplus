package r01;

/* loaded from: classes9.dex */
public class b implements r01.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f368024a;

    public b(r01.d dVar, java.lang.String str) {
        this.f368024a = str;
    }

    @Override // r01.z2
    public void a(int i17, int i18, java.lang.String str, r01.y2 y2Var) {
        org.json.JSONObject jSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "onSceneEnd errType = " + i17 + ", errCode = " + i18 + ",errMsg = " + str);
        if (i17 != 0 || i18 != 0) {
            y2Var.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.BizAttrRenovator", "scene.getType() = %s", 1769);
            return;
        }
        r45.nm3 nm3Var = ((r01.k3) y2Var).f368133f;
        if (nm3Var == null) {
            nm3Var = new r45.nm3();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "resp : %s", nm3Var.f381495d);
        qk.o b17 = r01.q3.cj().b1(this.f368024a);
        try {
            jSONObject = com.tencent.mm.sdk.platformtools.t8.K0(b17.field_extInfo) ? new org.json.JSONObject() : new org.json.JSONObject(b17.field_extInfo);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizAttrRenovator", "create Json object from extInfo error. %s.", e17);
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("MMBizMenu", nm3Var.f381495d);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizAttrRenovator", "updateExtInfoAttrs MMBizMenu failed：value(%s), exception : %s.", nm3Var.f381495d, e18);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(nm3Var.f381495d)) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WX_PAY_REVEIVE_PLUGIN_MENU_STRING_SYNC, nm3Var.f381495d);
        }
        b17.field_extInfo = jSONObject.toString();
        r01.q3.cj().replace(b17);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizAttrRenovator", "Update bizInfo attributes successfully.");
    }
}
