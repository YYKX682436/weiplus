package qe;

/* loaded from: classes7.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f361919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.game.liblockstep.LockStepNative.ILockStepListener f361920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener f361921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qe.f0 f361922g;

    public b0(qe.f0 f0Var, com.tencent.mm.plugin.appbrand.jsruntime.t tVar, com.tencent.mm.game.liblockstep.LockStepNative.ILockStepListener iLockStepListener, com.tencent.mm.game.liblockstep.LockStepNative.ILockStepReportListener iLockStepReportListener) {
        this.f361922g = f0Var;
        this.f361919d = tVar;
        this.f361920e = iLockStepListener;
        this.f361921f = iLockStepReportListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding setCallback ");
        qe.f0 f0Var = this.f361922g;
        if (f0Var.f361945a != null) {
            com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding lockStepNative != null");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) this.f361919d.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.e("Luggage.LockStepNativeInstallHelper", "createLockStepBinding v8Addon is null");
            return;
        }
        if (f0Var.f361947c) {
            f0Var.f361945a = new com.tencent.mm.game.liblockstep.LockStepNative(l0Var.L(), l0Var.G(), l0Var.z());
        } else {
            f0Var.f361945a = new com.tencent.mm.game.liblockstep.LockStepNative(l0Var.L(), l0Var.G(), 0L);
        }
        com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "createLockStepBinding setCallback ret:%d", java.lang.Integer.valueOf(f0Var.f361945a.setCallback(this.f361920e, this.f361921f)));
    }
}
