package gt;

/* loaded from: classes7.dex */
public class d5 extends com.tencent.mm.sdk.event.n {
    public d5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent = (com.tencent.mm.autogen.events.LogoutEvent) iEvent;
        if (!gm0.j1.a()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAppBrand", "logoutListener.callback(event.data.reason=%d)", java.lang.Integer.valueOf(logoutEvent.f54484g.f6836a));
        int i17 = logoutEvent.f54484g.f6836a;
        if (i17 == 1 || i17 == 3) {
            com.tencent.mm.plugin.appbrand.task.u0.C().q(com.tencent.luggage.sdk.processes.c.f47631e);
        } else {
            com.tencent.mm.plugin.appbrand.task.u0.C().q(com.tencent.luggage.sdk.processes.c.f47633g);
        }
        com.tencent.mm.plugin.appbrand.app.g2.f75089d.Ni("WxLogout");
        return true;
    }
}
