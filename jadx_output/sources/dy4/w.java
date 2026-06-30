package dy4;

/* loaded from: classes8.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public dy4.d f244716b;

    /* renamed from: c, reason: collision with root package name */
    public dy4.f1 f244717c;

    /* renamed from: d, reason: collision with root package name */
    public double f244718d;

    /* renamed from: e, reason: collision with root package name */
    public int f244719e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f244720f;

    /* renamed from: g, reason: collision with root package name */
    public int f244721g;

    /* renamed from: h, reason: collision with root package name */
    public org.json.JSONObject f244722h;

    /* renamed from: j, reason: collision with root package name */
    public int f244724j;

    /* renamed from: l, reason: collision with root package name */
    public z41.c f244726l;

    /* renamed from: m, reason: collision with root package name */
    public android.database.ContentObserver f244727m;

    /* renamed from: n, reason: collision with root package name */
    public android.content.BroadcastReceiver f244728n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.k0 f244729o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.l0 f244730p;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f244715a = "MicroMsg.WebViewVideoEventHandler:" + hashCode();

    /* renamed from: i, reason: collision with root package name */
    public final cy4.f f244723i = new dy4.o(this);

    /* renamed from: k, reason: collision with root package name */
    public int f244725k = -1;

    public final void a(java.lang.String event, org.json.JSONObject jSONObject) {
        dy4.d dVar = this.f244716b;
        if (dVar != null) {
            jSONObject.put("__timestamp", java.lang.System.currentTimeMillis());
            nw4.y2 y2Var = dVar.f244614b;
            android.os.Bundle bundle = y2Var.f341015e;
            java.lang.String str = (bundle == null || !bundle.containsKey(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)) ? null : (java.lang.String) y2Var.f341015e.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            nw4.k kVar = dVar.f244613a;
            if (K0) {
                nw4.g gVar = kVar.f340863d;
                if (gVar instanceof nw4.n) {
                    kotlin.jvm.internal.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                    ((nw4.n) gVar).p(event, jSONObject);
                    return;
                }
                return;
            }
            nw4.g gVar2 = kVar.f340863d;
            if (gVar2 instanceof nw4.n) {
                kotlin.jvm.internal.o.e(gVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
                com.tencent.mm.plugin.webview.webcompt.y1 y17 = ((nw4.n) gVar2).y();
                if (y17 != null) {
                    kotlin.jvm.internal.o.d(str);
                    java.lang.String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.o.g(event, "event");
                    y17.c().e(str, event, jSONObject2);
                }
            }
        }
    }

    public final java.lang.String b() {
        com.tencent.mm.plugin.appbrand.video.player.thumb.p pVar = com.tencent.mm.plugin.appbrand.video.player.thumb.p.f90900a;
        dy4.f1 f1Var = this.f244717c;
        java.lang.String a17 = pVar.a(f1Var != null ? f1Var.D : null);
        dy4.f1 f1Var2 = this.f244717c;
        if (!kotlin.jvm.internal.o.b(f1Var2 != null ? f1Var2.D : null, null)) {
            this.f244721g = 0;
        }
        long b17 = pVar.b(a17);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("clientMediaId", a17);
        dy4.f1 f1Var3 = this.f244717c;
        jSONObject.put("isOpenVideoPreload", f1Var3 != null ? ((java.lang.Boolean) ((jz5.n) f1Var3.f244625l1).getValue()).booleanValue() : false);
        jSONObject.put("previousCompletedSize", b17);
        jSONObject.put("playCount", this.f244721g);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mars.xlog.Log.i(this.f244715a, "generateWaitingReadyExtInfo:".concat(jSONObject2));
        return jSONObject2;
    }

    public final org.json.JSONObject c() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = this.f244722h;
        if (jSONObject2 != null) {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2);
        }
        return jSONObject;
    }

    public final void d(java.lang.String str, org.json.JSONObject jSONObject) {
        java.lang.String str2 = this.f244715a;
        com.tencent.mars.xlog.Log.i(str2, "onPlayerProcessStateChanged event=" + str);
        if (jSONObject == null) {
            try {
                jSONObject = c();
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e(str2, "onPlayerProcessStateChanged " + str + " fail", e17);
                return;
            }
        }
        jSONObject.put("event", str);
        a("onPlayerProcessStateChanged", jSONObject);
    }

    public final void e(boolean z17) {
        try {
            a("onVideoPause", c());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e(this.f244715a, "OnXWebVideoPause fail", e17);
        }
        i();
        com.tencent.mm.sdk.platformtools.u3.h(new dy4.v(this));
    }

    public final void f(boolean z17) {
        java.lang.String str = this.f244715a;
        try {
            this.f244719e = 0;
            a("onVideoPlay", c());
            com.tencent.mars.xlog.Log.i(str, "start video update timer");
            if (this.f244720f == null) {
                com.tencent.mars.xlog.Log.i(str, "start video update timer, create new timer");
                this.f244720f = new com.tencent.mm.sdk.platformtools.b4("VideoUpdateTimer", (com.tencent.mm.sdk.platformtools.a4) new dy4.u(this), true);
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var = this.f244720f;
            if (b4Var != null) {
                b4Var.c(0L, 250L);
            }
            com.tencent.mm.sdk.platformtools.u3.h(new dy4.t(this));
            com.tencent.mars.xlog.Log.i(str, "onPlayingReport");
            try {
                d("Playing", null);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e(str, "onPlayingReport fail", e17);
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.e(str, "OnXWebVideoPlay fail", e18);
        }
    }

    public final void g() {
        try {
            a("onVideoWaiting", c());
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e(this.f244715a, "OnXWebVideoWaiting fail", e17);
        }
    }

    public final void h(sf.f fVar) {
        if (fVar instanceof dy4.d) {
            dy4.d dVar = (dy4.d) fVar;
            this.f244716b = dVar;
            java.lang.Object obj = dVar.f244613a.f340860a;
            dy4.b bVar = obj instanceof dy4.b ? (dy4.b) obj : null;
            if (bVar != null) {
                bVar.q3(this.f244723i);
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (this.f244726l == null) {
                this.f244726l = new z41.c(context, new dy4.s(this));
            }
            android.database.ContentObserver contentObserver = this.f244727m;
            java.lang.String str = this.f244715a;
            if (contentObserver == null) {
                this.f244727m = new dy4.n(new android.os.Handler(), new java.lang.ref.WeakReference(this));
                android.content.ContentResolver contentResolver = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext().getContentResolver();
                android.net.Uri uriFor = android.provider.Settings.System.getUriFor("screen_brightness");
                try {
                    android.database.ContentObserver contentObserver2 = this.f244727m;
                    kotlin.jvm.internal.o.d(contentObserver2);
                    contentResolver.registerContentObserver(uriFor, false, contentObserver2);
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "initBrightnessObserver", new java.lang.Object[0]);
                }
            }
            if (this.f244728n == null) {
                final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
                this.f244728n = new android.content.BroadcastReceiver(weakReference) { // from class: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.WebViewVideoEventHandler$VolumeBroadcastReceiver

                    /* renamed from: a, reason: collision with root package name */
                    public final java.lang.ref.WeakReference f186974a;

                    /* renamed from: b, reason: collision with root package name */
                    public final java.lang.String f186975b;

                    {
                        kotlin.jvm.internal.o.g(weakReference, "weakEventHandler");
                        this.f186974a = weakReference;
                        this.f186975b = "MicroMsg.VolumeBroadcastReceiver";
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(android.content.Context context2, android.content.Intent intent) {
                        if (context2 == null || intent == null || !kotlin.jvm.internal.o.b("android.media.VOLUME_CHANGED_ACTION", intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3) {
                            return;
                        }
                        try {
                            dy4.w wVar = (dy4.w) this.f186974a.get();
                            if (wVar == null) {
                                return;
                            }
                            wVar.a("onVolumeChange", wVar.c());
                        } catch (org.json.JSONException e17) {
                            com.tencent.mars.xlog.Log.e(this.f186975b, "onVolumeChange fail " + e17.getMessage());
                        }
                    }
                };
                try {
                    android.content.IntentFilter intentFilter = new android.content.IntentFilter();
                    intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
                    com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f244728n, intentFilter);
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str, th7, "initBrightnessObserver", new java.lang.Object[0]);
                }
            }
            z41.c cVar = this.f244726l;
            if (cVar != null) {
                cVar.enable();
            }
            com.tencent.mm.plugin.webview.model.k0 k0Var = this.f244729o;
            if (k0Var != null) {
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                java.util.ArrayList arrayList = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186985b;
                synchronized (arrayList) {
                    arrayList.remove(k0Var);
                }
            }
            this.f244729o = new dy4.p(this);
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b bVar2 = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186984a;
            com.tencent.mm.plugin.webview.model.k0 k0Var2 = this.f244729o;
            kotlin.jvm.internal.o.d(k0Var2);
            java.util.ArrayList arrayList2 = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186985b;
            synchronized (arrayList2) {
                arrayList2.size();
                arrayList2.add(k0Var2);
            }
            com.tencent.mm.plugin.webview.model.l0 l0Var = this.f244730p;
            if (l0Var != null) {
                ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
                java.util.ArrayList arrayList3 = com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.b.f186986c;
                synchronized (arrayList3) {
                    arrayList3.remove(l0Var);
                }
            }
            this.f244730p = new dy4.q(this);
            ((yg0.q4) ((zg0.p3) i95.n0.c(zg0.p3.class))).getClass();
            com.tencent.mm.plugin.webview.model.l0 l0Var2 = this.f244730p;
            kotlin.jvm.internal.o.d(l0Var2);
            bVar2.a(l0Var2);
        }
    }

    public final void i() {
        com.tencent.mars.xlog.Log.i(this.f244715a, "stop video update timer");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f244720f;
        if (b4Var != null) {
            b4Var.d();
        }
    }
}
