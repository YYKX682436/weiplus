package kr2;

/* loaded from: classes2.dex */
public final class j implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.finder.FinderNPSNativeAPI {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f311311d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.pigeon.finder.FinderNPSFlutterAPI f311312e;

    public j(java.lang.ref.WeakReference delegate) {
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f311311d = delegate;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderNPSNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderNPSNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderNPSNativeAPI.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f311312e = new com.tencent.pigeon.finder.FinderNPSFlutterAPI(binaryMessenger2, null, 2, null);
    }

    @Override // com.tencent.pigeon.finder.FinderNPSNativeAPI
    public void onClickNPS(byte[] questionBuffer, byte[] answerBuffer, java.lang.String inputText, java.util.List mutliAnswerIDs) {
        kotlin.jvm.internal.o.g(questionBuffer, "questionBuffer");
        kotlin.jvm.internal.o.g(answerBuffer, "answerBuffer");
        kotlin.jvm.internal.o.g(inputText, "inputText");
        kotlin.jvm.internal.o.g(mutliAnswerIDs, "mutliAnswerIDs");
        com.tencent.mm.protobuf.f parseFrom = new r45.zk2().parseFrom(questionBuffer);
        kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderNpsSurveyQuestion");
        r45.zk2 zk2Var = (r45.zk2) parseFrom;
        com.tencent.mm.protobuf.f parseFrom2 = new r45.xk2().parseFrom(answerBuffer);
        kotlin.jvm.internal.o.e(parseFrom2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderNpsSurveyAnswer");
        r45.xk2 xk2Var = (r45.xk2) parseFrom2;
        kr2.k kVar = (kr2.k) this.f311311d.get();
        if (kVar != null) {
            kVar.T(zk2Var, xk2Var, inputText, mutliAnswerIDs);
        }
    }

    @Override // com.tencent.pigeon.finder.FinderNPSNativeAPI
    public void onCloseNPS() {
        kr2.k kVar = (kr2.k) this.f311311d.get();
        if (kVar != null) {
            kVar.onCloseNPS();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.FinderNPSNativeAPI.Companion companion = com.tencent.pigeon.finder.FinderNPSNativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.FinderNPSNativeAPI.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f311312e = null;
    }
}
