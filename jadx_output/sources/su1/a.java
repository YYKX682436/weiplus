package su1;

/* loaded from: classes15.dex */
public final class a extends com.tencent.mm.sdk.event.n {
    public a() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.BannerOnInitEvent event = (com.tencent.mm.autogen.events.BannerOnInitEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.autogen.events.BannerToAddEvent bannerToAddEvent = new com.tencent.mm.autogen.events.BannerToAddEvent();
        android.app.Activity activity = event.f53997g.f7384a;
        kotlin.jvm.internal.o.f(activity, "activity");
        bannerToAddEvent.f53998g.f7500c = new ou1.b(activity);
        bannerToAddEvent.e();
        return false;
    }
}
