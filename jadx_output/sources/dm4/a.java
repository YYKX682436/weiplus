package dm4;

/* loaded from: classes11.dex */
public final class a implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.ting.TingAddItemsToListNotify {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f241753d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241754e;

    public a(yz5.p callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f241753d = callback;
    }

    @Override // com.tencent.pigeon.ting.TingAddItemsToListNotify
    public void onAddItemsSuccess() {
        if (this.f241754e) {
            return;
        }
        this.f241754e = true;
        this.f241753d.invoke(null, java.lang.Boolean.FALSE);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingAddItemsToListNotify.Companion companion = com.tencent.pigeon.ting.TingAddItemsToListNotify.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingAddItemsToListNotify.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.pigeon.ting.TingAddItemsToListNotify.Companion companion = com.tencent.pigeon.ting.TingAddItemsToListNotify.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = p07.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingAddItemsToListNotify.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        if (this.f241754e) {
            return;
        }
        this.f241754e = true;
        this.f241753d.invoke(null, java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.pigeon.ting.TingAddItemsToListNotify
    public void onPickListSuccess(byte[] albumData) {
        kotlin.jvm.internal.o.g(albumData, "albumData");
        if (this.f241754e) {
            return;
        }
        this.f241754e = true;
        this.f241753d.invoke(new bw5.o50().parseFrom(albumData), java.lang.Boolean.FALSE);
    }
}
