package w6;

/* loaded from: classes13.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final m7.f f443129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w6.m0 f443130e;

    public i0(w6.m0 m0Var, m7.f fVar) {
        this.f443130e = m0Var;
        this.f443129d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m7.h hVar = (m7.h) this.f443129d;
        hVar.f324436a.a();
        synchronized (hVar.f324437b) {
            synchronized (this.f443130e) {
                w6.l0 l0Var = this.f443130e.f443152d;
                m7.f fVar = this.f443129d;
                l0Var.getClass();
                if (l0Var.f443151d.contains(new w6.k0(fVar, q7.i.f360299b))) {
                    this.f443130e.B.b();
                    w6.m0 m0Var = this.f443130e;
                    m7.f fVar2 = this.f443129d;
                    m0Var.getClass();
                    try {
                        ((m7.h) fVar2).k(m0Var.B, m0Var.f443169x);
                        this.f443130e.g(this.f443129d);
                    } catch (java.lang.Throwable th6) {
                        throw new w6.f(th6);
                    }
                }
                this.f443130e.c();
            }
        }
    }
}
