package oy1;

/* loaded from: classes13.dex */
public final class m0 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f349897a;

    public m0(android.net.ConnectivityManager connectivityManager) {
        this.f349897a = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.CgiReportService");
        qy1.g gVar = qy1.g.f367725a;
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = qy1.g.f367726b;
        if (!atomicBoolean.get()) {
            oy1.u.f349928a.e();
        }
        atomicBoolean.set(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiReportService", "net work onAvailable");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        ((ku5.t0) ku5.t0.f312615d).l(new oy1.l0(this.f349897a), 1000L, "MicroMsg.CgiReportService");
    }
}
