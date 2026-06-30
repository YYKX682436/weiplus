package zi0;

/* loaded from: classes13.dex */
public class f implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f473088d;

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding f473089e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f473090f = new java.util.HashMap();

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.mm.flutter/videoPlayer");
        this.f473088d = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f473089e = flutterPluginBinding;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        io.flutter.plugin.common.MethodChannel methodChannel = this.f473088d;
        if (methodChannel == null) {
            return;
        }
        methodChannel.setMethodCallHandler(null);
        this.f473088d = null;
        java.util.HashMap hashMap = (java.util.HashMap) this.f473090f;
        java.util.Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((zi0.e) it.next()).a();
        }
        hashMap.clear();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        char c17;
        io.flutter.view.TextureRegistry textureRegistry = this.f473089e.getTextureRegistry();
        if (textureRegistry == null) {
            result.error("no_activity", "video_player plugin requires a foreground activity", null);
            return;
        }
        java.lang.String str = methodCall.method;
        str.getClass();
        if (str.equals("create")) {
            io.flutter.view.TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry.createSurfaceTexture();
            io.flutter.plugin.common.EventChannel eventChannel = new io.flutter.plugin.common.EventChannel(this.f473089e.getBinaryMessenger(), "com.tencent.mm.flutter/videoPlayer/videoEvents" + createSurfaceTexture.id());
            if (methodCall.argument("asset") == null) {
                new zi0.e(this, this.f473089e.getApplicationContext(), eventChannel, createSurfaceTexture, (java.lang.String) methodCall.argument("uri"), result, null);
                throw null;
            }
            new zi0.e(this, this.f473089e.getApplicationContext(), eventChannel, createSurfaceTexture, (java.lang.String) methodCall.argument("asset"), result, null);
            throw null;
        }
        boolean equals = str.equals(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        java.util.Map map = this.f473090f;
        if (equals) {
            java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
            while (it.hasNext()) {
                ((zi0.e) it.next()).a();
            }
            ((java.util.HashMap) map).clear();
            return;
        }
        long longValue = ((java.lang.Number) methodCall.argument("textureId")).longValue();
        zi0.e eVar = (zi0.e) ((java.util.HashMap) map).get(java.lang.Long.valueOf(longValue));
        if (eVar == null) {
            result.error("Unknown textureId", "No video player associated with texture id " + longValue, null);
            return;
        }
        java.lang.String str2 = methodCall.method;
        str2.getClass();
        switch (str2.hashCode()) {
            case -971364356:
                if (str2.equals("setLooping")) {
                    c17 = 0;
                    break;
                }
                c17 = 65535;
                break;
            case -906224877:
                if (str2.equals("seekTo")) {
                    c17 = 1;
                    break;
                }
                c17 = 65535;
                break;
            case -797672260:
                if (str2.equals("setOutputMute")) {
                    c17 = 2;
                    break;
                }
                c17 = 65535;
                break;
            case 3443508:
                if (str2.equals(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
                    c17 = 3;
                    break;
                }
                c17 = 65535;
                break;
            case 106440182:
                if (str2.equals("pause")) {
                    c17 = 4;
                    break;
                }
                c17 = 65535;
                break;
            case 670514716:
                if (str2.equals(be1.x0.NAME)) {
                    c17 = 5;
                    break;
                }
                c17 = 65535;
                break;
            case 747804969:
                if (str2.equals("position")) {
                    c17 = 6;
                    break;
                }
                c17 = 65535;
                break;
            case 1671767583:
                if (str2.equals("dispose")) {
                    c17 = 7;
                    break;
                }
                c17 = 65535;
                break;
            default:
                c17 = 65535;
                break;
        }
        switch (c17) {
            case 0:
                ((java.lang.Boolean) methodCall.argument("looping")).booleanValue();
                throw null;
            case 1:
                ((java.lang.Number) methodCall.argument(ya.b.LOCATION)).intValue();
                throw null;
            case 2:
                ((java.lang.Boolean) methodCall.argument("outputMute")).booleanValue();
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, ((java.lang.Double) methodCall.argument("volume")).doubleValue()));
                throw null;
            case 6:
                throw null;
            case 7:
                eVar.a();
                ((java.util.HashMap) map).remove(java.lang.Long.valueOf(longValue));
                result.success(null);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
