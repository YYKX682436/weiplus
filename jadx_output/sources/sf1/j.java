package sf1;

/* loaded from: classes13.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.Network f406982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf1.m f406985g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f406986h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf1.l f406987i;

    public j(android.net.Network network, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, sf1.m mVar, android.net.ConnectivityManager connectivityManager, sf1.l lVar) {
        this.f406982d = network;
        this.f406983e = h0Var;
        this.f406984f = h0Var2;
        this.f406985g = mVar;
        this.f406986h = connectivityManager;
        this.f406987i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onLost, network: " + this.f406982d + ", timeout");
        wu5.c cVar = (wu5.c) this.f406983e.f310123d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        rf1.d.c((rf1.c) this.f406984f.f310123d);
        sf1.g.c(this.f406985g, null, 1, null);
        android.net.ConnectivityManager connectivityManager = this.f406986h;
        connectivityManager.bindProcessToNetwork(null);
        connectivityManager.unregisterNetworkCallback(this.f406987i);
    }
}
