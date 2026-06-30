package io.flutter.plugins.connectivity.patched;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivityPlugin;", "Lio/flutter/embedding/engine/plugins/FlutterPlugin;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Ljz5/f0;", "teardownChannels", "Lio/flutter/embedding/engine/plugins/FlutterPlugin$FlutterPluginBinding;", "binding", "onAttachedToEngine", "onDetachedFromEngine", "Lio/flutter/plugin/common/MethodCall;", "call", "Lio/flutter/plugin/common/MethodChannel$Result;", "result", "onMethodCall", "Lio/flutter/plugin/common/MethodChannel;", "methodChannel", "Lio/flutter/plugin/common/MethodChannel;", "Lio/flutter/plugin/common/EventChannel;", "eventChannel", "Lio/flutter/plugin/common/EventChannel;", "Lkotlinx/coroutines/y0;", "coroutineScope", "Lkotlinx/coroutines/y0;", "Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "connectivity", "Lio/flutter/plugins/connectivity/patched/PatchedConnectivity;", "<init>", "()V", "Companion", "SafeStreamHandler", "flutter-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class PatchedConnectivityPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugin.common.MethodChannel.MethodCallHandler {
    private static final java.lang.String TAG = "MicroMsg.PatchedConnectivityPlugin";
    private io.flutter.plugins.connectivity.patched.PatchedConnectivity connectivity;
    private kotlinx.coroutines.y0 coroutineScope = kotlinx.coroutines.z0.a(oz5.m.f350329d);
    private io.flutter.plugin.common.EventChannel eventChannel;
    private io.flutter.plugin.common.MethodChannel methodChannel;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lio/flutter/plugins/connectivity/patched/PatchedConnectivityPlugin$SafeStreamHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "", "arguments", "Lio/flutter/plugin/common/EventChannel$EventSink;", "events", "Ljz5/f0;", "onListen", "onCancel", "impl", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "<init>", "(Lio/flutter/plugin/common/EventChannel$StreamHandler;)V", "flutter-lib_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final class SafeStreamHandler implements io.flutter.plugin.common.EventChannel.StreamHandler {
        private final io.flutter.plugin.common.EventChannel.StreamHandler impl;

        public SafeStreamHandler(io.flutter.plugin.common.EventChannel.StreamHandler impl) {
            kotlin.jvm.internal.o.g(impl, "impl");
            this.impl = impl;
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(java.lang.Object obj) {
            try {
                this.impl.onCancel(obj);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin.TAG, th6, "onCancel() occurs an exception: " + th6, new java.lang.Object[0]);
            }
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
            try {
                com.tencent.mars.xlog.Log.i(io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin.TAG, "onListen, arguments:" + obj + ", event:" + eventSink);
                this.impl.onListen(obj, eventSink);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin.TAG, th6, "onListen() occurs an exception: " + th6, new java.lang.Object[0]);
            }
        }
    }

    private final void teardownChannels() {
        io.flutter.plugin.common.MethodChannel methodChannel = this.methodChannel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        io.flutter.plugin.common.EventChannel eventChannel = this.eventChannel;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        this.methodChannel = null;
        this.eventChannel = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        java.lang.Object systemService = binding.getApplicationContext().getSystemService("connectivity");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivity = new io.flutter.plugins.connectivity.patched.PatchedConnectivity((android.net.ConnectivityManager) systemService);
        this.coroutineScope = kotlinx.coroutines.z0.b();
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binding.getBinaryMessenger(), "plugins.flutter.io/connectivity");
        methodChannel.setMethodCallHandler(this);
        this.methodChannel = methodChannel;
        io.flutter.plugin.common.EventChannel eventChannel = new io.flutter.plugin.common.EventChannel(binding.getBinaryMessenger(), "plugins.flutter.io/connectivity_status");
        android.content.Context applicationContext = binding.getApplicationContext();
        kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
        io.flutter.plugins.connectivity.patched.PatchedConnectivity patchedConnectivity = this.connectivity;
        kotlin.jvm.internal.o.d(patchedConnectivity);
        eventChannel.setStreamHandler(new io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin.SafeStreamHandler(new io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver(applicationContext, patchedConnectivity, this.coroutineScope)));
        this.eventChannel = eventChannel;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        kotlinx.coroutines.z0.e(this.coroutineScope, null, 1, null);
        teardownChannels();
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        kotlinx.coroutines.y0 y0Var = this.coroutineScope;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h, null, new io.flutter.plugins.connectivity.patched.PatchedConnectivityPlugin$onMethodCall$1(call, result, this, null), 2, null);
    }
}
