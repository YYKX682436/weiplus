package sf1;

/* loaded from: classes5.dex */
public final class p implements rf1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f407008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf1.g f407009b;

    public p(yz5.a aVar, sf1.g gVar) {
        this.f407008a = aVar;
        this.f407009b = gVar;
    }

    @Override // rf1.c
    public void a(rf1.h wiFiItem) {
        kotlin.jvm.internal.o.g(wiFiItem, "wiFiItem");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.WifiConnector29Impl", "tryKeepConnectedWifi, onConnect, wiFiItem: " + wiFiItem);
        this.f407008a.invoke();
        this.f407009b.a();
    }

    @Override // rf1.c
    public void h() {
    }
}
