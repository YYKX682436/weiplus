package fv;

/* loaded from: classes16.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fv.k f266925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f266926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f266927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fv.k kVar, int i17, long j17) {
        super(0);
        this.f266925d = kVar;
        this.f266926e = i17;
        this.f266927f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fv.k kVar = this.f266925d;
        fv.l lVar = kVar.f266932e;
        if (lVar != null) {
            if (lVar.f266934b >= this.f266926e) {
                com.tencent.mars.xlog.Log.i(kVar.d(), "delayTask:" + this.f266925d.f266932e + " exist, ignore");
                return jz5.f0.f302826a;
            }
            com.tencent.mars.xlog.Log.i(kVar.d(), "delayTask:" + this.f266925d.f266932e + " exist, cancel");
            lVar.f266933a.cancel(false);
        }
        fv.k kVar2 = this.f266925d;
        ku5.u0 u0Var = ku5.t0.f312615d;
        fv.i iVar = new fv.i(this.f266925d);
        long j17 = this.f266927f;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c w17 = t0Var.w(iVar, j17, null);
        kotlin.jvm.internal.o.f(w17, "computeDelay(...)");
        kVar2.f266932e = new fv.l(w17, this.f266926e);
        return jz5.f0.f302826a;
    }
}
