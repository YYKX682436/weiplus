package hq0;

/* loaded from: classes7.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hq0.b0 b0Var) {
        super(0);
        this.f283029d = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f283029d.X0();
        hq0.b0 b0Var = this.f283029d;
        b0Var.S(b0Var.f282970x.f293635b);
        hq0.b0 b0Var2 = this.f283029d;
        b0Var2.B = (gq0.v) b0Var2.f282970x.f293638e;
        if (((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Bi(this.f283029d.f282970x.f293634a)) {
            qq0.i iVar = (qq0.i) i95.n0.c(qq0.i.class);
            jc3.j0 j0Var = this.f283029d.f282995g;
            kotlin.jvm.internal.o.d(j0Var);
            java.lang.String instanceName = ((rc3.w0) j0Var).f394087e;
            hq0.b0 delegate = this.f283029d;
            qq0.m mVar = (qq0.m) iVar;
            mVar.getClass();
            kotlin.jvm.internal.o.g(instanceName, "instanceName");
            kotlin.jvm.internal.o.g(delegate, "delegate");
            com.tencent.mars.xlog.Log.i("MagicSclStartupCoverService", "setDelegate instanceName:".concat(instanceName));
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = mVar.f365901f;
            if (concurrentHashMap != null) {
                concurrentHashMap.put(instanceName, delegate);
            }
        }
        hq0.b0 b0Var3 = this.f283029d;
        com.tencent.mars.xlog.Log.i(b0Var3.f282971y, "startInitBizTimeoutIfNeeded cacheTime: " + ((java.lang.Object) s26.a.h(b0Var3.R)));
        kotlinx.coroutines.r2 r2Var = b0Var3.S;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        b0Var3.S = null;
        long j17 = b0Var3.R;
        if (s26.a.d(j17, 0L) > 0) {
            com.tencent.mars.xlog.Log.i(b0Var3.f282971y, "startInitBizTimeout " + s26.a.e(j17));
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            b0Var3.S = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new hq0.a0(j17, b0Var3, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
