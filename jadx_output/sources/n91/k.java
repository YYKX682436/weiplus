package n91;

@mk0.a
/* loaded from: classes7.dex */
public class k implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingEnterFullscreenIPCData customLoadingEnterFullscreenIPCData = (com.tencent.mm.plugin.appbrand.custom_loading.CustomLoadingEnterFullscreenIPCData) obj;
        n91.t.a(customLoadingEnterFullscreenIPCData.f77551d);
        com.tencent.mm.plugin.appbrand.task.a1 a1Var = new com.tencent.mm.plugin.appbrand.task.a1(customLoadingEnterFullscreenIPCData.f77551d, customLoadingEnterFullscreenIPCData.f77552e, null);
        com.tencent.mm.plugin.appbrand.task.u0 C = com.tencent.mm.plugin.appbrand.task.u0.C();
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC = customLoadingEnterFullscreenIPCData.f77551d;
        com.tencent.mm.plugin.appbrand.task.o oVar = (com.tencent.mm.plugin.appbrand.task.o) C.c(appBrandInitConfigWC.f77278d, appBrandInitConfigWC.f77281g);
        if (oVar != null) {
            oVar.f89106j = true;
            oVar.f47688e = false;
        } else {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        com.tencent.mm.plugin.appbrand.task.u0 C2 = com.tencent.mm.plugin.appbrand.task.u0.C();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.luggage.sdk.processes.r.y(C2, context, a1Var, null, null, 12, null);
        rVar.a(com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d);
    }
}
