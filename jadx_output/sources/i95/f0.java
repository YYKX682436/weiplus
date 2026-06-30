package i95;

/* loaded from: classes12.dex */
public class f0 implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f289790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f289791e;

    public f0(java.lang.Class cls, boolean z17) {
        this.f289790d = cls;
        this.f289791e = z17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        i95.w wVar;
        java.lang.Class cls = this.f289790d;
        i95.w wVar2 = null;
        try {
            try {
                i95.w wVar3 = (i95.w) i95.n0.f289818b.a(cls);
                java.lang.ThreadLocal threadLocal = i95.n0.f289830n;
                wVar = (i95.w) threadLocal.get();
                try {
                    threadLocal.set(wVar3);
                    i95.n0.j(wVar, wVar3, i95.r.INITIALIZED, this.f289791e, false, false);
                    threadLocal.set(wVar);
                    wVar2 = wVar3;
                } catch (com.tencent.mm.support.feature_service.ServiceNotFoundException e17) {
                    e = e17;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ServiceManager", e, "[-] Fail to get feature service instance of '%s'", cls.getName());
                    i95.n0.f289830n.set(wVar);
                    return wVar2;
                }
            } catch (java.lang.Throwable th6) {
                th = th6;
                wVar2 = wVar;
                i95.n0.f289830n.set(wVar2);
                throw th;
            }
        } catch (com.tencent.mm.support.feature_service.ServiceNotFoundException e18) {
            e = e18;
            wVar = null;
        } catch (java.lang.Throwable th7) {
            th = th7;
            i95.n0.f289830n.set(wVar2);
            throw th;
        }
        return wVar2;
    }
}
