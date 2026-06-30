package gt;

/* loaded from: classes7.dex */
public class t3 extends com.tencent.mm.sdk.event.n {
    public t3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        am.q qVar;
        com.tencent.mm.autogen.events.AppActiveEvent appActiveEvent = (com.tencent.mm.autogen.events.AppActiveEvent) iEvent;
        if (gm0.j1.a() && appActiveEvent != null && (qVar = appActiveEvent.f53977g) != null) {
            if (qVar.f7684a) {
                if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
                    long a17 = c01.id.a();
                    if (a17 - com.tencent.mm.plugin.appbrand.backgroundfetch.h.f76836a < 900000) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "periodFetchDataWhenAppEnterForeground, too frequent");
                    } else {
                        com.tencent.mm.plugin.appbrand.backgroundfetch.h.f76836a = a17;
                        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.appbrand.utils.m(new com.tencent.mm.plugin.appbrand.backgroundfetch.b()));
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandBackgroundFetchDataHandler", "periodFetchDataWhenAppEnterForeground, not wifi network");
                }
            }
            if (!appActiveEvent.f53977g.f7684a) {
                com.tencent.mm.plugin.appbrand.appcache.f8.a(false, null);
                com.tencent.mm.plugin.appbrand.appusage.c1 z07 = com.tencent.mm.plugin.appbrand.appusage.c1.z0();
                z07.getClass();
                ik1.h0.a().postToWorker(new com.tencent.mm.plugin.appbrand.appusage.u0(z07));
                com.tencent.mm.plugin.appbrand.appcache.predownload.i.t();
                q81.z.i().j();
            }
        }
        return false;
    }
}
