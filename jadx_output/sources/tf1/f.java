package tf1;

/* loaded from: classes7.dex */
public class f extends com.tencent.mm.plugin.appbrand.backgroundrunning.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime f418858d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f418859e;

    /* renamed from: f, reason: collision with root package name */
    public final tf1.i f418860f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f418861g;

    /* renamed from: h, reason: collision with root package name */
    public volatile tf1.e f418862h = null;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f418863i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f418864m = true;

    /* renamed from: n, reason: collision with root package name */
    public volatile tf.q f418865n = null;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f418866o = new java.lang.Object();

    /* renamed from: p, reason: collision with root package name */
    public boolean f418867p = false;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f418868q = new java.util.HashSet(8);

    /* renamed from: r, reason: collision with root package name */
    public boolean f418869r = true;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f418870s = new android.util.ArrayMap();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f418871t = new java.util.ArrayList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f418872u = new java.util.ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f418873v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f418874w = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f418875x = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: y, reason: collision with root package name */
    public android.view.Surface f418876y = null;

    public f(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f418858d = appBrandRuntime;
        java.lang.String str = appBrandRuntime.f74803n;
        this.f418859e = str;
        this.f418860f = new tf1.i(this);
        this.f418861g = !appBrandRuntime.V;
        com.tencent.mm.plugin.appbrand.x0.a(str, new tf1.a(this));
    }

    public final void A(tf.q qVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playVideo, videoPlayer:" + qVar.getName());
        tf.u uVar = (tf.u) qVar.h(tf.u.class);
        if (uVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playVideo, videoPlayerAddOnPlayAudio is null");
        } else {
            uVar.h();
            n(qVar);
        }
    }

    public boolean a(tf.q qVar) {
        boolean z17;
        boolean z18;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "amIBackgroundAudioPlayer, videoPlayer: " + qVar.getName() + ", pauseType: " + com.tencent.mm.plugin.appbrand.x0.d(this.f418859e));
        synchronized (this.f418866o) {
            z17 = false;
            z18 = !this.f418873v.isEmpty() && qVar == this.f418873v.getFirst();
        }
        if (z18 && this.f418875x.getAndSet(false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "amIBackgroundAudioPlayer, ignore");
        } else {
            z17 = z18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "amIBackgroundAudioPlayer, amIBackgroundAudioPlayer: " + z17);
        return z17;
    }

    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "disableAppBrandBackgroundRun");
        com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent = new com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent();
        java.lang.String str = this.f418859e;
        xf1.a aVar = appBrandBackgroundRunningOperationEvent.f83923g;
        aVar.f454222a = str;
        aVar.f454223b = 64;
        aVar.f454224c = 2;
        appBrandBackgroundRunningOperationEvent.e();
    }

    public void c(tf.q qVar, boolean z17) {
        boolean z18;
        boolean z19;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "disableBackgroundPlayAudio, videoPlayer:" + qVar.getName() + ", isExitBackgroundPlay: " + z17);
        synchronized (this.f418866o) {
            ((android.util.ArrayMap) this.f418870s).remove(qVar);
            tf.q g17 = g();
            if (!this.f418873v.contains(qVar) && g17 != qVar) {
                ((java.util.ArrayList) this.f418871t).remove(qVar);
                z19 = false;
                z18 = false;
            }
            if (!this.f418861g) {
                this.f418873v.remove(qVar);
            }
            z18 = true;
            if (g17 == qVar) {
                z19 = false;
            } else {
                z19 = true;
                z18 = false;
            }
        }
        if (z18) {
            x();
            if (!this.f418861g) {
                b();
                this.f418865n = null;
            }
            this.f418860f.a();
        }
        if (z17) {
            this.f418867p = false;
            ((java.util.HashSet) this.f418868q).clear();
        }
        if (!z19 || this.f418861g) {
            return;
        }
        A(qVar);
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "enableAppBrandBackgroundRun");
        com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent appBrandBackgroundRunningOperationEvent = new com.tencent.mm.plugin.appbrand.jsapi.xwebplugin.live.AppBrandBackgroundRunningOperationEvent();
        java.lang.String str = this.f418859e;
        xf1.a aVar = appBrandBackgroundRunningOperationEvent.f83923g;
        aVar.f454222a = str;
        aVar.f454223b = 64;
        aVar.f454224c = 1;
        appBrandBackgroundRunningOperationEvent.e();
        r(true);
    }

    public boolean e(tf.q qVar) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "enableBackgroundPlayAudio, videoPlayer: %s", qVar.getName());
        if (this.f418861g && !this.f418867p) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "enableBackgroundPlayAudio, current is in background and not enable float ball");
            return true;
        }
        this.f418867p = true;
        synchronized (this.f418866o) {
            ((java.util.HashSet) this.f418868q).add(qVar);
            ((android.util.ArrayMap) this.f418870s).put(qVar, java.lang.Boolean.TRUE);
            if (((java.util.ArrayList) this.f418872u).contains(qVar)) {
                ((java.util.ArrayList) this.f418872u).remove(qVar);
                this.f418873v.remove(qVar);
                this.f418873v.addFirst(qVar);
                tf.v vVar = (tf.v) qVar.h(tf.v.class);
                z17 = vVar != null ? vVar.isPlaying() : true;
            } else {
                ((java.util.ArrayList) this.f418871t).remove(qVar);
                ((java.util.ArrayList) this.f418871t).add(qVar);
                z17 = false;
            }
        }
        if (z17) {
            z(qVar);
        }
        return true;
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "exitBackgroundPlay");
        this.f418867p = false;
        tf.q g17 = g();
        if (g17 != null && !this.f418873v.isEmpty() && g17 == this.f418873v.getFirst()) {
            this.f418873v.removeFirst();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "remove background player success");
        }
        ((java.util.HashSet) this.f418868q).clear();
        tf1.e eVar = this.f418862h;
        if (eVar != null) {
            eVar.d();
        }
        java.util.Iterator it = new java.util.ArrayList(this.f418863i).iterator();
        while (it.hasNext()) {
            ((tf1.e) it.next()).d();
        }
    }

    public tf.q g() {
        tf.q qVar = this.f418865n;
        if (qVar == null || !this.f418875x.get()) {
            return qVar;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getBackgroundAudioPlayer, ignore");
        return null;
    }

    public java.lang.String h() {
        tf.q g17 = g();
        if (g17 == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getPosterPath, videoPlayer:" + g17.getName());
        tf.t tVar = (tf.t) g17.h(tf.t.class);
        if (tVar != null) {
            return tVar.e();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getPosterPath, playerAddOnInfo is null");
        return null;
    }

    public java.lang.String i() {
        tf.q g17 = g();
        if (g17 == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getTitle, videoPlayer:" + g17.getName());
        tf.t tVar = (tf.t) g17.h(tf.t.class);
        if (tVar != null) {
            return tVar.getTitle();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getTitle, playerAddOnInfo is null");
        return null;
    }

    public float j() {
        tf.q g17 = g();
        if (g17 == null) {
            return 1.0f;
        }
        tf.v vVar = (tf.v) g17.h(tf.v.class);
        if (vVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getVideoAspectRatio, playerAddOnVideoController is null");
            return 1.0f;
        }
        float b17 = vVar.b();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ljd getVideoAspectRatio aspectRatio:%f", java.lang.Float.valueOf(b17));
        return b17;
    }

    public void k(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ignoreRuntimeResumePauseOnce, ignoreBackgroundAudioPlayer: " + z17);
        this.f418874w.set(true);
        this.f418875x.set(z17);
    }

    public boolean l() {
        tf.q g17 = g();
        if (g17 == null) {
            return true;
        }
        tf.v vVar = (tf.v) g17.h(tf.v.class);
        if (vVar != null) {
            return vVar.isPlaying();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startPlay, playerAddOnVideoController is null");
        return true;
    }

    public void m(tf.q qVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayPauseOrStop, videoPlayer:" + qVar.getName());
        synchronized (this.f418866o) {
            if (z17) {
                if (this.f418873v.contains(qVar)) {
                    this.f418873v.remove(qVar);
                    if (this.f418867p) {
                        ((java.util.ArrayList) this.f418871t).add(qVar);
                    }
                } else {
                    ((java.util.ArrayList) this.f418872u).remove(qVar);
                }
            } else if (this.f418867p) {
                ((java.util.ArrayList) this.f418871t).add(qVar);
            }
        }
        if (g() == qVar) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayPauseOrStop, disableAppBrandBackgroundRun");
            if (this.f418864m) {
                return;
            }
            this.f418860f.a();
        }
    }

    public void n(tf.q qVar) {
        boolean z17;
        boolean z18;
        tf.v vVar;
        java.lang.Boolean bool;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayStart, videoPlayer:" + qVar.getName());
        synchronized (this.f418866o) {
            z17 = false;
            if (((java.util.ArrayList) this.f418871t).contains(qVar)) {
                ((java.util.ArrayList) this.f418871t).remove(qVar);
                this.f418873v.remove(qVar);
                this.f418873v.addFirst(qVar);
                z18 = true;
            } else {
                ((java.util.ArrayList) this.f418872u).remove(qVar);
                ((java.util.ArrayList) this.f418872u).add(qVar);
                z18 = false;
            }
        }
        if (this.f418861g && z18) {
            synchronized (this.f418866o) {
                bool = (java.lang.Boolean) ((android.util.ArrayMap) this.f418870s).get(qVar);
            }
            if (bool != null && bool.booleanValue()) {
                z17 = true;
            }
            if (z17) {
                z(qVar);
            }
        }
        boolean z19 = this.f418867p;
        if (this.f418861g && g() != null && !z19) {
            d();
        }
        if (this.f418861g) {
            tf.v vVar2 = (tf.v) qVar.h(tf.v.class);
            if (vVar2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayStart, playerAddOnVideoController is null");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ljd markVideoPlayStart onSetPlaybackSurface");
            tf.q qVar2 = this.f418865n;
            if (qVar2 != qVar && qVar2 != null && (vVar = (tf.v) qVar2.h(tf.v.class)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ljd markVideoPlayStart set prePlayer surface null");
                vVar.a(null);
                vVar.i();
            }
            if (this.f418876y != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ljd markVideoPlayStart set current player surface");
                vVar2.a(this.f418876y);
            }
            this.f418865n = qVar;
            r(true);
        }
    }

    public void o(tf.q qVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayerRelease, videoPlayer:" + qVar.getName());
        synchronized (this.f418866o) {
            ((java.util.ArrayList) this.f418871t).remove(qVar);
            ((java.util.ArrayList) this.f418872u).remove(qVar);
            this.f418873v.remove(qVar);
        }
        if (g() == qVar) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "markVideoPlayerRelease, disableAppBrandBackgroundRun");
            b();
            if (this.f418864m) {
                return;
            }
            this.f418860f.a();
            this.f418865n = null;
        }
    }

    public final void p() {
        tf1.e eVar = this.f418862h;
        if (eVar != null) {
            eVar.e();
        }
        java.util.Iterator it = new java.util.ArrayList(this.f418863i).iterator();
        while (it.hasNext()) {
            ((tf1.e) it.next()).e();
        }
    }

    public final void q() {
        tf1.e eVar = this.f418862h;
        if (eVar != null) {
            eVar.b();
        }
        java.util.Iterator it = new java.util.ArrayList(this.f418863i).iterator();
        while (it.hasNext()) {
            ((tf1.e) it.next()).b();
        }
    }

    public void r(boolean z17) {
        tf.q g17 = g();
        if (g17 == null) {
            return;
        }
        tf.v vVar = (tf.v) g17.h(tf.v.class);
        if (vVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onBackgroundPlaybackChange, playerAddOnVideoController is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onBackgroundPlaybackChange playInBackground:%b", java.lang.Boolean.valueOf(z17));
        vVar.f(z17);
        com.tencent.mm.sdk.platformtools.u3.i(new tf1.d(this), 1000L);
    }

    public void s(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        java.lang.String wi6;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, pauseType: " + w0Var);
        this.f418861g = true;
        tf.q g17 = g();
        if (g17 != null) {
            q();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, backgroundAudioPlayer: " + g17.getName());
            return;
        }
        synchronized (this.f418866o) {
            if (!this.f418873v.isEmpty()) {
                g17 = (tf.q) this.f418873v.getFirst();
            }
            if (g17 == null && this.f418867p && !((java.util.ArrayList) this.f418871t).isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, has BackgroundAudioPlayEnabledPlayers");
                g17 = (tf.q) ((java.util.ArrayList) this.f418871t).get(0);
            }
            if (g17 == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, backgroundAudioPlayer is null");
                return;
            }
            this.f418865n = g17;
            bg1.v vVar = (bg1.v) this.f418858d.k(bg1.v.class);
            if (vVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getBanBackgroundRunHint, helper is null");
                wi6 = null;
            } else {
                wi6 = ((com.tencent.mm.plugin.appbrand.utils.t0) vVar).wi(this.f418858d.f74803n, this.f418858d.f74805p.f77281g);
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "getBanBackgroundRunHint, banHint: ", wi6);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, ban");
                x();
                ((ku5.t0) ku5.t0.f312615d).B(new tf1.b(this, wi6));
                return;
            }
            this.f418864m = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "isEnableFloatBall:%b", java.lang.Boolean.valueOf(this.f418867p));
            if (!this.f418867p) {
                x();
                return;
            }
            if (l()) {
                if (z(g17)) {
                    this.f418860f.f418883b.requestFocus();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playAudio fail");
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onRuntimeBackground, enableAppBrandBackgroundRun");
            d();
        }
    }

    public void t(android.view.Surface surface) {
        tf.q g17 = g();
        if (g17 == null) {
            return;
        }
        tf.v vVar = (tf.v) g17.h(tf.v.class);
        if (vVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "onSetPlaybackSurface, playerAddOnVideoController is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "ljd onSetPlaybackSurface surface:%d", java.lang.Integer.valueOf(surface.hashCode()));
        vVar.a(surface);
        this.f418876y = surface;
    }

    public void u(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pauseBackgroundAudioPlay");
        tf.q g17 = g();
        if (g17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pauseBackgroundAudioPlay, mBackgroundAudioPlayer is null");
        } else if (v(g17, str)) {
            this.f418864m = true;
            p();
        }
    }

    public final boolean v(tf.q qVar, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pausePlay, videoPlayer:" + qVar.getName());
        tf.v vVar = (tf.v) qVar.h(tf.v.class);
        if (vVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "pausePlay, playerAddOnVideoController is null");
            return false;
        }
        if (str == null) {
            vVar.pause();
            return true;
        }
        vVar.c(str);
        return true;
    }

    public void w(java.lang.String str) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startBackgroundAudioPlay");
        tf.q g17 = g();
        if (g17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startBackgroundAudioPlay, backgroundAudioPlayer is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startPlay, videoPlayer:" + g17.getName());
        tf.v vVar = (tf.v) g17.h(tf.v.class);
        if (vVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "startPlay, playerAddOnVideoController is null");
            z17 = false;
        } else {
            if (str == null) {
                vVar.start();
            } else {
                vVar.c(str);
            }
            z17 = true;
        }
        if (z17) {
            this.f418864m = false;
            this.f418860f.f418883b.requestFocus();
            tf1.e eVar = this.f418862h;
            if (eVar != null) {
                eVar.a();
            }
            java.util.Iterator it = new java.util.ArrayList(this.f418863i).iterator();
            while (it.hasNext()) {
                ((tf1.e) it.next()).a();
            }
        }
        this.f418869r = true;
    }

    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "stopBackgroundAudioPlay");
        tf.q g17 = g();
        if (g17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "stopBackgroundAudioPlay, backgroundAudioPlayer is null");
            return;
        }
        if (v(g17, null)) {
            this.f418864m = false;
            this.f418860f.a();
        }
        p();
    }

    public final boolean z(tf.q qVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playAudio, videoPlayer:" + qVar.getName());
        tf.u uVar = (tf.u) qVar.h(tf.u.class);
        if (uVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.AppBrandRuntimeAudioOfVideoBackgroundPlayManager", "playAudio, videoPlayerAddOnPlayAudio is null");
            return false;
        }
        uVar.j();
        n(qVar);
        return true;
    }
}
