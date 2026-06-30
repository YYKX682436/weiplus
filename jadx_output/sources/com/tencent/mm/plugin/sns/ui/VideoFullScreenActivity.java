package com.tencent.mm.plugin.sns.ui;

@db5.a(32)
/* loaded from: classes4.dex */
public class VideoFullScreenActivity extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.sns.ui.listener.a {

    /* renamed from: d, reason: collision with root package name */
    public int f167676d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f167677e;

    /* renamed from: f, reason: collision with root package name */
    public int f167678f;

    /* renamed from: g, reason: collision with root package name */
    public int f167679g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f167680h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f167681i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f167682m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f167683n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f167684o;

    /* renamed from: p, reason: collision with root package name */
    public int f167685p;

    /* renamed from: q, reason: collision with root package name */
    public int f167686q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView f167687r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView f167688s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f167689t;

    /* renamed from: u, reason: collision with root package name */
    public int f167690u;

    /* renamed from: v, reason: collision with root package name */
    public int f167691v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 f167692w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f167693x;

    /* renamed from: y, reason: collision with root package name */
    public long f167694y = 0;

    /* renamed from: z, reason: collision with root package name */
    public long f167695z = 0;

    public ab4.n0 T6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        ab4.n0 n0Var = com.tencent.mm.plugin.sns.model.a4.f164075a;
        if (n0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            return n0Var;
        }
        ab4.n0 n0Var2 = new ab4.n0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdLandingPageData", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        return n0Var2;
    }

    public final void U6(ab4.q0 q0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        if (q0Var != null && this.f167689t != null && this.f167692w == null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(q0Var.F) || q0Var.I == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
                return;
            }
            this.f167692w = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0(this, q0Var, this.f167689t, 0);
            if (getResources().getConfiguration().orientation == 1) {
                this.f167692w.T();
            } else if (getResources().getConfiguration().orientation == 2) {
                this.f167692w.S();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 q0Var2 = this.f167692w;
            if (q0Var2 != null) {
                q0Var2.R(false, 0L);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    public void V6(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("progressBarStatus", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.tencent.mars.xlog.Log.i("VideoFullScreenActivity", "progressBarStatus visiblity = " + z17);
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 q0Var = this.f167692w;
            if (q0Var != null) {
                q0Var.R(true, 0L);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 q0Var2 = this.f167692w;
            if (q0Var2 != null) {
                q0Var2.U(true, 0L);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showFloatBarView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("progressBarStatus", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        try {
            int i17 = this.f167676d;
            android.content.Intent o17 = i17 == 0 ? this.f167687r.o() : i17 == 1 ? this.f167688s.m() : null;
            if (o17 != null) {
                long currentTimeMillis = this.f167695z + (java.lang.System.currentTimeMillis() - this.f167694y);
                this.f167695z = currentTimeMillis;
                o17.putExtra("KComponentFullScreenStayTime", currentTimeMillis);
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 q0Var = this.f167692w;
                if (q0Var != null) {
                    q0Var.L();
                    o17.putExtra("KComponentFullVideoFloatBarReportInfo", this.f167692w.P());
                }
            }
            setResult(1000, o17);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
        }
        super.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finish", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        return com.tencent.mm.R.layout.f487948cb;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onCancel() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onCancel();
        setRequestedOrientation(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onConfigurationChanged(configuration);
        try {
            int i17 = configuration.orientation;
            if (i17 == 2) {
                com.tencent.mars.xlog.Log.i("VideoFullScreenActivity", "ORIENTATION_LANDSCAPE");
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 q0Var = this.f167692w;
                if (q0Var != null) {
                    q0Var.S();
                }
            } else if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("VideoFullScreenActivity", "ORIENTATION_PORTRAIT");
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.q0 q0Var2 = this.f167692w;
                if (q0Var2 != null) {
                    q0Var2.T();
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onCreate(bundle);
        this.f167694y = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.g(this);
        this.mController.J();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        try {
            this.f167676d = getIntent().getIntExtra("KComponentVideoType", 0);
            this.f167677e = getIntent().getStringExtra("KComponentCid");
            this.f167678f = getIntent().getIntExtra("KComponentCurrentTime", 0);
            this.f167679g = getIntent().getIntExtra("KComponentTotalTime", 0);
            this.f167680h = getIntent().getBooleanExtra("KComponentVoiceType", false);
            this.f167681i = getIntent().getBooleanExtra("KComponentProgressType", false);
            this.f167682m = getIntent().getStringExtra("KComponentVideoSightThumbUrl");
            this.f167683n = getIntent().getStringExtra("KComponentStreamVideoUrlPath");
            this.f167684o = getIntent().getBooleanExtra("KComponentIsWaiting", false);
            this.f167685p = getIntent().getIntExtra("KComponentSeekTimeDueWaiting", 0);
            this.f167686q = getIntent().getIntExtra("KComponentKComponentCacheTime", 0);
            this.f167693x = getIntent().getBooleanExtra("KComponentForceLandMode", false);
            com.tencent.mars.xlog.Log.i("VideoFullScreenActivity", "videoType = " + this.f167676d + ", cid = " + this.f167677e + ", currPosSec = " + this.f167678f + " , videoDurationSec = " + this.f167679g + ", bNoVoice = " + this.f167680h + ", isPlaying = " + this.f167681i + ", streamVideoUrlPath = " + this.f167683n + ", isWaiting = " + this.f167684o + ", seekTime = " + this.f167685p + ", forceLandscapeMode=" + this.f167693x);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleOriention", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        if (this.f167676d == 1 && this.f167693x) {
            setRequestedOrientation(0);
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.sns.ui.oy(this), 5000L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleOriention", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        try {
            int[] c17 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.c(this);
            this.f167690u = c17[0];
            this.f167691v = c17[1];
            if (com.tencent.mm.ui.bk.u(this, false) && getResources().getConfiguration().orientation == 1) {
                this.f167691v -= com.tencent.mm.ui.bk.p(this);
            } else if (com.tencent.mm.ui.bk.u(this, false) && getResources().getConfiguration().orientation == 2) {
                this.f167690u -= com.tencent.mm.ui.bk.p(this);
            }
            com.tencent.mars.xlog.Log.i("VideoFullScreenActivity", "screenHeight = " + this.f167691v + ", screenWidth = " + this.f167690u);
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th7.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initScreenParams", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        int i17 = this.f167676d;
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initSightVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            try {
                this.f167689t = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.m7g);
                com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = new com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView(this);
                this.f167687r = sightVideoFullScreenView;
                this.f167689t.addView(sightVideoFullScreenView);
                this.f167687r.r(this.f167690u, this.f167691v);
                this.f167687r.v(this.f167676d, this.f167677e, this.f167678f, this.f167679g, this.f167680h, this.f167681i, this.f167682m, this.f167683n);
                this.f167687r.u();
                this.f167687r.setProgressBarStatusListener(this);
                try {
                    ab4.z zVar = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u7.f165548a;
                    if (zVar != null) {
                        U6(zVar.U);
                    }
                } catch (java.lang.Throwable th8) {
                    com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th8.toString());
                }
            } catch (java.lang.Throwable th9) {
                com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th9.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initSightVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        } else if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLongVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            try {
                this.f167689t = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.m7g);
                com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView = new com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView(this);
                this.f167688s = longVideoFullScreenView;
                this.f167689t.addView(longVideoFullScreenView);
                this.f167688s.t(this.f167690u, this.f167691v);
                str = "onCreate";
                try {
                    this.f167688s.v(this.f167676d, this.f167677e, this.f167678f, this.f167679g, this.f167680h, this.f167681i, this.f167682m, this.f167683n, this.f167684o, this.f167685p, this.f167686q);
                    this.f167688s.u();
                    this.f167688s.setProgressBarStatusListener(this);
                    try {
                        ab4.u0 u0Var = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z8.f165871a;
                        if (u0Var != null) {
                            U6(u0Var.f2901J);
                        }
                    } catch (java.lang.Throwable th10) {
                        com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th10.toString());
                    }
                } catch (java.lang.Throwable th11) {
                    th = th11;
                    com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th.toString());
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLongVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
                }
            } catch (java.lang.Throwable th12) {
                th = th12;
                str = "onCreate";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLongVideoView", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        str = "onCreate";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        try {
            com.tencent.mm.plugin.sns.model.a4.f164075a = null;
            int i17 = this.f167676d;
            if (i17 == 0) {
                this.f167687r.w();
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u7.f165548a = null;
            } else if (i17 == 1) {
                this.f167688s.w();
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z8.f165871a = null;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
        }
        super.onDestroy();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onPause();
        try {
            this.f167695z += java.lang.System.currentTimeMillis() - this.f167694y;
            i17 = this.f167676d;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
        }
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = this.f167687r;
            sightVideoFullScreenView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            try {
                sightVideoFullScreenView.f166671z = false;
                com.tencent.mm.sdk.platformtools.u3.l(sightVideoFullScreenView.W);
                com.tencent.mm.sdk.platformtools.u3.l(sightVideoFullScreenView.f166661p0);
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th7.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView = this.f167688s;
            longVideoFullScreenView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            try {
                longVideoFullScreenView.f166351J = false;
                com.tencent.mm.sdk.platformtools.u3.l(longVideoFullScreenView.f166374y0);
                com.tencent.mm.sdk.platformtools.u3.l(longVideoFullScreenView.f166358l1);
            } catch (java.lang.Throwable th8) {
                com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th8.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onResume();
        try {
            this.f167694y = java.lang.System.currentTimeMillis();
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.g(this);
            int i17 = this.f167676d;
            if (i17 == 0) {
                com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = this.f167687r;
                sightVideoFullScreenView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
                sightVideoFullScreenView.f166671z = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            } else if (i17 == 1) {
                com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView = this.f167688s;
                longVideoFullScreenView.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
                longVideoFullScreenView.f166351J = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onStart();
        try {
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ka.g(this);
            int i17 = this.f167676d;
            if (i17 == 0) {
                this.f167687r.x();
            } else if (i17 == 1) {
                this.f167688s.x();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStart", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        super.onStop();
        try {
            i17 = this.f167676d;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
        }
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView sightVideoFullScreenView = this.f167687r;
            sightVideoFullScreenView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            try {
                sightVideoFullScreenView.A = false;
                if (sightVideoFullScreenView.f166655h.h()) {
                    sightVideoFullScreenView.A();
                    sightVideoFullScreenView.B = true;
                }
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.e("SightVideoFullScreenView", th7.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SightVideoFullScreenView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView longVideoFullScreenView = this.f167688s;
            longVideoFullScreenView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            try {
                longVideoFullScreenView.K = false;
                if (longVideoFullScreenView.f166359m.isPlaying()) {
                    longVideoFullScreenView.z();
                    longVideoFullScreenView.L = true;
                }
            } catch (java.lang.Throwable th8) {
                com.tencent.mars.xlog.Log.e("LongVideoFullScreenView", th8.toString());
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.tencent.mars.xlog.Log.e("VideoFullScreenActivity", th6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMMOrientation", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMMOrientation", "com.tencent.mm.plugin.sns.ui.VideoFullScreenActivity");
    }
}
