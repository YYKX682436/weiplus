package gt;

/* loaded from: classes7.dex */
public class p5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.SaveLocationForAppBrandReportEvent f275294d;

    public p5(gt.q5 q5Var, com.tencent.mm.autogen.events.SaveLocationForAppBrandReportEvent saveLocationForAppBrandReportEvent) {
        this.f275294d = saveLocationForAppBrandReportEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.SaveLocationForAppBrandReportEvent saveLocationForAppBrandReportEvent = this.f275294d;
        am.ns nsVar = saveLocationForAppBrandReportEvent.f54724g;
        nsVar.f7451a = k91.k4.e(nsVar.f7452b);
        com.tencent.mm.plugin.appbrand.location.a.f85499a.a(saveLocationForAppBrandReportEvent);
        com.tencent.mm.plugin.appbrand.location.b.b(saveLocationForAppBrandReportEvent.f54724g.f7451a);
    }
}
