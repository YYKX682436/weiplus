package sf1;

/* loaded from: classes13.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f406990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf1.l f406991g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf1.m f406992h;

    public k(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, android.net.ConnectivityManager connectivityManager, sf1.l lVar, sf1.m mVar) {
        this.f406988d = h0Var;
        this.f406989e = h0Var2;
        this.f406990f = connectivityManager;
        this.f406991g = lVar;
        this.f406992h = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onUnavailable, timeout");
        wu5.c cVar = (wu5.c) this.f406988d.f310123d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        rf1.d.c((rf1.c) this.f406989e.f310123d);
        this.f406990f.unregisterNetworkCallback(this.f406991g);
        sf1.g.c(this.f406992h, null, 1, null);
    }
}
