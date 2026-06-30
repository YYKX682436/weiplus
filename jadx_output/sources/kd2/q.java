package kd2;

/* loaded from: classes10.dex */
public abstract class q extends com.tencent.mm.plugin.ball.service.d {

    /* renamed from: n, reason: collision with root package name */
    public f25.m0 f306790n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f306791o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f306792p = jz5.h.b(new kd2.i(this));

    /* renamed from: q, reason: collision with root package name */
    public long f306793q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$checkVideoState$1 f306794r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f306795s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f306796t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f306797u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f306798v;

    /* renamed from: w, reason: collision with root package name */
    public long f306799w;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$checkVideoState$1] */
    public q() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f306794r = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderVideoStateActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$checkVideoState$1
            {
                this.__eventId = 1725810328;
            }

            /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
            
                if ((r2 != null && r2.isPlaying()) != false) goto L18;
             */
            @Override // com.tencent.mm.sdk.event.IListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean callback(com.tencent.mm.autogen.events.FinderVideoStateActionEvent r6) {
                /*
                    r5 = this;
                    com.tencent.mm.autogen.events.FinderVideoStateActionEvent r6 = (com.tencent.mm.autogen.events.FinderVideoStateActionEvent) r6
                    java.lang.String r0 = "event"
                    kotlin.jvm.internal.o.g(r6, r0)
                    r0 = 1
                    kd2.q r1 = kd2.q.this
                    am.rd r6 = r6.f54338g
                    if (r6 != 0) goto Lf
                    goto L3a
                Lf:
                    boolean r2 = r1.u()
                    r3 = 0
                    if (r2 == 0) goto L38
                    com.tencent.mm.plugin.ball.model.BallInfo r2 = r1.f93132d
                    int r2 = r2.f93046d
                    r4 = 32
                    if (r2 == r4) goto L22
                    r4 = 20
                    if (r2 != r4) goto L37
                L22:
                    com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r2 = r1.k0()
                    com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r2 = r2.getVideoView()
                    if (r2 == 0) goto L34
                    boolean r2 = r2.isPlaying()
                    if (r2 != r0) goto L34
                    r2 = r0
                    goto L35
                L34:
                    r2 = r3
                L35:
                    if (r2 == 0) goto L38
                L37:
                    r3 = r0
                L38:
                    r6.f7807a = r3
                L3a:
                    if (r6 != 0) goto L3d
                    goto L4a
                L3d:
                    boolean r6 = r1.u()
                    if (r6 == 0) goto L4a
                    com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView r6 = r1.k0()
                    r6.getVideoView()
                L4a:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$checkVideoState$1.callback(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f306795s = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.VoipEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$voipCallEvent$1
            {
                this.__eventId = -797557590;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.VoipEvent voipEvent) {
                com.tencent.mm.autogen.events.VoipEvent event = voipEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new kd2.p(kd2.q.this, event));
                return false;
            }
        };
        this.f306796t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MultiTalkActionEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$multiTalkActionListener$1
            {
                this.__eventId = 1177822575;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MultiTalkActionEvent multiTalkActionEvent) {
                com.tencent.mm.autogen.events.MultiTalkActionEvent event = multiTalkActionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new kd2.j(kd2.q.this, event));
                return false;
            }
        };
        this.f306797u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MultiTalkStatusEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$multiTaskCreateListener$1
            {
                this.__eventId = -1297118925;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MultiTalkStatusEvent multiTalkStatusEvent) {
                com.tencent.mm.autogen.events.MultiTalkStatusEvent event = multiTalkStatusEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new kd2.k(kd2.q.this, event));
                return false;
            }
        };
        this.f306798v = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderSeekEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.floatball.BaseFinderMiniViewHelper$finderSeekEventListener$1
            {
                this.__eventId = -220111540;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderSeekEvent finderSeekEvent) {
                com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy videoView;
                com.tencent.mm.autogen.events.FinderSeekEvent event = finderSeekEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ad adVar = event.f54321g;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(adVar.f6151a)) {
                    java.lang.String str = adVar.f6151a;
                    kd2.q qVar = kd2.q.this;
                    com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy videoView2 = qVar.k0().getVideoView();
                    if (kotlin.jvm.internal.o.b(str, videoView2 != null ? videoView2.getVideoMediaId() : null) && (videoView = qVar.k0().getVideoView()) != null) {
                        videoView.a(adVar.f6152b, true);
                    }
                }
                return true;
            }
        };
    }

    public static void f0(kd2.q qVar, r45.mb4 mediaObj, boolean z17, boolean z18, boolean z19, boolean z27, int i17, java.lang.Object obj) {
        java.lang.Object c1Var;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addCoverMiniView");
        }
        boolean z28 = (i17 & 2) != 0 ? false : z17;
        boolean z29 = (i17 & 4) != 0 ? false : z18;
        boolean z37 = (i17 & 8) != 0 ? false : z19;
        boolean z38 = (i17 & 16) != 0 ? false : z27;
        qVar.getClass();
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        qVar.k0().f(qVar.j0(), qVar.i0());
        qVar.k0().setPadding(0, 0, 0, 0);
        com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView k07 = qVar.k0();
        k07.getClass();
        k07.d();
        k07.e();
        k07.shapeType = do2.e.f242080g;
        k07.avatarIv.setImageDrawable(null);
        if (mediaObj.getInteger(2) == 9) {
            java.lang.String string = mediaObj.getString(16);
            boolean z39 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = mediaObj.getString(20);
            if (string2 == null) {
                string2 = "";
            }
            java.lang.String concat = string.concat(string2);
            if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(mediaObj.getString(1));
                java.lang.String string3 = mediaObj.getString(19);
                sb6.append(string3 != null ? string3 : "");
                concat = sb6.toString();
            }
            c1Var = new mn2.q3(concat, com.tencent.mm.plugin.finder.storage.y90.f128355e);
        } else {
            c1Var = com.tencent.mm.sdk.platformtools.t8.K0(mediaObj.getString(16)) ? new mn2.c1(mediaObj, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null) : new mn2.r3(mediaObj, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null);
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        g1Var.e().c(c1Var, k07.avatarIv, g1Var.h(mn2.f1.E));
        m0(qVar, z28, false, 0, z29, z37, z38, false, false, false, false, 964, null);
    }

    public static void m0(kd2.q qVar, boolean z17, boolean z18, int i17, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, boolean z38, boolean z39, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: internalAddMiniView");
        }
        boolean z47 = (i18 & 1) != 0 ? false : z17;
        boolean z48 = (i18 & 2) != 0 ? false : z18;
        int i19 = (i18 & 4) != 0 ? z48 ? 1 : 2 : i17;
        boolean z49 = (i18 & 8) != 0 ? false : z19;
        boolean z57 = (i18 & 16) != 0 ? false : z27;
        boolean z58 = (i18 & 32) != 0 ? false : z28;
        boolean z59 = (i18 & 64) != 0 ? true : z29;
        boolean z66 = (i18 & 128) != 0 ? true : z37;
        boolean z67 = (i18 & 256) != 0 ? true : z38;
        boolean z68 = (i18 & 512) != 0 ? true : z39;
        if (qVar.u()) {
            com.tencent.mars.xlog.Log.i("BaseFinderMiniViewHelper", "addMiniView, has ball, but view is different, ballInfo.customView:%s", qVar.f93132d.f93050h);
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = qVar.f93132d;
            ballInfo.I = true;
            ballInfo.H = z48 ? 4 : 2048;
            ballInfo.f93050h = qVar.k0();
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = qVar.f93132d;
            ballInfo2.f93045J = false;
            ballInfo2.F = true;
            ballInfo2.f93053n = i19;
            com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo2.f93054o;
            ballButtonInfo.f93071f = z59;
            ballButtonInfo.f93070e = z66;
            ballButtonInfo.f93073h = z67;
            ballButtonInfo.f93076n = z49;
            ballButtonInfo.f93078p = z57;
            ballButtonInfo.f93080r = z58;
            ballButtonInfo.f93069d = z68;
            qVar.w0();
            qVar.g();
        } else {
            kd2.d dVar = new kd2.d(qVar, z48, i19, z59, z66, z67, z49, z57, z58, z68);
            long j17 = qVar.f306799w + 200;
            boolean z69 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = j17 - java.lang.System.currentTimeMillis();
            if (currentTimeMillis > 0 || z47) {
                com.tencent.mars.xlog.Log.i("FinderMegaVideoMiniViewHelper", "addMiniView, no ball, add delayed:%s", java.lang.Long.valueOf(currentTimeMillis));
                com.tencent.mm.sdk.platformtools.u3.i(dVar, z47 ? 200L : currentTimeMillis);
            } else {
                dVar.run();
            }
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy videoView = qVar.k0().getVideoView();
            if (videoView != null && videoView.isPlaying()) {
                v0(qVar, false, 1, null);
            }
        }
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().X(false);
    }

    public static /* synthetic */ void v0(kd2.q qVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestAudioFocus");
        }
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        qVar.u0(z17);
    }

    public void e0() {
        com.tencent.mars.xlog.Log.i("BaseFinderMiniViewHelper", "abandonAudioFocus");
        f25.m0 m0Var = this.f306790n;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f306790n = null;
    }

    public final void g0(boolean z17) {
        k0().f(j0(), i0());
        k0().setPadding(0, 0, 0, 0);
        com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView k07 = k0();
        k07.d();
        k07.e();
        k07.shapeType = do2.e.f242081h;
        android.widget.TextView textView = k07.f121047d;
        textView.setVisibility(0);
        textView.setTextSize(14.0f);
        textView.setText(com.tencent.mm.R.string.gu9);
        k07.avatarIv.setImageDrawable(new android.graphics.drawable.ColorDrawable(-16777216));
        k07.setContentDescription(k07.getResources().getString(com.tencent.mm.R.string.jp6));
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        ballInfo.f93054o.f93069d = false;
        ballInfo.f93055p.f93066d = null;
        m0(this, z17, false, 0, false, false, false, false, false, false, false, com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED, null);
    }

    public void h0() {
    }

    public android.view.View.OnClickListener i0() {
        return new kd2.c(this);
    }

    public abstract android.view.View.OnClickListener j0();

    public final com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView k0() {
        return (com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView) ((jz5.n) this.f306792p).getValue();
    }

    public boolean l0() {
        return false;
    }

    public void n0() {
    }

    public void o0(int i17, int i18) {
    }

    public void p0() {
    }

    public void q0() {
    }

    public void r0() {
    }

    public void s0() {
        dead();
        this.f306795s.dead();
        this.f306796t.dead();
        this.f306797u.dead();
        this.f306798v.dead();
    }

    public boolean t0() {
        e0();
        if (!u()) {
            com.tencent.mars.xlog.Log.i("BaseFinderMiniViewHelper", "removeMiniView, no ball, view:%s", this.f306791o ? k0() : null);
            return false;
        }
        com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView k07 = this.f306791o ? k0() : null;
        com.tencent.mars.xlog.Log.i("BaseFinderMiniViewHelper", "removeMiniView, has ball, view:%s", k07);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f306799w = java.lang.System.currentTimeMillis();
        if (k07 != null) {
            k07.d();
        }
        s0();
        d();
        return true;
    }

    public void u0(boolean z17) {
        com.tencent.mars.xlog.Log.i("BaseFinderMiniViewHelper", "requestAudioFocus");
        f25.m0 m0Var = this.f306790n;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.q.f259109c, new kd2.o(this));
        this.f306790n = m96;
        if (z17) {
            boolean z18 = false;
            if (m96 != null && ((g25.e) m96).f267980c) {
                z18 = true;
            }
            if (z18) {
                return;
            }
            n0();
        }
    }

    public final void w0() {
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        if (ballInfo.f93051i == null) {
            ballInfo.f93051i = new android.graphics.Point();
        }
        do2.c cVar = com.tencent.mm.plugin.finder.megavideo.ui.FinderMegaVideoMiniView.f121046s;
        android.content.res.Resources resources = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        android.util.Size a17 = cVar.a(resources, k0().getShapeType());
        this.f93132d.f93051i.x = a17.getWidth();
        this.f93132d.f93051i.y = a17.getHeight();
        com.tencent.mars.xlog.Log.i("BaseFinderMiniViewHelper", "setLiveViewSize %s", this.f93132d.f93051i);
    }
}
