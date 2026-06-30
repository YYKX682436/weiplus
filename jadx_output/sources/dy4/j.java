package dy4;

/* loaded from: classes15.dex */
public final class j extends eg.a implements tf.w, tf.q, androidx.lifecycle.y {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.rtmp.TXLivePlayer f244668h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.Surface f244669i;

    /* renamed from: n, reason: collision with root package name */
    public sf.f f244671n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f244672o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f244673p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f244674q;

    /* renamed from: s, reason: collision with root package name */
    public sf.e f244676s;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f244667g = jz5.h.b(dy4.g.f244643d);

    /* renamed from: m, reason: collision with root package name */
    public final tf.q f244670m = new tf.l0();

    /* renamed from: r, reason: collision with root package name */
    public final androidx.lifecycle.b0 f244675r = new androidx.lifecycle.b0(this, true);

    public j() {
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = new com.tencent.rtmp.TXLivePlayer(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f244668h = tXLivePlayer;
        tXLivePlayer.setPlayListener(new dy4.e(this));
        com.tencent.rtmp.TXLivePlayer tXLivePlayer2 = this.f244668h;
        if (tXLivePlayer2 != null) {
            tXLivePlayer2.setAudioVolumeEvaluationListener(new dy4.f());
        }
    }

    @Override // eg.b
    public boolean b(sf.f invokeContext) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // eg.b
    public java.lang.String f(sf.f invokeContext) {
        kotlin.jvm.internal.o.g(invokeContext, "invokeContext");
        java.lang.String l17 = invokeContext.l();
        if (com.tencent.mm.sdk.platformtools.t8.K0(l17)) {
            com.tencent.mars.xlog.Log.w(r(), "handleJsApi, jsapiName is null or empty");
            return null;
        }
        org.json.JSONObject c17 = invokeContext.c();
        com.tencent.mars.xlog.Log.i(r(), "handler(%s) handleJsApi(%s), data:%s", q(), l17, c17.toString());
        java.lang.String optString = c17.optString("action", "");
        if (optString != null) {
            switch (optString.hashCode()) {
                case -1100634679:
                    if (optString.equals("insertSameLayerVideo")) {
                        com.tencent.mars.xlog.Log.i(r(), "inserting");
                        if (this.f244676s == null) {
                            dy4.i iVar = new dy4.i(this);
                            this.f244676s = iVar;
                            invokeContext.e(iVar);
                        }
                        this.f244671n = invokeContext;
                        s(invokeContext);
                        break;
                    }
                    break;
                case -952717996:
                    if (optString.equals("operateSameLayerVideo")) {
                        com.tencent.mars.xlog.Log.i(r(), "operating");
                        org.json.JSONObject c18 = invokeContext.c();
                        java.lang.String optString2 = c18.optString("type");
                        kotlin.jvm.internal.o.d(optString2);
                        java.util.Locale locale = java.util.Locale.ROOT;
                        java.lang.String lowerCase = optString2.toLowerCase(locale);
                        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
                        boolean z17 = true;
                        if (!kotlin.jvm.internal.o.b(lowerCase, com.tencent.tav.core.AssetExtension.SCENE_PLAY)) {
                            java.lang.String lowerCase2 = optString2.toLowerCase(locale);
                            kotlin.jvm.internal.o.f(lowerCase2, "toLowerCase(...)");
                            if (!kotlin.jvm.internal.o.b(lowerCase2, "stop")) {
                                java.lang.String lowerCase3 = optString2.toLowerCase(locale);
                                kotlin.jvm.internal.o.f(lowerCase3, "toLowerCase(...)");
                                if (!kotlin.jvm.internal.o.b(lowerCase3, "pause")) {
                                    java.lang.String lowerCase4 = optString2.toLowerCase(locale);
                                    kotlin.jvm.internal.o.f(lowerCase4, "toLowerCase(...)");
                                    if (!kotlin.jvm.internal.o.b(lowerCase4, "resume")) {
                                        java.lang.String lowerCase5 = optString2.toLowerCase(locale);
                                        kotlin.jvm.internal.o.f(lowerCase5, "toLowerCase(...)");
                                        if (!kotlin.jvm.internal.o.b(lowerCase5, "mute")) {
                                            java.lang.String r17 = r();
                                            java.lang.String lowerCase6 = optString2.toLowerCase(locale);
                                            kotlin.jvm.internal.o.f(lowerCase6, "toLowerCase(...)");
                                            com.tencent.mars.xlog.Log.e(r17, "unknown operate type: %s", lowerCase6);
                                            invokeContext.g("fail");
                                            break;
                                        } else {
                                            boolean optBoolean = c18.optBoolean("muted", true);
                                            com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f244668h;
                                            if (tXLivePlayer != null) {
                                                tXLivePlayer.setMute(optBoolean);
                                            }
                                            invokeContext.g("ok");
                                            break;
                                        }
                                    } else {
                                        com.tencent.rtmp.TXLivePlayer tXLivePlayer2 = this.f244668h;
                                        if (tXLivePlayer2 != null) {
                                            tXLivePlayer2.resume();
                                        }
                                        invokeContext.g("ok");
                                        break;
                                    }
                                } else {
                                    com.tencent.rtmp.TXLivePlayer tXLivePlayer3 = this.f244668h;
                                    if (tXLivePlayer3 != null) {
                                        tXLivePlayer3.pause();
                                    }
                                    invokeContext.g("ok");
                                    break;
                                }
                            } else {
                                com.tencent.rtmp.TXLivePlayer tXLivePlayer4 = this.f244668h;
                                if (tXLivePlayer4 != null) {
                                    tXLivePlayer4.stopPlay(false);
                                }
                                invokeContext.g("ok");
                                break;
                            }
                        } else {
                            java.lang.String str = this.f244674q;
                            if (!(str == null || str.length() == 0)) {
                                com.tencent.rtmp.TXLivePlayer tXLivePlayer5 = this.f244668h;
                                if (tXLivePlayer5 != null) {
                                    tXLivePlayer5.startLivePlay(this.f244674q, 1);
                                    break;
                                }
                            } else {
                                java.lang.String str2 = this.f244672o;
                                if (!(str2 == null || str2.length() == 0)) {
                                    java.lang.String str3 = this.f244673p;
                                    if (str3 != null && str3.length() != 0) {
                                        z17 = false;
                                    }
                                    if (!z17) {
                                        ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Qj(this.f244673p, this.f244672o, 0, new dy4.h(this, invokeContext));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case -312131623:
                    if (optString.equals("updateSameLayerVideo")) {
                        com.tencent.mars.xlog.Log.i(r(), "updating");
                        s(invokeContext);
                        break;
                    }
                    break;
                case 1975278676:
                    if (optString.equals("removeSameLayerVideo")) {
                        com.tencent.mars.xlog.Log.i(r(), "removing");
                        t();
                        invokeContext.g("ok");
                        break;
                    }
                    break;
            }
            return null;
        }
        com.tencent.mars.xlog.Log.e(r(), "handler(%s), unknown action: %s", q(), c17.optString("action", ""));
        return null;
    }

    @Override // tf.w
    public java.lang.String g() {
        return this.f252498e + '_' + this.f252497d;
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f244675r;
    }

    @Override // tf.q
    public java.lang.String getName() {
        java.lang.String q17 = q();
        kotlin.jvm.internal.o.f(q17, "key(...)");
        return q17;
    }

    @Override // tf.q
    public tf.r h(java.lang.Class addOnClass) {
        kotlin.jvm.internal.o.g(addOnClass, "addOnClass");
        return ((tf.l0) this.f244670m).h(addOnClass);
    }

    @Override // eg.a, eg.b
    public void i(android.view.Surface surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        this.f244669i = surface;
        com.tencent.mars.xlog.Log.i(r(), "handler(%s) handlePluginReady", q());
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f244668h;
        if (tXLivePlayer != null) {
            com.tencent.mars.xlog.Log.i(r(), "handlePluginReady, setSurface");
            tXLivePlayer.setSurface(this.f244669i);
        }
    }

    @Override // tf.w
    public void m() {
    }

    @Override // tf.w
    public boolean o() {
        return true;
    }

    @Override // eg.b
    public void p(android.graphics.SurfaceTexture surfaceTexture) {
        kotlin.jvm.internal.o.g(surfaceTexture, "surfaceTexture");
        i(new android.view.Surface(surfaceTexture));
    }

    public final java.lang.String r() {
        return (java.lang.String) ((jz5.n) this.f244667g).getValue();
    }

    public final void s(sf.f fVar) {
        com.tencent.rtmp.TXLivePlayConfig tXLivePlayConfig = new com.tencent.rtmp.TXLivePlayConfig();
        org.json.JSONObject c17 = fVar.c();
        this.f244673p = c17.optString("exportId", "");
        this.f244672o = c17.optString("nonceId", "");
        this.f244674q = c17.optString("url", "");
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f244668h;
        if (tXLivePlayer != null) {
            tXLivePlayer.setConfig(tXLivePlayConfig);
        }
        fVar.g("ok");
    }

    public final void t() {
        com.tencent.rtmp.TXLivePlayer tXLivePlayer = this.f244668h;
        if (tXLivePlayer != null) {
            tXLivePlayer.stopPlay(true);
        }
        this.f244668h = null;
        android.view.Surface surface = this.f244669i;
        if (surface != null) {
            surface.release();
        }
        this.f244669i = null;
        sf.f fVar = this.f244671n;
        if (fVar != null) {
            if (fVar != null) {
                fVar.i(this.f244676s);
            }
            this.f244676s = null;
        }
        this.f244671n = null;
    }
}
