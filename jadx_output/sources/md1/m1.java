package md1;

/* loaded from: classes7.dex */
public abstract class m1 {
    public static void a(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "closeFloatBall, appId is empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:closeFloatBall, appId:%s", str);
        com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent = new com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent();
        xf1.a aVar = appBrandBackgroundRunningOperationEvent.f83923g;
        aVar.f454222a = str;
        aVar.f454223b = 16;
        aVar.f454224c = 2;
        appBrandBackgroundRunningOperationEvent.e();
    }

    public static boolean b() {
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:handUpVoIPTalking, is1v1:%s", java.lang.Boolean.valueOf(p0Var.U));
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        if (!p0Var.T) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:handUpVoIPTalking, voip is stopped");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:handUpVoIPTalking, stop voip talking");
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        p0Var.j(new md1.l1(), dz.k.ReasonWeappStopFromPassiveFloatBall);
        return true;
    }

    public static void c(java.lang.String str) {
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0 p0Var = com.tencent.mm.plugin.cloudvoip.cloudvoice.service.p0.INSTANCE;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoice.VoIpLogicHandler", "hy:showFloatBall, appId:%s, is1v1:%s", str, java.lang.Boolean.valueOf(p0Var.U));
        ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).getClass();
        if (p0Var.T || ((cz.e) ((dz.i) i95.n0.c(dz.i.class))).wi()) {
            com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent = new com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent();
            xf1.a aVar = appBrandBackgroundRunningOperationEvent.f83923g;
            aVar.f454222a = str;
            aVar.f454223b = 16;
            aVar.f454224c = 1;
            appBrandBackgroundRunningOperationEvent.e();
        }
    }
}
