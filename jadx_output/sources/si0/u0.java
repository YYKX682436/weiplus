package si0;

/* loaded from: classes11.dex */
public final class u0 implements com.tencent.pigeon.sns.PlatformSnsStrangerNicknameApi, io.flutter.embedding.engine.plugins.FlutterPlugin {
    @Override // com.tencent.pigeon.sns.PlatformSnsStrangerNicknameApi
    public void getStrangerNickname(java.lang.String username, yz5.l callback) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.sdk.platformtools.o4 o4Var = ri0.a.f396021a;
        boolean z17 = true;
        java.lang.String string = username.length() > 0 ? ri0.a.f396021a.getString("nickname_".concat(username), null) : null;
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(string)));
        } else {
            com.tencent.mars.xlog.Log.i("MircroMsg.PlatformSnsStrangerNicknamePlugin", "get nickname fail, return username instead");
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(username)));
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MircroMsg.PlatformSnsStrangerNicknamePlugin", "[" + hashCode() + "]onAttachedToEngine");
        com.tencent.pigeon.sns.PlatformSnsStrangerNicknameApi.Companion companion = com.tencent.pigeon.sns.PlatformSnsStrangerNicknameApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsStrangerNicknameApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MircroMsg.PlatformSnsStrangerNicknamePlugin", "[" + hashCode() + "]onDetachedFromEngine");
        com.tencent.pigeon.sns.PlatformSnsStrangerNicknameApi.Companion companion = com.tencent.pigeon.sns.PlatformSnsStrangerNicknameApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.sns.PlatformSnsStrangerNicknameApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }
}
