package md2;

/* loaded from: classes8.dex */
public final class h implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.live_multiplatform.LiveHybridRecentWatchNativeApi {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f325847d;

    public h(android.content.Context context, gk2.e eVar) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f325847d = context;
    }

    @Override // com.tencent.pigeon.live_multiplatform.LiveHybridRecentWatchNativeApi
    public void modLivePersonalCenterRecentWatchOptions(long j17, java.util.List list, yz5.l callback) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(callback, "callback");
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.q0((java.lang.String) it.next(), 0L)));
            }
            linkedList = new java.util.LinkedList();
            kz5.n0.O0(arrayList, linkedList);
        } else {
            linkedList = new java.util.LinkedList();
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        md2.g gVar = new md2.g(j17, this, callback);
        hb2.h hVar = hb2.h.f280047e;
        hVar.getClass();
        bw5.br brVar = new bw5.br();
        brVar.f25797d = (int) j17;
        boolean[] zArr = brVar.f25799f;
        zArr[1] = true;
        brVar.f25798e = linkedList;
        zArr[2] = true;
        com.tencent.mars.xlog.Log.i(hb2.h.f280048f, "modifyPlayHistorySet op_type:" + brVar.f25797d);
        hb2.w0.m(hVar, brVar, gVar, false, false, null, null, 60, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.live_multiplatform.LiveHybridRecentWatchNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.LiveHybridRecentWatchNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.LiveHybridRecentWatchNativeApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.live_multiplatform.LiveHybridRecentWatchNativeApi.Companion companion = com.tencent.pigeon.live_multiplatform.LiveHybridRecentWatchNativeApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.live_multiplatform.LiveHybridRecentWatchNativeApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
    }
}
