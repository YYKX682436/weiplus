package nu1;

/* loaded from: classes13.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu1.n f340168d;

    public l(nu1.n nVar) {
        this.f340168d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nu1.n nVar = this.f340168d;
        if (nVar.Ai()) {
            com.tencent.mm.autogen.events.ScreenCastEvent screenCastEvent = new com.tencent.mm.autogen.events.ScreenCastEvent();
            screenCastEvent.f54742g.f6706a = true;
            screenCastEvent.e();
        } else {
            com.tencent.mm.autogen.events.ScreenCastEvent screenCastEvent2 = new com.tencent.mm.autogen.events.ScreenCastEvent();
            screenCastEvent2.f54742g.f6706a = false;
            screenCastEvent2.e();
            nVar.wi();
        }
    }
}
