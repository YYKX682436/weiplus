package sf1;

/* loaded from: classes13.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406977e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f406978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f406979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sf1.l f406980h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sf1.m f406981i;

    public i(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3, android.net.ConnectivityManager connectivityManager, sf1.l lVar, sf1.m mVar) {
        this.f406976d = h0Var;
        this.f406977e = h0Var2;
        this.f406978f = h0Var3;
        this.f406979g = connectivityManager;
        this.f406980h = lVar;
        this.f406981i = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "timeout");
        wu5.c cVar = (wu5.c) this.f406976d.f310123d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        wu5.c cVar2 = (wu5.c) this.f406977e.f310123d;
        if (cVar2 != null) {
            cVar2.cancel(true);
        }
        rf1.d.c((rf1.c) this.f406978f.f310123d);
        this.f406979g.unregisterNetworkCallback(this.f406980h);
        this.f406981i.b("fail to connect wifi:time out");
    }
}
