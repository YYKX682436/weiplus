package md1;

/* loaded from: classes7.dex */
public class c extends md1.q0 {
    public static final int CTRL_INDEX = 517;
    public static final java.lang.String NAME = "exitVoIPChat";

    public c() {
        si1.e.a(NAME);
    }

    @Override // md1.q0
    public void F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceExitVoIPChat", "hy: invoke JsApiCloudVoiceExitVoIPChat");
        md1.j1.b().c();
        java.lang.String appId = c0Var.getAppId();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE.j(new md1.b(this, elapsedRealtime, appId, c0Var, i17), dz.k.ReasonManual);
    }
}
