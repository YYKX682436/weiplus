package com.tencent.mm.sdk.platformtools;

/* loaded from: classes11.dex */
public final class u7 extends android.net.ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f193022a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f193023b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.a f193024c;

    public u7(android.content.Context context, yz5.l onIPCallback, yz5.a onFinish, int i17, kotlin.jvm.internal.i iVar) {
        onFinish = (i17 & 4) != 0 ? com.tencent.mm.sdk.platformtools.t7.f192988d : onFinish;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(onIPCallback, "onIPCallback");
        kotlin.jvm.internal.o.g(onFinish, "onFinish");
        this.f193022a = context;
        this.f193023b = onIPCallback;
        this.f193024c = onFinish;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(android.net.Network network) {
        kotlin.jvm.internal.o.g(network, "network");
        super.onAvailable(network);
        java.lang.Object systemService = this.f193022a.getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        android.net.LinkProperties linkProperties = ((android.net.ConnectivityManager) systemService).getLinkProperties(network);
        if (linkProperties != null) {
            java.util.List<android.net.LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
            kotlin.jvm.internal.o.f(linkAddresses, "getLinkAddresses(...)");
            java.util.Iterator<android.net.LinkAddress> it = linkAddresses.iterator();
            while (it.hasNext()) {
                java.lang.String hostAddress = it.next().getAddress().getHostAddress();
                com.tencent.mars.xlog.Log.i("MicroMsg.SimCardUtil", hashCode() + " onAvailable: " + hostAddress);
                if (hostAddress != null) {
                    this.f193023b.invoke(hostAddress);
                }
            }
        }
        this.f193024c.invoke();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        super.onUnavailable();
        this.f193024c.invoke();
    }
}
