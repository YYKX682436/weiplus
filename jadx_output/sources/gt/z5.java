package gt;

/* loaded from: classes9.dex */
public class z5 extends com.tencent.mm.sdk.event.n {
    public z5() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent updateAppBrandNotifyMessageEvent = (com.tencent.mm.autogen.events.UpdateAppBrandNotifyMessageEvent) iEvent;
        if (!gm0.j1.a()) {
            return false;
        }
        boolean booleanValue = java.lang.Boolean.valueOf(com.tencent.mm.plugin.appbrand.app.r9.Ui().z0(k91.o1.a(updateAppBrandNotifyMessageEvent.f54912g.f7853a), "true")).booleanValue();
        am.rz rzVar = updateAppBrandNotifyMessageEvent.f54912g;
        if (booleanValue == rzVar.f7854b) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreAppBrand", "update with same value, appId:%s", rzVar.f7853a);
        } else {
            com.tencent.mm.plugin.appbrand.app.r9.Ui().P2(k91.o1.a(rzVar.f7853a), java.lang.Boolean.toString(rzVar.f7854b));
            com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent appBrandNotifyMessageStatusChangedEvent = new com.tencent.mm.autogen.events.AppBrandNotifyMessageStatusChangedEvent();
            java.lang.String str = rzVar.f7853a;
            am.v vVar = appBrandNotifyMessageStatusChangedEvent.f53982g;
            vVar.f8149a = str;
            vVar.f8150b = rzVar.f7854b;
            appBrandNotifyMessageStatusChangedEvent.e();
        }
        return true;
    }
}
