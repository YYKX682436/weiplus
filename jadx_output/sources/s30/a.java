package s30;

/* loaded from: classes15.dex */
public class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ExptReportService", "%d banner on init ", java.lang.Integer.valueOf(((g62.b) i95.n0.c(g62.b.class)).hashCode()));
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent = new com.tencent.mm.autogen.events.BannerToAddEvent();
        bannerToAddEvent.f53998g.f7500c = new com.tencent.mm.plugin.expt.ui.z(((com.tencent.mm.autogen.events.BannerOnInitEvent) iEvent).f53997g.f7384a);
        bannerToAddEvent.e();
        return false;
    }
}
