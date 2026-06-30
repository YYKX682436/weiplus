package md1;

/* loaded from: classes7.dex */
public class n0 extends md1.s {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "join1v1VoIPChat";

    public n0() {
        si1.e.a(NAME);
    }

    @Override // md1.s, md1.q0
    public void F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null) {
            c0Var.a(i17, o("fail:data is null or nil"));
            return;
        }
        fb1.c ec6 = fb1.e.f260836e.ec(fb1.d.f260832g, false, new md1.f0(this, c0Var));
        if (ec6 instanceof fb1.a) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "can not join voip chat now, message:%s", ((fb1.a) ec6).f260827a);
            java.util.HashMap hashMap = new java.util.HashMap();
            C(hashMap, D(-10086, -7));
            c0Var.a(i17, p(java.lang.String.format("fail: %d, %d, can not join voip chat now", -10086, -7), hashMap));
            return;
        }
        this.f325799v = c0Var.getAppId();
        I(c0Var);
        fw1.b G = G(c0Var, jSONObject);
        if (G == null) {
            c0Var.a(i17, o("fail: param error!"));
            this.f325802y = false;
            return;
        }
        G.f267049c = "wx766655dab8fe851b";
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: appId:" + this.f325799v + ", data:" + jSONObject.toString());
        this.f325801x = 0;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f325800w = android.os.SystemClock.elapsedRealtime();
        md1.j1 b17 = md1.j1.b();
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f325785g;
        int i18 = this.f325786h;
        b17.f325751a = v5Var;
        b17.f325752b = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceCapsuleBarBlinkManager", "init, roomType:%d", java.lang.Integer.valueOf(i18));
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        md1.g0 g0Var = new md1.g0(this, G, c0Var, i17);
        md1.h0 h0Var = new md1.h0(this, c0Var, G);
        md1.i0 i0Var = new md1.i0(this, c0Var);
        md1.j0 j0Var = new md1.j0(this, c0Var);
        md1.k0 k0Var = new md1.k0(this, c0Var);
        md1.l0 l0Var = new md1.l0(this, c0Var);
        md1.m0 m0Var = new md1.m0(this, c0Var);
        p0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "jd: trigger join room. %s, %s, %d, %d, %d", G.f267048b, G.f267049c, java.lang.Long.valueOf(G.f267061o), java.lang.Integer.valueOf(G.f267047a), java.lang.Integer.valueOf(G.f267054h));
        p0Var.n(new com.tencent.mm.plugin.cloudvoip.cloudvoice.service.c2(p0Var, G, g0Var, h0Var, i0Var, j0Var, k0Var, l0Var, m0Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: JsApiJoin1v1VoIPChat callbackId:" + i17);
    }
}
