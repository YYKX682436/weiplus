package q71;

/* loaded from: classes12.dex */
public class v extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.autogen.events.RcptRecentAddrEvent f360370d;

    public v() {
        super(0);
    }

    public final void b(int i17, boolean z17) {
        am.lp lpVar = this.f360370d.f54644h;
        lpVar.f7253a = i17;
        if (i17 != 0) {
            lpVar.f7254b = false;
        } else if (z17) {
            lpVar.f7254b = true;
            o71.l.wi();
            s71.a aVar = o71.l.Bi().f360339a;
            if (aVar.f403969d.size() > 0) {
                java.util.LinkedList linkedList = aVar.f403969d;
                s71.b bVar = (s71.b) linkedList.getFirst();
                am.lp lpVar2 = this.f360370d.f54644h;
                lpVar2.f7255c = bVar.f403979p;
                lpVar2.f7257e = bVar.f403977n;
                lpVar2.f7256d = bVar.f403978o;
                lpVar2.f7258f = bVar.f403975i;
                lpVar2.f7259g = bVar.f403972f;
                lpVar2.f7260h = bVar.f403973g;
                lpVar2.f7261i = bVar.f403974h;
                lpVar2.f7262j = bVar.f403980q;
                lpVar2.f7263k = bVar.f403976m;
                lpVar2.f7264l = linkedList;
            }
        } else {
            lpVar.f7254b = false;
        }
        java.lang.Runnable runnable = this.f360370d.f192364d;
        if (runnable != null) {
            runnable.run();
        }
        this.f360370d = null;
        c01.d9.e().q(417, this);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.RcptRecentAddrEvent rcptRecentAddrEvent = (com.tencent.mm.autogen.events.RcptRecentAddrEvent) iEvent;
        if (rcptRecentAddrEvent instanceof com.tencent.mm.autogen.events.RcptRecentAddrEvent) {
            this.f360370d = rcptRecentAddrEvent;
            c01.d9.e().a(417, this);
            am.kp kpVar = this.f360370d.f54643g;
            c01.d9.e().g(new q71.o(0, kpVar.f7174b, kpVar.f7173a, 1));
        }
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof q71.o) {
            if (i18 == 0) {
                b(i18, true);
            } else {
                b(i18, false);
            }
        }
    }
}
