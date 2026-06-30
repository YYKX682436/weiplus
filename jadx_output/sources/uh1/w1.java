package uh1;

/* loaded from: classes13.dex */
public final class w1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uh1.y1 f427919d;

    public w1(uh1.y1 y1Var) {
        this.f427919d = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long uptimeMillis = this.f427919d.f427944f - android.os.SystemClock.uptimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkProvider", "run#unregisterNetworkCallbackTask, timeToUnregisterMs: " + uptimeMillis);
        if (uptimeMillis > 0) {
            ((ku5.t0) ku5.t0.f312615d).k((java.lang.Runnable) ((jz5.n) this.f427919d.f427945g).getValue(), uptimeMillis);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetworkProvider", "run#unregisterNetworkCallbackTask, unregisterNetworkCallback");
        try {
            ((android.net.ConnectivityManager) ((jz5.n) this.f427919d.f427941c).getValue()).unregisterNetworkCallback((uh1.t1) ((jz5.n) this.f427919d.f427943e).getValue());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetworkProvider", "run#unregisterNetworkCallbackTask, unregisterNetworkCallback fail since " + e17);
        }
        this.f427919d.f427942d.set(false);
        this.f427919d.f427940b = null;
    }
}
