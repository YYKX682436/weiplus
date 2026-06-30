package ol4;

/* loaded from: classes11.dex */
public final class n extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346175d;

    public n(ol4.q qVar) {
        this.f346175d = qVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        ol4.q qVar = this.f346175d;
        long currentPositionMs = ((kk4.f0) qVar.f346180b).getCurrentPositionMs();
        long durationMs = ((kk4.f0) qVar.f346180b).getDurationMs();
        ll4.a aVar = qVar.f346182d;
        if (aVar != null) {
            kl4.n nVar = (kl4.n) aVar;
            ll4.d dVar = nVar.f308956a.f308868e;
            ((ku5.t0) ku5.t0.f312615d).B(new kl4.m(dVar, nVar.f308956a, currentPositionMs, durationMs));
        }
    }
}
