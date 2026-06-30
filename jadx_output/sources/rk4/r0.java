package rk4;

/* loaded from: classes7.dex */
public final class r0 implements com.tencent.pigeon.ting.ImageDownloaderApi, io.flutter.embedding.engine.plugins.FlutterPlugin {
    @Override // com.tencent.pigeon.ting.ImageDownloaderApi
    public void downloadImage(java.lang.String url, yz5.l callback) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(callback, "callback");
        cl4.j jVar = cl4.j.f42950a;
        rk4.q0 q0Var = new rk4.q0(callback);
        int abs = java.lang.Math.abs(url.hashCode() % 5);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingDownloadHelper", "download threadId=" + abs);
        ku5.u0 u0Var = ku5.t0.f312615d;
        ((ku5.t0) u0Var).h(new cl4.i(url, q0Var), "TingDownload-" + abs);
    }

    @Override // com.tencent.pigeon.ting.ImageDownloaderApi
    public java.lang.String getTingCacheDirectory() {
        cl4.j jVar = cl4.j.f42950a;
        java.lang.String str = cl4.j.f42951b;
        kotlin.jvm.internal.o.f(str, "<get-saveDir>(...)");
        return str;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.ImageDownloaderApi.Companion companion = com.tencent.pigeon.ting.ImageDownloaderApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.ImageDownloaderApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.ImageDownloaderApi.Companion companion = com.tencent.pigeon.ting.ImageDownloaderApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.ImageDownloaderApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }
}
