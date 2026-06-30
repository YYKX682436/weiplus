package io.flutter.plugins.connectivity.patched;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B\u001f\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "Ljz5/f0;", "sendEvent", "", "arguments", "Lio/flutter/plugin/common/EventChannel$EventSink;", "events", "onListen", "onCancel", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "onReceive", "Landroid/content/Context;", "Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "connectivity", "Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "Lkotlinx/coroutines/y0;", "coroutineScope", "Lkotlinx/coroutines/y0;", "", "TAG", "Ljava/lang/String;", "Lio/flutter/plugin/common/EventChannel$EventSink;", "Landroid/net/ConnectivityManager$NetworkCallback;", "networkCallback", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "(Landroid/content/Context;Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;Lkotlinx/coroutines/y0;)V", "Companion", "flutter-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class PatchedConnectivityBroadcastReceiver extends android.content.BroadcastReceiver implements io.flutter.plugin.common.EventChannel.StreamHandler {
    public static final java.lang.String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    private final java.lang.String TAG;
    private final io.flutter.plugins.connectivity.patched.PatchedConnectivity connectivity;
    private final android.content.Context context;
    private final kotlinx.coroutines.y0 coroutineScope;
    private io.flutter.plugin.common.EventChannel.EventSink events;
    private final android.net.ConnectivityManager.NetworkCallback networkCallback;

    public PatchedConnectivityBroadcastReceiver(android.content.Context context, io.flutter.plugins.connectivity.patched.PatchedConnectivity connectivity, kotlinx.coroutines.y0 coroutineScope) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(connectivity, "connectivity");
        kotlin.jvm.internal.o.g(coroutineScope, "coroutineScope");
        this.context = context;
        this.connectivity = connectivity;
        this.coroutineScope = coroutineScope;
        this.TAG = "MicroMsg.PatchedConnectivityBroadcastReceiver";
        this.networkCallback = new android.net.ConnectivityManager.NetworkCallback() { // from class: io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(android.net.Network network) {
                java.lang.String str;
                kotlin.jvm.internal.o.g(network, "network");
                str = io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.this.TAG;
                com.tencent.mars.xlog.Log.i(str, "onAvailable:" + network);
                io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.this.sendEvent();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(android.net.Network network) {
                java.lang.String str;
                kotlin.jvm.internal.o.g(network, "network");
                str = io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.this.TAG;
                com.tencent.mars.xlog.Log.i(str, "onLost:" + network);
                io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.this.sendEvent();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent() {
        kotlinx.coroutines.l.d(this.coroutineScope, null, null, new io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver$sendEvent$1(this, null), 3, null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        this.connectivity.getConnectivityManager().unregisterNetworkCallback(this.networkCallback);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink events) {
        kotlin.jvm.internal.o.g(events, "events");
        this.events = events;
        this.connectivity.getConnectivityManager().registerDefaultNetworkCallback(this.networkCallback);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        sendEvent();
    }
}
