package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class j implements r01.z2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.ui.k f180351a;

    public j(com.tencent.mm.plugin.wallet_core.ui.k kVar) {
        this.f180351a = kVar;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0073 -> B:12:0x0081). Please report as a decompilation issue!!! */
    @Override // r01.z2
    public void a(int i17, int i18, java.lang.String str, r01.y2 y2Var) {
        org.json.JSONObject jSONObject;
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "onSceneEnd errType = " + i17 + ", errCode = " + i18 + ",errMsg = " + str);
        if (i17 != 0 || i18 != 0) {
            y2Var.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "scene.getType() = %s", 1769);
            return;
        }
        r45.nm3 nm3Var = ((r01.k3) y2Var).f368133f;
        if (nm3Var == null) {
            nm3Var = new r45.nm3();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "resp : %s", nm3Var.f381495d);
        rv.t2 Ai = ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Ai(this.f180351a.f180365e.d1());
        try {
            jSONObject = com.tencent.mm.sdk.platformtools.t8.K0(((qk.o) Ai).field_extInfo) ? new org.json.JSONObject() : new org.json.JSONObject(((qk.o) Ai).field_extInfo);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "create Json object from extInfo error. %s.", e17);
            jSONObject = new org.json.JSONObject();
        }
        try {
            jSONObject.put("MMBizMenu", nm3Var.f381495d);
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "updateExtInfoAttrs MMBizMenu failed：value(%s), exception : %s.", nm3Var.f381495d, e18);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(nm3Var.f381495d)) {
            gm0.j1.i();
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WX_PAY_REVEIVE_PLUGIN_MENU_STRING_SYNC, nm3Var.f381495d);
        }
        ((qk.o) Ai).field_extInfo = jSONObject.toString();
        ((qv.q) ((rv.v2) i95.n0.c(rv.v2.class))).Di(Ai);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "Update bizInfo attributes successfully.");
    }
}
