package sf1;

/* loaded from: classes5.dex */
public final class m implements sf1.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f406999a = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf1.g f407000b;

    public m(sf1.g gVar) {
        this.f407000b = gVar;
    }

    @Override // sf1.g
    public void a() {
        if (this.f406999a.compareAndSet(false, true)) {
            this.f407000b.a();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectSuccess, already call");
        }
    }

    @Override // sf1.g
    public void b(java.lang.String str) {
        if (this.f406999a.compareAndSet(false, true)) {
            this.f407000b.b(str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "onConnectFailure, already call");
        }
    }
}
