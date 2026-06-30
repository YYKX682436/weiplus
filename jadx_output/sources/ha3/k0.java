package ha3;

/* loaded from: classes15.dex */
public final class k0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.embedding.engine.plugins.activity.ActivityAware, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f279891d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding f279892e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f279893f = new java.util.concurrent.ConcurrentHashMap();

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onAttachedToActivity");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onAttachedToEngine");
        this.f279892e = binding;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(binding.getBinaryMessenger(), "com.tencent.mm.flutter/liteappVideoPlayer");
        this.f279891d = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onDetachedFromActivity");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onDetachedFromActivityForConfigChanges");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onDetachedFromEngine");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f279893f;
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            long longValue = ((java.lang.Number) entry.getKey()).longValue();
            ha3.a aVar = (ha3.a) entry.getValue();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "dispose player, textureId: " + longValue + ", player: " + aVar);
            aVar.k();
        }
        concurrentHashMap.clear();
        io.flutter.plugin.common.MethodChannel methodChannel = this.f279891d;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f279891d = null;
        this.f279892e = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:125:0x025e. Please report as an issue. */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall call, io.flutter.plugin.common.MethodChannel.Result result) {
        java.lang.String str;
        ha3.a d0Var;
        boolean z17;
        int integer;
        kotlin.jvm.internal.o.g(call, "call");
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String str2 = call.method;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f279893f;
        boolean z18 = false;
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1352294148) {
                if (hashCode != -318476791) {
                    if (hashCode == 3237136 && str2.equals(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT)) {
                        java.util.Collection values = concurrentHashMap.values();
                        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                        java.util.Iterator it = values.iterator();
                        while (it.hasNext()) {
                            ((ha3.a) it.next()).k();
                        }
                        return;
                    }
                } else if (str2.equals("preload")) {
                    java.lang.String str3 = (java.lang.String) call.argument("url");
                    java.lang.Integer num = (java.lang.Integer) call.argument("ratio");
                    if (num == null) {
                        num = 30;
                    }
                    int intValue = num.intValue();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        ha3.i0 i0Var = ha3.j0.f279886a;
                        ha3.j0.f279887b.d(str3, intValue);
                    }
                    result.success(null);
                    return;
                }
            } else if (str2.equals("create")) {
                java.lang.String str4 = (java.lang.String) call.argument("asset");
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = (java.lang.String) call.argument("uri");
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.String str6 = (java.lang.String) call.argument("referer");
                java.lang.String str7 = str6 == null ? "" : str6;
                java.lang.Boolean bool = (java.lang.Boolean) call.argument("isLive");
                if (bool == null) {
                    bool = java.lang.Boolean.FALSE;
                }
                boolean booleanValue = bool.booleanValue();
                java.lang.Boolean bool2 = (java.lang.Boolean) call.argument("isHDR");
                if (bool2 == null) {
                    bool2 = java.lang.Boolean.FALSE;
                }
                bool2.booleanValue();
                boolean z19 = str4.length() > 0;
                java.lang.String str8 = (java.lang.String) call.argument("cacheKey");
                java.lang.String str9 = str8 == null ? "" : str8;
                java.lang.Integer num2 = (java.lang.Integer) call.argument("width");
                if (num2 == null) {
                    num2 = r9;
                }
                int intValue2 = num2.intValue();
                java.lang.Integer num3 = (java.lang.Integer) call.argument("height");
                int intValue3 = (num3 != null ? num3 : 0).intValue();
                if (str4.length() > 0) {
                    str = str4;
                } else {
                    str = str5.length() > 0 ? str5 : "";
                }
                if (!(str.length() > 0)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppVideoPlayerPlugin", "dataSource is error.");
                    result.notImplemented();
                    return;
                }
                io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.f279892e;
                kotlin.jvm.internal.o.d(flutterPluginBinding);
                io.flutter.view.TextureRegistry.SurfaceProducer createSurfaceProducer = flutterPluginBinding.getTextureRegistry().createSurfaceProducer();
                kotlin.jvm.internal.o.f(createSurfaceProducer, "createSurfaceProducer(...)");
                long id6 = createSurfaceProducer.id();
                io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding2 = this.f279892e;
                kotlin.jvm.internal.o.d(flutterPluginBinding2);
                io.flutter.plugin.common.EventChannel eventChannel = new io.flutter.plugin.common.EventChannel(flutterPluginBinding2.getBinaryMessenger(), "com.tencent.mm.flutter/videoPlayer/liteappVideoEvents" + id6);
                io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding3 = this.f279892e;
                kotlin.jvm.internal.o.d(flutterPluginBinding3);
                android.content.Context applicationContext = flutterPluginBinding3.getApplicationContext();
                kotlin.jvm.internal.o.f(applicationContext, "getApplicationContext(...)");
                if (r26.i0.y(str, "preview://", false)) {
                    d0Var = new ha3.v(applicationContext, str, str9, booleanValue, str7, intValue2, intValue3, createSurfaceProducer, eventChannel);
                } else {
                    if (z19) {
                        gp.c cVar = new gp.c();
                        cVar.k(str);
                        int d17 = cVar.d();
                        int i17 = 0;
                        while (i17 < d17) {
                            android.media.MediaFormat e17 = cVar.e(i17);
                            kotlin.jvm.internal.o.f(e17, "getTrackFormat(...)");
                            java.lang.String string = e17.getString("mime");
                            if (string != null && r26.i0.y(string, "video/", z18) && ((e17.containsKey("color-transfer") && ((integer = e17.getInteger("color-transfer")) == 6 || integer == 7)) || (e17.containsKey("color-standard") && e17.getInteger("color-standard") == 6))) {
                                z17 = true;
                                break;
                            } else {
                                i17++;
                                z18 = false;
                            }
                        }
                        z17 = false;
                        if (z17) {
                            d0Var = new ha3.g(applicationContext, str, str9, booleanValue, str7, intValue2, intValue3, createSurfaceProducer, eventChannel);
                        }
                    }
                    d0Var = new ha3.d0(applicationContext, str, str9, booleanValue, str7, intValue2, intValue3, createSurfaceProducer, eventChannel);
                }
                d0Var.j();
                concurrentHashMap.put(java.lang.Long.valueOf(id6), d0Var);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("textureId", java.lang.Long.valueOf(id6));
                result.success(hashMap);
                return;
            }
        }
        java.lang.Long valueOf = ((java.lang.Integer) call.argument("textureId")) != null ? java.lang.Long.valueOf(r0.intValue()) : null;
        ha3.a aVar = (ha3.a) concurrentHashMap.get(valueOf);
        if (aVar == null) {
            result.error("Unknown textureId", "No video player associated with texture id " + valueOf, null);
            return;
        }
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -971364356:
                    if (str2.equals("setLooping")) {
                        java.lang.Boolean bool3 = (java.lang.Boolean) call.argument("looping");
                        if (bool3 == null) {
                            bool3 = java.lang.Boolean.FALSE;
                        }
                        aVar.h(bool3.booleanValue());
                        result.success(null);
                        return;
                    }
                    break;
                case -906224877:
                    if (str2.equals("seekTo")) {
                        java.lang.Integer num4 = (java.lang.Integer) call.argument(ya.b.LOCATION);
                        aVar.seekTo((num4 != null ? num4 : 0).intValue());
                        result.success(null);
                        return;
                    }
                    break;
                case -797672260:
                    if (str2.equals("setOutputMute")) {
                        java.lang.Boolean bool4 = (java.lang.Boolean) call.argument("outputMute");
                        if (bool4 == null) {
                            bool4 = java.lang.Boolean.FALSE;
                        }
                        aVar.m(bool4.booleanValue());
                        result.success(null);
                        return;
                    }
                    break;
                case -493593704:
                    if (str2.equals("resetPosition")) {
                        if (!aVar.o()) {
                            aVar.n();
                            aVar.i();
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case -402284771:
                    if (str2.equals("setPlaybackRate")) {
                        java.lang.Double d18 = (java.lang.Double) call.argument("playbackRate");
                        if (d18 == null) {
                            d18 = java.lang.Double.valueOf(1.0d);
                        }
                        aVar.g(d18.doubleValue());
                        result.success(null);
                        return;
                    }
                    break;
                case -295960470:
                    if (str2.equals("updateSize")) {
                        java.lang.Integer num5 = (java.lang.Integer) call.argument("width");
                        if (num5 == null) {
                            num5 = r9;
                        }
                        int intValue4 = num5.intValue();
                        java.lang.Integer num6 = (java.lang.Integer) call.argument("height");
                        aVar.f(intValue4, (num6 != null ? num6 : 0).intValue());
                        result.success(null);
                        return;
                    }
                    break;
                case 3443508:
                    if (str2.equals(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
                        aVar.p();
                        result.success(null);
                        return;
                    }
                    break;
                case 106440182:
                    if (str2.equals("pause")) {
                        aVar.i();
                        result.success(null);
                        return;
                    }
                    break;
                case 670514716:
                    if (str2.equals(be1.x0.NAME)) {
                        java.lang.Double d19 = (java.lang.Double) call.argument("volume");
                        if (d19 == null) {
                            d19 = java.lang.Double.valueOf(1.0d);
                        }
                        aVar.e(d19.doubleValue());
                        result.success(null);
                        return;
                    }
                    break;
                case 747804969:
                    if (str2.equals("position")) {
                        result.success(java.lang.Long.valueOf(aVar.q()));
                        return;
                    }
                    break;
                case 1671767583:
                    if (str2.equals("dispose")) {
                        aVar.k();
                        kotlin.jvm.internal.m0.c(concurrentHashMap).remove(valueOf);
                        result.success(null);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppVideoPlayerPlugin", "onReattachedToActivityForConfigChanges");
    }
}
