package la0;

/* loaded from: classes15.dex */
public class b0 extends com.tencent.mm.sdk.event.n {
    public b0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BannerOnInitEvent bannerOnInitEvent = (com.tencent.mm.autogen.events.BannerOnInitEvent) iEvent;
        if (!gm0.j1.a()) {
            return false;
        }
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent = new com.tencent.mm.autogen.events.BannerToAddEvent();
        bannerToAddEvent.f53998g.f7500c = new com.tencent.mm.plugin.music.ui.j(bannerOnInitEvent.f53997g.f7384a);
        bannerToAddEvent.e();
        return false;
    }
}
