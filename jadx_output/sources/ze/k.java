package ze;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f471735d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f471736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f471737f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f471738g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ze.l f471739h;

    public k(ze.l lVar, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2, java.lang.Runnable runnable) {
        this.f471739h = lVar;
        this.f471736e = appBrandRuntime;
        this.f471737f = appBrandRuntime2;
        this.f471738g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f471735d.getAndSet(true)) {
            return;
        }
        super/*com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer*/.R(this.f471736e, this.f471737f, this.f471738g);
    }
}
