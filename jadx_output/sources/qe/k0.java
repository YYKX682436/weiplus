package qe;

/* loaded from: classes7.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.m0 f361972d;

    public k0(qe.m0 m0Var) {
        this.f361972d = m0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f361972d) {
            if (this.f361972d.f361975a != null) {
                com.tencent.mars.xlog.Log.i("Luggage.TcpNativeInstallHelper", "DestroyTask destoryTcp");
                this.f361972d.f361975a.destoryTcp();
                this.f361972d.f361975a = null;
            } else {
                com.tencent.mars.xlog.Log.i("Luggage.TcpNativeInstallHelper", "DestroyTask tcpNative is null");
            }
        }
    }
}
