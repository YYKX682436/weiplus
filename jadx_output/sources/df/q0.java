package df;

/* loaded from: classes15.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.r0 f229539d;

    public q0(df.r0 r0Var) {
        this.f229539d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            df.r0 r0Var = this.f229539d;
            com.tencent.skyline.SkylineLogic.attachFlutterEngine(r0Var.f229543b, r0Var.f229542a);
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mm.plugin.appbrand.utils.s3.a("SkylineFlutterViewWrapperTextureViewImpl", "attachFlutterEngine retry also failed", e17);
        }
    }
}
