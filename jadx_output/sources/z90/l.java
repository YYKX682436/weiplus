package z90;

/* loaded from: classes9.dex */
public class l extends com.tencent.mm.sdk.event.n {
    public l() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        if (!gm0.j1.a()) {
            return false;
        }
        int i17 = ni3.g2.D;
        ni3.g2 g2Var = (ni3.g2) i95.n0.c(ni3.g2.class);
        g2Var.f337600y.b();
        ((ku5.t0) ku5.t0.f312615d).k(g2Var.f337600y, 3000L);
        return false;
    }
}
