package qe;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f361924d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.f0 f361925e;

    public c0(qe.f0 f0Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f361925e = f0Var;
        this.f361924d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "initConfigLockStep initConfig ");
        if (this.f361925e.f361945a == null) {
            com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "initConfigLockStep lockStepNative is null");
            return;
        }
        k91.z0 z0Var = (k91.z0) this.f361924d.b(k91.z0.class);
        if (z0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.LockStepNativeInstallHelper", "initConfigLockStep sysConfig is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "lockstep appId:%s,pkgDebugType:%d,pkgVersion:%d,mbzType:%s", z0Var.f305842e, java.lang.Integer.valueOf(z0Var.f305852r.f75399d + 1), java.lang.Integer.valueOf(z0Var.f305852r.pkgVersion), this.f361925e.f361946b);
        java.util.HashMap<java.lang.String, java.lang.String> hashMap = new java.util.HashMap<>();
        hashMap.put("appid", z0Var.f305842e);
        hashMap.put("appstate", java.lang.String.valueOf(z0Var.f305852r.f75399d + 1));
        hashMap.put("appversion", java.lang.String.valueOf(z0Var.f305852r.pkgVersion));
        hashMap.put("apptype", this.f361925e.f361946b);
        this.f361925e.f361945a.initConfig(hashMap);
    }
}
