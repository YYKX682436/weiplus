package wt1;

/* loaded from: classes9.dex */
public class w0 extends com.tencent.mm.sdk.event.n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public long f449360d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f449361e;

    public w0() {
        super(0);
        this.f449360d = 0L;
        this.f449361e = "";
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.GiftCardEvent giftCardEvent = (com.tencent.mm.autogen.events.GiftCardEvent) iEvent;
        if (!(giftCardEvent instanceof com.tencent.mm.autogen.events.GiftCardEvent)) {
            return false;
        }
        am.yg ygVar = giftCardEvent.f54423g;
        java.lang.String str = ygVar.f8458a;
        this.f449360d = ygVar.f8459b;
        this.f449361e = ygVar.f8460c;
        xt1.f d17 = lu1.u.d(str);
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f449361e, this.f449360d);
        Li.r1(1);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(this.f449360d, Li, true);
        if (d17 == null) {
            d17 = lu1.u.d(Li.j());
        }
        if (d17 == null) {
            return true;
        }
        gm0.j1.n().f273288b.a(1045, this);
        gm0.j1.n().f273288b.g(new xt1.m0(d17.f456466b, this.f449361e, 17));
        return true;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof xt1.m0) {
            java.lang.String str2 = ((xt1.m0) m1Var).f456525f;
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(this.f449361e, this.f449360d);
            if (i17 == 0 && i18 == 0) {
                Li.r1(2);
            } else {
                Li.r1(5);
            }
            ot0.q v17 = ot0.q.v(Li.j());
            xt1.f d17 = lu1.u.d(Li.j());
            d17.f456472h = str2;
            v17.U0 = lu1.u.c(d17);
            v17.T0 = ot0.q.u(v17, null, null);
            Li.d1(ot0.q.u(v17, null, null));
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(this.f449360d, Li, true);
            gm0.j1.n().f273288b.q(1045, this);
        }
    }
}
