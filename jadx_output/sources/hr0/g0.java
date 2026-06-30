package hr0;

/* loaded from: classes12.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr0.k0 f283295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f283297f;

    public g0(hr0.k0 k0Var, java.util.List list, long j17) {
        this.f283295d = k0Var;
        this.f283296e = list;
        this.f283297f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List Ai = this.f283295d.Ai();
        hr0.k0 k0Var = this.f283295d;
        java.util.List<q01.s0> list = this.f283296e;
        long j17 = this.f283297f;
        synchronized (Ai) {
            for (q01.p0 p0Var : k0Var.Ai()) {
                for (q01.s0 s0Var : list) {
                    long j18 = j17 - s0Var.f359331c;
                    ((cr0.h3) p0Var).getClass();
                    if (cr0.k3.f221666a.a()) {
                        cr0.k3.f221668c.lock(new cr0.i3(s0Var, j18));
                    }
                }
            }
        }
    }
}
