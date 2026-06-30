package ku3;

/* loaded from: classes5.dex */
public final class s4 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final zt3.a f312409d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f312410e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f312411f;

    public s4(zt3.a kitContext, android.view.ViewGroup parent, ju3.d0 status) {
        kotlin.jvm.internal.o.g(kitContext, "kitContext");
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f312409d = kitContext;
        this.f312410e = parent;
        this.f312411f = kotlinx.coroutines.z0.b();
    }

    @Override // yt3.r2
    public void release() {
        kotlinx.coroutines.z0.e(this.f312411f, null, 1, null);
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f312409d.R6(new ku3.r4(this));
    }
}
