package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SightVideoFullScreenView extends android.widget.RelativeLayout implements android.view.View.OnClickListener, android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener, android.view.GestureDetector.OnDoubleTapListener {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f166649x0 = 0;
    public volatile boolean A;
    public volatile boolean B;
    public int C;
    public java.lang.String D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f166650J;
    public final android.view.View.OnClickListener K;
    public final m34.e L;
    public com.tencent.mm.plugin.sns.ui.listener.a M;
    public long N;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public long U;
    public com.tencent.mm.plugin.sns.ui.f9 V;
    public final java.lang.Runnable W;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f166651d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f166652e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f166653f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f166654g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.OfflineVideoView f166655h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar f166656i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f166657m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f166658n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f166659o;

    /* renamed from: p, reason: collision with root package name */
    public int f166660p;

    /* renamed from: p0, reason: collision with root package name */
    public final java.lang.Runnable f166661p0;

    /* renamed from: q, reason: collision with root package name */
    public int f166662q;

    /* renamed from: r, reason: collision with root package name */
    public int f166663r;

    /* renamed from: s, reason: collision with root package name */
    public final android.content.Context f166664s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f166665t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.GestureDetector f166666u;

    /* renamed from: v, reason: collision with root package name */
    public volatile boolean f166667v;

    /* renamed from: w, reason: collision with root package name */
    public volatile boolean f166668w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f166669x;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f166670y;

    /* renamed from: z, reason: collision with root package name */
    public volatile boolean f166671z;

    public SightVideoFullScreenView(android.content.Context context) {
        super(context);
        this.f166651d = null;
        this.f166667v = false;
        this.f166668w = false;
        this.f166669x = true;
        this.f166670y = true;
        this.f166671z = false;
        this.A = true;
        this.B = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.b9 b9Var = new com.tencent.mm.plugin.sns.ui.b9(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.K = b9Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.c9 c9Var = new com.tencent.mm.plugin.sns.ui.c9(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.L = c9Var;
        this.N = 0L;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0L;
        this.W = new com.tencent.mm.plugin.sns.ui.d9(this);
        this.f166661p0 = new com.tencent.mm.plugin.sns.ui.e9(this);
        this.f166664s = context;
        this.f166666u = new android.view.GestureDetector(this);
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.OfflineVideoView b(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView = sightVideoFullScreenView.f166655h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return offlineVideoView;
    }

    public static void c(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateProgressBarSeek", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.y8(sightVideoFullScreenView, i17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateProgressBarSeek", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public static /* synthetic */ void d(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView.C(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public static /* synthetic */ android.view.View e(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        android.view.View view = sightVideoFullScreenView.f166659o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return view;
    }

    public static /* synthetic */ void g(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView.setFocus(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public static /* synthetic */ int h(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        int i17 = sightVideoFullScreenView.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return i17;
    }

    public static /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar i(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar videoPlayerSeekBar = sightVideoFullScreenView.f166656i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return videoPlayerSeekBar;
    }

    public static /* synthetic */ boolean j(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        boolean z17 = sightVideoFullScreenView.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return z17;
    }

    public static void k(com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        sightVideoFullScreenView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initsightVideoThumbImage", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            java.lang.String l17 = za4.t0.l("adId", sightVideoFullScreenView.I);
            if (com.tencent.mm.vfs.w6.j(l17)) {
                sightVideoFullScreenView.f166655h.e(l17);
            } else {
                za4.t0.b("adId", sightVideoFullScreenView.I, false, 1000000001, 0, new com.tencent.mm.plugin.sns.ui.v8(sightVideoFullScreenView));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initsightVideoThumbImage", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    private void setFocus(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            if (z17) {
                com.tencent.mm.plugin.sns.ui.listener.a aVar = this.M;
                if (aVar != null) {
                    ((com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity) aVar).V6(true);
                }
                this.f166656i.setVisibility(0);
                this.f166658n.setVisibility(0);
                this.f166657m.setVisibility(0);
                l(this.W);
            } else {
                this.f166670y = false;
                this.f166656i.setVisibility(4);
                this.f166658n.setVisibility(8);
                this.f166657m.setVisibility(8);
                com.tencent.mm.sdk.platformtools.u3.l(this.W);
                com.tencent.mm.plugin.sns.ui.listener.a aVar2 = this.M;
                if (aVar2 != null) {
                    ((com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity) aVar2).V6(false);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sightVideoPausePlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.a9(this));
        if (this.N != 0) {
            this.U += java.lang.System.currentTimeMillis() - this.N;
            this.N = 0L;
            com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "playTimeInterval update");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sightVideoPausePlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sightVideoStartPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        if (this.f166667v) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", "last download fail, try again");
            this.f166655h.p();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sightVideoStartPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            return;
        }
        if (!this.f166668w && !android.text.TextUtils.isEmpty(this.f166665t)) {
            this.f166655h.j(this.f166665t);
            this.f166668w = true;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.sns.ui.z8(this));
        this.N = java.lang.System.currentTimeMillis();
        this.T++;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sightVideoStartPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void C(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f166656i.setIsPlay(z17);
            this.f166656i.getPlayBtn().getLayoutParams().width = this.f166663r;
            this.f166656i.getPlayBtn().getLayoutParams().height = this.f166663r;
            android.content.Context context = this.f166664s;
            if (z17) {
                com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "startPlay");
                this.f166656i.getPlayBtn().setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.media_player_btn_cur_status_on));
            } else {
                com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "pausePlay");
                this.f166656i.getPlayBtn().setImageDrawable(i65.a.i(context, com.tencent.mm.R.raw.media_player_btn_cur_status_off));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useNewUIToProgressBar", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void a() {
        android.content.Context context;
        android.media.AudioManager audioManager;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            context = this.f166664s;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", "abandonAudioFocus has something wrong!");
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", "context is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            return;
        }
        if (this.V != null && (audioManager = (android.media.AudioManager) context.getSystemService("audio")) != null) {
            audioManager.abandonAudioFocus(this.V);
            this.V = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("abandonAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void l(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
            com.tencent.mm.sdk.platformtools.u3.i(runnable, 4000L);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("after4sInvisibleComp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f166658n.setImageDrawable(i65.a.i(this.f166664s, com.tencent.mm.R.raw.icon_volume_off));
            this.f166655h.setMute(true);
            this.G = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public android.content.Intent o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createSightVideoIntent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        android.content.Intent intent = new android.content.Intent();
        try {
            if (this.f166655h.h() && this.N != 0) {
                this.U += java.lang.System.currentTimeMillis() - this.N;
                this.N = 0L;
                com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "playTimeInterval update");
            }
            intent.putExtra("KComponentVideoType", this.C);
            intent.putExtra("KComponentCid", this.D);
            intent.putExtra("KComponentCurrentTime", this.f166655h.getCurrentPositionMs());
            intent.putExtra("KComponentVoiceType", this.G);
            intent.putExtra("KComponentProgressType", this.f166655h.h());
            intent.putExtra("KComponentClickPlayControlCount", this.P);
            intent.putExtra("KComponentDoubleClickCount", this.Q);
            intent.putExtra("KComponentClickVoiceControlCount", this.R);
            intent.putExtra("KComponentPlayCompletedCount", this.S);
            intent.putExtra("KComponentPlayCount", this.T);
            intent.putExtra("KComponentPlayTimeInterval", this.U);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createSightVideoIntent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return intent;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            if (view.getId() == com.tencent.mm.R.id.f487003n56) {
                this.R++;
                setFocus(true);
                if (this.G) {
                    y();
                } else {
                    m();
                }
            } else if (view.getId() == com.tencent.mm.R.id.f487002n55) {
                com.tencent.mm.sdk.platformtools.u3.l(this.f166661p0);
                android.view.View view2 = this.f166659o;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((android.app.Activity) this.f166664s).finish();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        super.onConfigurationChanged(configuration);
        try {
            int i17 = configuration.orientation;
            if (i17 == 2) {
                com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                p();
            } else if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "ORIENTATION_PORTRAIT");
                q();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        try {
            com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "onDoubleTap");
            this.Q++;
            l(this.W);
            if (this.f166655h.h()) {
                A();
            } else {
                if (this.G) {
                    m();
                } else {
                    y();
                }
                B();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnDoubleTapListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTapEvent", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFling", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScroll", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShowPress", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "onSingleTapConfirmed");
            if (this.f166670y) {
                this.f166670y = false;
                setFocus(false);
            } else {
                this.f166670y = true;
                setFocus(true);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapConfirmed", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.view.GestureDetector gestureDetector = this.f166666u;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.i(onTouchEvent, this, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        return onTouchEvent;
    }

    public final void p() {
        android.content.Context context = this.f166664s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.g((android.app.Activity) context);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f166653f.getLayoutParams();
            layoutParams.leftMargin = i65.a.b(context, 64);
            layoutParams.rightMargin = i65.a.b(context, 64);
            ((android.widget.RelativeLayout.LayoutParams) this.f166654g.getLayoutParams()).rightMargin = i65.a.b(context, 20);
            ((android.widget.RelativeLayout.LayoutParams) this.f166657m.getLayoutParams()).rightMargin = i65.a.b(context, 20);
            ((android.widget.RelativeLayout.LayoutParams) this.f166656i.getLayoutParams()).width = this.f166662q - i65.a.b(context, 232);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLandScapeParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void q() {
        android.content.Context context = this.f166664s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.g((android.app.Activity) context);
            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) this.f166653f.getLayoutParams();
            layoutParams.leftMargin = i65.a.b(context, 0);
            layoutParams.rightMargin = i65.a.b(context, 0);
            ((android.widget.RelativeLayout.LayoutParams) this.f166654g.getLayoutParams()).rightMargin = i65.a.b(context, 10);
            ((android.widget.RelativeLayout.LayoutParams) this.f166657m.getLayoutParams()).rightMargin = i65.a.b(context, 10);
            ((android.widget.RelativeLayout.LayoutParams) this.f166656i.getLayoutParams()).width = this.f166660p - i65.a.b(context, 74);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPortraitParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void r(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            if (i18 >= i17) {
                this.f166660p = i17;
                this.f166662q = i18;
            } else {
                this.f166662q = i17;
                this.f166660p = i18;
            }
            this.f166663r = i65.a.b(this.f166664s, 32);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void s() {
        android.content.Context context = this.f166664s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSightVideoComponents", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cns, (android.view.ViewGroup) this, true);
            this.f166651d = inflate;
            this.f166652e = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.oxs);
            this.f166653f = this.f166651d.findViewById(com.tencent.mm.R.id.ate);
            this.f166654g = this.f166651d.findViewById(com.tencent.mm.R.id.h5t);
            this.f166656i = (com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar) this.f166651d.findViewById(com.tencent.mm.R.id.lbl);
            com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView = new com.tencent.mm.plugin.sns.ui.OfflineVideoView(context, null);
            this.f166655h = offlineVideoView;
            offlineVideoView.setClickable(true);
            this.f166655h.setOnTouchListener(this);
            this.f166655h.setSource(2);
            this.f166652e.addView(this.f166655h);
            this.f166656i.setVisibility(0);
            this.f166656i.setOnPlayButtonClickListener(this.K);
            this.f166656i.setIplaySeekCallback(this.L);
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487002n55);
            this.f166657m = imageView;
            imageView.setVisibility(0);
            this.f166657m.setOnClickListener(this);
            android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f487003n56);
            this.f166658n = imageView2;
            imageView2.setVisibility(0);
            this.f166658n.setOnClickListener(this);
            android.view.View findViewById = this.f166651d.findViewById(com.tencent.mm.R.id.kqc);
            this.f166659o = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "initSightVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/SightVideoFullScreenView", "initSightVideoComponents", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (context.getResources().getConfiguration().orientation == 2) {
                com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "ORIENTATION_LANDSCAPE");
                p();
            } else if (context.getResources().getConfiguration().orientation == 1) {
                com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "ORIENTATION_PORTRAIT");
                q();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSightVideoComponents", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void setProgressBarStatusListener(com.tencent.mm.plugin.sns.ui.listener.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.M = aVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProgressBarStatusListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public final void t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initVideoStatus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            int videoTotalTime = this.f166656i.getVideoTotalTime();
            int i17 = this.F;
            if (videoTotalTime != i17 / 1000) {
                this.f166656i.setVideoTotalTime(i17 / 1000);
            }
            this.f166656i.a(this.E / 1000);
            C(this.H);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVideoStatus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            s();
            t();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSightVideoPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            try {
                this.f166655h.setVideoCallback(new com.tencent.mm.plugin.sns.ui.x8(this));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSightVideoPlay", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            this.f166655h.p();
            setFocus(true);
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th7.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void v(int i17, java.lang.String str, int i18, int i19, boolean z17, boolean z18, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f166669x = true;
            this.A = true;
            this.C = i17;
            this.D = str;
            this.E = i18;
            this.F = i19;
            this.G = z17;
            this.H = z18;
            this.I = str2;
            this.f166650J = str3;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVideoViewParams", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            a();
            com.tencent.mm.sdk.platformtools.u3.l(this.W);
            com.tencent.mm.sdk.platformtools.u3.l(this.f166661p0);
            this.f166655h.i();
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void x() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            if (this.A) {
                z();
            } else if (!this.f166655h.h() && this.B) {
                B();
                this.B = false;
            }
            this.A = false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            this.f166658n.setImageDrawable(i65.a.i(this.f166664s, com.tencent.mm.R.raw.icon_volume_on));
            this.f166655h.setMute(false);
            this.G = false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openVoice", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public void z() {
        android.content.Context context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        try {
            context = this.f166664s;
        } catch (java.lang.Throwable unused) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", "requestAudioFocus has something wrong!");
        }
        if (context == null) {
            com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", "context is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            return;
        }
        if (this.V == null) {
            this.V = new com.tencent.mm.plugin.sns.ui.f9(this);
            android.media.AudioManager audioManager = (android.media.AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                int requestAudioFocus = audioManager.requestAudioFocus(this.V, 3, 2);
                if (requestAudioFocus == 1) {
                    com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "requestAudioFocus successfully!");
                } else {
                    com.tencent.mars.xlog.Log.i("SightVideoFullScreenView", "requestAudioFocus is not granted. value = " + requestAudioFocus);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestAudioFocus", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
    }

    public SightVideoFullScreenView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166651d = null;
        this.f166667v = false;
        this.f166668w = false;
        this.f166669x = true;
        this.f166670y = true;
        this.f166671z = false;
        this.A = true;
        this.B = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.b9 b9Var = new com.tencent.mm.plugin.sns.ui.b9(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.K = b9Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.c9 c9Var = new com.tencent.mm.plugin.sns.ui.c9(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.L = c9Var;
        this.N = 0L;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0L;
        this.W = new com.tencent.mm.plugin.sns.ui.d9(this);
        this.f166661p0 = new com.tencent.mm.plugin.sns.ui.e9(this);
        this.f166664s = context;
        this.f166666u = new android.view.GestureDetector(this);
    }

    public SightVideoFullScreenView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f166651d = null;
        this.f166667v = false;
        this.f166668w = false;
        this.f166669x = true;
        this.f166670y = true;
        this.f166671z = false;
        this.A = true;
        this.B = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.b9 b9Var = new com.tencent.mm.plugin.sns.ui.b9(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createProgressClickListener", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.K = b9Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        com.tencent.mm.plugin.sns.ui.c9 c9Var = new com.tencent.mm.plugin.sns.ui.c9(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createIVideoPlaySeekCallback", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
        this.L = c9Var;
        this.N = 0L;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = 0L;
        this.W = new com.tencent.mm.plugin.sns.ui.d9(this);
        this.f166661p0 = new com.tencent.mm.plugin.sns.ui.e9(this);
        this.f166664s = context;
        this.f166666u = new android.view.GestureDetector(this);
    }
}
