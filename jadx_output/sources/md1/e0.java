package md1;

/* loaded from: classes7.dex */
public class e0 extends md1.q0 {
    public static final int CTRL_INDEX = 877;
    public static final java.lang.String NAME = "hasJoinVoIPChat";

    @Override // md1.q0
    public void F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", NAME);
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.D0(new md1.d0(this, c0Var, i17));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiHasJoinVoIPChat", "IFloatBallService is null");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("join", java.lang.Boolean.FALSE);
        c0Var.a(i17, p("ok", hashMap));
    }
}
