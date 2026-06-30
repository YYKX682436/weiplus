package df;

/* loaded from: classes15.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.p0 f229495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.RenderMode f229496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f229497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f229498g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(df.p0 p0Var, io.flutter.embedding.android.RenderMode renderMode, kotlinx.coroutines.r2 r2Var, long j17) {
        super(1);
        this.f229495d = p0Var;
        this.f229496e = renderMode;
        this.f229497f = r2Var;
        this.f229498g = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchFlutterRenderSurface-");
        df.p0 p0Var = this.f229495d;
        sb6.append(p0Var.f229532a.getSkylineWindowId());
        sb6.append(" mode:");
        io.flutter.embedding.android.RenderMode renderMode = this.f229496e;
        sb6.append(renderMode);
        sb6.append(", job(");
        kotlinx.coroutines.r2 r2Var = this.f229497f;
        sb6.append(r2Var);
        sb6.append(") completed, tick:");
        long j17 = this.f229498g;
        sb6.append(j17);
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", sb6.toString(), new java.lang.Object[0]);
        if (kotlin.jvm.internal.o.b(r2Var, p0Var.f229537f)) {
            p0Var.f229537f = null;
        }
        if (th6 == null) {
            kotlinx.coroutines.r2 r2Var2 = p0Var.f229538g;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            kotlinx.coroutines.y0 y0Var = p0Var.f229536e;
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.r2 c17 = kotlinx.coroutines.l.c(y0Var, kotlinx.coroutines.internal.b0.f310484a, kotlinx.coroutines.a1.UNDISPATCHED, new df.h0(p0Var, null));
            p0Var.f229538g = c17;
            c17.p(new df.i0(p0Var, renderMode, j17));
        }
        return jz5.f0.f302826a;
    }
}
