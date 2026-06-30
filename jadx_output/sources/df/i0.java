package df;

/* loaded from: classes15.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.p0 f229490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.RenderMode f229491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f229492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(df.p0 p0Var, io.flutter.embedding.android.RenderMode renderMode, long j17) {
        super(1);
        this.f229490d = p0Var;
        this.f229491e = renderMode;
        this.f229492f = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchFlutterRenderSurface-");
        df.p0 p0Var = this.f229490d;
        sb6.append(p0Var.f229532a.getSkylineWindowId());
        sb6.append(" mode:");
        io.flutter.embedding.android.RenderMode renderMode = this.f229491e;
        sb6.append(renderMode);
        sb6.append(", call finish ,tick:");
        sb6.append(this.f229492f);
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", sb6.toString(), new java.lang.Object[0]);
        if (th6 == null) {
            p0Var.o(renderMode);
        }
        return jz5.f0.f302826a;
    }
}
