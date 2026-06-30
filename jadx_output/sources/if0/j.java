package if0;

/* loaded from: classes16.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if0.k f291025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f291026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f291027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(if0.k kVar, int i17, long j17) {
        super(0);
        this.f291025d = kVar;
        this.f291026e = i17;
        this.f291027f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if0.k kVar = this.f291025d;
        if0.l lVar = kVar.f291032e;
        if (lVar != null) {
            if (lVar.f291034b >= this.f291026e) {
                com.tencent.mars.xlog.Log.i(kVar.d(), "delayTask:" + this.f291025d.f291032e + " exist, ignore");
                return jz5.f0.f302826a;
            }
            com.tencent.mars.xlog.Log.i(kVar.d(), "delayTask:" + this.f291025d.f291032e + " exist, cancel");
            lVar.f291033a.cancel(false);
        }
        if0.k kVar2 = this.f291025d;
        ku5.u0 u0Var = ku5.t0.f312615d;
        if0.i iVar = new if0.i(this.f291025d);
        long j17 = this.f291027f;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c w17 = t0Var.w(iVar, j17, null);
        kotlin.jvm.internal.o.f(w17, "computeDelay(...)");
        kVar2.f291032e = new if0.l(w17, this.f291026e);
        return jz5.f0.f302826a;
    }
}
