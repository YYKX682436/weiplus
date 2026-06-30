package rk4;

/* loaded from: classes11.dex */
public final class q3 implements com.tencent.pigeon.ting.TingMVTextureApi, io.flutter.embedding.engine.plugins.FlutterPlugin {

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.view.TextureRegistry f396930g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.pigeon.ting.TingMVTextureUpdateListenerApi f396931h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f396932i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f396927d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f396928e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f396929f = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f396933m = "MicroMsg.FlutterTingMVTexturePlugin@" + hashCode();

    @Override // com.tencent.pigeon.ting.TingMVTextureApi
    public void dispose(java.lang.String taskId, java.lang.String listendId) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(listendId, "listendId");
        java.lang.String str = taskId + '_' + listendId;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dispose plugin:");
        sb6.append(hashCode());
        sb6.append(", task:");
        sb6.append(taskId);
        sb6.append(", listenId:");
        sb6.append(listendId);
        sb6.append(", hasTexture:");
        java.util.HashMap hashMap = this.f396927d;
        sb6.append(hashMap.containsKey(str));
        sb6.append(", hasTextureInfo:");
        java.util.HashMap hashMap2 = this.f396928e;
        sb6.append(hashMap2.containsKey(str));
        sb6.append(", hasCallback:");
        java.util.HashMap hashMap3 = this.f396929f;
        sb6.append(hashMap3.containsKey(str));
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f396933m;
        rk4.k5.e(sb7, str2);
        yz5.l lVar = (yz5.l) hashMap3.get(str);
        ll4.c d17 = zk4.l.f473538a.d(taskId);
        jz5.f0 f0Var = null;
        if (d17 != null) {
            boolean z17 = lVar != null && kotlin.jvm.internal.o.b(d17.a(), lVar);
            rk4.k5.e("dispose: videoHandler found, isOwnCallback=" + z17 + ", plugin:" + hashCode(), str2);
            if (z17) {
                rk4.k5.e("dispose: clearing onPrepared & surface (callback belongs to this plugin:" + hashCode() + ')', str2);
                d17.p(null);
                d17.setSurface(null);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            rk4.k5.e("dispose: videoHandler is null for taskId=".concat(taskId), str2);
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = (io.flutter.view.TextureRegistry.SurfaceProducer) hashMap.remove(str);
        if (surfaceProducer != null) {
            rk4.k5.e("dispose: releasing SurfaceProducer for key=" + str + ", plugin:" + surfaceProducer.hashCode(), str2);
            surfaceProducer.release();
        }
        hashMap2.remove(str);
        hashMap3.remove(str);
    }

    @Override // com.tencent.pigeon.ting.TingMVTextureApi
    public com.tencent.pigeon.ting.TingTextureInfo getTexture(java.lang.String taskId, java.lang.String listendId) {
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(listendId, "listendId");
        java.lang.String str = taskId + '_' + listendId;
        this.f396932i = taskId;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getTexture plugin:");
        sb6.append(hashCode());
        sb6.append(", task:");
        sb6.append(taskId);
        sb6.append(", listenId:");
        sb6.append(listendId);
        sb6.append(", textureMapKeys:");
        sb6.append(this.f396927d.keySet());
        sb6.append(", textureInfoMapKeys:");
        java.util.HashMap hashMap = this.f396928e;
        sb6.append(hashMap.keySet());
        sb6.append(", preparedCallbackMapKeys:");
        java.util.HashMap hashMap2 = this.f396929f;
        sb6.append(hashMap2.keySet());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f396933m;
        rk4.k5.e(sb7, str2);
        com.tencent.pigeon.ting.TingTextureInfo tingTextureInfo = hashMap.containsKey(str) ? (com.tencent.pigeon.ting.TingTextureInfo) hashMap.get(str) : null;
        if (tingTextureInfo != null) {
            rk4.k5.e("existed TextureInfo id:" + tingTextureInfo.getTextureId() + ", width:" + tingTextureInfo.getTextureWidth() + ", height:" + tingTextureInfo.getTextureHeight(), str2);
        }
        ll4.c d17 = zk4.l.f473538a.d(taskId);
        if (d17 == null) {
            rk4.k5.e("getTexture: videoHandler is null for taskId=" + taskId + ", playerCore may not be created yet. Will return cached textureInfo=" + tingTextureInfo, str2);
        }
        if (d17 != null) {
            rk4.o3 o3Var = new rk4.o3(this, taskId, listendId, new rk4.p3(this, str));
            hashMap2.put(str, o3Var);
            yz5.l a17 = d17.a();
            boolean z17 = a17 == null || hashMap2.containsValue(a17);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("setOnPrepared: plugin:");
            sb8.append(d17.hashCode());
            sb8.append(", videoHandler:");
            sb8.append(d17);
            sb8.append(", existingCallback=");
            sb8.append(a17 != null);
            sb8.append(", isOwnCallback=");
            sb8.append(z17);
            sb8.append(", preparedCallbackCount:");
            sb8.append(hashMap2.size());
            sb8.append(", will set unconditionally");
            rk4.k5.e(sb8.toString(), str2);
            d17.p(o3Var);
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("getTexture result: plugin:");
        sb9.append(hashCode());
        sb9.append(", returning textureInfo=");
        sb9.append(tingTextureInfo != null);
        sb9.append(", textureId=");
        sb9.append(tingTextureInfo != null ? tingTextureInfo.getTextureId() : null);
        rk4.k5.e(sb9.toString(), str2);
        return tingTextureInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.o.g(flutterPluginBinding, "flutterPluginBinding");
        rk4.k5.e("onAttachedToEngine plugin:" + hashCode(), this.f396933m);
        com.tencent.pigeon.ting.TingMVTextureApi.Companion companion = com.tencent.pigeon.ting.TingMVTextureApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.ting.TingMVTextureApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        this.f396930g = flutterPluginBinding.getTextureRegistry();
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = flutterPluginBinding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f396931h = new com.tencent.pigeon.ting.TingMVTextureUpdateListenerApi(binaryMessenger2, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0133  */
    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding r12) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.q3.onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding):void");
    }
}
