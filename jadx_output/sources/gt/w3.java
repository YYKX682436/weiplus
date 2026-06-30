package gt;

/* loaded from: classes9.dex */
public class w3 extends com.tencent.mm.sdk.event.n {
    public w3() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AppBrandGetServiceUnreadCountEvent appBrandGetServiceUnreadCountEvent = (com.tencent.mm.autogen.events.AppBrandGetServiceUnreadCountEvent) iEvent;
        if (gm0.j1.a() && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandGetServiceUnreadCountEvent.f53978g.f7755a)) {
            java.lang.String str = appBrandGetServiceUnreadCountEvent.f53978g.f7755a;
            appBrandGetServiceUnreadCountEvent.f53979h.f7855a = com.tencent.mm.sdk.platformtools.t8.P(com.tencent.mm.plugin.appbrand.app.r9.Ui().z0(str + "_unreadCount", "0"), 0);
        }
        return false;
    }
}
