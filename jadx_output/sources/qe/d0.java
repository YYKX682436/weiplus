package qe;

/* loaded from: classes7.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.f0 f361927d;

    public d0(qe.f0 f0Var) {
        this.f361927d = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f361927d) {
            if (this.f361927d.f361945a != null) {
                com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "DestroyTask destoryLockStep");
                this.f361927d.f361945a.destoryLockStep();
                this.f361927d.f361945a = null;
            } else {
                com.tencent.mars.xlog.Log.i("Luggage.LockStepNativeInstallHelper", "DestroyTask lockStepNative is null");
            }
        }
    }
}
