package sf1;

/* loaded from: classes13.dex */
public final class l extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf1.m f406997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f406998f;

    public l(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3, kotlin.jvm.internal.h0 h0Var4, sf1.m mVar, android.net.ConnectivityManager connectivityManager, long j17) {
        this.f406993a = h0Var;
        this.f406994b = h0Var2;
        this.f406995c = h0Var3;
        this.f406996d = h0Var4;
        this.f406997e = mVar;
        this.f406998f = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        super.onAvailable(network);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onAvailable, network: " + network);
        wu5.c cVar = (wu5.c) this.f406993a.f310123d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        wu5.c cVar2 = (wu5.c) this.f406994b.f310123d;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        wu5.c cVar3 = (wu5.c) this.f406995c.f310123d;
        if (cVar3 != null) {
            cVar3.cancel(true);
        }
        rf1.d.c((rf1.c) this.f406996d.f310123d);
        this.f406997e.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onAvailable, success: " + this.f406998f.bindProcessToNetwork(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        super.onLost(network);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onLost, network: " + network);
        this.f406995c.f310123d = ((ku5.t0) ku5.t0.f312615d).k(new sf1.j(network, this.f406993a, this.f406996d, this.f406997e, this.f406998f, this), 3000L);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        super.onUnavailable();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onUnavailable");
        this.f406994b.f310123d = ((ku5.t0) ku5.t0.f312615d).k(new sf1.k(this.f406993a, this.f406996d, this.f406998f, this, this.f406997e), 3000L);
    }
}
