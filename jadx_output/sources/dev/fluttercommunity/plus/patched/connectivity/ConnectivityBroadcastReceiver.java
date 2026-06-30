package dev.fluttercommunity.plus.patched.connectivity;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ldev/fluttercommunity/plus/patched/connectivity/ConnectivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "flutter_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class ConnectivityBroadcastReceiver extends android.content.BroadcastReceiver implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f229415h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final vy5.a f229416d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f229417e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel.EventSink f229418f;

    /* renamed from: g, reason: collision with root package name */
    public android.net.ConnectivityManager.NetworkCallback f229419g;

    public ConnectivityBroadcastReceiver(android.content.Context context, vy5.a connectivity, kotlinx.coroutines.y0 coroutineScope) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(connectivity, "connectivity");
        kotlin.jvm.internal.o.g(coroutineScope, "coroutineScope");
        this.f229416d = connectivity;
        this.f229417e = coroutineScope;
    }

    public final void a(java.util.List list) {
        kotlinx.coroutines.l.d(this.f229417e, null, null, new vy5.d(list, this, null), 3, null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        android.net.ConnectivityManager.NetworkCallback networkCallback = this.f229419g;
        if (networkCallback != null) {
            android.net.ConnectivityManager connectivityManager = this.f229416d.f441515a;
            kotlin.jvm.internal.o.d(networkCallback);
            connectivityManager.unregisterNetworkCallback(networkCallback);
            this.f229419g = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        this.f229418f = eventSink;
        vy5.b bVar = new vy5.b(this);
        this.f229419g = bVar;
        vy5.a aVar = this.f229416d;
        aVar.f441515a.registerDefaultNetworkCallback(bVar);
        a(aVar.b());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        io.flutter.plugin.common.EventChannel.EventSink eventSink = this.f229418f;
        if (eventSink != null) {
            kotlin.jvm.internal.o.d(eventSink);
            eventSink.success(this.f229416d.b());
        }
    }
}
