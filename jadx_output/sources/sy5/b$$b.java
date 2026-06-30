package sy5;

/* loaded from: classes13.dex */
public final /* synthetic */ class b$$b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver f413898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f413899e;

    public /* synthetic */ b$$b(dev.fluttercommunity.plus.connectivity.ConnectivityBroadcastReceiver connectivityBroadcastReceiver, java.util.List list) {
        this.f413898d = connectivityBroadcastReceiver;
        this.f413899e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f413898d.f229412e.success(this.f413899e);
    }
}
