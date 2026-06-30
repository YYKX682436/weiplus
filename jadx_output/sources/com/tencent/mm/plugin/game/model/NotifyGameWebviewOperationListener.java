package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class NotifyGameWebviewOperationListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent> {

    /* renamed from: f, reason: collision with root package name */
    public static volatile long f140180f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile long f140181g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile java.lang.String f140182h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Set f140183i = new java.util.HashSet();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Set f140184m = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public long f140185d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.w3 f140186e;

    @mk0.a
    /* loaded from: classes8.dex */
    public static class a implements com.tencent.mm.ipcinvoker.j {
        private a() {
        }

        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            if (bundle == null) {
                if (rVar != null) {
                    rVar.a(bundle);
                    return;
                }
                return;
            }
            java.lang.String string = bundle.getString("call_raw_url");
            boolean z17 = bundle.getBoolean("preload_webcore", false);
            if (z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload webcore");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload entrance url:%s, isToolsProcess:%b", string, java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.x2.s()));
            if (com.tencent.mm.ipcinvoker.d0.g(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preload wepkg");
                com.tencent.mm.plugin.wepkg.utils.n.d().postToWorker(new com.tencent.mm.plugin.game.model.t3(this, bundle, z17, rVar));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "prestart WepkgMainProcessService and preload wepkg");
                com.tencent.mm.plugin.wepkg.utils.n.a(string, new com.tencent.mm.plugin.game.model.v3(this, bundle, z17, rVar));
            }
        }
    }

    public NotifyGameWebviewOperationListener() {
        super(com.tencent.mm.app.a0.f53288d);
        this.__eventId = 1423904129;
    }

    public static void c(android.os.Bundle bundle, boolean z17, com.tencent.mm.ipcinvoker.r rVar) {
        synchronized (com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.class) {
            boolean z18 = bundle.getBoolean("is_luggage", false);
            java.lang.String string = bundle.getString("call_raw_url");
            java.lang.String string2 = bundle.getString("float_layer_url");
            com.tencent.mm.game.report.api.GameWebPerformanceInfo b17 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(string);
            if (z18) {
                sd.o0 c17 = com.tencent.mm.plugin.game.luggage.p1.c(string);
                if (c17 != null) {
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "has preloaded webcore, return");
                    } else {
                        com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.game.model.q3(c17));
                        com.tencent.mm.plugin.game.luggage.v0.b(c17, string, true);
                    }
                    bundle.putBoolean("has_preload_webcore", true);
                    if (rVar != null) {
                        rVar.a(bundle);
                    }
                } else if (!z17) {
                    e(string2);
                    e(string);
                    if (rVar != null) {
                        rVar.a(bundle);
                    }
                } else {
                    if (b17.f68187t != 0) {
                        rVar.a(bundle);
                        return;
                    }
                    if (!e(string)) {
                        if (rVar != null) {
                            rVar.a(bundle);
                        }
                    } else {
                        e(string2);
                        b17.f68178h = 1;
                        b17.f68190w = java.lang.System.currentTimeMillis();
                        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(939L, 0L, 1L);
                        com.tencent.mm.plugin.game.luggage.p1.e(com.tencent.mm.plugin.game.luggage.s1.class, string, new com.tencent.mm.plugin.game.model.s3(string, b17, rVar, bundle));
                    }
                }
            } else {
                e(string2);
                e(string);
                if (rVar != null) {
                    rVar.a(bundle);
                }
            }
        }
    }

    public static boolean e(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.plugin.wepkg.utils.n.f(str)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "preloadWePkg, url: %s", str);
        com.tencent.mm.game.report.api.GameWebPerformanceInfo b17 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(str);
        b17.f68188u = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.wepkg.model.s c17 = vz4.s.c(str);
        b17.f68189v = java.lang.System.currentTimeMillis();
        return c17.f188395a == 0;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public /* bridge */ /* synthetic */ boolean callback(com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent) {
        d(notifyGameWebviewOperationEvent);
        return false;
    }

    public boolean d(com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "callback, type = %d", java.lang.Integer.valueOf(notifyGameWebviewOperationEvent.f54542g.f7433a));
        am.nl nlVar = notifyGameWebviewOperationEvent.f54542g;
        if (nlVar.f7435c == null) {
            return false;
        }
        if (nlVar.f7433a == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "interval: %d, lastActionTime: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f140185d), java.lang.Long.valueOf(this.f140185d));
            if (java.lang.System.currentTimeMillis() - this.f140185d < 500) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "interval smaller than 500 ms, return");
                return false;
            }
        }
        this.f140185d = java.lang.System.currentTimeMillis();
        am.nl nlVar2 = notifyGameWebviewOperationEvent.f54542g;
        int i17 = nlVar2.f7433a;
        if (i17 == 0 || i17 == 1 || i17 == 2) {
            java.lang.Object[] objArr = new java.lang.Object[5];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = java.lang.Integer.valueOf(hashCode());
            objArr[2] = java.lang.Integer.valueOf(notifyGameWebviewOperationEvent.hashCode());
            objArr[3] = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
            objArr[4] = java.lang.Boolean.valueOf(java.lang.Thread.currentThread() == android.os.Looper.getMainLooper().getThread());
            com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "on NotifyGameWebviewOperationListener operation listener, type:%d, hashcode:%s, event hashcode:%s, threadId:%s, isUIThead:%s", objArr);
            java.lang.String str = "";
            try {
                str = notifyGameWebviewOperationEvent.f54542g.f7435c.getStringExtra("rawUrl");
            } catch (java.lang.Exception unused) {
            }
            java.lang.String stringExtra = notifyGameWebviewOperationEvent.f54542g.f7435c.getStringExtra("game_float_layer_url");
            synchronized (com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.class) {
                java.lang.String str2 = f140182h;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                if (str2.equalsIgnoreCase(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "forbid to open same page two times");
                    return false;
                }
                f140182h = str;
                f140180f = java.lang.System.currentTimeMillis();
                f140181g = java.lang.System.currentTimeMillis();
                if (com.tencent.mm.plugin.wepkg.utils.n.f(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "exist pkgid:%s, to reload", kh0.i.a(str));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(kk.k.g((str == null ? "" : str).getBytes()));
                    sb6.append("_");
                    sb6.append(java.lang.System.currentTimeMillis());
                    notifyGameWebviewOperationEvent.f54542g.f7436d = sb6.toString();
                    com.tencent.mm.plugin.game.model.w3 w3Var = new com.tencent.mm.plugin.game.model.w3(this, notifyGameWebviewOperationEvent);
                    this.f140186e = w3Var;
                    com.tencent.mm.sdk.platformtools.u3.i(w3Var, 500L);
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putString("call_raw_url", str);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                        bundle.putString("float_layer_url", stringExtra);
                    }
                    if (notifyGameWebviewOperationEvent.f54542g.f7433a == 2) {
                        bundle.putBoolean("is_luggage", true);
                    }
                    com.tencent.mm.plugin.game.luggage.p.a(bundle, com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.a.class, new com.tencent.mm.plugin.game.model.l3(this, notifyGameWebviewOperationEvent));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "dont have pkgid or disable wepkg, normal turn page.");
                    f(notifyGameWebviewOperationEvent, null);
                }
            }
        } else if (i17 == 3) {
            java.lang.String stringExtra2 = nlVar2.f7435c.getStringExtra("rawUrl");
            java.util.Set set = f140184m;
            if (!((java.util.HashSet) set).contains(stringExtra2) && com.tencent.mm.plugin.wepkg.utils.n.f(stringExtra2)) {
                ((java.util.HashSet) set).add(stringExtra2);
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("call_raw_url", stringExtra2);
                bundle2.putBoolean("preload_webcore", true);
                bundle2.putBoolean("is_luggage", true);
                com.tencent.mm.plugin.game.luggage.p.a(bundle2, com.tencent.mm.plugin.game.model.NotifyGameWebviewOperationListener.a.class, new com.tencent.mm.plugin.game.model.m3(this, stringExtra2));
                com.tencent.mm.ipcinvoker.w0.d(new com.tencent.mm.plugin.game.model.n3(this, stringExtra2), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
            }
        }
        return false;
    }

    public final synchronized void f(com.tencent.mm.autogen.events.NotifyGameWebviewOperationEvent notifyGameWebviewOperationEvent, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turnPage");
        com.tencent.mm.sdk.platformtools.u3.l(this.f140186e);
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.game.model.o3(this), 1000L);
        if (notifyGameWebviewOperationEvent == null) {
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(notifyGameWebviewOperationEvent.f54542g.f7436d)) {
            java.util.Set set = f140183i;
            if (((java.util.HashSet) set).contains(notifyGameWebviewOperationEvent.f54542g.f7436d)) {
                ((java.util.HashSet) set).remove(notifyGameWebviewOperationEvent.f54542g.f7436d);
                return;
            }
            ((java.util.HashSet) set).add(notifyGameWebviewOperationEvent.f54542g.f7436d);
        }
        am.nl nlVar = notifyGameWebviewOperationEvent.f54542g;
        android.content.Context context = nlVar.f7434b;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        if (nlVar.f7435c == null) {
            nlVar.f7435c = new android.content.Intent();
        }
        java.lang.String stringExtra = notifyGameWebviewOperationEvent.f54542g.f7435c.getStringExtra("rawUrl");
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turn page, start web ui, time: " + java.lang.System.currentTimeMillis());
        notifyGameWebviewOperationEvent.f54542g.f7435c.putExtra("start_activity_time", java.lang.System.currentTimeMillis());
        am.nl nlVar2 = notifyGameWebviewOperationEvent.f54542g;
        int i17 = nlVar2.f7433a;
        if (i17 == 0) {
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", nlVar2.f7435c, null);
        } else if (i17 == 1) {
            j45.l.j(context, "webview", ".ui.tools.TransparentWebViewUI", nlVar2.f7435c, null);
        } else if (i17 == 2) {
            com.tencent.mm.ipcinvoker.w0.d(new com.tencent.mm.plugin.game.model.p3(this, context, notifyGameWebviewOperationEvent), bundle != null ? bundle.getBoolean("has_preload_webcore", false) : false ? 100L : 0L);
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - f140180f;
        com.tencent.mars.xlog.Log.i("MicroMsg.Wepkg.NotifyGameWebviewOperationListener", "turn to GameWebViewUI time:%d", java.lang.Long.valueOf(currentTimeMillis));
        try {
            notifyGameWebviewOperationEvent.f54542g.f7434b = null;
        } catch (java.lang.Exception unused) {
        }
        java.lang.Object obj = com.tencent.mm.plugin.wepkg.utils.n.f188501a;
        com.tencent.mm.plugin.wepkg.utils.a.c("preloadWebTime", stringExtra, kh0.i.a(stringExtra), null, -1L, currentTimeMillis, null);
    }
}
