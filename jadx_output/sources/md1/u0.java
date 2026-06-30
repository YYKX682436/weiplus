package md1;

/* loaded from: classes7.dex */
public class u0 extends md1.q0 {
    public static final int CTRL_INDEX = 780;
    public static final java.lang.String NAME = "subscribeVoIPMembers";

    public u0() {
        si1.e.a(NAME);
    }

    @Override // md1.q0
    public void F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            c0Var.a(i17, o("fail:data is null or nil"));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiSubscribeVoIPMembers", "hy: appId:" + c0Var.getAppId() + ", parmas:" + jSONObject.toString());
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        md1.t0 t0Var = new md1.t0(this, c0Var, i17);
        p0Var.getClass();
        p0Var.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.k1(p0Var, t0Var, jSONObject));
    }
}
