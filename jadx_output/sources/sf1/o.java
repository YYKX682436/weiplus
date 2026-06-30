package sf1;

/* loaded from: classes5.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f407005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f407006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sf1.g f407007f;

    public o(kotlin.jvm.internal.h0 h0Var, yz5.a aVar, sf1.g gVar) {
        this.f407005d = h0Var;
        this.f407006e = aVar;
        this.f407007f = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "tryKeepConnectedWifi, timeout");
        this.f407005d.f310123d = null;
        this.f407006e.invoke();
        this.f407007f.b("fail to connect wifi:time out");
    }
}
