package ec1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f250939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f250940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.t9 f250941f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f250942g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f250943h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f250944i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f250945m;

    public c(ec1.a aVar, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, android.content.Context context, com.tencent.mm.plugin.appbrand.t9 t9Var, int i17, int i18, int i19, boolean z17) {
        this.f250939d = atomicBoolean;
        this.f250940e = context;
        this.f250941f = t9Var;
        this.f250942g = i17;
        this.f250943h = i18;
        this.f250944i = i19;
        this.f250945m = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f250942g;
        android.content.Context context = this.f250940e;
        com.tencent.mm.plugin.appbrand.t9 t9Var = this.f250941f;
        boolean a17 = com.tencent.mm.plugin.appbrand.u9.a(context, t9Var, i17, false);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f250939d;
        atomicBoolean.set(a17);
        if (atomicBoolean.get()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(443L, 1L, 1L, false);
        }
        if (context == null || !atomicBoolean.get()) {
            return;
        }
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        android.content.Context context2 = this.f250940e;
        int i18 = this.f250943h;
        int i19 = this.f250944i;
        boolean z17 = this.f250945m;
        java.lang.String str = t9Var.f88975d;
        ((zd0.e) hVar).getClass();
        xp1.d.h(context2, i18, i19, z17, str, true);
    }
}
