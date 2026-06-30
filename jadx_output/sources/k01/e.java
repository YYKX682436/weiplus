package k01;

/* loaded from: classes7.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f303030d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q f303031e;

    public e(k91.v5 v5Var, ot0.q qVar) {
        this.f303030d = v5Var;
        this.f303031e = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.mm.app.w.INSTANCE.f53889n) {
            k91.v5 v5Var = this.f303030d;
            if (v5Var != null) {
                try {
                    if (v5Var.u0().b()) {
                        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).c8(com.tencent.mm.plugin.appbrand.service.x6.I);
                    } else if (this.f303030d.u0().c()) {
                        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.I);
                    } else {
                        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.I);
                    }
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            }
            if (ot0.o.b(this.f303031e.f348697p2)) {
                ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.I);
                return;
            }
            com.tencent.mm.plugin.appbrand.service.f5 f5Var = (com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class);
            com.tencent.mm.plugin.appbrand.service.x6 x6Var = com.tencent.mm.plugin.appbrand.service.x6.I;
            f5Var.Rh(x6Var);
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).c8(x6Var);
        }
    }
}
