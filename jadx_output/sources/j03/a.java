package j03;

/* loaded from: classes10.dex */
public final class a implements com.tencent.pigeon.mm_foundation.FlutterFileHost, io.flutter.embedding.engine.plugins.FlutterPlugin {
    @Override // com.tencent.pigeon.mm_foundation.FlutterFileHost
    public void createDirectory(java.lang.String path, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!com.tencent.mm.vfs.w6.u(path)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Unable to create directory: ".concat(path))))));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(path, true);
            kotlin.jvm.internal.o.d(i17);
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(i17)));
        }
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterFileHost
    public void createFile(java.lang.String path, yz5.l callback) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (!com.tencent.mm.vfs.w6.e(path)) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.IllegalStateException("Unable to create file: ".concat(path))))));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            java.lang.String i17 = com.tencent.mm.vfs.w6.i(path, true);
            kotlin.jvm.internal.o.d(i17);
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(i17)));
        }
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterFileHost
    public java.lang.String getDefaultImageCacheDirectory() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("flutter/cached_images_default"), false);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterFilePlugin", "getDefaultImageCacheDirectory: " + i17 + ' ' + com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir().getAbsolutePath());
        if (i17 != null) {
            return i17;
        }
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getCacheDir().getAbsolutePath() + "/flutter/cached_images_default";
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterFileHost
    public java.lang.String getGeneralCacheDirectory() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("flutter_temp"), false);
        kotlin.jvm.internal.o.d(i17);
        return i17;
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterFileHost
    public java.lang.String getMemoryDirectory() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c("flutter_snapshot"), true);
        kotlin.jvm.internal.o.d(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterFilePlugin", "getMemoryDirectory: ".concat(i17));
        return i17;
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterFileHost
    public java.lang.String getRealPath(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(path, true);
        kotlin.jvm.internal.o.d(i17);
        return i17;
    }

    @Override // com.tencent.pigeon.mm_foundation.FlutterFileHost
    public java.lang.String getStreamProfilerDirectory(boolean z17) {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(com.tencent.mm.vfs.q7.c(z17 ? "flutterPrivate/profiler" : "flutter/profiler"), true);
        kotlin.jvm.internal.o.d(i17);
        return i17;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.FlutterFileHost.Companion companion = com.tencent.pigeon.mm_foundation.FlutterFileHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterFileHost.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.mm_foundation.FlutterFileHost.Companion companion = com.tencent.pigeon.mm_foundation.FlutterFileHost.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.mm_foundation.FlutterFileHost.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }
}
