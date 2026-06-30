package o71;

/* loaded from: classes12.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.RcptRecentAddrEvent f343285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f343286e;

    public a(com.tencent.mm.autogen.events.RcptRecentAddrEvent rcptRecentAddrEvent, yz5.l lVar) {
        this.f343285d = rcptRecentAddrEvent;
        this.f343286e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.events.RcptRecentAddrEvent rcptRecentAddrEvent = this.f343285d;
        int i17 = rcptRecentAddrEvent.f54644h.f7253a;
        boolean z17 = rcptRecentAddrEvent.f54644h.f7254b;
        if (rcptRecentAddrEvent.f54644h.f7253a < Integer.MAX_VALUE) {
            s71.a aVar = o71.l.Bi().f360339a;
            java.lang.Object obj = aVar != null ? aVar.f403969d : null;
            if (obj == null) {
                obj = kz5.p0.f313996d;
            }
            this.f343286e.invoke(obj);
        }
    }
}
