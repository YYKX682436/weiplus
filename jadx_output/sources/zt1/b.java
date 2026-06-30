package zt1;

/* loaded from: classes8.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.GetCardCountEvent f475555d;

    public b(zt1.c cVar, com.tencent.mm.autogen.events.GetCardCountEvent getCardCountEvent) {
        this.f475555d = getCardCountEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (gm0.j1.a()) {
            boolean z17 = this.f475555d.f54382g.f7031a;
            com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCard.cardGetCountListener", "GetCardCountEvent isForceGet is " + z17);
            boolean t17 = lu1.a0.t();
            boolean A = lu1.a0.A();
            if (t17 && A) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreCard.cardGetCountListener", "card entrance and share card entrance is open");
                return;
            }
            if (z17) {
                gm0.j1.n().f273288b.g(new xt1.f0());
            } else {
                java.lang.Integer num = (java.lang.Integer) gm0.j1.u().c().l(282882, null);
                if (((int) (java.lang.System.currentTimeMillis() / 1000)) - (num != null ? num.intValue() : 0) >= 7200) {
                    gm0.j1.n().f273288b.g(new xt1.f0());
                }
            }
            ((ku5.t0) ku5.t0.f312615d).h(new zt1.a(this, A, t17), "SubCoreCard-doSyncNetScene");
        }
    }
}
