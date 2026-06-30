package qe;

/* loaded from: classes7.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.s0 f361987d;

    public q0(qe.s0 s0Var) {
        this.f361987d = s0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f361987d) {
            if (this.f361987d.f361990a != null) {
                com.tencent.mars.xlog.Log.i("Luggage.UdpNativeInstallHelper", "DestroyTask destoryUdp");
                this.f361987d.f361990a.destoryUdp();
                this.f361987d.f361990a = null;
            } else {
                com.tencent.mars.xlog.Log.i("Luggage.UdpNativeInstallHelper", "DestroyTask udpNative is null");
            }
        }
    }
}
