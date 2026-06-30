package f21;

/* loaded from: classes.dex */
public class k0 extends com.tencent.mm.sdk.event.n {
    public k0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (com.tencent.mm.sdk.platformtools.t8.H1(com.tencent.mm.sdk.platformtools.t8.k1((java.lang.Long) gm0.j1.u().c().l(66818, null), 0L)) * 1000 > 1800000) {
            int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) gm0.j1.u().c().l(66820, null), -99999);
            if (j17 != -99999) {
                c01.sc.b(9, j17 + "");
                gm0.j1.u().c().w(66820, -99999);
            }
            gm0.j1.u().c().w(66818, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
        }
        return false;
    }
}
