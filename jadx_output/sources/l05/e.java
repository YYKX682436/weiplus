package l05;

/* loaded from: classes9.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.wxpay.g gVar = (com.tencent.mm.plugin.wxpay.g) i95.n0.c(com.tencent.mm.plugin.wxpay.g.class);
        gVar.getClass();
        am.dn dnVar = ((com.tencent.mm.autogen.events.OnSoterInitializedEvent) iEvent).f54584g;
        int i17 = dnVar.f6479a;
        if (i17 != 0 && wo.v1.f447828h.f447810a) {
            m05.i.f322570a.a("5", "1", java.lang.String.valueOf(i17), dnVar.f6480b);
        }
        nz2.o xVar = new nz2.x();
        if (xVar.wh()) {
            xVar.prepare();
        } else {
            xVar = new nz2.n();
            if (xVar.wh()) {
                xVar.prepare();
            } else {
                xVar = new nz2.h();
            }
        }
        gm0.j1.q(nz2.o.class, xVar);
        gVar.f188570e = true;
        return false;
    }
}
