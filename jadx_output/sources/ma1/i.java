package ma1;

/* loaded from: classes7.dex */
public class i extends ma1.d {
    public static final int CTRL_INDEX = 666;
    public static final java.lang.String NAME = "operateGameRecorder";

    /* renamed from: g, reason: collision with root package name */
    public final ma1.a f325165g = new ma1.a();

    /* renamed from: h, reason: collision with root package name */
    public u81.f f325166h = null;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f325167i = null;

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        java.lang.String optString = jSONObject.optString("operationType");
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: operating game screen recorder: %s json: %s", optString, jSONObject.toString());
        if (((p60.u) ((p60.x) i95.n0.c(p60.x.class))).Bi(c0Var.getAppId(), c0Var.t3().u0().f77281g).booleanValue()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderOperate", "is game living");
            F(c0Var, i17, 1, 112, "game is living, not support record now");
            return;
        }
        if (!"start".equalsIgnoreCase(optString)) {
            if ("pause".equalsIgnoreCase(optString)) {
                if (!c0Var.V0().l2()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: current game is not in foreground. ignore pause!");
                    F(c0Var, i17, 2, -2, "can not pause in background");
                    return;
                }
                ta1.q0 b17 = ta1.q0.b(c0Var.getAppId(), c0Var);
                ta1.t0 t0Var = new ta1.t0() { // from class: ma1.i$$c
                    @Override // ta1.t0
                    public final void a(int i18, int i19, java.lang.String str, java.lang.Object obj) {
                        com.tencent.mm.plugin.appbrand.e9 e9Var = c0Var;
                        int i27 = i17;
                        ma1.i iVar = ma1.i.this;
                        iVar.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: pause result %d, %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                        if (i18 != 0 || i19 != 0) {
                            iVar.F(e9Var, i27, i18, i19, str);
                        } else {
                            iVar.G(e9Var, i27, null);
                            iVar.f325165g.y(e9Var);
                        }
                    }
                };
                b17.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger pause");
                b17.f416665a.postToWorker(new ta1.d0(b17, t0Var));
                return;
            }
            if ("resume".equalsIgnoreCase(optString)) {
                if (!c0Var.V0().l2()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: current game is not in foreground. ignore resume!");
                    F(c0Var, i17, 2, -2, "can not resume in background");
                    return;
                }
                ta1.q0 b18 = ta1.q0.b(c0Var.getAppId(), c0Var);
                ta1.t0 t0Var2 = new ta1.t0() { // from class: ma1.i$$a
                    @Override // ta1.t0
                    public final void a(int i18, int i19, java.lang.String str, java.lang.Object obj) {
                        com.tencent.mm.plugin.appbrand.e9 e9Var = c0Var;
                        int i27 = i17;
                        ma1.i iVar = ma1.i.this;
                        iVar.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: resume result %d, %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                        if (i18 != 0 || i19 != 0) {
                            iVar.F(e9Var, i27, i18, i19, str);
                        } else {
                            iVar.G(e9Var, i27, null);
                            iVar.f325165g.z(e9Var);
                        }
                    }
                };
                b18.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger resume");
                b18.f416665a.postToWorker(new ta1.e0(b18, t0Var2));
                return;
            }
            if ("abort".equalsIgnoreCase(optString)) {
                ta1.q0 b19 = ta1.q0.b(c0Var.getAppId(), c0Var);
                ta1.t0 t0Var3 = new ta1.t0() { // from class: ma1.i$$g
                    @Override // ta1.t0
                    public final void a(int i18, int i19, java.lang.String str, java.lang.Object obj) {
                        com.tencent.mm.plugin.appbrand.e9 e9Var = c0Var;
                        int i27 = i17;
                        ma1.i iVar = ma1.i.this;
                        iVar.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: abort result %d, %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                        if (i18 != 0 || i19 != 0) {
                            iVar.F(e9Var, i27, i18, i19, str);
                            return;
                        }
                        iVar.G(e9Var, i27, null);
                        ma1.a aVar = iVar.f325165g;
                        aVar.u(e9Var);
                        com.tencent.mars.xlog.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch abort");
                        java.util.HashMap hashMap = new java.util.HashMap(1);
                        hashMap.put("state", "abort");
                        aVar.t(hashMap);
                        aVar.m();
                    }
                };
                b19.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger abort");
                b19.f416665a.postToWorker(new ta1.h0(b19, t0Var3));
                return;
            }
            if (!"stop".equalsIgnoreCase(optString)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: invalid operate type: %s", optString);
                c0Var.a(i17, o(java.lang.String.format("fail: not valid operate type: %s", optString)));
                return;
            }
            ta1.q0 b27 = ta1.q0.b(c0Var.getAppId(), c0Var);
            ta1.t0 t0Var4 = new ta1.t0() { // from class: ma1.i$$f
                @Override // ta1.t0
                public final void a(int i18, int i19, java.lang.String str, java.lang.Object obj) {
                    ta1.r0 r0Var;
                    final com.tencent.mm.plugin.appbrand.e9 e9Var = c0Var;
                    final int i27 = i17;
                    ta1.p0 p0Var = (ta1.p0) obj;
                    final ma1.i iVar = ma1.i.this;
                    iVar.getClass();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: stop result %d, %d, %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                    if (i18 != 0 || i19 != 0) {
                        iVar.F(e9Var, i27, i18, i19, str);
                        return;
                    }
                    iVar.f325167i = null;
                    if (p0Var == null || (r0Var = p0Var.f416660a) == null || com.tencent.mm.sdk.platformtools.t8.K0(((ma1.c) r0Var).f325152a)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: callback ok without path!");
                        iVar.F(e9Var, i27, 1, -1, "stop success without filePath!");
                    } else {
                        final ma1.c cVar = (ma1.c) p0Var.f416660a;
                        final ma1.c cVar2 = (ma1.c) p0Var.f416661b;
                        ta1.q0 b28 = ta1.q0.b(e9Var.getAppId(), e9Var);
                        b28.f416665a.postToWorker(new ta1.j0(b28, cVar.f325152a, new ta1.t0() { // from class: ma1.i$$h
                            @Override // ta1.t0
                            public final void a(int i28, int i29, java.lang.String str2, java.lang.Object obj2) {
                                com.tencent.mm.plugin.appbrand.e9 e9Var2 = e9Var;
                                int i37 = i27;
                                ta1.k0 k0Var = (ta1.k0) obj2;
                                ma1.i iVar2 = ma1.i.this;
                                iVar2.getClass();
                                if (i28 != 0 || i29 != 0) {
                                    iVar2.F(e9Var2, i37, i28, i29, str2);
                                    return;
                                }
                                java.util.HashMap hashMap = new java.util.HashMap();
                                ma1.c cVar3 = cVar;
                                hashMap.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, cVar3.f325153b);
                                ma1.c cVar4 = cVar2;
                                hashMap.put("thumbPath", cVar4.f325153b);
                                iVar2.G(e9Var2, i37, hashMap);
                                long j17 = k0Var.f416636a * 1000;
                                long j18 = k0Var.f416637b;
                                ma1.a aVar = iVar2.f325165g;
                                aVar.u(e9Var2);
                                java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                                java.lang.Long valueOf2 = java.lang.Long.valueOf(j18);
                                java.lang.String str3 = cVar3.f325153b;
                                com.tencent.mars.xlog.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch stop: %s, %d, %d", str3, valueOf, valueOf2);
                                java.util.HashMap hashMap2 = new java.util.HashMap(4);
                                hashMap2.put("state", "stop");
                                hashMap2.put("tempFilePath", str3);
                                hashMap2.put("tempThumbPath", cVar4.f325153b);
                                hashMap2.put("duration", java.lang.Long.valueOf(j17));
                                hashMap2.put("fileSize", java.lang.Long.valueOf(j18));
                                aVar.t(hashMap2);
                                aVar.m();
                            }
                        }));
                    }
                }
            };
            b27.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger stop");
            b27.f416665a.postToWorker(new ta1.g0(b27, t0Var4));
            return;
        }
        ce.g gVar = (pa1.a) c0Var.V0().B1(pa1.a.class);
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView = gVar == null ? null : ((ce.o) gVar).f40686g;
        if (magicBrushView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: cannot retrieve magicbrush view!");
            F(c0Var, i17, 1, 111, "game view not prepared");
            return;
        }
        if (!c0Var.V0().l2()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: current game is not in foreground. ignore start!");
            F(c0Var, i17, 2, -2, "can not start in background");
            return;
        }
        qa1.u uVar = (qa1.u) magicBrushView.getF48652e();
        int surfaceWidth = uVar.getSurfaceWidth();
        int surfaceHeight = uVar.getSurfaceHeight();
        int optInt = jSONObject.optInt("duration");
        int optInt2 = jSONObject.optInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS);
        int optInt3 = jSONObject.optInt(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE) * 1000;
        int optInt4 = jSONObject.optInt("gop");
        boolean optBoolean = jSONObject.optBoolean("hookBgm", true);
        if (c0Var.getFileSystem() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: not file system");
            F(c0Var, i17, 1, -1, "no file system!");
            return;
        }
        ma1.c C = C(c0Var, "src_game_screenrecord.mp4", true);
        ma1.c C2 = C(c0Var, "src_game_screenrecord_thumb.jpg", true);
        if (C == null || C2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: WAGameJsApiScreenRecorderOperate, alloc file failed");
            F(c0Var, i17, 1, -1, "internal create file failed!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: given duration: %d, fps: %d, bitrate: %d, gop: %d, width: %d, height: %d, srcFileName: %s, srcThumbPath: %s, hookBgm: %b", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(optInt2), java.lang.Integer.valueOf(optInt3), java.lang.Integer.valueOf(optInt4), java.lang.Integer.valueOf(surfaceWidth), java.lang.Integer.valueOf(surfaceHeight), C.f325152a, C2.f325152a, java.lang.Boolean.valueOf(optBoolean));
        ta1.s0 s0Var = new ta1.s0();
        s0Var.f416675a = surfaceWidth;
        s0Var.f416676b = surfaceHeight;
        s0Var.f416682h = optInt;
        s0Var.f416679e = optInt2;
        s0Var.f416680f = optInt3;
        s0Var.f416681g = optInt4;
        s0Var.f416677c = C;
        s0Var.f416678d = C2;
        s0Var.f416683i = optBoolean;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        final long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ta1.q0 b28 = ta1.q0.b(c0Var.getAppId(), c0Var);
        ta1.t0 t0Var5 = new ta1.t0() { // from class: ma1.i$$d
            @Override // ta1.t0
            public final void a(int i18, int i19, java.lang.String str, java.lang.Object obj) {
                final ma1.i iVar = ma1.i.this;
                long j17 = elapsedRealtime;
                final com.tencent.mm.plugin.appbrand.service.c0 c0Var2 = c0Var;
                int i27 = i17;
                iVar.getClass();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: request start done! using: %d ms, %d, %d, %s", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
                if (i18 != 0 || i19 != 0) {
                    iVar.F(c0Var2, i27, i18, i19, str);
                    return;
                }
                iVar.f325167i = c0Var2.getAppId();
                iVar.f325166h = new u81.f() { // from class: ma1.i$$i
                    @Override // u81.f
                    public final void D(java.lang.String str2, u81.b bVar) {
                        final ma1.i iVar2 = ma1.i.this;
                        final com.tencent.mm.plugin.appbrand.service.c0 c0Var3 = c0Var2;
                        iVar2.getClass();
                        if (bVar == u81.b.BACKGROUND && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.equals(iVar2.f325167i)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: %s trigger background, pause recording", str2);
                            ta1.q0 b29 = ta1.q0.b(c0Var3.getAppId(), c0Var3);
                            ta1.t0 t0Var6 = new ta1.t0() { // from class: ma1.i$$j
                                @Override // ta1.t0
                                public final void a(int i28, int i29, java.lang.String str3, java.lang.Object obj2) {
                                    ma1.i iVar3 = ma1.i.this;
                                    iVar3.getClass();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: active pause result %d, %d, %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), str3);
                                    if (i28 == 0 && i29 == 0) {
                                        iVar3.f325165g.y(c0Var3);
                                    }
                                }
                            };
                            b29.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger pause");
                            b29.f416665a.postToWorker(new ta1.d0(b29, t0Var6));
                            return;
                        }
                        if (bVar == u81.b.FOREGROUND && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.equals(iVar2.f325167i)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: %s trigger foreground, resume recording", str2);
                            ta1.q0 b37 = ta1.q0.b(c0Var3.getAppId(), c0Var3);
                            ta1.t0 t0Var7 = new ta1.t0() { // from class: ma1.i$$k
                                @Override // ta1.t0
                                public final void a(int i28, int i29, java.lang.String str3, java.lang.Object obj2) {
                                    ma1.i iVar3 = ma1.i.this;
                                    iVar3.getClass();
                                    com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiScreenRecorderOperate", "hy: active resume result %d, %d, %s", java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29), str3);
                                    if (i28 == 0 && i29 == 0) {
                                        iVar3.f325165g.z(c0Var3);
                                    }
                                }
                            };
                            b37.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger resume");
                            b37.f416665a.postToWorker(new ta1.e0(b37, t0Var7));
                            return;
                        }
                        if (bVar == u81.b.DESTROYED) {
                            java.util.Map map = ta1.q0.f416663g;
                            synchronized (ta1.q0.class) {
                                ((java.util.HashMap) ta1.q0.f416663g).remove(str2);
                            }
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && str2.equals(iVar2.f325167i)) {
                                ta1.q0 b38 = ta1.q0.b(c0Var3.getAppId(), c0Var3);
                                ma1.i$$b i__b = new ma1.i$$b();
                                b38.getClass();
                                com.tencent.mars.xlog.Log.i("MicroMsg.GameRecorderMgr", "hy: trigger abort");
                                b38.f416665a.postToWorker(new ta1.h0(b38, i__b));
                            }
                            iVar2.f325167i = null;
                            if (c0Var3.t3() == null || c0Var3.t3().N == null) {
                                return;
                            }
                            c0Var3.t3().N.c(iVar2.f325166h);
                        }
                    }
                };
                if (c0Var2.t3() != null && c0Var2.t3().N != null) {
                    c0Var2.t3().N.a(iVar.f325166h);
                }
                iVar.G(c0Var2, i27, null);
                ma1.a aVar = iVar.f325165g;
                aVar.u(c0Var2);
                com.tencent.mars.xlog.Log.i("MicroMsg.OnGameRecorderStateChangeEvent", "hy: dispatch start");
                java.util.HashMap hashMap = new java.util.HashMap(1);
                hashMap.put("state", "start");
                aVar.t(hashMap);
                aVar.m();
            }
        };
        ma1.i$$e i__e = new ma1.i$$e(this, c0Var);
        com.tencent.magicbrush.ui.MagicBrushView magicBrushView2 = (com.tencent.magicbrush.ui.MagicBrushView) b28.f416666b.f416605b.get();
        if (magicBrushView2 != null) {
            magicBrushView2.e(false, 1, new ta1.a0(b28, t0Var5, s0Var, i__e, magicBrushView2));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.GameRecorderMgr", "hy: view lost");
            t0Var5.a(1, -2, "view lost", null);
        }
    }

    public final void F(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, int i18, int i19, java.lang.String str) {
        java.lang.String format = java.lang.String.format("fail: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("errCode", java.lang.Integer.valueOf(i19));
        e9Var.a(i17, p(format, hashMap));
        this.f325165g.x(e9Var, i19, str);
    }

    public final void G(com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, java.util.Map map) {
        java.util.HashMap hashMap = new java.util.HashMap(1);
        hashMap.put("errCode", 0);
        if (map != null) {
            hashMap.putAll(map);
        }
        e9Var.a(i17, p("ok", hashMap));
    }
}
