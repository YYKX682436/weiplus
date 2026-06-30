package j20;

/* loaded from: classes9.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f297234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j20.o f297235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f297236f;

    public n(yz5.l lVar, j20.o oVar, int i17) {
        this.f297234d = lVar;
        this.f297235e = oVar;
        this.f297236f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.f0 f0Var;
        java.lang.Thread.currentThread().getName();
        yz5.l lVar = this.f297234d;
        java.util.Objects.toString(lVar);
        j20.o oVar = this.f297235e;
        if (lVar != null) {
            int i17 = this.f297236f;
            j20.g gVar = new j20.g(oVar, i17, lVar);
            j20.o.wi(oVar).add(gVar);
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().k(gVar, true);
            if (i17 > 0) {
                gVar.f297225e = new j20.f(oVar, gVar);
                ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) oVar.f297238e).getValue()).postDelayed(gVar.f297225e, i17 * 1000);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
            i11.h.e().k((j20.j) ((jz5.n) oVar.f297242i).getValue(), true);
        }
    }
}
