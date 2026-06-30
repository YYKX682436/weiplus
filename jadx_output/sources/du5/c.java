package du5;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public android.os.CancellationSignal f243790a = null;

    public c() {
        b();
    }

    public boolean a(boolean z17) {
        zt5.h.c("Soter.SoterBiometricCanceller", "soter: publishing cancellation. should publish: %b", java.lang.Boolean.valueOf(z17));
        if (this.f243790a.isCanceled()) {
            zt5.h.c("Soter.SoterBiometricCanceller", "soter: cancellation signal already expired.", new java.lang.Object[0]);
            return false;
        }
        if (z17) {
            ju5.o.a().c(new du5.a(this));
            ju5.o a17 = ju5.o.a();
            a17.f302136b.postDelayed(new du5.b(this), 350L);
            return true;
        }
        zt5.h.c("Soter.SoterBiometricCanceller", "soter: cancellation signal 3", new java.lang.Object[0]);
        this.f243790a.cancel();
        ju5.n c17 = ju5.n.c();
        synchronized (c17.f302128a) {
            zt5.h.c("Soter.SoterTaskManager", "soter: cancelAuthCancellationTask", new java.lang.Object[0]);
            if (ju5.n.f302127c.size() != 0) {
                for (int i17 = 0; i17 < ju5.n.f302127c.size(); i17++) {
                    ju5.o.a().c(new ju5.m(c17, ju5.n.f302127c.keyAt(i17)));
                }
            }
        }
        return true;
    }

    public void b() {
        zt5.h.c("Soter.SoterBiometricCanceller", "qc: %s refreshCancellationSignal", this);
        this.f243790a = new android.os.CancellationSignal();
    }
}
