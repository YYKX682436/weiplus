package x03;

/* loaded from: classes15.dex */
public class q1 implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugin.common.MethodChannel.MethodCallHandler {

    /* renamed from: e, reason: collision with root package name */
    public io.flutter.plugin.common.MethodChannel f451105e;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding f451106f;

    /* renamed from: h, reason: collision with root package name */
    public x03.p1 f451108h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f451107g = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final x03.y0 f451104d = new x03.y0(this);

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "onAttachedToEngine");
        this.f451106f = flutterPluginBinding;
        io.flutter.plugin.common.MethodChannel methodChannel = new io.flutter.plugin.common.MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.tencent.mm.flutter/liteappVideoPlayer");
        this.f451105e = methodChannel;
        methodChannel.setMethodCallHandler(this);
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f451104d, new android.content.IntentFilter(io.flutter.plugins.connectivity.patched.PatchedConnectivityBroadcastReceiver.CONNECTIVITY_ACTION));
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "onDetachedFromEngine");
        this.f451105e.setMethodCallHandler(null);
        java.util.HashMap hashMap = (java.util.HashMap) this.f451107g;
        java.util.Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((x03.p1) it.next()).a();
        }
        hashMap.clear();
        x03.v0 v0Var = x03.x0.f451161d;
        java.util.HashMap hashMap2 = v0Var.a().f451165c.f451060d;
        if (hashMap2 != null) {
            hashMap2.clear();
        }
        x03.x0 a17 = v0Var.a();
        x03.w0 w0Var = new x03.w0(this);
        kz5.q qVar = a17.f451163a;
        qVar.removeIf(w0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerMgr", "removeFlutterVideoPlayer plugin: " + this + " total size: " + qVar.d());
        com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(this.f451104d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        char c17;
        java.lang.String str;
        x03.p1 p1Var;
        char c18;
        io.flutter.view.TextureRegistry textureRegistry = this.f451106f.getTextureRegistry();
        if (textureRegistry == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVideoPlayerPlugin", "texture null");
            result.error("no_activity", "video_player plugin requires a foreground activity", null);
            return;
        }
        java.lang.String str2 = methodCall.method;
        str2.getClass();
        int hashCode = str2.hashCode();
        if (hashCode == -1352294148) {
            if (str2.equals("create")) {
                c17 = 0;
            }
            c17 = 65535;
        } else if (hashCode != -318476791) {
            if (hashCode == 3237136 && str2.equals(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT)) {
                c17 = 2;
            }
            c17 = 65535;
        } else {
            if (str2.equals("preload")) {
                c17 = 1;
            }
            c17 = 65535;
        }
        x03.v0 v0Var = x03.x0.f451161d;
        if (c17 == 0) {
            io.flutter.view.TextureRegistry.SurfaceTextureEntry createSurfaceTexture = textureRegistry.createSurfaceTexture();
            io.flutter.plugin.common.EventChannel eventChannel = new io.flutter.plugin.common.EventChannel(this.f451106f.getBinaryMessenger(), "com.tencent.mm.flutter/videoPlayer/liteappVideoEvents" + createSurfaceTexture.id());
            if (methodCall.argument("asset") != null) {
                str = ", textureId: ";
                p1Var = new x03.p1(this.f451106f.getApplicationContext(), eventChannel, createSurfaceTexture, (java.lang.String) methodCall.argument("asset"), result);
            } else {
                str = ", textureId: ";
                p1Var = new x03.p1(this.f451106f.getApplicationContext(), eventChannel, createSurfaceTexture, (java.lang.String) methodCall.argument("uri"), result);
                if (methodCall.hasArgument("referer")) {
                    p1Var.f451092e = (java.lang.String) methodCall.argument("referer");
                }
                if (methodCall.hasArgument("isLive")) {
                    p1Var.f451091d = ((java.lang.Boolean) methodCall.argument("isLive")).booleanValue();
                }
                if (methodCall.hasArgument("cacheKey")) {
                    p1Var.f451090c = (java.lang.String) methodCall.argument("cacheKey");
                }
            }
            long id6 = createSurfaceTexture.id();
            ((java.util.HashMap) this.f451107g).put(java.lang.Long.valueOf(id6), p1Var);
            ((ku5.t0) ku5.t0.f312615d).g(new x03.j1(p1Var));
            x03.x0 a17 = v0Var.a();
            java.lang.Long valueOf = java.lang.Long.valueOf(id6);
            a17.f451163a.addLast(new jz5.l(this, valueOf));
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerMgr", "addFlutterVideoPlayer plugin: " + this + str + valueOf + ", total size: " + a17.f451163a.d());
            if (a17.f451163a.d() >= 10) {
                jz5.l lVar = (jz5.l) a17.f451163a.removeFirst();
                x03.q1 q1Var = (x03.q1) lVar.f302833d;
                java.lang.Number number = (java.lang.Number) lVar.f302834e;
                x03.p1 p1Var2 = (x03.p1) ((java.util.HashMap) q1Var.f451107g).get(java.lang.Long.valueOf(number.longValue()));
                if (p1Var2 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.FlutterVideoPlayerPlugin", "videoPlayer is null, textureId: " + number.longValue());
                } else if (p1Var2.f451096i != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("event", "onForceDispose");
                    ((ku5.t0) ku5.t0.f312615d).B(new x03.e1(p1Var2, hashMap));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerMgr", "addFlutterVideoPlayer reach maxSize, need dispose first player. plugin: " + this + str + valueOf + ". total size: " + a17.f451163a.d());
            }
            ((java.util.HashMap) this.f451107g).size();
            return;
        }
        if (c17 == 1) {
            java.lang.String str3 = (java.lang.String) methodCall.argument("url");
            int intValue = ((java.lang.Integer) methodCall.argument("ratio")).intValue();
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                return;
            }
            v0Var.a().f451164b.c(str3, intValue);
            return;
        }
        if (c17 == 2) {
            java.util.Iterator it = ((java.util.HashMap) this.f451107g).values().iterator();
            while (it.hasNext()) {
                ((x03.p1) it.next()).a();
            }
            ((java.util.HashMap) this.f451107g).clear();
            v0Var.a();
            java.util.HashMap hashMap2 = v0Var.a().f451165c.f451060d;
            if (hashMap2 != null) {
                hashMap2.clear();
                return;
            }
            return;
        }
        long longValue = ((java.lang.Number) methodCall.argument("textureId")).longValue();
        x03.p1 p1Var3 = (x03.p1) ((java.util.HashMap) this.f451107g).get(java.lang.Long.valueOf(longValue));
        if (p1Var3 == null) {
            result.error("Unknown textureId", "No video player associated with texture id " + longValue, null);
            return;
        }
        java.lang.String str4 = methodCall.method;
        str4.getClass();
        switch (str4.hashCode()) {
            case -971364356:
                if (str4.equals("setLooping")) {
                    c18 = 0;
                    break;
                }
                c18 = 65535;
                break;
            case -906224877:
                if (str4.equals("seekTo")) {
                    c18 = 1;
                    break;
                }
                c18 = 65535;
                break;
            case -797672260:
                if (str4.equals("setOutputMute")) {
                    c18 = 2;
                    break;
                }
                c18 = 65535;
                break;
            case -493593704:
                if (str4.equals("resetPosition")) {
                    c18 = 3;
                    break;
                }
                c18 = 65535;
                break;
            case -402284771:
                if (str4.equals("setPlaybackRate")) {
                    c18 = 4;
                    break;
                }
                c18 = 65535;
                break;
            case 3443508:
                if (str4.equals(com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
                    c18 = 5;
                    break;
                }
                c18 = 65535;
                break;
            case 106440182:
                if (str4.equals("pause")) {
                    c18 = 6;
                    break;
                }
                c18 = 65535;
                break;
            case 670514716:
                if (str4.equals(be1.x0.NAME)) {
                    c18 = 7;
                    break;
                }
                c18 = 65535;
                break;
            case 747804969:
                if (str4.equals("position")) {
                    c18 = '\b';
                    break;
                }
                c18 = 65535;
                break;
            case 1671767583:
                if (str4.equals("dispose")) {
                    c18 = '\t';
                    break;
                }
                c18 = 65535;
                break;
            default:
                c18 = 65535;
                break;
        }
        switch (c18) {
            case 0:
                p1Var3.f451093f.b(((java.lang.Boolean) methodCall.argument("looping")).booleanValue());
                result.success(null);
                return;
            case 1:
                int intValue2 = ((java.lang.Number) methodCall.argument(ya.b.LOCATION)).intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer seekTo %s", java.lang.Integer.valueOf(p1Var3.hashCode()));
                p1Var3.f451093f.a(intValue2);
                result.success(null);
                return;
            case 2:
                p1Var3.f451093f.setMute(((java.lang.Boolean) methodCall.argument("outputMute")).booleanValue());
                result.success(null);
                return;
            case 3:
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer seekTo %s", java.lang.Integer.valueOf(p1Var3.hashCode()));
                p1Var3.f451093f.a(0);
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer pause %s", java.lang.Integer.valueOf(p1Var3.hashCode()));
                p1Var3.f451093f.pause();
                result.success(null);
                return;
            case 4:
                java.lang.Double d17 = (java.lang.Double) methodCall.argument("playbackRate");
                if (d17 != null) {
                    p1Var3.f451093f.c(d17.floatValue());
                }
                result.success(null);
                return;
            case 5:
                this.f451108h = p1Var3;
                if (!p1Var3.f451100m) {
                    p1Var3.f451093f.prepare();
                    p1Var3.f451100m = true;
                }
                x03.p1 p1Var4 = this.f451108h;
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer play %s", java.lang.Integer.valueOf(p1Var4.hashCode()));
                p1Var4.f451093f.start();
                v0Var.a().f451164b.e(this.f451108h.b(), kk.k.g(this.f451108h.b().getBytes()));
                result.success(null);
                return;
            case 6:
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerPlugin", "VideoPlayer pause %s", java.lang.Integer.valueOf(p1Var3.hashCode()));
                p1Var3.f451093f.pause();
                v0Var.a().f451164b.h(kk.k.g(p1Var3.b().getBytes()), false);
                result.success(null);
                return;
            case 7:
                p1Var3.f451093f.e((float) java.lang.Math.max(0.0d, java.lang.Math.min(1.0d, ((java.lang.Double) methodCall.argument("volume")).doubleValue())));
                result.success(null);
                return;
            case '\b':
                result.success(java.lang.Long.valueOf(p1Var3.f451093f.getCurrentPosition()));
                return;
            case '\t':
                java.lang.String g17 = kk.k.g(p1Var3.b().getBytes());
                if (this.f451108h == p1Var3) {
                    this.f451108h = null;
                }
                v0Var.a().f451164b.h(g17, p1Var3.f451091d);
                java.util.Map map = v0Var.a().f451164b.f451041g;
                x03.f fVar = (x03.f) map.get(g17);
                if (fVar != null && fVar.f451017f) {
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        java.lang.String str5 = (java.lang.String) entry.getKey();
                        x03.f fVar2 = (x03.f) entry.getValue();
                        kotlin.jvm.internal.o.d(str5);
                        if (r26.i0.y(str5, g17 + '@', false)) {
                            v0Var.a().f451165c.b(str5);
                            fVar2.f451018g = false;
                        }
                    }
                }
                p1Var3.a();
                java.util.HashMap hashMap3 = (java.util.HashMap) this.f451107g;
                hashMap3.remove(java.lang.Long.valueOf(longValue));
                hashMap3.size();
                x03.x0 a18 = v0Var.a();
                java.lang.Long valueOf2 = java.lang.Long.valueOf(longValue);
                jz5.l lVar2 = new jz5.l(this, valueOf2);
                kz5.q qVar = a18.f451163a;
                qVar.remove(lVar2);
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterVideoPlayerMgr", "removeFlutterVideoPlayer plugin: " + this + ", textureId: " + valueOf2 + ", total size: " + qVar.d());
                result.success(null);
                return;
            default:
                result.notImplemented();
                return;
        }
    }
}
