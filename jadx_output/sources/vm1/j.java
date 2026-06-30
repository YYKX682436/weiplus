package vm1;

/* loaded from: classes11.dex */
public final class j implements com.tencent.pigeon.ting.TingFinderActionController, io.flutter.embedding.engine.plugins.FlutterPlugin {
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingFinderActionController.Companion companion = com.tencent.pigeon.ting.TingFinderActionController.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingFinderActionController.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingFinderActionController.Companion companion = com.tencent.pigeon.ting.TingFinderActionController.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingFinderActionController.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // com.tencent.pigeon.ting.TingFinderActionController
    public void onFinderFeedLike(java.lang.String feedId, java.lang.String nonceId, boolean z17, boolean z18, yz5.l callback) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Aj(z17, nonceId, pm0.v.Z(feedId), z18);
    }
}
