package md1;

/* loaded from: classes7.dex */
public class q implements com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f325783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.s f325784b;

    public q(md1.s sVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var) {
        this.f325784b = sVar;
        this.f325783a = c0Var;
    }

    @Override // com.tencent.mm.plugin.cloudvoip.cloudvoice.service.b
    public void a(int i17, int i18, java.lang.String errMsg, java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "on event callback!");
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f325783a;
        md1.s sVar = this.f325784b;
        if (i17 == 0) {
            map.put("errCode", 0);
            md1.f1 f1Var = sVar.f325793p;
            f1Var.u(c0Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.onVoIPChatStateChangedJsEvent", "hy: event callback");
            f1Var.t(map);
            f1Var.m();
            return;
        }
        if (i17 == 1) {
            java.lang.String str = (java.lang.String) map.get("openId");
            if (str != null) {
                md1.z0 z0Var = sVar.f325795r;
                z0Var.u(c0Var);
                md1.y0 y0Var = md1.y0.f325821d;
                kotlin.jvm.internal.o.g(errMsg, "errMsg");
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.onOperateVoIPViewErrorJsEvent", "dispatch onOperateVoIPViewError type:" + y0Var + " openId:" + str + " errCode:" + i18 + " errMsg:" + errMsg);
                java.util.HashMap hashMap = new java.util.HashMap(4);
                hashMap.put("type", "record");
                hashMap.put("errMsg", errMsg);
                hashMap.put("errCode", java.lang.Integer.valueOf(i18));
                hashMap.put("openId", str);
                z0Var.t(hashMap);
                z0Var.m();
                return;
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "unknown event type:%s", java.lang.Integer.valueOf(i17));
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "uncaught event type:%s errCode:%s ,errMsg:%s, data:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg, map);
    }
}
