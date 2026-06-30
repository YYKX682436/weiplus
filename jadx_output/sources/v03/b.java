package v03;

/* loaded from: classes11.dex */
public final class b implements com.tencent.pigeon.flutter_thumb_player.TPFlutterApi, io.flutter.embedding.engine.plugins.FlutterPlugin, t03.g, io.flutter.embedding.engine.plugins.activity.ActivityAware, s03.e, s03.f {

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.view.TextureRegistry f432299d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f432300e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final c06.e f432301f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel f432302g;

    /* renamed from: h, reason: collision with root package name */
    public io.flutter.plugin.common.EventChannel.EventSink f432303h;

    /* renamed from: i, reason: collision with root package name */
    public nk4.s f432304i;

    /* renamed from: m, reason: collision with root package name */
    public f25.l0 f432305m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.ref.WeakReference f432306n;

    public b() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f432301f = c06.f.a(android.os.SystemClock.elapsedRealtime());
    }

    @Override // s03.f
    public void L(java.lang.String str, long j17, long j18, long j19) {
        s03.f fVar;
        java.lang.ref.WeakReference weakReference = this.f432306n;
        if (weakReference == null || (fVar = (s03.f) weakReference.get()) == null) {
            return;
        }
        fVar.L(str, j17, j18, j19);
    }

    public final t03.k0 a(long j17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var != null) {
            return k0Var;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterThumbPlayerPlugin", "getPlayer playerId:" + j17 + " player is null");
        return null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.tencent.pigeon.flutter_thumb_player.TPFlutterApi.Companion companion = com.tencent.pigeon.flutter_thumb_player.TPFlutterApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_thumb_player.TPFlutterApi.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        this.f432299d = flutterPluginBinding.getTextureRegistry();
        io.flutter.plugin.common.EventChannel eventChannel = new io.flutter.plugin.common.EventChannel(flutterPluginBinding.getBinaryMessenger(), "tp_player/event");
        this.f432302g = eventChannel;
        eventChannel.setStreamHandler(new v03.a(this));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        kotlin.jvm.internal.o.g(flutterPluginBinding, "flutterPluginBinding");
        com.tencent.pigeon.flutter_thumb_player.TPFlutterApi.Companion companion = com.tencent.pigeon.flutter_thumb_player.TPFlutterApi.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.flutter_thumb_player.TPFlutterApi.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        io.flutter.plugin.common.EventChannel eventChannel = this.f432302g;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
        }
        java.util.HashMap hashMap = this.f432300e;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((t03.k0) ((java.util.Map.Entry) it.next()).getValue()).e();
        }
        hashMap.clear();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean tpAddEffect(com.tencent.pigeon.flutter_thumb_player.TPPlayerRenderEffect r14) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v03.b.tpAddEffect(com.tencent.pigeon.flutter_thumb_player.TPPlayerRenderEffect):boolean");
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpClearEffect(long j17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f414467i.f429193b.f();
        k0Var.f414473r.clear();
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public com.tencent.pigeon.flutter_thumb_player.FlutterTPPlayFeedbackInfo tpGetFeedbackInfo(long j17) {
        com.tencent.pigeon.flutter_thumb_player.FlutterTPPlayFeedbackInfo p17;
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFeedbackInfo ");
        t03.r0 r0Var = k0Var.f414468m;
        sb6.append((r0Var == null || (p17 = r0Var.p()) == null) ? null : p17.toString());
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, sb6.toString());
        t03.r0 r0Var2 = k0Var.f414468m;
        if (r0Var2 != null) {
            return r0Var2.p();
        }
        return null;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public com.tencent.pigeon.flutter_thumb_player.TPPlayerContext tpGetPlayerContext(long j17) {
        return null;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public long tpGetPlayerState(long j17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return 0L;
        }
        return k0Var.f414468m != null ? r2.v(r2.f308579d) : 0;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public com.tencent.pigeon.flutter_thumb_player.TPVideoSizeRet tpGetVideoSize(long j17) {
        t03.r0 r0Var;
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        jz5.l lVar = null;
        if (k0Var != null && (r0Var = k0Var.f414468m) != null) {
            kk4.c cVar = r0Var.f308577b;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(cVar != null ? ((kk4.f0) cVar).getVideoWidth() : 0);
            kk4.c cVar2 = r0Var.f308577b;
            lVar = new jz5.l(valueOf, java.lang.Integer.valueOf(cVar2 != null ? ((kk4.f0) cVar2).getVideoHeight() : 0));
        }
        return new com.tencent.pigeon.flutter_thumb_player.TPVideoSizeRet(java.lang.Long.valueOf(lVar != null ? ((java.lang.Number) lVar.f302833d).intValue() : 0), java.lang.Long.valueOf(lVar != null ? ((java.lang.Number) lVar.f302834e).intValue() : 0));
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpPlaySetScaleType(com.tencent.pigeon.flutter_thumb_player.TPPlayerScaleTypeParams arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(arg.getPlayerId()));
        if (k0Var == null) {
            return false;
        }
        int scaleType = (int) arg.getScaleType();
        um5.p pVar = k0Var.f414467i;
        pVar.f429181y = scaleType;
        xm5.b.c(pVar.f429176t, "setScaleType:" + scaleType, new java.lang.Object[0]);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public long tpPlayerCreate(long j17, java.util.Map map) {
        java.util.HashMap hashMap;
        int intValue;
        java.lang.Object obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerCreate mediaType:" + j17 + " reporter:" + this.f432304i);
        io.flutter.view.TextureRegistry textureRegistry = this.f432299d;
        if (textureRegistry == null) {
            return 0L;
        }
        c06.e eVar = this.f432301f;
        long f17 = eVar.f();
        while (true) {
            hashMap = this.f432300e;
            if (!hashMap.containsKey(java.lang.Long.valueOf(f17))) {
                break;
            }
            f17 = eVar.f();
        }
        io.flutter.view.TextureRegistry.SurfaceProducer createSurfaceProducer = textureRegistry.createSurfaceProducer();
        if (createSurfaceProducer == null) {
            return 0L;
        }
        t03.k0 k0Var = new t03.k0(createSurfaceProducer, this, this);
        nk4.s sVar = this.f432304i;
        k0Var.f414475t = sVar;
        f25.l0 l0Var = null;
        if (sVar != null) {
            if (map != null) {
                try {
                    java.lang.Object obj2 = map.get("commentScene");
                    if (obj2 != null) {
                        java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
                        if (num != null) {
                            intValue = num.intValue();
                            if (map != null || (obj = map.get("contextID")) == null || (r10 = obj.toString()) == null) {
                                java.lang.String str = "flutter@" + f17 + '@' + k0Var.f414475t;
                            }
                            ((kw2.m0) sVar).K(intValue, str);
                        }
                    }
                } catch (java.lang.Throwable unused) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerCreate error.");
                }
            }
            intValue = org.chromium.net.NetError.ERR_SOCKET_RECEIVE_BUFFER_SIZE_UNCHANGEABLE;
            if (map != null) {
            }
            java.lang.String str2 = "flutter@" + f17 + '@' + k0Var.f414475t;
            ((kw2.m0) sVar).K(intValue, str2);
        }
        f25.l0 l0Var2 = this.f432305m;
        if (l0Var2 != null) {
            l0Var = new f25.l0(l0Var2.f259104a + '_' + f17, l0Var2.f259105b);
        }
        k0Var.f414476u = l0Var;
        hashMap.put(java.lang.Long.valueOf(f17), k0Var);
        return f17;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public com.tencent.pigeon.flutter_thumb_player.TPPlayerRange tpPlayerGetPlayRange(long j17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return new com.tencent.pigeon.flutter_thumb_player.TPPlayerRange(-1L, -1L);
        }
        t03.r0 r0Var = k0Var.f414468m;
        return new com.tencent.pigeon.flutter_thumb_player.TPPlayerRange(r0Var != null ? r0Var.C : -1L, r0Var != null ? r0Var.D : -1L);
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public long tpPlayerInit(com.tencent.pigeon.flutter_thumb_player.TPPlayerInitParams arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerInit playerId:" + arg.getPlayerId() + ", width:" + arg.getWidth() + ", height:" + arg.getHeight());
        long playerId = arg.getPlayerId();
        long width = arg.getWidth();
        long height = arg.getHeight();
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(playerId));
        if (k0Var == null) {
            return 0L;
        }
        int i17 = (int) width;
        int i18 = (int) height;
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "init: [" + i17 + ',' + i18 + ']');
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = k0Var.f414462d;
        surfaceProducer.setSize(i17, i18);
        android.view.Surface surface = surfaceProducer.getSurface();
        um5.p pVar = k0Var.f414467i;
        pVar.e(surface, i17, i18);
        pVar.n(k0Var);
        return k0Var.f414466h;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpPlayerPause(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPause playerId:" + j17);
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "pause");
        k0Var.f414472q = false;
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var != null) {
            kk4.b.i(r0Var, false, z17, 1, null);
        }
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpPlayerPlay(long j17) {
        t03.e eVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerPlay playerId:" + j17);
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "start");
        k0Var.f414472q = true;
        if (!k0Var.f414470o && (eVar = k0Var.f414469n) != null) {
            pm0.v.X(new t03.d(eVar));
        }
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var != null) {
            r0Var.O();
        }
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpPlayerPrepare(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerPrepare playerId:" + j17);
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "prepare");
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var != null) {
            kk4.b.a(r0Var, null, 1, null);
        }
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpPlayerSeek(com.tencent.pigeon.flutter_thumb_player.TPPlayerSeekParams arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        long playerId = arg.getPlayerId();
        long timeMs = arg.getTimeMs();
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(playerId));
        if (k0Var == null) {
            return false;
        }
        int i17 = (int) timeMs;
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "seek:" + i17);
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var == null) {
            return true;
        }
        kk4.b.f(r0Var, i17, true, null, 4, null);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpPlayerSetLoop(com.tencent.pigeon.flutter_thumb_player.TPPlayerSetLoopParams arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(arg.getPlayerId()));
        if (k0Var == null) {
            return false;
        }
        boolean loop = arg.getLoop();
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var == null) {
            return true;
        }
        r0Var.A(loop);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpPlayerSetMediaInfo(com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaInfoParams arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(arg.getPlayerId()));
        if (k0Var == null) {
            return false;
        }
        java.lang.String mediaId = arg.getMediaId();
        java.lang.String path = arg.getPath();
        java.lang.String url = arg.getUrl();
        long videoWidth = arg.getVideoWidth();
        long videoHeight = arg.getVideoHeight();
        boolean isLocal = arg.isLocal();
        dk4.a aVar = new dk4.a(mediaId, path, url, (int) videoWidth, (int) videoHeight);
        aVar.f234466c = arg.getUrlToken();
        aVar.f234467d = arg.getDecodeKey();
        aVar.f234468e = isLocal;
        aVar.f234464a = 2;
        aVar.f234465b = arg.getFileFormat();
        aVar.f234470g = arg.getVideoDuration();
        aVar.f234473j = arg.getThumbPath();
        aVar.f234471h = arg.getThumbUrl();
        aVar.f234472i = arg.getThumbUrlToken();
        aVar.f234481r = arg.getFileFormat();
        int i17 = t03.k0.B;
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "setMediaInfo:" + aVar);
        k0Var.d();
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var != null) {
            r0Var.G(new t03.n(k0Var));
        }
        t03.r0 r0Var2 = k0Var.f414468m;
        if (r0Var2 != null) {
            r0Var2.B(aVar);
        }
        t03.r0 r0Var3 = k0Var.f414468m;
        if (r0Var3 != null) {
            r0Var3.f308585j = true;
        }
        android.view.Surface surface = k0Var.f414471p;
        if (surface != null && r0Var3 != null) {
            r0Var3.J(surface, k0Var.f414472q);
        }
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpPlayerSetMediaProto(com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMediaProtoParams params) {
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerSetMediaProto playerId:" + params.getPlayerId());
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(params.getPlayerId()));
        if (k0Var == null) {
            return false;
        }
        u03.a mediaType = u03.a.values()[(int) params.getMediaType()];
        byte[] mediaProto = params.getMediaProto();
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        kotlin.jvm.internal.o.g(mediaProto, "mediaProto");
        java.lang.String str = k0Var.f414465g;
        com.tencent.mars.xlog.Log.i(str, "setMediaProto");
        k0Var.d();
        f25.l0 l0Var = k0Var.f414476u;
        if (l0Var != null && !k0Var.f414470o) {
            k0Var.f414469n = new t03.e(new java.lang.ref.WeakReference(k0Var), l0Var);
        }
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var != null) {
            r0Var.G(new t03.o(k0Var));
        }
        t03.r0 r0Var2 = k0Var.f414468m;
        if (r0Var2 != null) {
            r0Var2.F(new t03.p(k0Var));
        }
        t03.r0 r0Var3 = k0Var.f414468m;
        if (r0Var3 != null) {
            r0Var3.f414508e0 = mediaType;
        }
        if (r0Var3 != null) {
            r0Var3.f414509f0 = mediaProto;
        }
        if (r0Var3 != null) {
            r0Var3.f308585j = true;
        }
        android.view.Surface surface = k0Var.f414471p;
        if (surface != null && r0Var3 != null) {
            r0Var3.J(surface, k0Var.f414472q);
        }
        if (params.getStartPlayPosition() > 0) {
            int startPlayPosition = (int) params.getStartPlayPosition();
            com.tencent.mars.xlog.Log.i(str, "setPlayStartSeek:" + startPlayPosition);
            t03.r0 r0Var4 = k0Var.f414468m;
            if (r0Var4 != null) {
                r0Var4.P = startPlayPosition;
            }
        }
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpPlayerSetMute(com.tencent.pigeon.flutter_thumb_player.TPPlayerSetMuteParams arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerSetMute mute:" + arg.getMute());
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(arg.getPlayerId()));
        if (k0Var == null) {
            return false;
        }
        k0Var.f(arg.getMute(), false);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpPlayerSetPlayRange(com.tencent.pigeon.flutter_thumb_player.TPPlayerSetPlayRangeParams arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(arg.getPlayerId()));
        if (k0Var == null) {
            return false;
        }
        long startTimeMs = arg.getStartTimeMs();
        long endTimeMs = arg.getEndTimeMs();
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "setPlayRange:[" + startTimeMs + ", " + endTimeMs + ']');
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var == null) {
            return true;
        }
        r0Var.H(startTimeMs, endTimeMs);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpPlayerSetStreamType(com.tencent.pigeon.flutter_thumb_player.TPPlayerSetStreamTypeParams arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpPlayerSetStreamType streamType:" + arg.getStreamType());
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(arg.getPlayerId()));
        if (k0Var == null) {
            return false;
        }
        int streamType = (int) arg.getStreamType();
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var == null) {
            return true;
        }
        r0Var.F = streamType;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void tpPreload(com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams r5) {
        /*
            r4 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.g(r5, r0)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = new com.tencent.mm.protocal.protobuf.FinderObject
            r0.<init>()
            byte[] r1 = r5.getMediaProto()
            r2 = 0
            if (r1 != 0) goto L13
        L11:
            r0 = r2
            goto L24
        L13:
            r0.parseFrom(r1)     // Catch: java.lang.Exception -> L17
            goto L24
        L17:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r3, r1, r0)
            goto L11
        L24:
            if (r0 != 0) goto L2e
            java.lang.String r5 = "MicroMsg.FlutterThumbPlayerPlugin"
            java.lang.String r0 = "null finder object"
            com.tencent.mars.xlog.Log.i(r5, r0)
            return
        L2e:
            java.lang.Class<zy2.a7> r1 = zy2.a7.class
            i95.m r1 = i95.n0.c(r1)
            zy2.a7 r1 = (zy2.a7) r1
            long r2 = r5.getCommentScene()
            int r5 = (int) r2
            r2 = 0
            com.tencent.mm.plugin.finder.service.l2 r1 = (com.tencent.mm.plugin.finder.service.l2) r1
            r1.Bi(r0, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v03.b.tpPreload(com.tencent.pigeon.flutter_thumb_player.TPPlayerPreloadParams):void");
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpRelease(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpRelease playerId:" + j17);
        java.util.HashMap hashMap = this.f432300e;
        t03.k0 k0Var = (t03.k0) hashMap.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.e();
        hashMap.remove(java.lang.Long.valueOf(j17));
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpRemoveEffect(com.tencent.pigeon.flutter_thumb_player.TPPlayerRenderEffect arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(arg.getPlayerId()));
        if (k0Var == null) {
            return false;
        }
        uq5.y yVar = (uq5.y) k0Var.f414473r.get(java.lang.Long.valueOf(arg.getEffectId()));
        if (yVar == null) {
            return false;
        }
        k0Var.f414467i.f429193b.o(yVar);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public void tpSetInterruptedWhenBackground(long j17, boolean z17) {
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpSetOnFirstFrameRenderedListener(long j17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f414479x = new t03.x(j17, k0Var);
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var == null) {
            return true;
        }
        r0Var.E(new t03.y(k0Var));
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpSetOnPlayerHideBufferingListener(long j17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f414481z = new t03.r(k0Var, j17);
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var == null) {
            return true;
        }
        r0Var.f308597v = new t03.s(k0Var);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpSetOnPlayerShowBufferingListener(long j17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f414480y = new t03.u(k0Var, j17);
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var == null) {
            return true;
        }
        r0Var.f308596u = new t03.v(k0Var);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpSetOnPlayerStateChangeListener(long j17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.A = new t03.e0(k0Var, j17);
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var == null) {
            return true;
        }
        r0Var.K = new t03.f0(k0Var);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpSetOnPreparedListener(long j17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f414474s = new t03.a0(j17, k0Var);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpSetPlayCompletedListener(long j17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        k0Var.f414477v = new t03.h0(j17, k0Var);
        return false;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpSetPlaySpeed(long j17, double d17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var == null) {
            return true;
        }
        float f17 = (float) d17;
        r0Var.f308587l = f17;
        kk4.c cVar = r0Var.f308577b;
        if (cVar == null) {
            return true;
        }
        cVar.setPlaySpeedRatio(f17);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpSetProgressListener(long j17) {
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var != null) {
            r0Var.I(new t03.j0(j17, k0Var), 400L);
        }
        k0Var.f414478w = new t03.c0(j17, k0Var);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpStop(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpStop playerId:" + j17);
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "stop");
        k0Var.f414472q = false;
        t03.r0 r0Var = k0Var.f414468m;
        if (r0Var != null) {
            r0Var.stop();
        }
        t03.e eVar = k0Var.f414469n;
        if (eVar == null) {
            return true;
        }
        pm0.v.X(new t03.b(eVar));
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpUpdateDisplaySize(com.tencent.pigeon.flutter_thumb_player.TPPlayerUpdateSizeParams arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterThumbPlayerPlugin", "tpUpdateDisplaySize playerId:" + arg.getPlayerId() + ", width:" + arg.getWidth() + ", height:" + arg.getHeight());
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(arg.getPlayerId()));
        if (k0Var == null) {
            return false;
        }
        int width = (int) arg.getWidth();
        int height = (int) arg.getHeight();
        com.tencent.mars.xlog.Log.i(k0Var.f414465g, "updateRenderSize: [" + width + ',' + height + ']');
        k0Var.f414462d.setSize(width, height);
        k0Var.f414467i.j(width, height);
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public boolean tpUpdateEffect(com.tencent.pigeon.flutter_thumb_player.TPPlayerRenderEffect arg) {
        kotlin.jvm.internal.o.g(arg, "arg");
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(arg.getPlayerId()));
        if (k0Var == null) {
            return false;
        }
        return true;
    }

    @Override // com.tencent.pigeon.flutter_thumb_player.TPFlutterApi
    public void tpUpdateExtraInfo(long j17, java.util.Map extraInfo) {
        nk4.s sVar;
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        t03.k0 k0Var = (t03.k0) this.f432300e.get(java.lang.Long.valueOf(j17));
        if (k0Var == null || (sVar = k0Var.f414475t) == null) {
            return;
        }
        kw2.m0 m0Var = (kw2.m0) sVar;
        for (java.util.Map.Entry entry : extraInfo.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            if (str != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = m0Var.f313064i;
                if (value != null) {
                    concurrentHashMap.put(str, value);
                } else {
                    concurrentHashMap.remove(str);
                }
            }
        }
    }
}
