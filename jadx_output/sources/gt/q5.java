package gt;

/* loaded from: classes7.dex */
public class q5 extends com.tencent.mm.sdk.event.n {
    public q5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.SaveLocationForAppBrandReportEvent saveLocationForAppBrandReportEvent = (com.tencent.mm.autogen.events.SaveLocationForAppBrandReportEvent) iEvent;
        am.ns nsVar = saveLocationForAppBrandReportEvent.f54724g;
        com.tencent.mars.xlog.Log.i("MicroMsg.StaticOnSaveLocationForAppBrandReportEvent", "event.data.appId:%s, event.data.username:%s", nsVar.f7451a, nsVar.f7452b);
        am.ns nsVar2 = saveLocationForAppBrandReportEvent.f54724g;
        if (com.tencent.mm.sdk.platformtools.t8.K0(nsVar2.f7451a) && !com.tencent.mm.sdk.platformtools.t8.K0(nsVar2.f7452b)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StaticOnSaveLocationForAppBrandReportEvent", "getAppIdByUsername get appId again");
            nsVar2.f7451a = k91.k4.e(nsVar2.f7452b);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(nsVar2.f7451a)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StaticOnSaveLocationForAppBrandReportEvent", "appId is null, delay to report location");
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(new gt.p5(this, saveLocationForAppBrandReportEvent), 5000L);
            return true;
        }
        com.tencent.mm.plugin.appbrand.location.a.f85499a.a(saveLocationForAppBrandReportEvent);
        com.tencent.mm.plugin.appbrand.location.b.b(nsVar2.f7451a);
        return true;
    }
}
