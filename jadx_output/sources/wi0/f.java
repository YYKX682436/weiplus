package wi0;

/* loaded from: classes4.dex */
public final class f implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.flutter_voip_status.SnsDataSource {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f446143d = kotlinx.coroutines.z0.b();

    @Override // com.tencent.pigeon.flutter_voip_status.SnsDataSource
    public void getImageFile(com.tencent.pigeon.flutter_voip_status.GetSnsImageFileRequest request, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlinx.coroutines.l.d(this.f446143d, null, null, new wi0.d(request, callback, null), 3, null);
    }

    @Override // com.tencent.pigeon.flutter_voip_status.SnsDataSource
    public void getLatestSns(com.tencent.pigeon.flutter_voip_status.GetSnsRequest request, yz5.l callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String username = request.getUsername();
        long timeLimit = request.getTimeLimit();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterPluginSnsDataSource", "getLatestSns(" + username + "), timeLimit:" + timeLimit);
        xi0.f fVar = new xi0.f(username);
        wi0.e eVar = new wi0.e(callback);
        fVar.f454684f = timeLimit;
        fVar.f454685g = eVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getLatestSnsInfo username:");
        java.lang.String str = fVar.f454682d;
        sb6.append(str);
        sb6.append(", timeLimit:");
        sb6.append(timeLimit);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsDataSource", sb6.toString());
        if (ui0.a.a(str)) {
            yz5.l lVar = fVar.f454685g;
            if (lVar != null) {
                lVar.invoke(new com.tencent.mm.flutter.plugin.proto.e());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsDataSource", "do not show sns cause in black list!");
            return;
        }
        gm0.j1.n().f273288b.a(212, fVar);
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        java.lang.String str2 = fVar.f454682d;
        boolean z17 = fVar.f454683e;
        r1Var.g(new com.tencent.mm.plugin.sns.model.n3(str2, 0L, z17, 0, -1, 0, z17 ? 4 : 8, 2));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.flutter_voip_status.SnsDataSource.Companion companion = com.tencent.pigeon.flutter_voip_status.SnsDataSource.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_voip_status.SnsDataSource.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        kotlinx.coroutines.z0.e(this.f446143d, null, 1, null);
    }
}
