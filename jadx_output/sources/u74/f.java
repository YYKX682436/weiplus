package u74;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public u74.d f425166a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.n f425167b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f425168c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f425169d;

    /* renamed from: e, reason: collision with root package name */
    public i64.b1 f425170e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.TimeLineObject f425171f;

    /* renamed from: g, reason: collision with root package name */
    public gd4.z f425172g;

    /* renamed from: h, reason: collision with root package name */
    public p84.e f425173h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.living.j0 f425174i;

    /* renamed from: j, reason: collision with root package name */
    public u74.e f425175j;

    public static /* synthetic */ u74.e a(u74.f fVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        u74.e eVar = fVar.f425175j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        return eVar;
    }

    public static u74.d g(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        u74.d dVar = new u74.d();
        dVar.f425140a = view.findViewById(com.tencent.mm.R.id.o47);
        dVar.f425141b = (com.tencent.mm.plugin.sns.ad.widget.FullCardContentBackgroundView) view.findViewById(com.tencent.mm.R.id.f487279o46);
        dVar.f425142c = view.findViewById(com.tencent.mm.R.id.ofu);
        dVar.f425143d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ofw);
        dVar.f425144e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.ofv);
        dVar.f425145f = view.findViewById(com.tencent.mm.R.id.aug);
        dVar.f425146g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.aui);
        dVar.f425147h = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.auh);
        com.tencent.mm.plugin.sns.ad.widget.FullCardContentBackgroundView fullCardContentBackgroundView = dVar.f425141b;
        android.view.View topLayer = dVar.f425142c;
        android.view.View bottomLayer = dVar.f425145f;
        fullCardContentBackgroundView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.FullCardContentBackgroundView");
        kotlin.jvm.internal.o.g(topLayer, "topLayer");
        kotlin.jvm.internal.o.g(bottomLayer, "bottomLayer");
        fullCardContentBackgroundView.f163257d = topLayer;
        fullCardContentBackgroundView.f163258e = bottomLayer;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.FullCardContentBackgroundView");
        float I = ca4.m0.I(com.tencent.mm.R.dimen.a_q);
        float I2 = ca4.m0.I(com.tencent.mm.R.dimen.a_l);
        dVar.f425143d.setTextSize(0, I);
        dVar.f425144e.setTextSize(0, I2);
        dVar.f425146g.setTextSize(0, I);
        dVar.f425147h.setTextSize(0, I2);
        dVar.f425148i = view.findViewById(com.tencent.mm.R.id.aut);
        dVar.f425149j = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.jkr);
        dVar.f425150k = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jks);
        com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView = (com.tencent.mm.plugin.sns.ui.MaskImageView) view.findViewById(com.tencent.mm.R.id.ggp);
        dVar.f425151l = maskImageView;
        maskImageView.setScaleType(al5.q2.CENTER_CROP);
        com.tencent.mm.plugin.sns.ui.g9 g9Var = new com.tencent.mm.plugin.sns.ui.g9();
        dVar.f425154o = g9Var;
        g9Var.f168418h = view.findViewById(com.tencent.mm.R.id.ggs);
        com.tencent.mm.plugin.sns.ui.g9 g9Var2 = dVar.f425154o;
        android.view.View view2 = g9Var2.f168418h;
        g9Var2.f168414d = view2;
        g9Var2.f168415e = (com.tencent.mm.pluginsdk.ui.tools.VideoSightView) view2.findViewById(com.tencent.mm.R.id.h88);
        com.tencent.mm.plugin.sns.ui.g9 g9Var3 = dVar.f425154o;
        g9Var3.f168417g = (com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView) g9Var3.f168418h.findViewById(com.tencent.mm.R.id.khn);
        dVar.f425154o.f168417g.setMute(true);
        dVar.f425154o.f168419i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.ggr);
        com.tencent.mm.plugin.sns.ui.g9 g9Var4 = dVar.f425154o;
        g9Var4.f168420j = (com.tencent.mm.ui.widget.MMPinProgressBtn) g9Var4.f168418h.findViewById(com.tencent.mm.R.id.lbi);
        com.tencent.mm.plugin.sns.ui.g9 g9Var5 = dVar.f425154o;
        g9Var5.f168422l = (android.widget.TextView) g9Var5.f168418h.findViewById(com.tencent.mm.R.id.dgp);
        com.tencent.mm.plugin.sns.ui.g9 g9Var6 = dVar.f425154o;
        g9Var6.f168421k = (android.widget.TextView) g9Var6.f168418h.findViewById(com.tencent.mm.R.id.dhd);
        dVar.f425152m = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.gff);
        dVar.f425153n = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dge);
        dVar.f425157r = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.f482656ke);
        dVar.f425159t = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.f482648k6);
        dVar.f425161v = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ggq);
        dVar.S = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.n1p);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        return dVar;
    }

    public static boolean m(com.tencent.mm.plugin.sns.storage.ADXml aDXml) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        if (aDXml != null && aDXml.isLongPressGestureAd()) {
            com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "fullcard useOnlineVideoView false, longPressAd disable");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return false;
        }
        if (aDXml != null && aDXml.isAdBreakFrameVideo()) {
            com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "fullcard useOnlineVideoView false, isAdBreakFrameVideo disable");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return false;
        }
        if (aDXml != null && aDXml.isAdIpInteractVideo()) {
            com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "fullcard useOnlineVideoView false, isAdIpInteractVideo disable");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return false;
        }
        if (aDXml != null && aDXml.isAdSolidBreakFrameVideo()) {
            com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "fullcard useOnlineVideoView false, isAdSolidBreakFrameVideo disable");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return false;
        }
        int i17 = p34.v.f351699a;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "fullcard useOnlineVideoView false, force offline");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return false;
        }
        if (i17 == 2) {
            com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "fullcard useOnlineVideoView true, force online");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExptUseOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExptUseOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        if (n74.l0.c(aDXml)) {
            com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "fullcard useOnlineVideoView true");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return true;
        }
        com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "fullcard useOnlineVideoView false, adXml StreamingMode disable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useOnlineVideoView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        return false;
    }

    public final void b(s34.r0 r0Var, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        if (com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper.e(r0Var, z17)) {
            u74.d dVar = this.f425166a;
            if (dVar.f425160u == null) {
                dVar.f425160u = (com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper) dVar.f425159t.inflate();
            }
            if (this.f425166a.f425160u != null) {
                this.f425166a.f425160u.d(r0Var, str, i65.a.b(this.f425169d, 60), i65.a.b(this.f425169d, 35));
                this.f425166a.f425160u.setVisibility(0);
            }
        } else {
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper finderLivingAnimWrapper = this.f425166a.f425160u;
            if (finderLivingAnimWrapper != null) {
                finderLivingAnimWrapper.setVisibility(8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkShowLivingAnim", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.ViewGroup.LayoutParams c(int r33) {
        /*
            Method dump skipped, instructions count: 1685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u74.f.c(int):android.view.ViewGroup$LayoutParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:3:0x0007, B:5:0x0010, B:7:0x0016, B:10:0x001f, B:12:0x002a, B:14:0x0034, B:15:0x003e, B:17:0x0042, B:19:0x0050, B:21:0x0054, B:23:0x007d, B:24:0x0084, B:28:0x008e, B:30:0x0096, B:31:0x0099, B:33:0x009f, B:34:0x0024), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:3:0x0007, B:5:0x0010, B:7:0x0016, B:10:0x001f, B:12:0x002a, B:14:0x0034, B:15:0x003e, B:17:0x0042, B:19:0x0050, B:21:0x0054, B:23:0x007d, B:24:0x0084, B:28:0x008e, B:30:0x0096, B:31:0x0099, B:33:0x009f, B:34:0x0024), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(com.tencent.mm.plugin.sns.storage.SnsInfo r9) {
        /*
            r8 = this;
            java.lang.String r0 = "fillLivingViewInfo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "shouldShowLivingView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)     // Catch: java.lang.Throwable -> La3
            r3 = 0
            if (r9 == 0) goto L24
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r9.getAdXml()     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L24
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r9.getAdXml()     // Catch: java.lang.Throwable -> La3
            s34.r0 r4 = r4.adLiveInfo     // Catch: java.lang.Throwable -> La3
            if (r4 != 0) goto L1f
            goto L24
        L1f:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch: java.lang.Throwable -> La3
            r2 = 1
            goto L28
        L24:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)     // Catch: java.lang.Throwable -> La3
            r2 = r3
        L28:
            if (r2 == 0) goto L8e
            com.tencent.mm.protocal.protobuf.TimeLineObject r2 = r9.getTimeLine()     // Catch: java.lang.Throwable -> La3
            u74.d r4 = r8.f425166a     // Catch: java.lang.Throwable -> La3
            android.view.ViewGroup r5 = r4.f425158s     // Catch: java.lang.Throwable -> La3
            if (r5 != 0) goto L3e
            android.view.ViewStub r5 = r4.f425157r     // Catch: java.lang.Throwable -> La3
            android.view.View r5 = r5.inflate()     // Catch: java.lang.Throwable -> La3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5     // Catch: java.lang.Throwable -> La3
            r4.f425158s = r5     // Catch: java.lang.Throwable -> La3
        L3e:
            com.tencent.mm.plugin.sns.ad.widget.living.j0 r4 = r8.f425174i     // Catch: java.lang.Throwable -> La3
            if (r4 != 0) goto L4e
            com.tencent.mm.plugin.sns.ad.widget.living.j0 r4 = new com.tencent.mm.plugin.sns.ad.widget.living.j0     // Catch: java.lang.Throwable -> La3
            u74.d r5 = r8.f425166a     // Catch: java.lang.Throwable -> La3
            android.view.ViewGroup r5 = r5.f425158s     // Catch: java.lang.Throwable -> La3
            r6 = 0
            r4.<init>(r5, r6, r6)     // Catch: java.lang.Throwable -> La3
            r8.f425174i = r4     // Catch: java.lang.Throwable -> La3
        L4e:
            if (r2 == 0) goto Lbb
            com.tencent.mm.plugin.sns.ad.widget.living.j0 r4 = r8.f425174i     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto Lbb
            com.tencent.mm.plugin.sns.storage.ADXml r4 = r9.getAdXml()     // Catch: java.lang.Throwable -> La3
            s34.r0 r4 = r4.adLiveInfo     // Catch: java.lang.Throwable -> La3
            java.lang.String r5 = r2.Id     // Catch: java.lang.Throwable -> La3
            int r6 = r4.f402745a     // Catch: java.lang.Throwable -> La3
            int r5 = com.tencent.mm.plugin.sns.ad.widget.living.i0.c(r5, r6)     // Catch: java.lang.Throwable -> La3
            com.tencent.mm.plugin.sns.ad.widget.living.j0 r6 = r8.f425174i     // Catch: java.lang.Throwable -> La3
            java.lang.String r7 = r2.Id     // Catch: java.lang.Throwable -> La3
            r6.g(r7, r4)     // Catch: java.lang.Throwable -> La3
            com.tencent.mm.plugin.sns.ad.widget.living.j0 r6 = r8.f425174i     // Catch: java.lang.Throwable -> La3
            r6.h(r5)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = r2.Id     // Catch: java.lang.Throwable -> La3
            com.tencent.mm.plugin.sns.ad.widget.living.j0 r7 = r8.f425174i     // Catch: java.lang.Throwable -> La3
            com.tencent.mm.plugin.sns.ad.widget.living.i0.a(r6, r7)     // Catch: java.lang.Throwable -> La3
            com.tencent.mm.plugin.sns.storage.SnsInfo r6 = r8.f425168c     // Catch: java.lang.Throwable -> La3
            boolean r6 = com.tencent.mm.plugin.sns.ad.widget.living.v.a(r6)     // Catch: java.lang.Throwable -> La3
            if (r6 != 0) goto L84
            e74.i r6 = e74.i.f()     // Catch: java.lang.Throwable -> La3
            r6.d(r3, r9)     // Catch: java.lang.Throwable -> La3
        L84:
            boolean r9 = com.tencent.mm.plugin.sns.ad.widget.living.j0.f(r5)     // Catch: java.lang.Throwable -> La3
            java.lang.String r2 = r2.Id     // Catch: java.lang.Throwable -> La3
            r8.b(r4, r2, r9)     // Catch: java.lang.Throwable -> La3
            goto Lbb
        L8e:
            u74.d r9 = r8.f425166a     // Catch: java.lang.Throwable -> La3
            android.view.ViewGroup r9 = r9.f425158s     // Catch: java.lang.Throwable -> La3
            r2 = 8
            if (r9 == 0) goto L99
            r9.setVisibility(r2)     // Catch: java.lang.Throwable -> La3
        L99:
            u74.d r9 = r8.f425166a     // Catch: java.lang.Throwable -> La3
            com.tencent.mm.plugin.sns.ad.widget.living.FinderLivingAnimWrapper r9 = r9.f425160u     // Catch: java.lang.Throwable -> La3
            if (r9 == 0) goto Lbb
            r9.setVisibility(r2)     // Catch: java.lang.Throwable -> La3
            goto Lbb
        La3:
            r9 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "fillLivingViewInfo, exp="
            r2.<init>(r3)
            java.lang.String r9 = android.util.Log.getStackTraceString(r9)
            r2.append(r9)
            java.lang.String r9 = r2.toString()
            java.lang.String r2 = "FullCardAdWrapper"
            com.tencent.mars.xlog.Log.e(r2, r9)
        Lbb:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u74.f.d(com.tencent.mm.plugin.sns.storage.SnsInfo):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x033d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(r45.jj4 r30, com.tencent.mm.plugin.sns.model.i1 r31, int r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 1723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u74.f.e(r45.jj4, com.tencent.mm.plugin.sns.model.i1, int, boolean):void");
    }

    public void f(u74.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        if (dVar != null) {
            try {
                android.view.View view = dVar.f425163x;
                if (view != null) {
                    dVar.A = (com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView) view.findViewById(com.tencent.mm.R.id.f482806od);
                    dVar.B = (android.view.ViewGroup) dVar.f425163x.findViewById(com.tencent.mm.R.id.afc);
                    dVar.C = (android.widget.LinearLayout) dVar.f425163x.findViewById(com.tencent.mm.R.id.f482668kq);
                    dVar.D = (android.widget.LinearLayout) dVar.f425163x.findViewById(com.tencent.mm.R.id.nbz);
                    dVar.N = (android.view.ViewStub) dVar.f425163x.findViewById(com.tencent.mm.R.id.n1s);
                    dVar.F = (android.view.ViewStub) dVar.f425163x.findViewById(com.tencent.mm.R.id.mv_);
                    dVar.f425139J = (android.view.ViewStub) dVar.f425163x.findViewById(com.tencent.mm.R.id.qwk);
                    dVar.L = (android.view.ViewStub) dVar.f425163x.findViewById(com.tencent.mm.R.id.n1r);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initRootView", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
    }

    public void h(boolean z17, boolean z18) {
        gd4.z zVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f425168c;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return;
        }
        l44.b3.f316041a.i(new l44.d0(this.f425166a.T.f425131a, snsInfo, false));
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f425168c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f425168c;
        if (snsInfo2 == null || (!(snsInfo2.isBreakFrameAd() || this.f425168c.isAdIpInteractVideo() || this.f425168c.isSolidBreakFrameAd()) || (zVar = this.f425172g) == null)) {
            com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "pausePlay, onlineVideo=" + z17);
            if (z17) {
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.f425166a.f425162w;
                if (snsTimelineVideoView != null && snsTimelineVideoView.w()) {
                    this.f425166a.f425162w.F();
                }
            } else {
                this.f425166a.f425154o.f168417g.setShouldPlayWhenPrepared(false);
                com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView = this.f425166a.f425154o.f168417g;
                snsAdTimelineVideoView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdTimelineVideoView", "pause");
                snsAdTimelineVideoView.r();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return;
        }
        gd4.r rVar = (gd4.r) zVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        kotlinx.coroutines.flow.h3 h3Var = (kotlinx.coroutines.flow.h3) rVar.f270827l;
        if (h3Var.getValue() != gd4.e.f270683f) {
            h3Var.k(gd4.e.f270682e);
            hd4.i iVar = rVar.f270834s;
            if (iVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureLogic");
                try {
                    hd4.g gVar = iVar.f280586b;
                    if (gVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                        com.tencent.mars.xlog.Log.i(gVar.j(), "pausePlay");
                        gVar.A();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureComponent");
                    }
                } catch (java.lang.Throwable th6) {
                    ca4.q.c("AdBreakFrameGestureLogic", th6);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureLogic");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v125 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r2v99, types: [com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v31 */
    public void i(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.model.i1 i1Var, r45.jj4 jj4Var, com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2;
        int i17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.jj4 jj4Var2;
        final kotlinx.coroutines.y0 i18;
        com.tencent.mm.memory.r rVar;
        java.lang.String str4;
        com.tencent.mm.plugin.sns.ui.g9 g9Var;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView2;
        gd4.r rVar2;
        java.lang.String str5;
        char c17;
        int i19;
        gd4.r rVar3;
        com.tencent.mm.plugin.sns.ui.g9 g9Var2;
        com.tencent.mm.plugin.sns.ui.g9 g9Var3;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView3;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView2;
        com.tencent.mm.plugin.sns.ui.g9 g9Var4;
        com.tencent.mm.plugin.sns.ui.g9 g9Var5;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView4;
        com.tencent.mm.plugin.sns.ui.g9 g9Var6;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView5;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView3;
        jz5.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView4;
        android.widget.ImageView mBreakThumbView;
        com.tencent.mm.plugin.sns.storage.d0 d0Var;
        com.tencent.mm.plugin.sns.ui.g9 g9Var7;
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.sns.ui.g9 g9Var8;
        com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn;
        u74.f fVar = this;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readySnsSightOffline", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3 = fVar.f425168c;
        if (snsInfo3 == null || !snsInfo3.isAdForbidAutoPlay()) {
            snsAdTimelineVideoView.setForbidAutoPlay(false);
        } else {
            snsAdTimelineVideoView.setForbidAutoPlay(true);
        }
        if (snsInfo != null) {
            if (!snsInfo.isBreakFrameAd() && !snsInfo.isAdIpInteractVideo() && !snsInfo.isSolidBreakFrameAd()) {
                snsInfo2 = snsInfo;
                i17 = 1;
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo4 = fVar.f425168c;
                int i27 = (snsInfo4 == null && snsInfo4.isAdForbidAutoPlay()) ? 0 : i17;
                int hashCode = fVar.f425169d.hashCode();
                i1Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                if (jj4Var != null || (str = jj4Var.f377855d) == null || str.equals("")) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                } else {
                    java.lang.String x17 = ca4.z0.x(i17, jj4Var.f377855d);
                    i1Var.M(snsInfo.getSnsId(), jj4Var, x17, s7Var, false);
                    i1Var.s0(snsAdTimelineVideoView, x17, true, -1, hashCode);
                    java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
                    java.lang.String U = ca4.z0.U(jj4Var);
                    if (com.tencent.mm.vfs.w6.j(d17 + U)) {
                        str2 = U;
                        str3 = d17;
                    } else {
                        ca4.s0 s0Var = new ca4.s0(jj4Var);
                        s0Var.d(i17);
                        s0Var.e(jj4Var.f377855d);
                        str2 = U;
                        str3 = d17;
                        com.tencent.mm.plugin.sns.model.l4.Cj().e(jj4Var, jj4Var.f377856e == 6 ? 5 : i17, s0Var, s7Var, ca4.z0.t0(snsInfo2.field_snsId));
                    }
                    java.lang.String H = i27 != 0 ? i1Var.H(snsInfo, jj4Var, s7Var, true, ca4.z0.t0(snsInfo2.field_snsId)) : "";
                    com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "SnsAdTimelineVideoView, setsight %s sightPath %s isAd %b", x17, H, java.lang.Boolean.TRUE);
                    if (com.tencent.mm.sdk.platformtools.t8.K0(H) || i1Var.E(jj4Var)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "SnsAdTimelineVideoView, sightPath %s", H);
                        snsAdTimelineVideoView.setVideoPath(null);
                        snsAdTimelineVideoView.u();
                        com.tencent.mm.memory.r k17 = i1Var.k(x17, jj4Var.f377855d);
                        if (ca4.z0.g(k17)) {
                            i1Var.R(snsAdTimelineVideoView, x17, k17, false);
                            ta4.u0.m(jj4Var.f377855d);
                            ta4.u0.o(jj4Var.f377855d);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        } else {
                            snsAdTimelineVideoView.setThumbBmp(null);
                            if (((java.util.HashSet) i1Var.f164274w).contains(x17)) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            } else {
                                i1Var.I(1, jj4Var, s7Var, ca4.z0.t0(snsInfo2.field_snsId));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            }
                        }
                    } else {
                        if (!H.equals(snsAdTimelineVideoView.getVideoPath())) {
                            snsAdTimelineVideoView.setThumbBmp(com.tencent.mm.sdk.platformtools.x.J(str3 + str2, null));
                            snsAdTimelineVideoView.w(true);
                        }
                        snsAdTimelineVideoView.setVideoPath(H);
                        ta4.u0.m(jj4Var.f377855d);
                        ta4.u0.o(jj4Var.f377855d);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readySnsSightOffline", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            }
            gd4.z zVar = fVar.f425172g;
            if (zVar != null) {
                gd4.r rVar4 = (gd4.r) zVar;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readySnsSightOffline", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                java.util.Objects.toString(snsInfo);
                java.util.Objects.toString(i1Var);
                java.util.Objects.toString(jj4Var);
                java.util.Objects.toString(snsAdTimelineVideoView);
                java.util.Objects.toString(s7Var);
                u74.d e17 = rVar4.e();
                if (e17 != null && (g9Var8 = e17.f425154o) != null && (mMPinProgressBtn = g9Var8.f168420j) != null) {
                    mMPinProgressBtn.setVisibility(8);
                }
                u74.d e18 = rVar4.e();
                if (e18 != null && (g9Var7 = e18.f425154o) != null && (imageView = g9Var7.f168419i) != null) {
                    imageView.setVisibility(8);
                }
                com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
                rVar4.f270830o = (adXml == null || (d0Var = adXml.adBreakFrameInfo) == null) ? null : d0Var.a();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                com.tencent.mm.plugin.sns.storage.a1 a1Var = rVar4.f270830o;
                if (a1Var != null && a1Var.c() == 1) {
                    if (o54.p.f343160a.c(2880, 1080)) {
                        com.tencent.mm.plugin.sns.storage.a1 a1Var2 = rVar4.f270830o;
                        if ((a1Var2 != null ? a1Var2.a() : null) != null) {
                            com.tencent.mars.xlog.Log.i("BreakFrameCardAdController", "currentMedia : use high level");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1913, 4);
                            com.tencent.mm.plugin.sns.storage.a1 a1Var3 = rVar4.f270830o;
                            if (a1Var3 != null) {
                                jj4Var2 = a1Var3.a();
                            }
                            jj4Var2 = null;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("BreakFrameCardAdController", "currentMedia : use low level");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1913, 5);
                    com.tencent.mm.plugin.sns.storage.a1 a1Var4 = rVar4.f270830o;
                    if (a1Var4 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOneToOneLowMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                        jj4Var2 = a1Var4.f165917c;
                    }
                    jj4Var2 = null;
                } else {
                    com.tencent.mars.xlog.Log.i("BreakFrameCardAdController", "currentMedia : use 3 to 1 level");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1913, 6);
                    com.tencent.mm.plugin.sns.storage.a1 a1Var5 = rVar4.f270830o;
                    if (a1Var5 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMedia", "com.tencent.mm.plugin.sns.storage.AlphaVideoInfo");
                        jj4Var2 = a1Var5.f165915a;
                    }
                    jj4Var2 = null;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("currentMedia : type = ");
                com.tencent.mm.plugin.sns.storage.a1 a1Var6 = rVar4.f270830o;
                sb6.append(a1Var6 != null ? java.lang.Integer.valueOf(a1Var6.c()) : null);
                sb6.append("  mediaId = ");
                sb6.append(jj4Var2 != null ? jj4Var2.f377855d : null);
                com.tencent.mars.xlog.Log.i("BreakFrameCardAdController", sb6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCurrentBreakVideoMedia", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                rVar4.f270831p = jj4Var2;
                if (rVar4.f()) {
                    u74.d dVar = rVar4.f270817b;
                    if (dVar == null || (snsAdBreakFrameVideoView4 = dVar.f425156q) == null || (mBreakThumbView = snsAdBreakFrameVideoView4.getMBreakThumbView()) == null) {
                        f0Var = null;
                    } else {
                        com.tencent.mars.xlog.Log.i("BreakFrameCardAdController", "it is going to set bitmap for thumb view, the thumb view height is " + mBreakThumbView.getHeight() + ", visibility is " + mBreakThumbView.getVisibility() + "!!");
                        r45.jj4 jj4Var3 = rVar4.f270831p;
                        a84.m.a(jj4Var3 != null ? jj4Var3.f377860i : null, mBreakThumbView);
                        f0Var = jz5.f0.f302826a;
                    }
                    if (f0Var == null) {
                        com.tencent.mars.xlog.Log.e("BreakFrameCardAdController", "the break thumb view doesn't existed!!");
                    }
                }
                r45.jj4 jj4Var4 = rVar4.f270831p;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shouldClearSns", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                java.lang.String str6 = rVar4.f270829n;
                boolean z17 = (kotlin.jvm.internal.o.b(str6, "") || kotlin.jvm.internal.o.b(str6, snsInfo.getSnsId())) ? false : true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shouldClearSns", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                if (z17) {
                    snsInfo.getSnsId();
                    rVar4.h();
                }
                if (rVar4.f270826k == null) {
                    u74.d dVar2 = rVar4.f270817b;
                    android.content.Context context = (dVar2 == null || (snsAdBreakFrameVideoView3 = dVar2.f425156q) == null) ? null : snsAdBreakFrameVideoView3.getContext();
                    if (context instanceof androidx.appcompat.app.AppCompatActivity) {
                        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
                        i18 = kotlinx.coroutines.z0.i(v65.m.b(appCompatActivity), kotlinx.coroutines.t3.a(null, 1, null));
                        appCompatActivity.mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$3
                            @Override // androidx.lifecycle.f, androidx.lifecycle.h
                            public void onDestroy(androidx.lifecycle.y owner) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$3");
                                kotlin.jvm.internal.o.g(owner, "owner");
                                kotlinx.coroutines.y0 y0Var = kotlinx.coroutines.y0.this;
                                if (y0Var != null) {
                                    kotlinx.coroutines.z0.c(y0Var, null);
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$readySnsSightOffline$3");
                            }
                        });
                    } else {
                        ca4.q.d("breakFrameWhyRunToHere", snsInfo, new java.lang.RuntimeException());
                        i18 = kotlinx.coroutines.z0.i(kotlinx.coroutines.z0.b(), kotlinx.coroutines.t3.a(null, 1, null));
                    }
                    rVar4.f270826k = i18;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("trySetThumb", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                    java.lang.String x18 = ca4.z0.x(1, jj4Var != null ? jj4Var.f377855d : null);
                    if (i1Var != null) {
                        rVar = i1Var.k(x18, jj4Var != null ? jj4Var.f377855d : null);
                    } else {
                        rVar = null;
                    }
                    boolean g17 = ca4.z0.g(rVar);
                    java.lang.String d18 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var != null ? jj4Var.f377855d : null);
                    kotlin.jvm.internal.o.f(d18, "getMediaFilePath(...)");
                    java.lang.String U2 = ca4.z0.U(jj4Var);
                    if (g17) {
                        u74.d e19 = rVar4.e();
                        if (e19 != null && (g9Var6 = e19.f425154o) != null && (snsAdTimelineVideoView5 = g9Var6.f168417g) != null) {
                            snsAdTimelineVideoView5.setThumbBmp(rVar != null ? rVar.f68970d : null);
                        }
                        str4 = null;
                    } else {
                        str4 = null;
                        android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(d18 + U2, null);
                        u74.d e27 = rVar4.e();
                        if (e27 != null && (g9Var = e27.f425154o) != null && (snsAdTimelineVideoView2 = g9Var.f168417g) != null) {
                            snsAdTimelineVideoView2.setThumbBmp(J2);
                        }
                    }
                    u74.d e28 = rVar4.e();
                    if (e28 != null && (g9Var5 = e28.f425154o) != null && (snsAdTimelineVideoView4 = g9Var5.f168417g) != null) {
                        snsAdTimelineVideoView4.w(true);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("trySetThumb", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                    if (i1Var != null) {
                        rVar2 = rVar4;
                        str5 = str4;
                        str4 = i1Var.H(snsInfo, jj4Var, s7Var, true, snsInfo.getSnsId());
                    } else {
                        rVar2 = rVar4;
                        str5 = str4;
                    }
                    if (!(str4 == null || r26.n0.N(str4))) {
                        u74.d e29 = rVar2.e();
                        ?? r27 = (e29 == null || (g9Var4 = e29.f425154o) == null) ? str5 : g9Var4.f168417g;
                        if (r27 != 0) {
                            r27.setVideoPath(str4);
                        }
                    }
                    java.lang.String snsId = snsInfo.getSnsId();
                    if (snsId == null) {
                        snsId = "0";
                    }
                    gd4.r rVar5 = rVar2;
                    rVar5.f270829n = snsId;
                    u74.d dVar3 = rVar5.f270817b;
                    com.tencent.mm.ui.widget.MMPinProgressBtn mMPinProgressBtn2 = (dVar3 == null || (snsAdBreakFrameVideoView2 = dVar3.f425156q) == null) ? str5 : (com.tencent.mm.ui.widget.MMPinProgressBtn) snsAdBreakFrameVideoView2.findViewById(com.tencent.mm.R.id.lbi);
                    u74.d dVar4 = rVar5.f270817b;
                    android.widget.ImageView imageView2 = (dVar4 == null || (snsAdBreakFrameVideoView = dVar4.f425156q) == null) ? str5 : (android.widget.ImageView) snsAdBreakFrameVideoView.findViewById(com.tencent.mm.R.id.nhn);
                    if (imageView2 != 0) {
                        imageView2.setImageDrawable(i65.a.i(rVar5.f270819d, com.tencent.mm.R.raw.shortvideo_play_btn));
                    }
                    if (mMPinProgressBtn2 == 0) {
                        c17 = '\b';
                    } else {
                        c17 = '\b';
                        mMPinProgressBtn2.setVisibility(8);
                    }
                    if (rVar5.f270816a == 2 || imageView2 == 0) {
                        i19 = 0;
                    } else {
                        i19 = 0;
                        imageView2.setVisibility(0);
                    }
                    kotlinx.coroutines.flow.i2 a17 = kotlinx.coroutines.flow.r2.a(i19, i19, u26.u.SUSPEND);
                    u74.d e37 = rVar5.e();
                    if (e37 != null && (g9Var3 = e37.f425154o) != null && (snsAdTimelineVideoView3 = g9Var3.f168417g) != null) {
                        snsAdTimelineVideoView3.setOnReplay(new gd4.g(rVar5));
                    }
                    kotlinx.coroutines.y0 y0Var = rVar5.f270826k;
                    kotlinx.coroutines.r2 d19 = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new gd4.o(i1Var, jj4Var, s7Var, snsInfo, jj4Var4, rVar5, mMPinProgressBtn2, a17, imageView2, null), 3, null) : null;
                    if (d19 != null) {
                        ((kotlinx.coroutines.c3) d19).p(gd4.h.f270714d);
                    }
                    u74.d e38 = rVar5.e();
                    com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView6 = (e38 == null || (g9Var2 = e38.f425154o) == null) ? null : g9Var2.f168417g;
                    if (snsAdTimelineVideoView6 == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readySnsSightOffline", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                    } else {
                        int i28 = rVar5.f270816a;
                        if (i28 == 0) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1913, 7);
                            gd4.x0 c18 = rVar5.c();
                            u74.d dVar5 = rVar5.f270817b;
                            rVar5.f270832q = new gd4.v0(c18, dVar5 != null ? dVar5.f425156q : null, new com.tencent.mm.plugin.sns.ui.widget.y0(snsAdTimelineVideoView6), rVar5.f270826k, rVar5.f270828m, a17, snsInfo, new gd4.i(rVar5), rVar5.f270830o, rVar5.f270831p, rVar5.f270820e, rVar5.g() ? null : rVar5.f270833r);
                            rVar3 = rVar5;
                        } else if (i28 == 1) {
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1913, 8);
                            gd4.x0 c19 = rVar5.c();
                            u74.d dVar6 = rVar5.f270817b;
                            rVar3 = rVar5;
                            rVar3.f270832q = new gd4.c2(c19, dVar6 != null ? dVar6.f425156q : null, new com.tencent.mm.plugin.sns.ui.widget.y0(snsAdTimelineVideoView6), rVar5.f270826k, rVar5.f270828m, a17, snsInfo, new gd4.j(rVar5), rVar5.f270830o, rVar5.f270831p, rVar5.f270820e, rVar5.f270817b, rVar5.g() ? null : rVar5.f270833r);
                        } else {
                            rVar3 = rVar5;
                            if (i28 == 2) {
                                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1913, 12);
                                gd4.x0 c27 = rVar3.c();
                                u74.d dVar7 = rVar3.f270817b;
                                rVar3.f270832q = new gd4.v0(c27, dVar7 != null ? dVar7.f425156q : null, null, rVar3.f270826k, rVar3.f270828m, a17, snsInfo, new gd4.k(rVar3), rVar3.f270830o, rVar3.f270831p, rVar3.f270820e, rVar3.g() ? null : rVar3.f270833r);
                            }
                        }
                        gd4.b bVar = rVar3.f270832q;
                        if (bVar != null) {
                            bVar.l();
                        }
                        if ((snsInfo.isBreakFrameGestureAd()) && rVar3.f270834s == null) {
                            i64.b1 b1Var = rVar3.f270820e;
                            rVar3.f270834s = new hd4.i(b1Var != null ? b1Var.f289095j : 0);
                        }
                        hd4.i iVar = rVar3.f270834s;
                        if (iVar != null) {
                            android.content.Context context2 = rVar3.f270819d;
                            android.app.Activity activity = context2 instanceof android.app.Activity ? (android.app.Activity) context2 : null;
                            u74.d e39 = rVar3.e();
                            android.view.View view = e39 != null ? e39.f425163x : null;
                            u74.d e47 = rVar3.e();
                            i64.b1 b1Var2 = rVar3.f270820e;
                            com.tencent.mm.plugin.sns.ui.listener.i iVar2 = rVar3.f270823h;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindAdBreakFrameGestureComponent", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureLogic");
                            if (iVar.f280586b == null && snsInfo.isBreakFrameGestureAd()) {
                                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                                if (activity instanceof androidx.lifecycle.y) {
                                    h0Var.f310123d = activity;
                                }
                                iVar.f280586b = new hd4.h(h0Var, view, e47, b1Var2, iVar2, iVar.f280585a);
                                com.tencent.mars.xlog.Log.i("AdBreakFrameGestureLogic", "create ad break frame gesture component");
                            }
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("refresh ad break frame gesture component, oldSnsId is ");
                            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo5 = iVar.f280587c;
                            sb7.append(ca4.z0.t0(snsInfo5 != null ? snsInfo5.field_snsId : 0L));
                            sb7.append(", newSnsId is ");
                            sb7.append(ca4.z0.t0(snsInfo.field_snsId));
                            com.tencent.mars.xlog.Log.i("AdBreakFrameGestureLogic", sb7.toString());
                            iVar.f280587c = snsInfo;
                            hd4.g gVar = iVar.f280586b;
                            if (gVar != null) {
                                gVar.f(snsInfo);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindAdBreakFrameGestureComponent", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.gesture.AdBreakFrameGestureLogic");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readySnsSightOffline", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                    }
                } else {
                    n74.h0 h0Var2 = n74.h0.f335363a;
                    h0Var2.f(snsInfo, jj4Var, s7Var);
                    h0Var2.f(snsInfo, jj4Var4, s7Var);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerDownloadMediaThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                    if (jj4Var == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerDownloadMediaThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                    } else {
                        java.util.Set set = n74.h0.f335366d;
                        synchronized (set) {
                            try {
                                java.lang.String str7 = jj4Var.f377855d;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                set.add(str7);
                            } catch (java.lang.Throwable th6) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerDownloadMediaThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                                throw th6;
                            }
                        }
                        java.lang.String d27 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
                        kotlin.jvm.internal.o.f(d27, "getMediaFilePath(...)");
                        if (!com.tencent.mm.vfs.w6.j(d27 + ca4.z0.U(jj4Var))) {
                            ca4.s0 s0Var2 = new ca4.s0(jj4Var);
                            s0Var2.d(1);
                            s0Var2.e(jj4Var.f377855d);
                            com.tencent.mm.plugin.sns.model.l4.Cj().d(jj4Var, jj4Var.f377856e == 6 ? 5 : 1, s0Var2, s7Var);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerDownloadMediaThumb", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readySnsSightOffline", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readySnsSightOffline", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
                return;
            }
        }
        snsInfo2 = snsInfo;
        i17 = 1;
        fVar = this;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo42 = fVar.f425168c;
        if (snsInfo42 == null) {
        }
        int hashCode2 = fVar.f425169d.hashCode();
        i1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var != null) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readySnsSightOffline", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
    }

    public void j(boolean z17) {
        gd4.z zVar;
        com.tencent.mm.plugin.sns.ui.g9 g9Var;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f425168c;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return;
        }
        if (snsInfo.isAdForbidAutoPlay()) {
            com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "restartPlay, forbidAutoPlay=true");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return;
        }
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(this.f425168c)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f425168c;
        if (snsInfo2 == null || (!(snsInfo2.isBreakFrameAd() || this.f425168c.isAdIpInteractVideo() || this.f425168c.isSolidBreakFrameAd()) || (zVar = this.f425172g) == null)) {
            com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "restartPlay, onlineVideo=" + z17);
            if (z17) {
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.f425166a.f425162w;
                if (snsTimelineVideoView != null) {
                    snsTimelineVideoView.M(0, true);
                }
            } else {
                this.f425166a.f425154o.f168417g.v();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return;
        }
        gd4.r rVar = (gd4.r) zVar;
        rVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        u74.d e17 = rVar.e();
        if (e17 != null && (g9Var = e17.f425154o) != null && (snsAdTimelineVideoView = g9Var.f168417g) != null) {
            snsAdTimelineVideoView.v();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restartPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
    }

    public void k(android.view.View view, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (layoutParams.width != i17 || layoutParams.height != i18)) {
            layoutParams.width = i17;
            layoutParams.height = i18;
            view.setLayoutParams(layoutParams);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewLayoutParams", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
    }

    public void l(boolean z17) {
        gd4.z zVar;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f425168c;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return;
        }
        if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(snsInfo)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        if (!this.f425168c.isAdForbidAutoPlay() && ((i17 = this.f425166a.T.f425131a) == 1 || i17 == 2)) {
            l44.b3 b3Var = l44.b3.f316041a;
            b3Var.h(this.f425168c);
            b3Var.i(new l44.d0(this.f425166a.T.f425131a, this.f425168c, true));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f425168c;
        if (snsInfo2 != null && ((snsInfo2.isBreakFrameAd() || this.f425168c.isAdIpInteractVideo() || this.f425168c.isSolidBreakFrameAd()) && (zVar = this.f425172g) != null)) {
            gd4.r rVar = (gd4.r) zVar;
            rVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
            ((kotlinx.coroutines.flow.h3) rVar.f270827l).k(gd4.e.f270681d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
            return;
        }
        com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "startPlay, onlineVideo=" + z17);
        if (z17) {
            com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView snsTimelineVideoView = this.f425166a.f425162w;
            if (snsTimelineVideoView != null) {
                if (snsTimelineVideoView.w() || this.f425166a.f425162w.f0()) {
                    com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "onlineVideo, resumePlay, hash=" + hashCode());
                    this.f425166a.f425162w.K();
                } else {
                    com.tencent.mars.xlog.Log.i("FullCardAdWrapper", "onlineVideo, onResume, hash=" + hashCode());
                    this.f425166a.f425162w.C();
                }
            }
        } else {
            this.f425166a.f425154o.f168417g.setShouldPlayWhenPrepared(true);
            this.f425166a.f425154o.f168417g.m();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.fullcard.FullCardAdWrapper");
    }
}
