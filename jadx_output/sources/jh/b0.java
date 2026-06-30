package jh;

/* loaded from: classes13.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jh.g0 f299670d;

    public b0(jh.g0 g0Var) {
        this.f299670d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        jh.g0 g0Var = this.f299670d;
        if (g0Var.f299705a && g0Var.f299706b) {
            jh.m mVar = g0Var.f299708d;
            if (jh.a0.l(mVar.f299730f.f299673a).exists()) {
                jh.t tVar = mVar.f299729e;
                tVar.f299755f.post(new jh.q(tVar, jh.s.RequestConsuming));
            }
        }
        jh.g0 g0Var2 = this.f299670d;
        g0Var2.f299710f = false;
        g0Var2.f299710f = false;
        g0Var2.f299709e.postDelayed(new jh.b0(g0Var2), 21600000L);
    }
}
