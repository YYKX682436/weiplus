package qe;

/* loaded from: classes7.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.d1 f362004d;

    public x0(qe.d1 d1Var) {
        this.f362004d = d1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f362004d) {
            qe.d1 d1Var = this.f362004d;
            if (d1Var.f361935h != null) {
                com.tencent.mars.xlog.Log.i("Luggage.WcWssNativeInstallHelper", "destroyTask destroyWcWssBinding mContextId:%s", d1Var.f361928a);
                this.f362004d.f361935h.destoryWcwss();
                this.f362004d.f361935h = null;
            } else {
                com.tencent.mars.xlog.Log.e("Luggage.WcWssNativeInstallHelper", "destroyTask mWcwssNative is null");
            }
        }
    }
}
