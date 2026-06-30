package u7;

/* loaded from: classes13.dex */
public class m extends java.net.ProxySelector {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f425067d = java.util.Arrays.asList(java.net.Proxy.NO_PROXY);

    /* renamed from: a, reason: collision with root package name */
    public final java.net.ProxySelector f425068a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f425069b;

    /* renamed from: c, reason: collision with root package name */
    public final int f425070c;

    public m(java.net.ProxySelector proxySelector, java.lang.String str, int i17) {
        proxySelector.getClass();
        this.f425068a = proxySelector;
        str.getClass();
        this.f425069b = str;
        this.f425070c = i17;
    }

    @Override // java.net.ProxySelector
    public void connectFailed(java.net.URI uri, java.net.SocketAddress socketAddress, java.io.IOException iOException) {
        this.f425068a.connectFailed(uri, socketAddress, iOException);
    }

    @Override // java.net.ProxySelector
    public java.util.List select(java.net.URI uri) {
        return this.f425069b.equals(uri.getHost()) && this.f425070c == uri.getPort() ? f425067d : this.f425068a.select(uri);
    }
}
