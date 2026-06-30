package k85;

/* loaded from: classes15.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f305408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f305409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f305410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f305411g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f305412h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z17, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar, android.app.Activity activity) {
        super(0);
        this.f305408d = z17;
        this.f305409e = g0Var;
        this.f305410f = f0Var;
        this.f305411g = lVar;
        this.f305412h = activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        d85.f0 f0Var2 = this.f305410f;
        d85.g0 g0Var = this.f305409e;
        boolean z17 = this.f305408d;
        if (z17) {
            j85.h.f298258a.a(202L, java.lang.Long.valueOf(g0Var.f227193e), java.lang.Long.valueOf(f0Var2.f227177e), java.lang.Boolean.TRUE);
        }
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).sj(g0Var.f227192d, f0Var2.f227176d, z17);
        jz5.f0 f0Var3 = jz5.f0.f302826a;
        yz5.l lVar = this.f305411g;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z17));
            f0Var = f0Var3;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            k85.t tVar = k85.t.f305439a;
            java.lang.String str = g0Var.f227192d;
            android.app.Activity activity = this.f305412h;
            if (z17) {
                if (activity instanceof com.tencent.mm.ui.MMActivity) {
                    ((com.tencent.mm.ui.MMActivity) activity).onBusinessPermissionGranted(str);
                } else if (activity instanceof d85.j0) {
                    ((d85.j0) activity).onBusinessPermissionGranted(str);
                } else if (!kz5.z.G(k85.t.f305441c, activity.getClass().getSimpleName())) {
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                    pm0.v.V(50L, new k85.i(activity));
                }
            } else if (activity instanceof com.tencent.mm.ui.MMActivity) {
                ((com.tencent.mm.ui.MMActivity) activity).onBusinessPermissionDenied(str);
            } else if (activity instanceof d85.j0) {
                ((d85.j0) activity).onBusinessPermissionDenied(str);
            } else {
                java.lang.String[] strArr = k85.t.f305441c;
                if (!kz5.z.G(strArr, activity.getClass().getSimpleName())) {
                    activity.finish();
                } else if (!kz5.z.G(strArr, activity.getClass().getSimpleName()) && (activity instanceof com.tencent.mm.ui.MMActivity)) {
                    ((com.tencent.mm.ui.MMActivity) activity).onBusinessPermissionDenied(str);
                }
            }
        }
        return f0Var3;
    }
}
