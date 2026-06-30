package gt;

/* loaded from: classes7.dex */
public class i4 extends com.tencent.mm.sdk.event.n {
    public i4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent appBrandVoipCheckIsDeviceUsingEvent = (com.tencent.mm.autogen.events.AppBrandVoipCheckIsDeviceUsingEvent) iEvent;
        if (gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAppBrand", "callback AppBrandVoipCheckIsDeviceUsingEvent true");
            if (i95.n0.h(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class)) {
                java.util.Iterator it = ((java.util.ArrayList) ((com.tencent.mm.plugin.appbrand.backgroundrunning.b1) ((com.tencent.mm.plugin.appbrand.backgroundrunning.x0) i95.n0.c(com.tencent.mm.plugin.appbrand.backgroundrunning.x0.class))).Bi()).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp appBrandBackgroundRunningApp = (com.tencent.mm.plugin.appbrand.backgroundrunning.AppBrandBackgroundRunningApp) it.next();
                    if (com.tencent.mm.plugin.appbrand.backgroundrunning.w.b(appBrandBackgroundRunningApp.f76923f, 16)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAppBrand", "checkVoIPDeviceOccupy, already exist wxa using VOIP 1v1, appId:%s", appBrandBackgroundRunningApp.f76921d);
                        appBrandVoipCheckIsDeviceUsingEvent.f53986g.f8497b = true;
                        if (com.tencent.mm.sdk.platformtools.o4.M("" + appBrandBackgroundRunningApp.f76921d + "_wxa_voip").getBoolean("isCameraStart", false)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAppBrand", "isCameraStart true");
                            appBrandVoipCheckIsDeviceUsingEvent.f53986g.f8496a = true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
