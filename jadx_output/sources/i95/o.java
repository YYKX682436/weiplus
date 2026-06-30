package i95;

/* loaded from: classes12.dex */
public class o implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i95.y f289836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f289837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Throwable f289838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f289839g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i95.w f289840h;

    public o(i95.w wVar, i95.y yVar, java.lang.Class cls, java.lang.Throwable th6, boolean z17) {
        this.f289840h = wVar;
        this.f289836d = yVar;
        this.f289837e = cls;
        this.f289838f = th6;
        this.f289839g = z17;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.Class cls = this.f289837e;
        try {
            i95.w wVar = (i95.w) this.f289836d.a(cls);
            wVar.setLastCallerStack(this.f289838f);
            i95.n0.j(this.f289840h, wVar, i95.r.INITIALIZED, false, this.f289839g, true);
            return null;
        } catch (com.tencent.mm.support.feature_service.ServiceNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FeatureService", e17, "Depended service '%s' of '%s' was not registered on current process: '%s'.", cls.getName(), this.f289840h.getClass().getName(), bm5.f1.a());
            return null;
        }
    }
}
