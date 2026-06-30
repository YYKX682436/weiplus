package kd2;

/* loaded from: classes10.dex */
public final class p1 extends kd2.q implements kd2.q1 {
    public static final kd2.o0 N = new kd2.o0(null);
    public static final jz5.g P = jz5.h.b(kd2.n0.f306777d);
    public static final jz5.g Q = jz5.h.a(jz5.i.f302829d, kd2.m0.f306774d);
    public static final gp1.z R = new kd2.l0();
    public kd2.s1 A;
    public kd2.d0 B;
    public kd2.q0 C;
    public java.lang.String D;
    public int E;
    public boolean G;
    public com.tencent.mm.plugin.finder.feed.model.ea H;
    public kd2.q0 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f306786J;
    public final com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$liveFeedStateChangeListener$1 L;
    public final os5.r M;

    /* renamed from: x, reason: collision with root package name */
    public kd2.q0 f306787x;

    /* renamed from: y, reason: collision with root package name */
    public cw2.da f306788y;

    /* renamed from: z, reason: collision with root package name */
    public vo2.d f306789z;
    public boolean F = true;
    public final jz5.g K = jz5.h.b(kd2.t0.f306832d);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$liveFeedStateChangeListener$1] */
    public p1() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.L = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.floatball.FinderVideoPassiveMiniViewHelper$liveFeedStateChangeListener$1
            {
                this.__eventId = 439877283;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.V(0L, new kd2.h1(event, kd2.p1.this));
                return false;
            }
        };
        this.M = new kd2.i1(this);
    }

    public static /* synthetic */ void H0(kd2.p1 p1Var, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, long j17, float f17, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            j17 = -1;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            f17 = 1.0f;
        }
        float f18 = f17;
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        boolean z19 = z17;
        if ((i17 & 16) != 0) {
            z18 = true;
        }
        p1Var.G0(finderThumbPlayerProxy, j18, f18, z19, z18);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[LOOP:0: B:21:0x0073->B:29:0x009b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a3 A[EDGE_INSN: B:30:0x00a3->B:33:0x00a3 BREAK  A[LOOP:0: B:21:0x0073->B:29:0x009b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0445  */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35, types: [com.tencent.mm.plugin.finder.viewmodel.component.ny] */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [r45.qt2] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void J0(kd2.p1 r19, androidx.appcompat.app.AppCompatActivity r20, androidx.recyclerview.widget.RecyclerView r21, int r22, boolean r23, long r24, boolean r26, int r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 1126
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.J0(kd2.p1, androidx.appcompat.app.AppCompatActivity, androidx.recyclerview.widget.RecyclerView, int, boolean, long, boolean, int, java.lang.Object):void");
    }

    public static boolean T0(kd2.p1 p1Var, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.storage.FeedData feedData2;
        com.tencent.mm.plugin.finder.storage.FeedData feedData3;
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        if ((i17 & 4) != 0) {
            z19 = true;
        }
        boolean K0 = p1Var.K0();
        com.tencent.mars.xlog.Log.i("FinderVideoPassive", "togglePlayer: isPlaying = " + K0 + ", forcePause = " + z17 + ", controlAudioFocus = " + z18 + ", controlBtnStatus = " + z19);
        if (K0) {
            cw2.da daVar = p1Var.f306788y;
            if (daVar != null) {
                daVar.pause();
            }
            vo2.d dVar = p1Var.f306789z;
            if (dVar != null) {
                ((vo2.c) dVar).c();
            }
            kd2.s1 s1Var = p1Var.A;
            if (s1Var != null) {
                ((com.tencent.mm.plugin.finder.video.FinderLivePlayView) s1Var).pause();
            }
            if (z19) {
                p1Var.k0().setMusicCtrlBtnStatus(false);
            }
            if (z18) {
                p1Var.e0();
            }
        } else if (!z17) {
            if (p1Var.f306788y == null && p1Var.f306789z == null && p1Var.A == null) {
                p1Var.k0().setMusicCtrlBtnStatus(false);
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.gva, 0).show();
            } else {
                kd2.q0 q0Var = p1Var.C;
                if (q0Var != null) {
                    q0Var.f306808i = false;
                }
                if ((q0Var == null || (feedData3 = q0Var.f306806g) == null || feedData3.getMediaType() != 9) ? false : true) {
                    kd2.q0 q0Var2 = p1Var.C;
                    if (!((q0Var2 == null || (feedData2 = q0Var2.f306806g) == null || feedData2.getLiveId() != 0) ? false : true)) {
                        kd2.q0 q0Var3 = p1Var.C;
                        if ((q0Var3 == null || (feedData = q0Var3.f306806g) == null || feedData.getLiveStatus() != 2) ? false : true) {
                            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.cxa, 0).show();
                        }
                    }
                }
                if (z18) {
                    p1Var.u0(false);
                }
                f25.m0 m0Var = p1Var.f306790n;
                if (m0Var != null && ((g25.e) m0Var).f267980c) {
                    cw2.da daVar2 = p1Var.f306788y;
                    if (daVar2 != null) {
                        daVar2.setMute(false);
                    }
                    vo2.d dVar2 = p1Var.f306789z;
                    if (dVar2 != null && (finderThumbPlayerProxy = ((vo2.c) dVar2).f438559b) != null) {
                        finderThumbPlayerProxy.setMute(false);
                    }
                    kd2.s1 s1Var2 = p1Var.A;
                    if (s1Var2 != null) {
                        s1Var2.setMute(false);
                    }
                }
                cw2.da daVar3 = p1Var.f306788y;
                if (daVar3 != null) {
                    zy2.g5.u(daVar3, null, 1, null);
                }
                vo2.d dVar3 = p1Var.f306789z;
                if (dVar3 != null) {
                    ((vo2.c) dVar3).d();
                }
                kd2.s1 s1Var3 = p1Var.A;
                if (s1Var3 != null) {
                    zy2.g5.u(s1Var3, null, 1, null);
                }
                if (p1Var.f306788y != null) {
                    p1Var.k0().getClass();
                }
                if (z19) {
                    p1Var.k0().setMusicCtrlBtnStatus(true);
                }
            }
        }
        return K0;
    }

    public static /* synthetic */ java.lang.Object y0(kd2.p1 p1Var, boolean z17, boolean z18, boolean z19, com.tencent.mm.plugin.finder.feed.model.ea eaVar, boolean z27, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        boolean z28 = z17;
        boolean z29 = (i17 & 2) != 0 ? false : z18;
        boolean z37 = (i17 & 4) != 0 ? false : z19;
        if ((i17 & 8) != 0) {
            eaVar = null;
        }
        return p1Var.x0(z28, z29, z37, eaVar, (i17 & 16) != 0 ? false : z27, continuation);
    }

    public final void A0() {
        if (this.f306786J) {
            i95.m c17 = i95.n0.c(eu2.b0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((eu2.b0) c17).hj(eu2.k.f256795e);
        }
        this.f306786J = false;
        com.tencent.mars.xlog.Log.i("FinderVideoPassive", "cancelPlayerNotification");
    }

    public final boolean B0(boolean z17, boolean z18) {
        boolean z19;
        if (iq.b.i(com.tencent.mm.sdk.platformtools.x2.f193071a, false, null)) {
            if (!z17 && !z18) {
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.aqd, 0).show();
            }
            com.tencent.mars.xlog.Log.w("FinderVideoPassive", "checkEnableAddFinderFloatBall: failed to add video float ball, checkCameraUsingAndShowToast");
            return false;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        boolean z27 = (z17 || z18) ? false : true;
        if (iq.b.H()) {
            if (z27) {
                java.lang.String string = context.getString(com.tencent.mm.R.string.aqf);
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = string;
                e4Var.c();
            }
            z19 = true;
        } else {
            z19 = false;
        }
        if (!z19) {
            if (!iq.b.F(com.tencent.mm.sdk.platformtools.x2.f193071a, (z17 || z18) ? false : true) && !iq.b.d() && !iq.b.a()) {
                if (!iq.b.m(com.tencent.mm.sdk.platformtools.x2.f193071a, (z17 || z18) ? false : true, null) && (!z17 || !iq.b.l(null, false))) {
                    return true;
                }
            }
        }
        com.tencent.mars.xlog.Log.w("FinderVideoPassive", "checkEnableAddFinderFloatBall: failed to add video float ball");
        return false;
    }

    public final void C0(int i17) {
        this.D = java.util.UUID.randomUUID().toString();
        this.E = i17;
    }

    public final java.lang.String D0(r45.mb4 mb4Var) {
        java.lang.String str;
        java.lang.String string;
        java.lang.String str2;
        java.lang.String string2;
        java.lang.String str3 = "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(mb4Var != null ? mb4Var.getString(16) : null)) {
            if (mb4Var == null || (str2 = mb4Var.getString(1)) == null) {
                str2 = "";
            }
            if (mb4Var != null && (string2 = mb4Var.getString(19)) != null) {
                str3 = string2;
            }
            return str2.concat(str3);
        }
        if (mb4Var == null || (str = mb4Var.getString(16)) == null) {
            str = "";
        }
        if (mb4Var != null && (string = mb4Var.getString(20)) != null) {
            str3 = string;
        }
        return str.concat(str3);
    }

    public final kd2.b0 E0() {
        return (kd2.b0) ((jz5.n) this.K).getValue();
    }

    public final long F0() {
        boolean booleanValue;
        kd2.q0 q0Var;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        cw2.da daVar = this.f306788y;
        if (daVar != null) {
            booleanValue = daVar.l();
        } else {
            vo2.d dVar = this.f306789z;
            if (dVar != null) {
                booleanValue = ((vo2.c) dVar).b();
            } else {
                kd2.s1 s1Var = this.A;
                java.lang.Boolean valueOf = s1Var != null ? java.lang.Boolean.valueOf(((com.tencent.mm.plugin.finder.video.FinderLivePlayView) s1Var).isPlaying()) : null;
                booleanValue = valueOf != null ? valueOf.booleanValue() : false;
            }
        }
        if (!booleanValue || (q0Var = this.C) == null || (feedData = q0Var.f306806g) == null) {
            return 0L;
        }
        return feedData.getFeedId();
    }

    public final void G0(com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy, long j17, float f17, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("FinderVideoPassive", "initVideoView: targetTimeMs = " + j17 + ", playSpeedRatio = " + f17 + ", isPassive = " + z17 + ", isOnlyAudio = " + z18);
        finderThumbPlayerProxy.setLifecycle(new kd2.y0(j17, this, f17, z17, finderThumbPlayerProxy, k0()));
        finderThumbPlayerProxy.setOnlyAudio(z18);
        finderThumbPlayerProxy.setVideoViewCallback(k0().getVideoViewCallback());
        finderThumbPlayerProxy.setLoop(false);
        finderThumbPlayerProxy.setMute(false);
        finderThumbPlayerProxy.setVideoViewFocused(true);
        if (finderThumbPlayerProxy.V()) {
            return;
        }
        zy2.g5.u(finderThumbPlayerProxy, null, 1, null);
    }

    public final void I0(boolean z17, boolean z18, boolean z19, boolean z27, com.tencent.mm.plugin.finder.feed.model.ea eaVar, boolean z28) {
        java.lang.String str;
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        r45.qt2 qt2Var;
        com.tencent.mm.plugin.finder.storage.FeedData feedData2;
        com.tencent.mm.plugin.finder.storage.FeedData feedData3;
        com.tencent.mm.plugin.finder.storage.FeedData feedData4;
        com.tencent.mars.xlog.Log.i("FinderVideoPassive", "innerAddMiniView: isPassive = " + z17 + ", fromMessage = " + z19 + ", needPost = " + z18 + ", forcePause=" + z28);
        or2.a aVar = or2.a.f347607a;
        or2.a.f347614h = true;
        int i17 = or2.a.f347612f + 1;
        or2.a.f347612f = i17;
        if (i17 >= 1) {
            aVar.b(true, true);
        }
        this.H = eaVar;
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
        ballInfo.f93046d = 32;
        ballInfo.f93047e = 32;
        if (z19) {
            ballInfo.f93058s = true;
        }
        kd2.q0 q0Var = this.f306787x;
        this.C = q0Var;
        int i18 = (z19 && z17) ? 5 : z17 ? 3 : 8;
        com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo = ballInfo.M;
        ballReportInfo.f93084d = i18;
        if (q0Var == null || (feedData4 = q0Var.f306806g) == null || (str = java.lang.Long.valueOf(feedData4.getFeedId()).toString()) == null) {
            str = "";
        }
        ballReportInfo.f93087g = str;
        kd2.q0 q0Var2 = this.C;
        if (q0Var2 == null || (feedData3 = q0Var2.f306806g) == null) {
            f0Var = null;
        } else {
            z0(q0Var2.f306805f, feedData3, q0Var2.f306800a, q0Var2.f306807h, q0Var2.f306801b, q0Var2.f306802c, z18, z17, z27, z28);
            f0Var = jz5.f0.f302826a;
        }
        boolean z29 = false;
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("FinderVideoPassive", "innerAddMiniView: feedData is null");
            S0();
            if (this.F) {
                g0(z18);
                k0().setMusicCtrlBtnStatus(false);
            }
        }
        kd2.q0 q0Var3 = this.C;
        if (q0Var3 != null && (qt2Var = q0Var3.f306803d) != null) {
            if (z19) {
                C0(2);
                com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.lang.String str2 = this.D;
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put("float_frame_id", str2);
                kd2.q0 q0Var4 = this.C;
                if (q0Var4 != null && (feedData2 = q0Var4.f306806g) != null) {
                    jSONObject.put("feedid", pm0.v.u(feedData2.getFeedId()));
                }
                com.tencent.mm.plugin.finder.report.b6.d(b6Var, qt2Var, "wechat_push_card", 1, jSONObject, false, null, 48, null);
            }
            com.tencent.mm.plugin.ball.model.BallReportInfo ballReportInfo2 = this.f93132d.M;
            int integer = qt2Var.getInteger(5);
            int i19 = 17;
            if (integer == 17) {
                i19 = 15;
            } else if (integer == 18) {
                i19 = 16;
            } else if (integer != 20) {
                i19 = 0;
            }
            ballReportInfo2.f93085e = i19;
        }
        this.f93132d.M.f93090m = 16;
        kd2.q0 q0Var5 = this.f306787x;
        if (q0Var5 != null && (feedData = q0Var5.f306806g) != null && feedData.getMediaType() == 4) {
            z29 = true;
        }
        if (z29) {
            this.f306786J = true;
            U0();
        }
    }

    public final boolean K0() {
        cw2.da daVar = this.f306788y;
        boolean isPlaying = daVar != null ? daVar.isPlaying() : false;
        vo2.d dVar = this.f306789z;
        boolean b17 = isPlaying | (dVar != null ? ((vo2.c) dVar).b() : false);
        kd2.s1 s1Var = this.A;
        return b17 | (s1Var != null ? ((com.tencent.mm.plugin.finder.video.FinderLivePlayView) s1Var).isPlaying() : false);
    }

    public final boolean L0(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.Class<?> cls = activity.getClass();
        kd2.q0 q0Var = this.C;
        return kotlin.jvm.internal.o.b(cls, q0Var != null ? q0Var.f306813n : null);
    }

    public final boolean M0() {
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        kd2.q0 q0Var = this.C;
        return (q0Var == null || (feedData = q0Var.f306806g) == null || feedData.getMediaType() != 9) ? false : true;
    }

    public final boolean N0() {
        kd2.q0 q0Var = this.C;
        if (!kotlin.jvm.internal.o.b(com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI.class, q0Var != null ? q0Var.f306813n : null)) {
            kd2.q0 q0Var2 = this.C;
            if (!kotlin.jvm.internal.o.b(com.tencent.mm.plugin.finder.ui.FinderHomeUI.class, q0Var2 != null ? q0Var2.f306813n : null)) {
                return false;
            }
        }
        return true;
    }

    public final boolean O0() {
        java.lang.Class cls;
        kd2.q0 q0Var = this.C;
        if (q0Var == null || (cls = q0Var.f306813n) == null) {
            return false;
        }
        return com.tencent.mm.plugin.flutter.ui.MegaVideoFlutterActivity.class.isAssignableFrom(cls);
    }

    public void P0() {
        java.lang.Object obj = this.f306788y;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null) {
            android.view.ViewParent parent = view.getParent();
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = parent instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) parent : null;
            if (finderVideoLayout != null) {
                finderVideoLayout.removeView(view);
            }
        }
        java.lang.Object obj2 = this.A;
        android.view.View view2 = obj2 instanceof android.view.View ? (android.view.View) obj2 : null;
        if (view2 != null) {
            android.view.ViewParent parent2 = view2.getParent();
            com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout2 = parent2 instanceof com.tencent.mm.plugin.finder.video.FinderVideoLayout ? (com.tencent.mm.plugin.finder.video.FinderVideoLayout) parent2 : null;
            if (finderVideoLayout2 != null) {
                finderVideoLayout2.removeView(view2);
            }
        }
        N();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q0(int r41) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.Q0(int):void");
    }

    public final void R0() {
        com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniPlayerProxy f111318e;
        kd2.s1 s1Var = this.A;
        if (s1Var != null) {
            s1Var.setVideoPlayLifecycle(null);
            com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = (com.tencent.mm.plugin.finder.video.FinderLivePlayView) s1Var;
            finderLivePlayView.d();
            finderLivePlayView.b();
        }
        this.A = null;
        kd2.d0 d0Var = this.B;
        if (d0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreFeedMini", "removeLivePlayerView");
            com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView = d0Var.f306726c;
            com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniPlayerProxy f111318e2 = finderLiveFeedMiniView != null ? finderLiveFeedMiniView.getF111318e() : null;
            com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView2 = d0Var.f306726c;
            if (finderLiveFeedMiniView2 != null && (f111318e = finderLiveFeedMiniView2.getF111318e()) != null) {
                f111318e.setPlayCallback(null);
            }
            com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView3 = d0Var.f306726c;
            if (finderLiveFeedMiniView3 != null) {
                finderLiveFeedMiniView3.f111317d.removeAllViews();
                finderLiveFeedMiniView3.f111318e = null;
                finderLiveFeedMiniView3.f111319f = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreFeedMini", "exitMinimizeMode:" + f111318e2);
            if (f111318e2 != null) {
                com.tencent.mm.plugin.finder.floatball.FinderLiveFeedMiniView finderLiveFeedMiniView4 = d0Var.f306726c;
                com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView2 = (com.tencent.mm.plugin.finder.video.FinderLivePlayView) f111318e2;
                finderLivePlayView2.Y("exitMinimizeMode:" + finderLiveFeedMiniView4);
                finderLivePlayView2.K = false;
                zy2.a8 a8Var = finderLivePlayView2.liveFeedDecorator;
                if (a8Var != null) {
                    com.tencent.mm.plugin.finder.feed.uf ufVar = (com.tencent.mm.plugin.finder.feed.uf) a8Var;
                    com.tencent.mars.xlog.Log.i(ufVar.j(), "exitMinimizeMode:" + finderLiveFeedMiniView4);
                    ufVar.f109179y = false;
                    com.tencent.mm.plugin.finder.feed.kf kfVar = ufVar.f109168n;
                    kfVar.getClass();
                    java.lang.String str = kfVar.f107191e;
                    com.tencent.mars.xlog.Log.i(str, "exitMinimizeMode:" + finderLiveFeedMiniView4);
                    kfVar.L = false;
                    com.tencent.mars.xlog.Log.i(str, "prepareForExitMinimize");
                    com.tencent.mm.view.ratio.RatioLayout ratioLayout = kfVar.D;
                    if (ratioLayout != null) {
                        ratioLayout.setAdapter(kfVar.f107196j);
                    }
                    for (java.util.Map.Entry entry : kfVar.f107193g.entrySet()) {
                        kfVar.e(((java.lang.Boolean) entry.getValue()).booleanValue(), (java.lang.String) entry.getKey());
                    }
                    kfVar.b();
                    com.tencent.mm.plugin.finder.live.mic.voiceroom.LiveVoiceRoomLayoutView liveVoiceRoomLayoutView = kfVar.E;
                    if (liveVoiceRoomLayoutView != null) {
                        com.tencent.mars.xlog.Log.i(liveVoiceRoomLayoutView.f111699v, "onUnBind");
                        liveVoiceRoomLayoutView.singContentLayout.removeAllViews();
                        liveVoiceRoomLayoutView.coverBackgroundLayout.removeAllViews();
                    }
                    kfVar.c().b(kfVar.E);
                    em2.i iVar = kfVar.f107202p;
                    if (iVar != null) {
                        iVar.reset();
                    }
                    kfVar.M = null;
                    com.tencent.mars.xlog.Log.i(ufVar.j(), "prepareForExitMinimize");
                    ufVar.t(true);
                    ufVar.s();
                    pm0.v.X(new com.tencent.mm.plugin.finder.feed.nf(ufVar));
                }
                mn0.b0 b0Var = finderLivePlayView2.txLivePlayer;
                if (b0Var != null) {
                    android.content.Context context = finderLivePlayView2.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    ((mn0.y) b0Var).Q(finderLivePlayView2.P(context, finderLivePlayView2.f130614t, finderLivePlayView2.f130615u));
                }
            }
        }
    }

    public final void S0() {
        com.tencent.mars.xlog.Log.i("FinderVideoPassive", "resetPlayers: playingView = " + this.f306788y + ", musicPlayer = " + this.f306789z + ", livePlayer = " + this.A);
        cw2.da daVar = this.f306788y;
        if (daVar != null) {
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = daVar instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar : null;
            if (finderThumbPlayerProxy != null) {
                finderThumbPlayerProxy.setVideoViewCallback(null);
                finderThumbPlayerProxy.setLifecycle(null);
            }
            daVar.setVideoPlayLifecycle(null);
            daVar.d();
            daVar.b();
            A0();
        }
        this.f306788y = null;
        vo2.d dVar = this.f306789z;
        if (dVar != null) {
            vo2.c cVar = (vo2.c) dVar;
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy2 = cVar.f438559b;
            if (finderThumbPlayerProxy2 != null) {
                finderThumbPlayerProxy2.setVideoViewFocused(false);
            }
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy3 = cVar.f438559b;
            if (finderThumbPlayerProxy3 != null) {
                finderThumbPlayerProxy3.stop();
            }
            cVar.e();
        }
        this.f306789z = null;
        R0();
    }

    public final void U0() {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ng).getValue()).r()).booleanValue()) {
            boolean u17 = u();
            if (!this.f306786J || !u17) {
                com.tencent.mars.xlog.Log.i("FinderVideoPassive", "[updateSystemPlayer] unable update system player, hasFloatBall = " + u17 + ", enableSystemPlayer = " + this.f306786J);
                return;
            }
            i95.m c18 = i95.n0.c(eu2.b0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ((eu2.b0) c18).qj(this.f306788y, eu2.k.f256795e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updateSystemPlayer], isPlaying = ");
            cw2.da daVar = this.f306788y;
            sb6.append(daVar != null ? java.lang.Boolean.valueOf(daVar.isPlaying()) : null);
            com.tencent.mars.xlog.Log.i("FinderVideoPassive", sb6.toString());
        }
    }

    @Override // com.tencent.mm.plugin.ball.service.d, gp1.r
    public void b(int i17, java.lang.String str) {
        super.b(i17, str);
        t().f93086f = 24;
    }

    @Override // kd2.q
    public void h0() {
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy;
        gp1.v Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi();
        if (Bi != null) {
            Bi.r0();
        }
        if (!K0()) {
            T0(this, false, false, false, 4, null);
        }
        cw2.da daVar = this.f306788y;
        if (daVar != null) {
            daVar.setMute(false);
        }
        vo2.d dVar = this.f306789z;
        if (dVar != null && (finderThumbPlayerProxy = ((vo2.c) dVar).f438559b) != null) {
            finderThumbPlayerProxy.setMute(false);
        }
        kd2.s1 s1Var = this.A;
        if (s1Var != null) {
            s1Var.setMute(false);
        }
    }

    @Override // kd2.q
    public android.view.View.OnClickListener i0() {
        return new kd2.u0(new kd2.c(this));
    }

    @Override // kd2.q
    public android.view.View.OnClickListener j0() {
        return new kd2.v0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0126  */
    @Override // kd2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l0() {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.l0():boolean");
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public boolean n() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        if (r1 != false) goto L15;
     */
    @Override // kd2.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n0() {
        /*
            r9 = this;
            cw2.da r0 = r9.f306788y
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.isPlaying()
            if (r0 != r2) goto Le
            r0 = r2
            goto Lf
        Le:
            r0 = r1
        Lf:
            if (r0 != 0) goto L20
            kd2.s1 r0 = r9.A
            if (r0 == 0) goto L1e
            com.tencent.mm.plugin.finder.video.FinderLivePlayView r0 = (com.tencent.mm.plugin.finder.video.FinderLivePlayView) r0
            boolean r0 = r0.isPlaying()
            if (r0 != r2) goto L1e
            r1 = r2
        L1e:
            if (r1 == 0) goto L33
        L20:
            java.lang.Class<pv.d0> r0 = pv.d0.class
            i95.m r0 = i95.n0.c(r0)
            pv.d0 r0 = (pv.d0) r0
            ov.i0 r0 = (ov.i0) r0
            gp1.v r0 = r0.Bi()
            if (r0 == 0) goto L33
            r0.k0()
        L33:
            r4 = 1
            r5 = 0
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r9
            T0(r3, r4, r5, r6, r7, r8)
            cw2.da r0 = r9.f306788y
            if (r0 == 0) goto L43
            r0.setMute(r2)
        L43:
            vo2.d r0 = r9.f306789z
            if (r0 == 0) goto L50
            vo2.c r0 = (vo2.c) r0
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy r0 = r0.f438559b
            if (r0 == 0) goto L50
            r0.setMute(r2)
        L50:
            kd2.s1 r0 = r9.A
            if (r0 == 0) goto L57
            r0.setMute(r2)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.n0():void");
    }

    @Override // kd2.q
    public void o0(int i17, int i18) {
        com.tencent.mm.plugin.finder.feed.model.ea eaVar;
        com.tencent.mm.plugin.finder.storage.FeedData feedData;
        com.tencent.mm.plugin.finder.storage.FeedData feedData2;
        if (O0()) {
            jz5.g gVar = com.tencent.mm.plugin.finder.feed.model.ea.f107833d;
            eaVar = (com.tencent.mm.plugin.finder.feed.model.ea) ((jz5.n) com.tencent.mm.plugin.finder.feed.model.ea.f107835f).getValue();
        } else {
            eaVar = this.H;
        }
        com.tencent.mm.plugin.finder.feed.model.ea eaVar2 = eaVar;
        if (eaVar2 == null) {
            return;
        }
        kd2.q0 q0Var = this.f306787x;
        java.lang.Long valueOf = (q0Var == null || (feedData2 = q0Var.f306806g) == null) ? null : java.lang.Long.valueOf(feedData2.getFeedId());
        if (valueOf != null) {
            if (valueOf.longValue() == eaVar2.f107837b) {
                return;
            }
            long j17 = i17;
            jz5.g gVar2 = com.tencent.mm.plugin.finder.feed.model.ea.f107833d;
            if (j17 + ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.finder.feed.model.ea.f107833d).getValue()).longValue() < i18) {
                return;
            }
            if (!O0()) {
                long longValue = valueOf.longValue();
                kd2.q0 q0Var2 = this.C;
                com.tencent.mm.plugin.finder.feed.model.ea.b(eaVar2, longValue, (q0Var2 == null || (feedData = q0Var2.f306806g) == null) ? null : feedData.getNonceId(), null, null, null, null, 60, null);
                return;
            }
            qg3.i0 a17 = qg3.k0.f362826d.a();
            qg3.h1 a18 = a17 != null ? ((qg3.k0) a17).a() : null;
            if (a18 != null) {
                qg3.i1 i1Var = (qg3.i1) a18;
                if (urgen.ur_54A4.UR_2D5C.UR_211C(i1Var.getCppPointer()).length() == 0) {
                    com.tencent.unit_rc.BaseObjectDef UR_14D9 = urgen.ur_54A4.UR_2D5C.UR_14D9(i1Var.getCppPointer());
                    kotlin.jvm.internal.o.e(UR_14D9, "null cannot be cast to non-null type com.tencent.mm.plugin.mega_video.ur.FeedFlowModel");
                    kd2.j1 j1Var = kd2.j1.f306764d;
                    qg3.q qVar = new qg3.q();
                    qVar.f362846e = j1Var;
                    urgen.ur_54A4.UR_2809.UR_040A(((qg3.f) ((qg3.e) UR_14D9)).getCppPointer(), 2, qVar);
                }
            }
        }
    }

    @Override // kd2.q
    public void p0() {
        kd2.p0 p0Var;
        kd2.p0 p0Var2;
        kd2.o0 o0Var = N;
        kd2.q0 q0Var = o0Var.a().f306787x;
        if (q0Var != null && (p0Var2 = q0Var.f306809j) != null) {
            p0Var2.f306784b = android.os.SystemClock.elapsedRealtime();
        }
        kd2.q0 q0Var2 = o0Var.a().f306787x;
        if (q0Var2 != null && (p0Var = q0Var2.f306810k) != null) {
            p0Var.f306784b = android.os.SystemClock.elapsedRealtime();
        }
        U0();
    }

    @Override // kd2.q
    public void q0() {
        kd2.p0 p0Var;
        kd2.p0 p0Var2;
        kd2.o0 o0Var = N;
        kd2.q0 q0Var = o0Var.a().f306787x;
        if (q0Var != null && (p0Var2 = q0Var.f306809j) != null) {
            p0Var2.f306784b = android.os.SystemClock.elapsedRealtime();
        }
        kd2.q0 q0Var2 = o0Var.a().f306787x;
        if (q0Var2 != null && (p0Var = q0Var2.f306810k) != null) {
            p0Var.f306784b = android.os.SystemClock.elapsedRealtime();
        }
        U0();
    }

    @Override // kd2.q
    public void r0() {
        kd2.p0 p0Var;
        kd2.p0 p0Var2;
        kd2.o0 o0Var = N;
        kd2.q0 q0Var = o0Var.a().f306787x;
        if (q0Var != null && (p0Var2 = q0Var.f306809j) != null) {
            if (p0Var2.f306784b > 0) {
                p0Var2.f306785c += android.os.SystemClock.elapsedRealtime() - p0Var2.f306784b;
            }
            p0Var2.f306784b = 0L;
        }
        kd2.q0 q0Var2 = o0Var.a().f306787x;
        if (q0Var2 != null && (p0Var = q0Var2.f306810k) != null) {
            if (p0Var.f306784b > 0) {
                p0Var.f306785c += android.os.SystemClock.elapsedRealtime() - p0Var.f306784b;
            }
            p0Var.f306784b = 0L;
        }
        U0();
    }

    @Override // kd2.q
    public void s0() {
        super.s0();
        dead();
    }

    @Override // kd2.q
    public boolean t0() {
        ls5.m eventDetector;
        ls5.k eventDetectorAdapter;
        ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.FinderVideoPassiveMiniViewHelper");
        this.H = null;
        this.G = false;
        cw2.da daVar = this.f306788y;
        if (daVar != null && (eventDetector = daVar.getEventDetector()) != null && (eventDetectorAdapter = eventDetector.getEventDetectorAdapter()) != null) {
            ((ls5.d) eventDetectorAdapter).b(null);
        }
        S0();
        kd2.q0 q0Var = this.f306787x;
        if (q0Var != null) {
            this.I = q0Var;
        }
        this.f306787x = null;
        this.C = null;
        return super.t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x0(boolean r19, boolean r20, boolean r21, com.tencent.mm.plugin.finder.feed.model.ea r22, boolean r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.x0(boolean, boolean, boolean, com.tencent.mm.plugin.finder.feed.model.ea, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (((r3 == null || r3.f306808i) ? false : true) != false) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x09c8  */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106 */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.tencent.mm.protobuf.e] */
    /* JADX WARN: Type inference failed for: r1v28, types: [r45.qt2] */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38, types: [com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47, types: [android.view.View, com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy] */
    /* JADX WARN: Type inference failed for: r3v50, types: [com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy] */
    /* JADX WARN: Type inference failed for: r3v52, types: [com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z0(int r34, com.tencent.mm.plugin.finder.storage.FeedData r35, cw2.wa r36, r45.zi2 r37, long r38, float r40, boolean r41, boolean r42, boolean r43, boolean r44) {
        /*
            Method dump skipped, instructions count: 2711
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd2.p1.z0(int, com.tencent.mm.plugin.finder.storage.FeedData, cw2.wa, r45.zi2, long, float, boolean, boolean, boolean, boolean):void");
    }
}
