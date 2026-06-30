package com.tencent.mm.plugin.sns.ui;

@db5.a(35)
/* loaded from: classes4.dex */
public class SnsAdStreamVideoPlayUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.pluginsdk.ui.b1, com.tencent.mm.pluginsdk.ui.a1, com.tencent.mm.pluginsdk.ui.c1 {
    public static final /* synthetic */ int K = 0;
    public long A;
    public int B;
    public int C;
    public boolean D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;
    public com.tencent.mm.plugin.sns.storage.SnsInfo I;

    /* renamed from: J, reason: collision with root package name */
    public int f166773J;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f166774d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView f166775e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f166776f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f166777g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f166778h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f166779i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f166780m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f166781n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f166782o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f166783p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f166784q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.c1 f166785r = new i64.c1("SnsAdStreamVideoPlayUI");

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f166786s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f166787t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f166788u;

    /* renamed from: v, reason: collision with root package name */
    public int f166789v;

    /* renamed from: w, reason: collision with root package name */
    public int f166790w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f166791x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f166792y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f166793z;

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView T6(com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView snsAdStreamVideoView = snsAdStreamVideoPlayUI.f166775e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return snsAdStreamVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void E(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "%s video ended", str2);
        this.f166785r.f289121i.f297910b++;
        this.f166775e.stop();
        com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView snsAdStreamVideoView = this.f166775e;
        snsAdStreamVideoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        snsAdStreamVideoView.f189742h.setVisibility(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView snsAdStreamVideoView2 = this.f166775e;
        snsAdStreamVideoView2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        snsAdStreamVideoView2.O1.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopHideSeekBarTimer", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        this.f166775e.setIsShowBasicControls(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoEnded", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void I(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoSize", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void N5(java.lang.String str, java.lang.String str2, java.lang.Boolean bool) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaiting", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "stop play");
        this.f166775e.d();
        this.f166775e.k0();
        com.tencent.mm.plugin.sns.model.l4.Cj().w(this.f166781n, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        i64.c1 c1Var = this.f166785r;
        if (c1Var != null && (str3 = this.f166786s) != null && str3.length() > 0) {
            c1Var.f();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KComponentCid", this.f166786s);
            intent.putExtra("KStreamVideoPlayCount", c1Var.f289118f);
            intent.putExtra("KStreamVideoPlayCompleteCount", c1Var.f289119g);
            intent.putExtra("KStreamVideoTotalPlayTimeInMs", c1Var.f289120h);
            setResult(-1, intent);
        }
        int i17 = this.f166790w;
        if (i17 != 0) {
            str2 = "MicroMsg.SnsAdStreamVideoPlayUI";
            str = "finish";
            i64.s1.b(i64.n1.LeaveCompleteVideo, this.f166788u, this.f166787t, this.f166789v, i17, this.f166791x, this.f166792y, this.f166793z, this.A, this.B, this.C);
        } else {
            str = "finish";
            str2 = "MicroMsg.SnsAdStreamVideoPlayUI";
        }
        if (this.D) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.I;
            int adRecSrc = snsInfo == null ? 0 : snsInfo.getAdRecSrc();
            if (this.I == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            } else {
                java.lang.String d17 = c1Var.d();
                int i18 = c1Var.f289115c;
                long j17 = i18 - c1Var.f289117e;
                if (j17 < 0) {
                    com.tencent.mars.xlog.Log.e(str2, "reportVideo minus staytime found! totaltime[%d], offscreenTime[%ld]", java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(c1Var.f289117e));
                    j17 = c1Var.f289115c;
                }
                int i19 = (int) j17;
                com.tencent.mm.plugin.sns.storage.ADInfo adInfo = this.I.getAdInfo();
                java.lang.String str4 = adInfo == null ? "" : adInfo.waidPkg;
                i64.w wVar = new i64.w();
                wVar.f289349l = this.I.getAdXml().passThrough;
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new i64.m0(this.F, 6, 2, c1Var.f289115c, null, null, 2, d17, -1, adRecSrc, i19, i19, 0, this.I.getAdSnsInfo().getTimelineRemindInfoSourceInfo(), this.I.getAdSnsInfo().getTimelineRemindInfoSelfInfo(), str4, wVar));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportVideo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            }
        }
        super.finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (this.f166782o) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            return 0;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getForceOrientation", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return 4;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return com.tencent.mm.R.layout.cqc;
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        j64.b bVar = this.f166785r.f289121i;
        int i17 = bVar.f297911c;
        long j17 = bVar.f297915g;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bVar.f297911c = i17 + ((int) (android.os.SystemClock.elapsedRealtime() - j17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPause", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void idkeyStat(long j17, long j18, long j19, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idkeyStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idkeyStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        android.graphics.Bitmap J2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        this.f166774d = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.m7j);
        this.f166775e = (com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView) findViewById(com.tencent.mm.R.id.p0x);
        this.f166774d.setOnClickListener(new com.tencent.mm.plugin.sns.ui.ae(this));
        this.f166774d.setPadding(0, 0, 0, com.tencent.mm.ui.bk.j(this));
        this.f166776f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.mva);
        if (com.tencent.mm.sdk.platformtools.t8.N0(this.G, this.H)) {
            this.f166776f.setVisibility(8);
        } else {
            this.f166776f.setVisibility(0);
            this.f166776f.setText(this.G);
            this.f166776f.setOnClickListener(new com.tencent.mm.plugin.sns.ui.be(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        this.f166775e.setReporter(this);
        this.f166775e.setIMMVideoViewCallback(this);
        this.f166775e.setIMMDownloadFinish(this);
        this.f166775e.setRootPath(com.tencent.mm.plugin.sns.model.l4.wj());
        this.f166775e.h(false, this.f166778h, 0);
        this.f166775e.setScaleType(com.tencent.mm.pluginsdk.ui.e1.CONTAIN);
        this.f166775e.setIOnlineVideoProxy(new com.tencent.mm.plugin.sns.model.g4());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initVideoView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initThumb", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f166780m) || !com.tencent.mm.vfs.w6.j(this.f166780m) || (J2 = com.tencent.mm.sdk.platformtools.x.J(this.f166780m, null)) == null) {
            java.lang.String str2 = "attach" + this.f166781n;
            java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.wj(), str2);
            java.lang.String V = ca4.z0.V(str2);
            java.lang.String str3 = d17 + V;
            this.f166780m = str3;
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "try download thumb img %s, save to %s", this.f166781n, str3);
            java.lang.String str4 = this.f166780m;
            java.lang.String str5 = this.f166779i;
            r45.jj4 h17 = m21.y.h(str4, 2, str5, str5, 1, 1, "");
            ca4.s0 s0Var = new ca4.s0(h17);
            s0Var.d(3);
            s0Var.e(h17.f377855d);
            com.tencent.mm.plugin.sns.model.l4.Cj().c(new com.tencent.mm.plugin.sns.ui.ce(this, h17.f377855d));
            com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
            com.tencent.mm.storage.s7 d18 = com.tencent.mm.storage.s7.d();
            str = "MicroMsg.SnsAdStreamVideoPlayUI";
            d18.f195313b = (int) (java.lang.System.currentTimeMillis() / 1000);
            Cj.g(h17, 8, s0Var, d18, d17, V);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initThumb", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        } else {
            this.f166775e.setCover(J2);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initThumb", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            str = "MicroMsg.SnsAdStreamVideoPlayUI";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mars.xlog.Log.i(str, "start play");
        if (!this.f166775e.isPlaying()) {
            if (this.f166775e.getCurrPosSec() == this.f166775e.getVideoDurationSec()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView snsAdStreamVideoView = this.f166775e;
                if (snsAdStreamVideoView != null) {
                    snsAdStreamVideoView.a(0, true);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            } else {
                int currPosSec = this.f166775e.getCurrPosSec();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView snsAdStreamVideoView2 = this.f166775e;
                if (snsAdStreamVideoView2 != null) {
                    snsAdStreamVideoView2.a(currPosSec, true);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("seekTo", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            }
            this.f166775e.start();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.c1
    public void kvStat(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("kvStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("kvStat", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void l(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView snsAdStreamVideoView = this.f166775e;
        snsAdStreamVideoView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        snsAdStreamVideoView.f189742h.setVisibility(4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideThumbView", "com.tencent.mm.plugin.sns.ui.widget.SnsAdStreamVideoView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void m2(java.lang.String str, java.lang.String str2, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoWaitingEnd", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "%s prepared, video total time %d", str2, java.lang.Integer.valueOf(this.f166775e.getVideoDurationSec()));
        this.f166775e.k0();
        if (this.f166773J == 0) {
            this.f166773J = this.f166775e.getVideoDurationSec();
        }
        i64.c1 c1Var = this.f166785r;
        c1Var.f289121i.f297914f = getResources().getConfiguration().orientation == 2 ? 2 : 1;
        j64.b bVar = c1Var.f289121i;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        bVar.f297915g = android.os.SystemClock.elapsedRealtime();
        j64.b bVar2 = c1Var.f289121i;
        bVar2.f297913e = 2;
        bVar2.f297911c = 0;
        bVar2.f297909a++;
        bVar2.f297915g = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepared", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        int i19;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.util.Iterator it;
        java.lang.String str6;
        java.lang.String str7 = "onActivityResult";
        java.lang.String str8 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        int i27 = -1;
        if (999 != i17) {
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI";
        } else if (-1 == i18) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
            java.util.Iterator it6 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")).iterator();
            while (it6.hasNext()) {
                java.lang.String str9 = (java.lang.String) it6.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "send sight to %s", str9);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendAppMsg", str8);
                ot0.q qVar = new ot0.q();
                qVar.f348654f = this.f166784q;
                qVar.f348666i = 4;
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f166777g)) {
                    qVar.f348674k = this.f166778h;
                } else {
                    qVar.f348674k = this.f166777g;
                }
                java.lang.String str10 = this.f166779i;
                qVar.f348734z = str10;
                qVar.f348637a2 = this.f166778h;
                qVar.f348641b2 = this.f166773J;
                qVar.f348645c2 = this.f166784q;
                qVar.f348653e2 = this.H;
                qVar.f348649d2 = this.G;
                qVar.f348657f2 = str10;
                qVar.f348661g2 = this.f166787t;
                qVar.f348665h2 = this.f166788u;
                qVar.Y1 = this.E;
                byte[] N = com.tencent.mm.vfs.w6.N(this.f166780m, 0, i27);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Integer.valueOf(N == null ? 0 : N.length);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "read buf size %d", objArr);
                if (ot0.j1.a() != null) {
                    ((ez.w0) ot0.j1.a()).getClass();
                    i19 = 0;
                    str3 = "sendAppMsg";
                    com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", str9, "", N);
                } else {
                    i19 = 0;
                    str3 = "sendAppMsg";
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, str8);
                ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, str9);
                if (this.D) {
                    ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, this.I.field_snsId, 12, 0));
                }
                if (this.f166790w != 0) {
                    boolean R4 = com.tencent.mm.storage.z3.R4(str9);
                    str4 = str7;
                    str5 = str8;
                    it = it6;
                    str6 = stringExtra2;
                    i64.s1.e(R4 ? i64.p1.Chatroom : i64.p1.Chat, this.f166788u, this.f166787t, this.f166789v, this.f166790w, this.f166791x, this.f166792y, this.f166793z, this.A, this.B, this.C, R4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str9) : i19);
                } else {
                    str4 = str7;
                    str5 = str8;
                    it = it6;
                    str6 = stringExtra2;
                }
                str7 = str4;
                str8 = str5;
                it6 = it;
                stringExtra2 = str6;
                i27 = -1;
            }
            str = str7;
            str2 = str8;
            com.tencent.mm.ui.widget.snackbar.j.c(getString(com.tencent.mm.R.string.fw6), null, this, null, null);
        } else {
            str = "onActivityResult";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI";
            if (this.D) {
                ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, this.I.field_snsId, 13, 0));
            }
        }
        if (998 == i17) {
            int i28 = this.f166790w;
            if (i28 != 0) {
                i64.s1.e(i64.p1.Sns, this.f166788u, this.f166787t, this.f166789v, i28, this.f166791x, this.f166792y, this.f166793z, this.A, this.B, this.C, 0);
            }
            if (-1 == i18) {
                if (this.D) {
                    ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, this.I.field_snsId, 15, 0));
                }
            } else if (this.D) {
                ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, this.I.field_snsId, 16, 0));
            }
        }
        super.onActivityResult(i17, i18, intent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        super.onCreate(bundle);
        this.f166777g = getIntent().getStringExtra("KUrl");
        this.f166778h = getIntent().getStringExtra("KStremVideoUrl");
        this.f166779i = getIntent().getStringExtra("KThumUrl");
        this.f166780m = getIntent().getStringExtra("KThumbPath");
        this.f166781n = getIntent().getStringExtra("KMediaId");
        this.f166782o = getIntent().getBooleanExtra("ForceLandscape", false);
        this.f166783p = getIntent().getBooleanExtra("KBlockFav", false);
        java.lang.String stringExtra = getIntent().getStringExtra("KMediaTitle");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f166784q = stringExtra;
        this.f166773J = getIntent().getIntExtra("KMediaVideoTime", 0);
        java.lang.String stringExtra2 = getIntent().getStringExtra("KSta_SnSId");
        this.I = com.tencent.mm.plugin.sns.model.l4.Fj().b1("" + ca4.z0.F0(stringExtra2));
        this.D = getIntent().getBooleanExtra("KFromTimeLine", false);
        this.f166785r.f289116d = android.os.SystemClock.elapsedRealtime();
        this.f166786s = getIntent().getStringExtra("KComponentCid");
        this.f166787t = getIntent().getStringExtra("KSta_StremVideoAduxInfo");
        this.f166788u = getIntent().getStringExtra("KSta_StremVideoPublishId");
        this.f166789v = getIntent().getIntExtra("KSta_SourceType", 0);
        this.f166790w = getIntent().getIntExtra("KSta_Scene", 0);
        this.f166791x = getIntent().getStringExtra("KSta_FromUserName");
        this.f166792y = getIntent().getStringExtra("KSta_ChatName");
        this.f166793z = getIntent().getStringExtra("KSta_SnSId");
        this.A = getIntent().getLongExtra("KSta_MsgId", 0L);
        this.B = getIntent().getIntExtra("KSta_FavID", 0);
        this.C = getIntent().getIntExtra("KSta_ChatroomMembercount", 0);
        this.E = getIntent().getStringExtra("KSta_SnsStatExtStr");
        java.lang.String stringExtra3 = getIntent().getStringExtra("KViewId");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.F = stringExtra3;
        this.G = getIntent().getStringExtra("StreamWording");
        this.H = getIntent().getStringExtra("StremWebUrl");
        setMMTitle("");
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.sns.ui.vd(this);
        k0Var.f211881s = new com.tencent.mm.plugin.sns.ui.wd(this);
        k0Var.f211854d = new com.tencent.mm.plugin.sns.ui.xd(this);
        addIconOptionMenu(1001, com.tencent.mm.R.drawable.bud, new com.tencent.mm.plugin.sns.ui.yd(this, k0Var));
        setBackBtn(new com.tencent.mm.plugin.sns.ui.zd(this), com.tencent.mm.R.drawable.buc);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        getWindow().getDecorView().setSystemUiVisibility(1792);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFullScreen", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        initView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (i17 != 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            return false;
        }
        finish();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        super.onResume();
        i64.c1 c1Var = this.f166785r;
        if (c1Var != null) {
            c1Var.c();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void onSeekComplete(com.tencent.thumbplayer.api.ITPPlayer iTPPlayer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSeekComplete", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        super.onStop();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "pause play");
        this.f166775e.pause();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        boolean z17 = this.D;
        i64.c1 c1Var = this.f166785r;
        if (z17) {
            int i17 = getResources().getConfiguration().orientation;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            c1Var.e(this.f166775e.getCurrPosSec());
            j64.b bVar = c1Var.f289121i;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            bVar.f297915g = android.os.SystemClock.elapsedRealtime();
            j64.b bVar2 = c1Var.f289121i;
            bVar2.f297914f = i17 == 2 ? 2 : 1;
            bVar2.f297913e = 2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushVideoPlay", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        }
        if (c1Var != null) {
            c1Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStop", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void p2(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onVideoFirstFrameDraw", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.a1
    public void r(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAdStreamVideoPlayUI", "%s download finish", str);
        this.f166785r.f289114b = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadFinish", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }

    @Override // com.tencent.mm.pluginsdk.ui.b1
    public void v3(java.lang.String str, java.lang.String str2, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetVideoPlayFps", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
    }
}
