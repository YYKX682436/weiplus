package md2;

/* loaded from: classes10.dex */
public final class c implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f325832g;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f325833d;

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f325834e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f325835f;

    public c(android.content.Context context, gk2.e buContext) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f325833d = context;
        this.f325834e = buContext;
        this.f325835f = "LiveBlueGiftFlutterPlugin";
    }

    @Override // com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi
    public void fetchBlueGiftCreate(java.lang.String orderID, com.tencent.pigeon.live_multiplatform.LiveMultiplatformTaskID taskID, yz5.l callback) {
        kotlin.jvm.internal.o.g(orderID, "orderID");
        kotlin.jvm.internal.o.g(taskID, "taskID");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f325835f, "[fetchBlueGiftCreate] orderID = ".concat(orderID));
        kotlinx.coroutines.l.d(this.f325834e.f272475i, null, null, new md2.a(this, orderID, callback, null), 3, null);
    }

    @Override // com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi
    public void notifyOnSuccess(byte[] prizeConfigItemPBData) {
        kotlin.jvm.internal.o.g(prizeConfigItemPBData, "prizeConfigItemPBData");
        com.tencent.mars.xlog.Log.i(this.f325835f, "[notifyOnSuccess] data size = " + prizeConfigItemPBData.length);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f325835f, "onAttachedToEngine");
        com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i(this.f325835f, "onDetachedFromEngine");
        com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }

    @Override // com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi
    public void rememberHaveSignedGiveBlueGiftUserAgreement(com.tencent.pigeon.live_multiplatform.LiveMultiplatformTaskID taskID) {
        kotlin.jvm.internal.o.g(taskID, "taskID");
        f325832g = true;
    }

    @Override // com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi
    public void sendBlueGift(java.lang.String itemID, com.tencent.pigeon.live_multiplatform.LiveMultiplatformTaskID taskID, yz5.l callback) {
        kotlin.jvm.internal.o.g(itemID, "itemID");
        kotlin.jvm.internal.o.g(taskID, "taskID");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mars.xlog.Log.i(this.f325835f, "[sendBlueGift] itemID = ".concat(itemID));
        kotlinx.coroutines.l.d(this.f325834e.f272475i, null, null, new md2.b(this, itemID, callback, null), 3, null);
    }

    @Override // com.tencent.pigeon.live_multiplatform.LiveHybridBlueGiftNativeApi
    public void showSendPrizesHistory(com.tencent.pigeon.live_multiplatform.LiveMultiplatformTaskID taskID) {
        kotlin.jvm.internal.o.g(taskID, "taskID");
        com.tencent.mars.xlog.Log.i(this.f325835f, "[showSendPrizesHistory] ");
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Oj(this.f325833d, null, true);
    }
}
