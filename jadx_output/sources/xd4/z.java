package xd4;

/* loaded from: classes4.dex */
public final class z implements xd4.e {

    /* renamed from: a, reason: collision with root package name */
    public android.view.ViewGroup f453720a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView f453721b;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f453723d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.InsectLinearLayout f453724e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.OnlineVideoView f453725f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.f4 f453726g;

    /* renamed from: h, reason: collision with root package name */
    public r45.jj4 f453727h;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.ui.blur.mask.BlurMaskView f453731l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.blur.mask.BlurMaskBackgroundView f453732m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.blur.mask.BlurMaskView f453733n;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f453722c = true;

    /* renamed from: i, reason: collision with root package name */
    public int f453728i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f453729j = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    public final xd4.h f453730k = new xd4.h(this);

    public static final /* synthetic */ xd4.h e(xd4.z zVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getDelaySeekTask$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        xd4.h hVar = zVar.f453730k;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getDelaySeekTask$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        return hVar;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ui.OnlineVideoView f(xd4.z zVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getOnlineView$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = zVar.f453725f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getOnlineView$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        return onlineVideoView;
    }

    public static final /* synthetic */ com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView g(xd4.z zVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSeekBarView$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = zVar.f453721b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSeekBarView$p", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        return expandableHeroSeekBarView;
    }

    public static final void h(xd4.z zVar) {
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$refreshBarByTotalTime", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        zVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshBarByTotalTime", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        long duration = zVar.f453726g != null ? r3.getDuration() : 0L;
        if (zVar.f453726g == null || (expandableHeroSeekBarView = zVar.f453721b) == null || duration == expandableHeroSeekBarView.getMediaControlBar().getTotalTimeMs()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsExpandableVideoSeekBar", "refreshBarByTotalTime: totalDurationMs=" + duration);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshBarByTotalTime", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        } else {
            pm0.v.X(new xd4.y(zVar, duration));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshBarByTotalTime", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$refreshBarByTotalTime", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
    }

    @Override // xd4.f
    public int a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoMoveMargin", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoMoveMargin", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        return 0;
    }

    @Override // xd4.f
    public void b(android.app.Activity context, android.view.ViewStub stub, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineView, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(stub, "stub");
        kotlin.jvm.internal.o.g(onlineView, "onlineView");
        this.f453727h = jj4Var;
        this.f453725f = onlineView;
        this.f453723d = context;
        android.view.KeyEvent.Callback videoView = onlineView.getVideoView();
        this.f453726g = videoView instanceof com.tencent.mm.pluginsdk.ui.tools.f4 ? (com.tencent.mm.pluginsdk.ui.tools.f4) videoView : null;
        stub.setLayoutResource(com.tencent.mm.R.layout.epj);
        stub.inflate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initControlBar", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        android.app.Activity activity = this.f453723d;
        if (activity == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initControlBar", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        } else {
            this.f453720a = (android.view.ViewGroup) activity.findViewById(com.tencent.mm.R.id.v9_);
            com.tencent.mm.ui.widget.InsectLinearLayout insectLinearLayout = (com.tencent.mm.ui.widget.InsectLinearLayout) activity.findViewById(com.tencent.mm.R.id.u4v);
            this.f453724e = insectLinearLayout;
            if (insectLinearLayout != null) {
                insectLinearLayout.setInsectCallback(new xd4.i(this));
            }
            com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = (com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView) activity.findViewById(com.tencent.mm.R.id.ncv);
            this.f453721b = expandableHeroSeekBarView;
            if (expandableHeroSeekBarView == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initControlBar", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            } else {
                android.widget.TextView textView = (android.widget.TextView) activity.findViewById(com.tencent.mm.R.id.u2b);
                android.widget.TextView textView2 = (android.widget.TextView) activity.findViewById(com.tencent.mm.R.id.u2c);
                com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView2 = this.f453721b;
                kotlin.jvm.internal.o.d(expandableHeroSeekBarView2);
                com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView mediaControlBar = expandableHeroSeekBarView2.getMediaControlBar();
                mediaControlBar.setIndCurrentTimeTv(textView);
                mediaControlBar.setIndTotalTimeTv(textView2);
                mediaControlBar.setVisibleChangeListener(new xd4.j(this));
                com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView3 = this.f453721b;
                if (expandableHeroSeekBarView3 != null) {
                    expandableHeroSeekBarView3.setExpandStatusChangeListener(new xd4.k(this));
                }
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = this.f453725f;
                com.tencent.mm.pluginsdk.ui.seekbar.HeroSeekBarView.i(mediaControlBar, onlineVideoView != null ? onlineVideoView.getVideoSpeedRatio() : 1.0f, false, 2, null);
                mediaControlBar.setVideoSpeedChangeListener(new xd4.l(this));
                mediaControlBar.setHeroSeekBarChangeListener(new xd4.m(mediaControlBar, this));
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = this.f453725f;
                if (onlineVideoView2 != null) {
                    onlineVideoView2.setSeekBarHelperCallback(new xd4.n(mediaControlBar, this));
                }
                mediaControlBar.setTotalTimeMs((this.f453727h != null ? a06.d.b(r8.R) : 0) * 1000);
                mediaControlBar.setVideoPlayDurationProvider(new xd4.o(this));
                mediaControlBar.f();
                kotlin.jvm.internal.o.d(this.f453726g);
                mediaControlBar.setEnableDrag(!android.text.TextUtils.isEmpty(r8.getF174598m()));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initControlBar", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            }
        }
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView4 = this.f453721b;
        kotlin.jvm.internal.o.d(expandableHeroSeekBarView4);
        j(expandableHeroSeekBarView4, onlineView);
        i();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
    }

    @Override // xd4.f
    public void c(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeSeekBarVisible", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = this.f453721b;
        if (expandableHeroSeekBarView != null) {
            expandableHeroSeekBarView.setBarVisible(i17 == 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeSeekBarVisible", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
    }

    @Override // xd4.f
    public void d(x25.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setReporter", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = this.f453721b;
        if (expandableHeroSeekBarView != null) {
            kotlin.jvm.internal.o.e(bVar, "null cannot be cast to non-null type com.tencent.mm.pluginsdk.log.IExpandableVideoSeekBarReporter");
            expandableHeroSeekBarView.setReporter((x25.a) bVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setReporter", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
    }

    @Override // xd4.f
    public void destroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = this.f453721b;
        if (expandableHeroSeekBarView != null) {
            com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView mediaControlBar = expandableHeroSeekBarView.getMediaControlBar();
            mediaControlBar.isSeekBarActive = false;
            wu5.c cVar = mediaControlBar.hideTask;
            if (cVar != null) {
                cVar.cancel(false);
            }
            kotlinx.coroutines.r2 r2Var = expandableHeroSeekBarView.f191116r;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
        this.f453725f = null;
        this.f453723d = null;
        this.f453721b = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("destroy", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
    }

    public final void i() {
        com.tencent.mm.ui.blur.mask.BlurMaskBackgroundView blurMaskBackgroundView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initBarExpandStatus", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        android.app.Activity activity = this.f453723d;
        this.f453731l = activity != null ? (com.tencent.mm.ui.blur.mask.BlurMaskView) activity.findViewById(com.tencent.mm.R.id.vlx) : null;
        android.app.Activity activity2 = this.f453723d;
        this.f453732m = activity2 != null ? (com.tencent.mm.ui.blur.mask.BlurMaskBackgroundView) activity2.findViewById(com.tencent.mm.R.id.vmm) : null;
        android.app.Activity activity3 = this.f453723d;
        this.f453733n = activity3 != null ? (com.tencent.mm.ui.blur.mask.BlurMaskView) activity3.findViewById(com.tencent.mm.R.id.f487548vm2) : null;
        if (this.f453731l != null && (blurMaskBackgroundView = this.f453732m) != null) {
            kotlin.jvm.internal.o.d(blurMaskBackgroundView);
            blurMaskBackgroundView.setCacheEnabled(true);
            com.tencent.mm.ui.blur.mask.BlurMaskView blurMaskView = this.f453731l;
            kotlin.jvm.internal.o.d(blurMaskView);
            blurMaskView.setBlurBackground(this.f453732m);
            com.tencent.mm.ui.blur.mask.BlurMaskView blurMaskView2 = this.f453731l;
            kotlin.jvm.internal.o.d(blurMaskView2);
            blurMaskView2.setOverlayColor(0);
            com.tencent.mm.ui.blur.mask.BlurMaskView blurMaskView3 = this.f453731l;
            kotlin.jvm.internal.o.d(blurMaskView3);
            blurMaskView3.setBlurEnabled(true);
            com.tencent.mm.ui.blur.mask.BlurMaskView blurMaskView4 = this.f453733n;
            if (blurMaskView4 != null) {
                kotlin.jvm.internal.o.d(blurMaskView4);
                blurMaskView4.setBlurBackground(this.f453732m);
                com.tencent.mm.ui.blur.mask.BlurMaskView blurMaskView5 = this.f453733n;
                kotlin.jvm.internal.o.d(blurMaskView5);
                blurMaskView5.setBlurEnabled(true);
            }
        }
        r45.jj4 jj4Var = this.f453727h;
        int b17 = (jj4Var != null ? a06.d.b(jj4Var.R) : 0) * 1000;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsVideoExpandSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_expand_seekbar_duration, 15000);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoConfig", "getSnsVideoExpandSeekBarDurationMs: " + Ni);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsVideoExpandSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
        this.f453722c = ca4.z0.g0() || b17 >= Ni;
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = this.f453721b;
        if (expandableHeroSeekBarView != null) {
            expandableHeroSeekBarView.d(this.f453722c, false);
        }
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView2 = this.f453721b;
        if (expandableHeroSeekBarView2 != null) {
            expandableHeroSeekBarView2.setBarVisible(b17 != 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initBarExpandStatus", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
    }

    public final void j(com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView, com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPlayStatus", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.pluginsdk.ui.seekbar.SuspendableHeroSeekBarView mediaControlBar = expandableHeroSeekBarView.getMediaControlBar();
        mediaControlBar.n(onlineVideoView.w());
        mediaControlBar.setVideoPlayStatusListener(new xd4.w(new java.lang.ref.WeakReference(onlineVideoView)));
        onlineVideoView.setVideoCallback(new xd4.x(new java.lang.ref.WeakReference(mediaControlBar), onlineVideoView));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPlayStatus", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
    }

    @Override // xd4.f
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView;
        android.view.View videoContainer;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        int i17 = 0;
        boolean z17 = configuration != null && configuration.orientation == 2;
        je4.f fVar = je4.f.f299319a;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = this.f453725f;
            videoContainer = onlineVideoView2 != null ? onlineVideoView2.getVideoContainer() : null;
            if (videoContainer == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
            } else {
                com.tencent.mm.ui.kk.d(videoContainer, 0);
                com.tencent.mm.ui.kk.f(videoContainer, 0);
                videoContainer.requestLayout();
                android.app.Activity activity = this.f453723d;
                if (activity == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                } else {
                    android.view.ViewGroup viewGroup = this.f453720a;
                    if (viewGroup == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                    } else {
                        int h17 = i65.a.h(activity, com.tencent.mm.R.dimen.ajf);
                        int i18 = fVar.a(activity).right;
                        viewGroup.setPadding(h17, viewGroup.getPaddingTop(), i18 > 0 ? i18 + h17 : h17, 0);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutLandScape", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                    }
                }
            }
        } else {
            if (configuration != null && configuration.orientation == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                r45.jj4 jj4Var = this.f453727h;
                if (jj4Var == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                } else {
                    android.util.SizeF sizeF = new android.util.SizeF(0.0f, 0.0f);
                    if (jj4Var.f377865p != null) {
                        r45.lj4 lj4Var = jj4Var.f377865p;
                        sizeF = new android.util.SizeF(lj4Var.f379520d, lj4Var.f379521e);
                    }
                    if ((sizeF.getWidth() <= 0.0f || sizeF.getHeight() <= 0.0f) && (onlineVideoView = this.f453725f) != null) {
                        sizeF = onlineVideoView.getVideoSize();
                        kotlin.jvm.internal.o.f(sizeF, "getVideoSize(...)");
                    }
                    if (sizeF.getWidth() <= 0.0f || sizeF.getHeight() <= 0.0f) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                    } else {
                        android.view.ViewGroup viewGroup2 = this.f453720a;
                        if (viewGroup2 == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                        } else {
                            android.app.Activity activity2 = this.f453723d;
                            if (activity2 == null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                            } else {
                                android.view.WindowManager windowManager = (android.view.WindowManager) activity2.getSystemService("window");
                                if (windowManager == null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                } else {
                                    android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                                    int h18 = i65.a.h(activity2, com.tencent.mm.R.dimen.aih);
                                    int i19 = displayMetrics.widthPixels;
                                    int i27 = displayMetrics.heightPixels;
                                    if (i27 <= 0) {
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                    } else {
                                        int i28 = this.f453728i;
                                        int h19 = i65.a.h(activity2, com.tencent.mm.R.dimen.aii);
                                        if (fVar.a(activity2).bottom == 0) {
                                            h18 = i65.a.h(activity2, com.tencent.mm.R.dimen.ail);
                                        }
                                        viewGroup2.setPadding(h19, viewGroup2.getPaddingTop(), h19, h18);
                                        int height = sizeF.getWidth() / sizeF.getHeight() > ((float) (i19 / i27)) ? (int) ((sizeF.getHeight() * i19) / sizeF.getWidth()) : i27;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("estimateBottomHeight", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                        if (this.f453720a == null) {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("estimateBottomHeight", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                        } else {
                                            i17 = i65.a.h(activity2, com.tencent.mm.R.dimen.ajs);
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("estimateBottomHeight", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                        }
                                        int i29 = i17 + i28;
                                        if (i29 < 0) {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                        } else {
                                            int i37 = i27 - (i29 * 2);
                                            if (height <= i37) {
                                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                            } else {
                                                int h27 = i65.a.h(this.f453723d, com.tencent.mm.R.dimen.aih);
                                                if (i37 >= height || height >= (i27 - i29) - h27) {
                                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                                } else {
                                                    int i38 = i29 + h27 + h18;
                                                    com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView3 = this.f453725f;
                                                    videoContainer = onlineVideoView3 != null ? onlineVideoView3.getVideoContainer() : null;
                                                    if (videoContainer == null) {
                                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                                    } else {
                                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setViewMargin", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                                        if (i38 > 0) {
                                                            com.tencent.mm.ui.kk.d(videoContainer, i38);
                                                            videoContainer.requestLayout();
                                                        } else {
                                                            com.tencent.mm.ui.kk.f(videoContainer, -i38);
                                                            videoContainer.requestLayout();
                                                        }
                                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setViewMargin", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutPortrait", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
    }

    @Override // xd4.f
    public void onTouchExplorationStateChanged(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchExplorationStateChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
        com.tencent.mm.pluginsdk.ui.seekbar.ExpandableHeroSeekBarView expandableHeroSeekBarView = this.f453721b;
        if (expandableHeroSeekBarView != null) {
            expandableHeroSeekBarView.isAccessibilityEnable = z17;
            if (z17) {
                kotlinx.coroutines.r2 r2Var = expandableHeroSeekBarView.f191116r;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                expandableHeroSeekBarView.d(true, true);
            } else {
                expandableHeroSeekBarView.d(expandableHeroSeekBarView.f191120v, true);
                expandableHeroSeekBarView.a();
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchExplorationStateChanged", "com.tencent.mm.plugin.sns.ui.video.SnsExpandableVideoSeekBar");
    }
}
