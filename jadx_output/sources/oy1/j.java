package oy1;

/* loaded from: classes13.dex */
public final class j extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oy1.l f349877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f349878b;

    public j(oy1.l lVar, android.net.ConnectivityManager connectivityManager) {
        this.f349877a = lVar;
        this.f349878b = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.BaseCgiReport");
        this.f349877a.e(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.BaseCgiReport", "net work onAvailable");
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        ((ku5.t0) ku5.t0.f312615d).l(new oy1.i(this.f349878b, this.f349877a), 1000L, "MicroMsg.BaseCgiReport");
    }
}
