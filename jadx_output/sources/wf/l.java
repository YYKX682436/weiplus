package wf;

/* loaded from: classes7.dex */
public class l implements sf.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf.b f445473a;

    public l(wf.b bVar) {
        this.f445473a = bVar;
    }

    @Override // sf.e
    public void a(final int i17) {
        final wf.b bVar = this.f445473a;
        com.tencent.mars.xlog.Log.i(bVar.w(), "onBackground, type: " + i17);
        bVar.getClass();
        bVar.L(new java.lang.Runnable() { // from class: wf.b$$g
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar2 = wf.b.this;
                int i18 = i17;
                com.tencent.mars.xlog.Log.i(bVar2.w(), "*** handler(%s) handleWebViewBackground, type:%d", bVar2.q(), java.lang.Integer.valueOf(i18));
                bVar2.H = true;
                com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewBackground, type:%s, autoPauseIfNative:%s, autoPauseIfNavigate:%s, isRuntimeInBackground:%s, isPlayingWhenEnterBackground:%s", java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(bVar2.f445429v), java.lang.Boolean.valueOf(bVar2.f445428u), java.lang.Boolean.valueOf(bVar2.G), bVar2.I);
                com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewBackground, abandonFocus");
                bVar2.f445434z.a();
                if (bVar2.f445421o != null) {
                    com.tencent.mm.plugin.appbrand.AppBrandRuntime a17 = tf1.h.a(bVar2.f445422p);
                    xf1.i iVar = a17 != null ? (xf1.i) a17.k(xf1.i.class) : null;
                    if (iVar != null ? iVar.d(bVar2, i18) : false) {
                        com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewBackground, should intercept enter background, return");
                        return;
                    }
                }
                if (i18 == 4) {
                    wf.a aVar = bVar2.f445418i;
                    if (aVar == null) {
                        com.tencent.mars.xlog.Log.w(bVar2.w(), "handleWebViewBackground, adapter is null 0");
                    } else {
                        ((wf.r) aVar).b();
                    }
                }
                com.tencent.mm.plugin.appbrand.jsapi.media.w1 U2 = com.tencent.mm.plugin.appbrand.jsapi.media.n.f81944e.U2(bVar2.f445428u, bVar2.f445429v);
                com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewBackground, autoPauseStrategy: %s", U2);
                sf.f fVar = bVar2.f445422p;
                if (!U2.a(fVar != null ? fVar.m() : null, tf1.h.c(i18))) {
                    java.util.concurrent.atomic.AtomicBoolean atomicBoolean = bVar2.I;
                    if (atomicBoolean == null || !atomicBoolean.get()) {
                        com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewBackground, live player not auto pause, ignore resume, type:%s", java.lang.Integer.valueOf(i18));
                        wf.a aVar2 = bVar2.f445418i;
                        if (aVar2 == null || bVar2.I != null) {
                            return;
                        }
                        bVar2.I = new java.util.concurrent.atomic.AtomicBoolean(((wf.r) aVar2).isPlaying());
                        return;
                    }
                    com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewBackground, live player not auto pause, try resume, type:%s", java.lang.Integer.valueOf(i18));
                    wf.a aVar3 = bVar2.f445418i;
                    if (aVar3 == null) {
                        com.tencent.mars.xlog.Log.w(bVar2.w(), "handleWebViewBackground, adapter is null 1");
                        return;
                    } else {
                        ((wf.r) aVar3).c();
                        return;
                    }
                }
                wf.a aVar4 = bVar2.f445418i;
                if (aVar4 == null || bVar2.I != null) {
                    return;
                }
                boolean isPlaying = ((wf.r) aVar4).isPlaying();
                bVar2.I = new java.util.concurrent.atomic.AtomicBoolean(isPlaying);
                if (bVar2.T && 1 != i18 && bVar2.t()) {
                    com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewBackground runnable, background play audio is enabled, do not pause");
                    return;
                }
                if (bVar2.L.a(bVar2.f445422p)) {
                    com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewBackground runnable, i am pip player, do not pause");
                    return;
                }
                sc1.k1 d17 = ((wf.r) bVar2.f445418i).d();
                if (isPlaying) {
                    bVar2.B("stop");
                }
                com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewBackground, isPlayingWhenEnterBackground:%s, code:%d info:%s", java.lang.Boolean.valueOf(isPlaying), java.lang.Integer.valueOf(d17.f405688a), d17.f405689b);
            }
        });
    }

    @Override // sf.e
    public void b() {
        final wf.b bVar = this.f445473a;
        com.tencent.mars.xlog.Log.i(bVar.w(), "onForeground");
        bVar.getClass();
        bVar.L(new java.lang.Runnable() { // from class: wf.b$$h
            @Override // java.lang.Runnable
            public final void run() {
                java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
                wf.b bVar2 = wf.b.this;
                com.tencent.mars.xlog.Log.i(bVar2.w(), "*** handler(%s) handleWebViewForeground", bVar2.q());
                bVar2.H = false;
                com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewForeground, isRuntimeInBackground: %b, passiveMute: %b", java.lang.Boolean.valueOf(bVar2.G), java.lang.Boolean.valueOf(bVar2.A));
                if (!bVar2.G && ((bVar2.A && !bVar2.B) || !bVar2.y())) {
                    if (bVar2.A) {
                        com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewForeground, passiveMute, unMute");
                        bVar2.P();
                    }
                    if (bVar2.z()) {
                        com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewForeground, isPlaying, requestFocus");
                        bVar2.f445434z.requestFocus();
                    }
                }
                if (bVar2.G || bVar2.f445418i == null || (atomicBoolean = bVar2.I) == null) {
                    return;
                }
                boolean z17 = atomicBoolean.get();
                bVar2.I = null;
                if (z17) {
                    sc1.k1 c17 = bVar2.f445418i.c();
                    com.tencent.mars.xlog.Log.i(bVar2.w(), "handleWebViewForeground, code:%d info:%s", java.lang.Integer.valueOf(c17.f405688a), c17.f405689b);
                }
            }
        });
    }

    @Override // sf.e
    public void onDestroy() {
        final wf.b bVar = this.f445473a;
        bVar.getClass();
        bVar.L(new java.lang.Runnable() { // from class: wf.b$$i
            @Override // java.lang.Runnable
            public final void run() {
                wf.b bVar2 = wf.b.this;
                com.tencent.mars.xlog.Log.i(bVar2.w(), "*** handler(%s) handleWebViewDestroy", bVar2.q());
                bVar2.J();
            }
        });
    }
}
