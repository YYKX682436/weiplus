package k01;

/* loaded from: classes9.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k91.v5 f303034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v05.b f303035e;

    public g(k91.v5 v5Var, v05.b bVar) {
        this.f303034d = v5Var;
        this.f303035e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s05.d dVar;
        s05.a o17;
        if (com.tencent.mm.app.w.INSTANCE.f53889n) {
            k91.v5 v5Var = this.f303034d;
            if (v5Var != null) {
                try {
                    if (v5Var.u0().b()) {
                        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).c8(com.tencent.mm.plugin.appbrand.service.x6.I);
                    } else if (this.f303034d.u0().c()) {
                        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.I);
                    } else {
                        ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Rh(com.tencent.mm.plugin.appbrand.service.x6.I);
                    }
                    return;
                } catch (java.lang.Exception unused) {
                    return;
                }
            }
            v05.b bVar = this.f303035e;
            if (ot0.o.b((bVar == null || (dVar = (s05.d) bVar.getCustom(bVar.f432315e + 39)) == null || (o17 = dVar.o()) == null) ? 0 : o17.getType())) {
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
