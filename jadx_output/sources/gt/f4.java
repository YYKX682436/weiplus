package gt;

/* loaded from: classes7.dex */
public class f4 extends com.tencent.mm.sdk.event.n {
    public f4() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.AppBrandSetServiceUnreadCountEvent appBrandSetServiceUnreadCountEvent = (com.tencent.mm.autogen.events.AppBrandSetServiceUnreadCountEvent) iEvent;
        if (gm0.j1.a() && !com.tencent.mm.sdk.platformtools.t8.K0(appBrandSetServiceUnreadCountEvent.f53985g.f8412a)) {
            java.lang.String str = appBrandSetServiceUnreadCountEvent.f53985g.f8412a;
            com.tencent.mm.plugin.appbrand.app.r9.Ui().P2(str + "_unreadCount", "0");
            com.tencent.mm.plugin.appbrand.ipc.m0.a(k91.k4.e(str), 0);
        }
        return false;
    }
}
