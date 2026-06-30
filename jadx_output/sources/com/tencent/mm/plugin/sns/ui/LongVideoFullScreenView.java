package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class LongVideoFullScreenView extends android.widget.RelativeLayout implements android.view.View.OnClickListener, com.tencent.mm.pluginsdk.ui.b1, android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener, com.tencent.mm.pluginsdk.ui.d1 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f166350p1 = 0;
    public java.lang.String A;
    public boolean B;
    public int C;
    public int D;
    public volatile boolean E;
    public volatile int F;
    public volatile boolean G;
    public volatile boolean H;
    public volatile boolean I;

    /* renamed from: J, reason: collision with root package name */
    public volatile boolean f166351J;
    public volatile boolean K;
    public volatile boolean L;
    public long M;
    public int N;
    public int P;
    public int Q;
    public int R;
    public int S;
    public long T;
    public long U;
    public int V;
    public final android.view.View.OnClickListener W;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f166352d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.GestureDetector f166353e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f166354f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f166355g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f166356h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f166357i;

    /* renamed from: l1, reason: collision with root package name */
    public final java.lang.Runnable f166358l1;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper f166359m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar f166360n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.ImageView f166361o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f166362p;

    /* renamed from: p0, reason: collision with root package name */
    public final m34.e f166363p0;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f166364q;

    /* renamed from: r, reason: collision with root package name */
    public int f166365r;

    /* renamed from: s, reason: collision with root package name */
    public int f166366s;

    /* renamed from: t, reason: collision with root package name */
    public int f166367t;

    /* renamed from: u, reason: collision with root package name */
    public int f166368u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f166369v;

    /* renamed from: w, reason: collision with root package name */
    public int f166370w;

    /* renamed from: x, reason: collision with root package name */
    public int f166371x;

    /* renamed from: x0, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.a f166372x0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f166373y;

    /* renamed from: y0, reason: collision with root package name */
    public final java.lang.Runnable f166374y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f166375z;

    public LongVideoFullScreenView(android.content.Context context) {
        super(context);
        this.f166354f = null;
        this.E = false;
        this.F = 0;
        this.G = true;
        this.H = false;
        this.I = true;
        this.f166351J = false;
        this.K = true;
        this.L = false;
        this.M = 0L;
        this.N = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.j5 j5Var = new com.tencent.mm.plugin.sns.ui.j5(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.W = j5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.k5 k5Var = new com.tencent.mm.plugin.sns.ui.k5(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f166363p0 = k5Var;
        this.f166374y0 = new com.tencent.mm.plugin.sns.ui.l5(this);
        this.f166358l1 = new com.tencent.mm.plugin.sns.ui.m5(this);
        this.f166352d = context;
        this.f166353e = new android.view.GestureDetector(this);
    }

    public static /* synthetic */ void a(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        longVideoFullScreenView.setFocus(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public static /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar b(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar = longVideoFullScreenView.f166360n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return videoPlayerSeekBar;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper d(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper adLandingVideoWrapper = longVideoFullScreenView.f166359m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return adLandingVideoWrapper;
    }

    public static /* synthetic */ void e(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        longVideoFullScreenView.B(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public static /* synthetic */ int g(com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        int i17 = longVideoFullScreenView.f166370w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return i17;
    }

    private void setFocus(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFocus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            if (z17) {
                com.tencent.mm.plugin.sns.ui.listener.a aVar = this.f166372x0;
                if (aVar != null) {
                    ((com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity) aVar).V6(true);
                }
                this.f166360n.setVisibility(0);
                this.f166362p.setVisibility(0);
                this.f166361o.setVisibility(0);
                h(this.f166374y0);
            } else {
                this.I = false;
                this.f166360n.setVisibility(4);
                this.f166362p.setVisibility(8);
                this.f166361o.setVisibility(8);
                com.tencent.mm.sdk.platformtools.u3.l(this.f166374y0);
                com.tencent.mm.plugin.sns.ui.listener.a aVar2 = this.f166372x0;
                if (aVar2 != null) {
                    ((com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity) aVar2).V6(false);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFocus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "starting play, downFailed=" + this.H);
            if (this.H) {
                try {
                    com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", "last download fail ,try again");
                    com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar = this.f166360n;
                    if (videoPlayerSeekBar != null && videoPlayerSeekBar.getParent() != null) {
                        ((android.view.ViewGroup) this.f166360n.getParent()).removeView(this.f166360n);
                    }
                    this.f166359m.setFullScreen(true);
                    this.f166359m.h(false, this.A, 0);
                    if (this.f166352d.getResources().getConfiguration().orientation == 2) {
                        com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                        p();
                    } else if (this.f166352d.getResources().getConfiguration().orientation == 1) {
                        com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "ORIENTATION_PORTRAIT");
                        s();
                    }
                    this.f166359m.a(0.0d, true);
                    this.f166359m.k();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                    return;
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
                }
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.h5(this));
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th7.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void B(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f166360n.setIsPlay(z17);
            this.f166360n.getPlayBtn().getLayoutParams().width = this.f166367t;
            this.f166360n.getPlayBtn().getLayoutParams().height = this.f166367t;
            android.content.Context context = this.f166352d;
            if (z17) {
                com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "startPlay");
                this.f166360n.getPlayBtn().setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.media_player_btn_cur_status_on));
            } else {
                com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "pausePlay");
                this.f166360n.getPlayBtn().setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.media_player_btn_cur_status_off));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.R++;
            this.f166359m.m();
            this.f166359m.e();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", "online play error, %s", str3);
        this.H = true;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(fe1.t.CTRL_INDEX, 18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.E = true;
        this.U = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "mediaId = " + str2 + ", start loading");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.d1
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            int currPosSec = this.f166359m.getCurrPosSec();
            if (currPosSec >= this.f166371x) {
                com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "onLoopCompletion, currPosSec is " + currPosSec);
                this.R = this.R + 1;
                this.f166359m.a(0.0d, true);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLoopCompletion", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void h(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
            com.tencent.mm.sdk.platformtools.u3.i(runnable, 4000L);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        if (this.U != 0) {
            this.V = (int) (this.V + (java.lang.System.currentTimeMillis() - this.U));
            this.U = 0L;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcVideoLoadingTime", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f166362p.setImageDrawable(i65.a.i(this.f166352d, com.tencent.mm.R.raw.icon_volume_off));
            this.f166359m.setMute(true);
            this.f166373y = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            com.tencent.mm.sdk.platformtools.u3.l(this.f166358l1);
            android.view.View view = this.f166364q;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onVideoPlay", "(Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            B(true);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public android.content.Intent m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createLongVideoIntent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        android.content.Intent intent = new android.content.Intent();
        try {
            if (this.f166359m.isPlaying() && this.M != 0) {
                this.T += java.lang.System.currentTimeMillis() - this.M;
                this.M = 0L;
                com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "playTimeInterval update");
            }
            intent.putExtra("KComponentVideoType", this.f166368u);
            intent.putExtra("KComponentCid", this.f166369v);
            intent.putExtra("KComponentCurrentTime", this.f166359m.getCurrPosSec());
            intent.putExtra("KComponentVoiceType", this.f166373y);
            intent.putExtra("KComponentProgressType", this.f166359m.isPlaying());
            intent.putExtra("KComponentClickPlayControlCount", this.N);
            intent.putExtra("KComponentDoubleClickCount", this.P);
            intent.putExtra("KComponentClickVoiceControlCount", this.Q);
            intent.putExtra("KComponentPlayCompletedCount", this.R);
            intent.putExtra("KComponentPlayCount", this.S);
            intent.putExtra("KComponentPlayTimeInterval", this.T);
            intent.putExtra("KComponentIsWaiting", this.E);
            intent.putExtra("KComponentSeekTimeDueWaiting", this.F);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createLongVideoIntent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return intent;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.E = false;
        this.F = 0;
        j();
        com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "mediaId = " + str2 + ", end loading");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper adLandingVideoWrapper;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.H = false;
        if (this.f166371x <= 0 && (adLandingVideoWrapper = this.f166359m) != null) {
            this.f166371x = adLandingVideoWrapper.getVideoDurationSec();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            if (view.getId() == com.tencent.mm.R.id.f487003n56) {
                this.Q++;
                setFocus(true);
                if (this.f166373y) {
                    y();
                } else {
                    k();
                }
            } else if (view.getId() == com.tencent.mm.R.id.f487002n55) {
                com.tencent.mm.sdk.platformtools.u3.l(this.f166358l1);
                android.view.View view2 = this.f166364q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.app.Activity) this.f166352d).finish();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        super.onConfigurationChanged(configuration);
        try {
            int i17 = configuration.orientation;
            if (i17 == 2) {
                com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                p();
            } else if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "ORIENTATION_PORTRAIT");
                s();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        try {
            com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "onDoubleTap");
            if (!this.H) {
                this.P++;
            }
            h(this.f166374y0);
            if (this.f166359m.isPlaying()) {
                z();
            } else {
                if (this.f166373y) {
                    k();
                } else {
                    y();
                }
                A();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "onSingleTapConfirmed");
            if (this.I) {
                this.I = false;
                setFocus(false);
            } else {
                this.I = true;
                setFocus(true);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.GestureDetector gestureDetector = this.f166353e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        return onTouchEvent;
    }

    public final void p() {
        android.content.Context context = this.f166352d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            android.view.ViewParent parent = this.f166360n.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f166360n);
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.g((android.app.Activity) context);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f166356h.getLayoutParams();
            layoutParams.leftMargin = i65.a.b(context, 64);
            layoutParams.rightMargin = i65.a.b(context, 64);
            ((android.widget.RelativeLayout.LayoutParams) this.f166357i.getLayoutParams()).rightMargin = i65.a.b(context, 20);
            ((android.widget.RelativeLayout.LayoutParams) this.f166361o.getLayoutParams()).rightMargin = i65.a.b(context, 20);
            ((android.view.ViewGroup) this.f166356h).addView(this.f166360n, new android.widget.RelativeLayout.LayoutParams(this.f166366s - i65.a.b(context, 232), -2));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void q() {
        android.content.Context context = this.f166352d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLongVideoComponents", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f166356h = this.f166354f.findViewById(com.tencent.mm.R.id.ate);
            this.f166357i = this.f166354f.findViewById(com.tencent.mm.R.id.h5t);
            com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar) this.f166354f.findViewById(com.tencent.mm.R.id.lbl);
            this.f166360n = videoPlayerSeekBar;
            videoPlayerSeekBar.setVisibility(0);
            this.f166360n.setOnPlayButtonClickListener(this.W);
            this.f166360n.setIplaySeekCallback(this.f166363p0);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487002n55);
            this.f166361o = imageView;
            imageView.setVisibility(0);
            this.f166361o.setOnClickListener(this);
            android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487003n56);
            this.f166362p = imageView2;
            imageView2.setVisibility(0);
            this.f166362p.setOnClickListener(this);
            android.view.View findViewById = this.f166354f.findViewById(com.tencent.mm.R.id.kqc);
            this.f166364q = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "initLongVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView", "initLongVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewParent parent = this.f166360n.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f166360n);
            }
            this.f166359m.setVideoFooterView(this.f166360n);
            if (context.getResources().getConfiguration().orientation == 2) {
                com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                p();
            } else if (context.getResources().getConfiguration().orientation == 1) {
                com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "ORIENTATION_PORTRAIT");
                s();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLongVideoComponents", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void r() {
        android.content.Context context = this.f166352d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLongVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f489236bt5, (android.view.ViewGroup) this, true);
            this.f166354f = inflate;
            this.f166355g = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.oxs);
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper adLandingVideoWrapper = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.AdLandingVideoWrapper(context, null);
            this.f166359m = adLandingVideoWrapper;
            this.f166355g.addView(adLandingVideoWrapper);
            this.f166359m.setIMMVideoViewCallback(this);
            this.f166359m.setFullScreen(true);
            this.f166359m.h(false, this.A, 0);
            this.f166359m.setClickable(true);
            this.f166359m.setOnTouchListener(this);
            this.f166359m.setLoop(true);
            this.f166359m.setLoopCompletionCallback(this);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLongVideoPlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void s() {
        android.content.Context context = this.f166352d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            android.view.ViewParent parent = this.f166360n.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(this.f166360n);
            }
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.g((android.app.Activity) context);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f166356h.getLayoutParams();
            layoutParams.leftMargin = i65.a.b(context, 0);
            layoutParams.rightMargin = i65.a.b(context, 0);
            ((android.widget.RelativeLayout.LayoutParams) this.f166357i.getLayoutParams()).rightMargin = i65.a.b(context, 10);
            ((android.widget.RelativeLayout.LayoutParams) this.f166361o.getLayoutParams()).rightMargin = i65.a.b(context, 10);
            ((android.view.ViewGroup) this.f166356h).addView(this.f166360n, new android.widget.RelativeLayout.LayoutParams(this.f166365r - i65.a.b(context, 74), -2));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void setProgressBarStatusListener(com.tencent.mm.plugin.sns.ui.listener.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f166372x0 = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void t(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            if (i18 >= i17) {
                this.f166365r = i17;
                this.f166366s = i18;
            } else {
                this.f166366s = i17;
                this.f166365r = i18;
            }
            this.f166367t = i65.a.b(this.f166352d, 32);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            r();
            q();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLongVideoPlayStatus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            try {
                if (this.f166373y) {
                    k();
                } else {
                    y();
                }
                A();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLongVideoPlayStatus", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            setFocus(true);
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th7.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void v(int i17, java.lang.String str, int i18, int i19, boolean z17, boolean z18, java.lang.String str2, java.lang.String str3, boolean z19, int i27, int i28) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.G = true;
            this.K = true;
            this.f166368u = i17;
            this.f166369v = str;
            this.f166370w = i18;
            this.f166371x = i19;
            this.f166373y = z17;
            this.f166375z = z18;
            this.A = str3;
            this.B = z19;
            this.C = i27;
            this.D = i28;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f166359m.m();
            com.tencent.mm.sdk.platformtools.u3.l(this.f166374y0);
            com.tencent.mm.sdk.platformtools.u3.l(this.f166358l1);
            j();
            ca4.e0.a("landing_page_video_comp_loading_time", java.lang.String.valueOf(this.V), 2, 0, "");
            this.f166359m.d();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void x() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            if (!this.K && !this.f166359m.isPlaying() && this.L) {
                A();
                this.L = false;
            }
            this.K = false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public void y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            this.f166362p.setImageDrawable(i65.a.i(this.f166352d, com.tencent.mm.R.raw.icon_volume_on));
            this.f166359m.setMute(false);
            this.f166373y = false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public final void z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        try {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.i5(this));
            if (this.M != 0) {
                this.T += java.lang.System.currentTimeMillis() - this.M;
                this.M = 0L;
                com.tencent.mars.xlog.Log.i("LongVideoFullScreenView", "playTimeInterval update");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
    }

    public LongVideoFullScreenView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166354f = null;
        this.E = false;
        this.F = 0;
        this.G = true;
        this.H = false;
        this.I = true;
        this.f166351J = false;
        this.K = true;
        this.L = false;
        this.M = 0L;
        this.N = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.j5 j5Var = new com.tencent.mm.plugin.sns.ui.j5(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.W = j5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.k5 k5Var = new com.tencent.mm.plugin.sns.ui.k5(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f166363p0 = k5Var;
        this.f166374y0 = new com.tencent.mm.plugin.sns.ui.l5(this);
        this.f166358l1 = new com.tencent.mm.plugin.sns.ui.m5(this);
        this.f166352d = context;
        this.f166353e = new android.view.GestureDetector(this);
    }

    public LongVideoFullScreenView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f166354f = null;
        this.E = false;
        this.F = 0;
        this.G = true;
        this.H = false;
        this.I = true;
        this.f166351J = false;
        this.K = true;
        this.L = false;
        this.M = 0L;
        this.N = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.j5 j5Var = new com.tencent.mm.plugin.sns.ui.j5(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.W = j5Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.k5 k5Var = new com.tencent.mm.plugin.sns.ui.k5(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        this.f166363p0 = k5Var;
        this.f166374y0 = new com.tencent.mm.plugin.sns.ui.l5(this);
        this.f166358l1 = new com.tencent.mm.plugin.sns.ui.m5(this);
        this.f166352d = context;
        this.f166353e = new android.view.GestureDetector(this);
    }
}
