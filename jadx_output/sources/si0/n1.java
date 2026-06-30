package si0;

/* loaded from: classes11.dex */
public final class n1 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.sns.PlatformPathApi {
    @Override // com.tencent.pigeon.sns.PlatformPathApi
    public java.lang.String getCachePath() {
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("sns_aff_cache");
        kotlin.jvm.internal.o.f(c17, "getMainPath(...)");
        return c17;
    }

    @Override // com.tencent.pigeon.sns.PlatformPathApi
    public java.lang.String getMediaPath() {
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("sns_aff_media");
        kotlin.jvm.internal.o.f(c17, "getMainPath(...)");
        return c17;
    }

    @Override // com.tencent.pigeon.sns.PlatformPathApi
    public java.lang.String getPublishPath() {
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("sns_aff_publish");
        kotlin.jvm.internal.o.f(c17, "getMainPath(...)");
        return c17;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformPathApi.Companion companion = com.tencent.pigeon.sns.PlatformPathApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformPathApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.sns.PlatformPathApi.Companion companion = com.tencent.pigeon.sns.PlatformPathApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformPathApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }
}
