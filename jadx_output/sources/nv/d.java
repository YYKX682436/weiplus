package nv;

/* loaded from: classes15.dex */
public class d extends com.tencent.mm.sdk.event.n {
    public d() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BannerOnInitEvent bannerOnInitEvent = (com.tencent.mm.autogen.events.BannerOnInitEvent) iEvent;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupEventListener", "receive BannerOnInitEvent.");
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent = new com.tencent.mm.autogen.events.BannerToAddEvent();
        un1.d dVar = new un1.d(bannerOnInitEvent.f53997g.f7384a);
        am.o0 o0Var = bannerToAddEvent.f53998g;
        o0Var.f7500c = dVar;
        o0Var.f7498a = false;
        bannerToAddEvent.e();
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent2 = new com.tencent.mm.autogen.events.BannerToAddEvent();
        am.n0 n0Var = bannerOnInitEvent.f53997g;
        un1.l lVar = new un1.l(n0Var.f7384a);
        am.o0 o0Var2 = bannerToAddEvent2.f53998g;
        o0Var2.f7500c = lVar;
        o0Var2.f7498a = false;
        bannerToAddEvent2.e();
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent3 = new com.tencent.mm.autogen.events.BannerToAddEvent();
        yn1.a0 a0Var = new yn1.a0(n0Var.f7384a);
        am.o0 o0Var3 = bannerToAddEvent3.f53998g;
        o0Var3.f7500c = a0Var;
        o0Var3.f7498a = false;
        bannerToAddEvent3.e();
        return false;
    }
}
