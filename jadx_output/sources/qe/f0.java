package qe;

/* loaded from: classes7.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.game.liblockstep.LockStepNative f361945a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f361946b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f361947c = true;

    /* renamed from: d, reason: collision with root package name */
    public final qe.e0 f361948d = new qe.e0(this, new qe.d0(this));

    public void a(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding");
        if (tVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.LockStepNativeInstallHelper", "createLockStepBinding jsruntime is null");
            return;
        }
        this.f361946b = java.lang.String.valueOf(i17);
        ij0.c.f291668a.loadLibrary("mmlockstep");
        com.tencent.mm.plugin.appbrand.jsruntime.f0 f0Var = (com.tencent.mm.plugin.appbrand.jsruntime.f0) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.f0.class);
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.LockStepNativeInstallHelper", "createLockStepBinding jsThreadHandler is null");
            return;
        }
        qe.g0 g0Var = (qe.g0) i95.n0.c(qe.g0.class);
        if (g0Var != null) {
            boolean wi6 = ((yc1.g0) g0Var).wi();
            this.f361947c = wi6;
            com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding xLibUVSwitch:%b ", java.lang.Boolean.valueOf(wi6));
        }
        f0Var.post(new qe.b0(this, tVar, new qe.z(this, new java.lang.ref.WeakReference(f0Var)), new qe.a0(this)));
    }

    public void b(com.tencent.mm.plugin.appbrand.jsruntime.t tVar) {
        com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "destroyLockStepBinding");
        if (tVar == null) {
            com.tencent.mars.xlog.Log.e("Luggage.LockStepNativeInstallHelper", "destroyLockStepBinding jsruntime is null");
        } else {
            ((com.tencent.mm.plugin.appbrand.jsruntime.y) tVar.h0(com.tencent.mm.plugin.appbrand.jsruntime.y.class)).r(this.f361948d);
        }
    }
}
