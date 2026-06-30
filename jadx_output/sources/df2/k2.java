package df2;

/* loaded from: classes10.dex */
public final class k2 extends if2.b implements if2.e, mf2.c, mn0.c0, dk2.wf {

    /* renamed from: m, reason: collision with root package name */
    public android.support.v4.media.m f230544m;

    /* renamed from: n, reason: collision with root package name */
    public android.support.v4.media.session.r f230545n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f230546o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f230547p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f230548q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f230549r;

    /* renamed from: s, reason: collision with root package name */
    public final ml2.w f230550s;

    /* renamed from: t, reason: collision with root package name */
    public df2.e2 f230551t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230549r = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f230550s = new ml2.w();
    }

    @Override // mf2.c
    public void U0() {
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "enterTRTCState - Enter TRTC mode, hide play/pause controls");
        this.f230547p = true;
        f7();
    }

    public final mn0.b0 Z6() {
        dk2.ef efVar = dk2.ef.f233372a;
        tn0.w0 w0Var = dk2.ef.f233378d;
        co0.s sVar = w0Var instanceof co0.s ? (co0.s) w0Var : null;
        if (sVar != null) {
            return sVar.R1.f282409a;
        }
        return null;
    }

    public final boolean a7() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3777i8).getValue()).r()).intValue() > 0;
    }

    public final boolean b7() {
        if (((mm2.c1) business(mm2.c1.class)).U7() || pm0.v.z(((mm2.c1) business(mm2.c1.class)).f328807g2, 524288)) {
            return false;
        }
        if (this.f230547p) {
            return true;
        }
        mn0.b0 Z6 = Z6();
        if (Z6 != null) {
            return ((mn0.y) Z6).b(false);
        }
        return false;
    }

    public final void c7() {
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "notifyPaused - Send notify paused command to service");
        android.support.v4.media.session.r rVar = this.f230545n;
        if (rVar != null) {
            sn2.c cVar = sn2.c.f410120e;
            rVar.a("NOTIFY_PAUSED", null, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayerPause - isScreenOff: ");
        ml2.w wVar = this.f230550s;
        sb6.append(wVar.f328151a);
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", sb6.toString());
        if (!wVar.f328152b) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPause - is not playing, skip");
            return;
        }
        if (!wVar.f328151a) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPause - is not screen off, skip");
            return;
        }
        if (wVar.f328154d <= 0) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPause - invalid playingSegmentStartTime: " + wVar.f328154d + ", ignore pause event");
            return;
        }
        wVar.f328155e += java.lang.System.currentTimeMillis() - wVar.f328154d;
        wVar.f328152b = false;
        wVar.f328154d = 0L;
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPause - update accumulatedWatchTime: " + wVar.f328155e);
        ml2.w.c(wVar, ml2.v.f328118g, 0L, 0L, 6, null);
    }

    public final void d7() {
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "notifyPlaying - Send notify playing command to service");
        android.support.v4.media.session.r rVar = this.f230545n;
        if (rVar != null) {
            sn2.c cVar = sn2.c.f410120e;
            rVar.a("NOTIFY_PLAYING", null, null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayerPlay - isScreenOff: ");
        ml2.w wVar = this.f230550s;
        sb6.append(wVar.f328151a);
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", sb6.toString());
        if (wVar.f328152b) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPlay - is playing, skip");
            return;
        }
        if (!wVar.f328151a) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPlay - is not screen off, skip");
            return;
        }
        wVar.f328152b = true;
        wVar.f328154d = java.lang.System.currentTimeMillis();
        ml2.w.c(wVar, ml2.v.f328119h, 0L, 0L, 6, null);
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserReporter", "onPlayerPlay - set playingSegmentStartTime: " + wVar.f328154d + ", accumulatedWatchTime: " + wVar.f328155e);
    }

    public final void e7() {
        mn0.b0 Z6 = Z6();
        if (Z6 == null) {
            com.tencent.mars.xlog.Log.w("FinderLiveMediaBrowserController", "registerPlayerListener - CDN player not available");
            return;
        }
        mn0.y yVar = (mn0.y) Z6;
        if (yVar.f329808g.contains(this)) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "registerPlayerListener - Skip, already registered");
            return;
        }
        yVar.a(this);
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "registerPlayerListener - Listener registered, isPlaying=" + yVar.b(false));
        g7();
    }

    public final void f7() {
        boolean z17 = !this.f230547p;
        sn2.c cVar = z17 ? sn2.c.f410120e : sn2.c.f410121f;
        android.support.v4.media.session.r rVar = this.f230545n;
        if (rVar != null) {
            rVar.a(cVar.f410123d, null, null);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "updateControlsVisibility - Controls enabled: " + z17);
    }

    public final void g7() {
        if (!a7()) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "updatePlaybackState - Skip, switch is closed");
            return;
        }
        boolean b76 = b7();
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "updatePlaybackState - Sync state to service, isPlaying=" + b76);
        if (b76) {
            d7();
        } else {
            c7();
        }
    }

    @Override // mn0.c0
    public void j6() {
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "onPlayerPause - Player paused");
        c7();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onFloatMode() {
        super.onFloatMode();
        g7();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
        super.onLiveActivate();
        if (!a7()) {
            com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "onLiveActivate - Skip, switch is closed");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "onLiveActivate - Start collecting live info");
        com.tencent.mm.plugin.finder.live.util.y.d(this, null, null, new df2.h2(this, null), 3, null);
        dk2.ef efVar = dk2.ef.f233372a;
        java.util.ArrayList arrayList = (java.util.ArrayList) dk2.ef.f233402q;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "addAudioFocusChangeListener: " + this + ", total=" + arrayList.size());
        }
        if (this.f230551t == null) {
            this.f230551t = new df2.e2(this);
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        O6().registerReceiver(this.f230551t, intentFilter);
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "registerScreenStateReceiver - Registered");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "onLiveDeactivate - Cleanup resources");
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "stopMediaBrowser - Stop requested");
        d75.b.g(new df2.j2(this));
        java.util.ArrayList arrayList = (java.util.ArrayList) dk2.ef.f233402q;
        arrayList.remove(this);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveService", "removeAudioFocusChangeListener: " + this + ", total=" + arrayList.size());
        df2.e2 e2Var = this.f230551t;
        if (e2Var != null) {
            try {
                com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(e2Var);
                com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "unregisterScreenStateReceiver - Unregistered");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("FinderLiveMediaBrowserController", "unregisterScreenStateReceiver - Failed: " + e17.getMessage());
            }
        }
        this.f230551t = null;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveEnd() {
        super.onLiveEnd();
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "onLiveEnd - Live ended");
        g7();
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        super.onLiveStart(hc1Var);
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "onLiveStart - Live started");
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "startMediaBrowser - Start requested");
        d75.b.g(new df2.i2(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStartFromWindow() {
        super.onLiveStartFromWindow();
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "onLiveStartFromWindow - Resumed from float window");
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "startMediaBrowser - Start requested");
        d75.b.g(new df2.i2(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onNormalMode() {
        super.onNormalMode();
        g7();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r4.f() == true) goto L15;
     */
    @Override // if2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onWindowFocusChanged(boolean r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onWindowFocusChanged - hasFocus="
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveMediaBrowserController"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r0 = 0
            if (r4 == 0) goto L60
            boolean r4 = r3.f230548q
            if (r4 != 0) goto L20
            java.lang.String r4 = "Skip, not paused by media session or notification"
            com.tencent.mars.xlog.Log.i(r1, r4)
            goto L62
        L20:
            tn0.w0 r4 = dk2.ef.f233378d
            if (r4 == 0) goto L30
            kn0.p r4 = r4.D
            if (r4 == 0) goto L30
            boolean r4 = r4.f()
            r2 = 1
            if (r4 != r2) goto L30
            goto L31
        L30:
            r2 = r0
        L31:
            if (r2 == 0) goto L39
            java.lang.String r4 = "Skip, in float mode"
            com.tencent.mars.xlog.Log.i(r1, r4)
            goto L62
        L39:
            mn0.b0 r4 = r3.Z6()
            if (r4 != 0) goto L45
            java.lang.String r4 = "Skip, CDN player not available"
            com.tencent.mars.xlog.Log.w(r1, r4)
            goto L62
        L45:
            mn0.y r4 = (mn0.y) r4
            boolean r2 = r4.b(r0)
            if (r2 == 0) goto L55
            java.lang.String r4 = "Skip, player is already playing"
            com.tencent.mars.xlog.Log.i(r1, r4)
            r3.f230548q = r0
            goto L62
        L55:
            java.lang.String r2 = "Auto resuming playback"
            com.tencent.mars.xlog.Log.i(r1, r2)
            r3.f230548q = r0
            r4.y()
            goto L62
        L60:
            r3.f230548q = r0
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.k2.onWindowFocusChanged(boolean):void");
    }

    @Override // mn0.c0
    public void u() {
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "onPlayerResume - Player resumed");
        d7();
    }

    @Override // mf2.c
    public void w0() {
        com.tencent.mars.xlog.Log.i("FinderLiveMediaBrowserController", "exitTRTCState - Exit TRTC mode, show play/pause controls");
        this.f230547p = false;
        f7();
        e7();
    }
}
