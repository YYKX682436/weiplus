package uh1;

/* loaded from: classes13.dex */
public final class t1 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uh1.y1 f427906a;

    public t1(uh1.y1 y1Var) {
        this.f427906a = y1Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkProvider", "onAvailable, network: " + network);
        super.onAvailable(network);
        this.f427906a.f427940b = network;
        uh1.y1 y1Var = this.f427906a;
        y1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkProvider", "consumePendingCallbacks, network: " + network);
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = y1Var.f427939a;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((uh1.p1) it.next()).a(network);
        }
        copyOnWriteArraySet.clear();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkProvider", "onLost, network: " + network);
        super.onLost(network);
        this.f427906a.f427940b = null;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkProvider", "onUnavailable");
        super.onUnavailable();
        this.f427906a.f427940b = null;
    }
}
