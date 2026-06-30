package vy5;

/* loaded from: classes11.dex */
public final class g implements io.flutter.plugin.common.EventChannel.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final io.flutter.plugin.common.EventChannel.StreamHandler f441526d;

    public g(io.flutter.plugin.common.EventChannel.StreamHandler impl) {
        kotlin.jvm.internal.o.g(impl, "impl");
        this.f441526d = impl;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(java.lang.Object obj) {
        try {
            this.f441526d.onCancel(obj);
        } catch (java.lang.Throwable th6) {
            io.flutter.Log.e("MicroMsg.PatchedConnectivityPlugin", "onCancel() occurs an exception: " + th6, th6);
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(java.lang.Object obj, io.flutter.plugin.common.EventChannel.EventSink eventSink) {
        try {
            io.flutter.Log.i("MicroMsg.PatchedConnectivityPlugin", "onListen, arguments:" + obj + ", event:" + eventSink);
            this.f441526d.onListen(obj, eventSink);
        } catch (java.lang.Throwable th6) {
            io.flutter.Log.e("MicroMsg.PatchedConnectivityPlugin", "onListen() occurs an exception: " + th6, th6);
        }
    }
}
