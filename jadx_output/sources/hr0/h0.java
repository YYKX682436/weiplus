package hr0;

/* loaded from: classes12.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr0.k0 f283299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q01.s0 f283300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f283301f;

    public h0(hr0.k0 k0Var, q01.s0 s0Var, long j17) {
        this.f283299d = k0Var;
        this.f283300e = s0Var;
        this.f283301f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List Ai = this.f283299d.Ai();
        hr0.k0 k0Var = this.f283299d;
        q01.s0 req = this.f283300e;
        long j17 = this.f283301f;
        synchronized (Ai) {
            java.util.Iterator it = k0Var.Ai().iterator();
            while (it.hasNext()) {
                ((cr0.h3) ((q01.p0) it.next())).getClass();
                kotlin.jvm.internal.o.g(req, "req");
                if (cr0.k3.f221666a.a()) {
                    cr0.k3.f221668c.lock(new cr0.i3(req, j17));
                }
            }
        }
    }
}
