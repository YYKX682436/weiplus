package u61;

/* loaded from: classes13.dex */
public final class i extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f424888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.locks.ReentrantLock f424889b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.locks.Condition f424890c;

    public i(kotlin.jvm.internal.h0 h0Var, java.util.concurrent.locks.ReentrantLock reentrantLock, java.util.concurrent.locks.Condition condition) {
        this.f424888a = h0Var;
        this.f424889b = reentrantLock;
        this.f424890c = condition;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        com.tencent.mars.xlog.Log.e("MicroMsg.GateWayRegHelper", "onAvailable");
        this.f424888a.f310123d = network;
        u61.o oVar = u61.o.f424924a;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f424889b;
        reentrantLock.lock();
        this.f424890c.signal();
        reentrantLock.unlock();
    }
}
