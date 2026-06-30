package po5;

/* loaded from: classes13.dex */
public final class e extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ po5.i f357350a;

    public e(po5.i iVar) {
        this.f357350a = iVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        po5.i.b(this.f357350a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        kotlin.jvm.internal.o.g(network, "network");
        kotlin.jvm.internal.o.g(networkCapabilities, "networkCapabilities");
        po5.i.b(this.f357350a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        po5.i.b(this.f357350a);
    }
}
