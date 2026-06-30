package w6;

/* loaded from: classes13.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final m7.f f443124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w6.m0 f443125e;

    public h0(w6.m0 m0Var, m7.f fVar) {
        this.f443125e = m0Var;
        this.f443124d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m7.h hVar = (m7.h) this.f443124d;
        hVar.f324436a.a();
        synchronized (hVar.f324437b) {
            synchronized (this.f443125e) {
                w6.l0 l0Var = this.f443125e.f443152d;
                m7.f fVar = this.f443124d;
                l0Var.getClass();
                if (l0Var.f443151d.contains(new w6.k0(fVar, q7.i.f360299b))) {
                    w6.m0 m0Var = this.f443125e;
                    m7.f fVar2 = this.f443124d;
                    m0Var.getClass();
                    try {
                        ((m7.h) fVar2).i(m0Var.f443171z, 5);
                    } catch (java.lang.Throwable th6) {
                        throw new w6.f(th6);
                    }
                }
                this.f443125e.c();
            }
        }
    }
}
